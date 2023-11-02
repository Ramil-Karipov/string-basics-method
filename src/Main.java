class homework {
    public static void main(String[] args) {
        task1();
        task2();
        task3();

    }
    public static void task1() {
        int year = 2024;
        if ((year % 4 == 0) && year % 100 != 0) {
            System.out.println(year + " год является високосным");
        } else if (year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год является не високосным");
        }
    }

    public static void task2() {
        int clientOs2 = 0;
        int clientDeviceYear = 2016;
        boolean ios2 = clientOs2 == 1;
        boolean android2 = clientOs2 == 0;
        boolean deviceYear = clientDeviceYear <= 2015;
        boolean deviceYear1 = clientDeviceYear > 2015;
        if (ios2 && deviceYear1) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (ios2 && deviceYear) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
        if (android2 && deviceYear1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (android2 && deviceYear) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
    }

    public static void task3() {
        int deliveryDistance = 98;
        int a = 1;
        int b = 2;
        int c = 3;
        if (deliveryDistance <= 20 || 20 == a) {
            System.out.println("Потребуется дней: " + a);
        } else if (deliveryDistance > 20 && deliveryDistance <= 60 || 60 == b) {
            System.out.println("Потребуется дней: " + b);
        } else if (deliveryDistance > 60 && deliveryDistance <= 100 || 100 == c) {
            System.out.println("Потребуется дней: " + c);
        } else {
            System.out.println("Доставка в данный регион отсутствует");
        }

    }

}