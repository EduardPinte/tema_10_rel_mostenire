
public class FlotaAeriana {

	public static void main(String[] args) {
		AvionLupta f16 = new AvionLupta("F16-001", 5000);
		AvionComercial boeing = new AvionComercial("Boeing-747",4000,300);
		Concord concorde = new Concord("Concorde=001",6000,150);

		System.out.println("Avion de lupta:"+f16.getAvionID()+ ",putere:"+f16.getPutereTotala());
		System.out.println("Avion comercial:"+boeing.getAvionID()+", pasageri maimi: "+boeing.getMaxPasageri());
	
		concorde.goSuperSonic();
		concorde.goSubSonic();
	}
}
