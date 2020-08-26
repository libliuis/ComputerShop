package computershop;

public enum CPU {
	I9U, I9H, I5U, I5H, AMD;
	
	public String toString() {
		switch(this) {
		case I9U: return "Intel i9低功耗版";
		case I9H: return "Intel i9标准电压版";
		case I5U: return "Intel i5低功耗版";
		case I5H: return "Intel i5标准电压版";
		case AMD: return "AMD";
		default:  return "unspecified";
		}
	}
}
