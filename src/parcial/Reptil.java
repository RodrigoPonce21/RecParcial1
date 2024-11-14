/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parcial;

/**
 *
 * @author rober
 */
public class Reptil extends Animal {
    private String tipoEscama;
    private String regulacionTemperatura;

    public Reptil(String nombre, int edad, double peso, Dieta dieta, String tipoEscama, String regulacionTemperatura) {
        super(nombre, edad, peso, dieta);
        this.tipoEscama = tipoEscama;
        this.regulacionTemperatura = regulacionTemperatura;
    }

    @Override
    public void vacunar() {
        System.out.println("Los reptiles no pueden ser vacunados.");
    }

    @Override
    public String toString() {
        return "Reptil - " + super.toString() + ", Tipo de escama: " + tipoEscama + 
               ", Regulación de temperatura: " + regulacionTemperatura;
    }
}

