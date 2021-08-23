package avatar;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Calendar;
import java.util.Vector;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import main.GameMidlet;
import main.GameGraphic;

public final class ir {

    public static int a = -1;
    public static Image b;
    public static ht c;
    public static short[] d;
    public static short e;
    public static short f;
    public static short[] g;
    public static byte[] h = new byte[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 1, 3, 3, 3, 3, 3, 2, -1, -1, -1, 0, 0, 0, 2, 2};
    public static int i = 24;
    public static byte j = 0;
    public static byte k = -1;
    public static Vector l = new Vector();
    public static Vector m = new Vector();
    public static Vector n = new Vector();
    public static Vector o;
    private static int J = 0;
    private dr[] K;
    private static Vector L = new Vector();
    private static int[] M = new int[]{15853390, 15006199, 8183509, 12254198};
    public static js p;
    public static Button q;
    public static Image r;
    private static ht N;
    private static int[] O = new int[]{6143735, 21};
    public static int s;
    public static int t = -1;
    private static int P = -1;
    public static dr u;
    public static Vector v;
    public static Vector w;
    public static Vector x;
    public static int y = -1;
    private static ca Q = new ca();
    private boolean R;
    public static boolean z;
    private static int S;
    private static int T;
    public static int A = -1;
    private static int U = 3;
    public static int B = -1;
    public static int C = -1;
    private js V;
    private js W;
    private js X;
    private int Y;
    private int Z;
    private int aa;
    private static int ab = 0;
    private static byte ac;
    public static int D = 0;
    public static int E = -1;
    public static Vector F;
    public static Vector G;
    public static int H = -1;
    public static int I = -1;

    public ir() {
        q = new Button(StringEntity.NEXT, new hr(this));
        J = awClass.e(3);
        i = 24;
        ImageModel.b(StringEntity.EFFECT_AV);
        ImageModel.getImageFromIndex("den");
        r = ImageModel.getImageFromIndex("s0");
        if (GameGraphic.H) {
            if (GameGraphic.Z == 0) {
                N = new ht(ImageModel.getImageFromIndex("focus"), 21 * gy.Y, 15 * gy.Y);
            } else {
                N = new ht(ImageModel.getImageFromIndex("focus"), 32 * gy.Y, 11 * gy.Y);
            }
            u = new dr();
        }
        ImageModel.cleanUp();
    }

    public final void a() {
        if (dp.b() != GameGraphic.r && GameGraphic.H) {
            if (GameGraphic.v != null || GameGraphic.A != null || GameGraphic.t != null) {
                return;
            }
            if (GameGraphic.b(0, 0, GameGraphic.width, GameGraphic.height)) {
                int var2 = GameGraphic.k();
                int var3 = GameGraphic.l();
                if (GameGraphic.g) {
                    GameGraphic.g = false;
                    S = do1.a().a;
                    T = do1.a().b;
                    this.R = true;
                }

                if (this.R) {
                    if (GameGraphic.e && (awClass.f(var2) > 20 || awClass.f(var3) > 20)) {
                        do1.a().c = S + var2;
                        do1.a().d = T + var3;
                        do1.a().a(do1.a().c + GameGraphic.o, do1.a().d + GameGraphic.p);
                        do1.a().e = System.currentTimeMillis() / 100L;
                    }

                    if (GameGraphic.f) {
                        GameGraphic.f = false;
                        this.R = false;
                        if (awClass.f(var2) < 10 && awClass.f(var3) < 10 && !aeClass.t) {
                            u.a = GameGraphic.h + do1.a().a;
                            u.b = GameGraphic.i + do1.a().b;
                            if (u.b < 0) {
                                u.b = 0;
                            }
                            GameMidlet.i.av = u;
                            GameMidlet.i.l();
                        }
                    }
                }
            }
        }
    }

    public final void b() {
        try {
            do1.a().d();
            int var1;
            if ((GameGraphic.Z == 0 || GameGraphic.r != cd.b()) && m.size() > 0) {
                var1 = 0;

                while (true) {
                    if (var1 >= m.size()) {
                        a(m);
                        break;
                    }
                    ((js) m.elementAt(var1)).b();
                    ++var1;
                }
            }
            if (n.size() > 0) {
                a(n);
                for (var1 = 0; var1 < n.size(); ++var1) {
                    ((js) n.elementAt(var1)).b();
                }
            }
            if (l.size() > 0) {
                for (var1 = 0; var1 < l.size(); ++var1) {
                    ((js) l.elementAt(var1)).b();
                }
            }
            ir var2 = this;
            if (this.K != null) {
                for (int var3 = 0; var3 < var2.K.length; ++var3) {
                    --var2.K[var3].a;
                    if (var2.K[var3].a < do1.a().a - 100) {
                        var2.K[var3].a = do1.a().a + GameGraphic.width + 30 + awClass.e(10) * 50;
                        var2.K[var3].b = -110 - awClass.e(6) * 10;
                    }
                }
            }
            if (GameGraphic.l % 4 == 2 && !go.N && (a != 24 || GameGraphic.Z == 0) && go.E == -1 && !go.y && cz.a != GameGraphic.r && a != -1 && GameGraphic.r != cd.a && GameGraphic.t == null) {
                if (p == null) {
                    for (int var8 = 0; var8 < m.size() && !i(var8); ++var8) {
                    }
                } else if (awClass.f(p.aw - GameMidlet.i.aw) / i >= (p.az == 7 ? U << 1 : U) || awClass.f(p.ax - GameMidlet.i.ax) / i >= (p.az == 7 ? U << 1 : U)) {
                    p = null;
                    aeClass.h = null;
                }
            }
            if (ca.b) {
                Q.a();
            }
            if (x != null) {
                for (var1 = 0; var1 < x.size(); ++var1) {
                    lc var9;
                    if (fxClass.d((var9 = (lc) x.elementAt(var1)).a) != null) {
                        if (var9.k == 0) {
                            hn var10;
                            if ((var10 = g(var9.j)) == null) {
                                x.removeElement(var9);
                                continue;
                            }
                            var9.e = (short) var10.aw;
                            var9.f = (short) var10.ax;
                        }
                        if (var9.g == var9.c) {
                            var9.g = 0;
                            jo var11;
                            (var11 = new jo()).a = var9.a;
                            var11.d = var9.j;
                            var11.e = var9.k;
                            switch (var9.l) {
                                case 0:
                                    var11.aw = var9.e;
                                    var11.ax = var9.f;
                                    break;
                                case 1:
                                    int var4 = awClass.e(var9.d);
                                    int var5 = awClass.e(360);
                                    int var6 = var4 * awClass.b(awClass.c(var5)) >> 10;
                                    var4 = -(var4 * awClass.a(awClass.c(var5))) >> 10;
                                    var11.aw = var9.e;
                                    var11.ax = var9.f;
                                    var11.b = (short) var6;
                                    var11.c = (short) var4;
                                    break;
                                case 2:
                                    var11.aw = var9.e;
                                    var11.ax = var9.f;
                                    if (var9.k == 0) {
                                        var11.b = var9.m[var9.i];
                                        var11.c = var9.n[var9.i];
                                    } else {
                                        var11.aw += var9.m[var9.i];
                                        var11.ax += var9.n[var9.i];
                                    }
                            }
                            ++var9.h;
                            ++var9.i;
                            if (var9.m != null && var9.i >= var9.m.length) {
                                var9.i = 0;
                            }
                            if (var9.b != -1 && var9.h >= var9.b) {
                                x.removeElement(var9);
                            }
                            switch (var9.k) {
                                case 0:
                                    m.addElement(var11);
                                    m = a(m);
                                    break;
                                case 1:
                                    l.addElement(var11);
                                    l = a(l);
                                    break;
                                case 2:
                                    if (v == null) {
                                        v = new Vector();
                                    }
                                    v.addElement(var11);
                                    break;
                                case 3:
                                    if (w == null) {
                                        w = new Vector();
                                    }
                                    w.addElement(var11);
                            }
                        }
                        ++var9.g;
                    }
                }
            }
            if (v != null) {
                for (var1 = 0; var1 < v.size(); ++var1) {
                    ((jo) v.elementAt(var1)).b();
                }
            }
            if (w != null) {
                for (var1 = 0; var1 < w.size(); ++var1) {
                    ((jo) w.elementAt(var1)).b();
                }
            }
            if (N != null && A != -1 && GameMidlet.i.au > 0) {
                ++u.c;
                if (u.c >= 10) {
                    u.c = 0;
                }
            }
            if (++ab >= 6) {
                ab = 0;
            }
        } catch (Exception var7) {
        }
    }

    public static void c() {
        if (p != null) {
            z = false;
            int var0 = 0;
            int var1 = m.size();

            int var2;
            for (var2 = 0; var2 < var1; ++var2) {
                js var3;
                if ((var3 = (js) m.elementAt(var2)).az != 4 && var3 == p) {
                    var0 = var2;
                    break;
                }
            }

            p = null;

            for (var2 = var0 + 1; var2 < var1 && !i(var2); ++var2) {
            }

            if (p == null) {
                for (var2 = 0; var2 <= var0 && !i(var2); ++var2) {
                }
            }

        }
    }

    private static boolean i(int var0) {
        js var1;
        if ((var1 = (js) m.elementAt(var0)).az != 4 && var1 != GameMidlet.i && var1.az != 6 && Math.abs(var1.aw - GameMidlet.i.aw) / i < (var1.az == 7 ? U << 1 : U) && Math.abs(var1.ax - GameMidlet.i.ax) / i < (var1.az == 7 ? U << 1 : U)) {
            if (var1.az != 0 || !((hn) var1).L) {
                p = var1;
            }

            if (var1.az == 0 && !((hn) var1).L) {
                aeClass.h = (hn) m.elementAt(var0);
            }
            return true;
        } else {
            return false;
        }
    }

    public static boolean a(int var0) {
        if (var0 >= -125 && var0 < 0) {
            return true;
        } else {
            return var0 == -1 || var0 == 108 || var0 == 109 || var0 == 57 || var0 == 62 || var0 == 0 || var0 == 1 || var0 == 2 || var0 == 3 || var0 == 4 || var0 == 5 || var0 == 6 || var0 == 7 || var0 == 8 || var0 == 12 || var0 == 11 || var0 == 14 || var0 == 15 || var0 == 16 || var0 == 13 || var0 == 25 || var0 == 24 || var0 == 52 || var0 == 53 || var0 == 9 || var0 == 58 || var0 == 63 || var0 == 59 || var0 == 64 || var0 == 56 || var0 == 21 || var0 == 68 || var0 == 69 || var0 == 70 || var0 == 17 || var0 == 18 || var0 == 51 || var0 == 71 || var0 == 95 || var0 == 96 || var0 == 107 || var0 == 10 || var0 == 19;
        }
    }

    public static boolean b(int var0) {
        if (var0 >= -125 && var0 < 0) {
            return true;
        } else {
            return var0 == 55 || var0 == 93 || var0 == 78 || var0 == 89 || var0 == 27 || var0 == 28 || var0 == 29 || var0 == 84 || var0 == 85 || var0 == 86 || var0 == 83 || var0 == 87 || var0 == 54 || var0 == 67 || var0 == 81 || var0 == 71 || var0 == 79 || var0 == 92 || var0 == 52 || var0 == 94 || var0 == 95 || var0 == 96 || var0 == 97 || var0 == 98 || var0 == 100 || var0 == 103 || var0 == 101 || var0 == 104 || var0 == 23;
        }
    }

    public static boolean c(int var0) {
        if (var0 >= -125 && var0 < 0) {
            return true;
        } else {
            return var0 == 55 || var0 == 93 || var0 == 78 || var0 == 89 || var0 == 27 || var0 == 28 || var0 == 29 || var0 == 84 || var0 == 85 || var0 == 86 || var0 == 83 || var0 == 87 || var0 == 54 || var0 == 71 || var0 == 52 || var0 == 94 || var0 == 95 || var0 == 96 || var0 == 97 || var0 == 98 || var0 == 100 || var0 == 103 || var0 == 101 || var0 == 104 || var0 == 23;
        }
    }

    private void f() {
        GameGraphic.a(StringEntity.WANT_EXIT, (Intent) (new hs(this)));
    }

    public final boolean a(int var1, int var2) {
        z = false;
        int var3 = c(var1, var2);
        if ((GameGraphic.D == null || bb.b(var3)) && var3 != -2) {
            cx var8;
            switch (var3) {
                case -1:
                    aeClass.getInstance().n();
                    if (a == 25) {
                        go.getInstance();
                    }

                    if (b != null) {
                        Q.a((byte) -1);
                    } else {
                        aeClass.getInstance().e();
                    }
                    break;
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 11:
                case 13:
                case 14:
                case 15:
                case 16:
                case 18:
                    aeClass.getInstance().n();
                    bf.a().doJoinPark(var3, -1);
                    break;
                case 9:
                    this.f();
                    break;
                case 10:
                    GameGraphic.i();
                    aeClass.getInstance().n();
                    t = -1;
                    bf.a().doJoinPark(10, -1);
                    break;
                case 12:
                    this.f();
                    break;
                case 17:
                    this.f();
                    break;
                case 19:
                    GameGraphic.i();
                    aeClass.getInstance().n();
                    t = -1;
                    bf.a().doJoinPark(19, -1);
                    break;
                case 20:
                    cx.getInstance().a((short) 0);
                    GameGraphic.i();
                    break;
                case 21:
                    ei.b().f();
                    break;
                case 22:
                case 26:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                case 50:
                case 51:
                case 60:
                case 61:
                case 65:
                case 66:
                case 67:
                case 72:
                case 73:
                case 74:
                case 75:
                case 76:
                case 77:
                case 79:
                case 80:
                case 81:
                case 82:
                case 88:
                case 90:
                case 91:
                case 92:
                case 99:
                case 102:
                case 105:
                case 106:
                default:
                    if (var3 >= -125 && var3 < 0) {
                        GameGraphic.i();
                        E = var3;
                        cx.getInstance().a((short) (var3 - -125));
                        break;
                    }
                    if (!GameMidlet.i.M && var2 / i == 0 && var3 == 88) {
                        if (aeClass.s) {
                            GameMidlet.i.M = true;
                        } else {
                            bf var12 = bf.a();
                            if (!aeClass.r) {
                                aeClass.r = true;
                                var12.e((byte) 92);
                                var12.k();
                            }
                        }
                    }
                    return false;
                case 23:
                    cx.getInstance().d((int) 9);
                    GameGraphic.i();
                    break;
                case 24:
                    if (go.c != null && go.b == GameMidlet.i.w) {
                        go.getInstance().a(go.b, go.c, go.i, go.P, go.Q, go.V, go.U);
                    } else {
                        GameGraphic.i();
                        go.getInstance().b(GameMidlet.i.w, true);
                    }
                    break;
                case 25:
                    go.getInstance().j();
                    break;
                case 27:
                case 56:
                    if (a != 18 && a != 109 && a != 108) {
                        aeClass.getInstance().y();
                    }
                    break;
                case 28:
                    go.getInstance().h();
                    break;
                case 29:
                    GameGraphic.i();
                    bf.a().a(aeClass.b);
                    break;
                case 52:
                    go.getInstance().g();
                    break;
                case 53:
                    go.getInstance();
                    go.o();
                    break;
                case 54:
                    return kv.b().b(var1, var2);
                case 55:
                    GameGraphic.i();
                    var8 = cx.getInstance();
                    var8.e((byte) -23);
                    var8.k();
                    break;
                case 57:
                    aeClass.getInstance().n();
                    aeClass.getInstance().doJoinShop((byte) 1);
                    break;
                case 58:
                    aeClass.getInstance().doJoinShop((byte) 2);
                    break;
                case 59:
                    aeClass.getInstance().doJoinShop((byte) 3);
                    break;
                case 62:
                    aeClass.getInstance().n();
                    aeClass.getInstance().doJoinShop((byte) 6);
                    break;
                case 63:
                    aeClass.getInstance().doJoinShop((byte) 7);
                    break;
                case 64:
                    aeClass.getInstance().doJoinShop((byte) 8);
                    break;
                case 68:
                case 69:
                case 70:
                    aeClass.getInstance();
                    aeClass.g(var3 - 67);
                    break;
                case 71:
                    GameGraphic.i();
                    cx.getInstance().c((byte) -1);
                    break;
                case 78:
                    aeClass.getInstance().a((String) StringEntity.cN, 5);
                    break;
                case 83:
                    int var10001 = var1 / i;
                    var3 = var2 / i;
                    var2 = var10001;
                    ir var11 = GameGraphic.x;
                    if (fxClass.g != null) {
                        for (int var4 = 0; var4 < fxClass.g.size(); ++var4) {
                            hd var5 = (hd) fxClass.g.elementAt(var4);
                            for (int var6 = 0; var6 < var5.g.size(); ++var6) {
                                dr var7 = (dr) var5.g.elementAt(var6);
                                if (var7.a == var2 && var7.b == var3 && a + 1 == var7.c) {
                                    Vector var10 = new Vector();
                                    var10.addElement(new Button(StringEntity.OK, new hu(var11, var5)));
                                    var10.addElement(new Button(StringEntity.CLOSE, new hv(var11)));
                                    GameGraphic.a(var5.c, var10);
                                    return true;
                                }
                            }
                        }
                    }
                    break;
                case 84:
                    go.getInstance().a((byte) 2, (byte) 5);
                    break;
                case 85:
                    go.getInstance().a((byte) 3, (byte) 5);
                    break;
                case 86:
                    var1 = d(var1, var2);
                    var2 = d(dt.s.a, dt.s.b);
                    go.getInstance().a(2, var1 - var2, go.h);
                    break;
                case 87:
                    var1 = d(var1, var2);
                    var2 = d(ex.s.a, ex.s.b);
                    go.getInstance().a(1, var1 - var2, go.g);
                    break;
                case 89:
                    byte var9;
                    if (a != 108 && a != 109) {
                        if (a == 13) {
                            var9 = 2;
                        } else {
                            var9 = 3;
                        }
                    } else {
                        var9 = 1;
                    }
                    cx.getInstance().doCommunicate(var9);
                    GameGraphic.i();
                    break;
                case 93:
                    aeClass.getInstance().a((String) StringEntity.cN, 4);
                    break;
                case 94:
                    cx.getInstance().doCommunicate(4);
                    GameGraphic.i();
                    break;
                case 95:
                    GameGraphic.i();
                    go.S = GameMidlet.i.aw;
                    go.T = GameMidlet.i.ax;
                    Farm.getInstance().f(0, 0);
                    break;
                case 96:
                    GameGraphic.i();
                    go.S = GameMidlet.i.aw;
                    go.T = GameMidlet.i.ax;
                    Farm.getInstance().g(0, 0);
                    break;
                case 97:
                    go.getInstance().m();
                    break;
                case 98:
                    go.getInstance().n();
                    break;
                case 100:
                    aeClass.getInstance();
                    aeClass.i(5);
                    break;
                case 101:
                    aeClass.getInstance();
                    aeClass.i(6);
                    break;
                case 103:
                    aeClass.getInstance();
                    aeClass.i(3);
                    break;
                case 104:
                    aeClass.getInstance();
                    aeClass.i(4);
                    break;
                case 107:
                    GameGraphic.i();
                    aeClass.m = a;
                    cx.getInstance().d((int) 12);
                    break;
                case 108:
                case 109:
                    B = GameMidlet.i.aw;
                    C = GameMidlet.i.ax;
                    GameGraphic.i();
                    aeClass.A = 1;
                    aeClass.z = 0;
                    cx.getInstance().a((short) 4);
                    break;
                case 110:
                    GameGraphic.i();
                    iy.a().f(GameMidlet.i.w);
                    break;
                case 111:
                    GameGraphic.i();
                    (var8 = cx.getInstance()).e((byte) -105);
                    var8.k();
                    break;
                case 112:
                    if (GameMidlet.i.H != 14) {
                        ei.b().g = GameMidlet.i.ax;
                        if ((var1 = var1 / i * i + i / 2 + 1) < GameMidlet.i.aw) {
                            ei.b().f = var1 + i;
                        } else {
                            ei.b().f = var1 - i;
                        }

                        GameMidlet.i.a(var1, var2 / i * i + 5);
                        aeClass.getInstance();
                        aeClass.a(GameMidlet.i.aw, GameMidlet.i.ax, GameMidlet.i.K, GameMidlet.i.Z);
                        GameMidlet.i.a((byte) 14);
                        iy.a().a((int) 14);
                    }
            }
            return true;
        } else {
            return false;
        }
    }

    public static void a(Graphics var0) {
        if (w != null) {
            for (int var1 = 0; var1 < w.size(); ++var1) {
                ((jo) w.elementAt(var1)).a(var0);
            }
        }

    }

    public final void b(Graphics var1) {
        GameGraphic.c(var1);
        GameGraphic.c(var1);
        var1.translate(-do1.a().a, -do1.a().b);
        this.c(var1);
    }

    public final void c(Graphics var1) {
        Graphics var3 = var1;
        ir var2 = this;
        int var4;
        int var5;
        int var6;
        int var8;
        if (b == null) {
            var1.setColor(1);
            var1.fillRect(do1.a().a, do1.a().b, GameGraphic.width, GameGraphic.height);
        } else {
            var1.setColor(s);
            var1.fillRect(do1.a().a, do1.a().b, GameGraphic.width, GameGraphic.height);
            var4 = do1.a().a * 30 / 210;
            var5 = (do1.a().a - var4) / (96 * gy.Y);
            var6 = -(94 - i + i / 2) * gy.Y;
            if (a == 107) {
                var6 += 41 * gy.Y;
            }
            int var7;
            for (var7 = var5; var7 <= var5 + GameGraphic.width / (96 * gy.Y) + 1; ++var7) {
                var3.drawImage(b, var4 + var7 * 96 * gy.Y, var6, 0);
            }
            dr var9;
            if (o != null) {
                for (var8 = 0; var8 < o.size(); ++var8) {
                    var9 = (dr) o.elementAt(var8);
                    var7 = do1.a().a * (30 + var9.d * 3) / 210;
                    fxClass.a(var3, var9.c, var9.a + var7, var9.b, 33);
                }
            }
            if ((var7 = L.size()) > 0) {
                for (var8 = 0; var8 < var7; ++var8) {
                    var9 = (dr) L.elementAt(var8);
                    var3.setColor(M[var9.c]);
                    var3.fillRect(var9.a + var4, var9.b, 1, 1);
                }
            }
            if (this.K != null) {
                for (var8 = 0; var8 < var2.K.length; ++var8) {
                    var3.drawImage(ea.k[0], var2.K[var8].a, var2.K[var8].b, 0);
                }
            }
            if (GameGraphic.B.size() > 0) {
                for (var8 = 0; var8 < GameGraphic.B.size(); ++var8) {
                    GameGraphic.B.elementAt(var8);
                }
            }
            if (v != null) {
                for (var8 = 0; var8 < v.size(); ++var8) {
                    ((jo) v.elementAt(var8)).a(var3);
                }
            }
            if (GameGraphic.width > e * i) {
                var3.setColor(0);
                var3.fillRect(do1.a().a, do1.a().b, -do1.a().a, GameGraphic.height);
                var3.fillRect(e * i * gy.Y, do1.a().b, -do1.a().a, GameGraphic.height);
            }
        }
        Graphics var10 = var1;
        if ((var4 = (do1.a().a + GameGraphic.width) / i + 1) > e) {
            var4 = e;
        }
        if ((var5 = (do1.a().b + GameGraphic.height) / i + 1) > f) {
            var5 = f;
        }
        if ((var6 = do1.a().a / (i * gy.Y)) < 0) {
            var6 = 0;
        }
        for (int var13 = 0; var13 < var5; ++var13) {
            for (int var11 = var6; var11 < var4; ++var11) {
                short var12;
                if ((var12 = d[var13 * e + var11]) != -1) {
                    var8 = var12 / c.c;
                    c.b(var8, var12 % c.c, var11 * i * gy.Y, var13 * i * gy.Y, var10);
                }
            }
        }
        if (N != null && A != -1 && GameMidlet.i.au > 0) {
            N.a(u.c / 2, u.a, u.b, A, 3, var1);
        }
    }

    public final void d(Graphics var1) {
        Graphics var3 = var1;
        ir var2 = this;
        this.Y = 0;
        this.Z = 0;
        this.aa = 0;
        while (true) {
            while (var2.Y < m.size() || var2.Z < l.size() || var2.aa < n.size()) {
                var2.V = var2.W = var2.X = null;
                if (var2.Y < m.size()) {
                    var2.V = (js) m.elementAt(var2.Y);
                }
                if (var2.Z < l.size()) {
                    var2.W = (js) l.elementAt(var2.Z);
                }
                if (var2.aa < n.size()) {
                    var2.X = (dn) n.elementAt(var2.aa);
                }
                if (var2.V != null && (var2.W == null || var2.V.ax < var2.W.ax) && (var2.X == null || var2.V.ax < var2.X.ax)) {
                    var2.V.a(var3);
                    ++var2.Y;
                } else if (var2.W != null && (var2.X == null || var2.W.ax < var2.X.ax)) {
                    var2.W.a(var3);
                    ++var2.Z;
                } else if (var2.X != null) {
                    var2.X.a(var3);
                    ++var2.aa;
                }
            }
            if (GameGraphic.Z == 0 && p != null) {
                var1.drawImage(aeClass.d, p.aw * gy.Y, (p.ax - (p.az == 7 ? 10 : p.aA)) * gy.Y - ab / 2, 3);
            }
            if (ca.b) {
                Q.a(var1);
            }
            return;
        }
    }

    private static void g() {
        L.removeAllElements();
        if (j != 0 && J != 0 && k == -1) {
            int var0;
            int var1;
            if (a != 9 && a != 12) {
                var0 = awClass.e(GameGraphic.width / 10);
                for (var1 = 0; var1 < var0; ++var1) {
                    L.addElement(new dr(awClass.e(e * i), -(38 + awClass.e(GameGraphic.p)), awClass.e(4)));
                }
            } else {
                var0 = awClass.e(GameGraphic.width / 10);
                for (var1 = 0; var1 < var0; ++var1) {
                    L.addElement(new dr(awClass.e(e * i), -(98 + awClass.e(GameGraphic.p)), awClass.e(4)));
                }
            }
        }
    }

    public static InputStream d(int var0) {
        ImageModel.INST = new ImageModel("/a.clazz");
        String var3 = "" + var0;
        byte[] var4 = ImageModel.INST.getImageBytes(var3);
        ByteArrayInputStream var1 = null;
        if (var4 != null) {
            try {
                var1 = new ByteArrayInputStream(var4);
            } catch (Exception var2) {
                var2.printStackTrace();
            }
        }
        return var1;
    }

    public final void e(int var1) {
        if (kt.getInstance().b()) {
            GameGraphic.J = 0;
            GameGraphic.h();
        }
        if (GameGraphic.D != null) {
            GameGraphic.D = null;
        }
        GameGraphic.INST.b();
        GameMidlet.i.au = 0;
        y = -1;
        q.text = StringEntity.NEXT;
        GameGraphic.B.removeAllElements();
        GameMidlet.i.L = false;
        ca.b = false;
        do1.f = false;
        GameMidlet.i.b((byte) 0);
        i();
        aeClass.l.removeAllElements();
        p = null;
        aeClass.h = null;
        int var2;
        if ((var2 = Calendar.getInstance().get(11)) < 18 && var2 >= 6) {
            j = 0;
        } else {
            j = 1;
        }
        s = O[j];
        if ((var2 = var1 - 1) != 107 && (var2 < 0 || var2 >= h.length || h[var2] == -1)) {
            P = -1;
            b = null;
        } else if (var2 == 107 || P != h[var2] || t != j) {
            byte var3;
            if (var2 == 107) {
                var3 = 0;
            } else {
                var3 = h[var2];
            }
            P = var3;
            ImageModel.b(StringEntity.BACKGROUND_AV);
            Image var4 = ImageModel.getImageFromIndex(String.valueOf(var3) + j);
            Image var9 = ImageModel.getImageFromIndex(String.valueOf(j));
            Graphics var12 = (b = Image.createImage(96 * gy.Y, 96 * gy.Y)).getGraphics();
            je.a(0, 0, 96 * gy.Y, 10 * gy.Y, O[j], var12);
            var12.drawImage(var9, 0, 69 * gy.Y, 36);
            var12.drawImage(var4, 0, 96 * gy.Y, 36);
            ImageModel.cleanUp();
        }
        InputStream var10;
        if (t != j || c == null) {
            if (var1 - 1 == 19) {
                try {
                    t = -1;
                    c = new ht(Image.createImage(StringEntity.a() + "/wedding.png"), i * gy.Y, i * gy.Y);
                } catch (IOException var7) {
                    var7.printStackTrace();
                }
            } else if (var1 - 1 != 107) {
                i = 24;
                t = j;
                var10 = awClass.c(StringEntity.a() + "/data/h" + j);
                InputStream var13 = awClass.c(StringEntity.a() + "/data/data");

                try {
                    byte[] var14 = new byte[var10.available()];
                    var10.read(var14);
                    byte[] var11 = new byte[var13.available()];
                    var13.read(var11);
                    c = new ht(awClass.a(var14, var11), i * gy.Y, i * gy.Y);
                } catch (IOException var6) {
                    var6.printStackTrace();
                }
            } else {
                try {
                    i = 12;
                    t = -1;
                    c = new ht(Image.createImage(StringEntity.a() + "/tileDuaXe.png"), i * gy.Y, i * gy.Y);
                } catch (IOException var5) {
                    var5.printStackTrace();
                }
            }
        }

        if ((var10 = d(var1)) != null) {
            f = 8;
            switch (var1 - 1) {
                case 9:
                    f = 8;
                    break;
                case 10:
                    f = 9;
                case 11:
                case 13:
                case 24:
                default:
                    break;
                case 17:
                    f = 6;
                    break;
                case 18:
                    f = 10;
                    break;
                case 19:
                    f = 13;
                    break;
                case 20:
                case 57:
                case 58:
                case 59:
                case 62:
                case 63:
                case 64:
                case 100:
                case 101:
                case 103:
                case 104:
                case 109:
                    f = 11;
                    break;
                case 21:
                    f = 7;
                    break;
                case 25:
                    f = 7;
                    break;
                case 60:
                case 61:
                case 65:
                    f = 5;
                    break;
                case 107:
                    f = 16;
                    break;
                case 108:
                    f = 8;
            }
        }

        this.a(var10, var1, true);
        a = var1 - 1;
        System.out.println("index: " + a);
        if (k != -1 && a < h.length && h[a] != -1) {
            ba var8 = new ba(k, 0);
            GameGraphic.B.addElement(var8);
        }

        this.h();
        g();
        if (kt.getInstance().b() && GameMidlet.i.e != null) {
            b(GameMidlet.i);
        }

        if (GameGraphic.J == 0) {
            GameGraphic.J = 1;
        }
        System.gc();
    }

    public final void a(InputStream var1, int var2, boolean var3) {
        byte var4 = 0;
        byte var5 = 0;
        byte var6 = 0;
        byte var7 = 0;
        byte var8 = 0;
        byte var9 = 0;
        byte var10 = 0;
        byte var11 = 0;
        byte var12 = 0;
        byte var13 = 0;
        byte var14 = 0;
        byte var15 = 0;
        byte var16 = 0;
        byte var17 = 0;
        byte var18 = 0;
        byte var19 = 0;
        byte var20 = 0;
        byte var21 = 0;
        byte var22 = 0;
        byte var23 = 0;
        byte var24 = 0;
        byte var25 = 0;
        byte var26 = 0;
        byte var27 = 0;
        byte var28 = 0;
        byte var29 = 0;
        byte var30 = 0;
        byte var31 = 0;
        byte var32 = 0;
        byte var33 = 0;
        byte var34 = 0;
        byte var35 = 0;
        byte var36 = 0;
        byte var37 = 0;
        byte var38 = 0;
        byte var39 = 0;
        byte var40 = 0;
        byte var41 = 0;
        byte var42 = 0;
        byte var43 = 0;
        byte var44 = 0;
        ac = 0;
        byte[] var45 = new byte[13];
        int var46;
        dr var54;
        int var58;
        try {
            if (var1 != null) {
                e = (short) (var1.available() / f);
                d = new short[f * e];
            }
            if (var3) {
                g = new short[f * e];
            }
            for (var46 = 0; var46 < f * e; ++var46) {
                if (var1 != null) {
                    d[var46] = (short) var1.read();
                    if (d[var46] == 255) {
                        d[var46] = -1;
                    }
                }
            }
            if (var2 - 1 == 19) {
                aeClass.p = new Vector();
                for (var46 = 0; var46 < d.length; ++var46) {
                    if (d[var46] < 32) {
                        g[var46] = 80;
                    } else {
                        g[var46] = 88;
                    }
                    if (d[var46] == 65) {
                        g[var46] = 10;
                        d[var46] = 1;
                        if (var43 == 1) {
                            d[var46] = 16;
                            GameMidlet.i.aw = GameMidlet.i.C = k(var46) + i;
                            GameMidlet.i.ax = GameMidlet.i.D = l(var46) + 12;
                            a(StringEntity.aq, k(var46) + i / 2, l(var46) + 12);
                        }
                        ++var43;
                    } else if (d[var46] == 27) {
                        dr var47;
                        (var47 = new dr()).a = k(var46);
                        var47.b = l(var46);
                        var47.e = (short) ((5 - aeClass.p.size() % 6 << 1) + aeClass.p.size() / 6);
                        aeClass.p.addElement(var47);
                    }
                }
                hn var55;
                (var55 = new hn()).aw = var55.C = 26 * i;
                var55.ax = var55.D = 8 * i + i / 2;
                var55.x = "chu hon";
                var55.w = -100;
                var55.a(new hx((short) 2480));
                var55.K = var55.t = gx.J;
                m.addElement(var55);
            } else if (var2 - 1 == 107) {
                for (var46 = 0; var46 < f * e; ++var46) {
                    if (d[var46] == 61 && awClass.e(2) == 1) {
                        hn var56 = new hn();
                        hn var52 = (hn) cz.b().p.elementAt(awClass.e(cz.b().p.size()));
                        var56.e = var52.e;
                        var56.aw = var56.C = k(var46) + 12;
                        var56.ax = var56.D = l(var46) + 12;
                        var56.H = 2;
                        var56.az = 9;
                        m.addElement(var56);
                    }
                    ks var57;
                    if (d[var46] == 59) {
                        var57 = new ks(1084, k(var46) + i, l(var46), 0);
                        l.addElement(var57);
                    } else if (d[var46] == 60) {
                        var57 = new ks(1085, k(var46) + i, l(var46), 0);
                        l.addElement(var57);
                    }
                }
            } else {
                for (var46 = 0; var46 < f * e; ++var46) {
                    label558:
                    {
                        if (d[var46] != -4) {
                            if (d[var46] == -5) {
                                g[var46] = 88;
                                break label558;
                            }
                            if (d[var46] == -3 || d[var46] == -6) {
                                break label558;
                            }
                            if (d[var46] >= 120 && d[var46] <= 123) {
                                g[var46] = 80;
                            } else if (d[var46] >= 114 && d[var46] <= 119) {
                                g[var46] = 80;
                            } else if (d[var46] != 67 && d[var46] != 85) {
                                if (d[var46] >= 20 && d[var46] <= 23) {
                                    g[var46] = 79;
                                } else if (d[var46] < 7) {
                                    g[var46] = 80;
                                } else {
                                    g[var46] = 88;
                                }
                            } else {
                                g[var46] = 92;
                            }
                            if (d[var46] >= 44 && d[var46] <= 55) {
                                g[var46] = 80;
                            }
                            if (d[var46] == 62 && var2 - 1 != 62 && var2 - 1 != 101 && var2 - 1 != 104 && var2 - 1 != 103 && var2 - 1 != 100 && var2 - 1 != 101) {
                                g[var46] = 56;
                            }
                            if (d[var46] != 111 && d[var46] != 112) {
                                break label558;
                            }
                        }
                        g[var46] = 80;
                    }
                    if (var1 != null || GameMidlet.e != 11) {
                        byte var10001;
                        switch (d[var46]) {
                            case -1:
                                g[var46] = 88;
                                break;
                            case 0:
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                            case 9:
                            case 10:
                            case 11:
                            case 12:
                            case 13:
                            case 14:
                            case 15:
                            case 16:
                            case 17:
                            case 18:
                            case 19:
                            case 20:
                            case 21:
                            case 22:
                            case 23:
                            case 29:
                            case 30:
                            case 31:
                            case 32:
                            case 33:
                            case 34:
                            case 35:
                            case 36:
                            case 37:
                            case 38:
                            case 39:
                            case 40:
                            case 41:
                            case 42:
                            case 43:
                            case 44:
                            case 45:
                            case 46:
                            case 47:
                            case 48:
                            case 49:
                            case 50:
                            case 51:
                            case 52:
                            case 53:
                            case 54:
                            case 55:
                            case 56:
                            case 57:
                            case 58:
                            case 59:
                            case 60:
                            case 61:
                            case 62:
                            case 64:
                            case 66:
                            case 67:
                            case 68:
                            case 69:
                            case 70:
                            case 71:
                            case 72:
                            case 73:
                            case 74:
                            case 75:
                            case 76:
                            case 77:
                            case 78:
                            case 79:
                            case 80:
                            case 81:
                            case 82:
                            case 83:
                            case 84:
                            case 85:
                            case 86:
                            case 87:
                            case 88:
                            case 89:
                            case 90:
                            case 91:
                            case 92:
                            case 93:
                            case 94:
                            case 95:
                            case 96:
                            case 99:
                            case 100:
                            case 101:
                            case 103:
                            case 104:
                            case 105:
                            case 106:
                            case 107:
                            case 108:
                            case 109:
                            case 111:
                            case 112:
                            case 113:
                            case 114:
                            case 115:
                            case 116:
                            case 117:
                            case 118:
                            case 119:
                            case 120:
                            case 121:
                            case 122:
                            case 123:
                            case 124:
                            case 125:
                            case 126:
                            case 146:
                            case 154:
                            case 168:
                            case 169:
                            case 170:
                            case 171:
                            default:
                                var37 = 0;
                                var27 = 0;
                                break;
                            case 24:
                            case 25:
                            case 26:
                                if (var3) {
                                    a(845, (int) (k(var46) + 11), (int) l(var46));
                                }
                                break;
                            case 27:
                                if (var3) {
                                    a(844, (int) (k(var46) + 11), (int) (l(var46) + 1));
                                }
                                break;
                            case 28:
                                if (var3) {
                                    if (!kt.getInstance().b()) {
                                        d[var46] = 4;
                                    } else {
                                        a(0, (int) (k(var46) + i / 2), (int) (l(var46) + i - 2));
                                    }
                                }
                                break;
                            case 63:
                            case 65:
                                if (var2 - 1 == 101 || var2 - 1 == 104 || var2 - 1 == 103 || var2 - 1 == 100 || var2 - 1 == 101) {
                                    break;
                                }
                                g[var46] = 56;
                                b(var46, var25++, 0);
                                if (var2 - 1 != 57 && var2 - 1 != 62) {
                                    if (var2 - 1 != 58 && var2 - 1 != 63) {
                                        a(StringEntity.aq, k(var46) - 12, l(var46) + 12);
                                        break;
                                    }
                                    a(StringEntity.aq, k(var46) + 12, l(var46) + 36);
                                    break;
                                }
                                a(StringEntity.aq, k(var46) - 12, l(var46) + 12);
                                break;
                            case 97:
                                g[var46] = 54;
                                break;
                            case 98:
                                g[var46] = 29;
                                e(846, var46);
                                if (var2 - 1 == 108 || var2 - 1 == 109) {
                                    d[var46] = 56;
                                }
                                break;
                            case 102:
                                g[var46] = 92;
                                kx.I.addElement(new dr(k(var46) + i / 2, l(var46) + i));
                                var54 = new dr(-20, l(var46) + i);
                                if (var28 % 2 == (var2 == 66 ? 0 : 1)) {
                                    var54.a = (GameGraphic.width + 20) / gy.Y;
                                }
                                kx.J.addElement(var54);
                                ++var28;
                                break;
                            case 110:
                                go.B = new dr(k(var46) - i + 8, l(var46) - 2);
                                a(847, (int) (k(var46) + 11), (int) l(var46));
                                break;
                            case 127:
                                if (var34 == 0) {
                                    a(830, (int) (k(var46) + 36), (int) (l(var46) + i - 2));
                                    b(var46, var34++, 2);
                                }
                                a(var46, (byte) 108, (int) 96);
                                break;
                            case 128:
                                if (var4 == 0) {
                                    e(828, var46);
                                    b(var46, var4++, 2);
                                }
                                a(var46, (byte) 55, (int) 5);
                                d[var46] = d[var46 + e];
                                break;
                            case 129:
                            case 160:
                                if (var5 == 0) {
                                    if (var2 - 1 == 17) {
                                        e(836, var46);
                                    } else {
                                        e(829, var46);
                                    }
                                    b(var46, var5++, 2);
                                }
                                a(var46, (byte) (d[var46] == 129 ? 57 : 62), (int) 96);
                                break;
                            case 130:
                            case 131:
                            case 132:
                            case 133:
                            case 134:
                            case 135:
                            case 136:
                            case 137:
                            case 138:
                                var58 = d[var46] - 130;
                                b(var46, var45[var58]++, 0);
                                a(var46, (byte) var58);
                                break;
                            case 139:
                                g[var46] = -1;
                                b(var46, var27++, 0);
                                if (a == -1 && var2 != 21 && b != null) {
                                    ca.a = new dr(k(var46) + i / 2, l(var46) - i / 2);
                                    Q.a((byte) 1);
                                }
                                a(var46, d);
                                break;
                            case 140:
                                b(var46, var26++, 0);
                                a(var46, (byte) 25, (int) 55);
                                ++var26;
                                break;
                            case 141:
                                if (var7 == 0) {
                                    e(840, var46);
                                    b(var46, var7++, 0);
                                }
                                a(var46, (byte) 24, (int) 5);
                                d[var46] = d[var46 + e];
                                break;
                            case 142:
                                a(var46, (byte) 80, (int) 7);
                                int var10004 = var46 % e;
                                go.getInstance().v[var14] = new dr(var10004, var46 / e, 0);
                                ++var14;
                                break;
                            case 143:
                                if (var6 == 0) {
                                    e(831, var46);
                                    b(var46, var6++, 2);
                                }
                                a(var46, (byte) 52, (int) 51);
                                d[var46] = d[var46 + e];
                                break;
                            case 144:
                                if (var8 == 0) {
                                    e(841, var46);
                                    b(var46, var8++, 2);
                                }
                                a(var46, (byte) 53, (int) 5);
                                break;
                            case 145:
                                var10001 = ac;
                                ac = (byte) (var10001 + 1);
                                b(var46, var10001, 0);
                                if (var2 - 1 != 109 && (var2 - 1 != 57 || a != 17)) {
                                    if (a == 23) {
                                        a(var46, (byte) 23, (int) -1);
                                    } else {
                                        a(var46, (byte) 9, (int) -1);
                                        if (var2 - 1 == 100) {
                                            d[var46] = 47;
                                        }
                                    }
                                } else {
                                    a(var46, (byte) 17, (int) -1);
                                }
                                break;
                            case 147:
                            case 161:
                                if (var9 == 0) {
                                    e(832, var46);
                                    b(var46, var9++, 2);
                                }
                                a(var46, (byte) (d[var46] == 147 ? 58 : 63), (int) 96);
                                break;
                            case 148:
                            case 162:
                                if (var10 == 0) {
                                    if (var2 == 18) {
                                        a(836, (int) (k(var46) + 24), (int) (l(var46) + i - 2));
                                    } else {
                                        a(833, (int) (k(var46) + 48), (int) (l(var46) + i - 2));
                                    }
                                    b(var46, var10++, 2);
                                }
                                a(var46, (byte) (d[var46] == 148 ? 59 : 64), (int) 96);
                                break;
                            case 149:
                                if (var11 == 0) {
                                    e(834, var46);
                                    if (GameMidlet.i.w == go.b) {
                                        b(var46, var11, 2);
                                    }
                                    ++var11;
                                }
                                a(var46, (byte) 28, (int) 4);
                                break;
                            case 150:
                                if (var33 == 0) {
                                    e(842, var46);
                                }
                                a(var46, (byte) 93, (int) 0);
                                if (var2 == 26) {
                                    d[var46] = 4;
                                }
                                ++var33;
                                break;
                            case 151:
                                if (var35 == 0) {
                                    e(843, var46);
                                }
                                a(var46, (byte) 78, (int) 0);
                                ++var35;
                                break;
                            case 152:
                                if (var12 == 0) {
                                    e(835, var46);
                                }
                                a(var46, (byte) 81, (int) (var2 - 1 == 25 ? 55 : 0));
                                ++var12;
                                break;
                            case 153:
                                if (var29 == 0) {
                                    b(var46, var29++, 0);
                                }
                                a(var46, (byte) 11);
                                break;
                            case 155:
                                a(var46, (byte) 80, (int) 55);
                                if (dt.t > 0) {
                                    a(var46, (byte) 84, (int) 112);
                                    a(-5, (int) (k(var46) + i / 2), (int) (l(var46) + i / 2));
                                    dt.r = new dr(k(var46) + i / 2, l(var46) + i / 2);
                                }
                                break;
                            case 156:
                                a(var46, (byte) 80, (int) 5);
                                if (dz.t > 0) {
                                    a(var46, (byte) 85, (int) 5);
                                    a(-6, (int) (k(var46) + i / 2), (int) (l(var46) + i / 2));
                                    dz.s = new dr(k(var46) + i / 2, l(var46) + i / 2);
                                }
                                break;
                            case 157:
                                a(var46, (byte) 80, (int) 111);
                                dt.s = new dr(k(var46) + i / 2, l(var46) + i / 2);
                                break;
                            case 158:
                                a(var46, (byte) 80, (int) 5);
                                if (ex.r > 0) {
                                    ex.s = new dr(k(var46) + i / 2, l(var46) + i / 2);
                                }
                                break;
                            case 159:
                                byte var53 = 4;
                                if (var2 - 1 == 25) {
                                    var53 = 5;
                                } else if (var2 - 1 != 108 && var2 - 1 != 109) {
                                    if (var2 - 1 == 13) {
                                        var53 = 0;
                                    }
                                } else {
                                    var53 = 47;
                                }
                                a(var46, (byte) 89, (int) var53);
                                e(848, var46);
                                break;
                            case 163:
                                var10001 = ac;
                                ac = (byte) (var10001 + 1);
                                b(var46, var10001, 0);
                                a(var46, (byte) 12, (int) -1);
                                break;
                            case 164:
                                b(var46, var45[9], 0);
                                ++var45[9];
                                a(var46, (byte) 13, (int) 6);
                                break;
                            case 165:
                                b(var46, var45[10], 0);
                                a(var46, (byte) 14, (int) 0);
                                ++var45[10];
                                break;
                            case 166:
                                b(var46, var45[11], 0);
                                a(var46, (byte) 15, (int) 0);
                                ++var45[11];
                                break;
                            case 167:
                                b(var46, var45[12], 0);
                                ++var45[12];
                                a(var46, (byte) 16, (int) 43);
                                break;
                            case 172:
                                a(var46, (byte) 88, (int) 96);
                                if (var30 % 3 == 0) {
                                    a(836, (int) (k(var46) + 37), (int) (l(var46) + i));
                                }
                                ++var30;
                                break;
                            case 173:
                                a(var46, (byte) 88, (int) 96);
                                if (var31 % 4 == 0) {
                                    a(837, (int) (k(var46) + 48), (int) (l(var46) + i));
                                }
                                ++var31;
                                break;
                            case 174:
                                a(var46, (byte) 88, (int) 96);
                                if (var32 % 4 == 0) {
                                    a(838, (int) (k(var46) + 48), (int) (l(var46) + i));
                                }
                                ++var32;
                                break;
                            case 175:
                                b(var46, var15++, 0);
                                a(var46, (byte) 68, (int) 96);
                                break;
                            case 176:
                                b(var46, var16++, 0);
                                a(var46, (byte) 69, (int) 96);
                                break;
                            case 177:
                                b(var46, var17++, 0);
                                a(var46, (byte) 70, (int) 96);
                                break;
                            case 178:
                                if (var34 == 0) {
                                    a(830, (int) (k(var46) + i), (int) (l(var46) + i - 2));
                                    b(var46, var34++, 2);
                                }
                                a(var46, (byte) 109, (int) 96);
                                break;
                            case 179:
                                if (var17 == 0) {
                                    b(var46, var17++, 2);
                                    e(837, var46);
                                }
                                a(var46, (byte) 18, (int) 96);
                                break;
                            case 180:
                                b(var46, var17++, 0);
                                a(var46, (byte) 17, (int) 77);
                                if (var2 - 1 == 101) {
                                    d[var46] = 0;
                                }
                                break;
                            case 181:
                                if (var2 - 1 != 101 && var2 - 1 != 104 && var2 - 1 != 103 && var2 - 1 != 100 && var2 - 1 != 101) {
                                    if (var36 == 0) {
                                        a(StringEntity.aq, k(var46) + i / 2, l(var46) + i / 2);
                                    }
                                    ++var36;
                                    a(var46, (byte) 56, (int) 46);
                                }
                                break;
                            case 182:
                                go.C = new dr(k(var46), l(var46));
                                a(var46, (byte) 80, (int) 39);
                                break;
                            case 183:
                                go.D = new dr(k(var46) + 24, l(var46) + 24);
                                a(var46, (byte) 88, (int) 13);
                            case 184:
                                break;
                            case 185:
                                if (var37 == 1 && var2 == 18) {
                                    a(975, (int) (k(var46) + 24), (int) (l(var46) + 24));
                                }
                                if (var2 == 18) {
                                    a(var46, (byte) 71, (int) 43);
                                    if (var37 == 2) {
                                        a(StringEntity.aq, k(var46), l(var46) + 25);
                                    }
                                } else {
                                    b(var46, var37++, 0);
                                    a(var46, (byte) 71, (int) 47);
                                }
                                ++var37;
                                break;
                            case 186:
                                if (++var38 == 3) {
                                    a(StringEntity.aq, k(var46), l(var46) + 24);
                                }
                                a(var46, (byte) 94, (int) 17);
                                if (var38 == 2) {
                                    a(974, (int) (k(var46) + 24), (int) (l(var46) + 24));
                                }
                                break;
                            case 187:
                                if (var39 == 0 && go.b == GameMidlet.i.w) {
                                    l.addElement(new cc(-10, k(var46) + 20, l(var46) + 20, go.m.getWidth()));
                                }
                                ++var39;
                                a(var46, (byte) (go.b == GameMidlet.i.w ? 95 : 80), (int) 4);
                                break;
                            case 188:
                                if (go.b == GameMidlet.i.w) {
                                    l.addElement(new cc(-10, k(var46) + 20, l(var46) + 20, go.m.getWidth()));
                                }
                                a(var46, (byte) (go.b == GameMidlet.i.w ? 96 : 80), (int) 4);
                                break;
                            case 189:
                                go.J.aw = k(var46) + 12;
                                go.J.ax = l(var46) + 12;
                                if (GameMidlet.i.w == go.b) {
                                    g[var46] = 97;
                                }
                                d[var46] = 4;
                                l.addElement(go.J);
                                if (GameMidlet.i.w != go.b) {
                                }
                                break;
                            case 190:
                                g[var46] = 98;
                                d[var46] = 4;
                                if (var40 == 0) {
                                    a(1029, (int) (k(var46) + 36), (int) (l(var46) + 20));
                                    go.W = k(var46) + 26;
                                    go.X = l(var46) + 10;
                                    if (go.b == GameMidlet.i.w) {
                                        a(StringEntity.aq, k(var46) + 36, l(var46) + 24);
                                    }
                                }
                                ++var40;
                                break;
                            case 191:
                                g[var46] = 23;
                                if (var2 - 1 == 104) {
                                    d[var46] = 0;
                                    if (var18 == 1) {
                                        a(StringEntity.aq, k(var46) + 12, l(var46) + 12);
                                    }
                                } else {
                                    if (var18 % 2 == 0) {
                                        d[var46] = 46;
                                    } else {
                                        d[var46] = 44;
                                    }
                                    if (var18 == 1) {
                                        a(StringEntity.aq, k(var46) + 24, l(var46) + 12);
                                    }
                                }
                                ++var18;
                                break;
                            case 192:
                                g[var46] = 99;
                                d[var46] = 4;
                                if (var23 == 0) {
                                    a(1034, (int) (k(var46) + 36), (int) (l(var46) + 24));
                                }
                                ++var23;
                                break;
                            case 193:
                                g[var46] = 100;
                                d[var46] = 4;
                                if (var22 == 1) {
                                    a(1032, (int) (k(var46) + 24), (int) (l(var46) + 24));
                                    a(StringEntity.aq, k(var46) + 24, l(var46) + 30);
                                }
                                ++var22;
                                break;
                            case 194:
                                g[var46] = 106;
                                d[var46] = 4;
                                if (var24 == 0) {
                                    a(1030, (int) (k(var46) + 24), (int) (l(var46) + 24));
                                }
                                ++var24;
                                break;
                            case 195:
                                g[var46] = 102;
                                d[var46] = 4;
                                if (var20 == 1) {
                                    a(1037, (int) (k(var46) + 24), (int) (l(var46) + 24));
                                }
                                ++var20;
                                break;
                            case 196:
                                g[var46] = 103;
                                d[var46] = 4;
                                if (var19 == 1) {
                                    a(1035, (int) (k(var46) + 24), (int) (l(var46) + 24));
                                    a(StringEntity.aq, k(var46) + 24, l(var46) + 30);
                                }
                                ++var19;
                                break;
                            case 197:
                                g[var46] = 104;
                                d[var46] = 4;
                                if (var21 == 1) {
                                    a(1033, (int) (k(var46) + 12), (int) (l(var46) + 24));
                                    a(StringEntity.aq, k(var46) + 24, l(var46) + 30);
                                }
                                ++var21;
                                break;
                            case 198:
                                g[var46] = 105;
                                d[var46] = 4;
                                a(1036, (int) (k(var46) + 12), (int) (l(var46) + 20));
                                break;
                            case 199:
                                g[var46] = 101;
                                d[var46] = 4;
                                if (var13 == 1) {
                                    a(1031, (int) (k(var46) + 24), (int) (l(var46) + 24));
                                    a(StringEntity.aq, k(var46) + 24, l(var46) + 30);
                                }
                                ++var13;
                                break;
                            case 200:
                                g[var46] = 107;
                                if (var41 == 1) {
                                    a(1075, (int) (k(var46) + 24), (int) (l(var46) + 24));
                                    a(StringEntity.aq, k(var46) + 24, l(var46) + 30);
                                }
                                ++var41;
                                d[var46] = 5;
                                break;
                            case 201:
                                g[var46] = 19;
                                d[var46] = 5;
                                if (var42 == 1) {
                                    a(1094, (int) (k(var46) + 24), (int) (l(var46) + 20));
                                    a(StringEntity.aq, k(var46) + 24, l(var46) + 30);
                                }
                                ++var42;
                                break;
                            case 202:
                                a(var46, (byte) 88, (int) 96);
                                if (var44 % 4 == 0) {
                                    a(4, (int) (k(var46) + (i << 1)), (int) (l(var46) + i));
                                }
                                ++var44;
                                break;
                            case 203:
                                b(var46, var36++, 0);
                                a(var46, (byte) 110, (int) 96);
                                break;
                            case 204:
                                d[var46] = 43;
                                g[var46] = 10;
                                if (var42 == 1) {
                                    a(StringEntity.aq, k(var46), l(var46) + 30);
                                }
                                ++var42;
                        }
                    }
                }
            }
        } catch (Exception var48) {
            var48.printStackTrace();
        }
        m(var2);
        a(l);
        if (a == 24 && go.b != GameMidlet.i.w) {
            a = 53;
        }
        if ((var46 = a) != -1 && y != -1) {
            var46 = D;
        }
        if (var2 - 1 != 19) {
            for (var58 = 0; var58 < g.length; ++var58) {
                int var10000 = var58 % e;
                int var60 = var58 / e;
                short var51 = (short) var46;
                int var50 = var60;
                int var49 = var10000;
                if (g[var50 * e + var49] == var51) {
                    if ((var54 = j(var58)) != null) {
                        GameMidlet.i.aw = var54.a;
                        GameMidlet.i.ax = var54.b;
                    }
                    break;
                }
            }
        }
        if (var2 == 60) {
            GameMidlet.i.aw = 150;
            GameMidlet.i.ax = f * i - i;
        }
        if (E != -1) {
            D = E;
        }
        do1.a().h = GameMidlet.i;
        do1.a().b(var2);
        if (GameGraphic.H) {
            GameMidlet.i.n();
        }
    }

    private static dr j(int var0) {
        int var1;
        int var2;
        if (var0 + 1 < g.length && g[var0] == g[var0 + 1]) {
            for (var1 = var0; var1 < g.length; ++var1) {
                if (g[var1] != g[var1 + 1]) {
                    var2 = i;
                    if (var0 / e == f - 1) {
                        var2 = -i;
                    }
                    return new dr(k(var0) + (var1 - var0 + 1) * i / 2, l(var0) + i / 2 + var2);
                }
            }
        } else if (var0 + e < g.length && g[var0] == g[var0 + e]) {
            for (var1 = var0; var1 < g.length; var1 += e) {
                if (g[var1] != g[var1 + e]) {
                    var2 = -i;
                    if (var0 % e == 0) {
                        var2 = i;
                    }
                    return new dr(k(var0) + i / 2 + var2, l(var0) + ((var1 - var0) / e + 1) * i / 2);
                }
            }
        }
        return null;
    }

    public static void a(int var0, int var1, int var2) {
        if (y == -1) {
            Object var3;
            if (var0 > 0) {
                var3 = new ks(var0, var1, var2, 0);
            } else {
                var3 = new cc(var0, var1, var2, 0);
            }
            l.addElement(var3);
        }
    }

    private static void e(int var0, int var1) {
        if (y == -1) {
            ks var2 = new ks(var0, k(var1) + b(var1, d), l(var1) + i - 4, 0);
            l.addElement(var2);
        }
    }

    private static int k(int var0) {
        return var0 % e * i;
    }

    private static int l(int var0) {
        return var0 / e * i;
    }

    private static void a(int var0, byte var1, int var2) {
        g[var0] = var1;
        d[var0] = (short) var2;
    }

    private static void a(int var0, byte var1) {
        g[var0] = var1;
        if (var0 / e == 0) {
            d[var0] = 43;
        } else {
            d[var0] = 6;
        }
    }

    public static void a(int var0, int var1, byte var2) {
        g[var1 * e + var0] = 51;
    }

    private static void a(String var0, int var1, int var2) {
        if (kt.getInstance().c) {
            l.addElement(new hz(var0, var1, var2));
        }
    }

    public static ag f(int var0) {
        int var1 = F.size();
        for (int var2 = 0; var2 < var1; ++var2) {
            ag var3;
            if ((var3 = (ag) F.elementAt(var2)).a == var0) {
                return var3;
            }
        }
        return null;
    }

    public static void d() {
        if (G != null && F != null) {
            for (int var0 = 0; var0 < G.size(); ++var0) {
                kq var1;
                ag var2 = f((var1 = (kq) G.elementAt(var0)).b);
                a(var1, var2);
                kq var3;
                (var3 = new kq(var1.f, var1.aw * i, var1.ax * i, var1.a, var1.b)).d = var1.d;
                l.addElement(var3);
            }
            a(l);
        }
    }

    private static void m(int var0) {
        int var1;
        for (var1 = 0; var1 < fxClass.f.size(); ++var1) {
            kq var2;
            if ((var2 = (kq) fxClass.f.elementAt(var1)).f == var0) {
                ag var3 = fxClass.b((int) var2.b);
                a(var2, var3);
                l.addElement(new kq(var2.f, var2.aw * i, var2.ax * i, var2.a, var2.b));
            }
        }
        if (fxClass.g != null) {
            for (var1 = 0; var1 < fxClass.g.size(); ++var1) {
                hd var5 = (hd) fxClass.g.elementAt(var1);

                for (int var6 = 0; var6 < var5.g.size(); ++var6) {
                    dr var4;
                    if ((var4 = (dr) var5.g.elementAt(var6)).c == var0) {
                        if (var4.b * e + var4.a >= 0 && var4.b * e + var4.a < g.length) {
                            g[var4.b * e + var4.a] = 83;
                        }
                        a(var5.b, var4.a * i + i / 2, var4.b * i + i / 2);
                    }
                }
            }
        }
    }

    private void h() {
        this.K = null;
        if (j != 1) {
            this.K = new dr[4];
            for (int var1 = 0; var1 < this.K.length; ++var1) {
                int var2 = do1.a().a + awClass.e(GameGraphic.width / 20 + 5) * 20;
                int var3 = -110 - awClass.e(3) * 10;
                this.K[var1] = new dr(var2, var3);
            }
            awClass.c();
        }
    }

    public static Vector a(Vector var0) {
        try {
            int var1 = var0.size();
            for (int var2 = 0; var2 < var1 - 1; ++var2) {
                js var3 = (js) var0.elementAt(var2);
                for (int var4 = var2 + 1; var4 < var1; ++var4) {
                    js var5 = (js) var0.elementAt(var4);
                    if (var3.ax > var5.ax) {
                        var0.setElementAt(var3, var4);
                        var0.setElementAt(var5, var2);
                        var3 = var5;
                    }
                }
            }
        } catch (Exception var6) {
        }
        return var0;
    }

    private static void i() {
        GameGraphic.B.removeAllElements();
        l.removeAllElements();
        m.removeAllElements();
        n.removeAllElements();
        v = null;
        w = null;
        x = null;
        System.gc();
    }

    public static boolean b(int var0, int var1) {
        if ((var0 = c(var0, var1)) != 80 && var0 != 51) {
            return GameMidlet.i.Q == -5 && (var0 == 79 || var0 == 81 || var0 == 92 || var0 == 67);
        } else {
            return true;
        }
    }

    public static int c(int var0, int var1) {
        return var0 >= 0 && var0 <= e * i && var1 / i * e + var0 / i >= 0 && var1 / i * e + var0 / i < g.length ? g[var1 / i * e + var0 / i] : -2;
    }

    public static int d(int var0, int var1) {
        return var0 >= 0 && var0 <= e * i && var1 / i * e + var0 / i < g.length ? var1 / i * e + var0 / i : -1;
    }

    public static hn g(int var0) {
        for (int var1 = 0; var1 < m.size(); ++var1) {
            js var2;
            if ((var2 = (js) m.elementAt(var1)).az == 0 && ((gx) var2).w == var0) {
                return (hn) var2;
            }
        }
        return null;
    }

    public static void a(byte var0) {
        for (int var1 = 0; var1 < GameGraphic.B.size(); ++var1) {
            ((gz) GameGraphic.B.elementAt(var1)).b = true;
        }
        if (var0 != -1) {
            ba var3 = new ba(var0, 0);
            GameGraphic.B.addElement(var3);
        }
        k = var0;
    }

    public static void a(hn var0) {
        if (var0.V != -1) {
            gr var1 = new gr(var0);
            m.addElement(var1);
        }
    }

    public static gr h(int var0) {
        for (int i = 0; i < m.size(); ++i) {
            js var2 = (js) m.elementAt(i);
            if (var2.az == 4 && ((gr)var2).r.w == var0) {
                return (gr) var2;
            }
        }
        return null;
    }

    public static void b(hn var0) {
        m.addElement(var0);
        var0.j();
    }

    public static void c(hn var0) {
        m.removeElement(var0);
        gr var1;
        if ((var1 = h(var0.w)) != null) {
            m.removeElement(var1);
        }
    }

    public static void a(js var0) {
        if (p == var0) {
            p = null;
        }
        m.removeElement(var0);
    }

    public final void a(byte var1, byte[] var2) {
        y = var1;
        c = new ht(awClass.a(var2), i * gy.Y, gy.Y * i);
        this.e();
        GameGraphic.J = 0;
    }

    private static void a(int var0, short[] var1) {
        if (var0 % e == 0) {
            var1[var0] = var1[var0 + 1];
        } else {
            var1[var0] = var1[var0 - 1];
        }
    }

    public final void e() {
        ca.b = false;
        i();
        b(GameMidlet.i);
        short[] var1 = new short[d.length];
        g = new short[d.length];
        byte[] var2 = new byte[100];
        byte var3 = 0;
        int var4;
        for (var4 = 0; var4 < d.length; ++var4) {
            var1[var4] = d[var4];
        }
        for (var4 = 0; var4 < d.length; ++var4) {
            if (d[var4] < c.c) {
                d[var4] = -4;
            } else if (d[var4] < c.c << 1) {
                d[var4] = -5;
            } else {
                int var5;
                ks var6;
                switch (var5 = d[var4] - (c.c << 1)) {
                    case 0:
                        d[var4] = 98;
                        var6 = new ks(846, k(var4) + i / 2, l(var4) + i / 2, 0);
                        l.addElement(var6);
                        break;
                    case 1:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    default:
                        b(var4, var2[var5], 0);
                        g[var4] = (byte) (var5 + -125);
                        d[var4] = -3;
                        break;
                    case 2:
                        d[var4] = 139;
                        break;
                    case 3:
                        d[var4] = 152;
                        break;
                    case 12:
                        d[var4] = 150;
                        break;
                    case 13:
                        d[var4] = 151;
                        break;
                    case 14:
                        b(var4, var3, 0);
                        ++var3;
                        d[var4] = 184;
                        var1[var4] = 33;
                        break;
                    case 15:
                        var1[var4] = 0;
                        d[var4] = 185;
                }
                if (var5 > 0 && var2[var5] == 0 && var5 - 1 < aeClass.B.length && aeClass.B[var5 - 1] != -1) {
                    var6 = new ks(aeClass.B[var5 - 1], k(var4) + b(var4, var1), l(var4) + i - 4, 0);
                    l.addElement(var6);
                }
                if (var5 != 14) {
                    a(var4, var1);
                }
                ++var2[var5];
            }
        }

        do1.f = false;
        GameMidlet.i.H = 0;
        this.a((InputStream) null, aeClass.b + 1, false);
        a = aeClass.b;
        d = var1;
        do1.a().b(aeClass.b + 1);
        GameGraphic.h();
        P = -1;
        t = -1;
        d();
        bf.a().doJoinPark(aeClass.b, -1);
    }

    private static int b(int var0, short[] var1) {
        for (int var2 = var0; var2 < var1.length; ++var2) {
            if (var1[var2] != var1[var2 + 1]) {
                return (var2 - var0 + 1) * i / 2;
            }
        }
        return 0;
    }

    private static void b(int var0, byte var1, int var2) {
        if (var1 == 0) {
            int var3;
            if (var0 + 1 < d.length && d[var0] == d[var0 + 1]) {
                for (var3 = var0; var3 < d.length; ++var3) {
                    if (d[var3] != d[var3 + 1]) {
                        a(var2 != 1 ? StringEntity.aq : "thoat", k(var0) + (var3 - var0 + 1) * i / 2, l(var0) + (y == -1 ? i / 2 : i) + (var2 == 2 ? i / 2 : 0));
                        return;
                    }
                }
            } else {
                if (var0 + e < d.length && d[var0] == d[var0 + e]) {
                    for (var3 = var0; var3 < d.length; var3 += e) {
                        if (d[var3] != d[var3 + e]) {
                            a(var2 != 1 ? StringEntity.aq : "thoat", k(var0) + 3, l(var0) + ((var3 - var0) / e + 1) * i / 2);
                            return;
                        }
                    }
                }
            }
        }
    }

    private static void a(kq var0, ag var1) {
        byte var2 = 88;
        if (var1.c == 1) {
            var2 = 79;
        } else if (var1.c == 2) {
            var2 = 67;
        }
        for (int var3 = 0; var3 < var1.j.size(); ++var3) {
            dr var4 = (dr) var1.j.elementAt(var3);
            g[(var0.ax + var4.b) * e + var0.aw + var4.a] = var2;
        }
    }

    public static void a(byte var0, byte var1, int var2, int var3) {
        H = var2;
        I = var3;
        y = -1;
        GameGraphic.i();
        if (GameMidlet.e != 9) {
            cx.getInstance().d((int) 9);
        }
        bf.a().doJoinPark(var0, var1);
    }
}
