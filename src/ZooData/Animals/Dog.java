package ZooData.Animals;

import ZooData.Utils.UIUtils;

public class Dog {
    int random;
    private String dogStroke;


    public Dog(int random) {
        this.random = random;
     }

    public Dog(int random, String dogStroke) {
        this.random = random;
        this.dogStroke = dogStroke;

        if (random > 0) {dogStroke = UIUtils.outputData("Your dog flips onto back, sticks out tongue and wags tail.");
        }else dogStroke = UIUtils.outputData("Your dog dodges and moves away from you.");}


    public int getRandom() {return random;}

    public String getDogStroke() {return dogStroke;}


}
