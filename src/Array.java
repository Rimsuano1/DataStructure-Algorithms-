import java.util.Random;
import java.util.Scanner;

public class Array {
    int A[] = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; //khai bao A co 10PT

    void In(int n) {
        for (int i = 0; i < n; i++)
            System.out.print(A[i] + " ");
    }

    void Nhap(int n) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.printf("A[%d] = ", i);
            A[i] = sc.nextInt(); // nhap so nguyen
        }

    }

    void NhapNgauNhien(int n) {
        Random rd = new Random();
        for (int i = 0; i < n; i++) {
            A[i] = rd.nextInt(1, 9);
        }
    }
    //Tinh tong so chan
    int Tong(int n)
    {
        int s = 0;
        for(int i=0; i<n; i++)
            s = s + A[i];
        return s;
    }

    void Chen(int x, int y, int n) // Chen x vao vi tri i
     {
         n++;// tang n len 1 gia tri
         for(int i = n-1; i>y;i--)// keo cac PT lui 1 o
             A[i]=A[i-1];// dua x vao vi tri y
         A[y] = x ;
     }
     void Xoa( int y, int n) // xoa 1 PT tai vi tri y
     {
         for(int i = y; i<n; i++)
             A[i] = A[i+1];//Keo cac PT toi 1 o
        n--;// Giam so luong 1
     }
     void SapXep(int n) // sap xep tang dan
     {
         for(int i=0; i<n;i++)
             for(int j = n-1; j>i;j--)
                 if(A[j] < A[j-1])
                 {
                     int t = A[j];
                     A[j] =A[j-1];
                     A[j-1] =t;
                 }
     }
     void TimKiem(int x, int n) //tim x trong n PT
     {
         int timThay = -1; // khong thay x
         for(int i=0; i<n; i++)
             if(A[i] == x)
                 timThay = i;
         if(timThay== -1)
             System.out.println("\nKo tim thay x= "+x);
         else
             System.out.printf("\nTim thay x = %d tai vi tri %d",x , timThay);
     }


}

