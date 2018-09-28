import java.io.*;
import java.net.URL;
import java.net.URLConnection;

public class Sistema {

    private String caminho_arquivo = "/tmp/exemplo.txt";

    public boolean check_existe_arquivo_txt() {
        File get_arquivo = get_arquivo();
        boolean existe_arquivo = get_arquivo.exists();
        if(existe_arquivo){
            return true;
        }
        return false;
    }

    public boolean check_executar_arquivo_txt() {
        File get_arquivo = get_arquivo();
        return get_arquivo.canExecute();
    }

    public boolean check_leitura_arquivo_txt() {
        File get_arquivo = get_arquivo();
        return get_arquivo.canRead();
    }

    public boolean check_escritura_arquivo_txt() {
        File get_arquivo = get_arquivo();
        return get_arquivo.canWrite();
    }

    private File get_arquivo(){
        File file = new File(caminho_arquivo);
        return file;
    }

    public boolean conectar_ftp(){
        String ftpUrl = "ftp://%s:%s@%s/%s;type=d";
        String host = "desconhecido.com.br";
        String usuario = "usuario_nanana";
        String senha = "senha_nanana";
        String dirPath = "/mentoria/public_html";

        ftpUrl = String.format(ftpUrl, usuario, senha, host, dirPath);
        System.out.println("URL: " + ftpUrl);

        try {
            URL url = new URL(ftpUrl);
            URLConnection conn = url.openConnection();
            InputStream inputStream = conn.getInputStream();
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));

            String line = null;
            System.out.println("--- Iniciando ---");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            System.out.println("--- Terminando ---");
            inputStream.close();
            return true;
        } catch (IOException ex) {
            ex.printStackTrace();
            return false;
        }
    }
}
