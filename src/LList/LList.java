package LList;
class Node // Tao cac node
    {
        int data; //Phan chua du lieu
        Node next; //Chua dia chi node tiep tjep
    }

public class LList
    {
        Node head = null; // Dau danh sach
        Node tail = null; // Cuoi danh sach

        void AddFisrt(int x) //Them x vao dau DS
        {
            Node p = new Node(); //Tao 1 node moi
            p.data = x; // dua x vao phan data  cua p
            p.next = null;

            if(head == null) // Danh sach rong
                head = tail = p;
            else  // Danh sach khong rong
            {
                p.next = head;
                head = p;
            }
        }

        void inDs()
        {
                Node p = head;
                while (p != null)
                {
                    System.out.print(p.data+ " "); // in phan du lieu
                    p=p.next;                   // di chuyen qua node tiep theo
                }
        }
 void AddLast(int x){
            Node p = new Node();
            p.data = x;
            p.next= null;
            if(head == null)
                head = tail = p;
            else {
                tail.next = p;
                tail = p;
            }
 }
            int Search(int x) //Tra ve vi tri tim thay x neu ko tra ve -1
            {
                int vt = -1;
                Node p = head;
                 while (p!=null) {
                     vt++;
                     if (p.data == x)
                         return vt;
                     p=p.next;
                 }
             return -1;
            }
            void delFirst() //Xoa dau
            {
                head = head.next;;
            }
            void delLast() //Xoa cuoi
            {
                Node p = new Node();
                p.next = null;
                p =tail;
            }
        int getSize() // Lay so luong phan tu cua danh sach
        {
            int dem = 0;
            Node p = head;
            while (p != null) {
                dem++;
                p = p.next;
            }
            return dem;
        }
        public static void main(String[]args){
            LList L = new LList();
            L.AddFisrt(1); L.AddFisrt(2);L.AddFisrt(3); // 321
            L.inDs();
            L.AddLast(9);
            System.out.println("\nDanh sach sau khi add last: ");
            L.inDs();
            L.delFirst();
            System.out.println("\nDanh sach sau khi xoa trc");
            L.inDs();
            System.out.println("\nSo luong phan tu: "+L.getSize() );
            int x =8 ;
            System.out.printf("\nCo %d?: %d", x,L.Search(x));


        }

    }
