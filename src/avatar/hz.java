package avatar;

import javax.microedition.lcdui.Graphics;

public final class hz extends cc {

    private String a;
    private byte b;
    private byte c = 0;

    public hz(String var1, int var2, int var3) {
        super.az = 8;
        super.aw = var2;
        super.ax = var3;
        this.a = var1;
        this.b = (byte) awClass.e(8);
    }

    public final void b() {
        ++this.b;
        if (this.b >= 8) {
            this.b = 0;
        }
    }

    public final void a(Graphics var1) {
        if (dm.INST.b[1] != 1 && main.GameGraphic.D == null) {
            if (super.aw * js.ay >= do1.a().a && super.aw * js.ay <= do1.a().a + main.GameGraphic.width && super.ax * js.ay >= do1.a().b && super.ax * js.ay <= do1.a().b + main.GameGraphic.height + 10 && main.GameGraphic.r != cd.b()) {
                var1.drawImage(ir.r, super.aw * js.ay, super.ax * js.ay, 3);
                if (ea.b().b != null) {
                    int var10002 = super.aw * js.ay;
                    int var10003 = (super.ax - 10 + this.b / 2) * js.ay;
                    ea.b().b.a(0, var10002, var10003, 0, 33, var1);
                }

                main.GameGraphic.Q.a(var1, this.a, super.aw * js.ay, (super.ax - 32 + this.b / 2) * js.ay, 2);
            }
        }
    }
}
