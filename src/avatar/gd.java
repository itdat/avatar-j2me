package avatar;

final class gd implements ii {

    private final int a;
    private final int b;
    private final hx c;

    gd(gf var1, int var2, int var3, hx var4) {
        this.a = var2;
        this.b = var3;
        this.c = var4;
    }

    public final void a() {
        if (this.a == 2) {
            cx.getInstance().a(1, (int) this.b, (short) this.c.a);
        } else if (this.a == 3) {
            cx.getInstance().a(0, (int) this.b, (short) this.c.a);
        } else {
            cx.getInstance().a(this.c.a, (byte) this.a);
        }

        main.GameGraphic.i();
    }
}
