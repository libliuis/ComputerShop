package computershop;

public enum PriceRange {
	Cheap, Medium, Expensive, Luxury;
	public String toString() {
		switch(this) {
		case Cheap:     return "0-3999";
		case Medium:    return "4000-6999";
		case Expensive: return "7000-9999";
		case Luxury:    return "10000-";
		default:        return "Unspecified";
		}
	}
}
