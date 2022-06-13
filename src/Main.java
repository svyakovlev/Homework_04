public class Main {
    public static void main(String[] args) {
        //Задание №1
        int i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
        for (i = 10; i >= 1; i = i - 1) {
            System.out.print(i + " ");
        }

        //Задание №2
        int friday = 4;
        int day = 1;
        while (day <= 31) {
        System.out.println("Сегодня пятница, " + day + " число. Необходимо подготовить отчет.");
        day += 7;
        }

        //Задание №3
        int year = 2022;
        int yearBefore = year - 200;
        int yearComet = 0;
        do {
            if (yearComet >= yearBefore && yearComet <= year) {
                System.out.println(yearComet);
            }
            yearComet += 79;
        } while (yearComet <= year);
        System.out.println(yearComet);

    }
}