package logica;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class AnalizadorLexico {

    public static void main(String[] args) throws Exception {
        final String rutaJFLEX = "src/logica/Lexico.flex";
        final String rutaJCUP = "src/logica/LexicoCup.flex";
        final String[] rutaSCUP = {"-parser", "Sintax", "src/logica/Sintax.cup"};
        generarLex(rutaJFLEX, rutaJCUP, rutaSCUP);
    }

    public static void generarLex(String caminoJFLEX, String caminoJCUP, String[] caminoSCUP) throws IOException, Exception {
        File arc1, arc2;
        arc1 = new File(caminoJFLEX);
        JFlex.Main.generate(arc1);
        arc2 = new File(caminoJCUP);
        JFlex.Main.generate(arc2);
        java_cup.Main.main(caminoSCUP);

        Path caminoSym = Paths.get("src/logica/sym.java");
        if (Files.exists(caminoSym)) {
            Files.delete(caminoSym);
        }
        Files.move(
                Paths.get("src/logica/sym.java"),
                Paths.get("src/logica/sym.java")
        );
        Path caminoSint = Paths.get("src/logica/Sintax.java");
        if (Files.exists(caminoSint)) {
            Files.delete(caminoSint);
        }
        Files.move(
                Paths.get("src/logica/Sintax.java"),
                Paths.get("src/logica/Sintax.java")
        );
    }
}
