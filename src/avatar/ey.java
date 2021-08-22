package avatar;

import javax.microedition.lcdui.Graphics;

final class ey extends Button {

    private int f;
    private int g;
    private km h;

    public ey(aeClass var1, String var2, ku var3, int var4, km var5, int var6) {
        super(var2, var3);
        this.f = var4;
        this.h = var5;
        this.g = var6;
    }

    public final void a() {
        if (dp.n && dp.j - this.g == this.f) {
            dp.n();
            dp.a(StringEntity.aA + this.h.c);
            dp.a(StringEntity.az + this.h.d + (this.h.e == 0 ? StringEntity.COIN : StringEntity.TAEL));
        }

    }

    public final void a(Graphics var1, int var2, int var3) {
        fxClass.a(var1, this.h.b, var2 + dp.e / 2, var3 + dp.e / 2, 3);
    }
}
