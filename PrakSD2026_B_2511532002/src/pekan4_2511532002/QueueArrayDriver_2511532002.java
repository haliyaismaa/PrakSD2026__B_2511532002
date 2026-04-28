package pekan4_2511532002;

public class QueueArrayDriver_2511532002 {

	public static void main(String[] args) {
		QueueArray_2511532002 queue_2002 =new QueueArray_2511532002(1000);
		queue_2002.enqueue_2002(10);
		queue_2002.enqueue_2002(20);
		queue_2002.enqueue_2002(30);
		queue_2002.enqueue_2002(40);
		
		System.out.println("Item di depan "+ queue_2002.front_2002());
		System.out.println("Item paling belakang "+queue_2002.rear_2002());
		System.out.println("\nTampilan Queue");
		queue_2002.display_2002();
		System.out.println();
		
		System.out.println();
		System.out.println(queue_2002.dequeue_2002() +" dihapus dari Queue");
		System.out.println("item di depan    : "+queue_2002.front_2002());
		System.out.println("item di belakang : "+queue_2002.rear_2002());
		System.out.println("Tampilan Queue setelah satu Data dihapus");
		queue_2002.display_2002();
	}
}