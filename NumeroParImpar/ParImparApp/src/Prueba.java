/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Cesar Venancio Martinez
 */
import java.util.Scanner; // Necesario para usar Scanner

public class Prueba {
   public static void main(String[] args) {
      NumerosParImpar npi = new NumerosParImpar();
      Scanner sc = new Scanner(System.in);

      System.out.println("Dame un numero:");
      int num = sc.nextInt();  // ❌ tenías "num.nextInt()" → correcto es "sc.nextInt()"

      npi.valida(num); // ❌ tu método se llama valida, no validar
   }
}
