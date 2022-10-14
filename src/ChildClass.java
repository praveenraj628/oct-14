import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class ChildClass {

	public static void main(String[] args) {
		
		EncasulationWithPojo e = new EncasulationWithPojo();
		
		e.setAge(23);
		e.setName("pra");
		e.setAvg(747.4647f);
		EncasulationWithPojo e1 = new EncasulationWithPojo();
		e1.setAge(30);
		e1.setName("praveen");
		
		e1.setAvg(66788.89f);

	
	Map<Integer,EncasulationWithPojo> n = new TreeMap<>();
	
	n.put(1, e);
	n.put(2, e1);
	
Set<Entry<Integer,EncasulationWithPojo>> entrySet = n.entrySet();
for (Entry<Integer, EncasulationWithPojo> entry : entrySet) {
 String name = entry.getValue().getName();
 System.out.println(name);
}
	
	
	}
}
