import java.util.*;
import java.util.stream.Collectors;

public class Stream {

    public static void main(String[] args) {
        List<Name> person = new ArrayList<>();
        
        person.add(new Name("Avan",20));
        person.add(new Name("Ivan",30));
        person.add(new Name("Nee",50));
        person.add(new Name("Naan",60));
        person.add(new Name("Avargal",100));
        person.add(new Name("Naangal",90));

        for(Name p : person){
            System.out.print(p.name + "\n");
        }

        List<Name> sortedList = person.stream()
            .sorted(Comparator.comparing(Name -> Name.id))
            .collect(Collectors.toList());

        List<Name> Old = new ArrayList<>();

        for(Name sala : person){
            if(sala.id >= 60){
                Old.add(sala);
            }
        }
        System.out.print("\n");

        List<Name> newList = person.stream()
            .filter(Name -> Name.id >= 60)
            .collect(Collectors.toList());


        for(Name p : Old){
            System.out.print(p.name + "\n");
        }

        System.out.print("\n");

        for(Name p : newList){
            System.out.print(p.name + "\n");
        }
        System.out.print("\n");

        for(Name p : sortedList){
            System.out.print(p.name + "\t" + p.id + "\n");
        }
    }
    static class Name{
        String name;
        int id;
    
        public Name(String name, int id){
            this.name = name;
            this.id = id;
        }
    }
}