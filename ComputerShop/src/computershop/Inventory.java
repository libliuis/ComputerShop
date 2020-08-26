package computershop;

import java.util.ArrayList;
import java.util.Iterator;

public class Inventory {
	private ArrayList<Computer> inventory = new ArrayList<Computer>();
	
	public void addComputer(String serialNumber, double price, ComputerSpec spec) {
		Computer computer = new Computer(serialNumber, price, spec);
		inventory.add(computer);
	}
	
	public Computer get(String serialNumber) {
		Iterator<Computer> ite;
		for(ite = inventory.iterator(); ite.hasNext();) {
			Computer computer = (Computer)ite.next();
			if(computer.getserialNumber().equals(serialNumber)) {
				return computer;
			}
		}
		return null;
	}
	
	public ArrayList<Computer> search(ComputerSpec otherSpec){
		ArrayList<Computer> AC = new ArrayList<Computer>();
		Iterator<Computer> ite;
		for(ite = inventory.iterator(); ite.hasNext();) {
			Computer computer = (Computer)ite.next();
			if(computer.getSpec().matches(otherSpec)) {
				AC.add(computer);
			}
		}
		return AC;
	}
}
