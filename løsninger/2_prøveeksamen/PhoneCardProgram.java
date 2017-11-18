public class PhoneCardProgram{
  public static void main(String[] args){
    PhoneCard pc = new PhoneCard(200, 0.5, "EasyPhoning 1234");

    System.out.println("Constructs a phone card"
      + "credit = " + pc.getCredit()
      + "kr, minute charge = " + pc.getCharge()
      + ", id = " + pc.getId());


    System.out.println("Makes a 10 minutes call");
    System.out.println("Used kr. " + pc.call(10));
    System.out.println("Credit left: " + pc.getCredit());
    System.out.println("Minutes used (total): " + (pc.call(10)/pc.getCharge()));
    System.out.println();

    System.out.println("Makes a 5 minutes call");
    System.out.println("Used kr. " + pc.call(5));
    System.out.println("Credit left: " + pc.getCredit());
    System.out.println("Minutes used (total): " + (pc.call(5)/pc.getCharge()));
    System.out.println();

    System.out.println("Makes a 1000 minutes call");
    System.out.println("Used kr. " + pc.call(1000));
    System.out.println("Credit left: " + pc.getCredit());
    System.out.println("Minutes used (total): " + (pc.call(1000)/pc.getCharge()));
    System.out.println();

  }
}
