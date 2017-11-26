public class TrafficLight{


  public static void main(String[] args){
    TrafficLight tl = new TrafficLight();

    System.out.println(tl.getStatus());
    tl.change();
    System.out.println("----------");
    System.out.println(tl.getStatus());
    tl.change();
    System.out.println("----------");
    System.out.println(tl.getStatus());
    tl.change();
    System.out.println("----------");
    System.out.println(tl.getStatus());
    tl.change();
    System.out.println("----------");
    System.out.println(tl.getStatus());
    tl.change();
  }


  private Light light;
  private String status;

  public TrafficLight(){
    setLight(Light.RED);
    setStatus("rødt");
  }

  public void change(){

    System.out.println("Trafikklyset skifter status");

    switch(light){
      case RED:
        setLight(Light.REDYELLOW);
        setStatus("rødt gult");
        break;
      case REDYELLOW:
        setLight(Light.GREEN);
        setStatus("grønt");
        break;
      case GREEN:
        setLight(Light.YELLOW);
        setStatus("gult");
        break;
      case YELLOW:
        setLight(Light.RED);
        setStatus("rødt");
        break;
      default:
        setLight(null);
        setStatus("ugyldig");
        break;
    }
  }

  //get/set-methods
  public void setLight(Light light){
    this.light = light;
  }
  public void setStatus(String status){
    this.status = "Trafikklyset viser " + status;
  }

  public Light getLight(){
    return light;
  }
  public String getStatus(){
    return status;
  }
}
