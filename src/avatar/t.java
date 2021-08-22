package avatar;

import javax.microedition.lcdui.Graphics;

final class t extends Button {

    private dc f;
    private final int g;

    t(go var1, String var2, int var3, int var4, int var5) {
        super(var2, 13, var4);
        this.g = var5;
        this.f = (dc) go.d.elementAt(var5);
    }

    public final void a(Graphics var1, int var2, int var3) {
        go.b(this.f.a).a(var1, var2 + dp.e / 2, var3 + dp.e / 2, 0, 3);
    }

    public final void a() {
        if (dp.n && this.g == dp.j - go.p().size()) {
            dp.n();
            dp.a(go.b(this.f.a).f);
            az var1 = go.b(this.f.a);
            int var2 = this.f.e;
            if (var1.d == 4) {
                var2 -= go.j[1].size();
            } else if (var1.d == 1) {
                var2 -= go.j[0].size();
            }

            dp.a(StringEntity.QUANTITY + var2);
        }

    }
}
