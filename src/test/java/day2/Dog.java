package day2;

public class Dog {

    String name;
    int age;
    String breed;


    public Dog(String nameParam, int ageParam, String breedParam) {
        this.name = nameParam;
        this.age = ageParam;
        this.breed = breedParam;
    }

    public void bark(){
        System.out.println("Wuff wuff wuff wuff");
    }


    public void eat(String food) {
        System.out.println("dog just ate " + food);

        if(food.equals("candy")){
            System.out.println("dog is sick now");
        }
    }

    public static void run(){
        System.out.println("run run run");
    }
}
