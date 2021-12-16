package com.example.gestionarticles.model;

public class Article {
    Integer code;
    String  libelle;

    public Article() {
    }

    public Article(Integer code, String libelle) {
        this.code = code;
        this.libelle = libelle;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }
}
