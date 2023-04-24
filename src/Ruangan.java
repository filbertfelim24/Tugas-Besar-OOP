import java.util.ArrayList;

public class Ruangan {
    private String namaRuangan;
    private int ruanganKe;
    private int panjang;
    private int lebar;
    private int[][] matriksRuangan;
    private ArrayList<NonMakanan> listOfObjek;
    

    // Konstruktor
    public Ruangan(String namaRuangan, int ruanganKe, int panjang, int lebar) {
        this.namaRuangan = namaRuangan;
        this.ruanganKe = ruanganKe;
        this.panjang = panjang;
        this.lebar = lebar;
        matriksRuangan = new int[panjang][lebar];
        listOfObjek = new ArrayList<NonMakanan>();
    }

    // Getter
    public String getNamaRuangan() {
        return namaRuangan;
    }
    
    public int getRuanganKe() {
        return ruanganKe;
    }

    public int getPanjang() {
        return panjang; 
    }

    public int getLebar() {
        return lebar;
    }

    public int[][] getMatriksRuangan() {
        return matriksRuangan;
    }

    public ArrayList<NonMakanan> getListOfObjek() {
        return listOfObjek;
    }

    public void memasangBarang(Item item, Point point) {
        
    }

    public static ArrayList<NonMakanan> getListOfObjek() {
        return listOfObjek;
    }

    public void memindahBarang() {
        
    }
}
