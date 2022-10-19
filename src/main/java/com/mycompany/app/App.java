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
    if(a*a+b*b==c*c||a*a+c*c==b*b||b*b+c*c==a*a){
      return "es un triangulo pitagorico";
    }
    return "es un triangulo escaleno";
  }

  public static void main(String[] args) {
    System.out.println("Hello World!");
  }
}
