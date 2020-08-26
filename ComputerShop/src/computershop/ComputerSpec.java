package computershop;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ComputerSpec {
	private Map<String, Object> properties = new HashMap<String, Object>();
	
	public ComputerSpec(Map<String, Object> properties) {
			this.properties = properties;
	}
	
	public Object getProperty(String propertyName) {
		return properties.get(propertyName);
	}
	
	public Map<String, Object> getProperties(){
		return properties;
	}
	
	public boolean matches(ComputerSpec otherSpec) {
		Iterator<String> ite;
		for(ite = otherSpec.getProperties().keySet().iterator();ite.hasNext();) {
			String propertyName = (String)ite.next();
			if(!properties.get(propertyName).equals(otherSpec.getProperty(propertyName))) {
				return false;
			}
		}
		return true;
	}
}
