public class Tabung extends Lingkaran{
    public double volumeTabung(double r, double t){
        double voltabung;
        voltabung = luasLingkaran(r) * t;
        return  voltabung;
    }
    public double luasPermukaanTabung(double r, double t){
        double luaspermukaantabung;
        luaspermukaantabung = 2 * 3.14 * r * (r + t);
        return luaspermukaantabung;
    }
}
