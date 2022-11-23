package Queue;

public class Queue {
//    int Q[] = new int [10]; // KB queue co 10 PT
    int MAX =5;
    int Q[]=new int[MAX];
    int front = 0, rear =0; // queue rong
    void enqueue(int x) // Them x vao cuoi queue
    {
        Q[rear]=x;        // dua x vao vi tri rear
        rear = (rear + 1) % MAX;
    }
    int dequeue()        // lay PT dau queue
    {
        int x = Q[front]; // Lay PT dau queue
        front = front + 1; //Tang front
        return  x;
    }
    int countEle()
    {

        return (MAX + rear - front) % MAX;
    }
     boolean isEmpty()
    {
        return(front == rear);
    }
    public static void main (String[]args)
    {
        Queue Qe =new Queue();
        Qe.enqueue(1);Qe.enqueue(2);Qe.enqueue(3);
        System.out.printf("front= %d; rear= %d",Qe.front,Qe.rear);
        int x = Qe.dequeue(); //Lay PT dau tien ra
        System.out.printf("\nfront = %d; rear = %d",Qe.front,Qe.rear);
        System.out.printf("\nSo luong PT = %d; rear=%d", Qe.front,Qe.rear);
        System.out.printf("\nSo luong Pt = %d", Qe.countEle());
        x =Qe.peak();
    }

    int peak() // Lay Pt dau tien ma ko xoa
    {
        return  Q[front];
    }
}

