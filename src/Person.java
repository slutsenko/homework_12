

public class Person {
    String name;
    String surName;
    String lastName;
    String birthday;

    public Person(String name, String surName) {
        this.name = name;
        this.surName = surName;
    }

    public Person(String name, String surName, String lastName, String birthday) {
        this.name = name;
        this.surName = surName;
        this.lastName = lastName;
        this.birthday = birthday;
    }

    public Person(String fullName) {

    }

    public String fullName() {
        String fullName = surName + " " + name + " " + lastName;
        return fullName;
    }

    public String fullNameShort() {
        char name1 = name.charAt(0);
        char lastName1 = lastName.charAt(0);

        String fullNameShort = surName + " " + name1 + ". " + lastName1 + ".";
        return fullNameShort;
    }




}
