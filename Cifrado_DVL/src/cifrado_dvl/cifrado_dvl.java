/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cifrado_dvl;

/**
 *
 * @author Valentin
 * 
 * INTRODUCCION DE CHARSET
 * La codificación de caracteres es el método que permite convertir un carácter de un lenguaje natural 
 * en un símbolo de otro sistema de representación, como un número o una secuencia 
 * Basicamente consiste en 3 partes :

1) Se define el charset (codificacion de caracteres) utilizados para cifrar y descifrar el mensaje.

2) Se utiliza un metodo que cifra el mensaje , donde se reemplaza cada caracter del charset 1 
* al charset 2 y voila!!!

2) Se utiliza un metodo que descifra el mensaje haciendo la inversa del metodo anterior,
* donde se reemplaza cada caracter del charset 2 al charset 1 
 */

 
public class cifrado_dvl {
    
   //Charset de caracteres cuando se cifra
   private String charset1 = "1234567890!#$%&/()=¿?¡_-+*:";
   //Charset de caracteres cuando se descifra
   private String charset2 = "abcdefghijklmnopqrstuvwxyz ";
    
   /**
    * Metodo que recibe un texto y cifra el contenido de
    * acuerdo a los charset definidos
    * @param texto
    * @return texto
    */
   public String cifrar(String texto){
      //Convierto a minuscula las letras del alfabeto que existan en el texto
      texto = texto.toLowerCase();
      //Reemplazo los caracteres del charset2 con los del charset1
      for (int i = 0; i < charset2.length(); i++) {
         texto = texto.replace(charset2.charAt(i), charset1.charAt(i));
      }
      //Retorno el texto cifrado con el charset2
      return texto;
   }
    
   /**
    * Metodo que recibe un texto y descifra el contenido de
    * acuerdo a los charset definidos
    * @param texto
    * @return texto
    */
   public String descifrar(String texto){
      //Convierto a minuscula las letras del alfabeto que existan en el texto
      texto = texto.toLowerCase();
      //Reemplazo los caracteres del charset1 con los del charset2
      for (int i = 0; i < charset1.length(); i++) {
         texto = texto.replace(charset1.charAt(i), charset2.charAt(i));
      }
      //Retorno el texto cifrado con el charset2
      return texto;
   }
    
   public static void main(String[] args){
       
      //Instancia de la clase cifrado_dvl y creacion de un nuevo objeto
      cifrado_dvl cifrado_dvl = new cifrado_dvl();
       
      //Cifrando texto
      String textoCifrado = cifrado_dvl.cifrar("codes and tags... ");
      System.out.println(textoCifrado);
       
      //Descifrando texto
      String textoDescifrado = cifrado_dvl.descifrar(textoCifrado);
      System.out.println(textoDescifrado);
       
      // cadenas
      String[] cadenas = new String[4];
      cadenas[0] = "Profesor";
      cadenas[1] = "Por favor";
      cadenas[2] = "Apruebe me";
      cadenas[3] = "El ciclo";
       
      //Cifrando cada cadena del arreglo
      System.out.println("\n Cifrando ");
      for (int i = 0; i < cadenas.length; i++) {
         cadenas[i] = cifrado_dvl.cifrar(cadenas[i]);
         System.out.println("Cadena " + (i + 1) + " : " + cadenas[i]);
      }
       
      //Ahora Descifrando el contenido de las cadenas
      System.out.println("\n Descifrando");
      for (int i = 0; i < cadenas.length; i++) {
         cadenas[i] = cifrado_dvl.descifrar(cadenas[i]);
         System.out.println("Cadena " + (i + 1) + " : " + cadenas[i]);
      }
   }
}