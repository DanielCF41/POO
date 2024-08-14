package engtelecom.poo.pt4;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

public class App {
    public static void main(String[] args) {
        String currentDir = System.getProperty("user.dir");
        Path inicial = Path.of(currentDir);

        try (Stream<Path> walk = Files.walk(inicial)) {
            walk.sorted().forEach(arq -> {
                int profudindade = inicial.relativize(arq).getNameCount();
                String sufixo = (Files.isDirectory(arq) ?  " (d)"  :  "" + profudindade);
                System.out.println(" ".repeat(profudindade) + arq.getFileName() + sufixo);
            });
        }catch(Exception e) {
            System.out.println(e);
        }
    }
}
