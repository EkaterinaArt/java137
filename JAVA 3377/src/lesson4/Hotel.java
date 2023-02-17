package lesson4;

import java.util.Scanner;

public class Hotel {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String commands;
        int[] room = {11, 12, 13, 14, 15, 16, 17};
        int[] reserve = {12, 17, 15};
        while (true) {
            System.out.println("ВВедите команду");
            commands = scanner.nextLine();
            if (commands.equals("getFreeRoom")) {
                for (int i = 0; i < room.length; i++) {
                    boolean switcher = true;
                    for (int j = 0; j < reserve.length; j++) {
                        if (room[i] == reserve[j]) switcher = false;

                    }
                    if (switcher)
                        System.out.println(room[i] + " ");
                }

            } else {
                System.out.println(" Не известная команда ");

            }
        }
    }
}