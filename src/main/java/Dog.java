public class Dog extends Animal {

//    Dog, Cat, Horse переопределяют методы makeNoise, eat.
//    Добавьте переменные в классы Dog, Cat, Horse, характеризующие только этих животных.

    public String dogBreed;

    public Dog(String food, String location, String nickName, String dogBreed) {
        super(food, location, nickName);
        this.dogBreed = dogBreed;
    }

    public void makeNoise() {
        System.out.println("Собака может лаять на прохожих.");
    }

    public void eat() {
        System.out.println("Собака обожает " + food);
    }
}
