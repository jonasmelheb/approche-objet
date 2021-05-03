package listes;

import java.util.ArrayList;

public class CreationListe {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        for (int i = 1; i <= 100; i++)
        {
            numbers.add(i);
        }
        System.out.println(numbers.size());
    }
}
