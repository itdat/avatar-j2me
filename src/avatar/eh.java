package avatar;

import java.util.Vector;

final class eh implements ii {

    final aeClass a;
    private final Vector b;
    private final int c;
    private final int d;

    eh(aeClass var1, Vector var2, int var3, int var4) {
        this.a = var1;
        this.b = var2;
        this.c = var3;
        this.d = var4;
    }

    public final void a() {
        Vector var1 = new Vector();

        for (int var2 = 0; var2 < this.b.size(); ++var2) {
            hx var3;
            ld var4;
            if ((var4 = fxClass.a((var3 = (hx) this.b.elementAt(var2)).a)) != null && var4.j != 30 && var4.j != 40) {
                var1.addElement(var3);
            }
        }

        if (dp.j < var1.size()) {
            hx var5;
            ld var6;
            if (!fxClass.c((int) (var6 = fxClass.a((var5 = (hx) var1.elementAt(dp.j)).a)).j) || this.c == 1) {
                main.GameGraphic.a(StringEntity.cp, (ii) (new eg(this, var6, this.c, var1, this.b, var5, this.d)));
            }

        }
    }
}
