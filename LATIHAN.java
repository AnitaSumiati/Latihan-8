package latihan8;

public class LATIHAN implements I1,D1 {
    
    public LATIHAN(double angka){
        
    }
    @Override
    public void I1() {
        System.out.println("---------------------------------------------");
        System.out.println("Angka yang anda inputkan Bertype Data integer");
        System.out.println("---------------------------------------------");
    }
    @Override
    public void D1() {
        System.out.println("--------------------------------------------");
        System.out.println("Angka yang anda inputkan Bertype Data Double");
        System.out.println("--------------------------------------------");
    }
}
