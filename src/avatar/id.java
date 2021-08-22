package avatar;

import javax.microedition.lcdui.Graphics;
import main.GameMidlet;

final class id extends Button {

    private int f = 0;
    private String g;
    private String h;
    private short i;
    private short j;
    private int k;

    public id(ei var1, String var2, ii var3, int var4, String var5, short var6, short var7, String var8, int var9, String var10, short var11) {
        super(var2, var3);
        this.f = var4;
        this.g = var5;
        this.i = var6;
        this.h = var8;
        this.k = var9;
        this.j = var11;
    }

    public final void a() {
        if (dp.n && this.f == dp.j) {
            dp.n();
            ld var1;
            if (GameMidlet.i.d == 1) {
                var1 = fxClass.a(this.i);
            } else {
                var1 = fxClass.a(this.j);
            }

            if (var1.g != -1) {
                if (GameMidlet.i.d == 1) {
                    aeClass.getInstance();
                    aeClass.a(var1);
                } else {
                    aeClass.getInstance();
                    aeClass.a(var1);
                }
            }

            dp.a(this.g);
            if (this.h != null) {
                dp.a(this.h);
            }

            if (this.k >= 0) {
                dp.a(StringEntity.az + main.GameGraphic.b(this.k) + " Tim");
            }
        }
    }

    public final void a(Graphics var1, int var2, int var3) {
        ld var4;
        if (GameMidlet.i.d == 1) {
            var4 = fxClass.a(this.i);
        } else {
            var4 = fxClass.a(this.j);
        }
        var4.b(var1, var2 + dp.e / 2, var3 + dp.e / 2, 0, 3);
    }
}
