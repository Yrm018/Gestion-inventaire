package Bons;

import Fournisseurs.Fournisseur;
import Produit.Produit_Model;

import java.time.LocalDateTime;

public class Bon_Reception {
    private String id_bonR ;
    private LocalDateTime dateReception;
    private Fournisseur fournisseur;
    private Produit_Model produitModel ;

    public Bon_Reception(String id_bonR, LocalDateTime dateReception, Fournisseur fournisseur, Produit_Model produitModel) {
        this.id_bonR = id_bonR;
        this.dateReception = dateReception;
        this.fournisseur = fournisseur;
        this.produitModel = produitModel;
    }

    public String getId_bonR() {
        return id_bonR;
    }

    public void setId_bonR(String id_bonR) {
        this.id_bonR = id_bonR;
    }

    public LocalDateTime getDateReception() {
        return dateReception;
    }

    public void setDateReception(LocalDateTime dateReception) {
        this.dateReception = dateReception;
    }

    public Fournisseur getFournisseur() {
        return fournisseur;
    }

    public void setFournisseur(Fournisseur fournisseur) {
        this.fournisseur = fournisseur;
    }

    public Produit_Model getProduitModel() {
        return produitModel;
    }

    public void setProduitModel(Produit_Model produitModel) {
        this.produitModel = produitModel;
    }
}
