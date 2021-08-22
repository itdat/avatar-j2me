package avatar;

public final class dt extends ai {

    public static dr r;
    public static dr s;
    public static byte t = 0;
    public static byte u = 5;
    public static short v = -1;

    public dt() {
    }

    public dt(int var1, byte var2) {
        super(0, 0, var1, var2);
        ++t;
    }

    public final void a() {
        this.a(go.C.a + 48 + (awClass.e((go.w - 2) * 6) << 2), go.C.b + 24 + (awClass.e(12) << 2));
    }

    public final void c() {
        super.n = new dr();
        dr var2;
        if (!super.f) {
            var2 = new dr(go.C.a + 12 + (awClass.e(go.w * 6) << 2), go.C.b + 12 + (awClass.e(18) << 2));
            super.n = var2;
        } else {
            var2 = r;
            super.n = var2;
        }
    }

    public final void d() {
        if (super.i && !super.f) {
            if (v != -1) {
                super.f = true;
            }
        }
    }

    public final void h() {
        super.h();
        if (super.f && awClass.f(r.a - super.aw) < 20 && awClass.f(r.b - super.ax) < 15) {
            super.f = false;
            super.i = false;
            go.getInstance();
            go.a(v, super.w);
        }
        super.e = 100 + 50 * (super.k - 50);
    }
}
