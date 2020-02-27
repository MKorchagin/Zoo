package ZooData.Animals;

import ZooData.Utils.UIUtils;

public class Bear {
    int random;
    private String bearStroke;


    public Bear(int random) {
        this.random = random;
    }

    public Bear(int random, String bearStroke) {
        this.random = random;
        this.bearStroke = bearStroke;

        if (random > 0) {bearStroke = UIUtils.outputData("When you approach the bear, he bends  and exposes the crown for stroking.");
        } else bearStroke = UIUtils.outputData("You look at the bear and understand that you don’t really want to stroke it.");
    }

    public int getRandom() {return random;}

    public String getBearStroke() {return bearStroke;}
}