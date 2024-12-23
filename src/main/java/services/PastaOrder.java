package services;

import interfaces.ICommand;
import models.Chef;

public class PastaOrder implements ICommand {
  private Chef chef;

  public PastaOrder(Chef chef){
    this.chef = chef;
  }

  @Override
  public void execute() {
    chef.preparePasta();
  }
}
