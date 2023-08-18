class ComplexNumber {
    double real;
    double imaginary;

    ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    // Method to add two complex numbers
    ComplexNumber add(ComplexNumber other) {
        return new ComplexNumber(this.real + other.real, this.imaginary + other.imaginary);
    }

    // Method to multiply two complex numbers
    ComplexNumber multiply(ComplexNumber other) {
        double newReal = this.real * other.real - this.imaginary * other.imaginary;
        double newImaginary = this.real * other.imaginary + this.imaginary * other.real;
        return new ComplexNumber(newReal, newImaginary);
    }

    @Override
    public String toString() {
        return real + " + " + imaginary + "i";
    }
}

public class Main {
    public static void main(String[] args) {
        ComplexNumber num1 = new ComplexNumber(3, 4);
        ComplexNumber num2 = new ComplexNumber(1, 2);

        ComplexNumber sum = num1.add(num2);
        ComplexNumber product = num1.multiply(num2);

        System.out.println("Complex Number 1: " + num1);
        System.out.println("Complex Number 2: " + num2);
        System.out.println("Sum: " + sum);
        System.out.println("Product: " + product);
    }
}
