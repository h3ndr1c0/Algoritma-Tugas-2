/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pencabangan;
import java.util.Scanner;


/**
 *
 * @author WINDOWS 10
 */
public class KonversiNilai {
    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);
        
        int nilai;
        String nama, nim, matkul, prodi, grade;
        
        System.out.println("Masukan Nama :");
        nama = keyboard.nextLine();
        
        System.out.println("Masukan No NIM :");
        nim = keyboard.nextLine();
        
        System.out.println("Masukan Matkul :");
        matkul = keyboard.nextLine();
        
        System.out.println("Masukan Nilai :");
        nilai = keyboard.nextInt();
        
        prodi = nim.substring(3, 5);
        
        switch (prodi) {
            case "52" -> System.out.println("S1 - Teknologi Informasi");
            case "51" -> System.out.println("S1 -Sistem Informasi");
            case "31" -> System.out.println("D3 - Sistem Informasi");
            default -> System.out.println("Mohon maaf, prodi tersebut tidak ada.");
        }
        
       if ( nilai >= 85 ) {
            grade = "A";
        } else if ( nilai >= 80 ){
            grade = "A-";
        } else if ( nilai >= 75 ){
            grade = "B";
        } else if ( nilai >= 70 ){
            grade = "B-";
        } else if ( nilai >= 65 ){
            grade = "C";
        } else if ( nilai >= 40 ){
            grade = "C-";
        } else if ( nilai >= 35 ){
            grade = "D";
        } else {
            grade = "E";
        }
        
        
        System.out.println("NamaMu :" + nama);
        System.out.println("NIM :" + nim);
        System.out.println("Jurusan :" + prodi);
        System.out.println("Mata Kuliah :" + matkul);
        System.out.println("Nilai Anda Adalah : " + nilai);
        System.out.println("Grade Anda Adalah :" + grade);
        
    
    }
    
}
