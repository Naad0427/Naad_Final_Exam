
package naad_finalexam;

import java.util.Scanner;

public class NaadFinalExam {
    private String[] itemName;
    private int[] itemQuantities;
    private int itemNumber;

    public NaadFinalExam() {
        itemName = new String[9999]; 
        itemQuantities = new int[9999]; 
        itemNumber = 0;
    }

    
    public void addProduct(String item, int quantity) {
        itemName[itemNumber] = item;
        itemQuantities[itemNumber] = quantity;
        itemNumber++;
        System.out.println(quantity + " " + item + " has been added to the inventory.");
       
    }

   
    public void sellProduct(String item, int quantity) {
        int index;
        index = -1;

        for (int i = 0; i < itemNumber; i++) {
            if (itemName[i].equals(item)) {
                index = i;
                break;
            }
        }

        if (index != -1)
        {
            int currentQuantity = itemQuantities[index];
            if (currentQuantity >= quantity) {
                itemQuantities[index] -= quantity;
                System.out.println(quantity + " " + item + " has been sold.");
            } else {
                System.out.println("Kulang ang " + item + " sa inventory");
            }
        } else {
            System.out.println(item + " kay wala sa inventory.");
         }
     }

    
    public void displayInventory() {
        if (itemNumber > 0) 
        {
            System.out.println("Current Inventory ");
            for (int i = 0; i < itemNumber; i++) {
                System.out.println(itemName[i] + ": " + itemQuantities[i]);
            }
        } else {
            System.out.println("Inventory is empty.");
          }
      }

    public static void main(String[] args) {
        NaadFinalExam inventoryManagement;
        inventoryManagement = new NaadFinalExam();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Pamili kay wala ka pilia :P ");
            System.out.println("[1]Add Item ");
            System.out.println("[2]Sell Item ");
            System.out.println("[3]Display Inventory ");
            System.out.println("[4]Exit ");
            
            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1 -> {
                    System.out.print("Isulat ang item na ibutang \n : ");
                    String newItem = scanner.nextLine();
                    System.out.print("Pila kabuok? \n : ");
                    int quantityToAdd = scanner.nextInt();
                    scanner.nextLine(); 
                    inventoryManagement.addProduct(newItem, quantityToAdd);
                }
                case 2 -> {
                    System.out.print("Unsa imong ibaligya? \n : ");
                    String itemToSell = scanner.nextLine();
                    System.out.print("Pila kabuok? \n : ");
                    int quantityToSell = scanner.nextInt();
                    scanner.nextLine(); 
                    inventoryManagement.sellProduct(itemToSell, quantityToSell);
                }
                case 3 -> inventoryManagement.displayInventory();
              
                case 4 -> {
                    System.out.println("Bye.");
                    scanner.close();
                    System.exit(0);
                }
                default -> System.out.println("Wala ka pilia?, pamili sa choices!");
               }
            }
         }
      }









// Di ko kabalo sa stacks sir hahahahahhahaha