import java.util.concurrent.ThreadLocalRandom;

public class Pekerjaan {
    private String nama;
    private int gaji;
    private String[] listPekerjaan = { "Badut Sulap", "Koki", "Polisi", "Programmer", "Dokter" };
    private int lamaBekerja = 0;
    private int changeWorkatHari = 0;

    public Pekerjaan() {
        nama = listPekerjaan[ThreadLocalRandom.current().nextInt(0, listPekerjaan.length)];
        if ((nama.toLowerCase()).equals("badut sulap")) {
            gaji = 15;
        } else if ((nama.toLowerCase()).equals("koki")) {
            gaji = 30;
        } else if ((nama.toLowerCase()).equals("polisi")) {
            gaji = 35;
        } else if ((nama.toLowerCase()).equals("programmer")) {
            gaji = 45;
        } else if ((nama.toLowerCase()).equals("dokter")) {
            gaji = 50;
        }
    }

    public Pekerjaan(String nama) {
        this.nama = nama;
        if ((nama.toLowerCase()).equals("badut sulap")) {
            gaji = 15;
        } else if ((nama.toLowerCase()).equals("koki")) {
            gaji = 30;
        } else if ((nama.toLowerCase()).equals("polisi")) {
            gaji = 35;
        } else if ((nama.toLowerCase()).equals("programmer")) {
            gaji = 45;
        } else if ((nama.toLowerCase()).equals("dokter")) {
            gaji = 50;
        } else {
            System.out.println("Input tidak ada di daftar kerja!");
        }
    }

    public Pekerjaan(String nama, int gaji, int lamaBekerja, int changeWorkatHari) {
        this.nama = nama;
        this.gaji = gaji;
        this.lamaBekerja = lamaBekerja;
        this.changeWorkatHari = changeWorkatHari;
    }

    public String getNama() {
        return nama;
    }

    public int getGaji() {
        return gaji;
    }

    public int getLamaBekerja() {
        return lamaBekerja;
    }

    public int getChangeWorkAtHari() {
        return changeWorkatHari;
    }

    public void addLamaBekerja(int num) {
        lamaBekerja += num;
    }

    public boolean ableToChangeWork(int uang, int gajiBaru) {
        if ((lamaBekerja / 60) >= 12 && uang >= (gajiBaru / 2)) {
            return true;
        } else {
            return false;
        }
    }

    public void changeWork(Sim sim, String newWork) {
        int gajiBaru = 1;
        if (newWork.toLowerCase().equals(nama.toLowerCase()))
        {
            System.out.println("Tidak bisa ubah ke pekerjaan yang sama!");
        }
        else
        {
            if ((newWork.toLowerCase()).equals("badut sulap")) {
                gajiBaru = 15;
            } else if ((newWork.toLowerCase()).equals("koki")) {
                gajiBaru = 30;
            } else if ((newWork.toLowerCase()).equals("polisi")) {
                gajiBaru = 35;
            } else if ((newWork.toLowerCase()).equals("programmer")) {
                gajiBaru = 45;
            } else if ((newWork.toLowerCase()).equals("dokter")) {
                gajiBaru = 50;
            } else {
                System.out.println("Input tidak ada di daftar kerja!");
            }
    
            if (ableToChangeWork(sim.getUang(), gajiBaru)) {
                nama = newWork;
                gaji = gajiBaru;
                lamaBekerja = 0;
                sim.setUang(sim.getUang() - (gajiBaru / 2));
                changeWorkatHari = World.gethariKe();
            } else {
                System.out.println("Kamu belum bisa mengubah pekerjaan!");
            }
        }
    }
}
