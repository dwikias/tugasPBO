/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bilprime;

import java.util.Scanner;
public class BilPrime {
   float angka;
   boolean  cekPrime=true;
   double akarBil;
   float cek ;
   boolean cekBulat = false;
   
   Scanner scanner = new Scanner(System.in);
   
   public void inputAngka(){
       System.out.println("Masukan bilangan : ");
       angka = scanner.nextFloat(); 
       akarBil = Math.sqrt(angka);
       if(angka %2==0 || (angka+1)%2==0){
           cekBulat = true;
       }
   }
   
   public void cek(){
        while (!cekBulat){
           inputAngka();
           } 
            for (int i=2; i<=akarBil; i++){
               cek = (angka % i);
               if (cek==0){
                   cekPrime = false;
                   break;
               }
        }      
   }
   public void tampil(){
       if (cekPrime){
           System.out.println(angka +" merupakan bilangan prima");
           System.out.println(akarBil);
       }else {
           System.out.println(angka +" bukan bilangan prima");
       }
   }
    public static void main(String[] args) {
        // TODO code application logic here
        BilPrime prima = new BilPrime();
        prima.inputAngka();
        prima.cek();
        prima.tampil();
        
    }
}

        
    