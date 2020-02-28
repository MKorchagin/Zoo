package ZooData.Utilits;

import java.util.Scanner;

public class UIUtils {

//input data
    public static String inputData(String message) {
        System.out.print(message);
        Scanner in = new Scanner(System.in);
        return in.nextLine();
    }

//output message
public static String outputData (String message) {System.out.println(message);
    return message;
}

//empty line
public static void indent () {System.out.println(" ");}
}
