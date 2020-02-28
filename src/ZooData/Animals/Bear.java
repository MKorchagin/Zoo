package ZooData.Animals;

import ZooData.Utilits.*;

public class Bear {
    int random;
    private String bearStroke;
    private String bearFeed;
    private String bearGame;


    public Bear(int random) {
        this.random = random;
    }

    public Bear(int random, String bearStroke) {
        this.random = random;
        this.bearStroke = bearStroke;

        if (random > 0) {bearStroke = UIUtils.outputData("When you approach the bear, he bends  and exposes the crown for stroking.");
        } else bearStroke = UIUtils.outputData("You look at the bear and understand that you don’t really want to stroke it.");
    }

    public Bear(int random, String bearStroke, String bearFeed) {
        this.random = random;
        this.bearStroke = bearStroke;
        this.bearFeed = bearFeed;

        if (random > 0) {
            bearStroke = UIUtils.outputData("The bear eats the meat you gave him. Seems that it tasty");
        } else
            bearStroke = UIUtils.outputData("The bear looks at you, wondering about eating you.");
    }

    public Bear(int random, String bearStroke, String bearFeed, String bearGame) {
        this.random = random;
        this.bearStroke = bearStroke;
        this.bearFeed = bearFeed;
        this.bearGame = bearGame;

        if (random == 0) {
            bearGame = UIUtils.outputData("The bear attacks you. You should fight. Good luck!");
        } else if (random == 1) {
            bearGame = UIUtils.outputData("Suddenly you start to dance with the bear.");
        } else UIUtils.outputData("You look at the bear and don't understand what you can play with a wild animal.");
    }
}