package Bridgelabz.com;

import Bridgelabz.com.GameOne;
import Bridgelabz.com.GameThree;
import Bridgelabz.com.GameTwo;

public class Main {

    public static void main(String[] args) {
        System.out.println();
       GameOne gameOne = new GameOne();
       GameTwo gameTwo = new GameTwo();
       GameThree gameThree = new GameThree();

       Runner runner = new Runner(gameTwo);
       runner.run();


    }

}