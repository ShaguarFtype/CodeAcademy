public class Droid
{
  int batteryLevel;
  String name;

  public Droid(String droidName)
  {
    name = droidName;
    batteryLevel = 100;
  }

  public String toString()
  {
    String robot = "";
    robot = "Hello, I'm the droid" + " " + name;
    return robot;
  }

  public void energyReport()
  {
    System.out.print("Battery Level: " + batteryLevel);
  }

  public void performTask(String task)
  {
    String task2 = task;
    System.out.println("Codey is performing task: " + task2);
    batteryLevel -= 10;
  }

  public static void main(String[] args)
  {
    Droid Codey = new Droid("Codey");
    System.out.println(Codey);
    Codey.performTask("dancing");
    Codey.performTask("running");
    Codey.energyReport();


  } //end of main


} //end of class