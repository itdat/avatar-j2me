package avatar;

import javax.microedition.lcdui.Graphics;

final class jg extends Button {

    private final bc f;

    jg(cd var1, String var2, int var3, int var4, bc var5) {
        super(var2, 17, var4);
        this.f = var5;
    }

    public final void a(Graphics var1, int var2, int var3) {
        fxClass.a(var1, this.f.d, var2, var3, 3);
    }
}
