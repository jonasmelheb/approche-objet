package fr.diginamic.dates;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class TestCalendar {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(2016,4,19,23,59,30);
        Date date = calendar.getTime();

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String chaine = dateFormat.format(date);
        System.out.println(chaine);

        //Question2
        Calendar calendar1 = Calendar.getInstance();
        Date date1 = calendar1.getTime();
        dateFormat = new SimpleDateFormat("yyy/MM/dd");
        String chaine1 = dateFormat.format(date1);
        System.out.println(chaine1);

        //Question3
        dateFormat = new SimpleDateFormat("EEEEE MMMM yyyy", Locale.GERMANY);
        String dateFr = dateFormat.format(date1);
        dateFormat = new SimpleDateFormat("EEEEE MMMM yyyy", Locale.CHINA);
        String dateCh = dateFormat.format(date1);
        dateFormat = new SimpleDateFormat("EEEEE MMMM yyyy", new Locale("RU"));
        String dateRu = dateFormat.format(date1);

        System.out.println(dateFr);
        System.out.println(dateCh);
        System.out.println(dateRu);

    }
}
