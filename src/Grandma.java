public class Grandma {
    private int age;
    private String name;
    private Hobby hobby;
    private Home home;



    public Grandma(int age, String name, Hobby hobby, Home home) {
        this.age = age;
        this.name = name;
        this.hobby = hobby;
        this.home = home;
    }


    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public Hobby getHobby() {
        return hobby;
    }

    public Home getHome() {
        return home;
    }

    public String getInfo (){
        return "Age: " + age +
                "\nName: " + name +
                "\nWorking: " + hobby +
                "\nCountry: " + home.getCountry() +
                "\nAddress: " + home.getAddress();
    }
}
