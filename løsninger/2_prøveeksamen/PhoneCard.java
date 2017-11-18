public class PhoneCard{
  public static void main(String[] args) {
    PhoneCard pc = new PhoneCard();
  }

  //beløpet det kan ringes for
  private double credit;
  //pris per ringeminutt
  private double charge;
  //en unik id
  private String id;
  //antall ringeminutter det er ringt for
  private double minutes;

  public PhoneCard(){
    setCredit(0);
    setCharge(-1);
    setId(null);
    setMinutes(0);
  }
  public PhoneCard(double credit, double charge, String id){
    setCredit(credit);
    setCharge(charge);
    setId(id);
    setMinutes(0);
  }

  public double call(double duration){

    double newCredit = (credit - (duration * charge));
    if(newCredit > 0){
      setCredit(newCredit);
      setMinutes(minutes - duration);
    } else {
      double minutesCovered = charge/credit;

      setCredit(0);
      setMinutes(minutes - minutesCovered);
    }

    return (charge * minutes);
  }

  //set-methods
  private void setCredit(double credit){
    this.credit = credit;
  }
  private void setCharge(double charge){
    this.charge = charge;
  }
  private void setId(String id){
    this.id = id ;
  }
  private void setMinutes(double minutes){
    this.minutes = minutes;
  }
  //get-methods
  public double getCredit(){
    return credit;
  }
  public double getCharge(){
    return charge;
  }
  public String getId(){
    return id;
  }
  public double getMinutes(){
    return minutes;
  }
}
