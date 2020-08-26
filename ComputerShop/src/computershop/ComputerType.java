package computershop;

public enum ComputerType {
	Desktop, Laptop, Server;
	
	public String toString() {
		switch(this) {
		case Desktop: return "Desktop";
		case Laptop:  return "Laptop";
		case Server:  return "Server";
		default:      return "Unspecified";
		}
	}
}
