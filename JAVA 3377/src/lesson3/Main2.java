package lesson3;

//* Имеется алфавит {"к","л","м","н"}
//* Задача составить все возможние комбинации 4х-символьных
//*  слов в алфавитном порядке из данных букв
//* Задача найти на какой позиции (по счёту) будет слово "ммлн"
//* Пример вывода:
//*  1) кккк
//*  2) кккл
//*  3) кккм
//*  4) кккм
//*  5) лккк
public class Main2 {
    public static void main(String[] args) {
        String[] letters = {"к","л","м","н"};
        int count = 1;
        int searchNum = 0;
        for (int i = 0; i < letters.length; i++) {
            for (int j = 0; j < letters.length; j++) {
                for (int k = 0; k < letters.length; k++) {
                    for (int l = 0; l < letters.length; l++) {
                        String word = letters[i]+letters[j]+letters[k]+letters[l];
                        if (word.equals("ммлн"))searchNum =count;

                        System.out.println((count++)+ ")"+word);

                    }
                    System.out.println("Искомое слово ммнл найдено на позиции:" +searchNum);
                }

                        //void -ничего не отдаст
                        // int - например вохвращает числа  
            }


        }

    }
}
