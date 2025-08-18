package String;
import java.util.*;

public class DestinationCity {
    public static void main(String[] args) {
        List<List<String>> paths = List.of(
            List.of("London", "New York"),
            List.of("New York", "Lima"),
            List.of("Lima", "Sao Paulo")
        );
        Set<String> cities = new HashSet<>();

        for (List<String> i : paths) {
            cities.add(i.get(0));
        }
        for(List<String> i : paths){
            String dest = i.get(1);
            if(!cities.contains(dest)){
                System.out.println(dest);
            }
        }
    }
}
