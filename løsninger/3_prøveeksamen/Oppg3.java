import java.util.ArrayList;
public class Oppg3{
  public static void main(String[] args){
    int[] test = {1,1,1,2,2,3,4,4,5,5,5,6,6,6,7,8};


    System.out.println(rydd(test, 3));
  }
  public static int forekomst(int[] liste, int x){
    int i = 0;
    int counter = 0;
    boolean firstHit = false;

    while(i < liste.length){
      if(firstHit && (liste[i] != x)){
        return counter;
      }
      if(liste[i] == x){
        firstHit = true;
        counter++;
      }
      i++;
    }
    return counter;
  }
  public static int[] rydd(int[] liste, int x){
    int[] returListe = new int[100];    
    for(int i = 0; i < liste.length; i++){
      if(liste[i] != x){
        returListe[returListe.length] = liste[i];
      }
    }
    return returListe;
  }

  //fungerer, men er feil datatype i henhold til oppgaven
  public static ArrayList<Integer> rydd(ArrayList<Integer> liste, int x){
    ArrayList<Integer> returListe = new ArrayList<Integer>();

    for(int num: liste){
      if(num != x){
        returListe.add(num);
      }
    }

    return returListe;
  }
}
