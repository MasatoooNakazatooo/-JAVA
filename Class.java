class Student {
    String name = "sato";
    public  void main(int math, int english) {
     System.out.println((math + english)/2);
        // return (math + english)/2;
    }
    
}

public class Class{
public static void main(String[] args) {
    Student a001 = new Student();
    System.out.println(a001.name);
    // int result = a001.main(100, 50);
    a001.main(50, 42);
}
}
