package computershop;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class FindComputer {
	public static void initializeInventory(Inventory inventory) {
		//加入苹果笔记本
		ComputerType CT = ComputerType.Laptop;
		CPU cpu = CPU.I9H;
		Brand brand = Brand.APPLE;
		SubType subtype = SubType.Frivolous;
		PriceRange priceRange = PriceRange.Expensive;
		ScreenSize screenSize = ScreenSize.Medium; 
		Map<String, Object> properties = new HashMap<String, Object>();
		properties.put("ComputerType", CT);
		properties.put("CPU", cpu);
		properties.put("Brand", brand);
		properties.put("SubType", subtype);
		properties.put("PriceRange", priceRange);
		properties.put("ScreenSize", screenSize);
		ComputerSpec spec = new ComputerSpec(properties);
		inventory.addComputer("0001", 9999, spec);
		
		//加入DELL服务器
		CT = ComputerType.Server;
		cpu = CPU.I5H;
		brand = Brand.DELL;
		subtype = SubType.Regular;
		priceRange = PriceRange.Luxury;
		screenSize = ScreenSize.Medium; 
		properties = new HashMap<String, Object>();
		properties.put("ComputerType", CT);
		properties.put("CPU", cpu);
		properties.put("Brand", brand);
		properties.put("SubType", subtype);
		properties.put("PriceRange", priceRange);
		properties.put("ScreenSize", screenSize);
		spec = new ComputerSpec(properties);
		inventory.addComputer("0002", 20000, spec);
		
		//加入联想台式机
		CT = ComputerType.Desktop;
		cpu = CPU.I9U;
		brand = Brand.Lenovo;
		subtype = SubType.Game;
		priceRange = PriceRange.Medium;
		screenSize = ScreenSize.Medium; 
		properties = new HashMap<String, Object>();
		properties.put("ComputerType", CT);
		properties.put("CPU", cpu);
		properties.put("Brand", brand);
		properties.put("SubType", subtype);
		properties.put("PriceRange", priceRange);
		properties.put("ScreenSize", screenSize);
		spec = new ComputerSpec(properties);
		inventory.addComputer("0001", 5000, spec);
	}
	
	
	public static void main(String[] args) {
		Inventory inventory = new Inventory();
		initializeInventory(inventory);
		
		//在此加入电脑类型、屏幕尺寸、CPU、价格区间、子类型、品牌的要求，具体详情参见枚举类
		Map<String, Object> properties = new HashMap<String, Object>();
		Scanner sc = new Scanner(System.in);
        System.out.println("请输入你需要的电脑类型编号：1-笔记本  2-台式机 3-服务器  4-无要求");
        int cpname = sc.nextInt();
        switch(cpname) {
        case 1: 
        	properties.put("ComputerType", ComputerType.Laptop); 
        	break;
        case 2: 
        	properties.put("ComputerType", ComputerType.Desktop);
        	break;
        case 3: 
        	properties.put("ComputerType", ComputerType.Server);
        	break;
        default: 
        	break;
        }
        
        System.out.println("请输入你需要的电脑品牌编号：1-APPLE  2-Lenovo 3-DELL  4-HP 5-Xiaomi 6-无要求");
        int bname = sc.nextInt();
        switch(bname) {
        case 1: 
        	properties.put("Brand", Brand.APPLE); 
        	break;
        case 2: 
        	properties.put("Brand", Brand.Lenovo);
        	break;
        case 3: 
        	properties.put("Brand", Brand.DELL);
        	break;
        case 4:
        	properties.put("Brand", Brand.HP);
        	break;
        case 5:
        	properties.put("Brand", Brand.XiaoMi);
        	break;
        default: 
        	break;
        }
        
        System.out.println("请输入你需要的电脑屏幕大小编号：1-11寸 2-14.3寸  3-15.6寸 4-17.8寸 5-无要求");
        int ssc = sc.nextInt();
        switch(ssc) {
        case 1: 
        	properties.put("ScreenSize", ScreenSize.Small);
        	break;
        case 2: 
        	properties.put("ScreenSize", ScreenSize.Medium);
        	break;
        case 3: 
        	properties.put("ScreenSize", ScreenSize.Big);
        	break;
        case 4: 
        	properties.put("ScreenSize", ScreenSize.VeryBig);
        	break;
        default: 
        	break;
        }
        
        System.out.println("请输入你需要的CPU编号：1-i9H 2-i9U 3-i5H 4-i5U 5-AMD 6-无要求");
        int cn = sc.nextInt();
        switch(cn) {
        case 1: 
        	properties.put("CPU", CPU.I9H);
        	break;
        case 2: 
        	properties.put("CPU", CPU.I9U);
        	break;
        case 3: 
        	properties.put("CPU", CPU.I5H);
        	break;
        case 4: 
        	properties.put("CPU", CPU.I5U);
        	break;
        case 5:
        	properties.put("CPU", CPU.AMD);
        	break;
        default: 
        	break;
        }
        
        System.out.println("请输入你需要的价格区间编号：1-(0-3999) 2-(4000-6999) 3-(7000-9999) 4-(10000-) 5-无要求");
        int pn = sc.nextInt();
        switch(pn) {
        case 1: 
        	properties.put("PriceRange", PriceRange.Cheap);
        	break;
        case 2: 
        	properties.put("PriceRange", PriceRange.Medium);
        	break;
        case 3: 
        	properties.put("PriceRange", PriceRange.Expensive);
        	break;
        case 4: 
        	properties.put("PriceRange", PriceRange.Luxury);
        	break;
        default: 
        	break;
        }
        
		ComputerSpec clientSpec = new ComputerSpec(properties);
		
		
		ArrayList<Computer> AC = inventory.search(clientSpec);
		if(!AC.isEmpty()) {
			System.out.println("You might like these Computers:");
			Iterator<Computer> ite;
			for(ite=AC.iterator();ite.hasNext();) {
				Computer computer = (Computer)ite.next();
				ComputerSpec spec = computer.getSpec();
				System.out.println("We hava a " + spec.getProperty("ComputerType") + " with the following properties:");
				Iterator<String> ites;
				for(ites = spec.getProperties().keySet().iterator();ites.hasNext();) {
					String propertyName = (String)ites.next();
					if(propertyName.equals("ComputerType"))continue;
					System.out.println("   "+ propertyName + ": " + spec.getProperty(propertyName));
				}
				System.out.println(" You can have this "+ spec.getProperty("ComputerType") + " for " + computer.getPrice() + " RMB" + "\n---");
			}
		}
		else {
			System.out.println("Sorry, we have nothing for you.");
		}
	}
}
