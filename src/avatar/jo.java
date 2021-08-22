package avatar;

import javax.microedition.lcdui.Graphics;

public final class jo extends gx {

    public short a;
    public short b;
    public short c;
    public int d;
    public byte e;
    private byte f;

    public jo() {
        this.b = this.c = 0;
        super.az = 6;
        this.f = 0;
    }

    public final void b() {
        al var1;
        if ((var1 = fxClass.d(this.a)) != null) {
            ++this.f;
            if (this.f < var1.a.length) {
                return;
            }
        }

        this.a();
    }

    public final void a(Graphics var1) {
        if (main.GameGraphic.Z <= 0 || main.GameGraphic.r != cd.b()) {
            al var2;
            if ((var2 = fxClass.d(this.a)) != null) {
                if (this.e == 0) {
                    hn var3;
                    if ((var3 = ir.g(this.d)) == null) {
                        this.a();
                        return;
                    }

                    super.aw = var3.aw + this.b;
                    super.ax = var3.ax + this.c;
                }

                var2.a(var1, super.aw, super.ax, this.f);
            }

        }
    }

    private void a() {
        switch (this.e) {
            case 0:
                ir.m.removeElement(this);
                return;
            case 1:
                ir.l.removeElement(this);
                return;
            case 2:
                ir.v.removeElement(this);
                return;
            case 3:
                ir.w.removeElement(this);
            default:
        }
    }
}
