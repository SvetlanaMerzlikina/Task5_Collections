import java.util.*;



public class Collections {

    public static void main(String[] args) {

        ArrayList<Cat> cats = new ArrayList<>();
        cats.add(new Cat("Behemoth", 5, "Black"));
        cats.add(new Cat("Tom", 7, "Grey"));
        cats.add(new Cat("Garfield", 2, "Ginger"));

        ArrayList<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog("Lassy", 13, "White"));
        dogs.add(new Dog("Lady", 2, "Brown"));
        dogs.add(new Dog("Jake", 6, "Yellow"));

        ArrayList<Duck> ducks = new ArrayList<>();
        ducks.add(new Duck("Huey", 1, null, "male"));
        ducks.add(new Duck("Dewey", 2, null, "male"));
        ducks.add(new Duck("Louie", 3, null, "male"));

        HashMap<String, List> pet = new HashMap<>();
        pet.put("cats", cats);
        pet.put("dogs", dogs);
        pet.put("ducks", ducks);

        printMap(pet);

        cats.removeIf(Cat -> Cat.getAge() > 2);
        dogs.removeIf(Dog -> Dog.getAge() > 2);
        ducks.removeIf(Duck -> Duck.getAge() > 2);

        System.out.println();
        System.out.println("После удаления животных старше 2-х лет: ");

        printMap(pet);
    }

    public static void printMap(HashMap<String, List> pet) {
        for (Map.Entry<String, List> entry : pet.entrySet()) {
            System.out.println(entry.getKey());
            for (Object value : entry.getValue()) {
                System.out.println("\t" + value);
            }
        }
    }
}

