package com.company;

public class Main {
    //на входе дано целое число
    //если число заканчивается на 4, то оно возвращается в противном случае-null


    public static void main(String[] args) {
        System.out.println(endWith4(104));

    }

    public static int endWith4(int number) {
        if (number % 10 == 4) {
            return number;

        } else {
            return 0;
        }

    }
}



