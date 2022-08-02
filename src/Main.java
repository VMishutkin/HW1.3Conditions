public class Main {
    public static void main(String[] args) {

        //Задача 1
        boolean clientOS =false; //Где 0 — iOS, 1 — Android.
        if(clientOS){
            System.out.println("Установите версию приложения для Android по ссылке.");
        }else{
            System.out.println("Установите версию приложения для IOS по ссылке.");
        }
        System.out.println();
        // Задача 2
        int releaseYear = 2013;
        if(clientOS == true){
            if (releaseYear>2015){
                System.out.println("Установите версию приложения для Android по ссылке");
            } else{
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
        } else if ( releaseYear > 2015){
            System.out.println("Установите версию приложения для IOS по ссылке");
        } else{
            System.out.println("Установите облегченную версию приложения для IOS по ссылке");
        }
        System.out.println();
        //Задача 3
        int year = 1700;
        if (year % 4 ==0){
            if (year % 100 == 0 && year % 400 != 0){
                System.out.println(year + " год не високосный");
            }
            else{
                System.out.println(year + " год високосный");
            }
        }else {
            System.out.println(year + " год не високосный");
        }
        System.out.println();
        // Задача 4
        final int oneDayDeliveryRange = 20;
        int orderRange = 95;
        if (orderRange< oneDayDeliveryRange){
            System.out.println("Потребуется дней : 1");
        }else {
            int deliveryPeriod = (orderRange - oneDayDeliveryRange) / 40 + 2;
            System.out.println(" Потребуется дней : " + deliveryPeriod);
        }
        System.out.println();
        // Задача 5
        int month = 9;
                switch(month){
                    case 1:
                    case 2:
                    case 12:
                        System.out.println(month + " месяц это зима");
                        break;
                    case 3:
                    case 4:
                    case 5:
                        System.out.println(month + " месяц это весна");
                        break;
                    case 6:
                    case 7:
                    case 8:
                        System.out.println(month + " месяц это лето");
                        break;
                    case 9:
                    case 10:
                    case 11:
                        System.out.println(month + " месяц это осень");

                }

    }
}