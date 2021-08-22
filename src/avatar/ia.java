package avatar;

import java.util.Vector;

final class ia implements ii {

    final cy a;
    private final String b;
    private final String[] c;
    private final int d;
    private final byte e;
    private final byte[] f;

    ia(cy var1, String var2, String[] var3, int var4, byte var5, byte[] var6) {
        this.a = var1;
        this.b = var2;
        this.c = var3;
        this.d = var4;
        this.e = var5;
        this.f = var6;
    }

    public final void a() {
        Vector var1 = new Vector();
        if (!cy.a(this.a) && this.b.equals(cy.h)) {
            var1.addElement(new Button(StringEntity.f, 50));
        }
        for (int var2 = 0; var2 < this.c.length; ++var2) {
            var1.addElement(new Button(this.c[var2], new ib(this, this.d, this.e, this.f, var2)));
        }
        le.getInstance().a(var1, 0);
    }
}
