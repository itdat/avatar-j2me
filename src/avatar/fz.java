package avatar;

import javax.microedition.lcdui.Graphics;

final class fz extends Button {

    private final hx f;
    private final int g;
    private final int h;

    fz(aeClass var1, String var2, Intent var3, hx var4, int var5, int var6) {
        super(var2, var3);
        this.f = var4;
        this.g = var5;
        this.h = var6;
    }

    public final void a(Graphics var1, int var2, int var3) {
        fxClass.a(this.f.a).a(var1, var2 + dp.e / 2, var3 + dp.e / 2, 3);
        je.a(var2 + 3, var3 + dp.e - 3 * gy.Y, dp.e - 5, 2 * gy.Y, 1, var1);
        je.a(var2 + 3, var3 + dp.e - 3 * gy.Y, dp.e - 5 - this.f.b * (dp.e - 5) / 100, 2 * gy.Y, 11907085, var1);
    }

    public final void a() {
        if (dp.n && this.g == dp.j) {
            ld var1 = fxClass.a(this.f.a);
            dp.n();
            dp.a(StringEntity.cr + (100 - this.f.b) + "%");
            String var2 = "";
            if (var1.j == 20) {
                var2 = StringEntity.aC;
            } else if (var1.j == 10) {
                var2 = StringEntity.aB;
            }
            dp.a(var2 + fxClass.a(var1));
            if (this.f.c != null && !this.f.c.equals("")) {
                dp.a(this.f.c);
            }
            if (this.h == 0) {
                dp.a(StringEntity.em[2] + ": " + fxClass.b(var1));
                return;
            }
            if (var1.f != -2) {
                byte var3;
                if (var1.f >= 0) {
                    var3 = ((fa) fxClass.a(var1.f)).a;
                } else {
                    var3 = ((fa) var1).a;
                }
                dp.a(StringEntity.em[2] + ": " + var3);
            }
        }
    }
}
