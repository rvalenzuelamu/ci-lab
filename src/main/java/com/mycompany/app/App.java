package com.mycompany.app;
/**
 * Hello world!
 *
 */
public class App {
  private static boolean esTrianguloPitagorico(int a,int b, int c){
   //a2 + b2 = c2
    if (a > b && a > c) {
      if ((Math.pow(a,2)) == (Math.pow(b,2)) + (Math.pow(c,2))) {
        return true;
      }
    } else if (b > a  &&  b > c) {
      if ((Math.pow(b,2)) == (Math.pow(a,2)) + (Math.pow(c,2))) {
        return  true;
      }
    } else if (c > a  &&  c > b) {
      if ((Math.pow(c,2)) == (Math.pow(a,2)) + (Math.pow(b,2))) {
        return  true;
      }
     }

    return false;
  }

  public static String triangulo(int a, int b, int c) {

    if (Boolean.TRUE.equals(esTrianguloPitagorico(a,b,c)))
    {
      return "es un triangolo pitagorico";
    }
    if (a != b && a != c && b != c) {
      return "es un triangolo escaleno";
    }
    if (!(a + b > c && a + c > b && b + c > a)) {
      return "error no es un triangulo";
    }
    
    if ((a*a) + (b * b) == (c *c)) {
      return "es un triangulo pitagorico";
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
    
    if((a*a + b*b) == c*c){
      return "es un triangulo pitagorico";
    }
    return "error no es un triangulo";
  } 
  

  public static void main(String[] args) {
    System.out.println("Hola Gente!");
  }
}
