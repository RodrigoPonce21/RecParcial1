/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parcial;

/**
 *
 * @author rober
 */
import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private List<Animal> animales;

    public Zoo() {
        animales = new ArrayList<>();
    }

    public void agregarAnimal(Animal animal) throws AnimalDuplicadoException {
        for (Animal a : animales) {
            if (a.getNombre().equals(animal.getNombre()) && a.getEdad() == animal.getEdad()) {
                throw new AnimalDuplicadoException("El animal ya existe en el zoológico: " + animal.getNombre());
            }
        }
        animales.add(animal);
    }

    public void mostrarAnimales() {
        System.out.println("Lista de Animales en el Zoológico:");
        for (Animal a : animales) {
            System.out.println(a.toString());
        }
    }

    public void vacunarAnimales() {
        for (Animal a : animales) {
            if (a instanceof Mamifero || a instanceof Ave) {
                a.vacunar();
            } else {
                System.out.println("El animal " + a.getNombre() + " no puede ser vacunado.");
            }
        }
    }
}
