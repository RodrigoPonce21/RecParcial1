/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parcial;

/**
 *
 * @author rober
 */
public class Libro extends Publicacion {
    private String autor;
    private Genero genero;

    public Libro(String titulo, int anio, String autor, Genero genero) {
        super(titulo, anio);
        this.autor = autor;
        this.genero = genero;
    }

    @Override
    public void leer() {
        System.out.println("Leyendo el libro: " + getTitulo());
    }

    @Override
    public String toString() {
        return super.toString() + ", Autor: " + autor + ", Genero: " + genero;
    }
}
