package ZooData.Animals;

import ZooData.Utilits.*;

public class Cat {
    int random;
    private String catStroke;
    private String catFeed;
    private String catGame;


    public Cat(int random) {
        this.random = random;
    }

    public Cat(int random, String catStroke) {
        this.random = random;
        this.catStroke = catStroke;

        if (random > 0) {
            catStroke = UIUtils.outputData("Your cat purrs under your hand.");
        } else
            catStroke = UIUtils.outputData("Your cat doesn't want to be stroked. The cat looking at you perplexedly.");
    }

    public Cat(int random, String catStroke, String catFeed) {
        this.random = random;
        this.catStroke = catStroke;
        this.catFeed = catFeed;

        if (random > 0) {
            catFeed = UIUtils.outputData("The cat looks at you with big eyes and ignores the food in its bowl.");
        } else
            catStroke = UIUtils.outputData("The cat rushes to its bowl and devours everything inside, including cabbage");
    }

    public Cat(int random, String catStroke, String catFeed, String catGame) {
        this.random = random;
        this.catStroke = catStroke;
        this.catFeed = catFeed;
        this.catGame = catGame;

        if (random == 0) {
            catGame = UIUtils.outputData("The cat sits in a box and watches your actions.");
        } else if (random == 1) {
            catStroke = UIUtils.outputData("A cat rushes around the flat behind laser pointer, sometimes distracting on a feather");
        } else UIUtils.outputData("The cat learns to fly from the curtains to the chandelier and back.");
    }
}