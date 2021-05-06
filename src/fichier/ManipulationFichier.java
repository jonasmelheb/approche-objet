package fichier;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ManipulationFichier {
    public static void main(String[] args) throws IOException {
        Path pathFile = Paths.get("/home/younes/Téléchargements/recensement.csv");
        List<String> lines = Files.readAllLines(pathFile, StandardCharsets.UTF_8);
        Iterator<String> iterator = lines.iterator();
        while (iterator.hasNext()) {
            String line = iterator.next();
//            System.out.println(line);
        }

        Path pathDestination = Paths.get("/home/younes/Téléchargements/recensement2.csv");
        List<String> nouveauxLines = new ArrayList<>();
        nouveauxLines.add("Nom de la commune;Code département;Population totale");

        for (int i = 1; i < lines.size(); i++) {
            String line = lines.get(i);
            String[] tokens = line.split(";");

            tokens[9] = tokens[9].trim().replaceAll(" ", "");

            if (Integer.parseInt(tokens[9]) >= 25000) {
                String newFileContent = tokens[6] + ";" + tokens[2] + ";" + tokens[9];
                nouveauxLines.add(newFileContent);
            }
        }

        Files.write(pathDestination, nouveauxLines);


    }
}
