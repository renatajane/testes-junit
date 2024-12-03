package sistematizacao.vvs;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import org.junit.Test;

public class AppTest {

  CalculadoraDiferente calculadora = new CalculadoraDiferente();

  // Testes do método inverteNumero
  @Test
  public void testInverteNumero() {
    int resultado = calculadora.inverteNumero(25);
    assertEquals("O número invertido de 25 deve ser 52", 52, resultado);
  }

  @Test
  public void testInverteNumeroGrande() {
    int resultado = calculadora.inverteNumero(12345);
    assertEquals("O número invertido de 12345 deve ser 54321", 54321, resultado);
  }

  // Testes do método fatorial
  @Test
  public void testFatorial() {
    int resultado = calculadora.fatorial(5);
    assertEquals("O fatorial de 5 deve ser 120", 120, resultado);
  }

  @Test
  public void testFatorialDeUm() {
    int resultado = calculadora.fatorial(1);
    assertEquals("O fatorial de 1 deve ser 1", 1, resultado);
  }

  // Testes do método somaDobro
  @Test
  public void testSoma() {
    int resultado = calculadora.somaDobro(5, 5);
    assertEquals("A soma de 5 e 5 multiplicado por 2 deveria ser 15", 15, resultado);
  }

  @Test
  public void testSomaErrado() {
    int resultado = calculadora.somaDobro(5, 5);
    assertThat("O resultado não deveria ser 20", resultado, is(not(20)));
  }

}