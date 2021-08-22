package avatar;

public final class ex extends is {

    public static int r = 0;
    public static dr s;

    public ex(int var1, byte var2, byte var3) {
        super(0, 0, var1, var2);
        super.t = 0;
        super.u = 0;
        ++r;
    }

    public final void a() {
        super.n = new dr();
        if (super.t == super.w) {
            super.aw = super.C = super.n.a = (go.w + 3) * 24 + j();
            super.ax = super.D = super.n.b = 72 + (awClass.e(24) << 2);
        } else {
            this.c();
            if (!ir.b(super.aw, super.ax)) {
                dr var2 = new dr((go.w + 3) * 24 + j(), 72 + (awClass.e(24) << 2));
                super.n = var2;
            }

            super.aw = super.C = super.n.a;
            super.ax = super.D = super.n.b;
        }
    }

    private static int j() {
        return awClass.e((ir.e - go.x - go.w - 5) * 6) << 2;
    }

    public final void a(dr var1) {
        dr var2 = new dr(var1.a - 48 + j(), var1.b - 48 + (awClass.e(24) << 2));
        super.n = var2;
    }

    public final void g() {
        super.g();
    }
}
