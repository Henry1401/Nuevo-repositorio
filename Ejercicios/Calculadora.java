import java.io.*;
import java.util.*;
import java.util.Scanner; 
public class Calculadora {
public static void main (String[] argv){
int num1, num2, suma, resta, multiplicacion, division, operacion;
Scanner capt = new Scanner(System.in);
System.out.print("\n"+"Ingrese el primer número a operar: ");
num1 = capt.nextInt();
System.out.print("Ingrese el segundo número a operar: ");
num2 = capt.nextInt();
System.out.print("\n"+"1.Suma"+"\n"+"2.Resta"+"\n"+"3.Multiplicación"+"\n"+"4.División"+"\n"+"\n"+"Seleccione la operación a realizar: ");
operacion = capt.nextInt();
switch (operacion){
  case 1: suma = (num1+num2);
  System.out.print("El resultado de la suma es: "+suma);
  break;
  case 2: resta = (num1-num2);
  System.out.print("El resultado de la operación es: "+resta);
  break;
  case 3: multiplicacion = (num1*num2);
  System.out.print("El resultado de la operación es: "+multiplicacion);
  break;
  case 4: division = (num1/num2);
  System.out.print("El resultado de la operación es: "+division);
  break;
  default: System.out.print("El número ingresado no es válido");
  break;
}
}
}