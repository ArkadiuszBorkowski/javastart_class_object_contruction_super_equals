package polimorfizm;

public class Zoo {
    public static void main(String[] args) {

       // Animal animal = new Animal("Kotopies"); //nie trzeba tego tworzyc, nizej lepsze rozwiazanie

       // Animal cat = new Cat("Mruczek"); //nie trzeba tego tworzyc, nizej lepsze rozwiazanie

       // Animal dog = new Dog("Burek");  //nie trzeba tego tworzyc, nizej lepsze rozwiazanie

//      Animal[] animals = new Animal[3];
//
//        animals[0] = new Animal("Kotopies");

        Animal cat = new Cat("Mruczek");
        Animal dog = new Dog("Burek");

        cat.giveSound();

        Dog specificDog = (Dog)dog;
        Cat specificCat = (Cat) cat;

        specificCat.miau();
        specificDog.bark();


    }

//    private static void changeAnimalName(Animal animal, String newName) {
//        animal.setName(newName);
//    }



}
