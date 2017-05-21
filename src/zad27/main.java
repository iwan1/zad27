package zad27;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;



public class main {
	
	//static Integer wiek = new Integer(25);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, Set<Person>> wiekowo = new HashMap<Integer, Set<Person>>();
		Set<Person> rowiesnicy24 = new HashSet<Person>();
		Set<Person> rowiesnicy92 = new HashSet<Person>();
		
		
		rowiesnicy24.add(new Person("Maciej", "Iwanski"));
		rowiesnicy24.add(new Person("Maciej", "Jasko"));
		rowiesnicy24.add(new Person("Karol", "Pozdzial"));
		
		rowiesnicy92.add(new Person("Bohdan", "Bazuka"));
		rowiesnicy92.add(new Person("Zbigniew", "Stonoga"));
		
		wiekowo.put(24, rowiesnicy24);
		wiekowo.put(92, rowiesnicy92);
		
		
		//wiekowo.get();
		
		if(wiekowo.get(25) == null){
			Set<Person> rowiesnicy25 = new HashSet<Person>();
			rowiesnicy25.add(new Person("Ktos", "Fajny"));
			wiekowo.put(25, rowiesnicy25);
		}
		
	}

}
