package avatar;

import javax.microedition.lcdui.Graphics;

final class d extends Button {

    private final dc f;
    private final int g;

    d(go var1, String var2, int var3, int var4, dc var5, int var6) {
        super(var2, 12, var4);
        this.f = var5;
        this.g = var6;
    }

    public final void a(Graphics var1, int var2, int var3) {
        gb.b((int) this.f.a).a(var1, 7, var2 + dp.e / 2, var3 + dp.e / 2, 3);
    }

    public final void a() {
        if (this.g == dp.j) {
            dp.n();
            dp.a(this.f.f);
            dp.a(StringEntity.QUANTITY + this.f.e);
        }

    }
}
