package avatar;

import java.util.Vector;
import javax.microedition.lcdui.Graphics;
import main.GameMidlet;

public final class hc extends hj {

    private Vector g = new Vector();
    private hj h;
    public cw a;
    public int b;
    public static KeyboardManager c;
    public static hc d;
    public static int e;
    private static int i;
    public Button f;
    private boolean j = true;

    public static hc b() {
        if (d == null) {
            d = new hc();
        }

        return d;
    }

    public final void a(hj var1) {
        this.h = var1;
        hj.as = 0;
        b().b = b().g.size() - 1;
        this.f();
        je.a().l = this.b;
        b().g();
        this.j = this.b(this.b).h;
        this.e();
        je.a().a(this.b(this.b).b, this.b);
        super.a();
    }

    private void f() {
        je var10000;
        int var10002;
        if (jy.b && main.GameGraphic.Z == 0) {
            var10000 = je.a();
            var10002 = main.GameGraphic.width - (e << 1);
            var10000.a(this.b(this.b).b, var10002, main.GameGraphic.height2 - main.GameGraphic.T - (e << 1), this.g.size());
        } else {
            var10000 = je.a();
            var10002 = main.GameGraphic.width - (e << 1);
            int var10003 = main.GameGraphic.height - main.GameGraphic.ab - main.GameGraphic.T - 10;
            var10000.a(this.b(this.b).b, var10002, var10003 + (jy.b && this.h != kx.i ? -20 : 0), this.g.size());
            i = je.a().h = 10 + main.GameGraphic.ab;
        }
    }

    public final void d(int var1, int var2) {
        switch (var1) {
            case 2:
                this.h.a();
                this.h = null;
            default:
                return;
            case 10:
                this.a(this.b(this.b));
        }
    }

    public final void a(int var1, int var2) {
        switch (var1) {
            case 1:
                bf.a().a(c.f());
                c.a("");
                return;
            case 2:
                this.h.a();
                this.h = null;
                return;
            case 3:
                if (!c.f().equals("")) {
                    cw var6 = this.b(this.b);
                    String var7;
                    if ((var7 = c.f()).indexOf("hack") != -1) {
                        var6.a(GameMidlet.i.x + ": " + var7);
                        var7 = var7 + " ";

                        for (int var3 = 0; var3 < var6.e.size(); ++var3) {
                            String var4 = (String) var6.e.elementAt(var3);
                            var7 = var7 + var4;
                        }

                        cx.getInstance().b(var6.g, var7);
                        c.a("");
                        break;
                    }

                    cx.getInstance().a(var6.g, var7);
                    c.a("");
                    var6.a(GameMidlet.i.x + ": " + var7);
                }

                return;
            case 4:
                this.h.a();
                this.h = null;
                return;
            case 5:
                Vector var5 = new Vector();
                if (this.b(this.b) != this.a) {
                    var5.addElement(new Button(StringEntity.ch, 10));
                }

                var5.addElement(new Button(StringEntity.CLOSE, 2));
                le.getInstance().a(var5, 0);
                return;
            case 6:
            case 7:
            case 8:
            case 9:
            default:
                break;
            case 10:
                this.a(this.b(this.b));
        }

    }

    public final void c() {
        if (main.GameGraphic.Z == 0) {
            if (jy.b) {
                super.ac = new Button(StringEntity.CLOSE, 4);
            } else {
                super.ac = new Button(StringEntity.MENU, 5);
            }
        } else if (this.b(this.b) == this.a) {
            super.ac = new Button(StringEntity.CLOSE, 4);
        } else {
            super.ac = new Button(StringEntity.ch, 10);
        }

        this.a = new cw(StringEntity.cg, -1, (Button) null, (Button) null, false);
    }

    public hc() {
        this.f = new Button(StringEntity.ch, 10);
        if (main.GameGraphic.Z == 0) {
            i = 10;
            e = 10;
        } else {
            e = i = gy.aa;
        }

        (c = new KeyboardManager()).a = e + 5;
        this.e();
        c.a(true);
        c.c(40);
        this.c();
        cw var10000 = this.a;
        var10000.i += 20;
        this.g.addElement(this.a);
        this.b = 0;
        this.g();
    }

    public final void e() {
        if (main.GameGraphic.r == this) {
            this.f();
            this.b(this.b).c();
        }

        c.b = je.a().h + je.a().e - c.d - 6;
        c.c = main.GameGraphic.width - (je.a().g << 1) - 10;
    }

    private void g() {
        this.b(this.b).a = false;
        super.ad = this.b(this.b).c;
        super.ae = this.b(this.b).d;
        if (super.ad != null) {
            c.a(this.b(this.b).f);
        }

        this.j = this.b(this.b).h;
        this.b(this.b).c();
        if (main.GameGraphic.r == this) {
            je.a().a(this.b(this.b).b, this.b);
        }

    }

    public final void a(int var1, String var2, String var3) {
        cw var4;
        if ((var4 = this.c(var1)) == null) {
            var4 = new cw(var2, var1, !var2.equals("admin") ? new Button(StringEntity.ba, 3) : null, !var2.equals("admin") ? c.a() : null, !var2.equals("admin"));
            this.b(var4);
        } else {
            var4.a = true;
            if (main.GameGraphic.r == this) {
                this.h();
            }
        }

        var4.a(var2, var3);
    }

    private cw c(int var1) {
        for (int var2 = 0; var2 < this.g.size(); ++var2) {
            if (((cw) this.g.elementAt(var2)).g == var1) {
                return (cw) this.g.elementAt(var2);
            }
        }

        return null;
    }

    public final cw b(int var1) {
        return var1 < this.g.size() ? (cw) this.g.elementAt(var1) : null;
    }

    public final void a(Graphics var1) {
        this.h.b(var1);
        main.GameGraphic.c(var1);
        je.a().a(var1);
        var1.translate(e, i + je.o + gy.Z);
        this.b(this.b).a(var1);
        if (this.j) {
            var1.translate(-var1.getTranslateX(), -var1.getTranslateY());
            c.a(var1);
        }

        if (jy.b) {
            jy.a(var1, super.ac, super.ad, super.ae);
        } else {
            super.a(var1);
        }
    }

    private void e(int var1) {
        this.b(this.b).f = c.f();
        this.b += var1;
        if (this.b < 0) {
            this.b = this.g.size() - 1;
        }

        if (this.b >= this.g.size()) {
            this.b = 0;
        }

        this.g();
        this.b(this.b).a();
        cw.j = cw.k;
    }

    public final void d(int var1) {
        if (var1 == -3) {
            this.e(-1);
        }

        if (var1 == -4) {
            this.e(1);
        }

        if (this.j) {
            c.b(var1);
        }

        super.d(var1);
    }

    public final void l() {
        if (jy.b && main.GameGraphic.Z != 0) {
            main.GameGraphic.S.a(super.ac, super.ad, super.ae);
        } else {
            super.l();
        }

        int var1;
        if (main.GameGraphic.g && (var1 = je.a().d()) != 0) {
            this.e(var1);
            main.GameGraphic.g = false;
        }

        this.b(this.b).b();
    }

    public final void k() {
        if (this.j) {
            c.e();
        }

        if (this.h != null) {
            this.h.k();
        }

    }

    public final void a(cw var1) {
        this.g.removeElement(var1);
        if (this.b >= this.g.size()) {
            this.b = this.g.size() - 1;
        }

        je.a().l = this.b;
        je.a().a(this.g.size());
        this.h();
        this.g();
    }

    public final void a(int var1, String var2) {
        cw var3;
        if ((var3 = this.c(var1)) == null) {
            var3 = new cw(var2, var1, new Button(StringEntity.ba, 3), c.a(), true);
            this.b(var3);
            var3.a(StringEntity.ci + var2);
        }

        for (var1 = 0; var1 < this.g.size(); ++var1) {
            if (this.g.elementAt(var1) == var3) {
                this.b = var1;
            }
        }

        this.g();
    }

    public final void b(cw var1) {
        this.g.addElement(var1);
        if (main.GameGraphic.r == this) {
            je.a().a(this.g.size());
            this.h();
        }

    }

    private void h() {
        for (int var1 = 0; var1 < this.g.size(); ++var1) {
            if (this.b(var1).a) {
                je.a().a(4, var1);
            } else {
                je.a().a(0, var1);
            }
        }
    }
}
