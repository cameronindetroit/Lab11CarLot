package carlot.co.grandcircus;

public class UsedCar extends Car {

	private double mileage;

	// Constructor
	public UsedCar(String make, String model, int year, double price, double mileage) {
		super(make, model, year, price);
		this.mileage = mileage;

	}

	// Getter
	public double getMileage() {
		return mileage;
	}

	// Setter
	public void setMileage(double mileage) {
		this.mileage = mileage;
	}

	@Override
	public String toString() {
		return super.toString() + "UsedCar [mileage=" + mileage + "]";
	}

}
