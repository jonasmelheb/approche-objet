package fr.diginamic.dates;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDates {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String chaine = dateFormat.format(date);
        System.out.println(chaine);

        Date date2 = new Date(116,4,19, 23, 59, 30);
        dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        String chaine2 = dateFormat.format(date2);
        System.out.println(chaine2);
    }
}
