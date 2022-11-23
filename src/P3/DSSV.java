package P3;

class SV{
    String ID, Name , phone , clas; // Data
    SV next;
    SV( String ID,String Name ,String phone ,String clas){
        this.ID = ID;
        this.Name =Name;
        this.phone =phone;
        this.clas=clas;
    }

}
class Node{
    SV data;                // Phan data la mot sinh vien
    Node next;
}
public class DSSV
 {
     Node head = null;
     Node tail = null;
     void addFirst(SV x)
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
     void  InDS(){
         Node p =head;
         System.out.println(" ID\t\t\t\tName\t\t\t\tPhone\t\t\tClass");
         while(p!=null){
             System.out.printf("%8s\t%12s\t", p.data.ID, p.data.Name);
             System.out.printf("%8s\t%12s\t", p.data.phone, p.data.clas);
             System.out.println(); // Xuong hang moi
             p=p.next;
         }
     }
     // Chuc nang CRUD, Search
     public static void main (String[]args){
         DSSV DS =new DSSV();
            SV s1 = new SV("GCD201574", "Huynh Ngoc Hoang Loc", "0766753759", "GCD1001");
            DS.addFirst(s1);
         SV s2 = new SV("GCD201575", "Huynh Ngoc Hoang Trinh", "0766899779", "GCD1006");
         DS.addFirst(s2);
         DS.InDS();
     }

}
