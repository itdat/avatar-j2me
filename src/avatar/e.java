package avatar;

import javax.microedition.lcdui.Graphics;

final class e extends Button {

    private aeClass f;
    private final ld g;
    private final byte h;

    e(aeClass var1, String var2, ii var3, ld var4, byte var5) {
        super(var2, var3);
        this.f = var1;
        this.g = var4;
        this.h = var5;
    }

    public final void a(Graphics var1, int var2, int var3) {
        this.g.b(var1, var2 + dp.e / 2, var3 + dp.e / 2, 0, 3);
    }

    public final void a() {
        if (this.h == dp.j) {
            dp.n();
            aeClass.a(this.g);
            String var1 = "";
            if (this.g.j == 20) {
                var1 = StringEntity.aC;
            } else if (this.g.j == 10) {
                var1 = StringEntity.aB;
            } else if (this.g.j == 40) {
                var1 = StringEntity.aE;
            } else if (this.g.j == 50) {
                var1 = StringEntity.aD;
            }

            dp.a(var1 + fxClass.a(this.g));
            dp.a(main.GameGraphic.a(this.g.i[0], this.g.i[1], true));
            dp.a(StringEntity.dx + fxClass.b(this.g));
            dp.a(StringEntity.em[0] + aeClass.C.v);
        }

    }
}
