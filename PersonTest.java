public class PersonTest {
    public static void main(String[] args) {
        Person person1 = new Person();
        
        // Populate person1's details using setter methods
        person1.setName("Alice Johnson");
        person1.setAge(28);
        person1.setEmail("alice.johnson@example.com");

        Person person2 = new Person();
        
        // Populate person2's details using setter methods
        person2.setName("Marcus Vance");
        person2.setAge(34);
        person2.setEmail("marcus.vance@example.com");

        System.out.println("Person 1 Information:");
        person1.displayInfo();

        System.out.println("\nPerson 2 Information:");
        person2.displayInfo();
    }
}