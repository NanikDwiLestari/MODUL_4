package oprasibilangan;

public class OprasiBilangan {
    
    protected double A;
    protected double B;
    protected double C;
    protected double D;
    
    protected void setA(double A) {
        this.A = A < 0 ? 1 : A;
    }
    protected void setB(double b) {
        this.B = B < 0 ? 1 : B;
    }
    protected void setC(double c){
        this.C = C < 0 ? 1 : C;
    }
    protected void setD(double d){
        this.D= D < 0 ? 1 : D;
    }
    public double hitung() {
        return 0;
    }
    
}
