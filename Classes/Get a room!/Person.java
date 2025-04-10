public abstract class Person {
    String name, contactNumber;
    int age;
    
    public Person() {
        
    }
    public Person(String name, String contactNumber, int age) {
        this.name = name;
        this.contactNumber = contactNumber;
        this.age = age;
    }

    abstract String summary();
}

