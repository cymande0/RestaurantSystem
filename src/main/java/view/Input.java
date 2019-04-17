package view;

import java.util.Scanner;

public class Input {

    private Scanner scanner;

    public Input(){
        this.scanner = new Scanner(System.in);
    }

    public String getString(){
       return scanner.nextLine();
    }

    public double getDouble(){
        return scanner.nextDouble();
    }

    public int getInt(){
        return scanner.nextInt();
    }

    public String getMealName(){
        System.out.print("Type name of new meal: ");
        return getString();
    }

    public double getMealPrice(){
        System.out.print("Type price of new meal: ");
        return getDouble();
    }

    public int getID(){
        return getInt();
    }

}
