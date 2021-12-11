import java.lang.reflect.Array;

public class Veterinarian {

//    Создайте класс Ветеринар, в котором определите метод void treatAnimal(Animal animal).
//    Пусть этот метод распечатывает food и location пришедшего на прием животного.
//    В методе main создайте массив типа Animal, в который запишите животных всех имеющихся у вас типов.
//    В цикле отправляйте их на прием к ветеринару.

    public static void treatAnimal(Animal animal) {

        animal.eat();
        System.out.println("Место обитания: " + animal.location);
    }


    public static void main(String[] args) {

        Animal cat1 = new Cat("Whiskas", "квартира", "Мурчик", 3);
        Animal dog1 = new Dog("Pedigree", "конура", "Рекс", "лабрадор");
        Animal horse1 = new Horse("овёс", "конюшня", "Молния", "покладистый");

        Animal[] animals = {cat1, dog1, horse1};

        Cat cat2 = new Cat("Whiskas", "квартира", "Мурчик", 3);

        treatAnimal(cat1);
        cat2.makeNoise();
        treatAnimal(dog1);
        treatAnimal(horse1);

        for (Animal allAnimals : animals) {
            System.out.println("На приём к ветеринару записан " + allAnimals.nickName + ", который употребляет " + allAnimals.food);

        }

    }

}
