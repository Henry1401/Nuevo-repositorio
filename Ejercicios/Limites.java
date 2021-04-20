import java.io.*;
import java.util.*;
import java.util.Scanner;
public class Limites {
  public static void main (String[] argv){
    int num1, num2, i, j;
    Scanner capt = new Scanner(System.in);
    System.out.print("Ingrese el número que determina el límite inferior: ");
    num1=capt.nextInt();
    System.out.print("Ingrese el número que determina el límite superior: ");
    num2=capt.nextInt();
    System.out.print("Los números pares son: ");
    for(i = num1; i<=num2; i++){
    if(i%2==0){
    System.out.print(i+",");
    }
  }
  System.out.print("\n"+"Los números impares son: ");   
    j=num1;
  if(num1%2>0){ //empieza impar
    while (j%2>0&&j<=num2){
      System.out.print(j+",");
      j+=2;
      }
    }
  else {
    j=num1+1;//empieza par
      while (j%2>0&&j<=num2){
      System.out.print(j+",");
      j+=2;
      }
    }
  } 
}