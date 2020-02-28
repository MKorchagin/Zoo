package ZooData.Animals;

import ZooData.Utilits.*;


public class Giraffe {
    int random;
    private String giraffeStroke;
    private String giraffeFeed;
    private String giraffeGame;


    public Giraffe(int random) {
        this.random = random;
    }

    public Giraffe(int random, String giraffeStroke) {
        this.random = random;
        this.giraffeStroke = giraffeStroke;

        if (random > 0) {giraffeStroke = UIUtils.outputData("Your giraffe just thoughtfully looking off, chewing leaves.");
        } else giraffeStroke = UIUtils.outputData("You giraffe trying to understand what do you want from it and leans. So, you can stroke it.");
    }

    public Giraffe(int random, String giraffeStroke, String giraffeFeed) {
        this.random = random;
        this.giraffeStroke = giraffeStroke;
        this.giraffeFeed = giraffeFeed;

        if (random > 0) {
            giraffeFeed = UIUtils.outputData("The giraffe just thoughtfully looking off, chewing leaves.");
        } else giraffeFeed = UIUtils.outputData("You giraffe trying to understand what do you want from it and leans.\n"+
                                                "So, you can give it few leaves that are in your hand.");
    }

    public Giraffe(int random, String giraffeStroke, String giraffeFeed, String giraffeGame) {
        this.random = random;
        this.giraffeStroke = giraffeStroke;
        this.giraffeFeed = giraffeFeed;
        this.giraffeGame = giraffeGame;

        if (random == 0) {
            giraffeGame = UIUtils.outputData("The giraffe just thoughtfully looking off, chewing leaves.");
        } else if (random == 1) {
            giraffeGame = UIUtils.outputData("The giraffe doesn't want to play and run away from you.");
        } else UIUtils.outputData("You throw a ball to a giraffe and it starts playing football.");
    }
}