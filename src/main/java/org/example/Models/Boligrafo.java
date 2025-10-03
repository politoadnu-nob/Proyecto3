package org.example.Models;

public class Boligrafo {
    private String codigo;
    private String color;
    private String marca;

    public Boligrafo(){
        color="negro";
    }

    public Boligrafo(String codigo, String color, String marca) {
        this.codigo = codigo;
        this.color = color;
        this.marca = marca;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}
