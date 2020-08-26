package computershop;

public class Computer {
	private String serialNumber;
	private double price;
	private ComputerSpec spec;
	
	public Computer(String serialNumber, double price, ComputerSpec spec) {
		this.serialNumber = serialNumber;
		this.price = price;
		this.spec = spec;
	}
	
	public String getserialNumber() {
		return serialNumber;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public double getPrice() {
		return price;
	}
	
	public ComputerSpec getSpec() {
		return spec;
	}
}
