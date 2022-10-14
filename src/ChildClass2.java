import java.util.ArrayList;
import java.util.List;

public class ChildClass2 extends EncasulationWithPojo{
	public static void main(String[] args) {
		EncasulationWithPojo e = new EncasulationWithPojo();
		e.setAge(20);
		e.setName("praveen");
		e.setAvg(450);
		EncasulationWithPojo e1 = new EncasulationWithPojo();
		e1.setName("arun");
		e1.setAvg(500);
		e1.setAge(20);
		 
	  List<EncasulationWithPojo> l = new ArrayList();
	  l.add(e);
	  l.add(e1);
	  for (EncasulationWithPojo encasulationWithPojo : l) {
		  System.out.println(encasulationWithPojo.getAge());
		
	}
		
		
		
		
		
		
	}

}
