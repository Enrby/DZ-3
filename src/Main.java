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
    public static void task5 () {
        System.out.println("Задача 5");
        int totalCans = 120;
        int whiteCans = 2;
        int browneCans = 4;
        int totalClass = totalCans / (whiteCans + browneCans);
        int totalWhiteClass = whiteCans * totalClass;
        int totalBrowneClass = browneCans * totalClass;
        System.out.println("В школе, где " + totalClass + " классов нужно " + totalWhiteClass + " белой краски и " + totalBrowneClass + " банок коричневой краски");
    }
        public static void task6 () {
            System.out.println("Задача 6");
            int bananasCount = 5;
            int milkCount = 2;
            int iceCream = 2;
            int eggsCount = 4;
            int wightBananas = 80;
            int wightMilk = 105;
            int wightIce = 100;
            int wightEggs = 70;

            int totalGrams = bananasCount * wightBananas + milkCount * wightMilk + iceCream * wightIce + eggsCount * wightEggs;
            double totalKg = totalGrams / 1_000D;
            System.out.println("Общий вес в граммах " + totalGrams + ", в кг " + totalKg);
        }
    public static void task7 () {
        System.out.println("Задача 7");
        int wightGrams = 7_000;
        int daysMin = 250;
        int daysMax = 500;
        double daysMinCount = (double) wightGrams / daysMax;
        double daysMaxCount = (double) wightGrams / daysMin;
        double wightGramsAverage = (daysMin + daysMax) / 2d;
        double averageDaysCount = wightGrams / wightGramsAverage;
        System.out.println("Минимаьное количество дней для похудения " + daysMinCount);
        System.out.println("Максимальное количество дней для похудения " + daysMaxCount);
        System.out.println("Среднее количество дней для похудения " + averageDaysCount);
        }

    public static void task8 () {
        System.out.println("Задача 8");
        int mashaSalary = 67_760;
        int denisSalary = 83_690;
        int kristinaSalary = 76_230;

        double indexPercent = 1.1;

        double newMashaSalary = mashaSalary * indexPercent;
        double newDenisSalary = denisSalary * indexPercent;
        double newKristinaSalary = kristinaSalary * indexPercent;

        double annualMashaSalary = mashaSalary * 12;
        double newAnnualMashaSalary = newMashaSalary * 12;

        double annualDenisSalary = denisSalary * 12;
        double newAnnualDenisSalary = newDenisSalary * 12;

        double annualKristinaSalary = kristinaSalary * 12;
        double newAnnualKristinaSalary = newKristinaSalary * 12;

        System.out.println("Маша теперь получает " + newMashaSalary + " рублей. Годовой доход вырос на " + (newAnnualMashaSalary - annualMashaSalary) + " рублей в год");
        System.out.println("Денис теперь получает " + newDenisSalary + " рублей. Годовой доход вырос на " + (newAnnualDenisSalary - annualDenisSalary) + " рублей в год");
        System.out.println("Кристина теперь получает " + newKristinaSalary + " рублей. Годовой доход вырос на " + (newAnnualKristinaSalary - annualKristinaSalary) + " рублей в год");
    }
}




