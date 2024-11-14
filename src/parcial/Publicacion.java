/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parcial;

/**
 *
 * @author rober
 */
public abstract class Publicacion {
    private String titulo;
    private int anio;

    public Publicacion(String titulo, int anio) {
        this.titulo = titulo;
        this.anio = anio;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getAnio() {
        return anio;
    }

    public abstract void leer();

    @Override
    public String toString() {
        return "Titulo: " + titulo + ", Año: " + anio;
    }
}

enum Genero {
    FICCION, NO_FICCION, CIENCIA, HISTORIA;
}