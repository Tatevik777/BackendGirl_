package by.tatevik.week8;

import java.util.Arrays;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        String[][] students = {
                {"Иванов", "4.5"},
                {"Петров", "3.7"},
                {"Сидоров", "4.2"},
                {"Козлов", "5.0"},
                {"Смирнов", "3.9"}
        };

        bubbleSort(students);

        // Вывод отсортированного списка
        for (String[] student : students) {
            System.out.println(Arrays.toString(student));
        }
    }
    public static void bubbleSort(String[][] arr){
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                // Сравниваем баллы (преобразуем строку в число)
                if (Double.parseDouble(arr[j][1]) < Double.parseDouble(arr[j + 1][1])) {
                    // Меняем местами
                    String[] temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }


    }
}
