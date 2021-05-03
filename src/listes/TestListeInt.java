package listes;

import java.util.ArrayList;
import java.util.Collections;

public class TestListeInt {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(-1);
        numbers.add(5);
        numbers.add(7);
        numbers.add(3);
        numbers.add(-2);
        numbers.add(4);
        numbers.add(8);
        numbers.add(5);

        System.out.println("Les éléments de la liste : " + numbers);

        System.out.println("La taille de la liste : " + numbers.size());

        System.out.println("L'élément le plus grand de la liste : ");
        int temp = 0;
        for (int i = 0; i < numbers.size(); i++) {
            for(int j = i+1; j < numbers.size(); j++){
                if(numbers.get(i) > numbers.get(j)){
                    temp = numbers.get(i);
                }
            }
        }
        System.out.println(temp);
        //Méthode de list
        System.out.println(Collections.max(numbers));

        //Suppression le min de la liste

        int min = Collections.min(numbers);
        numbers.remove(numbers.indexOf(min));
        System.out.println("Les éléments de la liste après la suppression: ");
        System.out.println(numbers);

        // Trouver les int negatifs et les mettre en positive

        for (int i = 0; i < numbers.size(); i++) {
            int number = numbers.get(i);
            if (number < 0) {
                int numberToPositiv = Math.abs(number);
                numbers.set(numbers.indexOf(number),numberToPositiv);
            }
        }
        System.out.println("La nouvelle liste : " + numbers);
    }
}
