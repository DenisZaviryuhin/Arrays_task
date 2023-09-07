package app;

public class Main02 {
    static int count;
    static int count2;
    static String productName;

    public static void main(String[] args) {
        String[] products = {"Soap", "Shampoo", "Paper", "Powder", "Soap", "Sponge", "Paper"};
        count = 1;
        for (int i = 0; i < products.length; i++) {
            productName = products[i];
            System.out.println(count + ") " + productName);
            count++;
        }
        count2 = 0;
        //productName = "Paper";
        //productName = "Lime";
        productName = "Soap";
        for (String productNameCheck : products) {
            if (productNameCheck.equals(productName)) {
                count2++;
                System.out.println(count2 + ") product is " + productNameCheck);
            }
        }
        if (count2 > 0)
            System.out.println("Number of " + productName + "'s in the list is " + count2);
        if (count2 == 0)
            System.out.println("Not on the list!");


    }
}
