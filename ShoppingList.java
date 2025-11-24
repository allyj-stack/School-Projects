import java.util.HashMap;
import java.util.Scanner;

public class ShoppingList{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Items i = new Items();

        boolean t = true;
        // ===== Shopping List small project=====
        System.out.println("===== Shopping List small project=====");
        do {
            System.out.println();
            System.out.println("Pick a conditions:");
            System.out.println("1. Add a product");
            System.out.println("2. Update a product");
            System.out.println("3. Delete a product");
            System.out.println("4. View the products");
            System.out.println("5. Exit the program");
            int choice = 0;

            try {
                choice = input.nextInt();
                input.nextLine();
            } catch (Exception e) {
                System.out.println("Invalid User Input");
                input.nextLine();
                continue;
            }
            System.out.println();
            String item;

            switch (choice) {
                case 1:
                        System.out.print("Enter a product: ");
                        item = input.nextLine();
                        System.out.print("Enter the " + item + " price: ");
                        int price = 0;
                        try {
                            price = input.nextInt();
                            i.addItem(item, price);
                        } catch (Exception e) {
                            System.out.println("Invalid User Input for price");
                        }
                        input.nextLine();
                    break;
                
                case 2:
                        System.out.print("Enter the product to update: ");
                        item = input.nextLine();
                        if (!i.items.containsKey(item)) {
                            System.out.println("Product cannot be found.");
                            continue;
                        }
                        System.out.print("Enter a new price for " + item + ": ");
                        try {
                            int newPrice = input.nextInt();
                            i.updateProduct(item, newPrice);
                        } catch (Exception e) {
                            System.out.println("Invalid User Input for price");
                        }
                        input.nextLine();
                    break;
                
                case 3:
                        System.out.print("Delete a product: ");
                        item = input.nextLine();
                        if (!i.items.containsKey(item)) {
                            System.out.println("Product cannot be found.");
                            continue;
                        }
                        i.deleteProduct(item);
                        System.out.println("Product succesfully deleted.");
                    break;

                case 4:
                        i.viewProducts();
                    break;

                case 5:
                    t = false;
                    break;
            
                default:
                        System.out.println("Choose from 1 to 4.");
                    break;
            }
        } while (t);

        input.close();
    }
}

class Items{
    HashMap<String, Integer> items = new HashMap<>();

    public void addItem(String item, int price){
        items.put(item, price);
    }

    public void updateProduct(String item, int price){
        if(items.containsKey(item)){
            items.put(item, price);
        }
    }
    public void deleteProduct(String item){
        if(items.containsKey(item)){
            items.remove(item);
        }
    }
    public void viewProducts(){
        System.out.println("Available products: " + items);
    }
}