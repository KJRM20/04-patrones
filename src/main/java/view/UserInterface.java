package view;

import controllers.OrderController;
import interfaces.ICommand;
import models.Chef;
import services.BurgerOrder;
import services.PastaOrder;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class UserInterface {
  private final OrderController orderController;
  private final Map<String, ICommand> commands = new HashMap<>();

  public UserInterface(OrderController orderController) {
    this.orderController = orderController;
    initializeCommands();
  }

  private void initializeCommands() {
    commands.put("1", new BurgerOrder(new Chef()));
    commands.put("2", new PastaOrder(new Chef()));
  }

  public void showMenu() {
    System.out.println("1. Order Burger");
    System.out.println("2. Order Pasta");
    System.out.println("3. Send Orders to Kitchen");
    System.out.println("4. Exit");
  }

  public void handleInput(Scanner scanner) {
    while (true) {
      showMenu();
      String choice = getUserChoice(scanner);
      processExit(choice);
      processChoice(choice);
    }
  }

  private String getUserChoice(Scanner scanner) {
    System.out.print("Enter your choice: ");
    return scanner.next();
  }

  private void processExit(String choice){
    if (choice.equals("4")) {
      System.exit(0);
    }
  }
  private void processChoice(String choice) {
    if (isOrderChoice(choice)) {
      orderController.takeOrder(commands.get(choice));
    } else {
      orderController.sendOrdersToKitchen();
    }
  }

  private boolean isOrderChoice(String choice) {
    Integer choiceNumber = Integer.parseInt(choice);
    return choiceNumber <= commands.size();
  }
}
