import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class hashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		hm.put(0, "A");
		hm.put(1, "B");
		hm.put(2, "C");
		hm.put(3, "D");
		
		System.out.println(hm);
		System.out.println(hm.get(0));
		
		Set hs=hm.entrySet();
		Iterator i=hs.iterator();
		
		while(i.hasNext()) {
			Map.Entry m=(Map.Entry)i.next();
			System.out.print(m.getKey());
			System.out.println(m.getValue());
		}
		

	}

}
