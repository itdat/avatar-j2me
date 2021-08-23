package avatar;

import main.GameMidlet;

final class gi implements Intent {

    final ei a;
    private final int b;
    private final String c;

    gi(ei var1, int var2, String var3) {
        this.a = var1;
        this.b = var2;
        this.c = var3;
    }

    public final void a() {
        ei.a(this.a);
        if (ei.b(this.a) != -1) {
            ei.a(this.a, ei.b(this.a));
            ei.b(this.a, ei.c(this.a));
            GameMidlet.i.aw = ei.b(this.a) * 24;
            GameMidlet.i.ax = ei.c(this.a) * 24;
            do1.a().a(GameMidlet.i.aw * gy.Y, GameMidlet.i.ax * gy.Y);
        }

        ei.b = true;
        ei.e = true;
        ei.c(this.a, this.b);
        this.a.ad = new Button(StringEntity.cS, new gh(this, this.b, this.c));
        this.a.ac = null;
        this.a.ae = null;
    }
}
