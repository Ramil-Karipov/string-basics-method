class homework {
    public static void main(String[] args) {
        task1(2024);
        task2(0, 2013);
        task3(13);

    }

    public static void task1(int year) {
        boolean leapYear = (year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0);
        if (leapYear) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год является не високосным");
        }
    }

    public static void task2(int client, int clientDeviceYear) {
        int ios = 1;
        int android = 0;
        boolean condition = clientDeviceYear <= 2015 || clientDeviceYear > 2015;
        if (client == ios && (condition)) {
            System.out.println("Установите версию приложения для iOS по ссылке");
            if (clientDeviceYear <= 2015) {
                System.out.println("Установите облегчённую версию приложения для iOS по ссылке");
            }
        }
        if (client == android && (condition)) {
            System.out.println("Установите версию приложения для Android по ссылке");
            if (clientDeviceYear <= 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
        }
    }

    public static void task3(int deliveryDistance) {
        if (deliveryDistance < 20) {
            System.out.println("Потребуется 1 день");
        } else if (deliveryDistance > 20 && deliveryDistance < 60) {
            System.out.println("Потребуется 2 дня");
        }
        if (deliveryDistance > 60 && deliveryDistance < 100) {
            System.out.println("Потребуется 3 дня");
        } else if (deliveryDistance > 100) {
            System.out.println("Доставка не предусмотрена");
        }
    }

}








