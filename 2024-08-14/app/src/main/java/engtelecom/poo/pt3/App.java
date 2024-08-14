package engtelecom.poo.pt3;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;

public class App {
    public static void main(String[] args) {
        String currentDir = System.getProperty("user.dir");
        Path dir = Path.of(currentDir);

        try(DirectoryStream<Path> stream = Files.newDirectoryStream(dir)){
            for (Path path : stream) {
                if(Files.isRegularFile(path)){
                    System.out.println(path.getFileName());
                }
            }
        }catch (IOException e){
            System.err.println("Erro: " + e);
        }
    }
}
