package pvc.models;

/***********************************************************************
 * Module:  LigneDeVente.java
 * Author:  azizsoule
 * Purpose: Defines the Class LigneDeVente
 ***********************************************************************/

public class LigneDeVente {

   private int id;
   private long sousTotal;
   private int quantite;

   public int getId() {
      return id;
   }

   public void setId(int id) {
      this.id = id;
   }

   public long getSousTotal() {
      return sousTotal;
   }
   
   public void setSousTotal(long newSousTotal) {
      sousTotal = newSousTotal;
   }
   
   public int getQuantite() {
      return quantite;
   }
   
   public void setQuantite(int newQuantite) {
      quantite = newQuantite;
   }

}