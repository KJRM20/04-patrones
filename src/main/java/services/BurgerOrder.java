package services;

import interfaces.ICommand;
import models.Chef;

public class BurgerOrder implements ICommand {
  private Chef chef;

  public BurgerOrder(Chef chef){
    this.chef = chef;
  }


  @Override
  public void execute() {
    chef.prepareBurger();
  }
}
