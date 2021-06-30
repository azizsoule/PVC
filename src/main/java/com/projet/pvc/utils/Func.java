package com.projet.pvc.utils;

import java.sql.ResultSet;
import java.sql.SQLException;

public interface Func {
    void whenQuerryComplete(ResultSet resultSet) throws SQLException;
}
