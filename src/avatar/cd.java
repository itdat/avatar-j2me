package avatar;

import java.util.Vector;
import javax.microedition.lcdui.Graphics;
import main.GameMidlet;

public final class cd extends hj {

    public static cd a;
    private int d;
    private int e;
    private int f;
    private int g;
    private int h;
    private int i;
    private boolean j = false;
    private Vector k;
    private short[] l;
    private hj m;
    private Button n;
    public dr b;
    private static hz o;
    public boolean c = false;
    private boolean p;
    private long q = 0L;
    private boolean r = false;
    private int s;

    public static cd b() {
        return a == null ? (a = new cd()) : a;
    }

    public final void a() {
        if (main.GameGraphic.r != this) {
            this.m = main.GameGraphic.r;
        }

        this.c();
        super.a();
    }

    public final void a(int var1, int var2) {
        switch (var1) {
            case 0:
                this.h();
                return;
            case 1:
                this.h();
                Button var3;
                if ((var3 = (Button) this.k.elementAt(this.d)).b != null) {
                    var3.b.a();
                    return;
                } else {
                    this.d(var3.c, var3.e);
                }
            default:
        }
    }

    public final void c() {
        if (main.GameGraphic.Z == 0) {
            super.ae = new Button(StringEntity.CLOSE, 0);
        } else {
            this.j = true;
        }

        this.n = new Button(StringEntity.CHOOSE, 1);
    }

    public cd() {
        this.s = 50 * gy.Y;
    }

    private void h() {
        this.m.a();
        if (aeClass.h != null) {
            aeClass.h.L = false;
        }

        this.r = false;
        o = null;
        super.ad = null;
        this.p = false;
    }

    public final void d(int var1, int var2) {
        bc var8;
        switch (var1) {
            case 1:
                aeClass.getInstance().j();
                return;
            case 2:
                cd var10 = this;
                byte[] var11 = new byte[]{4, 5, 6, 7, 8, 9, 10, 11, 12};
                Vector var12 = new Vector();

                for (int var13 = 0; var13 < var11.length; ++var13) {
                    var12.addElement(new jl(var10, "", 19, var13, var11, var13));
                }

                var10.b = null;
                var10.a(var12);
                return;
            case 3:
                this.e();
                return;
            case 4:
                aeClass.x = true;
                bf.a().doRequestYourInfo(GameMidlet.i.w);
                return;
            case 5:
                cy.b().b(false);
                return;
            case 6:
                this.c = false;
                cx.getInstance().c(GameMidlet.i.w);
                return;
            case 7:
                aeClass.getInstance();
                aeClass.c(aeClass.h);
                return;
            case 8:
                cx.getInstance().requestShop(26);
                main.GameGraphic.i();
                return;
            case 9:
                aeClass.getInstance().g();
                return;
            case 10:
                aeClass.getInstance();
                aeClass.o();
                return;
            case 11:
                aeClass.x = true;
                aeClass.getInstance();
                aeClass.p();
                return;
            case 12:
                aeClass.getInstance().i();
                return;
            case 13:
                aeClass.getInstance();
                aeClass.h();
                return;
            case 14:
            default:
                break;
            case 15:
                aeClass.getInstance().a(GameMidlet.j);
                return;
            case 16:
                if ((var8 = (bc) aeClass.o.elementAt(var2)).f == 1) {
                    cx.getInstance().doRequestCmdRotate(var8.e, aeClass.h != null ? aeClass.h.w : -1);
                    return;
                }
                break;
            case 17:
                cx.getInstance().doCommunicate(var2);
                return;
            case 18:
                if ((var8 = (bc) aeClass.o.elementAt(var2)).f == 0) {
                    cx.getInstance().doRequestCmdRotate(var8.e, aeClass.h != null ? aeClass.h.w : -1);
                }
                break;
            case 19:
                byte[] var7 = new byte[]{4, 5, 6, 7, 8, 9, 10, 11, 12};
                if (var2 == 0) {
                    aeClass.getInstance();
                    aeClass.b((int) 4);
                    return;
                }

                aeClass.getInstance();
                aeClass.b((int) var7[var2]);
                return;
            case 20:
                if (GameMidlet.i.Q != 0 && GameMidlet.i.Q != -5 || ca.b) {
                    return;
                }

                if (ir.p == null || ir.p.az != 5) {
                    Vector var9 = new Vector();
                    Button var3 = this.a(StringEntity.cw, 4, 17);
                    Button var4 = this.a(StringEntity.dr, 6, 14);
                    Button var5 = this.a(StringEntity.l, 21, 14);
                    Button var6 = this.a(StringEntity.cd, 15, 17);
                    var9.addElement(var3);
                    var9.addElement(var6);
                    var9.addElement(var5);
                    var9.addElement(var4);
                    if (main.GameGraphic.r != dp.b()) {
                        b().a(var9);
                    }

                    return;
                }

                bf.a().c(((hm) ir.p).d);
                break;
            case 21:
                cx.getInstance().c(GameMidlet.i.w);
                this.c = true;
        }

    }

    public final void e() {
        if (aeClass.h != null) {
            this.r = false;
            Vector var1;
            (var1 = new Vector()).addElement(this.a(StringEntity.bT, 9, 13));
            var1.addElement(this.a(StringEntity.bW, 12, 2));
            var1.addElement(this.a(StringEntity.ADD_FRIEND, 7, 11));
            var1.addElement(this.a(StringEntity.GIVE_GIFT, 8, 12));
            var1.addElement(this.a(StringEntity.bU, 10, 21));
            var1.addElement(this.a(StringEntity.bV, 11, 19));
            var1.addElement(this.a(StringEntity.dj, 13, 22));
            if (aeClass.o.size() > 0) {
                for (int var2 = 0; var2 < aeClass.o.size(); ++var2) {
                    bc var3;
                    if ((var3 = (bc) aeClass.o.elementAt(var2)).f == 1) {
                        var1.addElement(new ji(this, var3.a, 16, var2, var3));
                    }
                }
            }

            this.a(var1);
        }
    }

    public final void f() {
        if (GameMidlet.i.Q == 0 || GameMidlet.i.Q == -5) {
            if (!ca.b) {
                if (ir.p != null && ir.p.az == 5) {
                    bf.a().c(((hm) ir.p).d);
                } else if (ir.p != null && ir.p.az == 0 && ((hn) ir.p).w == -100) {
                    main.GameGraphic.a(StringEntity.eb, (ii) (new jc(this)));
                } else {
                    Vector var1 = new Vector();
                    Button var2 = this.a(StringEntity.bX, 1, 1);
                    Button var3 = this.a(StringEntity.bY, 2, 0);
                    Button var4 = this.a(StringEntity.TRANSACTION, 3, 20);
                    Button var5 = this.a(StringEntity.by, 20, 17);
                    Button var6 = this.a(StringEntity.aa, 5, 18);
                    if (main.GameGraphic.Z == 0) {
                        var1.addElement(var4);
                    }

                    var1.addElement(var5);
                    var1.addElement(var3);
                    if (main.GameGraphic.Z == 0) {
                        var1.addElement(aeClass.getInstance().f);
                    }

                    if (GameMidlet.i.H != 14) {
                        var1.addElement(var2);
                    }

                    var1.addElement(var6);
                    int var7;
                    bc var8;
                    if (main.GameGraphic.Z > 0 && aeClass.n != null && aeClass.n.size() > 0) {
                        for (var7 = 0; var7 < aeClass.n.size(); ++var7) {
                            var8 = (bc) aeClass.n.elementAt(var7);
                            var1.addElement(new jg(this, var8.a, 17, var7, var8));
                        }
                    }

                    if (aeClass.o.size() > 0) {
                        for (var7 = 0; var7 < aeClass.o.size(); ++var7) {
                            if ((var8 = (bc) aeClass.o.elementAt(var7)).f == 0) {
                                var1.addElement(new ix(this, var8.a, 18, var7, var8));
                            }
                        }
                    }

                    if (main.GameGraphic.r != dp.b()) {
                        this.b = null;
                        b().a(var1);
                    }
                }
            }
        }
    }

    public static void g() {
        hn var0 = GameMidlet.i;
        if (main.GameGraphic.r != a) {
            dp.b().m = true;
            dp.b().a(new String[]{StringEntity.l, StringEntity.co}, new Vector[]{aeClass.getInstance().a((hn) var0, 0), aeClass.getInstance().a(GameMidlet.k, var0.w, 1)}, (Vector) null);
            dp.b().a(aeClass.getInstance().a(var0.e, 0, 0, false), 0);
            dp.b().a(aeClass.getInstance().a(GameMidlet.k, 1, 0, true), 1);
            if (main.GameGraphic.r != dp.b()) {
                dp.b().a();
            }

        }
    }

    private Button a(String var1, int var2, int var3) {
        return new iz(this, var1, var2, var3);
    }

    public final Button a(String var1, ii var2, int var3) {
        return new iv(this, var1, new iu(this, var2), var3);
    }

    public final void a(Vector var1) {
        this.k = var1;
        if (main.GameGraphic.H) {
            this.g = 40 * gy.Y + (gy.Y - 1) * 20;
            if (main.GameGraphic.Z == 1 && main.GameGraphic.width > 300) {
                this.g += 20;
            }
        } else {
            this.g = 30;
        }

        this.h = this.g + 2 * gy.Y;
        this.f = gy.ag << 1;
        this.e = 0;
        this.i = main.GameGraphic.width / this.h;
        if (var1.size() * this.h < main.GameGraphic.width) {
            this.e = (main.GameGraphic.width - var1.size() * this.h) / 2;
        } else {
            this.e = (main.GameGraphic.width - this.i * this.h) / 2;
        }

        this.l = new short[var1.size()];

        for (int var2 = 0; var2 < this.l.length; ++var2) {
            this.l[var2] = -40;
        }

        if (this.d >= var1.size()) {
            this.d = 0;
        }

        this.r = false;
        if (aeClass.h != null && main.GameGraphic.Z > 0) {
            aeClass.h.L = true;
        }

        if (main.GameGraphic.Z > 0) {
            this.f = main.GameGraphic.p - (var1.size() / this.i + 1) * this.g / 2;
        }

        this.a();
        if (main.GameGraphic.Z == 0) {
            super.ad = this.n;
        }

    }

    public final void k() {
        this.m.k();

        for (int var1 = 0; var1 < this.l.length; ++var1) {
            if (this.l[var1] != var1 % this.i * this.h) {
                short[] var10000 = this.l;
                var10000[var1] = (short) (var10000[var1] + (var1 % this.i * this.h - this.l[var1]) / 3);
            }
        }

    }

    public final void l() {
        if (main.GameGraphic.g) {
            boolean var1 = false;

            for (int var2 = this.k.size() - 1; var2 >= 0; --var2) {
                if (main.GameGraphic.a(this.l[var2] + this.e, this.f + var2 / this.i * this.h, this.g, this.g)) {
                    this.d = var2;
                    this.p = true;
                    this.j = false;
                    var1 = true;
                    this.q = System.currentTimeMillis() / 100L;
                    break;
                }
            }

            if (!var1) {
                this.h();
            }
        }

        int var3;
        if (this.p) {
            if (System.currentTimeMillis() / 100L - this.q > 10L) {
                this.j = false;
            }

            if (main.GameGraphic.f) {
                this.p = false;
                this.j = true;

                for (var3 = this.k.size() - 1; var3 >= 0; --var3) {
                    if (main.GameGraphic.a(this.l[var3] + this.e, this.f + var3 / this.i * this.h, this.g, this.g)) {
                        if (var3 == this.d) {
                            this.h();
                            this.a(1, -1);
                        }
                        break;
                    }
                }

                main.GameGraphic.f = false;
            }
        }

        if (main.GameGraphic.a(4)) {
            --this.d;
            if (this.d < 0) {
                this.d = this.k.size() - 1;
            }
        } else if (main.GameGraphic.a(6)) {
            ++this.d;
            if (this.d >= this.k.size()) {
                this.d = 0;
            }
        } else if (main.GameGraphic.a(2)) {
            if ((var3 = this.d - this.i) < 0) {
                if ((var3 = this.k.size() / this.i * this.i + this.i + var3) < this.k.size()) {
                    this.d = var3;
                }
            } else {
                this.d = var3;
            }
        } else if (main.GameGraphic.a(8)) {
            this.d += this.i;
            if (this.d >= this.k.size()) {
                this.d %= this.i;
            }
        }

        super.l();
    }

    public final void a(Graphics var1) {
        this.m.b(var1);
        main.GameGraphic.c(var1);
        Graphics var3 = var1;
        cd var2 = this;
        if (GameMidlet.i.H != 14) {
            GameMidlet.i.a(var1, GameMidlet.i.aw * gy.Y - do1.a().a, GameMidlet.i.ax * gy.Y - do1.a().b, false);
        }

        Button var4 = (Button) this.k.elementAt(this.d);
        main.GameGraphic.L.a(var1, var4.text, main.GameGraphic.o, this.f - 15, 2);
        var1.translate(this.e, this.f);

        for (int var5 = this.k.size() - 1; var5 >= 0; --var5) {
            byte var7 = 0;
            Button var6 = (Button) var2.k.elementAt(var5);
            if (var5 == var2.d && !var2.j) {
                var7 = 4;
            }

            main.GameGraphic.S.a(var3, var2.l[var5], var5 / var2.i * var2.h, var2.g, var2.g, var7);
            var6.a(var3, var2.h / 2 + var2.l[var5], var2.h / 2 + var5 / var2.i * var2.h);
        }

        super.a(var1);
    }
}
