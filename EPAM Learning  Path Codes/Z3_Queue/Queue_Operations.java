package Z3_Queue;

public class Queue_Operations {
	int queue[];
	int front;
	int rear;
	int size;

	Queue_Operations(int size) {
		this.size = size;
		queue = new int[size];
		front = -1;
		rear = -1;
	}

	void enqueue(int item) {
		if (rear == size - 1)
			System.out.println("Overflow");
		else if (rear == -1) {
			rear++;
			front++;
			queue[rear] = item;
		} else {
			rear++;
			queue[rear] = item;
		}
	}

	void dequeue() {
		if (front == -1 || front == rear + 1)
			System.out.println("Underflow");
		else
			front++;
	}

	int peek() {
		return queue[front];
	}

	void display() {
		int i = front;
		System.out.println("Queue elements: ");
		while (i <= rear) {
			System.out.print(queue[i] + " ");
			i++;
		}
	}
}