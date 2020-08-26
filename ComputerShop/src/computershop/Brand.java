package computershop;

public enum Brand {
	HP, Lenovo, DELL, APPLE, XiaoMi;
	
	public String toString() {
		switch (this) {
		case HP:     return "HP";
		case Lenovo: return "Lenovo";
		case DELL:   return "DELL";
		case APPLE:  return "APPLE";
		case XiaoMi: return "XiaoMi";
		default:     return "Unspecified";
		}
	}
}
