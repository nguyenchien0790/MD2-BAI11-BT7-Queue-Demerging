import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<NhanSu> Nu = new LinkedList<>();
        Queue<NhanSu> Nam = new LinkedList<>();
        List<NhanSu> listNhanSu = new ArrayList<>();
        listNhanSu.add(new NhanSu("hung","nam",1990));
        listNhanSu.add(new NhanSu("tham","nu",1994));
        listNhanSu.add(new NhanSu("hai","nam",1990));
        listNhanSu.add(new NhanSu("mai","nu",1996));
        listNhanSu.add(new NhanSu("chien","nam",1999));
        for (NhanSu s:
            listNhanSu ) {
            if (s.getGenDer() == "nu") {
                Nu.add(s);
            }
            if (s.getGenDer() == "nam") {
                Nam.add(s);

            }

        }
        System.out.println(Nu);
        System.out.println(Nam);
    }
}
