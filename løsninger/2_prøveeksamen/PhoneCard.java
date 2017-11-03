//dette er oppgave 3
public class PhoneCard{

  public static void main(String[] args){

  }
  //fields
  private String id;

  private float credit;
  private float charge;
  private float minutes;
  //constructors
  public PhoneCard(){
    setId("unknown");
    setCredit(-1);
    setCharge(-1);
    setMinutes(0);
  }
  public PhoneCard(String id, float credit, float charge){
    setId(id);
    setCredit(credit);
    setCharge(charge);
    setMinutes(0);
  }
  //methods
  public void call(float callDuration){
    //"dette antallet skal metoden gange med prisen per ringeminutt"
    float cost = callDuration * charge;

    //"..skal så trekkes fra credit"

    /*"hvis credit ikke er stor nok.. beregne hvor
    mange ringeminutter credit dekker, og endre berørte
    atributter."*/

    if(aboveZero(credit - cost)){
      setCredit(credit - cost);
    } else {
      //CONTINE HERE, NOT DONE 
    }
  }
  //set-methods
  public void setId(String id){
    this.id = id;
  }
  public void setCredit(float credit){
    if(aboveZero(credit)){
      this.credit = credit;
    }
  }
  public void setCharge(float charge){
    if(aboveZero(charge)){
      this.credit = credit;
    }
  }
  public void setMinutes(float minutes){
    if(aboveZero(minutes)){
      this.minutes = minutes;
    }
  }
  //get-methods
  public String getId(){
    return id;
  }
  public float getCredit(){
    return credit;
  }
  public float getCharge(){
    return charge;
  }
  public float getMinutes(){
    return minutes;
  }

  public Boolean aboveZero(int num){
    if(num > 0){
      return true;
    }
    return false;
  }
  public Boolean aboveZero(float num){
    if(num > 0){
      return true;
    }
    return false;
  }
}
