public class Main {

    public static void main(String[] args) {
        //Задание 1
        int year = 2020;
        checkIfYearLeap(year);
        System.out.println();
        //Задание 2
        int clientOs = 0;
        int clientDeviceYear = 2016;
        checkClientOS(clientOs, clientDeviceYear);
        System.out.println();
        //Задание 3
        int deliveryDistance = 95;
        int days = 0;
        checkDeliveryDistance(deliveryDistance, days);
    }

    public static void checkIfYearLeap(int year) {
        System.out.println("задание 1");
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("год " + year + " является високосным");
        } else {
            System.out.println("год " + year + " не является високосным");
        }
    }

    public static void checkClientOS(int clientOS, int clientDeviceYear) {
        System.out.println("задание 2");
        if (clientDeviceYear < 2015) {
            switch (clientOS) {
                case 0:
                    System.out.println("Установите облегченную версию приложения для iOS по ссылке");
                    break;
                case 1:
                    System.out.println("установите облегченную версию приложения для Android по ссылке");
            }
        } else {
            switch (clientOS) {
                case 0:
                    System.out.println("Установите версию приложения для iOS по ссылке");
                    break;
                case 1:
                    System.out.println("Установите версию приложения для Android по ссылке");
                    break;
            }
        }
    }

    public static int checkDeliveryDistance(int deliveryDistance, int days) {
        System.out.println("Задание 3");
        if (deliveryDistance < 0 || deliveryDistance >= 100) {
            System.out.println("Доставка не осуществляется");
        }
        if (deliveryDistance <= 20) {
            days = days + 1;
            System.out.println("Потребуется дней: " + days);
        }
        if (deliveryDistance > 20 && deliveryDistance < 60) {
            days = days + 2;
            System.out.println("Потребуется дней: " + days);
        }
        if (deliveryDistance > 60 && deliveryDistance < 100) {
            days = days + 3;
            System.out.println("Потребуется дней: " + days);
        }
        return days;
    }
}