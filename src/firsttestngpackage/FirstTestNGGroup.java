package firsttestngpackage;

import org.testng.annotations.Test;

public class FirstTestNGGroup {
  @Test (groups = {"Car"})
  public void Car1() {
  System.out.println("Group Car - Test car 1");
}
  @Test (groups = {"Car"})
  public void Car2() {
  System.out.println("Group Car - Test car 2");
  }
  
  @Test (groups = {"Scooter"})
  public void Scooter1() {
  System.out.println("Group Scooter - Test scooter 1");
  }
  
  @Test (groups = {"Scooter"})
  public void Scooter2() {
  System.out.println("Group Scooter - Test scooter 2");
  }
  
  @Test (groups = {"Car", "Sedan"})
  public void CarandSedan() {
  System.out.println("Group Car Sedan - Test car sedan1");
  }
}
