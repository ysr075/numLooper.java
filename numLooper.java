package com.company;

import java.util.Scanner;

class pos {
    public static void StaticMethod() {
        Scanner input = new Scanner(System.in);
        double pos_num;
        System.out.print("\npos num: ");
        pos_num = input.nextDouble();
        while(true) {
            System.out.print("\n" + pos_num++ + "\n");
        }
    }
}

class neg {
    public static void StaticMethod() {
        Scanner input = new Scanner(System.in);
        double neg_num;
        System.out.print("\nneg num: ");
        neg_num = input.nextDouble();
        while(true) {
            System.out.print("\n" + neg_num-- + "\n");
        }
    }
}

public class built {
    public static void main(String []args) {
        Scanner input = new Scanner(System.in);
        String question;
        do {
            System.out.print("\npos or neg: ");
            question = input.nextLine();
            if (question.equals("pos")) {
                pos.StaticMethod();
            } else if (question.equals("neg")) {
                neg.StaticMethod();
            } else {
                System.exit(1);
            }
        } while(question.equals(true));
    }
}
