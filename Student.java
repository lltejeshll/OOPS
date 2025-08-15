class Student{
    String Name;
    int marks;


    void display(){
        System.out.println("Name : " + Name + " marks : " + marks);
    }
}

public class Main{
    public static void main(String[] args){
        Student st_1 = new Student();
    st_1.Name = "Sai";
    st_1.marks = 60;
    Student st_2 = new Student();
    st_2.Name = "Surya";
    st_2.marks = 40;

    st_1.display();
    st_2.display();
    }
}