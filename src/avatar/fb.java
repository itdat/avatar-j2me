package avatar;

import javax.microedition.lcdui.Graphics;

final class fb extends Button {

    private final az f;

    fb(go var1, String var2, ii var3, az var4) {
        super(var2, var3);
        this.f = var4;
    }

    public final void a(Graphics var1, int var2, int var3) {
        this.f.a(var1, var2, var3, 0, 3);
    }
}
