public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }
    public static void task1 () {
        System.out.println("Задача 1");
        int countApples = 5;
        System.out.println("Значение переменной countApples с типом int ровно " + countApples);
        byte countTyres = 3;
        System.out.println("Значение переменной countTyres с типом byte ровно " + countTyres);
        short countCats = 10;
        System.out.println("Значение переменной countCats с типом short ровно " + countCats);
        long twoBillions = 2_000_000_000;
        System.out.println("Значение переменной twoBillions с типом long ровно " + twoBillions);
        float e = 2.1828F;
        System.out.println("Значение переменной e с типом float ровно " + e);
        double pi = 2.1415;
        System.out.println("Значение переменной pi с типом double ровно " + pi);
    }
    public static void task2 () {
        System.out.println("Задача 2");
          float floatNumber = 27.12F;
          long longNumber = 987_678_965_549L;
          double doubleNumber = 2.786;
          short shortNumber = 569;
          char charNumber = 159;
          int intNumber = 27897;
          byte byteNumber = 67;
    }
    public static void task3 () {
        System.out.println("Задача 3");
        int pupilsInFirstClass = 23;
        int pupilsInSecondClass = 27;
        int pupilsInThirdClass = 23;
        int totalPaperCount = 488;

        int totalPupils = pupilsInFirstClass + pupilsInSecondClass + pupilsInThirdClass;
        int papersPerPupil = totalPaperCount / totalPupils;
        System.out.println("На каждого ученика расчитано " + papersPerPupil + " листов бумаги");
    }
    public static void task4 () {
        System.out.println("Задача 4");
        int bottles = 16;
        int minutes = 2;
        int bottlesPerMinutes = bottles / minutes;
        int bottlesPer20Minutes = bottlesPerMinutes * 20;
        int bottlesPerHour = bottlesPer20Minutes * 3;
        int bottlesPerDay = bottlesPerHour * 24;
        int bottlesPer3Days = bottlesPerDay * 3;
        int bottlesPerMonth = bottlesPer3Days * 10;

        System.out.println("За 20 минут машина произвела " + bottlesPer20Minutes + " штук бутылок");
        System.out.println("За сутки машина  произвела " + bottlesPerDay + " штук бутылок");
        System.out.println("За 3 дня машина  произвела " + bottlesPer3Days + " штук бутылок");
        System.out.println("За месяц  машина  произвела " + bottlesPerMonth + " штук бутылок");
    }
}
