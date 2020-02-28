package ZooData;

import ZooData.Animals.*;
import ZooData.Utilits.*;



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

//Identify User

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
                case "C": anim = "Cat";     break;
                case "D": anim = "Dog";     break;
                case "B": anim = "Bear";    break;
                case "G": anim = "Giraffe"; break;
            }

            user = new User(name, anim);

            UIUtils.outputData("\n"+"Dear " + user.getName() + ", your animal is " + user.getAnimal () );

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

//pet (stroke) the anim
                if (action.equalsIgnoreCase("S")) { //pet (stroke) the animal

                    digit = (int) (Math.random() * 2);

                    switch (anim) {
                        case "Cat": cat = new Cat(digit, action); break;
                        case "Dog": dog = new Dog(digit, action); break;
				        case "Bear": bear = new Bear(digit, action); break;
				        case "Giraffe": giraffe = new Giraffe(digit, action); break;
                        default: UIUtils.outputData("Hm... something goes strange while you've tried to pet your animal... "); break;
                    }

//feed the animal
                } else if (action.equalsIgnoreCase("F")) { //feed the animal

                    digit = (int) (Math.random() * 2);

                    switch (anim) {
                        case "Cat": cat = new Cat(digit, action, action); break;
                        case "Dog": dog = new Dog(digit, action, action); break;
                        case "Bear": bear = new Bear(digit, action, action); break;
                        case "Giraffe": giraffe = new Giraffe(digit, action, action); break;
                        default: UIUtils.outputData("Hm... something goes strange while you've tried to feed your animal... "); break;
                    }

//play with the animal
                } else if (action.equalsIgnoreCase("p")) {

                    digit = (int) (Math.random() * 3);

                    switch (anim) {
                        case "Cat": cat = new Cat(digit, action, action, action); break;
                        case "Dog": dog = new Dog(digit, action, action, action); break;
                        case "Bear": bear = new Bear(digit, action, action, action); break;
                        case "Giraffe": giraffe = new Giraffe(digit, action, action, action); break;
                        default: UIUtils.outputData("Hm... something goes strange while you've tried to play with your animal... "); break;
                    }

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
                    "     For Cat, please press \"C\" ;\n" +
                    "     For Dog, please press \"D\" ;\n" +
                    "     For Bear, please press \"B\" ;\n" +
                    "     For Giraffe, please press \"G\".");
            UIUtils.indent(); //empty line
        }
        private void petsAction () {
            UIUtils.outputData("\n"+"So, what do you want to do with your " + user.getAnimal() + "\n" +
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








