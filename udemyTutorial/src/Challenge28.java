/**
 * Overloading_Method
 *
 */

//@SuppressWarnings("ALL")
public class Challenge28 {
    public void lesson() {
        int newScore =calculateScore("Tim", 500);
        System.out.println("New score is " + newScore);
        calculateScore(75);
        calculateScore();
        calcFeetAndInchesToCentimetrs(7, 5);
    }

    private int calculateScore(String Player, int score) {
        System.out.println("Player " + Player + " scored-->" + score + " points");
        return score * 1000;
    }
    private int calculateScore(int score) {
        System.out.println("Unnamed player scored-->" + score + " points");
        return score * 1000;
    }

    private int calculateScore() {
        System.out.println("no player name and no scored");
        return 0;
    }

    private double calcFeetAndInchesToCentimetrs(int feet, int inches) {
        if (feet >= 0 && (inches>=0 && inches<12)) {
            System.out.println("FEEts(" + feet + ") + Inches("+ inches + ") =CM(" + ((feet * 12 + inches) * 2.54) + ")");
           return  ((feet * 12 + inches) * 2.54);
        }
        else return -1;
    }

    private double calcFeetAndInchesToCentimetrs(int inches) {
        if (inches >= 0){
           int feet = inches / 12;
           inches=inches % 12;
          return calcFeetAndInchesToCentimetrs(feet, inches);
        }
        else return -1;
    }





}
