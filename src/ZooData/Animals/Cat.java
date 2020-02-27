package ZooData.Animals;

import ZooData.Utils.UIUtils;

public class Cat {
    int random;
    private String catStroke;


    public Cat(int random) {
        this.random = random;
    }

    public Cat(int random, String catStroke) {
        this.random = random;
        this.catStroke = catStroke;

        if (random > 0) {catStroke = UIUtils.outputData("Your cat purrs under your hand.");
        } else catStroke = UIUtils.outputData("Your cat doesn't want to be stroked. The cat looking at you perplexedly.");
    }

    public int getRandom() {return random;}

    public String getCatStroke() {return catStroke;}
}