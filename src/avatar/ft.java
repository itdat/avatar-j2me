package avatar;

import javax.microedition.lcdui.Graphics;

final class ft extends jt {

    private final dn a;

    ft(go var1, dn var2) {
        this.a = var2;
    }

    public final void a(Graphics var1) {
        je.a(this.a.aw * gy.Y, this.a.ax * gy.Y, this.a.d, this.a.e, 5921542, var1);
    }

    public final void a() {
        if (this.a.ax < this.a.g) {
            dn var10000 = this.a;
            var10000.aw += this.a.c;
            var10000 = this.a;
            var10000.ax += this.a.b;
            ++this.a.b;
        } else {
            this.a.c = 0;
            this.a.b = 0;
        }
    }
}
