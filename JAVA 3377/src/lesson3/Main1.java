package lesson3;

public class Main1 {
    public static void main(String[] args) {

        // Таблица умножения
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j <10; j++) {
                String spase;
                if ((i * j)>9){
                    spase=" ";
                }else{
                    spase="  ";
                }
                System.out.print(j+ "*" +i+"=" + (j*i)+spase);

            }
            System.out.println("");
        }
    }
}
