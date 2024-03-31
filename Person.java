public class Person {
    private String name;
    private String address;
   
    // konstruktor
    public Person(String name, String address) {
    this.name = name;
    this.address = address;
    }
   
    // getter
    public String getName() {
        return name;
    }
    public String getAddress() {
        return address;
    }
   
    public String toString() {
        return name + "(" + address + ")";
    }
   }

   

