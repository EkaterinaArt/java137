package Lesson2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число");
        String strNum = sc.nextLine();
        float num =Float.parseFloat(strNum);
        System.out.println("Введите оператор (м)-мегабайт, к -килобайт");
        String operator = sc.nextLine();
        if(operator.equals("m")){
            System.out.println(num + " в мегабайтах" + (num/1024));

        } else if (operator.equals("k")) {
            System.out.println(num + " в килобайт" + (num*1024));

        }else {
            System.out.println("Неверный оператор");
        }

    }
       // String login = sc.nextLine();
       // System.out.println("Введите пароль");
       // String pass =sc.nextLine();
       // if(login.equals("admin")&& pass.equals("1234")){

              // System.out.println("Доступ разрешен");

       // }else {
        //    System.out.println("Доступ запрещен");
        //}

   // }
}
