import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Main {
    public static void main(String[] args) {
        String name;
        int choice, calories, carbs, type, cookingTemp, count = 0;

        PaleoFood[] foods = new PaleoFood[10];

        System.out.println("~ ~ ~ ~ ~ Welcome to the Paleo Food Journal ~ ~ ~ ~ ~");
        File binaryFile = new File("PaleoFoods.dat");

        if (binaryFile.exists() && binaryFile.length() > 1L) {
            try {
                ObjectInputStream fileReader = new ObjectInputStream(new FileInputStream(binaryFile));

                foods = (PaleoFood[])fileReader.readObject();

                while(foods[count] != null){
                    System.out.println(foods[count++]);
                }
                fileReader.close();

            } catch (IOException | ClassNotFoundException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
        else {
            System.out.println("[No food eaten. You must be hungry.]");
        }
    }
}
