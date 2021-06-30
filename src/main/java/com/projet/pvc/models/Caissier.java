package com.projet.pvc.models;

/***********************************************************************
 * Module:  Caissier.java
 * Author:  azizsoule
 * Purpose: Defines the Class Caissier
 ***********************************************************************/

import java.util.*;

public class Caissier {

   private int id;
   private String name;
   private String login;
   private String password;

   public int getId() {
      return id;
   }

   public void setId(int id) {
      this.id = id;
   }

   public String getName() {
      return name;
   }
   
   public void setName(String newName) {
      name = newName;
   }
   
   public String getPassword() {
      return password;
   }
   
   public void setPassword(String newPassword) {
      password = newPassword;
   }
   
   public String getLogin() {
      return login;
   }
   
   public void setLogin(String newLogin) {
      login = newLogin;
   }

}