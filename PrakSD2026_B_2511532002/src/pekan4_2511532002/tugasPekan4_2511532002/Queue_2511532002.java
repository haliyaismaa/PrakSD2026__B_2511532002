package tugasPekan4_2511532002;

public class Queue_2511532002 {
	String queue_2002[];
	int front_2002;
	int rear_2002;
	int max_2002;
	
	public Queue_2511532002(int size) {
		max_2002 =size;
		queue_2002 = new String[max_2002];
		front_2002 = 0;
		rear_2002 = -1;
	}
	
	public boolean isEmpty_2002() {
		return rear_2002 == -1;
	}
	
	public boolean isFull_2002() {
		return rear_2002 == max_2002 -1;
	}
	
	public void enqueue_2002(String data) {
		if (isFull_2002()) {
			System.out.println("Antrian penuh!");
		}else {
			rear_2002++;
			queue_2002[rear_2002] = data;
			System.out.println("Data berhasil ditambahkan ke antrian");
		}
	}
	
	public void dequeue_2002() {
		if (isEmpty_2002()) {
			System.out.println("Antrian Kosong!");
		}else {
			String keluar_2002 = queue_2002[front_2002];
			System.out.println(keluar_2002+" telah dilayani.");
			
			for (int i = front_2002; i<rear_2002; i++) {
				queue_2002[i] = queue_2002[i+1];
			}
			rear_2002--;
		}
	}
	
	public void tampil_2002() {
		if (isEmpty_2002()) {
			System.out.println("Antrian Kosong!");
		}else {
			System.out.println("Isi Antrian : ");
			for (int i=front_2002; i<=rear_2002; i++) {
				System.out.println((i+1) + ". "+queue_2002[i]);
			}
		}
	}
	
	public void reverse() {
		if (isEmpty_2002()) {
			System.out.println("Antrian Kosong!");
		}else {
			int i = front_2002;
			int j = rear_2002;
			
			while (i < j) {
				String temp = queue_2002[i];
				queue_2002[i] = queue_2002[j];
				queue_2002[j] = temp;
				i++;
				j--;
			}
			System.out.println("Antrian berhasil dibalik!");
		}
	}
}