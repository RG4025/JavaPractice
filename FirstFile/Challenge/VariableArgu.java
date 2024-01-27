package FirstFile.Challenge;

public class VariableArgu {
    
    public static void main(String[] args) {
        
        System.out.println("Taking the various arguments as a String and concatinate in a single String!!");

        System.out.println(concatenate("Rushi","Kesh","Gurav","Devloper"));
    }


    public static String concatenate(String... strs){
       StringBuilder sb = new StringBuilder();

       for (String strs2 : strs) {
            sb.append(strs2).append(" ");
       }

       return sb.toString();
    }
}
