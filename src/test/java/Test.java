import machine.*;

public class Test {
    public static void main(String[] args) {
//        Fan fan = new Fan();
//        Machine machine = new Machine();
//        System.out.println(machine.getColor());
//        System.out.println(fan.getColor());
//
//        Machine a = fan;
//        System.out.println(a.color);
//        System.out.println(fan.color);
//        System.out.println(a.getColor());

          Fan fan1 = new Fan(3, 10, "yellow", true);
          Fan fan2 = new Fan(2, 5, "blue", false);

          System.out.println(fan1.toString());
          System.out.println(fan2.toString());

    }
}
