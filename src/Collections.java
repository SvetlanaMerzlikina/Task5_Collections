import java.util.*;
import java.util.function.BiConsumer;


public class Collections {

    public static void main(String[] args) {

        ArrayList<Cat> cats = new ArrayList<>();
        Cat Behemoth = new Cat("Behemoth", 5, "Black");
        Cat Tom = new Cat("Tom", 7, "Grey");
        Cat Garfield = new Cat("Garfield", 2, "Ginger");
        cats.add(Behemoth);
        cats.add(Tom);
        cats.add(Garfield);

        ArrayList<Dog> dogs = new ArrayList<>();
        Dog Lassy = new Dog("Lassy", 13, "White");
        Dog Lady = new Dog("Lady", 2, "Brown");
        Dog Jake = new Dog("Jake", 6, "Yellow");
        dogs.add(Lassy);
        dogs.add(Lady);
        dogs.add(Jake);

        ArrayList<Duck> ducks = new ArrayList<>();
        Duck Huey = new Duck("Huey", 1, null, "male");
        Duck Dewey = new Duck("Dewey", 2, null, "male");
        Duck Louie = new Duck("Louie", 3, null, "male");
        ducks.add(Huey);
        ducks.add(Dewey);
        ducks.add(Louie);

        HashMap<String, List> pet = new HashMap<>();
        pet.put("cats", cats);
        pet.put("dogs", dogs);
        pet.put("ducks", ducks);

        for (String key : pet.keySet()) {
            System.out.println(key + ":");

            if (key == "cats") {
                for (Cat ListCat : cats) {
                    System.out.println("\t" + ListCat);
                }
            }

            if (key == "dogs") {
                for (Dog ListDog : dogs) {
                    System.out.println("\t" + ListDog);
                }
            }

            if (key == "ducks") {
                for (Duck ListDuck : ducks) {
                    System.out.println("\t" + ListDuck);
                }
            }
        }

        cats.removeIf(Cat -> Cat.age > 2);
        dogs.removeIf(Dog -> Dog.age > 2);
        ducks.removeIf(Duck -> Duck.age > 2);

        System.out.println();
        System.out.println("После удаления животных старше 2-х лет: ");

        pet.put("cats", cats);
        pet.put("dogs", dogs);
        pet.put("ducks", ducks);

        for (String key : pet.keySet()) {
            System.out.println(key + ":");

            if (key == "cats") {
                for (Cat ListCat : cats) {
                    System.out.println("\t" + ListCat);
                }
            }

            if (key == "dogs") {
                for (Dog ListDog : dogs) {
                    System.out.println("\t" + ListDog);
                }
            }

            if (key == "ducks") {
                for (Duck ListDuck : ducks) {
                    System.out.println("\t" + ListDuck);
                }
            }
        }

    }
}

       /* Iterator<List> iterator =  pet.values().iterator();
        while (iterator.hasNext()) {
            int age;
            age = age.next();
            if (age < 2 )
                iterator.remove();
        }*/
//cats.remove("cats");

               /* for (String key : pet.keySet()) {
        System.out.println(key + ":");
        }

    for(List value : pet.values()){
        System.out.println(value);
        }*/

//  for (String key : pet.keySet()) {
// System.out.println(key + ":");
// }

// for(HashMap.Entry<String, List> entry : pet.entrySet()){

//use getKey method to get a key from entry
// System.out.println("Key: " + entry.getKey());

//use getValue method to get a value from entry
/// System.out.println("Value: " + entry.getValue());
//}

//System.out.println("cats:");

//toString += key.toString() + ": " + pet.get(key);
//System.out.println(pet);


// System.out.println("dogs:");
//System.out.println("ducks:");


//System.out.println(cats.toString());
//int thomasIndex = cats.indexOf(Tom);
//System.out.println(thomasIndex);






