import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args)
    {
       Array array = new Array();
       int n =5;
        array.NhapNgauNhien(5);
       array.In(5);
        System.out.println("\nTong cac PT: " + array.Tong(5));
        array.Chen(8, 1, n);//Chen 8 vao vi tri so 1
        System.out.println("\nA sau khi them 8: ");
        array.In(n+1);
        System.out.println("\n A sau khi xoa vi tri so 2: ");
        array.Xoa(2,n);
        array.In(n);
        array.SapXep(n);
        System.out.println();
        array.In(n);
        array.TimKiem(3,n);


    }
}