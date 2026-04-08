package pekan3_2511532002;

public class stackArrayDriver_2511532002 {

	public static void main(String[] args) {
		stackArray_2511532002 s = new stackArray_2511532002();
		s.push_2511532002(10);
		s.push_2511532002(20);
		s.push_2511532002(30);
		System.out.println(s.pop_2511532002()+" dikeluarkan dari stack");
		System.out.println("Elemen teratas adalah : "+s.peek_2511532002());
		System.out.println("Elemen pada stack : " );
		s.print_2511532002();
	}
}
