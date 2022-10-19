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
    
    if ( 
        ( Math.floor(a) == a && Math.floor(b) == b && Math.floor(c) == c) 
        &&
        (Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2) || Math.pow(a, 2) + Math.pow(c, 2) == Math.pow(b, 2) || Math.pow(b, 2) + Math.pow(c, 2) == Math.pow(a, 2))
      ){
      return "es un triangolo pitagorico";
    }
     else
    if (a != b && a != c && b != c) {
      return "es un triangolo escaleno";
    }

    
    return "error no es un triangulo";
  } 
  

  public static void main(String[] args) {
    System.out.println("Hello World!");
  }
}
