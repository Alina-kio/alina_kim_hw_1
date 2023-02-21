public final class Daughter extends Mom{
    private String university;
    public Daughter(int age, String name, Hobby hobby, Home home, String husbandName, String university) {
        super(age, name, hobby, home, husbandName);
        this.university = university;
    }

    public String getUniversity() {
        return university;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + "\nUniversity: " + getUniversity();
    }

    @Override
    public void Hobby(String hobby) {
        super.Hobby(hobby);
    }
}
