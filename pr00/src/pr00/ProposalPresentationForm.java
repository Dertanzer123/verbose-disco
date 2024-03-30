package pr00;

import java.util.List;

import pr00.Corp;
import pr00.Machine;

public class ProposalPresentationForm {
	private Corp      formercorp;
	private Corp      sellercorp;
	private List<Machine> machines;
	public ProposalPresentationForm(Corp formercorp , Corp sellercorp,Machine[] machines) {
		
		this.formercorp=formercorp;
		this.sellercorp=sellercorp;
		for(int i=0;i<machines.length;i++)
		{
			this.machines.add(machines[i]);	
		}
		
		
	}
	public Corp getFormercorp() {
		return formercorp;
	}
	public void setFormercorp(Corp formercorp) {
		this.formercorp = formercorp;
	}
	public Corp getSellercorp() {
		return sellercorp;
	}
	public void setSellercorp(Corp sellercorp) {
		this.sellercorp = sellercorp;
	}
	public List<Machine> getMachines() {
		return machines;
	}
	public void setMachines(List<Machine> machines) {
		this.machines = machines;
	}
}
