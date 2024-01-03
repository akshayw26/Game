package Bridgelabz.com;

import Bridgelabz.com.Game;

public class GameTwo implements Game {

    @Override
    public void upArrow() {
        System.out.println("Up Arrow");
    }

    @Override
    public void downArrow() {
        System.out.println("Down Arrow");
    }

    @Override
    public void leftSideArrow() {
        System.out.println("Left Side Arrow");
    }

    @Override
    public void RightSideArrow() {
        System.out.println("Right Side Arrow");
    }
}
