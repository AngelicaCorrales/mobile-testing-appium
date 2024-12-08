package utils;

import java.util.Random;

public class RandomNumber {

    public static int getRandomNumber(int bound){
        Random rand = new Random();
        return rand.nextInt(bound)+1;
    }
}
