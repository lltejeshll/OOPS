// class Car{
//     String brand;
//     String model;
//     int year;

//     Car(String brand , String model, int year){
//         this.brand = brand;
//         this.model = model;
//         this.year = year;
//     }

//     void display() {
//         System.out.println("Brand:" + brand + " model:"  + model + "year:" + year);
//     }
// }

class Vehicle{
    String Brand = "Unknown";

    Vehicle(String Brand){
        this.Brand = Brand;
    }

    void displayBrand(){
        System.out.println("Brand :" + ' ' + Brand);
    }
}

class Car extends Vehicle{
    String Model = "Unknown";

    Car(String Brand , String Model){
        super(Brand);
        this.Model = Model;
    }

    void displayModel(){
        System.out.println("Model : " + ' ' + Model);
    }
}

