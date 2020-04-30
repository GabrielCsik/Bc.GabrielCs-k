//import com.google.gson.GsonBuilder;

import java.util.*;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        UserInterface userInterface = new UserInterface();
        userInterface.play();
//        Thread printingHook = new Thread(() -> System.out.println("\nBlocks:" + userInterface.blockChain.getNumofBlocks() +
//                "\nTransactions: " + userInterface.blockChain.getNumofTransactions()));
//        Runtime.getRuntime().addShutdownHook(printingHook);
    }
}
