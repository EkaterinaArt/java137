package Lesson2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("������� �����");
        String strNum = sc.nextLine();
        float num =Float.parseFloat(strNum);
        System.out.println("������� �������� (�)-��������, � -��������");
        String operator = sc.nextLine();
        if(operator.equals("m")){
            System.out.println(num + " � ����������" + (num/1024));

        } else if (operator.equals("k")) {
            System.out.println(num + " � ��������" + (num*1024));

        }else {
            System.out.println("�������� ��������");
        }

    }
       // String login = sc.nextLine();
       // System.out.println("������� ������");
       // String pass =sc.nextLine();
       // if(login.equals("admin")&& pass.equals("1234")){

              // System.out.println("������ ��������");

       // }else {
        //    System.out.println("������ ��������");
        //}

   // }
}
