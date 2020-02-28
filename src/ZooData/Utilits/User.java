package ZooData.Utilits;

public class User {
    private String name;
    private String animal;
  // private int random;
   // private static final int MAX_RANGE = 1;

    public User (String name){
        this.name = name;
    }


    public User (String name, String animal) {
        this.name = name;
        this.animal = animal;}







    public String getName () {return name;}

    public String getAnimal() {return animal;}

  //  public int getRandom() {return random;}
}
