import java.util.ArrayList;

public class Oppg2{
  public static void main(String[] args){
    Oppg2 o = new Oppg2();
    /* //test for oppgave a
    int [] list = {1,2,3,3,4,5,2,1};
    int forekomstTest = o.forekomst(list, 4);
    System.out.println(forekomstTest);
    */
    /* //test for oppgave b
    ArrayList<String> countListe = new ArrayList<String>();
    countListe.add("test"); //4 -> 2
    countListe.add("ord");  // 3 -> 1
    countListe.add("test"); //4 -> 2

    System.out.println(o.count(countListe, 3));
    */
  }
  public int forekomst(int[] list, int num){
    int counter = 0;
    for(int value: list){
      if(value == num){
        counter ++;
      }
    }
    return counter;
  }
  public int count(ArrayList<String> al, int num){
    int counter = 0;
    for(String word: al){
        if(word.length() == num){
          counter++;
        }
    }
    return counter;
  }
}
