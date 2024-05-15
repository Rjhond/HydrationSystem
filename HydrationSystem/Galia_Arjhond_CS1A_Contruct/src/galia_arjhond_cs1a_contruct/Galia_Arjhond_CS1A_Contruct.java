/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package galia_arjhond_cs1a_contruct;

import java.util.Scanner;
public class Galia_Arjhond_CS1A_Contruct {

    private double avg;
    private double discount;

    public Galia_Arjhond_CS1A_Contruct() {
        Scanner input = new Scanner(System.in);

        System.out.print("Prelim: ");
        double prelim = input.nextDouble();

        System.out.print("Midterm: ");
        double midterm = input.nextDouble();

        System.out.print("Finals: ");
        double finals = input.nextDouble();

        // Compute the average
        avg = compute(prelim, midterm, finals);

        // Display average
        System.out.println("Average: " + String.format("%.2f", avg));

        // Get value
        System.out.print("Tuition fee: ");
        double tuition = input.nextDouble();
        discount = compute(avg, tuition);
        System.out.println("Discount: " + String.format("%.2f", discount));
    }

    private double compute(double pre, double mid, double fin) {
        return (pre + mid + fin) / 3;
    }

    private double compute(double AVG, double TUITION) {
        double disc;
        if (AVG >= 95 && AVG <= 100) {
            disc = TUITION;
        } else if (AVG >= 90 && AVG <= 94) {
            disc = TUITION * 0.5;
        } else {
            disc = 0;
        }
        return disc;
    }

    public static void main(String[] args) {
        Galia_Arjhond_CS1A_Contruct student = new Galia_Arjhond_CS1A_Contruct();
    }
}
