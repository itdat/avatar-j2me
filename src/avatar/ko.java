package avatar;

import javax.microedition.lcdui.Graphics;

final class ko extends Button {

    private int f = 0;
    private dc g;

    public ko(go var1, String var2, Intent var3, int var4, dc var5) {
        super(var2, var3);
        this.f = var4;
        this.g = var5;
    }

    public final void a(Graphics var1, int var2, int var3) {
        if (this.g.a < 50) {
            gb.b((int) this.g.a).a(var1, 7, var2 + dp.e / 2, var3 + dp.e / 2, 3);
        } else {
            int var10002 = var2 + dp.e / 2;
            int var10003 = var3 + dp.e / 2;
            fxClass.a(var1, gb.c(this.g.a).h, var10002, var10003, 3);
        }
    }

    public final void a() {
        if (this.f == dp.j) {
            dp.n();
            short var10000 = this.g.a;
            boolean var10001 = true;
            dp.a(this.g.f);
            dp.a(StringEntity.QUANTITY + this.g.e);
            dp.a(StringEntity.aK + main.GameGraphic.b(this.g.d[0] * this.g.e) + StringEntity.DOLLAR);
            dp.a(aeClass.getMainBalance());
        }
    }
}
