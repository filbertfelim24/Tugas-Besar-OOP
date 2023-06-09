public class NonMakanan extends Item implements Buyable {

    private int harga;
    private int panjang;
    private int lebar;
    private Point titikAwal;
    private Point titikAkhir;
    private int kodeJenisBarang;
    private boolean isHorizontal = true;

    public NonMakanan(String namaItem, int panjang, int lebar, Point titikAwal, Point titikAkhir,
            boolean isHorizontal) {
        super(namaItem);
        this.panjang = panjang;
        this.lebar = lebar;
        this.titikAwal = titikAwal;
        this.titikAkhir = titikAkhir;
        this.isHorizontal = isHorizontal;
        if ((namaItem.toLowerCase()).equals("kasur single")) {
            harga = 50;
            kodeJenisBarang = 1;
        } else if ((namaItem.toLowerCase()).equals("kasur queen size")) {
            harga = 100;
            kodeJenisBarang = 2;
        } else if ((namaItem.toLowerCase()).equals("kasur king size")) {
            harga = 150;
            kodeJenisBarang = 3;
        } else if ((namaItem.toLowerCase()).equals("toilet")) {
            harga = 50;
            kodeJenisBarang = 4;
        } else if ((namaItem.toLowerCase()).equals("kompor gas")) {
            harga = 100;
            kodeJenisBarang = 5;
        } else if ((namaItem.toLowerCase()).equals("kompor listrik")) {
            harga = 200;
            kodeJenisBarang = 6;
        } else if ((namaItem.toLowerCase()).equals("meja dan kursi")) {
            harga = 50;
            kodeJenisBarang = 7;
        } else if ((namaItem.toLowerCase()).equals("jam")) {
            harga = 50;
            kodeJenisBarang = 8;
        } else if ((namaItem.toLowerCase()).equals("play station")) {
            harga = 200;
            kodeJenisBarang = 9;
        } else if ((namaItem.toLowerCase()).equals("lemari buku")) {
            harga = 100;
            kodeJenisBarang = 10;
        } else if ((namaItem.toLowerCase()).equals("radio")) {
            harga = 100;
            kodeJenisBarang = 11;
        } else if ((namaItem.toLowerCase()).equals("piano")) {
            harga = 200;
            kodeJenisBarang = 12;
        } else if ((namaItem.toLowerCase()).equals("televisi")) {
            harga = 150;
            kodeJenisBarang = 13;
        }
    }

    public NonMakanan(String namaItem) {
        super(namaItem);
        titikAwal = null;
        titikAkhir = null;
        if ((namaItem.toLowerCase()).equals("kasur single")) {
            panjang = 4;
            lebar = 1;
            harga = 50;
            kodeJenisBarang = 1;
        } else if ((namaItem.toLowerCase()).equals("kasur queen size")) {
            panjang = 4;
            lebar = 2;
            harga = 100;
            kodeJenisBarang = 2;
        } else if ((namaItem.toLowerCase()).equals("kasur king size")) {
            panjang = 5;
            lebar = 2;
            harga = 150;
            kodeJenisBarang = 3;
        } else if ((namaItem.toLowerCase()).equals("toilet")) {
            panjang = 1;
            lebar = 1;
            harga = 50;
            kodeJenisBarang = 4;
        } else if ((namaItem.toLowerCase()).equals("kompor gas")) {
            panjang = 2;
            lebar = 1;
            harga = 100;
            kodeJenisBarang = 5;
        } else if ((namaItem.toLowerCase()).equals("kompor listrik")) {
            panjang = 1;
            lebar = 1;
            harga = 200;
            kodeJenisBarang = 6;
        } else if ((namaItem.toLowerCase()).equals("meja dan kursi")) {
            panjang = 3;
            lebar = 3;
            harga = 50;
            kodeJenisBarang = 7;
        } else if ((namaItem.toLowerCase()).equals("jam")) {
            panjang = 1;
            lebar = 1;
            harga = 50;
            kodeJenisBarang = 8;
        } else if ((namaItem.toLowerCase()).equals("play station")) {
            panjang = 2;
            lebar = 1;
            harga = 200;
            kodeJenisBarang = 9;
        } else if ((namaItem.toLowerCase()).equals("lemari buku")) {
            panjang = 1;
            lebar = 1;
            harga = 100;
            kodeJenisBarang = 10;
        } else if ((namaItem.toLowerCase()).equals("radio")) {
            panjang = 1;
            lebar = 1;
            harga = 100;
            kodeJenisBarang = 11;
        } else if ((namaItem.toLowerCase()).equals("piano")) {
            panjang = 2;
            lebar = 1;
            harga = 200;
            kodeJenisBarang = 12;
        } else if ((namaItem.toLowerCase()).equals("televisi")) {
            panjang = 2;
            lebar = 1;
            harga = 150;
            kodeJenisBarang = 13;
            // } else if ((namaItem.toLowerCase()).equals("komputer")) {
            // panjang = 2;
            // lebar = 1;
            // harga = 200;
            // kodeJenisBarang = 14;
            // } else if ((namaItem.toLowerCase()).equals("sofa")) {
            // panjang = 2;
            // lebar = 1;
            // harga = 80;
            // kodeJenisBarang = 15;
        } else {
            System.out.println("Input tidak ada di daftar item nonmakanan!");
        }
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public int getPanjang() {
        return panjang;
    }

    public void setPanjang(int panjang) {
        this.panjang = panjang;
    }

    public int getLebar() {
        return lebar;
    }

    public void setLebar(int lebar) {
        this.lebar = lebar;
    }

    public Point getTitikAwal() {
        return titikAwal;
    }

    public void setTitikAwal(Point titikAwal) {
        this.titikAwal = titikAwal;
    }

    public Point getTitikAkhir() {
        return titikAkhir;
    }

    public void setTitikAkhir(Point titikAkhir) {
        this.titikAkhir = titikAkhir;
    }

    public int getKodeJenisBarang() {
        return kodeJenisBarang;
    }

    public void setKodeJenisBarang(int kodeJenisBarang) {
        this.kodeJenisBarang = kodeJenisBarang;
    }

    public boolean getIsHorizontal() {
        return isHorizontal;
    }

    public void setIsHorizontal(boolean isHorizontal) {
        this.isHorizontal = isHorizontal;
    }

    public void setHorizontal() {
        if (!isHorizontal) {
            panjang = panjang + lebar;
            lebar = panjang - lebar;
            panjang = panjang - lebar;
            isHorizontal = true;

            if (titikAwal != null) {
                int x = titikAwal.getX() + panjang - 1;
                int y = titikAwal.getY() + lebar - 1;
                titikAkhir = new Point(x, y);
            }
        }
    }

    public void setVertikal() {
        if (isHorizontal) {
            panjang = panjang + lebar;
            lebar = panjang - lebar;
            panjang = panjang - lebar;
            isHorizontal = false;

            if (titikAwal != null) {
                int x = titikAwal.getX() + panjang - 1;
                int y = titikAwal.getY() + lebar - 1;
                titikAkhir = new Point(x, y);
            }
        }
    }
}
