/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multiplodelcincoalcien;

//Muestra los números múltiplos de 5 de 0 a 100 utilizando un bucle for.

//Importo el paquete java.util para poder utilizar la clase Scanner

import java.util.*;

/**
 *
 * @author Amarico
 */
public class MultiploDelCincoAlCien {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // TODO code application logic here
    
    // Creo un objeto de la clase Scanner
    
    Scanner entrada = new Scanner(System.in);
    
    //Creo el bucle for
    
    for (int i = 0; i < 100; i+=5) {
      
      // Imprimo los multiplos de 5
      
      System.out.println(i);
      
    }
    
    
  }
  
}
