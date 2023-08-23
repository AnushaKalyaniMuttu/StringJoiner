import java.util.StringJoiner;

public class StringJoiner{

     public static void main(String []args){
        delimiterDemonstration();
     }
     
     private static void delimiterDemonstration() {
        StringJoiner joinNames = new StringJoiner(","); // passing comma(,) as delimiter
     // Adding values to StringJoiner
        joinNames.add("John");
        joinNames.add("Tony");
        joinNames.add("Amir");
        joinNames.add("Prabhas");
        System.out.println(joinNames);

        joinNames = new StringJoiner("|"); // passing comma(,) as delimiter

        // Adding values to StringJoiner
        joinNames.add("John");
        joinNames.add("Tony");
        joinNames.add("Amir");
        joinNames.add("Prabhas");
        System.out.println(joinNames);
    }
}
