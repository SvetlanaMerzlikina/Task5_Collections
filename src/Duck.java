public class Duck extends Collections {
    String name;
    int age;
    String color;
    String sex;

    public Duck(String name, int age, String color, String sex) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Duck{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                '}';
    }
}
