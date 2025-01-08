package ch.hearc.jee2024.hellospring.service;

public class Biere {

    private String nom;
    private String fabricant;

    public Biere(String nom, String fabricant) {
        this.nom = nom;
        this.fabricant = fabricant;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getFabricant() {
        return fabricant;
    }

    public void setFabricant(String fabricant) {
        this.fabricant = fabricant;
    }
}
