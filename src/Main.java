public class Main {
    public static void main(String[] args) {
        System.out.println("\nЗадание 1");
        int age = 25;
        if (age < 18) {
            System.out.println("Если возраст человека равен " + age + ", то он не достиг " +
                    "совершеннолетия, нужно немного подождать.");
        } else {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний.");
        }

        System.out.println("\nЗадание 2");
        double airTemperature = 25;
        if (airTemperature < 5) {
            System.out.printf("На улице %s градусов, нужно надеть шапку", airTemperature);
        } else {
            System.out.printf("На улице %s градусов, можно идти без шапки.\n", airTemperature);
        }

        System.out.println("\nЗадание 3");
        int speed = 50;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + " км/ч, то штраф");
        } else {
            System.out.println("Если скорость " + speed + ", можно ездить спокойно.");
        }

        System.out.println("\nЗадание 4");
        int personAge = 35;
        if (personAge > 2 && personAge <= 6) {
            System.out.println("Если возраст человека равен " + personAge + ", то ему нужно ходить в детский сад.");
        } else if (personAge > 7 && personAge <= 17) {
            System.out.println("Если возраст человека равен " + personAge + ", то ему нужно ходить в школу.");
        } else if (personAge > 18 && personAge <= 24) {
            System.out.println("Если возраст человека равен " + personAge + ", то его место в университете.");
        } else if (personAge > 24) {
            System.out.println("Если возраст человека равен " + personAge + ", то ему пора ходить на работу.");
        }

        System.out.println("\nЗадание 5");
        int childAge = 9;
        if (childAge < 5) {
            System.out.printf("Если возраст ребенка равен %s, то он не может кататься на аттракционе.", childAge);
        } else if (childAge >= 5 && childAge < 14) {
            System.out.printf("Если возраст ребенка равен %s, то он может кататься только в сопровождении взрослого. " +
                    "Если взрослого нет, то кататься нельзя.\n", childAge);
        } else if (childAge >= 14) {
            System.out.printf("Если возраст ребенка равен %s, то он может кататься без сопровождения взрослого.", childAge);
        }

        System.out.println("\nЗадание 6");
        int peopleAmount = 65;
        int seatingPlace = 60;
        int totalSeats = 102;
        if (peopleAmount < seatingPlace) {
            System.out.println("Сидячие места в вагоне есть.");
        } else if (peopleAmount >= seatingPlace && peopleAmount < totalSeats) {
            System.out.println("В вагоне есть только стоячие места.");
        } else {
            System.out.println("В вагоне мест нет.");
        }

        System.out.println("\nЗадание 7");
        int one = 70;
        int two = 50;
        int three = 50;
        if (one < two && two > three) {
            System.out.println("two-самое большое число.");
        } else if (one < two && two < three) {
            System.out.println("three-самое большое число.");
        } else if (one > two && two < three) {
            System.out.println("one-самое большое число.");
        } else if (one == two && two == three) {
            System.out.println("все числа равны.");
        } else if (one == two && two < three) {
            System.out.println("three-самое большое число.");
        } else if (one == three && two > three) {
            System.out.println("two-самое большое число.");
        } else if (two == three && one > three) {
            System.out.println("one-самое большое число.");
        }

    }
}
