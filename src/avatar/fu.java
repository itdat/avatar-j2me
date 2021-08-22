package avatar;

import javax.microedition.lcdui.Graphics;

final class fu extends Button {

    private final int f;

    fu(go var1, String var2, int var3, int var4, int var5) {
        super(var2, 7, var4);
        this.f = var5;
    }

    public final void a(Graphics var1, int var2, int var3) {
        gb.b[this.f].a(var1, 7, var2 + dp.e / 2, var3 + dp.e / 2, 3);
    }

    public final void a() {
        if (this.f == dp.j && dp.n) {
            dp.n();
            dp.a(gb.b[this.f].k + "(" + gb.b[this.f].e + StringEntity.bq + ")");
            dp.a(StringEntity.az + main.GameGraphic.a(gb.b[this.f].g[0], gb.b[this.f].g[1], false));
            dp.a(StringEntity.em[2] + ": " + gb.b[this.f].m);
            if (gb.b[this.f].l) {
                az var1 = go.b(gb.b[this.f].j);
                dp.a(StringEntity.dP + ": " + var1.f);
            }

            dp.a(StringEntity.dQ + ": " + main.GameGraphic.b(gb.b[this.f].i));
            dp.a(aeClass.getMainBalance());
        }

    }
}
