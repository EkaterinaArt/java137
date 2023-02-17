package Lesson2;

public class Cycles {
    public static void main(String[] args) {

//        for (int i = 10; i> 0; i--) {
//
//            System.out.println(i);}
//
//            for (int j =41; j <=60 ; j++) {
//                if(j%2==0)
//                System.out.println(j);

        //           }
        ////////////////////////////////////////////////
//        int sum = 0;
//
//        for (int i = 40; i <=60; i++) {
//
//            sum = i+sum;
//
//        }
//
//        System.out.println(sum);
/////////////////////////////////////////////
        //вывести на консоль от 100 до 400, которые деляться на 3 и 5
//        for (int i = 100; i <=400; i++) {
//            if(i%3==0 && i%5==0){
//                System.out.println(i);
//            }
//
//        }
        int k = 0;
        String star = "*";
        for (int i = 0; i <= 10; i++) {
            String spase = " ";
            for (int j = 9; j > k; j--) {
                spase = spase + " ";
            }
            if (i % 2 != 0) {
                k++;
                System.out.println(spase + star);

            }
            star = star + "*";
        }

    }
}
