package helpers;

public class Generate {

    public static String generateCode(String airline){
        return airline.substring(0, 2).toUpperCase() + randomNumber();
    }

    private static int randomNumber(){
        return  (int)(Math. random()*999+1);
    }
}