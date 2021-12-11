public class Cat extends Animal {

//    Dog, Cat, Horse переопределяют методы makeNoise, eat.
//    Добавьте переменные в классы Dog, Cat, Horse, характеризующие только этих животных.

    public int countOfhitChristmassTree;

    public Cat(String food, String location, String nickName, int countOfhitChristmassTree) {
        super(food, location, nickName);
        this.countOfhitChristmassTree = countOfhitChristmassTree;
    }


    public void makeNoise() {
        System.out.println("Pay attention!!! Кот " + nickName + " может шуметь по ночам.");
    }

    public void eat() {
        System.out.println("Кот любит кушать " + food);
    }


}
