public class Animal {

//    Класс Animal содержит переменные food, location и методы makeNoise, eat, sleep. Метод makeNoise, например,
//    может выводить на консоль "Такое-то животное спит". Dog, Cat, Horse переопределяют методы makeNoise, eat.

    public String food;
    public String location;
    public String nickName;

    public Animal(String food, String location, String nickName) {
        this.food = food;
        this.location = location;
        this.nickName = nickName;
    }

    public void makeNoise() {
        System.out.println("Это животное спит");
    }

    public void eat() {
        System.out.println("Животное ест корм: " + food);
    }

    public void sleep() {
        System.out.println("Животное спит столько часов");
    }

}
