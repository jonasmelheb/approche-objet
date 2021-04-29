package fr.diginamic.operations;

import java.util.Arrays;

public class CalculMoyenne {
    private static double[] array = new double[0];

    public static void ajout(double a) {
        array = Arrays.copyOf(array, array.length + 1);
        array[array.length - 1] = a;
    }

    public static int calcule() {
        int calculator = 0;
        int result = 0;
        for (int i = 0; i < array.length; i++) {
            calculator += array[i];
        }
        result = calculator / array.length;
        return result;
    }

    @Override
    public String toString() {
        return "Array{ " + array.toString() +"}";
    }
}

