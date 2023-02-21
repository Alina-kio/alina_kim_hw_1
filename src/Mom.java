public class Mom extends Grandma{
    private String husbandName;

    public Mom(int age, String name, Hobby hobby, Home home, String husbandName) {
        super(age, name, hobby, home);
        this.husbandName = husbandName;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + "\nHusband: " + getHusbandName();
    }

    public String getHusbandName() {
        return husbandName;
    }


    public void Hobby(){
        System.out.println("Whatch movie");
    }

    public void Hobby(String hobby){
        System.out.println(Hobby.COOKING);
    }

    public final void Hobby(int countOfMovie){
        System.out.println("Count of movie: " + countOfMovie);

    }
}
