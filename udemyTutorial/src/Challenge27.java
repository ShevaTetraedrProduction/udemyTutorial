public class Challenge27 {

    public  void lesson() {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int highScore = calculateScore(gameOver, score, 5, 100);
        displayHighScorePosition("Player1", highScore);


        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        displayHighScorePosition("Player2", highScore);


        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Tim", highScorePosition);

        highScorePosition = calculateHighScorePosition(900);
        displayHighScorePosition("BoB", highScorePosition);

        highScorePosition = calculateHighScorePosition(400);
        displayHighScorePosition("Fill", highScorePosition);

        highScorePosition = calculateHighScorePosition(50);
        displayHighScorePosition("Fred", highScorePosition);
    }


    private  int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            return finalScore;
        }
        return -1;
    }

    private  int calculateHighScorePosition(int score) {
        if (score >= 1000) return 1;
        else if (score >= 500 && score < 1000) return 2;
        else if (score >= 100 && score < 500) return 3;
        else return 4;
    }

    private void displayHighScorePosition(String namePlayer, int highScorePosition) {
        System.out.println(namePlayer + " managed to get into position "
                + highScorePosition + " on the high score table");
    }
}
