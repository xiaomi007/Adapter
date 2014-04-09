package fr.user;

import fr.adapter.PlugAdapter;
import fr.electricplug.ElectricPlug;
import fr.phone.Phone;

public class Main {

	public static void main(String[] args) {
		
		ElectricPlug ePlug = new ElectricPlug();
		PlugAdapter plug = new PlugAdapter(ePlug);
		Phone sony = new Phone(plug);
		
		sony.charge(plug);
		
	}

}
