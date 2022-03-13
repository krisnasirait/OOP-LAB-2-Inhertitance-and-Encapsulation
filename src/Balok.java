public class Balok extends PersegiPanjang{
    public double volBalok(double p, double l, double t){
        double volbalok;
        volbalok = luasPP(p,l) * t;
        return volbalok;
    }

    public double luasPermukaanBalok(double p, double l, double t){
        double luaspermukaanbalok;
        luaspermukaanbalok = 2 * (luasPP(p,l) + (p * t) + (l * t));
        return luaspermukaanbalok;
    }
}
