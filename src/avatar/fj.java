package avatar;

import javax.microedition.lcdui.Graphics;
import main.GameMidlet;

final class fj extends Button {

    private final hn f;
    private final gr g;
    private final bc h;

    fj(String var1, ii var2, hn var3, gr var4, bc var5) {
        super((String) null, (ii) null);
        this.f = var3;
        this.g = var4;
        this.h = var5;
    }

    public final void a(Graphics var1, int var2, int var3) {
        this.f.a(var1, dp.c / 2, 37 * gy.Y, true);
        if (this.g != null) {
            this.g.a(var1, dp.c / 2 + 15 * gy.Y, 37 * gy.Y, this.f.W);
        }
        label50:
        {
            var2 = 40 * gy.Y;
            var3 = 15 * gy.Y;
            main.GameGraphic.N.a(var1, StringEntity.aA + this.f.x, 0, var2, 0);
            CsInterface var10000;
            Graphics var10001;
            StringBuffer var10002;
            String var10003;
            if (this.f.w == GameMidlet.i.w) {
                if (GameMidlet.j.g <= 0 && GameMidlet.j.f <= 0) {
                    break label50;
                }

                var10000 = main.GameGraphic.N;
                var10001 = var1;
                var10002 = (new StringBuffer(String.valueOf(StringEntity.em[0]))).append(GameMidlet.j.g).append(" + ").append(GameMidlet.j.f);
                var10003 = "%";
            } else {
                if (this.f.v <= 0 && this.f.r <= 0) {
                    break label50;
                }
                var10000 = main.GameGraphic.N;
                var10001 = var1;
                var10002 = (new StringBuffer(String.valueOf(StringEntity.em[0]))).append(this.f.v).append(" + ");
                var10003 = this.f.r > 0 ? this.f.r + "%" : "";
            }

            var10000.a(var10001, var10002.append(var10003).toString(), 0, var2 += var3, 0);
        }

        if (this.f.u > 0 || this.f.s > 0) {
            main.GameGraphic.N.a(var1, StringEntity.em[1] + this.f.u + " + " + (this.f.s > 0 ? this.f.s + "%" : ""), 0, var2 += var3, 0);
        }

        int var4 = 0;
        if (this.h.c > 125 * gy.Y) {
            this.h.a(100 * gy.Y);
            if (this.h.d >= 0) {
                var4 = this.h.d;
            }
        }

        main.GameGraphic.N.a(var1, this.h.a, 0 - var4, var2 += var3, 0);
        if (aeClass.u) {
            main.GameGraphic.N.a(var1, StringEntity.dE + this.f.a[3] + StringEntity.l(), 0, var2 + var3, 0);
        }

    }
}
