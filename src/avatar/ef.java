package avatar;

import javax.microedition.lcdui.Graphics;

public final class ef {

    private int b;
    private int c;
    int a;
    private int d;

    public ef(int var1, int var2, int var3, int var4) {
        this.b = var1;
        this.c = var2;
        this.a = var3;
        this.d = var4;
    }

    public final void a(Graphics var1) {
        f var2;
        if ((var2 = fxClass.c((short) (main.GameGraphic.width > 200 ? 870 : 871))).d != -1) {
            var1.drawRegion(var2.a, 0, this.d * ja.c, ja.b, ja.c, 0, this.b, this.c, 3);
            CsInterface var3 = main.GameGraphic.O;
            if (main.GameGraphic.width <= 200) {
                var3 = main.GameGraphic.Q;
            }

            if (main.GameGraphic.Z > 0) {
                var3 = main.GameGraphic.K;
            }

            var3.a(var1, String.valueOf(this.a), this.b, this.c - gy.ah / 2, 2);
        }

    }
}
