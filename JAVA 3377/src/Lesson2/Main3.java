package Lesson2;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
//        int numbers = 43;
//
//        System.out.println(numbers%2 ==0);
///////////////////////////////////////////////////////
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();

        int b = a/10;
        int c = a %10;
        if (b>c){
            System.out.println(true);
        }else {
            System.out.println(false);
        }
 /////////////////////////////////////////////////////
//        System.out.println("Введите первую сторону треугольника");
//        int a = scanner.nextInt();
//        System.out.println("Введите вторую сторону треугольника");
//        int b = scanner.nextInt();
//        System.out.println("Введите третью8 сторону треугольника");
//        int c = scanner.nextInt();
//        if(a==b && b==c){
//            System.out.println("Равносторонний");
//        } else if (a==b||b==c||a==c) {
//            System.out.println("Равнобедренный");
//
//        }else {
//            System.out.println("Разносторонний");
//        }

    }

}
