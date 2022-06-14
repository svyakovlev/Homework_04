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

        //Задание №4
        for (int z = 1; z <= 30; z++) {
            int z3 = z % 3;
            int z5 = z % 5;
            if (z3 == 0 && z5 == 0) {
                System.out.println(z + ": ping pong");
            } else if (z3 == 0) {
                System.out.println(z + ": ping");
            } else if (z5 == 0) {
                System.out.println(z + ": pong");
            } else
            System.out.println(z + ":");
        }

    }
}