package JavaInter30_09;

import java.util.ArrayList;
import java.util.Scanner;

public class FIZZBUZZ_Ex {
    public static void main(String[] args) {


        ArrayList<Integer> digits = new ArrayList<>();
        int input;
        System.out.println("Please Enter Your Number");
        input = new Scanner(System.in).nextInt();

        //String num;


        String output = "";


        while (input > 0) {
            System.out.println(input % 10);
            digits.add(input % 10);
            input /= 10;
        }

        if (digits.contains(3)) {
            output += "Fizz";

        }


        if (digits.contains(5)) {
            output += "Buzz";


        }


        System.out.println(output);

    }


}

