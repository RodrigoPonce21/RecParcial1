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
        Zoo zoo = new Zoo();

        try {
            // Agregar algunos animales
            zoo.agregarAnimal(new Mamifero("Elefante", 10, 500.0, Dieta.HERBIVORO));
            zoo.agregarAnimal(new Ave("Águila", 5, 3.5, Dieta.CARNIVORO, 2.1));
            zoo.agregarAnimal(new Reptil("Cocodrilo", 12, 200.0, Dieta.CARNIVORO, "Escamas gruesas", "Ectotermia"));

            // Intentar agregar un animal duplicado
            zoo.agregarAnimal(new Mamifero("Elefante", 10, 500.0, Dieta.HERBIVORO));
        } catch (AnimalDuplicadoException e) {
            System.out.println(e.getMessage());
        }

        // Mostrar todos los animales
        zoo.mostrarAnimales();

        // Vacunar animales
        zoo.vacunarAnimales();
    }
}
