package app;
import java.util.Scanner;
//Пошук певного продукту шляхом введення
//номерів, де 0 - це перша позиція, 1 - друга, 2 - третя
//3 - четвета, 4 - п'ята, 5 - шоста


public class Main01 {

    public static void main(String[] args) {
        String[] products = {"Soap", "Shampoo", "Paper", "Powder", "Soap", "Sponge"};
        System.out.println("List of products :");
        int count = 1;
        int numProd = products.length;
        for (int i = 0; i < numProd; i++) {
            String productName = products[i];
            System.out.println(count + ") " + productName);
            count++;
        }
         Scanner scanner = new Scanner(System.in);
        System.out.println("\nPlease enter position from 0 to 5:");
        int numberGoods = scanner.nextInt();
        System.out.println("This product is " + products[numberGoods]);

    }
}
