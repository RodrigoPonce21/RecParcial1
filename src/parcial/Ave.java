/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parcial;

/**
 *
 * @author rober
 */
public class Ave extends Animal {
    private double envergaduraAlas;

    public Ave(String nombre, int edad, double peso, Dieta dieta, double envergaduraAlas) {
        super(nombre, edad, peso, dieta);
        this.envergaduraAlas = envergaduraAlas;
    }

    @Override
    public void vacunar() {
        System.out.println("Vacunando al ave: " + getNombre());
    }

    @Override
    public String toString() {
        return "Ave - " + super.toString() + ", Envergadura de alas: " + envergaduraAlas + " m";
    }
}
