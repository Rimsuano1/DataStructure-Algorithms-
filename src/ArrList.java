

import java.util.ArrayList;
import java.util.Random;

public class ArrList {
    ArrayList<Integer> arrayList=new ArrayList();
    ArrayList<String> Sdsv= new ArrayList<>();
    void Add(){
        Random rd=new Random();
        for (int i = 1; i <=5 ; i++) {
            int x=rd.nextInt(1,10);
            arrayList.add(x);
        }
    }
    void Get(){
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.print(arrayList.get(i)+" ");
        }
    }
    public static void main(String[] args) {
        ArrList arrList=new ArrList();
        arrList.Add();
        arrList.Get();
        System.out.println("\nsize of arrayList: "+arrList.arrayList.size());
        System.out.println("\nisEmpty: "+arrList.arrayList.isEmpty());
        System.out.println("\nContain 5: "+arrList.arrayList.contains(5));
        System.out.println("\nindexOf 5: "+arrList.arrayList.indexOf(5));
        arrList.arrayList.add(2,8); // add
        System.out.println("\nAdd(2,8): \n");
        arrList.Get();
        arrList.arrayList.remove(2); // xoa "remove
        System.out.println("\nRemove(2): ");
        arrList.Get();
        arrList.arrayList.set(2,10); // Thay so 10 vao vi tri so 2 sd "get"
        System.out.println("\nset(2,10): \n");
        arrList.Get();
        arrList.arrayList.get(3);
        System.out.println("\nget(3): " +arrList.arrayList.get(3));
        arrList.Get();
        for(String x:arrList.Sdsv)
            System.out.printf("&s \n",x);
    }
}