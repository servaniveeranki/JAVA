
import java.util.Scanner;

public class Person {
    private String name;
    private int age;
    public String getname(){
        return name;
    }
    public void setname(String name) {
       this.name = name;
    }
    public int getage() {
        return age;
    }
    public void setage(int age) {
        this.age = age;
    }
    public static void main(String[] args){
      Scanner scanner = new Scanner(System.in);
      Person p = new Person();
      System.out.println("enter name:");
      String name = scanner.nextLine();
      p.setname(name);
      System.out.println("enter age:");
      int age = scanner.nextInt();
      p.setage(age);
      System.out.println("Name:"+p.getname());
      System.out.println("Age:"+p.getage());
    }
}
