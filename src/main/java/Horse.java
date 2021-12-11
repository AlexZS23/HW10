public class Horse extends Animal {


//    Dog, Cat, Horse переопределяют методы makeNoise, eat.
//    Добавьте переменные в классы Dog, Cat, Horse, характеризующие только этих животных.

    public String temper;

    public Horse(String food, String location, String nickName, String temper) {
        super(food, location, nickName);
        this.temper = temper;
    }

    public void makeNoise() {
        System.out.println("Лошадь может ржать.");
    }

    public void eat() {
        System.out.println("Основной рацион лошади - это " + food);
    }

}
