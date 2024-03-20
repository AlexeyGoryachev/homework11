public class Main {
    public static void main(String[] args) {
        System.out.println("Homework 11.");
        System.out.println("Task 1.");
        int thisYear = 2024;
        checkYear(thisYear);
        System.out.println("Task 2.");
        int iOS = 0;
        int android = 1;
        int os = 0;
        int clientDeviceYear = 2010;
        selectingVersion(os, clientDeviceYear);
        System.out.println("Task 3.");
        int deliveryDistance = 55;
        calculationDeliveryTime(deliveryDistance);
    }
    public static void checkYear(int year) {
        if ((year % 100 != 0 && year % 4 == 0) || (year % 400 == 0)) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }
    public static void selectingVersion(int os, int clientDeviceYear) {
        if (os == 0) {
            if (clientDeviceYear >= 2015) {
                System.out.println("установите версию приложения для iOS по ссылке");
            } else {
                System.out.println("установите облегченную версию приложения для iOS по ссылке");
            }
        }
        if (os == 1) {
            if (clientDeviceYear >= 2015) {
                System.out.println("установите версию приложения для Android по ссылке");
            } else {
                System.out.println("установите облегченную версию приложения для Android по ссылке");
            }
        }
    }
    public static void calculationDeliveryTime(int deliveryDistance) {
        int minDeliveryTime = 1;
        if (deliveryDistance <= 100 && deliveryDistance <= 20) {
            System.out.println("Доставка будет произведена в течении " + minDeliveryTime + " суток.");
        } else if (deliveryDistance <= 100 && deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("Доставка будет произведена в течении " + minDeliveryTime * 2 + " суток.");
        } else if (deliveryDistance <= 100 && deliveryDistance > 60) {
            System.out.println("Доставка будет произведена в течении " + minDeliveryTime * 3 + " суток.");
        } else {
            System.out.println("Доставка по указанному адресу не осуществляется.");
        }
    }
}