public class Calculator {
    
    int multiply(int a , int b){
        return a * b ;
    }

    double multiply(double a , double b){
        return a * b;
    }

    int multiply(int a , int b , int c){
        return a * b * c ;
    }
}

class AdvancedCalculator extends Calculator{

    @Override
    int multiply(int a , int b){
        return a * b * 10;
    }
}



