package pvc.models;

/***********************************************************************
 * Module:  Article.java
 * Author:  azizsoule
 * Purpose: Defines the Class Article
 ***********************************************************************/

import java.util.*;

public class Article {

   private int id;
   private String libelle;
   private int qt;
   
   public String getLibelle() {
      return libelle;
   }

   public void setLibelle(String newLibelle) {
      libelle = newLibelle;
   }
   
   public int getQt() {
      return qt;
   }
   
   public void setQt(int newQt) {
      qt = newQt;
   }

   public int getId() {
      return id;
   }

   public void setId(int id) {
      this.id = id;
   }

}