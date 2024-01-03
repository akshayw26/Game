package Bridgelabz.com;

public class Runner {

        private final Game game;

        public Runner(Game game) {
            this.game = game;
        }

        public void run() {

            game.upArrow();
            game.downArrow();
            game.leftSideArrow();
            game.RightSideArrow();

        }
    }


