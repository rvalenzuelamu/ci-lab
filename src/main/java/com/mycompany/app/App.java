package com.mycompany.app;
/**
 * Hello world!
 *
 */
public class App {
  

  public static String triangulo(int a, int b, int c) {
    if (a + b <= c || b + c <= a || c + a <= b) {
      return "error no es un triangulo";
    }
    if (a == b && b == c && c == a)
    {
      return "es un triangulo equilatero";
    }
    return "error no es un triangulo";
  } 
  

  public static void main(String[] args) {
    System.out.println("Hola hola!");
  }
}
