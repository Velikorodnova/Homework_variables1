public class Main {
    public static void main(String[] args) {
        // Актуальная домашка

        // Задача 1
        var dog = 8;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog + ", " + cat + ", " + paper);

        // Задача 2
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(dog + ", " + cat + ", " + paper);

        // Задача 3
        var dogA = dog - 3.5;
        var catA = cat - 1.6;
        var paperA = paper - 7639;
        System.out.println(dogA + ", " + catA + ", " + paperA);

        // Задача 4
        var friends = 19;
        System.out.println(friends);
        friends = friends + 2;
        System.out.println(friends);
        friends = friends / 7;
        System.out.println(friends);

        // Задача 5
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);

        // Задача 6
        var boxerWeightOne = 78.2;
        var boxerWeightTwo = 82.7;
        var allWeightBoxer = boxerWeightOne + boxerWeightTwo;
        var weightDifferenceBoxer = boxerWeightTwo - boxerWeightOne;
        System.out.println("Общий вес двух боксеров " + allWeightBoxer + " кг.");
        System.out.println("Разница между весами боксеров составляет " + weightDifferenceBoxer + " кг.");

        // Задача 7
        var weightDifferenceBoxers = boxerWeightTwo - boxerWeightOne;
        System.out.println(weightDifferenceBoxers + " кг.");
        var weightBoxerDifference = boxerWeightTwo % boxerWeightOne;
        System.out.println(weightBoxerDifference + " кг.");

        // Задача 8
        var hours = 640;
        System.out.println(hours + " часов поделено между сотрудниками.");
        var hoursOneWorker = 8;
        System.out.println("Каждый сотрудник работает по " + hoursOneWorker + " часов.");
        var workerInCompany = hours / hoursOneWorker;
        System.out.println("Всего работников в компании - " + workerInCompany + " человек.");

        workerInCompany = workerInCompany + 94;
        hours = workerInCompany * hoursOneWorker;
        System.out.println("Если в компании работает " + workerInCompany + " человекa, то всего " + hours + " часов работы может быть поделено между сотрудниками.");



        // Старая домашка
        // Задача 1
       byte a = 1;
       short b = 555;
       int c = 8;
       long d = 12345L;
       float e = 3.5f;
       double f = 8.777777777777777;

       char h = 63;
       System.out.println(h);

       int myAge = 34;
       boolean retire = myAge <= 60;
       System.out.println(retire);

       // Задача 2
       float boxerWeight1 = 78.2f;
       float boxerWeight2 = 82.7f;
       float allWeight = boxerWeight1 + boxerWeight2;
       float weightDifference = boxerWeight2 - boxerWeight1;
       System.out.println("Общий вес двух бойцов " + allWeight + " кг.");
       System.out.println("Разница между весами бойцов " + weightDifference + " кг.");

       // Задача 3
       int bananaWeight = 80;
       int milkWeight = 105;
       int iceCreamWeight = 100;
       int eggsWeight = 70;
       int breakfastWeightInGrams = (bananaWeight * 5) + (milkWeight * 2) + (iceCreamWeight * 2) + (eggsWeight * 4);
       System.out.println("Вес завтрака составляет " + breakfastWeightInGrams + " г.");
       int oneKg = 1000;
       float breakfastWeightInKg = breakfastWeightInGrams / (float)oneKg;
       System.out.println("Вес завтрака составляет " + breakfastWeightInKg + " кг.");

       // Задача 4
       int loseWeightKg = 7;
       int loseWeightGr = loseWeightKg * oneKg;
       int dietOne = 250;
       int dietTwo = 500;
       int daysDietOne = loseWeightGr / dietOne;
       int daysDietTwo = loseWeightGr / dietTwo;
       System.out.println(daysDietOne + " дней уйдет на похудение, если худеть на 250 гр. в день.");
       System.out.println(daysDietTwo + " дней уйдет на похудение, если худеть на 500 гр. в день.");
       dietOne = 1;
       dietTwo = 1;
       int allDiet = dietOne + dietTwo;
       int averageDays = (daysDietOne + daysDietTwo) / allDiet;
       System.out.println("Среднее количество дней для достижения результата - " + averageDays + ".");

       // Задача 5
        int salaryMasha = 67760;
        int salaryDenis = 83690;
        int salaryKristina = 76230;
        int newSalaryMasha = (salaryMasha * 10 / 100) + salaryMasha;
        int newSalaryDenis = (salaryDenis * 10 / 100) + salaryDenis;
        int newSalaryKristina = (salaryKristina * 10 / 100) + salaryKristina;
        System.out.println("Доход у Маши будет " + newSalaryMasha + " руб.," + " у Дениса " + newSalaryDenis + " руб.," + " у Кристины " + newSalaryKristina + " руб.");
        int allSalaryMasha = salaryMasha * 12;
        int allSalaryDenis = salaryDenis * 12;
        int allSalaryKristina = salaryKristina * 12;
        System.out.println("Годовой доход Маши " + allSalaryMasha + " руб.," + " Дениса " + allSalaryDenis + " руб.," + " Кристины " + allSalaryKristina + " руб.");
        int newAllSalaryMasha = newSalaryMasha * 12;
        int newAllSalaryDenis = newSalaryDenis * 12;
        int newAllSalaryKristina = newSalaryKristina * 12;
        System.out.println("Годовой доход вырос у Маши на " + newAllSalaryMasha + " руб.," + "у Дениса на " + newAllSalaryDenis + " руб.," + " у Кристины на " + newAllSalaryKristina + " руб.");
        int differenceSalaryMasha = newAllSalaryMasha - allSalaryMasha;
        int differenceSalaryDenis = newAllSalaryDenis - allSalaryDenis;
        int differenceSalaryKristina = newAllSalaryKristina - allSalaryKristina;
        System.out.println("Разница между годовыми доходами составляет: Маша - " + differenceSalaryMasha + " руб.," + " Денис - " + differenceSalaryDenis + " руб.," + " Кристина - " + differenceSalaryKristina + " руб.");













    }
}