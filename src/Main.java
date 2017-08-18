public class Main {
    public static void main(String[] args) {
        Person person = new Person("Dorota", "Nowak", Gender.WOMEN);
        Person person1 = new Person("Tomasz", "Nowak", Gender.MEN);


        System.out.println();
        System.out.println(person.getName() + " ma makijaż? " + person.getGender().isHasMakeup());
        System.out.println(person1.getName() + " ma makijaż? " + person1.getGender().isHasMakeup());
        System.out.println("-----------------------------------------------");
        System.out.println("Opis: " + Weather.CLOUDYDAY.getLongDesc());
        System.out.println("Pada? " + Weather.CLOUDYDAY.isRaining());
        System.out.println("Swieci słońce? " + Weather.CLOUDYDAY.isSunshining());

    }
}