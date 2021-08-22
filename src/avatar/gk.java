package avatar;

import javax.microedition.lcdui.Graphics;

final class gk extends Button {

    private final ag f;
    private final int g;
    private final String h;
    private final String i;

    gk(ei var1, String var2, ii var3, ag var4, int var5, String var6, String var7) {
        super(var2, var3);
        this.f = var4;
        this.g = 90;
        this.h = var6;
        this.i = var7;
    }

    public final void a(Graphics var1, int var2, int var3) {
        fxClass.a(var1, this.f.b, var2, var3 + this.g / 2 - gy.af - gy.ah - 5, 33);
        main.GameGraphic.N.a(var1, this.h, var2, var3 + this.g / 2 - gy.af, 2);
        main.GameGraphic.K.a(var1, this.i, var2, var3 + this.g / 2 - gy.af - gy.ah, 2);
    }
}
