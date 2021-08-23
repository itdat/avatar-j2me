package avatar;

final class fi implements Intent {

    private go a;
    private final az b;
    private final dc c;

    fi(go var1, az var2, dc var3) {
        this.a = var1;
        this.b = var2;
        this.c = var3;
    }

    public final void a() {
        if (ir.p != null) {
            if (this.b.e == 4) {
                go.a(this.a, (byte) 4, this.c.a);
                this.a.M = (ai) ir.p;
                this.a.M.p = true;
                this.a.M.q = main.GameGraphic.j();
            }
            Farm.getInstance().doUsingItem(go.b, ((gx) ir.p).w, this.c.a);
        }
    }
}
