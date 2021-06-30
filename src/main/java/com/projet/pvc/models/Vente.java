package com.projet.pvc.models; /***********************************************************************
 * Module:  Vente.java
 * Author:  azizsoule
 * Purpose: Defines the Class Vente
 ***********************************************************************/

import java.util.*;

public class Vente {

   private int id;
   private Date date;
   private boolean terminee;
   
   public Collection<LigneDeVente> ligneDeVente;

   public int getId() {
      return id;
   }

   public void setId(int id) {
      this.id = id;
   }
   
   public Date getDate() {
      return date;
   }
   
   public void setDate(Date newDate) {
      date = newDate;
   }
   
   public boolean isTerminee() {
      return terminee;
   }
   
   public void setTerminee(boolean newTerminee) {
      terminee = newTerminee;
   }
   
   public void ajouterLdv() {
      // TODO: implement
   }
   
   public void terminerVente() {
      // TODO: implement
   }
   
   public void calculerTotal() {
      // TODO: implement
   }
   
   public void imprimerTicket() {
      // TODO: implement
   }
   
   
   public Collection<LigneDeVente> getLigneDeVente() {
      if (ligneDeVente == null)
         ligneDeVente = new HashSet<LigneDeVente>();
      return ligneDeVente;
   }
   
   public Iterator getIteratorLigneDeVente() {
      if (ligneDeVente == null)
         ligneDeVente = new HashSet<LigneDeVente>();
      return ligneDeVente.iterator();
   }
   
   public void setLigneDeVente(Collection<LigneDeVente> newLigneDeVente) {
      removeAllLigneDeVente();
      for (Iterator iter = newLigneDeVente.iterator(); iter.hasNext();)
         addLigneDeVente((LigneDeVente)iter.next());
   }
   
   public void addLigneDeVente(LigneDeVente newLigneDeVente) {
      if (newLigneDeVente == null)
         return;
      if (this.ligneDeVente == null)
         this.ligneDeVente = new HashSet<LigneDeVente>();
      if (!this.ligneDeVente.contains(newLigneDeVente))
         this.ligneDeVente.add(newLigneDeVente);
   }
   
   public void removeLigneDeVente(LigneDeVente oldLigneDeVente) {
      if (oldLigneDeVente == null)
         return;
      if (this.ligneDeVente != null)
         if (this.ligneDeVente.contains(oldLigneDeVente))
            this.ligneDeVente.remove(oldLigneDeVente);
   }
   
   public void removeAllLigneDeVente() {
      if (ligneDeVente != null)
         ligneDeVente.clear();
   }

}