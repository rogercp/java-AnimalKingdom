package kingdom;

import java.util.*;

public class Main
{
      private static void printAnimals(ArrayList<AbstractAnimals> animals, CheckAnimal tester) {
        animals.forEach(animal -> {
          if (tester.check(animal)) {
            System.out.println(animal);
          }
        });
      };

    public static void main(String[] args)
    {
        ArrayList<AbstractAnimals> animals = new ArrayList<>();

        animals.add(new Mammals("Panda",1869));
        animals.add(new Mammals("Zebra",1778));
        animals.add(new Mammals("Koala",1816));
        animals.add(new Mammals("Sloth",1804));
        animals.add(new Mammals("Armadillo",1758));
        animals.add(new Mammals("Raccoon",1758));
        animals.add(new Mammals("Bigfoot",2021));

        animals.add(new Birds("Pigeon",1837));
        animals.add(new Birds("Peacock",1821));
        animals.add(new Birds("Toucan",1758));
        animals.add(new Birds("Parrot",1824)); 
        animals.add(new Birds("Swan",1758));

        animals.add(new Fish("Salmon",1758));
        animals.add(new Fish("Catfish",1817));
        animals.add(new Fish("Perch",1758));

        // List all the animals in descending order by year named
        // List all the animals alphabetically
        // List all the animals order by how they move
        // List only those animals the breath with lungs
        // List only those animals that breath with lungs and were named in 1758
        // List only those animals that lay eggs and breath with lungs
        // List alphabetically only those animals that were named in 1758

        ///simpler method for writing a lambda expression "::"=== i->blank.method(i);
        System.out.println("List all the animals in descending order by year named\n");
        animals.sort(Comparator.comparingInt(AbstractAnimals::getYearDiscovered).reversed());
        System.out.println(animals.toString());

        System.out.println("List all the animals alphabetically\n");
        animals.sort((a1,a2)->a1.getName().compareTo(a2.getName()));
        System.out.println(animals.toString());



    }     

}