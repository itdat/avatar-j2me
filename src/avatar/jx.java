package avatar;

import javax.microedition.lcdui.Graphics;
import main.GameMidlet;

final class jx extends Button {

    private ld f;
    private short g;
    private int h;
    private int i;
    private aeClass j;

    public jx(aeClass var1, String var2, gt var3, ld var4, short var5, int var6, int var7, int var8) {
        super(var2, var3);
        this.j = var1;
        this.f = var4;
        this.g = var5;
        this.h = var6;
        this.i = var7;
    }

    public final void a() {
        if (dp.n && this.h == dp.j) {
            ld var1 = this.f;
            if (this.f.g == -1) {
                var1 = fxClass.a(this.g);
            }

            if (var1.g != -1) {
                aeClass.a(var1);
                dp.n();
                dp.a(var1.l);
                if (this.i == -1) {
                    dp.a(main.GameGraphic.a(var1.i[0], var1.i[1], false));
                }

                if (var1.f == -1) {
                    dp.a(StringEntity.em[0] + ((fa) var1).a);
                }

                dp.a(StringEntity.ao + GameMidlet.i.c);
                if (aeClass.u) {
                    dp.a(StringEntity.dE + GameMidlet.i.a[3] + " " + StringEntity.k());
                }
            }
        }
    }

    public final void a(Graphics var1, int var2, int var3) {
        ld var4 = this.f;
        if (this.f.g == -1) {
            var4 = fxClass.a(this.g);
        }

        if (var4.g != -1) {
            var4.a(var1, var2 + dp.e / 2, var3 + dp.e / 2, 3);
        }
    }
}
