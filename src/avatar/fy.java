package avatar;

import javax.microedition.lcdui.Graphics;

final class fy extends Button {

    private final ad f;
    private final int g;

    fy(go var1, String var2, int var3, int var4, ad var5, int var6) {
        super(var2, 8, var4);
        this.f = var5;
        this.g = var6;
    }

    public final void a(Graphics var1, int var2, int var3) {
        fxClass.a(var1, this.f.g, var2 + dp.e / 2, var3 + dp.e / 2, 3);
    }

    public final void a() {
        if (this.g == dp.j - gb.b.length && dp.n) {
            dp.n();
            dp.a(this.f.l + "(" + this.f.d + StringEntity.bq + ")");
            dp.a(StringEntity.az + main.GameGraphic.a(this.f.e[0], this.f.e[1], false));
            dp.a(this.f.m);
            dp.a(aeClass.getMainBalance());
        }
    }
}
