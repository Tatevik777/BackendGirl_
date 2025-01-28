package by.tatevik.week8;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        //задние 1
        List<String> names = Arrays.asList("Иван", "Анна", "Петр", "Мария");
        List<Double> grades = Arrays.asList(4.5, 3.8, 4.9, 4.2);
        // Вывод отсортированного списка
        System.out.println("\nСортированный список студентов по убыванию среднего балла:");
        sortStudentByGrade(names, grades);

        //задание2
        List<String> strings = new ArrayList<>(Arrays.asList("banana", "apple", "orange", "grape", "kiwi"));
        System.out.println("\nИсходный список: " + strings);
        stringSort(strings);
        System.out.println("\nОтсортированный список: " + strings);

        //Задание 3
        String[] fruits = {"apple", "orange", "grape", "banana", "pineapple", "fig"};
        sortStringByLength(fruits, 0, fruits.length - 1);
        System.out.println("\nСортированный список по длине слов в них:");
        System.out.println(Arrays.toString(fruits));

        //Задание 4
        List<String> wordsList = new ArrayList<>();
        wordsList.add("яблокоооооо");
        wordsList.add("ананас");
        wordsList.add("груша");
        wordsList.add("банан");
        wordsList.add("вишня");

        sortByWovelsAmmount(wordsList);
        System.out.println("\nСортированный список  по количеству гласных букв в слове:");
        System.out.println(wordsList);

        //Задание5
        List<String> formulas = new ArrayList<>();
        formulas.add("8 / 2 + 3 * (5 - 2)");
        formulas.add("3 + 5");
        formulas.add("5 - (3 + 2) * 2");
        formulas.add("2 + 3 * 4");
        formulas.add("(1 + 2) * 3");

        System.out.println("\nИсходный список формул:");
        for (String formula : formulas) {
            System.out.println(formula);
        }

        sortByDifficulty(formulas);

        System.out.println("\nОтсортированный список формул по сложности:");
        for (String formula : formulas) {
            System.out.println(formula);
        }

    }

    //У вас есть список студентов и их средние баллы.
    // Необходимо отсортировать список по убыванию среднего балла.
    public static void sortStudentByGrade(List<String> names, List<Double> scores) {
        // Список для хранения объектов студента
        List<Map.Entry<String, Double>> studentList = new ArrayList<>();

        for (int i = 0; i < names.size(); i++) {
            studentList.add(new AbstractMap.SimpleEntry<>(names.get(i), scores.get(i)));
        }

        // Сортировка пузырьком
        int n = studentList.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (studentList.get(j).getValue() < studentList.get(j + 1).getValue()) {
                    // Обмен элементов
                    Map.Entry<String, Double> temp = studentList.get(j);
                    studentList.set(j, studentList.get(j + 1));
                    studentList.set(j + 1, temp);
                }
            }
        }
        for (Map.Entry<String, Double> entry : studentList) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }


    //Напишите программу, которая будет сортировать список строк в алфавитном порядке.
    public static void stringSort(List<String> list) {
        if (list.size() < 2) {
            return;
        }
        String baseElem = list.get(list.size() - 1); // Опорный элемент
        List<String> lessThanBaseElem = new ArrayList<>();
        List<String> greaterThanBaseElem = new ArrayList<>();

        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i).compareTo(baseElem) <= 0) {
                lessThanBaseElem.add(list.get(i));
            } else {
                greaterThanBaseElem.add(list.get(i));
            }
        }
        stringSort(lessThanBaseElem);
        stringSort(greaterThanBaseElem);
        list.clear();
        list.addAll(lessThanBaseElem);
        list.add(baseElem);
        list.addAll(greaterThanBaseElem);
    }

    //Напишите программу, которая будет сортировать массив строк по длине слов в них. от меньшего к большему
    public static void sortStringByLength(String[] arr, int left, int right) {
        //проверка, что индекс левой границы меньше, чем правой
        if (left < right) {
            int middle = (left + right) / 2;
            //находим середину массива
            sortStringByLength(arr, left, middle);
            sortStringByLength(arr, middle + 1, right);
            //сортируем левую часть массива (от left до middle)
            // и правую часть (от middle+1 до right)
            int i = left;
            int j = middle + 1;
            while (i <= middle && j <= right) {
                if (arr[i].length() <= arr[j].length()) {
                    i++;
                } else {
                    String value = arr[j];
                    int index = j;

                    while (index != i) {
                        arr[index] = arr[index - 1];
                        index--;
                    }
                    arr[i] = value;
                    i++;

                    middle++;
                    j++;
                }
            }
        }
    }

    //Напишите программу, которая будет сортировать список слов по количеству гласных букв в слове.
    public static void sortByWovelsAmmount(List<String> words) {
        for (int i = 1; i < words.size(); i++) {
            String key = words.get(i);
            int keyVowelCount = 0;
            for (char c : key.toCharArray()) {
                if ("аеёиоуыэюяАЕЁИОУЫЭЮЯ".indexOf(c) != -1) {
                    keyVowelCount++;
                }
            }
            int j = i - 1;
            while (j >= 0) {
                int currentVowelCount = 0;
                for (char c : words.get(j).toCharArray()) {
                    if ("аеёиоуыэюяАЕЁИОУЫЭЮЯ".indexOf(c) != -1) {
                        currentVowelCount++;
                    }
                }
                if (currentVowelCount <= keyVowelCount) {
                    break;
                }
                words.set(j + 1, words.get(j));
                j--;
            }
            words.set(j + 1, key);
        }
    }

    //Вы - учитель математики и хотите написать программу, которая
    // будет помогать вашим ученикам сортировать список формул по сложности.
    // Каждая формула представляет собой строку, содержащую числа, знаки
    // операций (+, -, *, /) и скобки. Сложность формулы определяется числом
    // операций, которые нужно выполнить, чтобы вычислить ее значение.
    // Напишите программу, которая будет сортировать список формул по возрастанию сложности.
    public static void sortByDifficulty(List<String> formulas) {
        int n = formulas.size();
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (getOperationCount(formulas.get(j)) < getOperationCount(formulas.get(minIndex))) {
                    minIndex = j;
                }
            }
            // Обмен местами формул с минимальной сложностью
            if (minIndex != i) {
                String temp = formulas.get(i);
                formulas.set(i, formulas.get(minIndex));
                formulas.set(minIndex, temp);
            }
        }
    }

    //метод для подсчета количества знаков операций в формуле/сложности
    public static int getOperationCount(String formula) {
        int count = 0;
        for (char c : formula.toCharArray()) {
            if (c == '+' || c == '-' || c == '*' || c == '/') {
                count++;
            }
        }
        return count;
    }
}










