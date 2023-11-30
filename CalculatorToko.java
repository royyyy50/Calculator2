/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author Asus
 */
public class CalculatorToko {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner= new Scanner(System.in);
        
        System.out.print("Masukan harga Barang");
        double hargaBarang=scanner.nextDouble();
        
        System.out.print("masukan harga Sayuran");
        double hargaSayuran=scanner.nextDouble();
        
        double subTotal=hargaBarang + hargaSayuran ;
        double pajak =subTotal *0.1;
        double tips =subTotal * 0.15;
        double total=subTotal + pajak  + tips;
        
        System.out.println("subTotal :" + subTotal);
        System.out.println("pajak :" + pajak);
        System.out.println("tips :" + tips);
        System.out.println("total :" + total);
    }
}
