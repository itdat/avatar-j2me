package avatar;

import javax.microedition.lcdui.Graphics;
import main.GameMidlet;

final class fe extends Button {

    private final dc f;
    private final int g;

    fe(aeClass var1, String var2, ii var3, dc var4, int var5) {
        super(var2, var3);
        this.f = var4;
        this.g = var5;
    }

    public final void a(Graphics var1, int var2, int var3) {
        fxClass.a[this.f.b].a(var1, var2 + dp.e / 2, var3 + dp.e / 2, 3);
    }

    public final void a() {
        if (this.g == dp.j || dp.k) {
            dp.n();
            dp.a(this.f.f);
            dp.a(StringEntity.az + this.f.d[0] + StringEntity.DOLLAR);
            dp.a(StringEntity.ce + main.GameGraphic.b(GameMidlet.i.a[0]) + StringEntity.DOLLAR);
        }

    }
}
