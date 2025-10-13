/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;

/**
 *
 * @author Gamer2Language
 */
public class ifCetakKRS06 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("---Print KRS SIAKAD---");
        System.out.print("Have the tutition fees paid in full? (true/false): ");
        boolean uktLunas = sc.nextBoolean();
        if (uktLunas) {
            System.out.println("UKT Payment has been verified");
            System.out.println("KRS now can be printed and you can ask the academix advisor to sign it.");
        } else {
            System.out.println("Registration rejected. Please pay UKT first.");
        }
    }
}
