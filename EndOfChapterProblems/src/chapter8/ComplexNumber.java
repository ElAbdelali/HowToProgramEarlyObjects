package chapter8;

public class ComplexNumber {
	
	   	private int real;
	    private int imaginary;

	    public static void main(String[] args){

	        ComplexNumber obj1 = new ComplexNumber(1, 9);
	        ComplexNumber obj2 = new ComplexNumber(4, 6);
	        System.out.print(obj1.toString(obj1.add(obj2)));
	        System.out.printf("%n%s",obj1.toString(obj1.subtract(obj2)));
	    }

	    public ComplexNumber(){
	        real = 0;
	        imaginary = 0;

	    }

	    public ComplexNumber(int a, int b){
	        real = a;
	        imaginary = b;
	    }

	    private ComplexNumber add(ComplexNumber obj1){
	        ComplexNumber res = new ComplexNumber();
	        res.real = this.real + obj1.real;
	        res.imaginary = this.imaginary + obj1.imaginary;
	        return res;
	    }

	    private ComplexNumber subtract(ComplexNumber obj1){
	        ComplexNumber res = new ComplexNumber();
	        res.real = this.real - obj1.real;
	        res.imaginary = this.imaginary - obj1.imaginary;
	        return res;
	    }

	    public String toString(ComplexNumber obj1){
	        return String.format("%d + %di", obj1.real, obj1.imaginary);
	    }


	}