
public class Car {

       	private int modelYear;     
	private String brand;    
       	private int price;     
	private int modelNumber;




public static void main(String args[]) {

	Car c1 = new Car();
	Car c2 = new Car(2019,980,25000, "prius");
	Car c3 = new Car(c2);
	
	// c4 is shallow copy 
	Car c4 = c1;

	c1.printMe();
	c4.printMe();

	c4.setPrice(5000);

	//c1 shows aliasing, c4 method changed c1's price field
	c1.printMe();




}


// default constructor
public Car() {
		modelYear = 0;
		brand = "";
		price = 0;
		modelNumber = 0;
	}

// parametrized constructor
public Car(int mYear, int mNum, int price, String brand) {
		modelYear = mYear;
		this.brand = brand;
		this.price = price;
		modelNumber = mNum;
	}

public Car(Car car) {
	this(car.getModelYear(),car.getModelNumber(),car.getPrice(),car.getBrand());
	}

// getters and setters
public int getPrice() {
	return price;
}

public int getModelNumber() {
	return modelNumber;
}

public int getModelYear() {
	return modelYear;
}

public String getBrand() {
	return brand;
}

public void setPrice(int p) {
	price = p;
}

public void setModelYear(int m) {
	modelYear = m;
}

public void setModelNumber(int m) {
	modelNumber = m;
}

public void setBrand(String b) {
	brand = b;
}

// toString overriding
@Override
public String toString() {

	return brand + ", " + modelNumber + ", " + modelYear + ", " + price;
}

//prints car info
public void printMe() {

	System.out.println(this);
}

}


