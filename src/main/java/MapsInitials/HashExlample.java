package MapsInitials;

public class HashExlample {

    public static void main(String[] args) {

        MapsInitials.Student student1 = new Student("John", "Kow", 1);
        Student student2 = new Student("John", "Kow", 17);

        System.out.println(student1.equals(student2));
        System.out.println(student1.hashCode());
        System.out.println(student2.hashCode());
    }
}
