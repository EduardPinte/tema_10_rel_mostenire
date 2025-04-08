
public class AvionComercial extends Avioane{
	private long maxPasageri;
	
	
	
	public AvionComercial( String avionID, int putereTotala, long maxPasageri) {
		super(avionID, "Comercial", putereTotala);
		this.maxPasageri = maxPasageri;
	}

	
	
	public long getMaxPasageri() {
		return maxPasageri;
	}
	public void setMaxPasageri(long maxPasageri) {
		this.maxPasageri = maxPasageri;
	}
	
	
	

		
	
}
	
