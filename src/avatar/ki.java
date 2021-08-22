package avatar;

import javax.microedition.lcdui.Graphics;

public final class ki extends ha {

    public String a;
    public byte b;
    private int g = 200;
    private int h;
    public int c;
    public int d;
    public int e;
    public int f;

    public ki() {
        this.h = (short) (gy.ah * 11);
        super.ac = cz.b().b;
    }

    public final void a(Graphics var1) {
        main.GameGraphic.S.a(var1, (main.GameGraphic.width - this.g) / 2, (main.GameGraphic.height - this.h) / 2, this.g, this.h, je.d[2], je.d[3], 1);
        var1.translate((main.GameGraphic.width - this.g) / 2, (main.GameGraphic.height - this.h) / 2);
        int var2;
        main.GameGraphic.K.a(var1, String.valueOf(cz.b().n), this.g / 2, (var2 = 0 + gy.ah) - gy.ah / 2 - 2 * gy.Y, 2);
        main.GameGraphic.K.a(var1, "Thú đua chiến thắng", this.g / 2, var2 += gy.ah / 2 + 2 * gy.Y, 2);
        main.GameGraphic.L.a(var1, this.a, this.g / 2, var2 += gy.ah + 6 * gy.Y, 2);
        var2 += gy.ah << 1;

        for (int var3 = 0; var3 < 6; ++var3) {
            f var4;
            if (this.b == cz.b().c[var3].w && (var4 = fxClass.c(cz.b().c[var3].c)).d != -1) {
                int var5 = var4.c / 5;
                var1.drawRegion(var4.a, 0, cz.m[0][0] * var5, var4.b, var5, 0, this.g / 2, var2 + gy.ah / 2, 3);
            }
        }

        var2 += gy.ah / 2;
        main.GameGraphic.K.a(var1, "Tiền cược: ", 10, var2 += gy.ah, 0);
        main.GameGraphic.Q.a(var1, "" + this.c, this.g - 20, var2 + gy.ah / 2 - gy.ai / 2, 1);
        main.GameGraphic.K.a(var1, "Tiền ăn: ", 10, var2 += gy.ah, 0);
        main.GameGraphic.Q.a(var1, "" + this.d, this.g - 20, var2 + gy.ah / 2 - gy.ai / 2, 1);
        main.GameGraphic.K.a(var1, "Tiền thuế: ", 10, var2 += gy.ah, 0);
        main.GameGraphic.Q.a(var1, "" + this.e, this.g - 20, var2 + gy.ah / 2 - gy.ai / 2, 1);
        main.GameGraphic.K.a(var1, "Tiền nhận được: ", 10, var2 += gy.ah, 0);
        main.GameGraphic.Q.a(var1, "" + this.f, this.g - 20, var2 + gy.ah / 2 - gy.ai / 2, 1);
        super.a(var1);
    }
}
