package ZooData.Animals;

import ZooData.Utils.UIUtils;


public class Giraffe {
    int random;
    private String giraffeStroke;


    public Giraffe(int random) {
        this.random = random;
    }

    public Giraffe(int random, String giraffeStroke) {
        this.random = random;
        this.giraffeStroke = giraffeStroke;

        if (random > 0) {giraffeStroke = UIUtils.outputData("Your giraffe just thoughtfully looking off, chewing leaves.");
        } else giraffeStroke = UIUtils.outputData("You giraffe trying to understand what do you want from it and leans.");
    }

    public int getRandom() {return random;}

    public String getGiraffeStroke() {return giraffeStroke;}
}