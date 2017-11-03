public class Oppg4{
    public String weekDay(int dayNum){
        String[] days = {"monday", "tuesday",
            "wednesday", "thursday", "friday",
            "saturday", "sunday"}; 
        String returnString; 
        
        if(dayNum < 1 || dayNum > days.length){
            returnString = "day not valid.";
        } else{
            returnString = (days[dayNum -1]); 
        }
        
        return returnString; 
    }
}