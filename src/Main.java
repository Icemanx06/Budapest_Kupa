import java.util.Collections;
import java.util.LinkedList;
import java.util.Objects;
import java.util.Scanner;

class Utak implements Comparable<Utak>{
    int ev;
    int honap;
    int nap;
    String nev;
    int tav;

    public Utak(int ev, int honap, int nap, String nev, int tav) {
        this.ev = ev;
        this.honap = honap;
        this.nap = nap;
        this.nev = nev;
        this.tav = tav;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ev).append(";");
        if(honap<=9){
        sb.append("0"+honap).append(";");
        }else
        {
            sb.append(honap).append(";");
        }
        if(nap<=9){
        sb.append("0"+nap);
        }else{
            sb.append(nap);
        }
        sb.append(";").append(nev).append(";").append(tav);
        return sb.toString();
    }

    @Override
    public int compareTo(Utak o) {
        if(this.ev != o.ev){
            return Integer.compare(this.ev, o.ev);
        }
        if(this.honap != o.honap){
            return Integer.compare(this.honap,o.honap);
        }
        if(this.nap != o.nap){
            return Integer.compare(this.nap, o.nap);
        }
        if(this.nev.equals(o.nev)){
           return Integer.compare(this.tav, o.tav);
        }
        return this.nev.compareTo(o.nev);
    }
    
    
}
public class Main {
    public static void main(String[] args) {
        LinkedList<Utak> list = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        int db = Integer.parseInt(sc.nextLine());
        int seged = 0;
        while(seged<db){
            String[] line = sc.nextLine().split(";");
            list.add(new Utak(Integer.parseInt(line[0]),Integer.parseInt(line[1]),Integer.parseInt(line[2]),line[3], Integer.parseInt(line[4])));
            seged++;
        }
        Collections.sort(list);
        for (Utak l : list) {
            System.out.println(l);
        }
    }
}
