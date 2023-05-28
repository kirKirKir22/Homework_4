public class Main{
    public static void main(String[] args){

        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();

    }

    private static void task7() {
        System.out.println("Задача 7");

        int one = 13 ;
        int two = 25 ;
        int three = 9 ;

        if (one>two){
            if (one>=three){
                System.out.println("Самое большое число " +one);
            }else{
                System.out.println("Самое большое число " +three);
            }
        }else if (two>one)
            if (two>=three){
                System.out.println("Самое большое число " +two);
            }else{
                System.out.println("Самое большое число " +three);
        }else{
            if (one>three){
                System.out.println("Самое большое число " +one);
            }else if (three>one){
                System.out.println("Самое большое число " +three);
            } else {
                System.out.println("Все три числа одинаковые");
            }

            }
    }

    private static void task6() {
        System.out.println("Задача 6");

        int capacity = 102;
        int seatPlace = 60;
        int otherPlace = capacity-seatPlace;

        int occupiedSeatingPositions = 50;
        int otherOccupiedPlaces = 42;

        if (occupiedSeatingPositions < seatPlace){
            System.out.println("Осталось ещё " + (seatPlace - occupiedSeatingPositions) + " сидячих мест");
        } else {
            System.out.println("Сидячих мест нет");
        }
        if (otherOccupiedPlaces < otherPlace){
            System.out.println("Осталось ещё " + (otherPlace - otherOccupiedPlaces) + " других мест");
        } else {
            System.out.println("Других мест нет");
        }
    }

    private static void task5() {
        System.out.println("Задача 5");

        int age = 10;

        if (age < 5){
            System.out.println("Если возраст ребенка равен " + age + " , то ему нельзя кататься на аттракционе");
        } else if (age < 14){
            System.out.println("Если возраст ребенка равен " + age + " , то ему можно кататься на аттракционе в сопровождении взрослого");
        }else if (age > 14){
            System.out.println("Если возраст ребенка равен " + age + " , то ему можно кататься на аттракционе без взрослого");
        }
    }

    private static void task4() {
        System.out.println("Задача 4");

        int age = 24;

        if (age < 2){
            System.out.println("Если возраст человека равен " + age + " то ему пора спать");

        } else if (age >= 2 && age <= 6){
         System.out.println("Если возраст человека равен " + age + " то ему нужно идти в детский сад");

        } else if (age >= 7 && age < 18){
            System.out.println("Если возраст человека равен " + age + " то ему нужно идти в школу");

        } else if (age >= 18 && age < 24){
            System.out.println("Если возраст человека равен " + age + " то его место в университете");

        } else if (age >= 24 && age < 60){
            System.out.println("Если возраст человека равен " + age + " то то ему пора ходить на работу");

        } else if (age > 60){
            System.out.println("Если возраст человека равен " + age + " то ему можно отдохнуть");
        }
    }

    private static void task3() {
        System.out.println("Задача 3");

        int speed = 75;
        if (speed > 60){
            System.out.println("Придётся запалатить штраф");
        }
        if (speed <= 60){
            System.out.println("Можно ездить спокойно");
        }
    }

    private static void task2() {
        System.out.println("Задача 2");

        int temperature = 7;
        if (temperature > 5){
            System.out.println("На улице тепле 5 градусов, шапку надевать не надо");
        }
        if (temperature < 5){
            System.out.println("На улице холоднее 5 градусов, шапку надевать надо");
        }
    }

    private static void task1() {
        System.out.println("Задача 1");

        int age = 17;
        if(age >= 18){
            System.out.println("Если возраст 19, то человек совершеннолетний");
        }
        if (age < 18){
            System.out.println("Если возраст 17 лет, то человек не совершеннолетний");
        }
    }
}


