package com.company;

public class Main {

    public static void main(String[] args) {
        int die1, die2;
        int countRoll;
        int limitRoll;
        int snakeEyeCount;
        countRoll = 0;
        limitRoll = 1000; //This is if you want to set a dice roll limiter and calculate averages based on that
        snakeEyeCount = 0;



        do {
            die1 = (int)(Math.random()*6) + 1;   // roll the dice
            die2 = (int)(Math.random()*6) + 1;
            countRoll++;
            if (die1 == 1 && die2 ==1) { //looking for SnakeEyes and providing a counter
                snakeEyeCount++;
                //System.out.print("It took " + countRoll + " rolls to get " + snakeEyeCount + " snake eyes.");
            }
        } while (countRoll<limitRoll);

        System.out.print("It took " + countRoll + " rolls to get " + snakeEyeCount + " snake eyes. That averages " + (countRoll/snakeEyeCount) + " rolls to get snake eyes.");


    }
}
