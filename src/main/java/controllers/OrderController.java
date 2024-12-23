package controllers;

import interfaces.ICommand;

import java.util.ArrayList;
import java.util.List;

public class OrderController {
  private List<ICommand> orders = new ArrayList<>();

  public void takeOrder(ICommand iCommand){
    orders.add(iCommand);
    System.out.println("Order added to the list.");
  }

  public void sendOrdersToKitchen(){
    System.out.println("Sending orders to the kitchen");
    for (ICommand order : orders){
      order.execute();
    }
    orders.clear();
  }

}
