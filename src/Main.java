class homework {
    public static void main(String[] args) {
        task1(2024);
        task2(1, 2016);
        task3(98);

    }

    public static void task1(int year) {
        boolean leapYear = (year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0);
        if (leapYear) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год является не високосным");
        }
    }

    public static void task2(int clientOs, int clientDeviceYear) {
        int ios = 1;
        int android = 0;
        if (clientOs == ios && (clientDeviceYear <= 2015 || clientDeviceYear > 2015)) {
            System.out.println("Установите версию приложения для iOS по ссылке");
            if (clientDeviceYear <= 2015) {
                System.out.println("Установите облегчённую версию приложения для iOS по ссылке");
            }
        }
    }

    public static void task3(int deliveryDistance) {
        boolean oneDay = (deliveryDistance < 20);
        if (oneDay) {
            System.out.println("Потребуется 1 день");
        } else {
            boolean twoDays = (deliveryDistance > 20) && (deliveryDistance < 60);
            if (twoDays) {
                System.out.println("Потребуется 2 дня");
            } else {
                boolean threedays = (deliveryDistance > 60) && (deliveryDistance < 100);
                if (threedays) {
                    System.out.println("Потребуется 3 дня");
                } else {
                    System.out.println("Доставка не предусмотрена");
                }

            }

        }
    }
}