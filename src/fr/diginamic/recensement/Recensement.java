package fr.diginamic.recensement;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Recensement {
    private List<Ville> listeVille;

    public Recensement() throws IOException {
        listeVille = init();
    }

    private List<Ville> init() throws IOException {
        Path pathFile = Paths.get("/home/younes/Téléchargements/recensement.csv");
        List<String> lines = Files.readAllLines(pathFile, StandardCharsets.UTF_8);

        List<Ville> newListVille = new ArrayList<>();
        for (int i = 1; i < lines.size(); i++) {
            String line = lines.get(i);
            String[] tokens = line.split(";");

            String codeRegion = tokens[0];
            String nomRegion = tokens[1];
            String codeDepartement = tokens[2];
            int codeCommune = Integer.parseInt(tokens[5]);
            String nomCommune = tokens[6];
            int population = Integer.parseInt(tokens[9].trim().replaceAll(" ", ""));

            Ville ville = new Ville(codeRegion,nomRegion,codeDepartement,codeCommune,nomCommune,population);
            newListVille.add(ville);
        }
        return newListVille;
    }

    @Override
    public String toString() {
        return "Recensement{" +
                "listeVille=" + listeVille +
                '}';
    }

    public List<Ville> getListeVille() {
        return listeVille;
    }

    public void setListeVille(List<Ville> listeVille) {
        this.listeVille = listeVille;
    }
}
