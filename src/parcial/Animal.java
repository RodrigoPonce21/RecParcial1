/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parcial;

/**
 *
 * @author rober
 */
public abstract class Animal {
    private String nombre;
    private int edad;
    private double peso;
    private Dieta dieta;

    public Animal(String nombre, int edad, double peso, Dieta dieta) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.dieta = dieta;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public abstract void vacunar();

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Edad: " + edad + " años, Peso: " + peso + " kg, Dieta: " + dieta;
    }
}

enum Dieta {
    HERBIVORO, CARNIVORO, OMNIVORO;
}
