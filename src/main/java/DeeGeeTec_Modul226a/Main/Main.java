package DeeGeeTec_Modul226a.Main;

import DeeGeeTec_Modul226a.IncorrectChoiceException;
import DeeGeeTec_Modul226a.ShoppingChoices;
import DeeGeeTec_Modul226a.Dbconfig.JdbcDb;
import DeeGeeTec_Modul226a.Main.Factories.BackendFactory;
import DeeGeeTec_Modul226a.Main.Models.AbstractModels.Account;
import DeeGeeTec_Modul226a.Main.Models.AbstractModels.Address;
import DeeGeeTec_Modul226a.Main.Models.AbstractModels.Cart;
import DeeGeeTec_Modul226a.Main.Models.AbstractModels.Item;
import DeeGeeTec_Modul226a.Main.Models.AbstractModels.Order;
import DeeGeeTec_Modul226a.Main.Models.AbstractModels.OrderDetails;
import DeeGeeTec_Modul226a.Main.Models.AbstractModels.ShipmentDetails;
import DeeGeeTec_Modul226a.Main.Models.AbstractModels.Wishlist;
import DeeGeeTec_Modul226a.Main.Models.InMemoryModels.AccountInMemory;
import DeeGeeTec_Modul226a.Main.Models.InMemoryModels.AddressInMemory;
import DeeGeeTec_Modul226a.Main.Models.JdbcModels.AccountJdbc;
import jdk.incubator.vector.VectorOperators.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import org.apache.commons.lang3.NotImplementedException;
import org.json.simple.parser.ParseException;
import org.springframework.web.client.HttpServerErrorException.NotImplemented;

import java.io.IOException;
import java.sql.Array;
import java.sql.SQLException;

/**
 * This is the main class of our project, it does nothing yet but will maybe
 * have a future use.
 *
 * @author Sven, Dimitrios, Arman
 * @version 1.0
 */

public class Main {

    public static Scanner sc = new Scanner(System.in);
    public static final BackendFactory factory = BackendFactory.getFactory();
    public static Address userAddress = factory.createAddress("test", "test", "test", "test");
    public static Account userAccount = factory.createAccount("username", "password", userAddress, "email", "firstName",
            "lastName");
    public static Item[] items = {
            factory.createItem("RTX 6900", 6900.69f),
            factory.createItem("Amd Epyc", 4200.42f),
            factory.createItem("Intelij i20 why", 1337.13f)
    };
    public static Wishlist userWishlist = factory.createWishlist(new ArrayList<>());
    public static Cart userCart = null;
    public static ArrayList<OrderDetails> orderDetails = new ArrayList<>();

    public static void main(String[] args) throws SQLException, ParseException, IOException, ClassNotFoundException {

        userWishlist.addWishlistItems(items[0]);

        while (true) {
            System.out.println("Welcome to Deegeetec (Pretend this is a website)");
            shoppingProcess();
            System.out.println("Want to keep browsing?");

            String answer = sc.next();

            if (!answer.equals("yes")) {
                System.out.println("Goodbye!");
                break;
            }
        }

    }

    public static void shoppingProcess() {
        while (true) {

            System.out.println("""
                    Select an action:
                            1. list items
                            2. add item to wishlist
                            3. add items from wishlist to cart
                            4. order Items in Cart
                            5. show wishlist
                            6. show cart
                            0. exit
                    """);
            try {
                int userAction = sc.nextInt();

                if (userAction == 1) {

                    listItems(items);
                } else if (userAction == 2) {

                    listItems(items);
                    int itemToAdd = sc.nextInt();

                    throw new NotImplementedException("");

                } else if (userAction == 3) {
                    showWishlist(userWishlist);

                    userCart = factory.createCart(userWishlist.getItems());

                    showCart(userCart);

                } else if (userAction == 4) {
                    orderDetails.add(factory.createOrderDetails("", userCart.getItems())); //TODO: userCard addItem(int itemId)
                    Order userOrder = factory.createOrder(userAccount, orderDetails);
                    
                    System.out.println(userOrder.getAccount().getFirstName() + " " + userOrder.getAccount().getLastName());
                    System.out.println(userOrder.getAccount().getAddress().getPlace() + " " + userOrder.getAccount().getAddress().getPlz() + " " + userOrder.getAccount().getAddress().getStreet() + " " + userOrder.getAccount().getAddress().getStreetNum());
                    for (OrderDetails order : userOrder.getOrderDetails()) {
                        System.out.println(order.getOrderDetails());
                        for (Item orderItem : order.getItems()) {
                            System.out.println(orderItem.getItemName() + " -" + orderItem.getPrice());
                        }
                    }
                    System.out.println("Thanks for making an order, your order will arive soon");

                } else if (userAction == 5) {
                    showWishlist(userWishlist);
                } else if (userAction == 6) {
                    showCart(userCart);
                } else if (userAction == 0) {
                    System.out.println("Walking out of store...");
                    break;
                } else {
                    throw new IncorrectChoiceException();
                }

            } catch (InputMismatchException e) {
                System.out.println("You should only enter the number of the action (Like '1')");
            } catch (IncorrectChoiceException e) {
                System.out.printf("That choice doesn't exist");
            } catch (NotImplementedException e) {
                System.out.println("Isn't implemented yet");
            } catch (Exception e) {
                System.out.println("Something went wrong " + e);
            }
        }
    }

    public static void listItems(Item[] items) {
        int i = 0;
        for (Item item : items) {
            i++;
            System.out.printf("     %d:%s ONLY FOR: %f", i, item.getItemName(), item.getPrice());
            System.out.println();
        }
        System.out.println();
    }

    public static void showWishlist(Wishlist wishlist) {
        System.out.println("Current wishlist:");
        for (Item wishlistItem : wishlist.getItems()) {
          System.out.println(wishlistItem.getItemName() + " " + wishlistItem.getPrice());  
        }
        System.out.println();
    }

    public static void showCart(Cart cart) {
        System.out.println("Current Cart:");
        for (Item cartItem : cart.getItems()) {
            System.out.println(cartItem.getItemName() + " " + cartItem.getPrice()); 
          }
          System.out.println();
    }
}
