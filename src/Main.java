public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();

    }

    public static void task1 () {
        System.out.println("Задача 1");
        int salary = 15000;
        int total = 0;
        int month = 0;
        while (total < 2_459_000 ) {
            total = total + salary;
            month++;
            System.out.println("Месяц "+ month +" сумма накоплений равна " + total + " рублей "  );
        }


    }

    public static void task2 () {
        System.out.println("Задача 2");
        int number = 0;
        while (number < 10) {
            number++;
            System.out.print(" " + number + " ");
        }
        System.out.println();
        for (;number > 0;number--)
        {
            System.out.print(" " + number + " ");
        }
        System.out.println();

    }
    public static void task3 () {
        System.out.println("Задача 3");
        int y = 12_000_000;
        int year = 0;
        int life = 17;
        int dead = 8;
        while (year<10) {
            year++;
            y = (y  * (life - dead))/1000 + y;
            System.out.println(" Год " + year + " численность населения составляет " + y );
        }
    }

    public static void task4 () {
        System.out.println("Задача 4");
        int wanted = 12_000_000;
        int total = 15_000;
        int month = 1;
        double percent = 0.07;
        while (total<wanted){
            total = total + (int) (total*percent);
            month++;
            System.out.println("Месяц " + month + " общая сумма " + total + " рублей");
        }

    }


    public static void task5 () {
        System.out.println("Задача 5");
        int wanted = 12_000_000;
        int total = 15_000;
        int month = 1;
        double percent = 0.07;
        while (total<wanted) {
            total = total + (int) (total * percent);
            month++;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + " общая сумма " + total + " рублей");
            }
        }
    }

    public static void task6 () {
        System.out.println("Задача 6");
        int total = 15_000;
        double percent = 0.07;
        int deadline = 9*12;
        int month = 0;
        while (month<=deadline) {
            month++;
            total = total + (int) (total * percent);
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + " общая сумма " + total + " рублей");
            }
        }
    }
    public static void task7 () {
        System.out.println("Задача 7");
        int month = 31;
        int firstFridey = 5;
        for (int friday = firstFridey; friday <= month; friday += 7) {
            if (friday % 1 == 0) {
                System.out.println("Сегодня пятница " + friday + "-е число. Необходимо подготовить отчет.");
            }
        }
    }
    public static void task8 () {
        System.out.println("Задача 8");
        int currentУear = 2023;
        int theGapAhead = currentУear+100;
        int theGapBack = currentУear-200;
        while (theGapBack<=theGapAhead) {
            theGapBack++;
            if (theGapBack%79==0 ) {
                System.out.println( "Комета пролетит в " + theGapBack+ " год ");
            }
        }
    }
}