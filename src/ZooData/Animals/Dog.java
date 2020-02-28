package ZooData.Animals;

import ZooData.Utilits.*;

public class Dog {
    int random;
    private String dogStroke;
    private String dogFeed;
    private String dogGame;


    public Dog(int random) {
        this.random = random;
     }

    public Dog(int random, String dogStroke) {
        this.random = random;
        this.dogStroke = dogStroke;

        if (random > 0) {dogStroke =UIUtils.outputData("Your dog flips onto back, sticks out tongue and wags tail.");
        }else dogStroke = UIUtils.outputData("Your dog dodges and moves away from you.");
    }

    public Dog(int random, String dogStroke, String dogFeed) {
        this.random = random;
        this.dogStroke = dogStroke;
        this.dogFeed = dogFeed;

        if (random > 0) {dogFeed =UIUtils.outputData("Your dog eats everything in a bowl, then settles down on the couch and falls asleep.");
        }else dogStroke = UIUtils.outputData("Your dog ate your sneakers, \n" +
                                             "Then everything in its bowl, \n"+
                                             "Then everything in your plate, \n" +
                                             "And after that sits near the door, asking for a walk.");
    }

    public Dog(int random, String dogStroke, String dogFeed, String dogGame) {
        this.random = random;
        this.dogStroke = dogStroke;
        this.dogFeed = dogFeed;
        this.dogGame = dogGame;

        if (random == 0) {
            dogGame = UIUtils.outputData("Your dog opens eyes. Dog looks at you. Dog continues to sleep.");
        } else if (random == 1) {
            dogGame = UIUtils.outputData("Your dog crawls under your hand for stroking.");
        } else
            UIUtils.outputData("Your dog runs outside for a ball, for a stick, for cats, for other dogs, for cars.\n" +
                    "Or simply run outside.");
    }
}
