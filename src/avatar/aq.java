package avatar;

import javax.microedition.lcdui.Graphics;
import main.GameGraphic;

final class aq extends Button {

    private final hf f;
    private final int g;

    aq(go var1, String var2, ii var3, hf var4, int var5) {
        super(var2, var3);
        this.f = var4;
        this.g = var5;
    }

    public final void a(Graphics var1, int var2, int var3) {
        az var4 = go.b(this.f.b);
        gb.a(var1, var4.b, var2 + dp.e / 2, var3 + dp.e / 2, 3);
        var1.translate(0, ho.i);
        var1.setClip(0, 0, 5 * dp.e, dp.d);
        if (this.g == dp.j) {
            for (var2 = 0; var2 < this.f.e.length; ++var2) {
                dc var5;
                if (this.f.e[var2] < 50) {
                    var5 = go.g(this.f.e[var2]);
                    gb.b((int) this.f.e[var2]).a(var1, 7, dp.c / 2 - this.f.e.length * 30 * gy.Y / 2 + var2 * 30 * gy.Y + 15 * (gy.Y - 1), (dp.e << 1) + 25 * gy.Y + (gy.af << 2) + 10 * (gy.Y - 1), 3);
                } else if (this.f.e[var2] < 100) {
                    var5 = go.g(this.f.e[var2]);
                    ad var6 = gb.c(this.f.e[var2]);
                    fxClass.a(var1, var6.h, dp.c / 2 - this.f.e.length * 30 * gy.Y / 2 + var2 * 30 * gy.Y + 15 * (gy.Y - 1), (dp.e << 1) + 25 * gy.Y + (gy.af << 2) + 10 * (gy.Y - 1), 3);
                } else {
                    var5 = go.f(this.f.e[var2]);
                    var4 = go.b(this.f.e[var2]);
                    gb.a(var1, var4.b, dp.c / 2 - this.f.e.length * 30 * gy.Y / 2 + var2 * 30 * gy.Y + 15 * (gy.Y - 1), (dp.e << 1) + 25 * gy.Y + (gy.af << 2) + 10 * (gy.Y - 1), 3);
                }

                CsInterface var7 = main.GameGraphic.N;
                if (var5 == null || var5.e < this.f.f[var2]) {
                    var7 = main.GameGraphic.M;
                }

                var7.a(var1, String.valueOf(this.f.f[var2]), dp.c / 2 - this.f.e.length * 30 * gy.Y / 2 + var2 * 30 * gy.Y - 1 + 15 * (gy.Y - 1), (dp.e << 1) + 25 * gy.Y + (gy.af << 2) + 8 * gy.Y + 10 * (gy.Y - 1), 2);
                if (var2 != this.f.e.length - 1) {
                    main.GameGraphic.N.a(var1, "+", dp.c / 2 - this.f.e.length * 30 * gy.Y / 2 + var2 * 30 * gy.Y + 15 * gy.Y + 15 * (gy.Y - 1), (dp.e << 1) + 25 * gy.Y + (gy.af << 2) + 10 * (gy.Y - 1), 2);
                }
            }
        }
        var1.setClip(0, 0, 5 * dp.e, dp.f * dp.e - dp.l);
        var1.translate(0, -ho.i);
    }

    public final void a() {
        if (this.g == dp.j) {
            dp.n();
            dp.a(this.f.d);
            dp.a(StringEntity.eM + this.f.c + "p");
            az var1 = go.b(this.f.b);
            if (var1.g > 0) {
                dp.a(StringEntity.PRICE + GameGraphic.b(var1.g) + StringEntity.DOLLAR);
            } else if (var1.h > 0) {
                dp.a(StringEntity.PRICE + GameGraphic.b(var1.h) + StringEntity.DOLLAR);
            }
            dp.a(StringEntity.eK);
        }
    }
}
