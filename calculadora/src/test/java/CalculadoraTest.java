

import org.junit.Test;
import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.core.Is.*;

public class CalculadoraTest {
    private Calculadora calculadora;

    // ID do Zoom: 982655240

   @Test
   public void deve_somar_dois_numeros() {
       calculadora = new Calculadora();
       int esperado = 5;
       int resultado = calculadora.soma(3,2);
       assertThat(resultado, is(esperado));
   }

   @Test
   public void deve_subtrair_dois_numeros(){
       calculadora = new Calculadora();
       int esperado = 86;
       int resultado = calculadora.subtrair(100,14);
       assertThat(esperado, is(resultado));
   }

   @Test
   public void deve_multiplicar_dois_numeros(){
       calculadora = new Calculadora();
       int esperado = 66;
       int resultado = calculadora.multiplicar(33,2);
       assertThat(esperado, is(resultado));
   }

   @Test
   public void deve_dividir_dois_numeros(){
       calculadora = new Calculadora();
       int esperado = 10;
       int resultado = calculadora.dividir(100,10);
       assertThat(esperado, is(resultado));
   }

   @Test
   public void deve_calcular_imc_dois_numeros(){
       calculadora = new Calculadora();
       String esperado = "Peso normal";
       String resultado = calculadora.imc(66.6f, 1.70f);
       assertThat(esperado, is(resultado));
   }

   @Test
    public void deve_calcular_media_quatros_numeros(){
       calculadora = new Calculadora();
       int esperado = 10;
       int resultado = calculadora.somar_media(10,10,10,10);
       assertThat(esperado, is(resultado));
   }
}
