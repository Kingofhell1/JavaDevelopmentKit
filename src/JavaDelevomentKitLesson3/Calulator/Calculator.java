package JavaDelevomentKitLesson3.Calulator;

import java.util.Scanner;

public class Calculator {
    // метод сложения
    public static <T extends Number> T sum(T num1, T num2){
        //Проверяем, действительно ли это тот тип объекта класса INteger
        if(num1 instanceof Integer){
            return (T) Integer.valueOf(num1.intValue() + num2.intValue());
        } else if (num1 instanceof Double) {
            return (T) Double.valueOf(num1.doubleValue() + num2.doubleValue());
        } else {
            throw new IllegalArgumentException("Неподдерживаемый тип данных");
        }
    }
    // метод вычитания
    public static <T extends Number> T sub(T num1, T num2){
        //Проверяем, действительно ли это тот тип объекта класса INteger
        if (num1 instanceof Integer) {
            return (T) Integer.valueOf(num1.intValue() - num2.intValue());
        } else if (num1 instanceof Double) {
            return (T) Double.valueOf(num1.doubleValue() - num2.doubleValue());
        } else {
            // Выброс ошибки, если данные введены некорректно
            throw new IllegalArgumentException("Неподдерживаемый тип данных");
        }
    }
    // метод умножения
    public static <T extends Number> T mul(T num1, T num2) {
        //Проверяем, действительно ли это тот тип объекта класса INteger
        if (num1 instanceof Integer) {
            return (T) Integer.valueOf(num1.intValue() * num2.intValue());
        } else if (num1 instanceof Double) {
            return (T) Double.valueOf(num1.doubleValue() * num2.doubleValue());
        } else {
            // Выброс ошибки, если данные введены некорректно
            throw new IllegalArgumentException("Неподдерживаемый тип данных");
        }
    }// метод деления
    public static <T extends Number> T div(T num1, T num2) {
        //Проверяем, действительно ли это тот тип объекта класса INteger
        if (num1 instanceof Integer) {
            return (T) Double.valueOf(num1.intValue() / num2.intValue());
        } else if (num1 instanceof Double) {
            return (T) Double.valueOf(num1.doubleValue() / num2.doubleValue());
        } else {
            // Выброс ошибки, если данные введены некорректно
            throw new IllegalArgumentException("Неподдерживаемый тип данных");
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean running = true;
        while (running) {
            System.out.print("Выберите метод, который хотите использовать: ");
            System.out.println(" ");
            System.out.println("1. Сложение");
            System.out.println("2. Вычитание");
            System.out.println("3. Умножение");
            System.out.println("4. Деление");
            int option = scan.nextInt();
            switch (option) {
                case 1:
                    System.out.print("Введите число: ");
                    int num1 = scan.nextInt();
                    System.out.print("Введите число: ");
                    int num2 = scan.nextInt();
                    System.out.println(Calculator.sum(num1, num2));
                    break;
                case 2:
                    System.out.print("Введите число: ");
                    double num3 = scan.nextDouble();
                    System.out.print("Введите число: ");
                    double num4 = scan.nextDouble();
                    System.out.println(sub(num3, num4));
                    break;
                case 3:
                    System.out.print("Введите число: ");
                    double num5 = scan.nextDouble();
                    System.out.print("Введите число: ");
                    double num6 = scan.nextDouble();
                    System.out.println(mul(num5, num6));
                    break;
                case 4:
                    System.out.print("Введите число: ");
                    int num7 = scan.nextInt();
                    System.out.print("Введите число: ");
                    int num8 = scan.nextInt();
                    System.out.println(div(num7, num8));
                    break;
                default:
                    System.out.println("Недопустимая опция.");

            }
        }
    }
}
