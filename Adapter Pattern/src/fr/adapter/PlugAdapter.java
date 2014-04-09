package fr.adapter;

import fr.electricplug.ElectricPlug;

public class PlugAdapter implements PhoneAdapter {

	private ElectricPlug ePlug = new ElectricPlug();

	public PlugAdapter(ElectricPlug ePlug){
		this.ePlug = ePlug;
	}


	@Override
    public int AdapterTention(ElectricPlug ePlug) {
		
	    return 9;
    }
	

}
