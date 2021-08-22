package avatar;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.util.Hashtable;
import java.util.Vector;
import javax.microedition.lcdui.Graphics;

public final class cy extends hj {

    public static cy a;
    public hj b;
    private int j = 0;
    public static Vector c = new Vector();
    private Button k;
    public static Vector d;
    private int l;
    public static byte e = 0;
    public static boolean f = false;
    public int g;
    public static String h = "friendlist";
    public static Hashtable i = new Hashtable();
    private boolean m = false;
    private String n;
    private boolean o = false;
    private int p = -20;
    private Button q;

    public static cy b() {
        if (a == null) {
            a = new cy();
        }

        return a;
    }

    public final void a() {
        this.g = 0;
        this.k = new Button(StringEntity.CLOSE, 1);
        super.ae = this.k;
        this.b = null;
        if (main.GameGraphic.r != cd.b() && main.GameGraphic.r != dp.b() && main.GameGraphic.r != b()) {
            this.b = main.GameGraphic.r;
        }

        this.f();
        super.a();
        if (main.GameGraphic.Z > 0) {
            this.o = true;
        }

    }

    public final void e() {
        main.GameGraphic.y.a(20, je.a().h + je.o + gy.Z, main.GameGraphic.width - 40, this.l, main.GameGraphic.width - 40, c.size() * this.l, main.GameGraphic.width - 40, je.a().e - 5 - (je.o + 2 * gy.Z), c.size());
        if (c.size() > 0) {
            il.a().a(c.size() * this.l, je.a().e - 5 - (je.o + 2 * gy.Z));
        }

    }

    public final void f() {
        if (main.GameGraphic.Z == 0) {
            je.a().a(this.n, main.GameGraphic.width - 20, main.GameGraphic.height2 - main.GameGraphic.T - 20, 1);
        } else {
            je.a().a(this.n, main.GameGraphic.width - 20 * gy.Y, main.GameGraphic.height - main.GameGraphic.ab - main.GameGraphic.T - 10 + (jy.b ? 7 * gy.Y : 0), 1);
        }

        je.a().h = 10 + main.GameGraphic.ab;
        if (c != null) {
            this.e();
        }

    }

    public cy() {
        this.l = 40 * gy.Y;
    }

    public final void a(int var1, boolean var2) {
        if (var2 && var1 == this.g) {
            this.a(this.q);
        }

        this.p = -20;
        if (var1 >= 0 && var1 < c.size()) {
            this.g = var1;
        }

    }

    public final void a(boolean var1) {
        this.o = var1;
    }

    public final void a(Graphics var1) {
        var1.setClip(0, 0, main.GameGraphic.width, main.GameGraphic.height);
        if (this.b != null) {
            this.b.b(var1);
        } else {
            aeClass.getInstance().b(var1);
        }

        je.a().a(var1);
        var1.translate(0, je.a().h + je.o + gy.Z);
        var1.setClip(0, 0, main.GameGraphic.width, main.GameGraphic.height);
        int var2;
        if ((var2 = ho.i / this.l) < 0) {
            var2 = 0;
        }

        int var3;
        if ((var3 = var2 + (main.GameGraphic.height - 40) / this.l + 1) > c.size()) {
            var3 = c.size();
        }

        int var5;
        int var6;
        int var7;
        int var9;
        cy var11;
        Graphics var12;
        if (this.j == 5) {
            var5 = var3;
            var12 = var1;
            var11 = this;
            var6 = 0 + this.l * var2;

            for (var7 = var2; var7 < var5; ++var7) {
                var12.setClip(10 * gy.Y + 4 + gy.Y, 0, je.a().f - 8 - (gy.Y << 1), je.a().e - 5 - (je.o + 2 * gy.Z));
                var12.translate(0, -ho.i);
                bc var13 = (bc) c.elementAt(var7);
                int var8 = 0;
                if (!var11.o && var7 == var11.g) {
                    main.GameGraphic.S.c(var12, 10 * gy.Y + 3 + 2 * gy.Y, var6 + 2, main.GameGraphic.width - 20 * gy.Y - 6 - 4 * gy.Y, var11.l - 4);
                    if (var13.c > je.a().f - 40) {
                        var11.p += 2;
                        if (var11.p > var13.c - (je.a().f - 40)) {
                            var11.p = -20;
                        }
                    }

                    var8 = var11.p;
                    if (var11.p < 0) {
                        var8 = 0;
                    }
                }

                var9 = fxClass.c((short) var13.d).c + 4;
                fxClass.a(var12, var13.d, 10 * gy.Y + 10 + var9 / 2, var6 + var11.l / 2 - 12 * gy.Y + gy.ah / 2, 3);
                main.GameGraphic.K.a(var12, var13.a, 10 * gy.Y + 10 + var9, var6 + var11.l / 2 - 12 * gy.Y, 0);
                main.GameGraphic.N.a(var12, var13.b, 10 * gy.Y + 10 - var8, var6 + var11.l / 2 + 3 * gy.Y, 0);
                var6 += var11.l;
                var12.translate(0, ho.i);
            }
        } else if (this.j == 6 || this.j == 0) {
            var5 = var3;
            var12 = var1;
            var11 = this;
            var7 = 0;
            var6 = 0 + this.l * var2;

            for (int var4 = var2; var4 < var5; ++var4) {
                var12.setClip(10 * gy.Y + 4, 0, je.a().f - 8, je.a().e - 5 - (je.o + 2 * gy.Z));
                var12.translate(0, -ho.i);
                hn var14 = (hn) c.elementAt(var4);
                var9 = 0;
                int var10;
                if (!var11.o && var4 == var11.g) {
                    main.GameGraphic.S.c(var12, 10 * gy.Y + 3 + 2 * gy.Y, var6 + 2, main.GameGraphic.width - 20 * gy.Y - 6 - 4 * gy.Y, var11.l - 4);
                    int var10000 = var10 = main.GameGraphic.N.a(var14.m);
                    int var10003 = gy.Y - 1;
                    if (var10000 > je.a().f - (57 + var10003 * 30)) {
                        var11.p += 2;
                        int var10004 = gy.Y - 1;
                        if (var11.p > var10 - (je.a().f - (57 + var10004 * 30))) {
                            var11.p = -20;
                        }
                    }

                    var9 = var11.p;
                    if (var11.p < 0) {
                        var9 = 0;
                    }
                }

                var14.a(var12, 10 * gy.Y + 25 + (gy.Y - 1) * 20, var6 + var11.l - 5 * gy.Y, false);
                var10 = 0;
                if (var14.X != -1) {
                    var10 = 6 * gy.Y;
                    fxClass.a(var12, var14.X, 60 + (gy.Y - 1) * 30 + var10, var6 + var11.l / 2 - 12 * gy.Y + gy.ah / 2, 3);
                }

                int var10001 = 60 + (gy.Y - 1) * 30;
                int var10005 = gy.Y - 1;
                var12.setClip(var10001, ho.i, je.a().f - (47 + var10005 * 30), je.a().e - 5 - (je.o + 2 * gy.Z));
                main.GameGraphic.K.a(var12, var14.x, 60 + (var10 << 1) + (gy.Y - 1) * 30, var6 + var11.l / 2 - 12 * gy.Y, 0);
                if (var14.aa != -1) {
                    fxClass.a(var12, var14.aa, 60 + 6 * gy.Y + (var10 << 1) + (gy.Y - 1) * 30 + main.GameGraphic.K.a(var14.x), var6 + var11.l / 2 - 12 * gy.Y + gy.ah / 2, 3);
                }

                if (var14.ab != -1) {
                    var7 = 12 * gy.Y;
                    fxClass.a(var12, var14.ab, 60 - var9 + (gy.Y - 1) * 30 + 6 * gy.Y, var6 + var11.l / 2 + 3 * gy.Y + gy.af / 2, 3);
                }

                main.GameGraphic.N.a(var12, var14.m, 60 - var9 + (gy.Y - 1) * 30 + var7, var6 + var11.l / 2 + 3 * gy.Y, 0);
                var6 += var11.l;
                var12.translate(0, ho.i);
            }
        }

        il.a().a(var1, main.GameGraphic.width - 10 * gy.Y - 9 - gy.Y, 0);
        main.GameGraphic.c(var1);
        if (jy.b) {
            jy.a(var1, super.ac, super.ad, super.ae);
        } else {
            super.a(var1);
        }
    }

    public final void l() {
        if (jy.b && main.GameGraphic.Z != 0) {
            main.GameGraphic.S.a(super.ac, super.ad, super.ae);
        } else {
            super.l();
        }
    }

    public final void k() {
        if (this.b != null) {
            this.b.k();
        }

        il.a().b(ho.i, ho.j);
    }

    private void a(int var1, Vector var2, hj var3) {
        if (main.GameGraphic.r != b()) {
            this.b = var3;
        }

        switch (this.j) {
            case 0:
                f = true;
                d = var2;
                if (e == 1) {
                    aeClass.getInstance();
                    aeClass.c(aeClass.h);
                } else if (e == 2) {
                    f = false;
                    main.GameGraphic.i();
                    iy.a().c((int) 1);
                } else if (main.GameGraphic.r != this) {
                    this.a();
                }

                e = 0;
            case 1:
            case 2:
            case 3:
            case 4:
        }

        c = null;
        c = var2;
        if (this.j != 5) {
            for (var1 = 0; var1 < c.size(); ++var1) {
                hn var4;
                (var4 = (hn) c.elementAt(var1)).i();
                var4.h();
            }
        }

        this.g = 0;
        super.ae = this.k;
        this.e();
    }

    public final void b(boolean var1) {
        this.j = 0;
        if (d == null) {
            main.GameGraphic.i();
            ie.a().d();
        } else {
            this.b = main.GameGraphic.r;
            this.a(h);
            if (main.GameGraphic.r != this) {
                this.a();
            }
        }

        if (var1) {
            this.m = true;
            this.q = new Button(StringEntity.CHOOSE, 4);
            if (main.GameGraphic.Z == 0) {
                super.ad = this.q;
            }
        }

    }

    public static hn b(int var0) {
        int var1 = d.size();

        for (int var2 = 0; var2 < var1; ++var2) {
            hn var3;
            if ((var3 = (hn) d.elementAt(var2)).w == var0) {
                return var3;
            }
        }

        return null;
    }

    public final boolean a(String var1) {
        byte[] var2 = (byte[]) i.get(var1);
        main.GameGraphic.h();
        if (var2 == null) {
            return false;
        } else {
            this.a(var2, var1);
            return true;
        }
    }

    public final void a(byte[] var1, String var2) {
        String[] var3 = null;
        byte[] var4 = null;
        ByteArrayInputStream var15 = new ByteArrayInputStream(var1);
        DataInputStream var16 = new DataInputStream(var15);

        try {
            String var5 = var16.readUTF();
            int var6 = var16.readInt();
            byte var7 = var16.readByte();
            byte var8 = var16.readByte();
            short var9 = var16.readShort();
            Vector var10 = new Vector();
            int var17;
            if (var7 == 0) {
                this.j = 5;

                for (var17 = 0; var17 < var9; ++var17) {
                    bc var11;
                    (var11 = new bc()).d = var16.readShort();
                    var11.a = var16.readUTF();
                    var11.b = var16.readUTF();
                    var11.c = main.GameGraphic.N.a(var11.b);
                    var10.addElement(var11);
                }
            } else {
                this.j = 6;

                for (var17 = 0; var17 < var9; ++var17) {
                    hn var18;
                    (var18 = new hn()).K = 0;
                    byte var12 = var16.readByte();
                    var18.e = new Vector();

                    for (int var13 = 0; var13 < var12; ++var13) {
                        var18.a(new hx(var16.readShort()));
                    }

                    var18.w = var16.readInt();
                    var18.X = var16.readShort();
                    if (var2.equals(h)) {
                        var18.aa = var16.readShort();
                        var18.ab = var16.readShort();
                    }

                    var18.x = var16.readUTF();
                    var18.m = var16.readUTF();
                    var10.addElement(var18);
                }
            }

            if ((var7 = var16.readByte()) > 0) {
                var3 = new String[var7];
                var4 = new byte[var7];

                for (int var19 = 0; var19 < var7; ++var19) {
                    var4[var19] = var16.readByte();
                    var3[var19] = var16.readUTF();
                }
            }

            if (var2.equals(h)) {
                this.j = 0;
            }

            b().a(this.j, var10, main.GameGraphic.r);
            this.n = var5;
            this.f();
            if (main.GameGraphic.r != this) {
                this.a();
            }

            super.ac = null;
            if (var7 > 0) {
                super.ac = new Button(StringEntity.MENU, new ia(this, var2, var3, var6, var8, var4));
            }

            if (!this.m) {
                if (var2.equals(h)) {
                    this.q = new Button(StringEntity.L, 0);
                    if (main.GameGraphic.Z == 0) {
                        super.ad = this.q;
                    }
                } else if (!this.m) {
                    this.q = new Button(StringEntity.CHOOSE, new hp(this, var6, var8));
                    if (main.GameGraphic.Z == 0) {
                        super.ad = this.q;
                    }
                }
            }

            this.m = false;
        } catch (IOException var14) {
            var14.printStackTrace();
        }
    }

    public final void a(int var1, int var2) {
        switch (var1) {
            case 0:
                if (this.g >= 0 && this.g < c.size()) {
                    hn var4 = (hn) c.elementAt(this.g);
                    hc.b().a(var4.w, var4.x);
                    hc.b().a(this.b);
                    return;
                }
                break;
            case 1:
                super.ad = null;
                super.ae = null;
                super.ac = null;
                c = null;
                main.GameGraphic.y.m = false;
                if (this.b != null) {
                    this.b.a();
                    return;
                }

                aeClass.getInstance().a();
                break;
            case 2:
                return;
            case 3:
                hn var3 = (hn) c.elementAt(b().g);
                iy.a().b(var3.w);
                main.GameGraphic.i();
                return;
            case 4:
                main.GameGraphic.i();
                go.getInstance().b(((hn) d.elementAt(this.g)).w, true);
        }

    }

    public final void g() {
        this.q = new Button(StringEntity.CHOOSE, 3);
        if (main.GameGraphic.Z == 0) {
            super.ad = this.q;
        }

    }

    public final void d(int var1, int var2) {
        switch (var1) {
            case 50:
                ie.a().d();
            default:
        }
    }

    public static void h() {
        i.remove(h);
        d = null;
    }

    static boolean a(cy var0) {
        return var0.m;
    }
}
