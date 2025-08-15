// public class Main{
//     public static void main(String[] args){
//         NewStudent s1 = new NewStudent("Tejesh" , 40);
//         NewStudent s2 = new NewStudent("Nikhita" , 40);
//         s1.display();
//         s2.display();
//     }
// }

// public class Main{
//     public static void main(String[] args){
//         Car car1 = new Car("BMW" , "X1" , 2024);

//         Car car2 = new Car("AUDI" , "Q3" , 2023);

//         car1.display();
//         car2.display();
//     }
// }

// public class Main{
//     public static void main(String[] args){
//         Book book1 = new Book(); 
//         Book book2 = new Book("Harry Potter", "J.K. Rowling", 500);
//         Ebook ebook1 = new Ebook("Digital Marketing", "Seth Godin", 400, 50.0);

//         book1.display();
//         book2.display();
//         ebook1.display();
//     }
// }

// public class Main{
//     public static void main(String[] args){
//         Car car1 = new Car("BMW" , "X1");
//         Car car2 = new Car("AUDI" ,"Q3" );

//         car1.displayBrand();
//         car2.displayModel();

//     }
// }


// public class Main {
//     public static void main(String[] args) {
//         Shape s1 = new Shape();
//         System.out.println("Shape area: " + s1.area(5, 10));

//         Shape s2 = new Rectangle();  // parent ref, child object
//         System.out.println("Rectangle area: " + s2.area(5, 10));
//     }
// }


// public class Main {
//     public static void main(String[] args){
//         Calculator c1 = new Calculator();
//         Calculator c2 = new Calculator();
//         Calculator c3 = new AdvancedCalculator();   

//         System.out.println(c1.multiply(2 , 3));
//         System.out.println(c2.multiply(2.1 , 2.2));
//         System.out.println(c3.multiply(2 , 3));
//         }
//     }


// public class Main{
//     public static void main(String[] args){
//         Circle c = new Circle();
//         Rectangle r = new Rectangle();
//         c.draw();
//         r.draw();
//     }
// }


public class Main{
    public static void main(String[] args){
        BankAccount b1 = new BankAccount(101 , 1000);
        SavingsAccount s1 = new SavingsAccount(102,2222, 0.5);
        CurrentAccount c1 = new CurrentAccount(103, 2222, 500);

        b1.deposit(1000);
        s1.deposit(400);
        c1.deposit(500);

        b1.withdraw(200);
        s1.withdraw(100);
        c1.withdraw(2200);

        b1.CalculateYearlyInterest();
        s1.CalculateYearlyInterest();
        c1.CalculateYearlyInterest();


        System.out.println("BankAccount balance: " + b1.getBalance());
        System.out.println("SavingsAccount balance: " + s1.getBalance());
        System.out.println("CurrentAccount balance: " + c1.getBalance());
    } 
}