package avatar;

import main.GameMidlet;
import main.GameGraphic;

final class hu implements Intent {

    private final hd a;

    hu(ir var1, hd var2) {
        this.a = var2;
    }

    public final void a() {
        if (this.a.a != -1) {
            cx.getInstance().e((byte) this.a.a);
            GameGraphic.i();
        } else if (this.a.d != null && !this.a.d.equals("")) {
            GameMidlet.b(this.a.d);
        } else {
            GameMidlet.a(this.a.e, this.a.f);
        }
    }
}
