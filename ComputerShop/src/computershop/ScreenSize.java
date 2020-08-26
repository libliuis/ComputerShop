package computershop;

public enum ScreenSize {
	Small, Medium, Big, VeryBig;
	
	public String toString() {
		switch(this) {
		case Small:   return "11英寸及以下";
		case Medium:  return "14.3英寸";
		case Big:     return "15.6英寸";
		case VeryBig: return "17.8英寸";
		default:      return "Unspecified";
		}
	}
}
