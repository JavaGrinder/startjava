public class Wolf {

    private String gender;
    private String name;
    private float weight;
    private int age;
    private String coloring;

    public String getGender() {
        return gender;
    }

    void setGender(String gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    public float getWeight() {
        return weight;
    }

    void setWeight(float weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    void setAge(int age) {
        if(age > 8) {
            System.out.println("Некорректный возраст");
        } else {
            this.age = age;
        }
    }

    public String getColoring() {
        return coloring;
    }

    void setColoring(String coloring) {
        this.coloring = coloring;
    }

    public void walk() {
        System.out.println("идёт");
    }

    public void sit() {
        System.out.println("сидит");
    }

    public void run() {
        System.out.println("бежит");
    }

    public void howl() {
        System.out.println("воет");
    }

    public void hunt() {
        System.out.println("охотится");
    }
}