package avatar;

import javax.microedition.lcdui.Graphics;

final class h extends Button {

    private final az f;
    private final int g;

    h(go var1, String var2, int var3, int var4, az var5, int var6) {
        super(var2, 9, var4);
        this.f = var5;
        this.g = var6;
    }

    public final void a(Graphics var1, int var2, int var3) {
        this.f.a(var1, var2 + dp.e / 2, var3 + dp.e / 2, 0, 3);
    }

    public final void a() {
        if (this.g == dp.j) {
            dp.n();
            dp.a(this.f.f);
            dp.a(StringEntity.az + main.GameGraphic.a(this.f.g, this.f.h, false));
        }
    }
}
