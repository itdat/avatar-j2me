package avatar;

final class ep implements Intent {

    private go a;
    private final az b;
    private final short c;
    private final ai d;

    ep(go var1, az var2, short var3, ai var4) {
        this.a = var1;
        this.b = var2;
        this.c = var3;
        this.d = var4;
    }

    public final void a() {
        if (this.b.e == 4) {
            go.a(this.a, (byte) 4, this.c);
            ir.p = this.d;
            this.a.M = (ai) ir.p;
            this.a.M.p = true;
            this.a.M.q = main.GameGraphic.j();
        }

        Farm.getInstance().doUsingItem(go.b, this.d.w, this.c);
    }
}
