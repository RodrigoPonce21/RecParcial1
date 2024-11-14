/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parcial;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Publicacion> publicaciones;

    public Biblioteca() {
        publicaciones = new ArrayList<>();
    }

    public void agregarPublicacion(Publicacion publicacion) throws PublicacionDuplicadaException {
        for (Publicacion p : publicaciones) {
            if (p.getTitulo().equals(publicacion.getTitulo()) && p.getAnio() == publicacion.getAnio()) {
                throw new PublicacionDuplicadaException("La publicación ya existe: " + publicacion.getTitulo());
            }
        }
        publicaciones.add(publicacion);
    }

    public void mostrarPublicaciones() {
        System.out.println("Lista de Publicaciones en la Biblioteca:");
        for (Publicacion p : publicaciones) {
            System.out.println(p.toString());
        }
    }

    public void leerPublicaciones() {
        for (Publicacion p : publicaciones) {
            if (p instanceof Libro || p instanceof Revista) {
                p.leer();
            } else {
                System.out.println("La publicación " + p.getTitulo() + " no se puede leer.");
            }
        }
    }
}
