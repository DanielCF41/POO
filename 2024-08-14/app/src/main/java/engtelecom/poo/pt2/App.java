package engtelecom.poo.pt2;

import java.nio.file.Files;
import java.nio.file.Path;

public class App {
    public static void main(String[] args) {
        String curretDir = System.getProperty("user.dir");
        System.out.println(curretDir);
        Path path = Path.of(args[0]);

        if (Files.exists(path)){
            System.out.println(String.format("Arquivo: %s", path.toString()));
            System.out.println(String.format("Regular: %s" , Files.isRegularFile(path)));
            System.out.println(String.format("Diretório: %s" , Files.isDirectory(path)));
            System.out.println(String.format("Permissão de leitura: %s", Files.isReadable(path)));
            System.out.println(String.format("Permissão de escrita: %s", Files.isWritable(path)));
        } else {
            System.out.println("Arquivo não encontrado");
        }
    }
}
