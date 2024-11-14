/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parcial;

/**
 *
 * @author rober
 */
public class Revista extends Publicacion {
    private int numeroEdicion;

    public Revista(String titulo, int anio, int numeroEdicion) {
        super(titulo, anio);
        this.numeroEdicion = numeroEdicion;
    }

    @Override
    public void leer() {
        System.out.println("Leyendo la revista: " + getTitulo());
    }

    @Override
    public String toString() {
        return super.toString() + ", Número de edición: " + numeroEdicion;
    }
}
