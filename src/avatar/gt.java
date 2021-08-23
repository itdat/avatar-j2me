package avatar;

final class gt implements Intent {

    private ld a;
    private short b;
    private int c;
    private String d;
    private int e;
    private int f;
    private aeClass g;

    public gt(aeClass var1, ld var2, short var3, int var4, String var5, int var6, int var7) {
        this.g = var1;
        this.a = var2;
        this.b = var3;
        this.e = var4;
        this.d = var5;
        this.c = var6;
        this.f = var7;
    }

    public final void a() {
        if (this.e == 100) {
            main.GameGraphic.a(StringEntity.cP, (Intent) (new kw(this.g, this.b)));
        } else if (this.e == 26) {
            main.GameGraphic.h();
            aeClass.getInstance().e(this.b);
            dp.b().d();
        } else {
            ld var1 = this.a;
            if (this.a.g == -1) {
                var1 = fxClass.a(this.b);
            }

            if (this.c != -1 && this.e != 17 && this.e != 18) {
                main.GameGraphic.a(this.d, (Intent) (new eq(this.g, this.c, this.e, this.f)));
            } else {
                aeClass.b(var1);
            }
        }
    }
}
