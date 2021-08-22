package avatar;

import java.util.Vector;
import javax.microedition.lcdui.Graphics;
import main.GameMidlet;

public final class ic extends hj {

    private static ic d;
    private byte e = 1;
    public int a = 0;
    private int f;
    public int b;
    public int c;
    private Vector g;
    private Vector h;
    private Vector i;
    private int j = 0;

    public static ic b() {
        if (d == null) {
            d = new ic();
        }

        return d;
    }

    public final void a(int var1, int var2) {
        switch (var1) {
            case 0:
                Vector var3 = new Vector();
                var3.addElement(new Button(StringEntity.YES, 0, this));
                var3.addElement(new Button(StringEntity.NO, 1, this));
                main.GameGraphic.a(StringEntity.dC, var3);
            default:
        }
    }

    public final void a(int var1) {
        switch (var1) {
            case 0:
                f();
                return;
            case 1:
                f();
            default:
        }
    }

    public final void a() {
        GameMidlet.i.K = 0;
        GameMidlet.i.e = new Vector();
        this.e();
        super.ad = new Button(StringEntity.cj, 0);
        hx var1 = new hx();
        int var2 = awClass.a.nextInt(this.i.size());
        var1.a = ((fa) this.i.elementAt(var2)).g;
        GameMidlet.i.a(var1);
        var1 = new hx();
        var2 = awClass.a.nextInt(this.h.size());
        var1.a = ((fa) this.h.elementAt(var2)).g;
        GameMidlet.i.a(var1);
        (var1 = new hx()).a = 4;
        GameMidlet.i.a(var1);
        var1 = new hx();
        var2 = awClass.a.nextInt(this.g.size());
        var1.a = ((fa) this.g.elementAt(var2)).g;
        GameMidlet.i.a(var1);
        GameMidlet.i.a(new hx((short) 0));
        GameMidlet.i.h();
        je.a().a(StringEntity.ck, 150 * gy.Y, 170 + (gy.Y == 2 ? 120 : 0), 1);
        super.a();
    }

    private void e() {
        GameMidlet.i.d = this.e;
        if (this.g != null) {
            this.g.removeAllElements();
            this.h.removeAllElements();
            this.i.removeAllElements();
        }

        this.g = new Vector();
        this.h = new Vector();
        this.i = new Vector();

        for (int var1 = 0; var1 < fxClass.b.length; ++var1) {
            fa var2;
            if (fxClass.b[var1] instanceof fa && (var2 = (fa) fxClass.b[var1]) != null && (var2.b == this.e || var2.b == 0) && var2.a == 0) {
                if (var2.j == 50) {
                    this.g.addElement(var2);
                } else if (var2.j == 20) {
                    this.h.addElement(var2);
                } else if (var2.j == 10) {
                    this.i.addElement(var2);
                }
            }
        }

        this.f = 0;
        this.g();
        if (GameMidlet.i.H != 10) {
            GameMidlet.i.b((byte) 1);
        }

        GameMidlet.i.h();
    }

    private static void f() {
        main.GameGraphic.I = true;
        main.GameGraphic.c(StringEntity.ck + "...");
        cx.getInstance().c();
    }

    public final void k() {
        if (this.b > 0) {
            --this.b;
        }

        if (this.c > 0) {
            --this.c;
        }

        ++this.j;
        if (this.j > 50) {
            this.j = 0;
            int var1 = awClass.a.nextInt(3);
            if (GameMidlet.i.H != 10) {
                if (var1 == 0) {
                    GameMidlet.i.b((byte) 1);
                } else {
                    GameMidlet.i.b((byte) 0);
                }
            }
        }

        GameMidlet.i.d();
    }

    public final void b(int var1) {
        this.a = var1;
        if (this.a < 0) {
            this.a = 1;
        }

        if (this.a > 1) {
            this.a = 0;
        }

    }

    public final void c(int var1) {
        this.f += var1;
        if (this.f < 0) {
            this.f = 1;
        }

        if (this.f > 1) {
            this.f = 0;
        }

        if (this.a == 0) {
            if (this.e == 1) {
                this.e = 2;
            } else {
                this.e = 1;
            }

            this.e();
        } else {
            this.g();
        }
    }

    public final void l() {
        main.GameGraphic.S.j();
        super.l();
    }

    private void g() {
        for (int var1 = 0; var1 < GameMidlet.i.e.size(); ++var1) {
            hx var2;
            fa var3;
            if ((var3 = (fa) fxClass.a((var2 = (hx) GameMidlet.i.e.elementAt(var1)).a)).j == 50 && this.g.size() != 0 && this.f < this.g.size()) {
                var2.a = ((fa) this.g.elementAt(this.f)).g;
            }

            if (var3.j == 20 && this.h.size() != 0 && this.f < this.h.size()) {
                var2.a = ((fa) this.h.elementAt(this.f)).g;
            }

            if (var3.j == 10 && this.i.size() != 0 && this.f < this.i.size()) {
                var2.a = ((fa) this.i.elementAt(this.f)).g;
            }
        }
        GameMidlet.i.h();
    }

    public final void a(Graphics var1) {
        main.GameGraphic.x.b(var1);
        main.GameGraphic.x.d(var1);
        main.GameGraphic.c(var1);
        je.a().a(var1);
        var1.translate(je.a().g, je.a().h);
        main.GameGraphic.S.d(var1, this.a, this.e, this.b, this.c);
        super.a(var1);
    }

    public static void b(boolean var0) {
        main.GameGraphic.h();
        if (var0) {
            aeClass.getInstance().t();
        } else {
            main.GameGraphic.showAlert(StringEntity.cl);
        }
    }
}
