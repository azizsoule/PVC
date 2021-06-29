package pvc.utils;

import java.sql.*;
import java.util.ArrayList;

/* NB : N'oubliez surtout pas d'ajouter mysql-connector au projet
sinon vous risquez d'etre confronté à des erreurs un peu chiantes !*/

public class Database {

    //Je crois bien qu'à travers le nom de chacun des attributs suivants, vous comprendrez naturrellement leur utilité
    // Jean-Noel ta mercon en passant . J'espere que tu apprendra un jour à nommer tes variables.
    private static String url = "jdbc:mysql://";

    //Attribut contenant la connexion creee entre notre logiciel et la base de donnees
    private static Connection connection = null;

    //Attribut permettant d'envoyer les requettes à la base de données
    private PreparedStatement statement = null;

    //Attribut ou seront enregistrés les resultats des requettes
    private ResultSet resultSet = null;

    private static Database database;

    //Constructeur
    private Database() {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(url, Constants.DB_USER, Constants.DB_PASSWORD);
            System.out.println("connexion reussie");
        } catch (SQLException | ClassNotFoundException exception) {
            exception.printStackTrace();
        }

    }

    //Methode permettant de se connecter a la base de donnees
    public static Database getInstance() {
        if (database==null || connection==null) database = new Database();
        return database;
    }

    //Methode permetant d'envoyer des requettes non preparees à la base de données
    public void sendQuery(String query,Func func) throws SQLException{
        int res = 1;

        String req = query.substring(0,6).toUpperCase();

        try {
            statement = connection.prepareStatement(query);

            if (req.equals("SELECT")) {
                resultSet = statement.executeQuery();
                func.whenQuerryComplete(resultSet);
            } else {
                res = statement.executeUpdate();
            }

            if (res == 0) {
                throw new SQLException("Query failed");
            }else{
                System.out.println("Query succeed !");
            }

        } catch (SQLException exception) {
            exception.printStackTrace();
        } finally {
            // Ici nous liberons les ressources de l'ordinateur apres execution d'une requette
            closeResultset();
        }
    }

    public void sendQuery(String query) throws SQLException{
        int res = 1;

        String req = query.substring(0,6).toUpperCase();

        try {
            statement = connection.prepareStatement(query);

            if (req.equals("SELECT")) {
                resultSet = statement.executeQuery();
            } else {
                res = statement.executeUpdate();
            }

            if (res == 0) {
                throw new SQLException("Query failed");
            }else{
                System.out.println("Query succeed !");
            }

        } catch (SQLException exception) {
            exception.printStackTrace();
        } finally {
            // Ici nous liberons les ressources de l'ordinateur apres execution d'une requette
            closeResultset();
        }
    }

    public void sendQuery(String query,ArrayList<Object> arguments,Func function) throws SQLException {
        int res = 1;

        query = query.trim();

        String req = query.substring(0,6).toUpperCase();

        try {
            execQuery(query, arguments, res, req);

            if (resultSet != null) {
                function.whenQuerryComplete(resultSet);
            }

        } catch (SQLException exception) {
            exception.printStackTrace();
        } finally {
            // Ici nous liberons les ressources de l'ordinateur apres execution d'une requette
            closeResultset();
        }
    }

    public void sendQuery(String query,ArrayList<Object> arguments) throws SQLException {
        int res = 1;

        query = query.trim();

        String req = query.substring(0,6).toUpperCase();

        try {
            execQuery(query, arguments, res, req);

        } catch (SQLException exception) {
            exception.printStackTrace();
        } finally {
            // Ici nous liberons les ressources de l'ordinateur apres execution d'une requette
            closeResultset();
        }
    }

    private void execQuery(String query, ArrayList<Object> arguments, int res, String req) throws SQLException {
        statement = connection.prepareStatement(query);

        if (!arguments.isEmpty()) {
            for (int i = 0; i < arguments.size(); i++) {
                if(arguments.get(i) instanceof Integer) {
                    statement.setInt(i+1, (Integer) arguments.get(i));
                }

                if(arguments.get(i) instanceof String) {
                    statement.setString(i+1, (String) arguments.get(i));

                }

                if(arguments.get(i) instanceof Double) {
                    statement.setDouble(i+1, (Double) arguments.get(i));
                }

                if(arguments.get(i) instanceof Boolean) {
                    statement.setBoolean(i+1, (Boolean) arguments.get(i));
                }

                if(arguments.get(i) instanceof Date) {
                    statement.setDate(i+1, (Date) arguments.get(i));
                }
            }
        }

        System.out.println(statement.toString());

        if (req.equals("SELECT")) {
            resultSet = statement.executeQuery();
        } else {
            res = statement.executeUpdate();
        }

        if (res == 0) {
            throw new SQLException("Querry failed");
        }else{
            System.out.println("Query succeed !");
        }
    }

    //Methode permetant de detruire la connexiion existant avec la base de donnees
    public static void deleteInstance(){
        try {
            if (connection!=null) connection.close();
            else System.out.println("No existing connection !");
        } catch (SQLException exception) {
            exception.printStackTrace();
        }
        connection = null;
        database = null;
    }

    private void closeResultset() {
        if (resultSet != null) {
            try {
                resultSet.close();
            } catch (SQLException exception) {
                exception.printStackTrace();
            }

            resultSet = null;
        }

        if (statement != null) {
            try {
                statement.close();
            } catch (SQLException exception) {
                exception.printStackTrace();
            }

            statement = null;
        }
    }

}
