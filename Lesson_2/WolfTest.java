public class WolfTest {
    
    public static void main(String[] args) {

        Wolf wolfOne = new Wolf();
        wolfOne.setGender("самец");
        wolfOne.setName("Бобик");
        wolfOne.setWeight(50.5f);
        wolfOne.setAge(3);
        wolfOne.setColoring("серый");
        System.out.println("пол " + wolfOne.getGender() + 
                "\nкличка " + wolfOne.getName() +
                "\nвес " + wolfOne.getWeight() + " кг" + 
                "\nвозраст " + wolfOne.getAge() + " года" +
                "\nокрас " + wolfOne.getColoring());
        wolfOne.walk();
        wolfOne.sit();
        wolfOne.run();
        wolfOne.howl();
        wolfOne.hunt();
    }
}