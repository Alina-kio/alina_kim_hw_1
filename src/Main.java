public class Main {
    public static void main(String[] args) {
//        В главном классе (Main) Создать объект класса 2-го уровня (objectA)
//        и 2 объекта класса 3-го уровня (objectB, objectC),
//        также распечатать все свойства объектов и вызвать перегруженные
//        методы через каждый из экземпляров ваших объектов.



        Home home = new Home("Bishkek","Ahunbaeva");
        Mom mom = new Mom(40, "Irina", Hobby.COOKING, home, "Oleg");

        Daughter daughter1 = new Daughter(19, "Alina", Hobby.COOKING, home, "None", "Alatoo");
        Daughter daughter2 = new Daughter(19, "Arina", Hobby.READING, home, "None", "Alatoo");

        System.out.println(mom.getInfo());
        System.out.println();
        System.out.println(daughter1.getInfo());
        System.out.println();
        System.out.println(daughter2.getInfo());

        System.out.println();
        mom.Hobby();
        mom.Hobby("Friends");
        mom.Hobby(12);

        daughter1.Hobby("Кушать суши и роллы");
        daughter2.Hobby("Создавать графический дизайн");
    }
}