import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner saner = new Scanner(System.in);
        System.out.println("Введите положительное трехзначное число: ");
       int number = saner.nextInt();
       String stringNum = Integer.toString(number);
        System.out.println(stringNum.charAt(0)+" "+stringNum.charAt(1)+" "+stringNum.charAt(2));

      /* int hunred = number /100;
       int dec = number%100/10;
       int one = number%100%10;

    System.out.println(hunred+ " "+dec+" "+one);*/


        /*
        Кинетическая энергия тела M=V
         */
    float m =2;
    float v =4;
    float result =( m*(v*v))/2;

        System.out.println(result);
       /* char name = 84;
        System.out.println("Hello   " + name);

*/
       /* String name = "Ivan";
        System.out.println("Hello  " +name);*/

        /*float a = 32;
        float b = 88;

        System.out.println((a+b)*2);
        System.out.println(a*b);
        System.out.println(b/a);
        System.out.println(a<=b);
        System.out.println(a>b);
        System.out.println(a<b);
        System.out.println(a/b);*/

    }

}
