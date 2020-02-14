/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kalimatriks;

/**
 *
 * @author dwiki
 */
import java.util.Scanner;

public class KaliMatriks {
    public int baris;
    public int kolom;
    
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner input = new Scanner(System.in);
    KaliMatriks matriksA = new KaliMatriks();
    KaliMatriks matriksB= new KaliMatriks();
    int Matrix1[][] = new int[4][4];
    int Matrix2[][] = new int[4][4]; 
    int matriksC[][] = new int [4][4];
    int jumlah = 0;
    
    System.out.println("Masukan jumlah baris pada matriks pertama :");
    matriksA.baris = input.nextInt();
    System.out.println("Masukan jumlah kolom pada matriks pertama :");
    matriksA.kolom = input.nextInt();
    
    System.out.println("Masukan jumlah baris pada matriks kedua :");
    matriksB.baris = input.nextInt();
    System.out.println("Masukan jumlah kolom pada matriks kedua :");
    matriksB.kolom = input.nextInt();
    
    if (matriksA.kolom != matriksB.baris){
        System.out.println("Matriks tidak dapat dikalikan satu sama lain");
    }else {
        System.out.println("Masukan elemen matriks pertama");
        for (int i = 0; i<matriksA.baris; i++){
           for (int j = 0; j<matriksA.kolom; j++){
               Matrix1[i][j] = input.nextInt();
           }
        }
        
        System.out.println("Masukan elemen matriks kedua");
        for (int i = 0; i<matriksB.baris; i++){
           for (int j = 0; j<matriksB.kolom; j++){
               Matrix2[i][j] = input.nextInt();
           }
        }
        
        for (int i=0; i<matriksA.baris; i++){
            for (int j=0; j<matriksB.kolom; j++){
                for (int k=0; k<matriksB.baris; k++){
                   jumlah = jumlah+ Matrix1[i][k]*Matrix2[k][j];
                }
                matriksC [i][j] = jumlah;
                jumlah = 0;
            }
        }
        System.out.println("Hasil perkalian matriks :");
        for (int i=0; i<matriksA.baris; i++){
            for (int j=0; j<matriksA.kolom; j++){
                System.out.print(matriksC[i][j] + "\t");
            }
            System.out.println("\n");
        }
    }
  }
    
}
