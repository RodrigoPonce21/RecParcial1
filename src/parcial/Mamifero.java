/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parcial;

/**
 *
 * @author rober
 */
public class Mamifero extends Animal {

    public Mamifero(String nombre, int edad, double peso, Dieta dieta) {
        super(nombre, edad, peso, dieta);
    }

    @Override
    public void vacunar() {
        System.out.println("Vacunando al mamífero: " + getNombre());
    }

    @Override
    public String toString() {
        return "Mamífero - " + super.toString();
    }
}
