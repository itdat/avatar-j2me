package avatar;

public final class dz extends ai {

    public static boolean r = false;
    public static dr s;
    public static byte t = 0;
    public static short u = -1;

    public dz() {
    }

    public dz(int var1, byte var2) {
        super(0, 0, var1, var2);
        ++t;
    }

    public final void a() {
        this.a((go.w + 3) * 24 + (awClass.e((ir.e - go.x - go.w - 5) * 6) << 2), 48 + (awClass.e(30) << 2));
    }

    public final void d() {
        if (u == -1) {
            super.f = false;
        } else if (super.i && !super.f) {
            super.f = true;
        }
    }

    public final void c() {
        super.n = new dr();
        this.g();
    }

    public final void g() {
        dr var2;
        if (super.f) {
            super.G = 2;
            var2 = s;
            super.n = var2;
        } else {
            var2 = new dr(288 + (awClass.e(126) << 2), 24 + (awClass.e(36) << 2));
            super.n = var2;
        }
    }

    public final void h() {
        if (!super.f && awClass.d(2) == 0) {
            super.e = 200;
        }

        if (super.f && awClass.a(s.a, s.b, super.aw, super.ax) < 18) {
            super.f = false;
            super.i = false;
            super.e = 200;
            go.getInstance();
            go.a(u, super.w);
        }

        super.h();
    }
}
