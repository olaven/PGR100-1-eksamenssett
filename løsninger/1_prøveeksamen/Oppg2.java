public class Oppg2{
    public static void main(String[] args){
        for(int num: fibonacci(10)){
            System.out.println(num);
        }
    }
    public static int[] fibonacci(int dim){
        int[] list = new int[dim]; 
        list[0] = 0; 
        list[1] = 1; 
        
        for(int i = 2; i < list.length; i++){
            int insert = (list[i-2]+list[i-1]);
            list[i] = insert; 
        }
     
        return list; 
    }
}