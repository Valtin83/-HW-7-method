import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задача №1");
        // определим является год високосным или нет
        int year = 2024;
        defineLeapYear(year); // используем метод к задаче 1

        System.out.println("Задача №2");
        // 1 - Android
        // 0 - iOS
        int clientOS = 0;
        int clientDeviceYear = 2023;
        suggestVersionOS(clientOS, clientDeviceYear); // используем метод к задаче 2

        System.out.println("Задача №3");
        // определим срок доставки
        int deliveryDistance = 95;
        // используем метод к задаче 3 с возвратом значения
        int days = deliverOnTime(deliveryDistance);
        if (days > 0) {
            System.out.println("Потребуется дней: " + days);
        } else {
            System.out.println("Доставки нет.");
        }

    }

    // задача 1
    public static void defineLeapYear(int year) {
        boolean isLeapYear = (year > 1584 && (year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0));
        if (isLeapYear) {
            System.out.println(year + " год является високосным.");
        } else {
            System.out.println(year + " год не является високосным.");
        }
    }

    // Задача №2
    public static void suggestVersionOS(int clientOS, int clientDeviceYear) {
        int currentYear = LocalDate.now().getYear();
        if (clientOS == 1 && clientDeviceYear < currentYear) {
            System.out.println("Установите облегченную версию приложения" +
                    " для Android по ссылке");
        } else if (clientOS == 1 && clientDeviceYear == currentYear) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOS == 0 && clientDeviceYear < currentYear) {
            System.out.println("Установите облегченную версию приложения " +
                    "для iOS по ссылке");
        } else if (clientOS == 0 && clientDeviceYear == currentYear) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
    }

    // Задача №3
    public static int deliverOnTime(int deliveryDistance) {
        if (deliveryDistance < 20) {
            return 1; // возвращаем значение 1 день
        } else if (deliveryDistance < 60) {
            return 2; // возвращаем значение 2 дня
        } else if (deliveryDistance <= 100) {
            return 3; // возвращаем значение 3 дня
        } else {
            return 0; // возвращаем значение "Доставки нет"
        }
    }
}
