package Ex_2_2;

import javax.swing.*;

public class Client {

    public static void main(String[] args) {
        new Director(new EnglishBuilder()).construct();
    }
}
