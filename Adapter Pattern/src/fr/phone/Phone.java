package fr.phone;

import fr.adapter.PhoneAdapter;
import fr.electricplug.ElectricPlug;

public class Phone {

	static final int       VOLTAGE_IN = 9;

	protected PhoneAdapter Adapter;

	public Phone(PhoneAdapter Adapter) {
		this.Adapter = Adapter;
	}

	public void charge(PhoneAdapter Adapter) {
		if (Adapter.AdapterTention(new ElectricPlug()) > VOLTAGE_IN) {
			System.out.println("The phone is dead");
		} else if (Adapter.AdapterTention(new ElectricPlug()) == VOLTAGE_IN) {
			System.out.println("The phone is normally loading");
		} else {
			System.out.println("The phone is underloading");
		}
	}
}
