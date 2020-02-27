package ZooData;

import ZooData.Animals.Bear;
import ZooData.Animals.Cat;
import ZooData.Animals.Dog;
import ZooData.Animals.Giraffe;
import ZooData.Utils.UIUtils;
import ZooData.Utils.User;

public class Zoo {
    private User user;
    private Cat cat;
    private Dog dog;
    private Bear bear;
    private Giraffe giraffe;
    private static final String QUITE = "Q";
    private String name;
    private String anim;
    private String repeat;
    private String action;
    private String actionRepeat;
    private int digit;


    public void start () {

            UIUtils.outputData("For interruption please use \"Q\" button");
UIUtils.indent(); //empty line

            //Identify Data.Utils.User

            name = UIUtils.inputData("Hello! Please, enter your name: ");
            if (name.isEmpty()) {name = "Data.Utils.User"; user = new User(name);}
 /*Quite*/      else if (name.equalsIgnoreCase(QUITE)) {repeat = QUITE; setQuite(); return;}
            else user = new User(name);

UIUtils.indent(); //empty line

            //Identify Animal
            showZoo();
            anim = UIUtils.inputData("Please, make your choice: ");
/*Quite*/      if (anim.equalsIgnoreCase(QUITE)) {repeat = QUITE; setQuite(); return;}

            while (!anim.equalsIgnoreCase("C")
                    && !anim.equalsIgnoreCase("D")
                    && !anim.equalsIgnoreCase("B")
                    && !anim.equalsIgnoreCase("G")) {
                anim = UIUtils.inputData("Please, choose from propose: ");
/*Quite*/            if (anim.equalsIgnoreCase(QUITE)) {repeat = QUITE; setQuite(); return;}
            }

            switch (anim.toUpperCase()) {
                case "C": anim = "animal.Cat";     break;
                case "D": anim = "animal.Dog";     break;
                case "B": anim = "animal.Bear";    break;
                case "G": anim = "animal.Giraffe"; break;
            }

            user = new User(name, anim);

            UIUtils.outputData("\n"+"Dear " + user.getName() + ", your animal is " + user.getAnimal());

            //Actions with the pets
            do {
                petsAction();
                action = UIUtils.inputData("Please, make yor choice: ");
/*Quite*/          if (action.equalsIgnoreCase(QUITE)) {repeat = QUITE; setQuite(); return;}

                while (!action.equalsIgnoreCase("S")
                        && !action.equalsIgnoreCase("F")
                        && !action.equalsIgnoreCase("P")) {
                    action = UIUtils.inputData("Please, choose from propose: ");
/*Quite*/             if (action.equalsIgnoreCase(QUITE)) {repeat = QUITE; setQuite(); return;}
                }

                UIUtils.indent(); //empty line

                if (action.equalsIgnoreCase("S")) { //pet with the animal

                    digit = (int) (Math.random() * 2);

                    switch (anim) {
                        case "animal.Cat": cat = new Cat(digit, action); break;
                        case "animal.Dog": dog = new Dog(digit, action); break;
				        case "animal.Bear": bear = new Bear(digit, action); break;
				        case "animal.Giraffe": giraffe = new Giraffe(digit, action); break;
                        default: UIUtils.outputData("Hm... something goes strange while you've tried to pet your animal... "); break;
                    }

                } else if (action.equalsIgnoreCase("F")) {
                    UIUtils.outputData("feed in process");
                } else if (action.equalsIgnoreCase("p")) {
                    UIUtils.outputData("the pet is playing with you");
                } else {
                    UIUtils.outputData("how do you get this exception? O_o It seems to be bug :(");
                }

                UIUtils.indent(); //empty line

                actionRepeat = UIUtils.inputData("Do you want to try another action? Y/N: ");
/*Quite*/             if (actionRepeat.equalsIgnoreCase(QUITE)) {repeat = QUITE; setQuite(); return;}
            } while (actionRepeat.equalsIgnoreCase("Y"));


            setQuite();

        }


        private void showZoo () {
            UIUtils.outputData("OK, " + user.getName() + " now choose your animal.\n" +
                    "     For animal.Cat, please press \"C\" ;\n" +
                    "     For animal.Dog, please press \"D\" ;\n" +
                    "     For animal.Bear, please press \"B\" ;\n" +
                    "     For animal.Giraffe, please press \"G\".");
            UIUtils.indent(); //empty line
        }
        private void petsAction () {
            UIUtils.outputData("\n"+"So, what do you want to do do with your " + user.getAnimal() + "\n" +
                    "     If you want to pet (stroke) your " + user.getAnimal() + ", please press \"S\" ;\n" +
                    "     If you want to feet your " + user.getAnimal() + ", please press \"F\" ;\n" +
                    "     If you want to play your " + user.getAnimal() + ", please press \"P\" ;\n");
        }

        private void setQuite () {

            if (repeat == QUITE) {UIUtils.outputData("\n"+"Bye! Hope to see your later!"); return;
            } else repeat = UIUtils.inputData("\n" + "THE END.\n" +"Do you want to repeat? Y/N: ");

            if (repeat.equalsIgnoreCase("Y")) {UIUtils.indent();start();}
            else {UIUtils.outputData("\n"+"Thanks for using the application! Hope, see your later!");return;}
        }

    }








