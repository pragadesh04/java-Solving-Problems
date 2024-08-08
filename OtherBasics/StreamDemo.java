import java.util.*; 
import java.util.stream.Collectors; // Import necessary packages

public class StreamDemo { // Renamed class to StreamDemo to avoid conflict with java.util.stream package

    public static void main(String[] args) {
        // Initialize a list of Name objects
        List<Name> person = new ArrayList<>();
        
        // Add Name objects to the list
        person.add(new Name("Avan", 20));
        person.add(new Name("Ivan", 30));
        person.add(new Name("Nee", 50));
        person.add(new Name("Naan", 60));
        person.add(new Name("Avargal", 100));
        person.add(new Name("Naangal", 90));

        // Print all names in the original list
        System.out.println("Original List:");
        for (Name p : person) {
            System.out.println(p.name);
        }

        // Sort the list by id using Streams
        List<Name> sortedList = person.stream()
            .sorted(Comparator.comparing(Name -> Name.id)) // Sort by id
            .collect(Collectors.toList());

        // Print sorted list
        System.out.println("\nSorted List:");
        for (Name p : sortedList) {
            System.out.println(p.name + "\t" + p.id);
        }

        // Create a list for names with id >= 60 using traditional loop
        List<Name> old = new ArrayList<>();
        for (Name sala : person) {
            if (sala.id >= 60) {
                old.add(sala);
            }
        }

        // Create a new list for names with id >= 60 using Streams
        List<Name> newList = person.stream()
            .filter(Name -> Name.id >= 60) // Filter condition
            .collect(Collectors.toList());

        // Print names with id >= 60 using traditional loop
        System.out.println("\nNames with id >= 60 (Traditional Loop):");
        for (Name p : old) {
            System.out.println(p.name);
        }

        // Print names with id >= 60 using Streams
        System.out.println("\nNames with id >= 60 (Streams):");
        for (Name p : newList) {
            System.out.println(p.name);
        }
    }

    // Static inner class to represent Name objects
    static class Name {
        String name;
        int id;
    
        public Name(String name, int id) {
            this.name = name;
            this.id = id;
        }
    }
}
