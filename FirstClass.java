package CollegeLab;

class Details {
    String name; ;
    int age;

    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age= age;
    }

    public void printDetails(){
        System.out.println("My details : ");
        System.out.println(this.name);
        System.out.println(this.age);
    }
}
public class FirstClass {

    public static void main(String[] args) {

        FirstClass obj = new FirstClass();

        Details ob = new Details();
        System.out.println("My details");
        System.out.println(ob.name);
        System.out.println(ob.age);

        ob.setName("Arpita");
        ob.setAge(20);

        ob.printDetails();
    }
}
