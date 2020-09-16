import java.util.HashSet;

public class First {
    public static void main(String[] args) {
        HashSet <String> fruits = new HashSet<>();
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Orange");

        for (String fruit:  fruits){
            System.out.println(fruit);
        }
    }
}
