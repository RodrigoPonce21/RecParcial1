/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parcial;

/**
 *
 * @author rober
 */
public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        try {
            // Agregar algunas publicaciones
            biblioteca.agregarPublicacion(new Libro("Don Quijote", 1605, "Miguel de Cervantes", Genero.FICCION));
            biblioteca.agregarPublicacion(new Revista("National Geographic", 2023, 5));
            biblioteca.agregarPublicacion(new Ilustracion("Mona Lisa", 1503, "Leonardo da Vinci", 77, 53));

            // Intentar agregar un libro duplicado
            biblioteca.agregarPublicacion(new Libro("Don Quijote", 1605, "Miguel de Cervantes", Genero.FICCION));
        } catch (PublicacionDuplicadaException e) {
            System.out.println(e.getMessage());
        }

        // Mostrar todas las publicaciones
        biblioteca.mostrarPublicaciones();

        // Leer todas las publicaciones
        biblioteca.leerPublicaciones();
    }
}
