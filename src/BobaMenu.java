public class BobaMenu extends StreetBobaPage{
    protected String daftar;
    public String cetak() {
        return daftar;
    }
    
    @Override
    public void setPilihan(String makanan, String minuman) {
        this.mkn = "Makanan";
        this.mnm = "Minuman";
    }
}

//subclass
class BCake extends BobaMenu{
    @Override
    public String cetak() {
        daftar ="Makanan\t\nBoba Cake\tRp 20.000\n";
        return daftar;
    }
}

class BBread extends BobaMenu{
    @Override
    public String cetak() {
        daftar ="Boba Bread\tRp 25.000\n";
        return daftar;
    }
}

class BSnack extends BobaMenu{
    @Override
    public String cetak() {
        daftar ="Boba Snack\tRp 10.000\n";
        return daftar;
    }
}

class BTea extends BobaMenu{
    @Override
    public String cetak() {
        daftar ="\nMinuman\t\nBoba Tea\tRp 10.000\n";
        return daftar;
    }
}

class BMilk extends BobaMenu{
    @Override
    public String cetak() {
        daftar ="Boba Milk\tRp 20.000\n";
        return daftar;
    }
}

class BSugar extends BobaMenu{
    @Override
    public String cetak() {
        daftar ="Boba Sugar\tRp 15.000\n";
        return daftar;
    }
}

//class coba{
//    public static void main(String[] args) {
//        BobaMenu[] bm = new BobaMenu[6];
//        bm[0] = new BCake();
//        bm[1] = new BBread();
//        bm[2] = new BSnack();
//        bm[3] = new BTea();
//        bm[4] = new BMilk();
//        bm[5] = new BSugar();
//    }
//}
        