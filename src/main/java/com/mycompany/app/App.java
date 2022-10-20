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
    //triangulo equilatero
    if (a == b && a == c && b == c) {
      return "es un triangulo equilatero";
    }
    //triangulo isoceles
    if (a == b || a == c || b == c) {
      return "es un triangulo isoceles";
    }
    //triangulo escaleno
    if (a != b || a != c || b != c) {
      return "es un triangulo escaleno";
    }
    //triangulo pitagorico
    if ((a*a) + (b * b) == (c *c)) {
      return "es un triangulo pitagorico";
    }
    return "error no es un triangulo";
  }

  public static void main(String[] args) {
    System.out.println("Hello World!");
  }
}
