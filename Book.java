public class Book {
    String Title;
    String Author; 
    int Price;

    Book(){
        this.Title = "Unknown";
        this.Author = "Unknown";
        this.Price = 0;
    }

    Book(String Title , String Author , int Price){
        this.Title = Title;
        this.Author = Author;
        this.Price = Price;
    }

    void display(){
        System.out.println("Title : " + this.Title + " Author : " + this.Author + " Price : " + this.Price);
    }
}

class Ebook extends Book{
    double FileSize;

    Ebook(String Title , String Author , int Price , double FileSize){
        super(Title , Author , Price);
        this.FileSize = FileSize;
    }

    void display(){
        System.out.println("Title : " + this.Title + " Author : " + this.Author + " Price : " + this.Price + "FileSize : " + FileSize + " MB");
    }
}
