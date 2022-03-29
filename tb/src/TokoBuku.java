import java.util.Scanner;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

import java.util.*;

public class TokoBuku  {

    public static void main(String[] args) {
        
        //deklarasi variabel
        int menu,CekP,inputCD,Pesanan;
        String nama,PCD,hapusNama,hapusPesanan,hapusCD;
        //deklarasi array
        String[] arrPesanan;
        arrPesanan = new String[6];
        String[] cd;
        cd = new String[4];
        
        //BUKU
        arrPesanan[0] = "Keajaiban Toko Kelontong Namiya";
        arrPesanan[1] = "Fericuli Fericula";
        arrPesanan[2] = "This Is Why I Need You";
        arrPesanan[3] = "Ayahku (Bukan) Pembohong";
        arrPesanan[4] = "Murder In The Crooked House";
        arrPesanan[5] = "Sketsa Mendung";
        //CD
        cd[0] = "CD Audiobook";
        cd[1] = "CD Music";
        cd[2] = "CD About The Book";
        cd[3] = "CD How its Made";
        
        //deklarasi input
        Scanner input=new Scanner(System.in);
        Scanner m1=new Scanner(System.in);
        Scanner m2=new Scanner(System.in);
        Scanner m3=new Scanner(System.in);
        Scanner m6=new Scanner(System.in);
        Scanner m61=new Scanner(System.in);
        Scanner m7=new Scanner(System.in);
        //deklarasi queue
        Queue<String> name= new LinkedList<>();
        Queue<String> pesan= new LinkedList<>();
        Queue<String> pesanCd= new LinkedList<>();
        //deklarasi stack
        Stack<String> merch = new Stack<String>();
        //CD 1
        merch.push("Merch-1");
        merch.push("Merch-2");
        merch.push("Merch-3");
        merch.push("Merch-4");
        merch.push("Merch-5");
        merch.push("Merch-6");
        

        System.out.println("\n-----------------------------------------------------");
        System.out.println("\tSelamat datang di Toko Buku Namiya");
        System.out.println("------------------------------------------------------");
        System.out.println("\tPre-Order Buku Terbaru Dimulai!!!");
        System.out.println("------------------------------------------------------");
        
        do{
            System.out.println("\n\n");
            System.out.println("--------------------------");
            System.out.println("     MENU PEMESANAN BUKU  ");
            System.out.println("--------------------------");
            System.out.println("1. Masuk Antrian");
            System.out.println("2. Pesan BUKU ");
            System.out.println("3. Pesan CD ");
            System.out.println("4. Pesanan Siap ");
            System.out.println("5. Lihat data MEMBER");
            System.out.println("6. Cek Merch Tersedia");
            System.out.println("7. Hapus Data MEMBER");
            System.out.println("8. Cek Pohon Biner Traversal");
            System.out.println("9. Graph");
            System.out.println("10.Keluar");
            System.out.println("--------------------------");
            System.out.print("     Pilihan Anda : ");
            menu=input.nextInt();
            System.out.println("\n");
            if(menu==1){
                System.out.println("--------------------------");
                System.out.print("Masukan nama      : ");
                nama = m1.nextLine();
                name.add(nama);
                if(nama==""){
                    System.out.println("Nama Masih Kosong!!");
                    
                }else{
                    System.out.println("Nama Tersimpan!!");
                }

                
                
                

            }else if(menu==2){
                System.out.println("----------------------");
                System.out.println("||**PRE-ORDER BUKU**||");
                System.out.println("----------------------");
                System.out.println("| 1.Keajaiban Toko Kelontong Namiya");
                System.out.println("| 2.Fericuli Fericula");
                System.out.println("| 3.This Is Why I Need You");
                System.out.println("| 4.Ayahku (Bukan) Pembohong");
                System.out.println("| 5.Murder In The Crooked House");
                System.out.println("| 6.Sketsa Mendung");
                System.out.println("----------------------");
                System.out.print("PILIHAN : ");
                Pesanan = m2.nextInt();
                    if(Pesanan==1){
                    pesan.add(arrPesanan[0]);
                }else if(Pesanan==2){
                    pesan.add(arrPesanan[1]);
                }else if(Pesanan==3){
                    pesan.add(arrPesanan[2]);
                }else if(Pesanan==4){
                    pesan.add(arrPesanan[3]);
                }else if(Pesanan==5){
                    pesan.add(arrPesanan[4]);
                }else if(Pesanan==6){
                    pesan.add(arrPesanan[5]);
                }else{
                    System.out.println("Tidak Tersedia!!");
                }

                
                
            }else if(menu==3){
                System.out.println("--------------------------");
                System.out.println("\t  PILIH MENU CD  ");
                System.out.println("--------------------------");
                System.out.println("1. "+cd[0]);
                System.out.println("2. "+cd[1]);
                System.out.println("3. "+cd[2]);
                System.out.println("4. "+cd[3]);
                System.out.println("--------------------------");
                System.out.print("PILIHAN : ");
                inputCD = m3.nextInt();
                if(inputCD==1){
                    pesanCd.add(cd[0]);
                    
                }else if(inputCD==2){
                    pesanCd.add(cd[1]);
                    
                }else if(inputCD==3){
                    pesanCd.add(cd[2]);
                    
                }else if(inputCD==4){
                    pesanCd.add(cd[3]);
                    
                }else{
                    System.out.println("Tidak Tersedia!!");
                }
                //STACK_POP
                merch.pop();
                System.out.println("PESANAN TERSIMPAN!!");
                

                
                

            }else if(menu==4){
                if(name.isEmpty()){
                    System.out.println("CEK KEMBALI MEMBER ANDA!!");
                }else{
                System.out.println("NOTICE!!");
                System.out.println("Pemanggilan atas nama : "+name.poll());
                pesan.poll();
                pesanCd.poll();
                }

                
            }else if(menu==5){
                if(name.isEmpty()){
                    System.out.println("TIDAK ADA MEMBER!!");
                }else{
                    
                    System.out.println("--------------------------");
                    System.out.println("        DATA MEMBER");
                    System.out.println("--------------------------");
                    System.out.println("|| NAMA       : "+name);
    
                    System.out.println("|| BUKU       : "+pesan);
    
                    System.out.println("|| CD        : "+pesanCd);
                    System.out.println("--------------------------");
                    System.out.println("|| MEMBER PERTAMA  : "+name.peek());
                    System.out.println("|| TOTAL MEMBER    : "+name.size());

                }

                

                
                
            }else if(menu==6){
                System.out.println("1.Lihat Jumlah merch ");
                System.out.println("2.Tambah Tumpukan Merch ");
                System.out.println("3.Ambil Merch Tumpukan Teratas");
                System.out.println("----------------------");
                System.out.print("PILIH  : ");
                CekP = m6.nextInt();
                if(CekP==1){
                    System.out.println(""+merch);
                }else if(CekP==2){
                    System.out.print("Masukan merch & No urut : ");
                    PCD = m61.nextLine();
                    merch.push(PCD);
                if(merch.isEmpty()){   
                    System.out.println("DATA MASIH KOSONG!!");
                }else{
                    System.out.println("DATA BERHASIL DITAMBAH!!");
                }
                }else if(CekP==3){
                    System.out.print("Ambil Merch Terbaru");
                    System.out.print("Konfirmasi ?(y/n)");
                    PCD = m61.nextLine();
                    merch.pop();
                if(merch.isEmpty()){   
                    System.out.println("DATA MASIH KOSONG!!");
                }else{
                    System.out.println("DATA BERHASIL DITAMBAH!!");
                }}

                
            }else if(menu==7){
                if(pesan.isEmpty()&&name.isEmpty()){
                    System.out.println("DATA SUDAH KOSONG");
                }else{
                System.out.print("Masukan NAMA MEMBER : ");
                hapusNama = m7.nextLine();
                System.out.print("Masukan Nama BUKU   : ");
                hapusPesanan = m7.nextLine();
                System.out.print("Masukan Nama CD     : ");
                hapusCD = m7.nextLine();
                System.out.print("\n");

                    if(name.contains(hapusNama)&&pesan.contains(hapusPesanan)&&pesanCd.contains(hapusCD)==false){
                        System.out.println("DATA TIDAK SESUAI!!");
                    }else if(name.remove(hapusNama)&&pesan.remove(hapusPesanan)&&pesanCd.remove(hapusCD)){
                        System.out.println("DATA BERHASIL DIHAPUS!! ");
                    }
                }
            }else if(menu==8){
                BinaryTree tree = new BinaryTree();
                tree.root = new Node("Snowman");
                tree.root.left = new Node("Want");
                tree.root.right = new Node("A");
                tree.root.left.left = new Node("Do");
                tree.root.left.right = new Node("You");
                tree.root.right.left = new Node("To");
                tree.root.right.right = new Node("Build");
                 /*            Snowman
                             /         \
                          Want          A
                         /   \        /   \
                        Do  You      To  Build      */
                System.out.println(" ");
                System.out.println("  Pilih Lirik yang Benar  ");
                System.out.println("--------------------------");
                System.out.print("Pre-Order  : ");
                tree.printPreorder();
                System.out.print("\nIn-Order   : ");
                tree.printInorder();
                System.out.print("\nPost-Order : ");
                tree.printPostorder();
                
                
            }else if(menu==9){
                class Graph{
                ArrayList<ArrayList<Integer>>graph;
                int V;

                Graph(int nodes){
                    V = nodes;
                    graph = new ArrayList<ArrayList<Integer>>();
                    for(int i=0;i<V;i++){
                        graph.add(new ArrayList<Integer>());
                    }
                }

                void addEdge(int v,int u){
                    graph.get(v).add(u);
                    graph.get(u).add(v);
                }

                void printGraph(){
                    for(int i=0;i<V;i++){
                        System.out.print("Node : "+i);
                        for(int x : graph.get(i))System.out.print(" -> "+x);
                        System.out.println();
                    }
                }
            }
                
                Graph g = new Graph(11);
        
                g.addEdge(2, 1);
                g.addEdge(4, 2);
                g.addEdge(0, 3);
                g.addEdge(0, 4);
                g.addEdge(5, 6);
                g.addEdge(1, 7);
                g.addEdge(5, 8);
                g.addEdge(3, 9);
                g.addEdge(5, 10);
                g.printGraph();
            }else{
                if(menu==10){
                    System.out.println("\n\t *Terima Kasih*");
                }
            }
        }while(menu!=10);
        input.close();
        m1.close();
        m2.close();
        m3.close();
        m6.close();
        m61.close();
        m7.close();
    }
}