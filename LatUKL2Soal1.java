/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.latukl2soal1;

/**
 *
 * @author asyraf
 */
import java.util.Scanner;
public class LatUKL2Soal1 {

    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);

        System.out.print("Masukkan bilangan bulat positif: ");
        int n = input.nextInt();
        if (n < 0) {
            System.out.println("Bilangan harus positif!");
        } else {
            int faktorial = 1; 
            for (int i = 1; i <= n; i++) {
                faktorial *= i;
            }
            System.out.println("Faktorial dari " + n + " adalah: " + faktorial);
        }
    }
}
