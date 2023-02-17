package Lesson2;

public class lisson1 {
    public static void main(String[] args) {

        int money =1000;
        int snikers = 1000/35;
        int balnce = money%35;
        double  candy =(int) (balnce/3.5);
        double change = balnce-(candy*3.5);
        System.out.println("Сдача: "+change);
        System.out.println("Сникерсы: "+snikers);
        System.out.println("Конфеты: "+candy);


        ;

//        int roomX = 40;
//        int roomY = 20;
//        int tableA = 4;
//        int tableB = 3;
//
//        int roomSquare = roomX*roomY;
//        int tableSqure = tableA*tableB;
//        int result = roomSquare/tableSqure;
//        System.out.println(result);

//        char num = 84;
//        int a = 32;
//        int b = 9;
//        int c = 23;
//        int p = a+b+c;
//        System.out.println(Math.sqrt(p));//корень квадратный
//        System.out.println(num);
//        System.out.println("Привет Катюша!");
    }
}
