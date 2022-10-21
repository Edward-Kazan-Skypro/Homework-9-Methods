import java.time.LocalDate;

public class Main {

    public static void isLeapYear(int year) {
        boolean result = ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0);
        if (result) {
            System.out.println(year + " - високосный год");
        } else System.out.println(year + " - не високосный год");
    }

    public static void messageForUser(int year, byte typeOS) {
        int currentYear = LocalDate.now().getYear();
        if (typeOS == 0 && year >= currentYear) {
            System.out.println("Установите обычную версию приложения для iOS по ссылке");
        }
        if (typeOS == 0 && year < currentYear) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
        if (typeOS == 1 && year >= currentYear) {
            System.out.println("Установите обычную версию приложения для Android по ссылке");
        }
        if (typeOS == 1 && year < currentYear) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
    }

    public static int daysForDelivery(int distance) {
        int days = 1;
        if (distance > 20 && distance <= 60) {
            days += 1;
        }
        if (distance > 60 && distance <= 100) {
            days += 2;
        }
        return days;
    }


    public static void main(String[] args) {
        //Решение задачи 1
        System.out.println("Решение задачи 1:");
        int currentYear = 2022;
        isLeapYear(currentYear);

        System.out.println();

        //Решение задачи 2
        System.out.println("Решение задачи 2:");
        byte clientOS = 0;
        int realClientDeviceYear = 2022;
        messageForUser(realClientDeviceYear, clientOS);

        System.out.println();

        //Решение задачи 3
        System.out.println("Решение задачи 3:");
        int deliveryDistance = 65;
        System.out.println("Потребуется дней: " + daysForDelivery(deliveryDistance));
    }
}