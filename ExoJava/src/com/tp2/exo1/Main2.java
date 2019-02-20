package com.tp2.exo1;

public class Main2 {
    public static void main(String[] args) {
        // Init && print
        De de1 = new De(1, 6);
        De de2 = new De(1, 6);

        System.out.println("Rolling dices \nDice 1 = " + de1.getvalue() + " Dice 2 = " + de2.getvalue());
        if (de1.getvalue() == de2.getvalue())
            System.out.println("You Win");
        else
            System.out.println("You lost");


        for (int i = 0; i < Integer.parseInt(args[0]); i++) {
            de1.throwMe();
            de2.throwMe();
            System.out.println("Rolling dices \nDice 1 = " + de1.getvalue() + " Dice 2 = " + de2.getvalue());
            if (de1.getvalue() == de2.getvalue())
                System.out.println("You Win");
            else
                System.out.println("You lost");
        }
    }
}
