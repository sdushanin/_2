/**
 * Разработано 18.08.2018
 * Выбор работы с калькулятором или с массивом
 * @author Stas
 * @version
 */


import java.util.Scanner;


public class Base {
    public static void main(String[] args) {
        Scanner razmer = new Scanner(System.in);
        System.out.println("Выберети действие: 1 -использовать калькулятор");
        System.out.println("Выберите дейстивие 2-использовать массив");
        //Вводим число, которое определяет выбранную операцию
        int vibor1 = razmer.nextInt();
        if (vibor1 == 1) {
            System.out.println("Работа с калькулятором");
            {//Выводим на экран возможные действия
                System.out.println("Что хотим?: 1 - Сложить, 2 - Вычесть, 3 - Умножить, 4 - Разделить");
                //Добавляем новую переменную choose.
                int choose = razmer.nextInt();
                //Делаем првоерку, через if если было введено число, которое не имеет никакой операции, например 5.
                //Выводим сообщение об ошибке.
                if(choose>4){

                    System.out.println("Ошибка б..я!!!");
                }
                //Если выбрано число, которое отвечает за действие, то работаем с калькулятором
                else {

                    System.out.println("введи первое число ");
                    /** Водим первое число */
                    double i = razmer.nextDouble();
                    // Водим второе число
                    System.out.println("введи второе число");
                    double b = razmer.nextDouble();
                    /** Делаем выбор, в зависимости от введенных пользователем чисел: 1 - Сумма, 2 - Вычитание, 3 - Умножение, 4 - Деление.*/
                    switch (choose) {
                        case 1:
                            double d = i + b;
                            // Округляем переменную d до 4х знаков после запятой
                            System.out.printf("получилось = %.4f", d);
                            break;
                        case 2:
                            double d1 = i - b;
                            // Округляем переменную d до 4х знаков после запятой
                            System.out.printf("получилось = %.4f", d1);
                            break;
                        case 3:
                            // Задаем еще одну переменную d2
                            double d2 = i * b;
                            // Округляем переменную d2 до 4х знаков после запятой
                            System.out.printf("получилось = %.4f", d2);
                            break;
                        case 4:
                            // Задаем еще одну переменную d3
                            double d3 = i / b;
                            // Округляем переменную d до 4х знаков после запятой
                            System.out.printf("получилось = %.4f", d3);
                            break;

                    }
                }
            }
            razmer.close();
        }
        /**Если было выбрано 2, то начинаем работу с массивом*/
        else if (vibor1 == 2) {
            System.out.println("Была выбрана работа с массивом ");
            System.out.println("какое количество элементов массиве?:");
            //Вводим количество элементов в массиве
            int razmer1 = razmer.nextInt();
            String[] MyMassiv = new String[razmer1];
            //Заполняем массив
            for (int i = 0; i < razmer1; i++) {
                System.out.println("Введите " + (i + 1) + " элемент массива:");
                String slovo1 = razmer.next();
                MyMassiv[i] = slovo1;
            }
            //Выводим все элементы массива в консоль
            System.out.print(" Введенный массив: ");
            for (int i = 0; i < razmer1; i++) {
                System.out.print(" " + MyMassiv[i] + " ");
            }
            //Используем перенос на новую строку, просто для лучшей наглядности при выводе на экран
            System.out.println("");
            //Поиск самого длинного слова
            String MaxA = MyMassiv[0];
            int max = MaxA.length();
            for (int i = 1; i < MyMassiv.length; i++) {
                if (max < MyMassiv[i].length()) {
                    max = MyMassiv[i].length();
                    MaxA=MyMassiv[i];
                }
            }
            System.out.println("Самое длинное слово в массиве: "+MaxA);
                }
            }
        }

