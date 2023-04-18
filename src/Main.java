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
        int deliveryDistance = 110;
        checkDeliveryDistance(deliveryDistance);
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

    public static void checkDeliveryDistance(int deliveryDistance) {
        System.out.println("Задание 3");
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней: 1");
        }
        if (deliveryDistance > 20 && deliveryDistance < 60) {
            System.out.println("потребуется дней:2");
        }
        if (deliveryDistance > 60 && deliveryDistance < 100) {
            System.out.println("Потребуется дней: 3");
        } else {
            System.out.println("доставка не осуществляется");
        }
    }
}