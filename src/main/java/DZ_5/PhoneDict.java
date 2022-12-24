package DZ_5;

import java.util.*;

public class PhoneDict {
    static Map<String, ArrayList<String>> phoneDict = new HashMap<>();

    public static void main(String[] args) {
        createPhoneDict();
        System.out.println(addPhoneDict());
    }

    //Инициализация телефонного справочника
    private static void createPhoneDict() {
        phoneDict.putIfAbsent("Иванов", null);
        phoneDict.putIfAbsent("Петров", null);
        phoneDict.putIfAbsent("Сидоров", null);
    }

    // Метод добавления нескольких номеров телефона в ArrayList<String>
    private static ArrayList<String> addTelephones() {
        ArrayList<String> telephones = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Сколько номеров телефона вы будете вводить: ");
        int quantity = scanner.nextInt();
        for (int i = 1; i < quantity + 1; i++) {
            System.out.printf("Введите %d номер телефона: ", i);
            String number = scanner.next();
            telephones.add(number);
        }
        return telephones;
    }

    // Добавление по ключу
    private static Map<String, ArrayList<String>> addPhoneDict() {
        for (Map.Entry<String, ArrayList<String>> pair : phoneDict.entrySet()) {
            System.out.printf("Ввод номеров телефонов для %s\n", pair.getKey());
            pair.setValue(addTelephones());
        }
        return phoneDict;
    }
}