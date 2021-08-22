package avatar;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Vector;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import main.GameGraphic;
import main.GameMidlet;

public final class aeClass extends hj implements cq {

    public static aeClass INST; // a
    public static byte b;
    public static byte c;
    public static Image d;
    private Button H;
    public Button e;
    public Button f;
    private Button I;
    private Button J;
    public static byte g = -1;
    public static hn h;
    public static byte i = -1;
    public static String j;
    public static Image k;
    public static Vector l = new Vector();
    public static int m = -1;
    public static Vector n;
    public static Vector o;
    public static Vector p;
    public static Vector q;
    public static boolean r = false;
    public static boolean s = false;
    public static boolean t = false;
    public static boolean u = false;
    public static int v = -1;
    static byte[] w = new byte[]{10, 4, 3, 5};
    private byte K = 0;
    private byte L = -1;
    public static boolean x = false;
    private Vector M = new Vector();
    private int N;
    private int O = 60;
    public boolean y = true;
    public static byte z;
    public static byte A;
    public static short[] B;
    public static hn C;
    public static int D = -1;
    public static int E;
    public static int F;
    public static int G = -1;

    public final void a() {
        this.c();
        super.a();
    }

    // b
    public static aeClass getInstance() {
        if (INST == null) {
            INST = new aeClass();
        }
        return INST;
    }

    public final void c() {
        this.H = new Button(StringEntity.MENU, 0, this);
        super.ac = this.H;
        this.f = cd.b().a(StringEntity.EVENT, new ig(this), 15);
        this.e = new Button(GameGraphic.H ? (GameGraphic.Z == 0 ? StringEntity.CHOOSE : StringEntity.MENU) : "", 1, this);
        if (GameGraphic.Z > 0 && GameGraphic.D == null) {
            super.ac = this.e;
        }
        this.I = new Button(StringEntity.EXIT, 2, this);
        this.J = new Button(StringEntity.TRANSACTION, 2);
    }

    public final void a(int var1) {
        switch (var1) {
            case 0:
                this.A();
                return;
            case 1:
                if (!t) {
                    cd.b().f();
                    return;
                }
                break;
            case 2:
                this.e();
                return;
            case 3:
                w();
        }
    }

    public final void d() {
        this.I.b();
    }

    public aeClass() {
        this.c();
    }

    public final void e() {
        GameGraphic.i();
        g = -1;
        i = -1;
        if (GameMidlet.e == 8) {
            this.t();
        } else {
            cx.getInstance().d((int) 8);
        }
    }

    protected static void f() {
        hc.b().a(GameGraphic.r);
    }

    protected final void g() {
        if (h != null) {
            f(100);
        }
    }

    protected static void h() {
        if (h != null) {
            bf.a().c(0, h.w);
        }
    }

    public final void a(byte var1, int var2) {
        GameGraphic.h();
        hn var3;
        if ((var3 = ir.g(var2)) != null) {
            if (var1 == 0) {
                GameGraphic.a(StringEntity.INVITED_HOME_BY + var3.x + ". " + StringEntity.DO_YOU_WANT, (ii) (new ih(this, var2)));
            } else {
                if (var1 == 1) {
                    v = var2;
                    cx.getInstance().d((int) 11);
                    GameGraphic.i();
                }
            }
        }
    }

    protected final void i() {
        hc.b().a(h.w, h.x);
        hc.b().a((hj) this);
    }

    private void A() {
        Vector var1 = new Vector();
        short[] var2 = null;
        if (ir.a != 25 && n != null && n.size() > 0) {
            var2 = new short[n.size()];
            for (int var3 = 0; var3 < n.size(); ++var3) {
                bc var4 = (bc) n.elementAt(var3);
                var2[var3] = (short) var4.d;
                var1.addElement(new Button(var4.a, 2, var3));
            }
        }
        var1.addElement(this.I);
        le var10000 = le.getInstance();
        boolean var5 = false;
        le var6 = var10000;
        var10000.a(var1, 0);
        le.h = var2;
        if (var2 != null) {
            var6.c += var6.e;
        }
    }

    public static void a(byte var0) {
        GameMidlet.i.a(var0);
        iy.a().a((int) var0);
    }

    public static void b(int var0) {
        GameMidlet.i.e(var0);
        GameMidlet.i.U = GameMidlet.i.S;
        GameMidlet.i.T = 0;
        iy.a().a(var0 + 100);
    }

    public static void a(int var0, byte var1) {
        hn var2;
        if ((var2 = ir.g(var0)) != null) {
            if (var1 >= 100) {
                var2.e(var1 - 100);
                var2.U = var2.S;
                var2.T = 0;
                return;
            }
            var2.a(var1);
        }
    }

    protected final void j() {
        Vector var1 = new Vector();
        for (int var2 = 0; var2 < 4; ++var2) {
            Button var3 = cd.b().a(StringEntity.CHARACTER_ACTIONS[var2], new io(this, var2), var2 + 7);
            var1.addElement(var3);
        }
        cd.b().b = null;
        cd.b().a(var1);
    }

    public final void k() {
        GameGraphic.x.b();
        if (GameGraphic.Z == 0 && ir.p != null) {
            if (h != null && ir.p.az != 5 && h.w > 2000000000) {
                super.ad = this.J;
            } else {
                super.ad = null;
            }
            super.ae = ir.q;
            if (ir.p.az == 0) {
                super.ae.text = ((hn) ir.p).x;
                if (super.ae.text.length() > 8) {
                    super.ae.text = super.ae.text.substring(0, 8) + "..";
                }
            }
        }
        if (ir.p == null && super.ae == ir.q) {
            super.ae = null;
            super.ad = null;
        }
        hn var2;
        hn var3;
        if (t) {
            hn var4;
            if (this.K == 1 && GameGraphic.J == -1) {
                System.out.println("updateWedding1111111111111: " + this.K);
                this.K = 2;
                var2 = ir.g(-100);
                var3 = ir.g(E);
                var4 = ir.g(F);
                if (var3 != null && var4 != null) {
                    do1.a().h = var2;
                    System.out.println("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
                    var2.a(150, StringEntity.eB[0] + var3.x + StringEntity.eB[1] + var4.x + StringEntity.eB[2], (byte) 1);
                } else {
                    this.B();
                }
            }
            if (this.K == 2 && GameGraphic.l % 4 == 2 && ir.g(-100).O == null) {
                this.K = 3;
                var3 = ir.g(E);
                var4 = ir.g(F);
                if (var3 != null && var4 != null) {
                    var4.C = 26 * ir.i - ir.i;
                    var4.Q = -5;
                    var3.C = 26 * ir.i - (ir.i << 1);
                    var3.Q = -5;
                    do1.a().h = var3;
                } else {
                    this.B();
                }
            }
            if (this.K == 3) {
                var2 = ir.g(E);
                var3 = ir.g(F);
                if (var2 != null && var3 != null && var2.Q == 0 && var3.Q == 0) {
                    this.K = 4;
                    var4 = ir.g(-100);
                    do1.a().h = var4;
                    var4.a(200, StringEntity.eC[0] + var2.x + StringEntity.eB[1] + var3.x, (byte) 1);
                    var4.a(200, StringEntity.eC[1], (byte) 1);
                    var4.a(150, StringEntity.eC[2], (byte) 1);
                    var4.a(100, StringEntity.eC[3], (byte) 1);
                }
            }
            if (this.K == 4) {
                var2 = ir.g(E);
                var3 = ir.g(F);
                var2.G = 4;
                var3.G = 4;
                if ((var4 = ir.g(-100)).O == null && var4.P.size() == 0) {
                    if (E == GameMidlet.i.w) {
                        bf.a().b(F, 101);
                    }
                    this.L = 0;
                    this.K = 5;
                }
            }
        }
        if (this.K == 5 && this.L >= 0) {
            ++this.L;
            if (this.L > 20) {
                if (this.L == 21) {
                    ba var5 = new ba(2, 0);
                    GameGraphic.B.addElement(var5);
                    do1.a().h = GameMidlet.i;
                    GameMidlet.i.G = 4;
                }
                if (GameMidlet.i.w != E) {
                    t = false;
                    this.L = -1;
                }
                if (GameMidlet.i.Q == 0 && GameMidlet.i.w == E) {
                    t = false;
                    var2 = ir.g(E);
                    var3 = ir.g(F);
                    if (var2 != null && var3 != null) {
                        var2.G = 4;
                        var3.G = 4;
                    }
                    this.K = 6;
                    this.L = -1;
                    bf.a().b(F, 102);
                }
            }
        }
        if (super.ad == null && GameGraphic.Z == 0 && GameGraphic.D == null) {
            super.ad = this.e;
        } else if (GameGraphic.D != null) {
            super.ad = null;
        }
        if (l.size() > 0) {
            for (int var1 = 0; var1 < l.size(); ++var1) {
                ((db) l.elementAt(var1)).c();
            }
        }
        if (this.N > 0) {
            --this.N;
            if (this.N == 0) {
                if (this.M.size() > 0) {
                    this.M.removeElementAt(0);
                }
                if (this.M.size() > 0) {
                    this.N = this.O;
                }
            }
        }
    }

    private void B() {
        t = false;
        this.K = 0;

        for (int var1 = 0; var1 < ir.m.size(); ++var1) {
            js var2;
            if ((var2 = (js) ir.m.elementAt(var1)).az == 0) {
                hn var3;
                (var3 = (hn) var2).G = 4;
            }
        }

    }

    public final void l() {
        if (GameGraphic.g && GameGraphic.a(0, 0, GameGraphic.width, 0)) {
            GameGraphic.g = false;
            cx.getInstance().c(GameMidlet.i.w);
        }
        if (GameGraphic.D == null || !bb.d) {
            super.l();
        }
        GameGraphic.x.a();
        GameMidlet.i.e();
    }

    public final void a(Graphics var1) {
        this.b(var1);
        if (GameGraphic.D == null || !bb.d) {
            super.a(var1);
        }
        GameGraphic.a(var1);
    }

    public final void b(Graphics var1) {
        GameGraphic.c(var1);
        GameGraphic.x.b(var1);
        int var2;
        if (l.size() > 0) {
            for (var2 = 0; var2 < l.size(); ++var2) {
                ((db) l.elementAt(var2)).a(var1);
            }
        }
        GameGraphic.x.d(var1);
        GameGraphic.c(var1);
        if (this.M.size() != 0) {
            String var4 = (String) this.M.elementAt(0);
            if ((var2 = this.O - this.N) > 10) {
                var2 = 10;
            }
            int var5 = GameGraphic.width;
            for (int var6 = 0; var6 < var2; ++var6) {
                var5 >>= 1;
            }
            GameGraphic.L.a(var1, var4, var5 + 3, 2, 0);
        }
        GameGraphic.c(var1);
    }

    public final void a(int var1, int var2) {
        switch (var1) {
            case 0:
                this.A();
                return;
            case 2:
                cx.getInstance().doCommunicate(h.w);
                return;
            case 52:
                if (GameGraphic.r == ea.a && ir.a == -1) {
                    GameGraphic.i();
                    cx.getInstance().d((int) 8);
                }
            default:
        }
    }

    public final void a(byte var1, byte var2, short var3, short var4, Vector var5, Vector var6, Vector var7) {
        if (var2 == -1) {
            GameGraphic.b(StringEntity.aW, 52, (gy) null);
        } else {
            if (ir.y == -1) {
                ir.F = var6;
                ir.G = var7;
            }
            GameGraphic.S.a(var1);
            GameGraphic.g();
            b = var1;
            c = var2;
            h = null;
            ir.p = null;
            GameMidlet.i.Q = 0;
            if (GameGraphic.I || var1 != ir.a || var1 == ir.a && ir.y == -1 || ir.y == -1 && (ir.a == 14 || ir.a == 15 || ir.a == 16)) {
                GameMidlet.i.L = false;
                if (var1 != ir.a) {
                    GameMidlet.i.aw = var3;
                    GameMidlet.i.ax = var4;
                }
                ir.l.removeAllElements();
                GameGraphic.x.e(var1 + 1);
            } else {
                l.removeAllElements();
                ir.m.removeAllElements();
                ir.n.removeAllElements();
                GameGraphic.B.removeAllElements();
                ir.b(GameMidlet.i);
            }
            if (var6 != null) {
                ir.d();
            }
            if (ir.B != -1) {
                GameMidlet.i.a(ir.B, ir.C);
                ir.C = -1;
                ir.B = -1;
            }
            if (ir.H != -1) {
                GameMidlet.i.aw = ir.H;
                GameMidlet.i.ax = ir.I;
                ir.I = -1;
                ir.H = -1;
                a(GameMidlet.i.aw, GameMidlet.i.ax, GameMidlet.i.K, 0);
            }
            GameGraphic.INST.b();
            if (GameGraphic.r != this) {
                if (jy.c == 0) {
                    getInstance().a();
                } else {
                    jy.c = 2;
                    jv.b().a();
                }
            }
            for (int var8 = 0; var8 < var5.size(); ++var8) {
                js var9;
                if ((var9 = (js) var5.elementAt(var8)).az == 0) {
                    hn var10;
                    (var10 = (hn) var9).C = var10.aw;
                    var10.D = var10.ax;
                    var10.t = var10.K;
                    var10.h();
                    if (var10.w != GameMidlet.i.w) {
                        e(var10);
                        ir.b(var10);
                    }
                } else if (var9.az == 5) {
                    hm var11 = (hm) var9;
                    var11.b = var11.aw;
                    var11.c = var11.ax;
                    ir.m.addElement(var11);
                }
            }
            if (ca.b) {
                a(ca.a.a, ca.a.b, GameMidlet.i.K, GameMidlet.i.N);
            } else {
                ++GameMidlet.i.ax;
                this.n();
            }
            b((int) GameMidlet.i.S);
            if (GameGraphic.Z == 0 && GameGraphic.D == null) {
                super.ac = this.H;
            }
            h = null;
            if (ir.a != 25) {
                GameGraphic.h();
            }
            GameGraphic.INST.sizeChanged(0, 0);
            if (GameGraphic.I) {
                if (ir.a == 9 && bb.e != 0) {
                    (GameGraphic.D = new bb()).b();
                } else if (!ca.b && ir.a == 23) {
                    (GameGraphic.D = new bb()).d();
                } else if (ir.a == 25 && bb.f > 0) {
                    (GameGraphic.D = new bb()).a((hj) INST);
                }
                super.ac = null;
                super.ad = null;
            }
            GameMidlet.i.M = false;
            GameMidlet.i.N = 0;
            GameMidlet.i.G = 4;
            r = false;
            t = false;
            GameGraphic.A = null;
            if (ir.a == 108) {
                do1.a().d();
                do1.a().b();
            }
            if (GameGraphic.J == 0) {
                GameGraphic.J = 1;
            }
        }
    }

    public static void m() {
        byte var0 = 0;
        switch (i) {
            case 0:
                var0 = 3;
                break;
            case 1:
                var0 = 7;
                break;
            case 2:
                var0 = 21;
                break;
            case 3:
                var0 = 22;
                break;
            case 4:
                var0 = 21;
                break;
            case 5:
                var0 = 22;
        }
        cx.getInstance().b((int) var0);
    }

    // b byte
    public final void doJoinShop(byte var1) {
        if (g == -1) {
            this.n();
            System.out.println("doJoinShop: " + var1);
            GameGraphic.i();
            g = var1;
            cx.getInstance().d((int) 8);
        }
    }

    public static void a(int var0, int var1, int var2, int var3) {
        if ((GameMidlet.e == 9 || GameMidlet.e == 11) && !t) {
            GameMidlet.i.C = var0;
            GameMidlet.i.D = var1;
            bf.a().a(var0, var1, var2, var3);
        }
    }

    public final void n() {
        a(GameMidlet.i.aw, GameMidlet.i.ax, GameMidlet.i.K, GameMidlet.i.N);
    }

    public static void a(int var0, int var1, int var2, int var3, short var4) {
        hn var5 = ir.g(var0);
        if (var0 != GameMidlet.i.w && !t) {
            if (var5 != null) {
                if (var5.L && var5.Q == 0) {
                    var5.L = false;
                    var5.a(var1, var2);
                    var5.N = var4;
                }
                if (var5.H == -3) {
                    var5.H = 0;
                }
                var5.R = -1;
                if (var5.Q == 0) {
                    dr var6;
                    (var6 = new dr(var1, var2, var3)).d = var4;
                    var5.g.addElement(var6);
                }
            }
        }
    }

    public final void a(hn var1) {
        e(var1);
        var1.h();
        var1.L = true;
        hn var2;
        if ((var2 = ir.g(var1.w)) != null) {
            ir.m.removeElement(var2);
        }
        ir.b(var1);
    }

    private static void e(hn var0) {
        fa var1;
        if ((var1 = fxClass.a(var0.e, 50)) != null) {
            var0.d = var1.b;
        }
    }

    public static void c(int var0) {
        hn var1;
        if ((var1 = ir.g(var0)) != null) {
            var1.f();
            var1.p = true;
            db var2;
            if ((var2 = kv.c(var0)) != null) {
                l.removeElement(var2);
            }
        }
    }

    public final void d(int var1) {
        im.d().a(var1, this);
        super.d(var1);
    }

    public final void a(String var1) {
        if (!var1.trim().equals("")) {
            if (var1.indexOf("dmw") != -1) {
                if (h != null) {
                    cx.getInstance().b(h.w, var1);
                }
            } else if (var1.indexOf("ptw") == 0 && h != null && h.O != null && h.O.d != null) {
                String var2 = var1 + " (";
                for (int var3 = 0; var3 < h.O.d.length; ++var3) {
                    var2 = var2 + " " + h.O.d[var3];
                }
                var2 = var2 + ").";
                cx.getInstance().b(h.w, var2);
            } else {
                bf.a().a(var1);
            }
        }
    }

    public static void a(int var0, String var1) {
        if (ir.a != 24 && ir.a != 53) {
            hn var2;
            if ((var2 = ir.g(var0)) != null) {
                var2.O = null;
                var2.a(100, var1, (byte) (var0 >= 2000000000 ? 1 : 0));
                if (var0 < 2000000000) {
                    hc var10000 = hc.b();
                    var1 = var2.x + ": " + var1;
                    var10000.a.a(var1);
                }
            }
        }
    }

    protected static void o() {
        if (h != null && h.Q == 0) {
            bf.a().b(h.w, 101);
        }
    }

    public final void e(int var1) {
        if (h != null) {
            fa var2 = (fa) fxClass.a((short) var1);
            GameGraphic.a(var2.i[0], var2.i[1], new ij(this, var2), new ik(this, var2), (ii) null);
        }
    }

    public static void f(int var0) {
        bf.a().b(h.w, var0);
    }

    public final void a(int var1, int var2, int var3, String var4, int var5) {
        if (var3 == -1) {
            GameGraphic.showAlert(var4);
        } else {
            this.a(1, var1, var2, var3, (int) var5);
        }
    }

    // a int int int String int int int int
    public final void onGiftGiving(int var1, int var2, int var3, String var4, int var5, int var6, int var7, int var8) {
        if (var3 == -1) {
            GameGraphic.showAlert(var4);
        } else {
            if (var1 == GameMidlet.i.w) {
                System.out.println("onGiftGiving: " + var5);
                GameMidlet.i.updateMoney(var6, var7, var8);
            }

            this.a(0, var1, var2, var3, (int) 0);
        }
    }

    private void a(int var1, int var2, int var3, int var4, int var5) {
        hn var6 = ir.g(var2);
        hn var7 = ir.g(var3);
        if (var6 != null && var7 != null) {
            if (var6.Q == 0 && var7.Q == 0) {
                var6.j = var7.w;
                var6.i = var6.w;
                var7.i = var6.w;
                var7.j = var7.w;
                if (var2 == GameMidlet.i.w) {
                    GameMidlet.i.D = var7.ax;
                    if (GameMidlet.i.aw < var7.aw) {
                        var2 = var7.aw - 15;
                    } else {
                        var2 = var7.aw + 15;
                    }

                    GameMidlet.i.C = var2;
                    a(var2, var7.ax, GameMidlet.i.K, GameMidlet.i.N);
                }

                if (var3 == GameMidlet.i.w) {
                    a(GameMidlet.i.aw, GameMidlet.i.ax, var6.K == 0 ? gx.J : 0, GameMidlet.i.N);
                }

                if (var1 == 1) {
                    var7.R = -1;
                    switch (var4) {
                        case 0:
                            var7.Q = var6.Q = -3;
                            this.b(var6.x + " " + StringEntity.ca + var7.x);
                            break;
                        case 100:
                            if (var7.Q == 0) {
                                var6.Q = -2;
                                var7.Q = -2;
                                var6.g.removeAllElements();
                                var7.g.removeAllElements();
                                var6.ao = var7;
                                var6.d(var7.aw, var7.ax + 5);
                            }
                            break;
                        case 101:
                            if (var7.Q == 0) {
                                var6.Q = 11;
                                var7.Q = 11;
                                var6.g.removeAllElements();
                                var7.g.removeAllElements();
                                var6.ao = var7;
                                if (var6.aw < var7.aw) {
                                    var6.d(var7.aw - 20, var7.ax + 2);
                                } else {
                                    var6.d(var7.aw + 20, var7.ax + 2);
                                }
                            }
                            break;
                        case 102:
                        case 103:
                            var7.Q = var6.Q = 12;
                            var7.Y = var6.Y = (short) var5;
                            this.b(var6.x + " " + StringEntity.GIVE_GIFT + " " + var7.x);
                            break;
                        default:
                            this.b(var6.x + " " + "tặng quà" + " " + var7.x);
                    }
                } else {
                    var6.Q = 9;
                    var7.Q = 8;
                    var7.R = -1;
                    var7.k = var4;
                    ld var8 = fxClass.a((short) var4);
                    this.b(var6.x + " " + StringEntity.di + " " + var8.l + " " + StringEntity.dh + " " + var7.x);
                }

                var7.U = var7.S;
                var7.T = 0;
                var6.U = var6.S;
                var6.T = 0;
            }
        }
    }

    public static void b(hn var0) {
        hx var1;
        if ((var1 = fxClass.a(((fa) fxClass.a((short) var0.k)).j, var0.e)) == null) {
            var0.a(new hx((short) var0.k));
            var0.h();
        } else {
            var1.a = (short) var0.k;
        }
    }

    public static void c(hn var0) {
        if (var0 != null) {
            bf.a().a(var0.w);
            GameGraphic.showAlert(StringEntity.PLEASE_WAIT + " " + var0.x + "  " + StringEntity.ACCEPT);
        }
    }

    public final void a(hn var1, String var2) {
        cw var3 = new cw(
                StringEntity.ADD_FRIEND,
                -2,
                new Button(StringEntity.ACCEPT, new in(this, var1)),
                new Button(StringEntity.DENY, new ej(this, var1)),
                false
        );
        var3.a(var2);
        hc var4 = hc.b();
        var3.a = true;
        var4.b(var3);
        if (GameGraphic.r != hc.b()) {
            ++hj.as;
        }
    }

    public static void a(boolean var0, String var1) {
        if (var0) {
            cy.b();
            cy.h();
        }
        GameGraphic.showAlert(var1);
    }

    protected static void p() {
        if (h != null) {
            GameGraphic.d(StringEntity.PLEASE_WAIT);
            bf.a().doRequestYourInfo(h.w);
        }
    }

    public static void b(int var0, int var1) {
        if (var0 != GameMidlet.i.w) {
            hn var2 = ir.g(var0);
            hx var3 = fxClass.b(var2.e, var1);
            if (var2 != null && var3 != null) {
                var2.e.removeElement(var3);
            }
        }
    }

    public final void a(int[] var1) {
        hk.b().a(var1);
        hk.b().a((hj) this);
    }

    public final void a(Vector var1) {
        GameMidlet.k = var1;
        if (cd.b().c) {
            cd.b();
            cd.g();
        } else {
            this.q();
        }
    }

    public static void a(int var0, short var1) {
        hn var2;
        if ((var2 = ir.g(var0)) != null) {
            if (fxClass.a(var1).j == -1) {
                if (var2.V == var1) {
                    gr var3;
                    if ((var3 = ir.h(var2.w)) != null) {
                        ir.m.removeElement(var3);
                        var2.V = -1;
                    }
                } else {
                    var2.a(var1);
                    iy.a().e(var2.w);
                }
            } else {
                hx var4;
                if ((var4 = fxClass.b(var2.e, var1)) != null) {
                    var2.e.removeElement(var4);
                } else {
                    var2.b(new hx(var1));
                    var2.h();
                }
            }
            if (var0 == GameMidlet.i.w) {
                if (GameGraphic.r == dp.b()) {
                    dp.b().d();
                }
                GameMidlet.k = null;
                GameGraphic.h();
            }
            r = false;
        }
    }

    public final Button a(Vector var1, int var2, int var3, boolean var4) {
        Button var5 = new Button(StringEntity.GIVE_UP, new eh(this, var1, var2, var3));
        return var4 ? new Button(StringEntity.MENU, new ee(this, var5)) : var5;
    }

    protected final void q() {
        hn var1 = GameMidlet.i;
        if (GameGraphic.r != cd.a) {
            dp.b().m = true;
            dp.b().a(new String[]{StringEntity.co, StringEntity.l}, new Vector[]{this.a(GameMidlet.k, var1.w, 1), this.a((hn) var1, 0)}, (Vector) null);
            dp.b().a(this.a(var1.e, 0, 0, false), 1);
            dp.b().a(this.a(GameMidlet.k, 1, 0, true), 0);
            if (GameGraphic.r != dp.b()) {
                dp.b().a();
            }
        }
    }

    public final Vector a(hn var1, int var2) {
        hn var6;
        (var6 = new hn()).x = var1.x;
        var6.a(var1.a());
        var6.w = var1.w;
        var6.V = var1.V;
        var6.W = var1.W;
        for (int var3 = 0; var3 < var1.e.size(); ++var3) {
            hx var4;
            ld var5;
            if ((var5 = fxClass.a((var4 = (hx) var1.e.elementAt(var3)).a)) != null && var5.j != 30 && var5.j != 40) {
                var6.a(var4);
            }
        }
        if (var6.V != -1) {
            hx var7;
            (var7 = new hx(var6.V)).b = (byte) (100 - var6.W);
            var6.e.addElement(var7);
        }
        return this.a(var6.e, var6.w, 0);
    }

    public final Vector a(Vector var1, int var2, int var3) {
        Vector var4 = new Vector();
        for (int i = 0; i < var1.size(); ++i) {
            hx var7 = (hx) var1.elementAt(i);
            ld var8 = fxClass.a(var7.a);
            String var9 = null;
            if (var2 == GameMidlet.i.w && (!fxClass.c((int) var8.j) || var3 != 0)) {
                if (var3 == 1) {
                    var9 = StringEntity.cs;
                } else {
                    var9 = StringEntity.cq;
                }
            }
            fz var6 = new fz(this, var9, new gf(this, var7, var2, var3, i), var7, i, var3);
            var4.addElement(var6);
        }
        return var4;
    }

    private Button b(CharacterStatsEntity var1) {
        return new fk(this, (String) null, (ii) null, var1);
    }

    public final void a(CharacterStatsEntity var1) {
        Vector var2 = new Vector();
        var2.addElement(this.b(var1));
        dp.b().m = true;
        dp.b().a(new String[]{StringEntity.by}, new Vector[1], var2);
        if (GameGraphic.r != dp.b()) {
            dp.b().a();
        }
    }

    public static void a(Graphics var0, String var1, int var2, int var3, int var4) {
        var0.drawImage(k, var2, var3 + 2, 17);
        int var5 = k.getWidth() - 4 * gy.Y;
        int var6 = var4 * var5 / 100;
        if (var6 > var5) {
            var6 = var5;
        }
        if (var6 < 0) {
            var6 = 0;
        }
        GameGraphic.N.a(var0, var1, var2 - 32 * gy.Y, var3 + 4 * gy.Y - gy.af / 2, 1);
        je.a(var5 = var2 - 27 * gy.Y, var3 + 4 * gy.Y - 1, var6, 4 * gy.Y, 47084, var0);
        je.a(var5, var3 + 5 * gy.Y - 1, var6, 1 * gy.Y, 8575990, var0);
        je.a(var5 + var6, var3 + 4 * gy.Y - 1, 1, 4 * gy.Y, 13379, var0);
        if (!var1.equals("")) {
            GameGraphic.N.a(var0, String.valueOf(var4), var2 + 29 * gy.Y + GameGraphic.N.a("100"), var3 + 4 * gy.Y - gy.af / 2, 1);
        }
    }

    public static String getMainBalance() {
        return StringEntity.MAIN_BALANCE + ": " + GameGraphic.b(GameMidlet.i.a[0]) + StringEntity.DOLLAR;
    }

    private static void f(int var0, int var1) {
        if (var0 != var1) {
            GameGraphic.a((var1 - var0 > 0 ? "+" : "") + (var1 - var0), GameMidlet.i.aw, GameMidlet.i.ax - 40, -1, 0, -1);
        }
    }

    public final void a(int var1, CharacterStatsEntity var2, hn var3, String var4, short var5, byte var6, byte var7, String var8, short var9, String var10) {
        if (var1 == GameMidlet.i.w) {
            f(GameMidlet.j.g, var2.g);
            f(GameMidlet.j.a, var2.a);
            f(GameMidlet.j.b, var2.b);
            f(GameMidlet.j.e, var2.e);
            f(GameMidlet.j.c, var2.c);
            f(GameMidlet.j.d, var2.d);
            GameMidlet.j = var2;
        }

        GameGraphic.h();
        hn var19;
        if ((var19 = ir.g(var1)) != null && x) {
            x = false;
            String var11 = var10;
            short var27 = var9;
            String var26 = var8;
            byte var25 = var7;
            var7 = var6;
            short var24 = var5;
            String var23 = var4;
            hn var22 = var3;
            CharacterStatsEntity var21 = var2;
            Object var20 = var19;
            Vector var12 = new Vector();
            if (var19.w != GameMidlet.i.w) {
                var12 = this.a((hn) var19, 0);
            }

            Vector var13 = new Vector();
            String var16 = StringEntity.MAIN_BALANCE + ": " + GameGraphic.a(GameMidlet.i.a[0], GameMidlet.i.a[2], GameMidlet.i.b, true);
            bc var17 = new bc(var16, GameGraphic.N.a(var16));
            gr var18 = ir.h(var19.w);
            fj var15 = new fj(null, null, var19, var18, var17);
            var19.K = 0;
            var13.addElement(var15);
            if (var22 != null) {
                var22.aa = var19.aa;
                var20 = new fm(this, "", null, var23, var19, var22, var24, var7, var25, var26);
                var13.addElement(var20);
            }
            if (GameMidlet.i.w != ((gx) var20).w) {
                var13.addElement(this.b(var21));
            }
            if (GameGraphic.r != cd.a) {
                dp.b().m = true;
                if (GameMidlet.i.w == ((gx) var20).w) {
                    if (var22 != null) {
                        dp.b().a(new String[]{StringEntity.by, StringEntity.a}, new Vector[2], var13);
                        if (var27 != -1) {
                            dp.b().a(new Button(var11, new fv(this, var27)), 1);
                        }
                    } else {
                        dp.b().a(new String[]{StringEntity.by}, new Vector[1], var13);
                    }
                } else if (var22 != null) {
                    dp.b().a(new String[]{StringEntity.by, StringEntity.a, StringEntity.cd, StringEntity.by}, new Vector[]{null, null, null, var12}, var13);
                    if (var27 != -1) {
                        dp.b().a(new Button(var11, new fo(this, var27)), 1);
                    }
                } else {
                    dp.b().a(new String[]{StringEntity.by, StringEntity.cd, StringEntity.by}, new Vector[]{null, null, var12}, var13);
                }
                if (GameGraphic.r != dp.b()) {
                    dp.b().a();
                }
            }
        }
    }

    public final void a(String var1, int var2) {
        Vector var3 = new Vector();

        for (int var4 = 0; var4 < fxClass.c.size(); ++var4) {
            dc var5;
            if ((var5 = (dc) fxClass.c.elementAt(var4)).c == var2) {
                var3.addElement(var5);
            }
        }
        Vector var8 = new Vector();
        for (int i = 0; i < var3.size(); ++i) {
            dc var6 = (dc) var3.elementAt(i);
            fe var7 = new fe(this, StringEntity.BUY, new fg(this, var6), var6, i);
            var8.addElement(var7);
        }
        dp.b().a();
        dp.b().a(new String[]{var1}, new Vector[]{var8}, null);
    }

    protected final void a(dc var1) {
        GameGraphic.a(StringEntity.aF, (ii) (new fc(this, var1)));
    }

    public static void a(short var0, int var1) {
        GameGraphic.h();
        dp.n = true;
        dc var2;
        if ((var2 = dc.a(fxClass.c, var0)) != null) {
            if (var2.c == 5) {
                iy.a().e(GameMidlet.i.w);
            }
            GameMidlet.i.a(var1);
        }
    }

    // send gift
    public final void a(byte var1, int var2, String var3, short[] var4, int var5, String[] var6) {
        if (GameGraphic.r != dp.b()) {
            d(GameMidlet.i);
            if (var2 == 26) {
                if (h == null) {
                    return;
                }

                d(h);
            } else {
                d(GameMidlet.i);
            }
            Vector var7 = new Vector();
            if (var1 == 0) {
                int var12;
                if (var4 != null && var4.length != 0) {
                    for (var12 = 0; var12 < var4.length; ++var12) {
                        var7.addElement(fxClass.a(var4[var12]));
                    }
                } else {
                    for (var12 = 0; var12 < fxClass.b.length; ++var12) {
                        ld var8;
                        if ((var8 = fxClass.b[var12]) != null && (var8.i[0] > 0 || var8.i[1] > 0) && var2 == var8.k) {
                            var7.addElement(var8);
                        }
                    }
                }
                String var11;
                int var20;
                if (var2 == 26) {
                    Vector[] var15 = new Vector[6];
                    for (var20 = 0; var20 < 6; ++var20) {
                        var15[var20] = new Vector();
                    }
                    int[] var22 = new int[6];
                    int var21;
                    for (var21 = 0; var21 < var7.size(); ++var21) {
                        ld var24 = (ld) var7.elementAt(var21);
                        var11 = "";
                        if (var6 != null && var6.length > 0) {
                            var11 = var6[var21];
                        }
                        var3 = "Tặng";
                        int var10002;
                        if (var24.j == 20) {
                            var15[0].addElement(new jx(this, var3, new gt(this, var24, var4 != null ? var4[var21] : -1, var2, var11, var5, var22[0]), var24, var4 != null ? var4[var21] : -1, var22[0], var5, var2));
                            var10002 = var22[0]++;
                        } else if (var24.j == 10) {
                            var15[1].addElement(new jx(this, var3, new gt(this, var24, var4 != null ? var4[var21] : -1, var2, var11, var5, var22[1]), var24, var4 != null ? var4[var21] : -1, var22[1], var5, var2));
                            var10002 = var22[1]++;
                        } else if (var24.j != 52 && var24.j != 53 && var24.j != 5) {
                            switch (var24.j) {
                                case 60:
                                    var15[3].addElement(new jx(this, var3, new gt(this, var24, var4 != null ? var4[var21] : -1, var2, var11, var5, var22[3]), var24, var4 != null ? var4[var21] : -1, var22[3], var5, var2));
                                    var10002 = var22[3]++;
                                    break;
                                case 70:
                                    var15[4].addElement(new jx(this, var3, new gt(this, var24, var4 != null ? var4[var21] : -1, var2, var11, var5, var22[4]), var24, var4 != null ? var4[var21] : -1, var22[4], var5, var2));
                                    var10002 = var22[4]++;
                                    break;
                                default:
                                    var15[5].addElement(new jx(this, var3, new gt(this, var24, var4 != null ? var4[var21] : -1, var2, var11, var5, var22[5]), var24, var4 != null ? var4[var21] : -1, var22[5], var5, var2));
                                    var10002 = var22[5]++;
                                    break;
                            }
                        } else {
                            var15[2].addElement(new jx(this, var3, new gt(this, var24, var4 != null ? var4[var21] : -1, var2, var11, var5, var22[2]), var24, var4 != null ? var4[var21] : -1, var22[2], var5, var2));
                            var10002 = var22[2]++;
                        }
                    }
                    var21 = 0;
                    for (int var25 = 0; var25 < var15.length; ++var25) {
                        if (var15[var25].size() > 0) {
                            ++var21;
                        }
                    }
                    String[] giftTypes = new String[]{"Áo", "Quần", "Trang sức", "Nón", "Cầm tay", "Khác"};
                    byte[] var27 = new byte[]{0, 1, 2, 3, 4, 5};
                    Vector[] var16 = new Vector[var21];
                    byte[] var13 = new byte[var21];
                    String[] var17 = new String[var21];
                    var5 = 0;
                    int var18 = 0;

                    while (true) {
                        if (var18 >= var15.length) {
                            dp.b().a();
                            dp.o = true;
                            dp.b().a(var17, var16, (Vector) null);
                            break;
                        }

                        if (var15[var18].size() > 0 || var18 == 5) {
                            if (var18 == 5) {
                                int var19 = var15[5].size();
                                for (var20 = 0; var20 < q.size(); ++var20) {
                                    km var23 = (km) q.elementAt(var20);
                                    var15[5].addElement(new ey(this, StringEntity.GIVE_GIFT, new ku(this, var20, var23.a), var20, var23, var19));
                                }
                            }
                            var16[var5] = var15[var18];
                            var13[var5] = var27[var18];
                            var17[var5] = giftTypes[var18];
                            ++var5;
                        }
                        ++var18;
                    }
                } else {
                    Vector var14 = new Vector();
                    for (var20 = 0; var20 < var7.size(); ++var20) {
                        ld var9 = (ld) var7.elementAt(var20);
                        String var10 = "";
                        if (var6 != null && var6.length > 0) {
                            var10 = var6[var20];
                        }
                        switch (var2) {
                            case 100:
                                var11 = StringEntity.cO;
                                break;
                            case 26:
                                var11 = "Tặng";
                                break;
                            default:
                                var11 = StringEntity.BUY;
                                break;
                        }
                        var14.addElement(new jx(this, var11, new gt(this, var9, var4 != null ? var4[var20] : -1, var2, var10, var5, var20), var9, var4 != null ? var4[var20] : -1, var20, var5, var2));
                    }
                    if (var14.size() > 0) {
                        dp.b().a();
                        dp.o = true;
                        dp.b().a(new String[]{var3}, new Vector[]{var14}, (Vector) null);
                    }
                }
                GameGraphic.h();
            }
        }
    }

    public static void b(int var0, byte var1) {
        if (var0 == GameMidlet.i.w) {
            GameMidlet.i.W = var1;
        } else {
            hn var2;
            if ((var2 = ir.g(var0)) != null) {
                var2.W = var1;
            }
        }
    }

    public final void a(int var1, int var2, String var3, String[] var4) {
        Vector var5 = new Vector();
        for (int i = 0; i < var4.length; ++i) {
            var5.addElement(new Button(var4[i], new ac(this, var1, var2, i)));
        }
        GameGraphic.a(var3, var5);
    }

    public static void b(int var0, short var1) {
        hn var2;
        if ((var2 = ir.g(var0)) != null) {
            var2.X = var1;
        }
    }

    private void b(String var1) {
        this.M.addElement(var1);
        if (this.N == 0) {
            this.N = this.O;
        }
    }

    public final void b(Vector var1) {
        if (var1.size() != 0) {
            Vector var2 = new Vector();
            for (int var3 = 0; var3 < var1.size(); ++var3) {
                bc var4 = (bc) var1.elementAt(var3);
                var2.addElement(new y(this, var4.a, new aa(this, var4), var4));
            }
            cd.b().a(var2);
        }
    }

    public static void a(byte var0, int var1, short var2, int var3, short var4, short var5) {
        hm var6;
        (var6 = new hm(var0, var2, var3)).a(var1, var4, var5);
        ir.m.addElement(var6);
        ir.a(ir.l);
    }

    public static void c(int var0, int var1) {
        int var2 = 0;
        hm var10000;
        while (true) {
            if (var2 >= ir.m.size()) {
                var10000 = null;
                break;
            }
            js var3 = (js) ir.m.elementAt(var2);
            hm var5 = (hm) var3;
            if (var3.az == 5 && var5.d == var0) {
                var10000 = var5;
                break;
            }
            ++var2;
        }
        hm var4 = var10000;
        if (var10000 != null) {
            var4.a(var1);
        }
    }

    public static void a(lc var0) {
        if (ir.x == null) {
            ir.x = new Vector();
        }
        ir.x.addElement(var0);
    }

    public static void a(int var0, Vector var1) {
        hn var2;
        if ((var2 = ir.g(var0)) != null) {
            var2.f = var1;
            var2.as = 0;
        }
    }

    public final void s() {
        if (this.y) {
            this.y = true;
            GameGraphic.i();
            if (ea.b().e == 2) {
                cx.getInstance().c((byte) -1);
            } else {
                byte[] var1 = new byte[]{0, 13, 20, 9, 23, 11, 17};
                bf.a().doJoinPark(var1[ea.b().e], -1);
            }
        }
    }

    public final void t() {
        if (GameMidlet.i.d == 0) {
            if (!jn.a) {
                ic.b().a();
                GameGraphic.h();
            }
        } else {
            if (GameGraphic.r != hc.d && GameGraphic.r != dm.INST) {
                GameGraphic.J = 0;
            }
            if (!this.y) {
                cx.getInstance().d((int) 9);
                cx.getInstance().c((byte) 0);
            } else {
                int var1 = 16 * gy.Y;
                ir.y = -1;
                ImageModel.b(StringEntity.MAIN_AV);
                ht var10 = ht.a("ct", var1, var1);
                ImageModel.cleanUp();
                Vector var2 = new Vector();
                byte[] var3 = new byte[884];
                int var4 = 0;
                InputStream var5 = awClass.c(StringEntity.a() + "/citiMap");
                try {
                    for (int var6 = 0; var6 < 26; ++var6) {
                        for (int var7 = 0; var7 < 34; ++var7) {
                            var3[var6 * 34 + var7] = (byte) var5.read();
                            if (var3[var6 * 34 + var7] == 69) {
                                kb var8;
                                (var8 = new kb()).a = (byte) var7;
                                var8.b = (byte) var6;
                                var8.d = (short) (var4 + 819);
                                var8.c = StringEntity.ez[var4];
                                var2.addElement(var8);
                                ++var4;
                            }
                        }
                    }
                    var5.close();
                } catch (IOException var9) {
                    var9.printStackTrace();
                }
                ir.a = -1;
                ea.j = true;
                ea.b().a(var10, var3, var2, (byte) 34, 16 * gy.Y, new Button(StringEntity.CHOOSE, new p(this)));
                ea.b().h = new o(this);
                ea.b().e = 3;
                ea.b().a();
                GameGraphic.h();
                if (ea.n != null && ea.o == 0 && !GameGraphic.I) {
                    ea.n.a();
                    ea.o = 1;
                }
            }
        }
    }

    protected final void u() {
        KeyboardManager[] var1 = new KeyboardManager[3];
        for (int var2 = 0; var2 < 3; ++var2) {
            var1[var2] = new KeyboardManager();
            var1[var2].d(2);
        }
        var1[0].a(true);
        Button var3 = new Button(StringEntity.DONE, new m(this, var1));
        hi.b().a(var1, StringEntity.CHANGE_PASSWORD, StringEntity.PASSWORD_TEXTS, var3);
        GameGraphic.A = hi.b();
    }

    public static boolean a(KeyboardManager[] var0) {
        int var1 = -1;
        for (int i = 0; i < 3; ++i) {
            if (var0[i].f().equals("")) {
                var1 = i;
            }
        }
        if (!var0[1].f().equals(var0[2].f())) {
            var1 = 3;
        }
        if (var0[0].f().equals(var0[1].f())) {
            var1 = 4;
        }
        if (var1 != -1) {
            GameGraphic.showAlert(StringEntity.PASSWORD_VALIDATE_TEXTS[var1]);
            return false;
        } else {
            return true;
        }
    }

    public static void a(byte[] var0, byte var1, byte var2, byte var3, Image var4, short[] var5, Vector var6, Vector var7) {
        B = var5;
        GameGraphic.J = 0;
        b = var1;
        ir.F = var6;
        ir.G = var7;
        ByteArrayInputStream var11 = new ByteArrayInputStream(var0);
        ir.d = new short[var0.length];
        ir.e = var3;
        ir.f = (short) (var0.length / var3);
        ir.b = var4;
        if (var4 != null) {
            int[] var9 = new int[4];
            var4.getRGB(var9, 0, 2, 0, 0, 2, 2);
            ir.s = var9[0];
        }
        try {
            for (int var10 = 0; var10 < ir.d.length; ++var10) {
                ir.d[var10] = (short) var11.read();
            }
        } catch (Exception var8) {
            var8.printStackTrace();
        }
        if (var2 != ir.y) {
            cx.getInstance().d(var2);
        } else {
            GameGraphic.x.e();
        }
    }

    public final void v() {
        GameGraphic.a(StringEntity.WANT_EXIT, (ii) (new l(this)));
    }

    public static void w() {
        if (GameMidlet.i.e != null) {
            GameMidlet.i.e.removeAllElements();
        }
        ir.t = -1;
        ir.c = null;
        ir.i = 24;
        kt.getInstance().c();
        es.b().a();
        es.b().e();
        jy.b = false;
        jy.c = 0;
        cy.d = null;
        ir.m.removeAllElements();
        GameMidlet.i = new hn();
        GameMidlet.j = new CharacterStatsEntity();
        GameGraphic.C.removeAllElements();
        ce.a().a = null;
    }

    public final void d(int var1, int var2) {
        switch (var1) {
            case 0:
                iy.a().b(GameMidlet.i.w);
                GameGraphic.i();
                return;
            case 1:
                ei.b().e();
                return;
            case 2:
                cx.getInstance().doCommunicate(var2);
                return;
            case 3:
                getInstance().b(GameMidlet.i, 0);
                return;
            case 4:
                getInstance().b(GameMidlet.i, 1);
            default:
        }
    }

    public static void g(int var0) {
        ei.b().c = (byte) var0;
        if (GameMidlet.i.q != var0 && GameMidlet.i.q != -1) {
            ei.b().e();
        } else {
            Vector var1;
            (var1 = new Vector()).addElement(new Button(StringEntity.COME_HOME, 0));
            var1.addElement(new Button(StringEntity.COME_IN_FRIEND_HOME, 1));
            le.getInstance().a(var1, 2);
        }
    }

    public static void d(hn var0) {
        (C = new hn()).e = new Vector();
        C.K = 0;
        C.d = var0.d;
        C.v = var0.v;
        for (int var1 = 0; var1 < var0.e.size(); ++var1) {
            hx var2 = new hx();
            var2.a = ((hx) var0.e.elementAt(var1)).a;
            C.a(var2);
        }
    }

    private void b(hn var1, int var2) {
        d(var1);
        byte[] var3 = null;
        byte[] var5 = new byte[2];
        if (g == 3) {
            var5[0] = 3;
            var5[1] = 8;
        }
        System.out.println("typeJoin: " + g);
        byte[] var4;
        Vector[] var6;
        String[] var7;
        switch (g) {
            case 1:
            case 6:
                var3 = new byte[]{10, 20};
                (var6 = new Vector[2])[0] = new Vector();
                var6[1] = new Vector();
                (var7 = new String[2])[0] = StringEntity.aB;
                var7[1] = StringEntity.aC;
                var5[0] = 1;
                var5[1] = 6;
                var4 = new byte[2];
                break;
            case 2:
            case 7:
                var3 = new byte[]{40, 50};
                (var6 = new Vector[2])[0] = new Vector();
                var6[1] = new Vector();
                (var7 = new String[2])[0] = StringEntity.aE;
                var7[1] = StringEntity.aD;
                var4 = new byte[2];
                var5[0] = 2;
                var5[1] = 7;
                break;
            case 3:
            case 4:
            case 5:
            default:
                (var6 = new Vector[1])[0] = new Vector();
                (var7 = new String[1])[0] = StringEntity.dy;
                var4 = new byte[1];
        }

        for (int var8 = 0; var8 < fxClass.b.length; ++var8) {
            if (fxClass.b[var8].f != -2) {
                ld var9 = fxClass.b[var8];
                byte var10;
                if (var9.f >= 0) {
                    var10 = ((fa)fxClass.b[var9.f]).b;
                } else {
                    var10 = ((fa)var9).b;
                }
                if (var9 != null && (var9.i[0] > 0 || var9.i[1] > 0) && (var1.d == var10 || var10 == 0) && (var5[0] == var9.k || var5[1] == var9.k) && var9.f > -2) {
                    if (var3 == null) {
                        var10 = var4[0];
                        var6[0].addElement(new i(this, StringEntity.CHOOSE, new k(this, var9), var9, var10));
                        ++var4[0];
                    } else {
                        for (int var12 = 0; var12 < var6.length; ++var12) {
                            if (var3[var12] == var9.j) {
                                byte var11 = var4[var12];
                                var6[var12].addElement(new e(this, StringEntity.CHOOSE, new g(this, var9), var9, var11));
                                ++var4[var12];
                            }
                        }
                    }
                }
            }
        }
        dp.b().a();
        dp.o = true;
        dp.b().a(var7, var6, (Vector) null);
        dp.g = var2;
        dp.b().i();
        GameGraphic.h();
        if (ir.a == 57 && GameGraphic.I) {
            (GameGraphic.D = new bb()).b(dp.a);
        }
    }

    public static void a(ld var0) {
        (C = new hn()).K = 0;
        C.e = new Vector();
        boolean var1 = false;

        for (int var2 = 0; var2 < GameMidlet.i.e.size(); ++var2) {
            hx var3;
            (var3 = new hx()).a = ((hx) GameMidlet.i.e.elementAt(var2)).a;
            if (fxClass.a(var3.a).j == var0.j) {
                var3.a = var0.g;
                var1 = true;
            }

            C.a(var3);
        }

        if (!var1) {
            hx var5;
            (var5 = new hx()).a = var0.g;
            C.a(var5);
            C.h();
        }

    }

    public static void h(int var0) {
        b(fxClass.a((short) var0));
    }

    public static void b(ld var0) {
        GameGraphic.a(var0.i[0], var0.i[1], new at(var0), new ar(var0), null);
    }

    public static void a(short var0, String var1, int var2, int var3, int var4) {
        GameGraphic.showAlert(var1);
        GameMidlet.i.a(var2);
        GameMidlet.i.c(var3);
        GameMidlet.i.b = var4;
        ld var5 = fxClass.a(var0);
        if (var5.f != -2) {
            hx var6;
            if ((var6 = fxClass.a(var5.j, GameMidlet.i.e)) != null) {
                var6.a = var0;
            } else if (var5.j == -1 && GameMidlet.i.V != -1) {
                GameMidlet.i.a(var0);
                iy.a().e(GameMidlet.i.w);
            } else {
                GameMidlet.i.a(new hx(var0));
                GameMidlet.i.h();
            }
            GameMidlet.i.e(11);
            if (var5.j == -1 && GameMidlet.i.V == -1) {
                GameMidlet.i.j();
                iy.a().e(GameMidlet.i.w);
            }
        }
        GameMidlet.k = null;
    }

    public static void x() {
        bf.a().doJoinPark(b, -1);
        g = -1;
    }

    public final void y() {
        this.d(3, -1);
    }

    public final void a(byte var1, Vector var2, Vector var3, Vector var4) {
        byte[] var5 = new byte[]{59, 60, 58, 104, 105, 101, 102};
        ir.F = var3;
        ir.G = var4;
        GameGraphic.x.e(var5[var1]);
        if (var3 != null) {
            ir.d();
        }
        for (int var6 = 0; var6 < var2.size(); ++var6) {
            js var7;
            if ((var7 = (js) var2.elementAt(var6)).az == 0) {
                hn var8;
                (var8 = (hn) var7).C = var8.aw;
                var8.D = var8.ax;
                var8.t = var8.K;
                var8.h();
                if (var8.w != GameMidlet.i.w) {
                    e(var8);
                    ir.b(var8);
                }
            } else if (var7.az == 5) {
                hm var9 = (hm)var7;
                var9.b = var9.aw;
                var9.c = var9.ax;
                ir.m.addElement(var9);
            }
        }
        if (ca.b) {
            a(ca.a.a, ca.a.b, GameMidlet.i.K, GameMidlet.i.N);
        } else {
            ++GameMidlet.i.ax;
            this.n();
        }
        b((int) GameMidlet.i.S);
        if (GameGraphic.I && var5[var1] == 101) {
            (GameGraphic.D = new bb()).e();
        }
    }

    public static void i(int var0) {
        D = var0;
        G = ir.a;
        getInstance().n();
        cx.getInstance().d((int) 8);
        GameGraphic.i();
    }

    // e int int
    public final void onWeddingStart(int var1, int var2) {
        if (GameGraphic.r == dp.a) {
            dp.b().d();
        }
        System.out.println("onWeddingStart 1111111111111");
        GameGraphic.J = 1;
        E = var1;
        F = var2;
        t = true;
        this.K = 0;
        int var3;
        int var5;
        for (var3 = 0; var3 < p.size() - 1; ++var3) {
            dr var4 = (dr) p.elementAt(var3);
            for (var5 = var3 + 1; var5 < p.size(); ++var5) {
                dr var6 = (dr) p.elementAt(var5);
                if (var4.e > var6.e) {
                    p.setElementAt(var6, var3);
                    p.setElementAt(var4, var5);
                    var4 = var6;
                }
            }
        }
        js var10;
        for (var3 = 0; var3 < ir.m.size() - 1; ++var3) {
            if ((var10 = (js) ir.m.elementAt(var3)).az == 0) {
                for (var5 = var3 + 1; var5 < ir.m.size(); ++var5) {
                    js var14;
                    if ((var14 = (js) ir.m.elementAt(var5)).az == 0 && ((hn) var10).w > ((hn) var14).w) {
                        ir.m.setElementAt(var14, var3);
                        ir.m.setElementAt(var10, var5);
                        var10 = var14;
                    }
                }
            }
        }
        for (var3 = 0; var3 < ir.m.size(); ++var3) {
            if ((var10 = (js) ir.m.elementAt(var3)).az == 0) {
                hn var13;
                (var13 = (hn) var10).g.removeAllElements();
                if (var13.w == var2) {
                    var13.aw = var13.C = 0;
                    var13.ax = var13.D = 8 * ir.i + ir.i / 2 - ir.i / 2;
                    var13.G = 2;
                    this.K = 1;
                    var13.f(2475, 20);
                    var13.f(2476, 10);
                    var13.f(300, 60);
                    var13.f(302, 70);
                    var13.h();
                } else if (var13.w == var1) {
                    var13.aw = var13.C = 0;
                    var13.ax = var13.D = 8 * ir.i + ir.i / 2 + ir.i / 2;
                    var13.G = 2;
                    this.K = 1;
                    var13.f(2477, 20);
                    var13.f(2478, 10);
                    var13.h();
                }
            }
        }
        hn var11 = ir.g(var1);
        hn var12 = ir.g(var2);
        ir.m.removeElement(var11);
        ir.m.removeElement(var12);
        var5 = 0;
        for (int var15 = 0; var15 < ir.m.size(); ++var15) {
            js var7;
            hn var8;
            if ((var7 = (js) ir.m.elementAt(var15)).az == 0 && (var8 = (hn) var7).w != -100) {
                dr var9;
                GameGraphic.h = GameGraphic.j = (var9 = (dr) p.elementAt(var5 / 2)).a - do1.a().a + ir.i / 2;
                GameGraphic.i = GameGraphic.k = var9.b - do1.a().b + ir.i / 2 + var15 % 2 * (ir.i - 5);
                ++var5;
                var8.a(GameGraphic.h + do1.a().a, GameGraphic.i + do1.a().b);
            }
        }
        ir.m.addElement(var11);
        ir.m.addElement(var12);
        ir.a(ir.m);
        GameGraphic.h();
        System.out.println("onWeddingStart 2222222222222222222: " + t + "     " + this.K);
    }
}
