/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pencabangan;
import java.util.Scanner;
/**
 *
 * @author WINDOWS 10
 */
public class Pencabangan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);
        
        int angka;
        
        System.out.println("Masukan angka :");
        angka = keyboard.nextInt();
        
        if (angka  % 2 == 0) {
            System.out.println("Angka " + angka + " Adalah Bilangan Genap " + "(If/Else)");
            
        } else {
            System.out.println("Angka " + angka + " Adalah Bilangan Ganjil " + "(If/Else)");
        }
        String hasil ;
        hasil = angka % 2 == 0 ? " Bilangan Genap " : " Bilangan Ganjil ";
        System.out.println("Angka " + angka  + " Adalah " + hasil + " (Oprator Ternary)");

    }
    
                  
                
            }
       
        // TODO code application logic here
    
    

