public class Calculadora {

    public int soma(int valor1, int valor2){
        int resultado = valor1 + valor2;
        return resultado;
    }

    public int subtrair(int valor1, int valor2) {
        int resultado = valor1 - valor2;
        return resultado;
    }


    public int multiplicar(int valor1, int valor2) {
        int resultado = valor1 * valor2;
        return resultado;
    }

    public int dividir(int valor1, int valor2) {
        int resultado = valor1 / valor2;
        return resultado;
    }

    public String imc(float peso, float altura) {
        float getResultadoAltura = altura * 2;
        float resultado;
        resultado = peso / getResultadoAltura;
        String retorno = "";
        if(resultado < 17){
            retorno = "Muito abaixo do peso";
        }else if(resultado >= 17 && resultado <= 18.49){
            retorno = "Abaixo do peso";
        }else if(resultado >= 18.5 && resultado <= 24.99){
            retorno = "Peso normal";
        }else if(resultado >= 25 && resultado <= 29.99){
            retorno = "Acima do peso";
        }else if(resultado >= 30 && resultado <= 34.99){
            retorno = "Obesidade I";
        }else if(resultado >= 35 && resultado <= 39.99){
            retorno = "Obesidade II (Severa)";
        }else if(resultado > 40){
            retorno = "Obesidade III (Mórbida)";
        }
        return retorno;
    }

    public int somar_media(int nota_1, int nota_2, int nota_3, int nota_4) {
        int resultado = (nota_1 + nota_2 + nota_3 + nota_4) / 4;
        return resultado;
    }
}