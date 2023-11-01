public class Main {
    public static void main(String[] args) {
        task1();
    }

    public static void task1() {
        if ((year % 4 == 0) && year % 100 != 0) {
            System.out.println(year + " год является високосным");
        } else if (year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год является не високосным");


        }
    }
}