package org.example;

import java.util.Scanner;


class Racing {
    String leader; // Лидер
    int dist; // Дист.
    final int time = 24;

    Racing (String leader, int dist)
    {
        this.leader = leader;
        this.dist = dist;
    }

    //Метод для определения лидера
    void searchLead(String nameAuto, int speedAuto) {
        if (dist < (time * speedAuto)) {
            dist = time * speedAuto;
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

        Racing rec = new Racing("",0);


        for (int i = 1; i <= 3; i++) {

            System.out.println("Введите название машины №" + i + ":");
            String name = scanner.next();
            int speed;

            while (true) {
                System.out.println("Введите скорость машины №" + i + ":");
                if (scanner.hasNextInt()){
                    speed = scanner.nextInt();
                    scanner.nextLine();
                    if (speed >= 0 && speed <= 250  ) {
                        break;
                    } else {
                        System.out.println("Некорректная скорость. Повторите ввод.");
                    }
                }
                else {
                    System.out.println("Некорректная скорость. Повторите ввод.");
                    scanner.nextLine();
                }
            }
            // конец проверки условий и ввода данных
            rec.searchLead(name, speed);
        }
        rec.Printlead();
        scanner.close();
    }
}
