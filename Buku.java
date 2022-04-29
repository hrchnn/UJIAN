
import java.util.Scanner;
public class Buku {
    int id,tahun;
    String judul;
    Buku next;
    public static Scanner in=new Scanner(System.in);
    public static Scanner str=new Scanner(System.in);
    public void input(){
        System.out.print("Masukkan id buku      : ");
        id=in.nextInt();
        System.out.print("Masukkan judul        : ");
        judul=str.nextLine();
        System.out.print("Masukkan tahun terbit : ");
        tahun=in.nextInt();
        next=null;
    }
    public void view(){
        System.out.println("id buku      : "+id);
        System.out.println("judul        : "+judul);
        System.out.println("tahun terbit : "+tahun);
    }
    public static void main(String[] args) {
        int menu=0;
        linked st=new linked();
        while(menu!=4){
            System.out.print("1.push\n2.pop\n3.view\n4.exit\n : ");
            menu=in.nextInt();
            if(menu==1){
                Buku baru=new Buku();
                baru.input();
                st.push(baru);
            }
            else if(menu==2) st.pop();
            else if(menu==3) st.view();
            else if(menu==4) System.out.println("keluar . . .");
            else System.out.println("salah . . .");
            System.out.println(" ");
        }
    }    
}
class linked{
    Buku top;
    public linked(){
        top=null;
    }
    public void push(Buku a){
        if(top==null) top=a;
        else{
            a.next=top;
            top=a;
        }
    }
    public void pop(){
        if(top==null) System.out.println("kosong");
        else{
            System.out.println("Popping Data . . .");
            top.view(); 
            top=top.next;
        }
    }
    public void view(){
        if(top==null) System.out.println("kosong");
        else{
            Buku ptr=top;
            while(ptr!=null){
                System.out.println("- - - - -");
                ptr.view();
                ptr=ptr.next;
            }
        }
    }
}