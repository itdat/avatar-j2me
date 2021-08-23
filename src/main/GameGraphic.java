package main;

import avatar.*;
import java.util.Vector;
import javax.microedition.lcdui.Canvas;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import javax.microedition.lcdui.List;

// a
public final class GameGraphic extends Canvas implements Runnable, CommandListener {

    public static GameGraphic INST;    // a
    private static boolean ag;
    public static boolean[] b = new boolean[14];
    public static boolean[] c = new boolean[14];
    public static boolean[] d = new boolean[14];
    public static boolean e;
    public static boolean f;
    public static boolean g;
    public static int h;
    public static int i;
    public static int j;
    public static int k;
    public static int l;
    public static int width = 0; // m
    public static int height; // n
    public static int o;
    public static int p;
    public static int height2; // q
    private static boolean ah;
    public static hj r;
    public static jj s;
    public static kr t;
    public static hb u;
    public static gs v;
    private static int ai;
    public static fxClass w;
    public static ir x;
    public static ho y;
    public static b z;
    public static ha A;
    public static Vector B = new Vector();
    private static long[] aj;
    public static Vector C = new Vector();
    public static bb D;
    public static boolean isRimOrBlackBerry;    // E
    private static boolean isNx;  // ak
    public static boolean isNokiaN7;    // F
    public static boolean G;
    public static boolean H = false;
    public static boolean I = false;
    public static int J = -1;
    private static Command al;
    private static Command am;
    private static Object an = new Object();
    public static CsInterface K;
    public static CsInterface L;
    public static CsInterface M;
    public static CsInterface N;
    public static CsInterface O;
    public static CsInterface P;
    public static CsInterface Q;
    public static CsInterface R;
    public static EwInterface S;
    public static int T = 0;
    public static int U = 0;
    private static int ao;
    public static int V;
    public static int W;
    public static StringEntity stringEntity;   // X
    public static Image Y;
    public static int Z = 1;
    private int ap;
    private static boolean aq = false;
    public static Image image; // aa
    public static byte ab = 0;
    private long ar = 0L;
    public static Vector ac = new Vector();
    private int as;
    private int at;
    private static Vector au;
    public static Button ad;
    public static dr[] ae = new dr[3];
    public static dr af;
    
    List list;

    public GameGraphic() {
        this.setFullScreenMode(true);
        width = this.getWidth();
        height2 = height = this.getHeight();
        stringEntity = new StringEntity();
        gy.Y = 1;
        if (awClass.b(GameMidlet.m) == null) {
            gb.c();
        }
        Z = 0;
        K = new dh(0);
        L = new dh(1);
        M = new dh(2);
        N = new dh(3);
        O = new dh(4);
        P = new dh(5);
        Q = new dh(6);
        R = new dh(7);
        S = new gw();
        hj.al = K.getLastByte() + 6;
        gy.af = (byte) N.getLastByte();
        gy.ag = (byte) L.getLastByte();
        gy.ah = (byte) K.getLastByte();
        gy.ai = (byte) P.getLastByte();
        this.b();
        o = width / 2;
        p = height / 2;
        INST = this;
        System.gc();
        KeyboardManager.a(0);
        if (ah = this.getKeyCode(8) == -20) {
            KeyboardManager.a(1);
        }
        String mePlatform = System.getProperty("microedition.platform");
        isRimOrBlackBerry = mePlatform.indexOf("RIM") == 0 || mePlatform.indexOf("BlackBerry") == 0;
        isNx = mePlatform.indexOf("NX") == 0;
        isNokiaN7 = mePlatform.indexOf("NokiaN7") == 0;
        H = this.hasPointerEvents();
        if (isRimOrBlackBerry) {
            ai = 5;
            if (mePlatform.indexOf("BlackBerry") == 0) {
                ai = 1;
            }
            KeyboardManager.a(3);
            this.setCommandListener(this);
            am = new Command(StringEntity.CLOSE, 2, 1);
            al = new Command(StringEntity.MENU, 1, 1);
            this.addCommand(al);
            this.addCommand(am);
        }
        if (isNx) {
            ai = 2;
        }
        if (isRimOrBlackBerry || isNx) {
            aj = new long[4];
        }
        KeyboardManager.b(INST.getGameAction(48) == 0
                && INST.getGameAction(49) == 0
                && INST.getGameAction(50) == 0
                && INST.getGameAction(51) == 0
                && INST.getGameAction(52) == 0
                && INST.getGameAction(53) == 0
                && INST.getGameAction(54) == 0
                && INST.getGameAction(55) == 0
                && INST.getGameAction(56) == 0
                && INST.getGameAction(57) == 0);
        awClass.a();
        t = new le();
        s = new jj();
        w = new fxClass();
        u = new hb();
        x = new ir();
        y = new ho();
        dm.INST.e();
        S.c();
        if (this.hasPointerEvents()) {
            au = new Vector();
        }
        a();
        if ((V = (ao = (int) (Runtime.getRuntime().totalMemory() / 1024L)) / 17) < 60) {
            V = 60;
        }
    }

    public static void a() {
        ad = new Button(StringEntity.NO, -1);
        le.getInstance().c();
        if (r != null) {
            r.c();
        }
    }

    public final void sizeChanged(int var1, int var2) {
        this.setFullScreenMode(true);
        this.b();
    }

    public final void b() {
        width = this.getWidth();
        height = this.getHeight();
        gy.aa = 20;
        if (width < 176) {
            gy.aa = 4;
        }
        if (dm.d && H) {
            z = new b();
        } else {
            G = false;
            z = null;
        }
        height2 = height;
        o = width / 2;
        S.c();
        p = height / 2;
        S.a();
        if (t != null) {
            t = null;
        }
        if (es.a != null) {
            es.b().f();
        }
        do1.a().b(ir.a);
        if (dp.a != null) {
            dp.e();
        }
        if (je.c != null) {
            je.a().b();
        }
        if (s != null) {
            s.a();
            s.a(s.a);
        }
        if (r != null) {
            if (r == cz.a) {
                cz.b();
            }
            if (kx.i == r) {
                kx.i.e();
            }
            if (hc.d != null) {
                hc.d.e();
            }
            if (ea.a != null) {
                ea.b().e();
            }
            if (el.a == r) {
                el.a.e();
            }
            if (jp.a == r) {
                jp.a.g();
            }
        }
        if (u != null) {
            u.b();
        }
        if (im.a != null) {
            im.d().b();
        }
        if (jb.a != null) {
            jb.b().d();
        }
        if (H && hj.ap == null) {
            ImageModel.b(StringEntity.MAIN_AV);
            hj.ap = ImageModel.getImageFromIndex("bpa");
            hj.aq = ImageModel.getImageFromIndex("icon_chat");
            ImageModel.cleanUp();
        }
        if (r != null) {
            if (r == ez.a) {
                ez.b().e();
            }
            if (r == dm.INST) {
                dm.INST.e();
            }
            if (r == cy.b()) {
                cy.b().f();
            }
            if (r == jd.b()) {
                jd.b().e();
            }
            if (A != null) {
                A = null;
            }
        }
    }

    public static void a(String var0) {
        if (!jy.b && !var0.equals("")) {
            bc var1 = new bc(var0, -K.a(var0));
            var1.aw = width + 10;
            C.addElement(var1);
            if (ab == 0) {
                ab = 1;
            }
            U = 0;
        }
    }

    public static void c() {
        if (!kt.getInstance().b()) {
            int city = ez.b().ar - 1;
            if (city < 0) {
                city = 0;
            }
            int nation = dm.INST.b[4];
            int land = ez.b().b;
            String uri = "socket://"
                    + GameMidlet.cityIpAddresses[nation][land][city] + ":"
                    + GameMidlet.cityPorts[nation][land][city];
            if (isRimOrBlackBerry) {
                if (dm.e) {
                    uri = uri + ";interface=wifi";
                } else {
                    uri = uri + ";deviceside=true";
                }
            }
            kt.getInstance().setUri(uri);
            cx.getInstance().setProviderAndClientType();
        }
    }

    public final void d() {
        if (!aq) {
            (new Thread(this)).start();
        }
        aq = true;
        kt.getInstance().c();
    }

    public final void run() {
        ag = true;
        while (ag) {
            try {
                if (this.ap > 0) {
                    --this.ap;
                    if (this.ap == 0) {
                        Display.getDisplay(GameMidlet.gameMidlet).vibrate(0);
                    }
                }
                long var1 = System.currentTimeMillis();
                if (++l > 10000) {
                    if (System.currentTimeMillis() - this.ar > 20000L && r == es.a) {
                        GameMidlet.gameMidlet.notifyDestroyed();
                    }
                    l = 0;
                }
                if (J != -1) {
                    if (J == 1) {
                        this.as += 15;
                    } else {
                        ++this.at;
                        if (this.at >= 8) {
                            this.at = 0;
                        }
                    }
                    if (this.as >= p) {
                        this.as = 0;
                        J = -1;
                    }
                }
                if (J != 0) {
                    if (z != null) {
                        z.a();
                    }
                    if (D != null && v == null) {
                        D.l();
                    }
                    int var3;
                    if (B.size() > 0) {
                        for (var3 = 0; var3 < B.size(); ++var3) {
                            ((gz) B.elementAt(var3)).b();
                        }
                    }
                    if (r != null) {
                        if (im.c) {
                            im.d().l();
                        }

                        if (C.size() <= 0) {
                            if (ab > 0) {
                                --ab;
                            }
                        } else {
                            if (ab < gy.ag) {
                                ++ab;
                            }

                            bc var9;
                            bc var10000 = var9 = (bc) C.elementAt(0);
                            var10000.aw -= 2;
                            if (var9.aw < var9.c) {
                                C.removeElementAt(0);
                            }
                        }

                        r.k();
                        if (y.m) {
                            ho var10 = y;
                            if (t == null && v == null) {
                                if (var10.n == 0) {
                                    if (ho.i < 0) {
                                        ho.j = 0;
                                    } else if (ho.i > var10.c) {
                                        ho.j = var10.c;
                                    }
                                } else {
                                    if (ho.i < 0 || ho.i > var10.c) {
                                        if (var10.n > 500) {
                                            var10.n = 500;
                                        } else if (var10.n < -500) {
                                            var10.n = -500;
                                        }

                                        var10.n -= var10.n / 5;
                                        if (awClass.f(var10.n / 10) <= 10) {
                                            var10.n = 0;
                                        }
                                    }

                                    ho.j = ho.i += var10.n / 15;
                                    var10.n -= var10.n / 20;
                                }

                                if (var10.o == 0) {
                                    if (ho.k < 0) {
                                        ho.l = 0;
                                    } else if (ho.k > var10.h) {
                                        ho.l = var10.h;
                                    }
                                } else {
                                    if (ho.k < 0 || ho.k > var10.h) {
                                        if (var10.o > 500) {
                                            var10.o = 500;
                                        } else if (var10.o < -500) {
                                            var10.o = -500;
                                        }

                                        var10.o -= var10.o / 5;
                                        if (awClass.f(var10.o / 10) <= 10) {
                                            var10.o = 0;
                                        }
                                    }

                                    ho.l = ho.k += var10.o / 15;
                                    var10.o -= var10.o / 20;
                                }

                                if (ho.i != ho.j) {
                                    var10.b = ho.j - ho.i << 2;
                                    var10.a += var10.b;
                                    ho.i += var10.a >> 4;
                                    var10.a &= 15;
                                }

                                if (ho.k != ho.l) {
                                    var10.g = ho.l - ho.k << 2;
                                    var10.f += var10.g;
                                    ho.k += var10.f >> 4;
                                    var10.f &= 15;
                                }
                            }
                        }

                        if (v != null) {
                            v.l();
                        } else if (A != null) {
                            if (D == null) {
                                A.l();
                            }
                        } else if (t != null) {
                            t.l();
                            if (t != null) {
                                t.k();
                            }
                        } else {
                            if (A == null && !im.c) {
                                r.l();
                            }

                            if (y.m && A == null) {
                                y.a();
                            }
                        }

                        if (l % 20 == 10) {
                            fxClass.g();
                            gb.d();
                            if ((byte) ((int) (Runtime.getRuntime().freeMemory() / 1024L)) < 100) {
                                System.gc();
                            }
                        }
                    }

                    if (D != null) {
                        D.k();
                    }

                    g = false;
                    f = false;

                    for (var3 = 0; var3 < ac.size(); ++var3) {
                        ((cp) ac.elementAt(var3)).a();
                    }

                    if (isRimOrBlackBerry || isNx) {
                        for (var3 = 0; var3 < 4; ++var3) {
                            if (d[(var3 << 1) + 2] && System.currentTimeMillis() / 100L - aj[var3] > (long) ai) {
                                d[(var3 << 1) + 2] = false;
                            }
                        }
                    }
                }

                this.repaint();
                if (isRimOrBlackBerry) {
                    synchronized (an) {
                        try {
                            an.wait(1000L);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                } else {
                    this.serviceRepaints();
                }

                long var11 = System.currentTimeMillis() - var1;

                try {
                    if (var11 < 50L) {
                        Thread.sleep(50L - var11);
                    } else {
                        Thread.sleep(1L);
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public final void keyPressed(int var1) {
        if (J == -1) {
            this.ar = System.currentTimeMillis();
            if (ah) {
                switch (this.getGameAction(var1)) {
                    case 1:
                        d[2] = true;
                        b[2] = true;
                        return;
                    case 2:
                        d[4] = true;
                        b[4] = true;
                        return;
                    case 3:
                    case 4:
                    case 7:
                    default:
                        if (var1 == -21) {
                            var1 = -6;
                        } else if (var1 == -22) {
                            var1 = -7;
                        }
                        break;
                    case 5:
                        d[6] = true;
                        b[6] = true;
                        return;
                    case 6:
                        d[8] = true;
                        b[8] = true;
                        return;
                    case 8:
                        d[5] = true;
                        b[5] = true;
                        return;
                }
            } else if (isRimOrBlackBerry) {
                long var2 = System.currentTimeMillis() / 100L;
                switch (var1) {
                    case -8:
                        d[5] = true;
                        b[5] = true;
                        return;
                    case 1:
                        aj[0] = var2;
                        d[2] = true;
                        b[2] = true;
                        return;
                    case 2:
                        aj[1] = var2;
                        d[4] = true;
                        b[4] = true;
                        return;
                    case 5:
                        aj[2] = var2;
                        d[6] = true;
                        b[6] = true;
                        return;
                    case 6:
                        aj[3] = var2;
                        d[8] = true;
                        b[8] = true;
                        return;
                }
            }

            if (v != null) {
                v.d(var1);
            } else if (A != null) {
                A.d(var1);
            } else if (t == null) {
                if (im.c) {
                    im.d().b(var1);
                } else {
                    r.d(var1);
                }
            }

            if (isNx) {
                long var5 = System.currentTimeMillis() / 100L;
                switch (var1) {
                    case -39:
                    case -2:
                        aj[3] = var5;
                        break;
                    case -38:
                    case -1:
                        aj[0] = var5;
                        break;
                    case -4:
                        aj[2] = var5;
                        break;
                    case -3:
                        aj[1] = var5;
                }
            }

            switch (var1) {
                case -39:
                case -2:
                    d[8] = true;
                    b[8] = true;
                    return;
                case -38:
                case -1:
                    d[2] = true;
                    b[2] = true;
                    return;
                case -22:
                case -7:
                    d[13] = true;
                    b[13] = true;
                    return;
                case -21:
                case -6:
                    d[12] = true;
                    b[12] = true;
                    return;
                case -5:
                case 10:
                    d[5] = true;
                    b[5] = true;
                    return;
                case -4:
                    d[6] = true;
                    b[6] = true;
                default:
                    return;
                case -3:
                    d[4] = true;
                    b[4] = true;
                    return;
                case 35:
                    d[11] = true;
                    b[11] = true;
                    return;
                case 42:
                    d[10] = true;
                    b[10] = true;
            }
        }
    }

    public static boolean a(int var0) {
        if (b[var0]) {
            b[var0] = false;
            return true;
        } else {
            return false;
        }
    }

    public final void keyReleased(int var1) {
        if (ah) {
            switch (this.getGameAction(var1)) {
                case 1:
                    d[2] = false;
                    return;
                case 2:
                    d[4] = false;
                    return;
                case 3:
                case 4:
                case 7:
                default:
                    if (var1 == -21) {
                        var1 = -6;
                    } else if (var1 == -22) {
                        var1 = -7;
                    }
                    break;
                case 5:
                    d[6] = false;
                    return;
                case 6:
                    d[8] = false;
                    return;
                case 8:
                    d[5] = false;
                    return;
            }
        } else if (isRimOrBlackBerry && var1 == 27) {
            var1 = -7;
        }

        switch (var1) {
            case -39:
            case -2:
                if (!isNx && !isRimOrBlackBerry) {
                    d[8] = false;
                }

                c[8] = true;
                return;
            case -38:
            case -1:
                if (!isNx && !isRimOrBlackBerry) {
                    d[2] = false;
                }

                c[2] = true;
                return;
            case -22:
            case -7:
                d[13] = false;
                c[13] = true;
                return;
            case -21:
            case -6:
                d[12] = false;
                c[12] = true;
                return;
            case -5:
            case 10:
                d[5] = false;
                c[5] = true;
                return;
            case -4:
                if ((!isNx && !isRimOrBlackBerry)) {
                    d[6] = false;
                }

                c[6] = true;
            default:
                return;
            case -3:
                if ((!isNx && !isRimOrBlackBerry)) {
                    d[4] = false;
                }

                c[4] = true;
                return;
            case 35:
                d[11] = false;
                c[11] = true;
                return;
            case 42:
                d[10] = false;
                c[10] = true;
        }
    }

    protected final void pointerDragged(int var1, int var2) {
        au.addElement(new dr(var1, var2));
        h = var1;
        i = var2;
    }

    protected final void pointerPressed(int var1, int var2) {
        g = true;
        e = true;
        j = var1;
        k = var2;
        h = var1;
        i = var2;
    }

    protected final void pointerReleased(int var1, int var2) {
        e = false;
        f = true;
        h = var1;
        i = var2;
    }

    public static void e() {
        f = false;
        for (int i = 0; i < 14; ++i) {
            b[i] = false;
        }
    }

    public static void f() {
        f = false;
        e = false;
        for (int i = 0; i < 14; ++i) {
            d[i] = false;
        }
    }

    public static void g() {
        e = false;
        for (int i = 0; i < 14; ++i) {
            c[i] = false;
        }
    }

    public static String a(String var0, int var1) {
        String var2 = "";
        for (int i = 0; i < var0.length(); ++i) {
            var2 = var2 + (char) (var0.charAt(i) + var1);
        }
        return var2;
    }

    public static void a(int var0, int var1, int var2, int var3, int var4) {
        ac.addElement(new cp(var1, var2, var0, -1, (Image) null, var4, -1, -1));
    }

    public static void a(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
        ac.addElement(new cp(var1, var2, var0, -1, (Image) null, 0, var5, -1));
    }

    public static void a(int var0, int var1, int var2, int var3, Image var4, int var5) {
        ac.addElement(new cp(var1, var2, var0, -1, var4, var5, -1, -1));
    }

    public static void a(String var0, int var1, int var2, int var3, int var4, int var5) {
        ac.addElement(new cp(var1, var2, var0, -1, var4, var5));
    }

    public static void a(Graphics var0) {
        var0.drawImage(Y, 0, 1, 0);
    }

    public static void b(Graphics var0) {
        var0.drawImage(Y, 0, 1, 0);
    }

    protected final void paint(Graphics var1) {
        var1.translate(0, 0);
        if (J != 0) {
            if (r != null) {
                r.a(var1);
            }
            if (B.size() > 0 && r != el.a && r != jp.a) {
                for (int var2 = 0; var2 < B.size(); ++var2) {
                    ((gz) B.elementAt(var2)).a(var1);
                }
            }
            if (im.c) {
                im.d().a(var1);
            }
            if (A != null) {
                A.a(var1);
            }
            if (v != null) {
                v.a(var1);
            } else if (t != null) {
                t.a(var1);
            }
            if (D != null) {
                D.a(var1);
            }
            Graphics var6 = var1;
            c(var1);
            var1.translate(-do1.a().a, -do1.a().b);

            int var3;
            for (var3 = 0; var3 < ac.size(); ++var3) {
                ((cp) ac.elementAt(var3)).a(var6);
            }

            if (ab > 0) {
                var6 = var1;
                var1.translate(-var1.getTranslateX(), -var1.getTranslateY());
                var1.setClip(0, 0, width, height);
                var1.setColor(0);
                for (var3 = 0; var3 < width / 30 + 1; ++var3) {
                    var6.drawImage(image, var3 * 30, ab - 30, 0);
                }
                var6.fillRect(0, ab, width, 1);
                if (C.size() > 0) {
                    c(var6);
                    var3 = ab / 2 - gy.ag / 2;
                    var6.setClip(0, var3, width, gy.ag + 2);
                    bc var4 = (bc) C.elementAt(0);
                    L.a(var6, var4.a, var4.aw, var3, 0);
                    c(var6);
                }
            }
        }
        if (J != -1) {
            c(var1);
            var1.setColor(1);
            var1.fillRect(0, 0, width, p - this.as);
            var1.fillRect(0, p + this.as, width, p - this.as + 2 + T);
            if (J != 1) {
                jj.b.a(this.at, o, p, 0, 3, var1);
            }
        }
        if (z != null) {
            z.a(var1);
        }
        c(var1);
        if (isRimOrBlackBerry) {
            synchronized (an) {
                an.notify();
            }
        }
    }

    public static void c(Graphics var0) {
        var0.translate(-var0.getTranslateX(), -var0.getTranslateY());
        var0.translate(0, 0);
        var0.setClip(0, 0, width, height2);
    }

    public static void h() {
        s.a(false);
        v = null;
    }

    // b String
    public static void showAlert(String var0) {
        s.a(var0, new Button(StringEntity.OK, -1), (Vector) null);
    }

    public static void a(String var0, Vector var1) {
        if (jy.b) {
            s.a(var0, (Button) null, var1);
        } else {
            s.a(var0, new Button("", -1), var1);
        }
    }

    public static void a(String var0, ii var1) {
        Vector var2 = new Vector();
        var2.addElement(new Button(StringEntity.YES, var1));
        var2.addElement(ad);
        a(var0, var2);
    }

    public static void a(String var0, int var1, gy var2) {
        Vector var3 = new Vector();
        var3.addElement(new Button(StringEntity.YES, var1, var2));
        var3.addElement(ad);
        a(var0, var3);
    }

    public static void b(String var0, ii var1) {
        Vector var2 = new Vector();
        var2.addElement(new Button(StringEntity.OK, var1));
        a(var0, var2);
    }

    public static void b(String var0, int var1) {
        Vector var2 = new Vector();
        var2.addElement(new Button(StringEntity.YES, var1));
        var2.addElement(ad);
        a(var0, var2);
    }

    public static void b(String var0, int var1, gy var2) {
        Vector var3 = new Vector();
        var3.addElement(new Button(StringEntity.OK, var1, var2));
        a(var0, var3);
    }

    public static void c(String var0) {
        s.a(var0, (Button)null, (Vector)null);
        s.a(true);
    }

    public static void d(String var0) {
        s.a(var0, new Button(StringEntity.CANCEL, -1), (Vector)null);
    }

    public static void i() {
        c(StringEntity.PLEASE_WAIT);
    }

    public static String a(int var0, int var1, int var2, boolean var3) {
        String var4 = "";
        if (var0 > 0) {
            var4 = var4 + b(var0) + StringEntity.COIN;
        }
        if (var1 > 0) {
            if (var0 > 0) {
                var4 = var4 + " - ";
            }
            var4 = var4 + b(var1) + StringEntity.TAEL;
        }
        if (var2 >= 0) {
            if (!var4.equals("")) {
                var4 = var4 + " - ";
            }
            var4 = var4 + b(var2) + StringEntity.LOCKED_TAEL;
        }
        return var4;
    }

    public static String a(int var0, int var1, boolean var2) {
        String var3 = "";
        if (var0 > 0) {
            var3 = var3 + b(var0) + (var2 ? StringEntity.COIN : StringEntity.DOLLAR);
        }
        if (var1 > 0) {
            if (var0 > 0) {
                var3 = var3 + " - ";
            }
            var3 = var3 + b(var1) + StringEntity.TAEL;
        }
        return var3;
    }

    public static String b(int var0) {
        String var1 = "";
        int var2 = var0 / 1000 + 1;
        for (int var3 = 0; var3 < var2; ++var3) {
            if (var0 < 1000) {
                var1 = var0 + var1;
                break;
            }
            int var4;
            if ((var4 = var0 % 1000) == 0) {
                var1 = ".000" + var1;
            } else if (var4 < 10) {
                var1 = ".00" + var4 + var1;
            } else if (var4 < 100) {
                var1 = ".0" + var4 + var1;
            } else {
                var1 = "." + var4 + var1;
            }
            var0 /= 1000;
        }
        return var1;
    }

    public final void commandAction(Command var1, Displayable var2) {
        if (var1 != null && var1 != List.SELECT_COMMAND) {
            if (var1 == null) {
                if (r == jv.a) {
                    jy.e().a();
                } else {
                    aeClass.getInstance().a();
                }
                Display.getDisplay(GameMidlet.gameMidlet).setCurrent(this);
                this.setFullScreenMode(true);
                la.d = false;
            }
        } else {
            if (list.getSelectedIndex() != 0) {
                jy.b = true;
                jy.e().a();
            }
            la.d = false;
            Display.getDisplay(GameMidlet.gameMidlet).setCurrent(this);
            this.setFullScreenMode(true);
        }
        if (var1 == al) {
            b[12] = true;
        } else {
            if (var1 == am) {
                b[13] = true;
            }
        }
    }

    public static boolean a(int var0, int var1, int var2, int var3) {
        return !e && !f ? false : b(var0, var1, var2, var3);
    }

    public static boolean b(int var0, int var1, int var2, int var3) {
        return h >= var0 && h <= var0 + var2 && i >= var1 && i <= var1 + var3;
    }

    public static void a(int var0, int var1, ii var2, ii var3, ii var4) {
        String var5 = "";
        Vector var6 = new Vector();
        if (var0 > 0) {
            var6.addElement(new Button(var1 <= 0 ? StringEntity.YES : StringEntity.COIN, var2));
            var5 = " " + var0 + StringEntity.COIN;
        }
        if (var1 > 0) {
            var6.addElement(new Button(var0 <= 0 ? StringEntity.YES : StringEntity.TAEL, var3));
            var5 = " " + var1 + StringEntity.TAEL;
        }
        if (var6.size() == 1) {
            var5 = StringEntity.BUY_WITH_PRICE + var5 + " " + StringEntity.NO + " ?";
        } else {
            var5 = StringEntity.BUY_BY + " \n" + var0 + StringEntity.COIN + " - " + var1 + " " + StringEntity.TAEL;
        }
        if (var4 == null) {
            var6.addElement(ad);
        } else {
            var6.addElement(new Button(StringEntity.NO, var4));
        }
        a(var5, var6);
    }

    public static int j() {
        return (int) (System.currentTimeMillis() / 1000L);
    }

    public static int k() {
        return j - h;
    }

    public static int l() {
        return k - i;
    }

    public static boolean m() {
        return v == null && t == null && r != hc.d && r != dp.b() && r != cy.a && r != el.a && r != jp.a && r != cd.a && r != jy.a && r != ea.a && r != jd.a && !ei.e && !ei.b && r != hk.a && (r != ek.a || !kx.j);
    }
}
