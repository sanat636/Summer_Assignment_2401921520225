import java.util.Random;

abstract class Compartment {
   public abstract String notice();
}
class FirstClass extends Compartment {
    @Override
    public String notice() {
        return "First Class Compartment";
    }
}
class Ladies extends Compartment {
    @Override
    public String notice() {
        return "Ladies Compartment";
    }
}
class General extends Compartment {
    @Override
    public String notice() {
        return "General Compartment";
    }
}
class Luggage extends Compartment {
    @Override
    public String notice() {
        return "Luggage Compartment"; 
    }
}

public class TestComp {
    public static void main(String[] args) {
       Compartment[] compartments = new Compartment[10];
         Random r = new Random();
         for (int i = 0; i < compartments.length; i++) {
             int n= r.nextInt(4);
             switch (n) {
                 case 0:
                     compartments[i] = new FirstClass();
                     break;
                 case 1:
                     compartments[i] = new Ladies();
                     break;
                 case 2:
                     compartments[i] = new General();
                     break;
                 case 3:
                     compartments[i] = new Luggage();
                     break;
             }
         }
      for(int i=0;i<compartments.length;i++){
          System.out.println(compartments[i].notice());
      }
    }
}