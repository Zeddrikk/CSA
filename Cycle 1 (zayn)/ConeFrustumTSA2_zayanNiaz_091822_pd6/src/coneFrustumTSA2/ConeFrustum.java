package coneFrustumTSA2;

public class ConeFrustum {
    double R, z, h;

    public ConeFrustum() {
        //default constructor
    }
    public ConeFrustum(double R, double z, double h) {
        this.R = R;
        this.z = Math.toRadians(z);
        this.h = h;
    }
    public double area() {
        double area, r, l;
        l = h/Math.sin(z);
        r = R - (h/Math.tan(z));
        area = Math.PI * (R * R + r * r + l * (R + r) );
        return area;
    }
}
