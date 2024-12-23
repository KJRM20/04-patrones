import controllers.OrderController;
import view.UserInterface;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    OrderController controller = new OrderController();

    UserInterface userInterface = new UserInterface(controller);

    userInterface.handleInput(scanner);
  }
}
