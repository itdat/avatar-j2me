package avatar;

import javax.microedition.lcdui.Graphics;

final class iz extends Button {

    private final int f;

    iz(cd var1, String var2, int var3, int var4) {
        super(var2, var3);
        this.f = var4;
    }

    public final void a(Graphics var1, int var2, int var3) {
        le.f.b(this.f / le.f.c, this.f % le.f.c, var2, var3, 3, var1);
    }
}
