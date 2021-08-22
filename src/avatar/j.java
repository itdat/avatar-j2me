package avatar;

import javax.microedition.lcdui.Graphics;

final class j extends Button {

    private final az f;
    private final int g;
    private final dc h;

    j(go var1, String var2, int var3, int var4, az var5, int var6, dc var7) {
        super(var2, 11, var4);
        this.f = var5;
        this.g = var6;
        this.h = var7;
    }

    public final void a(Graphics var1, int var2, int var3) {
        this.f.a(var1, var2 + dp.e / 2, var3 + dp.e / 2, 0, 3);
    }

    public final void a() {
        if (dp.n && this.g == dp.j - go.f.size()) {
            dp.n();
            dp.a(this.f.f);
            dp.a(StringEntity.QUANTITY + this.h.e);
            if (this.f.h > 0) {
                dp.a(StringEntity.aK + main.GameGraphic.b(this.h.e * this.f.h) + StringEntity.DOLLAR);
            } else if (this.f.g > 0) {
                dp.a(StringEntity.aK + main.GameGraphic.b(this.h.e * this.f.g) + StringEntity.DOLLAR);
            }
            dp.a(aeClass.getMainBalance());
        }
    }
}
