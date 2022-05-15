package com.innovator.model;

public class Personne2 {

    private String nom;
    private String prenom;
    private int age;

    // constante final, ne peut plus �tre modifi�, c'est une s�curit�
    public final int AGE_MAJEUR = 18;
    public final int AGE_MINEUR = 0;
    public final int AGE_MAX = 120;

    private boolean isMajeur;

    // accesseur: get et set
    public void setAge(int age) {
        if (age > AGE_MINEUR && age <= AGE_MAX) {
            this.age = age;
            if (this.age >= AGE_MAJEUR)
                this.isMajeur = true;
        }

    }

    public int getAge() {
        return this.age;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    // constructeurs
    public Personne2() {
    }

    public Personne2(String nom, String prenom, int age) {
        this.nom = nom;
        this.prenom = prenom;
        setAge(age);
    }

    public String toString() {
        String res = this.nom + " " + this.prenom + " " + this.age + " ";
        if (isMajeur == false)
            res += "mineur";
        else
            res += "majeur";
        return res;
    }
}
