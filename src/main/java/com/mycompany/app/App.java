package com.mycompany.app;

/**
 * Hello world!
 *
 */
public class App {
  public static String triangulo(int a, int b, int c) {

    if (!(a + b > c && a + c > b && b + c > a)) {
      return "error no es un triangulo";
    }
    if (a == b && a == c && b == c) {
      return "es un triangulo equilatero";
    }
    if (a == b || a == c || b == c) {
      return "es un triangulo isoceles";
    }
    
    if(a!=b && b!=c && a!=c) {
      return "es un triangulo escaleno";
    }
    
    if((a*a + b*b) = c*c){
      return "es un triangulo pitagorico";
    }
      return "error no es un triangulo";
  }

  public static void main(String[] args) {
    System.out.println("Hello World!");
  }
}
