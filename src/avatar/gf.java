package avatar;

import main.GameMidlet;
import main.GameGraphic;

final class gf implements Intent {

    private final hx a;
    private final int b;
    private final int c;
    private final int d;

    gf(aeClass var1, hx var2, int var3, int var4, int var5) {
        this.a = var2;
        this.b = var3;
        this.c = var4;
        this.d = var5;
    }

    public final void a() {
        ld var1 = fxClass.a(this.a.a);
        if (this.b == GameMidlet.i.w && (!fxClass.c((int) var1.j) || this.c != 0)) {
            GameGraphic.a(StringEntity.CHEST_ACTIONS[this.c], (Intent) (new gd(this, this.c, this.d, this.a)));
        }
    }
}
