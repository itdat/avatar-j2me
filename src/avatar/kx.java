package avatar;

import java.io.IOException;
import java.util.Vector;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import main.GameMidlet;

public abstract class kx extends hj implements cq {

    public static kx i;
    public static boolean j;
    public static boolean k;
    public static boolean l;
    public static Vector m;
    public int n;
    public int o;
    public static byte p;
    public static byte q;
    public static int r;
    private static int a;
    public static byte s;
    public static long t;
    public static long u;
    public static int v;
    public static int w;
    public static int[] x = new int[4];
    public int y = 10;
    public static int z;
    public static int A;
    public int B = -1;
    private static Button b;
    private static Button c;
    public static Button C;
    public static Button D;
    private static Button d;
    public static Button E;
    private static Image[] e;
    public static dr[] F;
    private static Vector f = new Vector();
    public static Image G;
    public static int H = 4;
    public static Vector I = new Vector();
    public static Vector J = new Vector();
    private static fh g;

    public final void d() {
        this.u();
    }

    public void a() {
        main.GameGraphic.e();
        super.a();
        i = this;
    }

    public kx() {
        this.e();
        b = new Button(StringEntity.MENU, 0);
        new Button(StringEntity.OK, 1);
        c = new Button(StringEntity.n, 2);
        C = new Button(StringEntity.w, 3);
        D = new Button(StringEntity.A, 4);
        d = new Button(StringEntity.j, 5);
        E = new Button(StringEntity.PLEASE_WAIT, 6);
    }

    public void e() {
        F = new dr[]{new dr(main.GameGraphic.o, 30 + 23 * gy.Y, 2), new dr(13 * gy.Y, main.GameGraphic.p - 20, 0), new dr(main.GameGraphic.o, main.GameGraphic.height - 28, 2), new dr(main.GameGraphic.width - 13 * gy.Y, main.GameGraphic.p - 20, 1)};
        if (main.GameGraphic.width < 200) {
            z = 26;
            A = 32;
            F = new dr[]{new dr(main.GameGraphic.o, 30 + 23 * gy.Y, 2), new dr(13 * gy.Y, main.GameGraphic.p - 20, 0), new dr(main.GameGraphic.o, main.GameGraphic.height2 - main.GameGraphic.T - 5, 2), new dr(main.GameGraphic.width - 13 * gy.Y, main.GameGraphic.p - 20, 1)};
        } else {
            z = 54;
            A = 72;
        }

        if (gy.Y == 2) {
            z = 144;
            A = 194;
        }

        if (j || k) {
            this.f();
        }

        hj.an = null;
    }

    private void b() {
        f.removeAllElements();
        t();
        gq.a().b();
    }

    public final void c(String var1) {
        super.ac = null;
        super.ad = null;
        main.GameGraphic.b(var1, 50, (gy) null);
    }

    protected void h() {
        if (h(GameMidlet.i.w).H != 1) {
            if (aeClass.u && a > GameMidlet.i.a[3]) {
                jp.b().f();
            } else {
                boolean var1;
                if (var1 = !((hn) m.elementAt(s)).o) {
                    w = 100;
                }

                o();
                main.GameGraphic.i();
                ie.a().a(var1);
            }
        }
    }

    public static void o() {
        i.ad = E;
        i.ae = null;
    }

    protected void j() {
    }

    private static void m() {
        if (!j) {
            if (aeClass.u && a > GameMidlet.i.a[3]) {
                jp.b().f();
            } else {
                int var0 = 0;
                int var1 = 0;

                for (int var2 = 0; var2 < H; ++var2) {
                    hn var3;
                    if ((var3 = (hn) m.elementAt(var2)).w != GameMidlet.i.w && var3.w != -1) {
                        if (var3.o) {
                            ++var0;
                        } else {
                            ++var1;
                        }
                    }
                }

                if (var0 != 0 && var1 <= 0) {
                    if (i == kg.a) {
                        i.ad = E;
                        i.ae = null;
                    } else {
                        main.GameGraphic.i();
                    }

                    hj.z();
                    ie.a().h();
                } else {
                    main.GameGraphic.showAlert(StringEntity.aT);
                }
            }
        }
    }

    public final void d(int var1, int var2) {
        hn var5;
        switch (var1) {
            case 1:
                Vector var6 = new Vector();
                Button var7 = new Button(StringEntity.r, 10);
                Button var3 = new Button(StringEntity.s, 11);
                Button var4 = new Button(StringEntity.t, 12);
                var6.addElement(var7);
                if (ir.a == 61) {
                    var6.addElement(var3);
                }

                var6.addElement(var4);
                le.getInstance().a(var6, 0);
                return;
            case 2:
                w();
                return;
            case 3:
                x();
                return;
            case 4:
                hc.b().a((hj) i);
                return;
            case 5:
                this.u();
                return;
            case 6:
            case 7:
            case 8:
            case 9:
            default:
                break;
            case 10:
                main.GameGraphic.u.a(StringEntity.G, 100, 1);
                return;
            case 11:
                v();
                return;
            case 12:
                main.GameGraphic.u.a(StringEntity.t, 101, 3);
                return;
            case 13:
                if (var2 < m.size()) {
                    var5 = (hn) m.elementAt(var2);
                    aeClass.getInstance();
                    aeClass.c(var5);
                    return;
                }
                break;
            case 14:
                if (var2 >= 0 && var2 < m.size()) {
                    var5 = (hn) m.elementAt(var2);
                    ie.a().c(var5.w);
                    return;
                }
                break;
            case 15:
                ie.a().a(var2 + 2);
        }

    }

    protected void a_() {
        u = 0L;
        t = 0L;
        j = false;
        k = false;
        l = false;
    }

    private static void t() {
        do1.a().b = do1.a().d = (ir.f * ir.i * gy.Y - main.GameGraphic.height) / 2;
        do1.a().a = do1.a().c = (ir.e * ir.i * gy.Y - main.GameGraphic.width) / 2;
    }

    public final void p() {
        this.f();
    }

    public final void a(int var1, hn var2) {
        m.setElementAt(var2, var1);
        this.n();
        this.f();
    }

    public void g() {
        t();
        hj.z();
    }

    public void l() {
        if (main.GameGraphic.Z != 0) {
            main.GameGraphic.S.a(super.ac, super.ad, super.ae);
        } else {
            super.l();
        }
    }

    public void k() {
        if (w > 0) {
            --w;
        }

        if (!j) {
            super.ac = b;
            do1.a().c();
        }

        for (int var1 = 0; var1 < H; ++var1) {
            hn var2;
            if ((var2 = (hn) m.elementAt(var1)).w != -1) {
                var2.d();
            }
        }

        if (g != null && g.a()) {
            g = null;
        }

    }

    public final void q() {
        if (r == GameMidlet.i.w) {
            if (super.ad != E) {
                super.ad = c;
                c.text = StringEntity.n;
            }

            boolean var1 = true;

            for (int var2 = 0; var2 < H; ++var2) {
                hn var3;
                if ((var3 = (hn) m.elementAt(var2)).w == -1) {
                    var1 = false;
                } else if (var3.w != GameMidlet.i.w && !var3.o) {
                    var1 = false;
                }
            }

            if (var1 && main.GameGraphic.l % 10 > 7) {
                c.text = "";
                return;
            }
        } else if (!k) {
            super.ad = d;
            d.text = StringEntity.j;

            for (int var4 = 0; var4 < H; ++var4) {
                hn var5;
                if ((var5 = (hn) m.elementAt(var4)).w == GameMidlet.i.w) {
                    if (!var5.o) {
                        if (main.GameGraphic.l % 10 > 7) {
                            d.text = "";
                        }
                    } else {
                        d.text = StringEntity.k;
                        if (w == 0) {
                            super.ad = d;
                        } else {
                            super.ad = null;
                        }
                    }
                }
            }
        }

    }

    public final void d(int var1) {
        im.d().a(var1, this);
        super.d(var1);
    }

    public void a(Graphics var1) {
        if (g != null) {
            g.a(var1);
        }

        if (jy.b) {
            jy.a(var1, super.ac, super.ad, super.ae);
        } else {
            super.a(var1);
        }

        ir.a(var1);
        main.GameGraphic.b(var1);
    }

    public void a_(Graphics var1) {
        main.GameGraphic.c(var1);

        for (int var2 = 0; var2 < H; ++var2) {
            hn var3;
            if ((var3 = (hn) m.elementAt(var2)).w != -1) {
                var3.a(var1, var3.aw, var3.ax);
                a(var1, var3.aw, var3.ax - 50 - (!j && ir.y == -1 ? 10 * gy.Y : 0), 3, var3);
                var3.a(var1, var3.aw, var3.ax, false);
            }
        }

    }

    public static void d(Graphics var0) {
        for (int var1 = 0; var1 < m.size(); ++var1) {
            hn var2;
            if ((var2 = (hn) m.elementAt(var1)).w != -1 && var2.O != null) {
                var2.O.a(var0);
            }
        }

    }

    public void b(Graphics var1) {
        main.GameGraphic.c(var1);
        var1.setClip(0, 0, main.GameGraphic.width, main.GameGraphic.height + main.GameGraphic.T);
        if (!j && !k) {
            main.GameGraphic.c(var1);
            if (jy.b) {
                e(var1);
            } else {
                var1.setClip(0, 0, main.GameGraphic.width, main.GameGraphic.height + main.GameGraphic.T);
                var1.setColor(0);
                var1.fillRect(0, 0, main.GameGraphic.width, main.GameGraphic.height + main.GameGraphic.T);
                var1.translate(-do1.a().a, -do1.a().b);
                main.GameGraphic.x.c(var1);
                if (main.GameGraphic.width > 150) {
                    main.GameGraphic.N.a(var1, el.c, do1.a().a + main.GameGraphic.o, do1.a().b + main.GameGraphic.p - gy.af - gy.af / 2 - 5, 2);
                    main.GameGraphic.N.a(var1, "P: " + p + " - B: " + q, do1.a().a + main.GameGraphic.o, do1.a().b + main.GameGraphic.p - gy.af / 2 - 5, 2);
                    main.GameGraphic.Q.a(var1, a + StringEntity.k(), do1.a().a + main.GameGraphic.o, do1.a().b + main.GameGraphic.p - 5 + gy.af / 2, 2);
                    d(var1);
                }
            }
        } else {
            e(var1);
        }
    }

    private static void e(Graphics var0) {
        main.GameGraphic.S.b(var0);
        if (!j) {
            main.GameGraphic.K.a(var0, "P: " + p + " - B: " + q, main.GameGraphic.o, main.GameGraphic.height / 2 - 10 * gy.Y, 2);
            main.GameGraphic.Q.a(var0, a + StringEntity.k(), main.GameGraphic.o, main.GameGraphic.height / 2 + 10 * gy.Y, 2);
        } else {
            if (main.GameGraphic.r == ek.a) {
                ek.a.c(var0);
            }

        }
    }

    public static void a(Graphics var0, int var1, int var2, int var3, hn var4) {
        if (!j) {
            if (var4.w == r) {
                var0.drawImage(e[1], var1, var2, 3);
                return;
            }

            if (var4.o) {
                var0.drawImage(e[0], var1, var2, 3);
            }
        }

    }

    private void u() {
        if (j && !k && !l) {
            main.GameGraphic.a(StringEntity.cv, 0, this);
        } else {
            this.a(0);
        }
    }

    public final void a(int var1) {
        switch (var1) {
            case 0:
                main.GameGraphic.J = 0;
                this.a_();
                ie.a().g();
                ie.a().a(p);
                if (H == 2) {
                    this.c("");
                }

                t();
                main.GameGraphic.i();
            default:
        }
    }

    public void a(int var1, int var2) {
        switch (var1) {
            case 0:
                Button var6 = new Button(StringEntity.ab, 1);
                Button var7 = new Button(StringEntity.v, 2);
                int var3 = 0;

                for (int var4 = 0; var4 < H; ++var4) {
                    if (((hn) m.elementAt(var4)).w != -1) {
                        ++var3;
                    }
                }

                Vector var8 = new Vector();
                if (r == GameMidlet.i.w && !j) {
                    var8.addElement(var6);
                    if (var3 > 1) {
                        var8.addElement(var7);
                    }
                }

                if (var3 > 1) {
                    var8.addElement(new Button(StringEntity.ADD_FRIEND, 3));
                }

                var8.addElement(new Button(StringEntity.q, 4));
                var8.addElement(new Button(StringEntity.u, 5));
                le.getInstance().a(var8, 0);
                return;
            case 1:
                i.b();
                return;
            case 2:
                m();
                return;
            case 3:
                i.g();
                return;
            case 4:
                i.j();
                return;
            case 5:
                i.h();
                return;
            case 6:
                return;
            case 50:
                this.g();
                this.b();
                j = false;
                this.B = -1;
                v = 0;
                return;
            case 100:
                try {
                    if ((var1 = Integer.parseInt(main.GameGraphic.u.a())) < 0) {
                        return;
                    } else {
                        main.GameGraphic.h();
                        if (aeClass.u && var1 > GameMidlet.i.a[3]) {
                            jp.b().f();
                            return;
                        }

                        ie.a().b(var1);
                        return;
                    }
                } catch (Exception var5) {
                    return;
                }
            case 101:
                ie.a().b(main.GameGraphic.u.a());
                main.GameGraphic.showAlert(StringEntity.I);
            default:
        }
    }

    private static void v() {
        Vector var0 = new Vector();

        for (int var1 = 0; var1 < 3; ++var1) {
            var0.addElement(new Button(StringEntity.ej[var1], 15, var1));
        }

        le.getInstance().a(var0, 0);
    }

    private static void w() {
        Vector var0 = new Vector();

        for (int var1 = 0; var1 < H; ++var1) {
            hn var2;
            if ((var2 = (hn) m.elementAt(var1)).w != GameMidlet.i.w && var2.w != -1) {
                var0.addElement(new Button(var2.l, 14, var1));
            }
        }

        le.getInstance().a(var0, 0);
    }

    private static void x() {
        Vector var0 = new Vector();

        for (int var1 = 0; var1 < H; ++var1) {
            hn var2;
            if ((var2 = (hn) m.elementAt(var1)).w != GameMidlet.i.w && var2.w != -1) {
                var0.addElement(new Button(var2.x, 13, var1));
            }
        }

        if (var0.size() == 1) {
            ((Button) var0.elementAt(0)).b();
        }

        le.getInstance().a(var0, 0);
    }

    public final void e(int var1) {
        hn var2;
        if ((var2 = h(var1)) != null) {
            a(var2.x + StringEntity.aU, 30, var2.w);
            var2.w = -1;
            var2.a("");
            var2.d(0);
            var2.o = false;
        }

        this.n();
        if (j || k) {
            this.f();
        }

    }

    public static void f(int var0) {
        r = var0;
        hn var1;
        if ((var1 = h(var0)) != null) {
            var1.o = true;
        }

    }

    public void a(byte var1, byte var2, int var3, int var4, Vector var5) {
        if (e == null) {
            e = new Image[2];

            try {
                e[0] = Image.createImage(StringEntity.a() + "/on/ready.on");
                e[1] = Image.createImage(StringEntity.a() + "/on/owner.on");
            } catch (IOException var7) {
                var7.printStackTrace();
            }
        }

        p = var1;
        q = var2;
        a = var4;
        if (m != null) {
            m.removeAllElements();
        }

        m = var5;
        f(var3);

        for (int var8 = 0; var8 < H; ++var8) {
            hn var9;
            (var9 = (hn) m.elementAt(var8)).K = 0;
            var9.b((byte) 2);
            var9.f(var9.H);
            if (var9.w == GameMidlet.i.w) {
                s = (byte) var8;
                break;
            }
        }

        this.n();
        if (H > 2) {
            main.GameGraphic.S.b();
        }

    }

    public static void r() {
        for (int var0 = 0; var0 < H; ++var0) {
            ((hn) m.elementAt(var0)).o = false;
        }

    }

    public final void g(int var1) {
        a = var1;
        r();
    }

    public static void b(int var0, boolean var1) {
        hn var2;
        if ((var2 = h(var0)) != null) {
            var2.o = var1;
        }

    }

    public final void a(String var1) {
        if (!var1.trim().equals("")) {
            ie.a().a(var1);
            a(GameMidlet.i.w, var1);
        }
    }

    public static void a(int var0, String var1) {
        hn var3 = h(var0);
        hn var2 = new hn();
        if (var3 != null) {
            var2.aw = var3.aw;
            var2.ax = var3.ax;
            var2.w = var3.w;
            if (var2.w != -1) {
                if (j && jp.e == 0) {
                    var2.aw = main.GameGraphic.o;
                    if (var2.w != GameMidlet.i.w) {
                        var2.ax = 30;
                    } else {
                        var2.ax = main.GameGraphic.height - 40;
                    }
                }

                a(var1, 50, var2.w);
            }

        }
    }

    public static void c(int var0, int var1) {
        if (var1 != 0) {
            if (!j) {
                var0 = i(var0);
                main.GameGraphic.a(var1, F[x[var0]].a, F[x[var0]].b, -1, -1);
            } else {
                hn var2 = h(var0);
                main.GameGraphic.a(var1, var2.aw, var2.ax, -1, -1);
            }
        }
    }

    public static boolean a(byte var0, byte var1) {
        return p == var0 && q == var1;
    }

    public final void s() {
        this.n();
    }

    public static void a(String var0, int var1, int var2) {
        if (var2 == -1) {
            if (g == null) {
                (g = new fh(var1, var0, (byte) 0)).a(main.GameGraphic.o, main.GameGraphic.p - 20);
            } else {
                g.a(var1, var0);
            }
        } else {
            for (int var3 = 0; var3 < m.size(); ++var3) {
                gx var4;
                if ((var4 = (gx) m.elementAt(var3)).w == var2) {
                    if (var4.O == null) {
                        var4.O = new fh(var1, var0, (byte) 0);
                        var4.O.a(var4.aw, var4.ax - 45);
                    } else {
                        var4.O.a(var1, var0);
                    }
                }
            }

        }
    }

    public void n() {
        int var1 = 0;
        int var2 = 0;

        for (int var3 = 0; var3 < H; ++var3) {
            hn var4;
            (var4 = (hn) m.elementAt(var3)).b((byte) 0);
            if (var4.w != -1) {
                ++var1;
                if (var4.w != GameMidlet.i.w) {
                    var2 = var3;
                }
            }
        }

        int[] var5 = new int[H];
        int var6 = 2;
        if (var1 == 2) {
            var5[s] = 2;
            var5[var2] = 0;
        } else {
            for (var1 = s; var1 < s + H; ++var1) {
                var2 = var1;
                if (var1 > H - 1) {
                    var2 = var1 - H;
                }

                var5[var2] = var6++;
                if (var6 >= H) {
                    var6 = 0;
                }
            }
        }

        x = var5;
    }

    public static hn h(int var0) {
        for (int var1 = 0; var1 < H; ++var1) {
            hn var2;
            if ((var2 = (hn) m.elementAt(var1)).w == var0) {
                return var2;
            }
        }

        return null;
    }

    public static int i(int var0) {
        for (int var1 = 0; var1 < H; ++var1) {
            if (((hn) m.elementAt(var1)).w == var0) {
                return var1;
            }
        }

        return -1;
    }

    public void f() {
        do1.a().b(0, 0);

        for (int var1 = 0; var1 < H; ++var1) {
            hn var2;
            if ((var2 = (hn) m.elementAt(var1)).w != -1) {
                var2.h = 0;
                var2.b((byte) 0);
                var2.f(var2.H);
                var2.C = var2.aw = F[x[var1]].a;
                var2.D = var2.ax = F[x[var1]].b;
                if (x[var1] != 2 && x[var1] != 3) {
                    var2.K = var2.t = 0;
                } else {
                    var2.K = var2.t = gx.J;
                }
            }
        }
    }
}
