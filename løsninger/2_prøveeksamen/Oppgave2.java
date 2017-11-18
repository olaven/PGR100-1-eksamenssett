import java.util.ArrayList;

public class Oppgave2{
  public static void main(String[] args) {
    ArrayList<String> liste = new ArrayList<String>();

    liste.add("abcdfg");
    liste.add("abcdfg");
    liste.add("abcdf");
    liste.add("abcdf");
    liste.add("abcd");
    liste.add("abcdf");
    liste.add("abcdfg");
    liste.add("abcdf");
    liste.add("abcd");


    System.out.println(Oppgave2.count(liste, 5));
  }
  //a
  public static int forekomst(int[] arr, int x){
    int counter = 0;
    for(int i = 0; i < arr.length; i++){
      if(x == arr[i]){
        counter++;
      }
    }
    return counter;
  }
  //b
  public static int count(ArrayList<String> ordliste, int amount){
    int counter = 0;
    for(String ord: ordliste){
      if(amount == ord.length()){
        counter++;
      }
    }
    return counter;
  }
}
