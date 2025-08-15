public class NewStudent {
    String Name;
    int marks;

    NewStudent(String s , int m){
        Name = s;
        marks = m;
    }

    void display(){
        System.out.println("Name: " + Name + ", marks: " + marks);
    }
}
