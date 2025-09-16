class Person{
    String name;
    int age;
}

class MakingChanges {

    public static void changeIdentities(Person p1, Person p2){
        String temporaryName = p1.name;
        p1.name = p2.name;
        p2.name = temporaryName;

        int temporaryAge = p1.age;
        p1.age = p2.age;
        p2.age = temporaryAge;
    }

    public static void main(String[] args) {
        Person person1 = new Person();
        person1.name = "Ana";
        person1.age = 21;

        Person person2 = new Person();
        person2.name = "Victor";
        person2.age = 20;

        System.out.println("primul pe lista este: " + person1.name + " " + person1.age);
        System.out.println("al doilea pe lista este: " + person2.name + " " + person2.age);

        changeIdentities(person1, person2);

        System.out.println("\nprimul pe lista este: " + person1.name + " " + person1.age);
        System.out.println("al doilea pe lista este: " + person2.name + " " + person2.age);
    }
}
