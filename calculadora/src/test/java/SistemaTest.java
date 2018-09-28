import org.junit.Test;
import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.core.Is.*;

public class SistemaTest {
    private Sistema sistema;

    @Test
    public void checar_existe_arquivo_txt(){
        sistema = new Sistema();
        boolean esperado = true;
        boolean resultado = sistema.check_existe_arquivo_txt();
        assertThat(resultado, is(esperado));
    }

    @Test
    public void checar_permissao_para_executar_arquivo_txt(){
        sistema = new Sistema();
        boolean esperado = false;
        boolean resultado = sistema.check_executar_arquivo_txt();
        assertThat(resultado, is(esperado));
    }

    @Test
    public void checar_permissao_para_leitura_arquivo_txt(){
        sistema = new Sistema();
        boolean esperado = true;
        boolean resultado = sistema.check_leitura_arquivo_txt();
        assertThat(resultado, is(esperado));
    }

    @Test
    public void checar_permissao_para_escritura_arquivo_txt(){
        sistema = new Sistema();
        boolean esperado = true;
        boolean resultado = sistema.check_escritura_arquivo_txt();
        assertThat(resultado, is(esperado));
    }

    @Test
    public void checar_conexao_ftp_da_divisul(){
        sistema = new Sistema();
        boolean esperado = true;
        boolean resultado = sistema.conectar_ftp();
        assertThat(resultado, is(esperado));
    }
}
