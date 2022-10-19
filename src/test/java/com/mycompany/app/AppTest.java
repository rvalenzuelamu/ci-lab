package com.mycompany.app;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
  @Test
  public void probarTriangulo() {
    assertEquals("error no es un triangulo", App.triangulo(0, 0, 0));
    assertEquals("es un triangulo equilatero", App.triangulo(1, 1, 1));
    assertEquals("es un triangulo isoceles", App.triangulo(2, 2, 3));
    assertEquals("es un triangulo escaleno", App.triangulo(3, 4, 6));
    assertEquals("es un triangulo pitagorico", App.triangulo(3, 4, 5));
  }
}
