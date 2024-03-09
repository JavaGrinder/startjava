public class WolfTest {
    
    public static void main(String[] args) { 
        Wolf wolfOne = new Wolf();
        wolfOne.gender = "самец";
        wolfOne.name = "Бобик";
        wolfOne.weight = 50.5f;
        wolfOne.age = 3;
        wolfOne.coloring = "серый";
        System.out.println("пол " + wolfOne.gender + "\nкличка " + wolfOne.name + "\nвес " +
                wolfOne.weight + " кг" + "\nвозраст " + wolfOne.age + " года" + "\nокрас " +
                wolfOne.coloring);
        wolfOne.walk();
        wolfOne.sit();
        wolfOne.run();
        wolfOne.howl();
        wolfOne.hunt();
    }
}