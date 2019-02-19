
package ejercicio_numero_2;

import java.util.Scanner;


public class Hex2Bin {

       
    static void HexToBin(char hexdec[]) 
    { 
        int a = 0; 
  
        while (hexdec[a] != '\u0000') { 
  
            switch (hexdec[a]) { 
            case '0': 
                System.out.print("0000"); 
                break; 
            case '1': 
                System.out.print(" 0001 "); 
                break; 
            case '2': 
                System.out.print(" 0010 "); 
                break; 
            case '3': 
                System.out.print(" 0011 "); 
                break; 
            case '4': 
                System.out.print(" 0100 "); 
                break; 
            case '5': 
                System.out.print(" 0101 "); 
                break; 
            case '6': 
                System.out.print(" 0110 "); 
                break; 
            case '7': 
                System.out.print(" 0111 "); 
                break; 
            case '8': 
                System.out.print(" 1000 "); 
                break; 
            case '9': 
                System.out.print(" 1001 "); 
                break; 
            case 'A': 
            case 'a': 
                System.out.print(" 1010 "); 
                break; 
            case 'B': 
            case 'b': 
                System.out.print(" 1011 "); 
                break; 
            case 'C': 
            case 'c': 
                System.out.print(" 1100 "); 
                break; 
            case 'D': 
            case 'd': 
                System.out.print(" 1101 "); 
                break; 
            case 'E': 
            case 'e': 
                System.out.print(" 1110 "); 
                break; 
            case 'F': 
            case 'f': 
                System.out.print(" 1111 "); 
                break; 
            default: 
                System.out.print("El digito hexadecimal insertado es invalido" + hexdec[a]); 
            } 
            a++; 
        } 
    } 
public static void main(String args[])
    { 
        
        System.out.println("Introduzca la cadena hexadecimal: ");
         String cadena ="" ;
         
        Scanner ent = new Scanner (System.in); 
        cadena = ent.nextLine (); 
        
        char hexadec[] = new char[100] ; 
            hexadec = cadena.toCharArray() ; 
   
        System.out.print("El numero binario equivalente es: "  ); 
        try{ 
            HexToBin(hexadec); 
        } 
        catch (ArrayIndexOutOfBoundsException e){ 
            System.out.print(""); 
        } 
  
    } 
     
}

   
    
//Jose David De la valle Acuña - 2015114083
//John Steven Rubio Castellanos - 2015214126