package pekan4_2511532002;

public class QueueArray_2511532002 {
	int front_2002, rear_2002, size_2002;
	int capacity_2002;
	int array_2002[];
	
	public QueueArray_2511532002(int capacity_2002) {
		this.capacity_2002=capacity_2002;
		front_2002=this.size_2002=0;
		rear_2002=capacity_2002-1;
		array_2002=new int [this.capacity_2002];
	}
	
	boolean isFull_2002 (QueueArray_2511532002 queue_2002) {
		return (queue_2002.size_2002 == queue_2002.capacity_2002);	
	}
	
	boolean isEmpty_2002(QueueArray_2511532002 queue_2002) {
		return (queue_2002.size_2002 == 0);
	}
	
	void enqueue_2002(int item) {
		if (isFull_2002 (this))
			return;
		this.rear_2002=(this.rear_2002 +1)% this.capacity_2002;
		this.array_2002[this.rear_2002]=item;
		this.size_2002 = this.size_2002+1;
		System.out.println(item + "enqueue to queue");
	}
	
	int dequeue_2002 () {
		if (isEmpty_2002 (this))
			return Integer.MIN_VALUE;
		int item =this.array_2002[this.front_2002];
		this.front_2002=(this.front_2002+1)%this.capacity_2002;
		this.size_2002=this.size_2002-1;
		return item;
	}
	
	int front_2002() {
		if (isEmpty_2002(this))
			return Integer.MIN_VALUE;
		
		return this.array_2002[this.front_2002];
	}
	
	int rear_2002() {
		if (isEmpty_2002(this))
			return Integer.MIN_VALUE;
		return this.array_2002[this.rear_2002];
	}
	
	//Mencetak elemen antrian
	void display_2002() {
		int i;
		if (front_2002 == rear_2002) {
			System.out.println("\nAntrian Kosong\n");
			return;
		}
		
		//Kunjungi dari belakang, dan cetak
		for (i=front_2002; i<rear_2002; i++) {
			System.out.printf("%d <---", array_2002 [i]);
		}
		return;
		}
}