
public class App {
	public static void main(String[] args){
		List<Person> listPerson = new LinkedList<Person>();
		Person p1 = new Person(10,  "negin");
		Person p2 = new Person(20,  "amir");
		Person p3 = new Person(30,  "foad");
		Person p4 = new Person(40,  "sara");
		
		listPerson.insert(p1);
		listPerson.insert(p2);
		listPerson.insert(p3);
		listPerson.insert(p4);
		
		listPerson.traverseList();
		System.out.println();
		listPerson.remove(p1);
		listPerson.traverseList();
		listPerson.remove(p3);
		System.out.println();
		listPerson.traverseList();
	}
}
