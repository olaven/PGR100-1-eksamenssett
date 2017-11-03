import java.util.Random; 


public class Oppg3{
    public static void main(String[] args){
        for(int num: lotto()){
            System.out.println(num);
        }
    }
    public static int[] lotto(){
        int[] lottorekke = new int[7]; 
        Random r = new Random(); 
        
        for(int i = 0; i < lottorekke.length; i++){
            int rTall = r.nextInt(34);
            
            while(intContains(lottorekke, rTall)){
                rTall = r.nextInt(34); 
            }
            
            lottorekke[i] = rTall; 
        }   
        
        return lottorekke; 
    }
    public static boolean intContains(int[] list, int num){
        for(int value: list){
            if(value == num){
                return true; 
            }
        }
        return false; 
    }
}