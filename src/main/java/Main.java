package org.example;

import java.util.Scanner;


class Racing {
    static String leader = " "; // Лидер
    static int dist = 0; // Дист.

    //Метод для определения лидера
    void searchLead(String nameAuto, int speedAuto) {
        if (dist < (24 * speedAuto)) {
            dist = 24 * speedAuto;
            leader = nameAuto;
        }
    }

    //Метод вывода текущего лидера
    void Printlead() {
        System.out.println("Самая быстраяя машина: " + leader);
    }
}

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Racing rec = new Racing();

        for (int i = 1; i <= 3; i++) {
            System.out.println("Введите название машины №" + i + ":");
            String name = scanner.next();
            int speed = 0;
            while (true) {
                System.out.println("Введите скорость машины №" + i + ":");
                speed = scanner.nextInt();
                if (speed >= 0 && speed <= 250) {
                    break;
                } else {
                    System.out.println("Некорректная скорость. Повторите ввод.");
                }
            }
            // конец проверки условий и ввода данных
            rec.searchLead(name, speed);
        }
        rec.Printlead();
        scanner.close();
    }
}
