public class Main {
    public static void main(String[] args) {
        public static void task1 ( int year = 2024){
            if ((year % 4 == 0) && year % 100 != 0) {
                System.out.println(year + " год является високосным");
            } else if (year % 400 == 0) {
                System.out.println(year + " год является високосным");
            } else {
                System.out.println(year + " год является не високосным");
            }
        }
    }
}