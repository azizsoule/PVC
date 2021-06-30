package com.projet.pvc.models;

/***********************************************************************
 * Module:  DescriptionArticle.java
 * Author:  azizsoule
 * Purpose: Defines the Class DescriptionArticle
 ***********************************************************************/

public class DescriptionArticle {

   private int id;
   private String cpu;
   private long prix;
   private String description;

   public int getId() {
      return id;
   }

   public void setId(int id) {
      this.id = id;
   }

   public String getCpu() {
      return cpu;
   }
   
   public void setCpu(String newCpu) {
      cpu = newCpu;
   }
   
   public long getPrix() {
      return prix;
   }
   
   public void setPrix(long newPrix) {
      prix = newPrix;
   }

   public String getDescription() {
      return description;
   }
   
   public void setDescription(String newDescription) {
      description = newDescription;
   }

}