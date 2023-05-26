package day5.Scratch;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Map<String, String> cars = new HashMap<>();
        cars.put("c1", "Innova");
        cars.put("c2", "Cruiser");
        cars.put("c3", "Xpander");
        cars.put("c4", "Vios");
        cars.put("c5", "Altis");
        cars.put("c6", "Prius");

        System.out.println(cars.get("c4"));
        System.out.println(cars.size());
        System.out.println(cars.keySet());
        System.out.println(cars.containsKey("c7"));
        System.out.println(cars.containsValue("Altis"));

        // why use containsKey rather than value?
        // if diff key, same values, output will contain both Strings
        // cars.put("c5", "Altis");
        // cars.put("c6", "Altis");

        // alternative approach
        System.out.println("***");
        Scanner scanner = new Scanner(System.in);
        double nextDouble = scanner.nextDouble();
        System.out.println(Double.valueOf(nextDouble));
        // System.out.println(nextDouble);
    }
}