package avatar;

import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.util.Vector;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import main.GameMidlet;

public final class ei extends hj implements cq {

    public static ei a;
    private int h;
    private int i;
    private int j = -1;
    private Button k;
    private Button l;
    private Button m;
    private static short n = 0;
    public static boolean b = false;
    private Vector o;
    public byte c = -1;
    private int p = -1;
    public int d = -1;
    private int q;
    public static boolean e = false;
    private he[] r;
    private dr s;
    private dr t;
    private ah u;
    private Image v;
    private int w = -1;
    private int x = -1;
    private int[] y = new int[]{1688583, 14744065};
    public int f;
    public int g;
    private short z = 69;
    private short A = 68;
    private short[] B;
    private int C = 0;
    private Vector D;
    private Vector E;
    private int F;
    private byte G;

    public static ei b() {
        if (a == null) {
            a = new ei();
        }

        return a;
    }

    public final void a() {
        super.a();
        this.i();
    }

    public ei() {
        this.k = new Button(StringEntity.cS, 0);
        this.l = new Button(StringEntity.DONE, 1);
        this.m = new Button(StringEntity.MENU, 2);
        ImageModel.b(StringEntity.EFFECT_AV);
        this.v = ImageModel.getImageFromIndex("hand");
        ImageModel.cleanUp();
    }

    private void i() {
        if (this.q == GameMidlet.i.w) {
            super.ad = aeClass.getInstance().e;
            super.ad.text = StringEntity.CHOOSE;
            super.ac = this.m;
        } else {
            super.ac = this.m;
            if (main.GameGraphic.Z == 0) {
                super.ad = aeClass.getInstance().e;
            }

        }
    }

    private void j() {
        ir.b(GameMidlet.i);
        GameMidlet.i.aw = this.t.a;
        GameMidlet.i.ax = this.t.b;
        GameMidlet.i.H = 0;
        do1.a().a(this.t.a * gy.Y, this.t.b * gy.Y);
    }

    public final void d() {
        aeClass.getInstance().e();
    }

    private void m() {
        super.ad = new Button(StringEntity.CHOOSE, 3);
        super.ae = new Button(StringEntity.DONE, 4);
        super.ac = null;
        e = true;
        this.h = GameMidlet.i.aw / 24;
        this.i = GameMidlet.i.ax / 24;
        ir.c(GameMidlet.i);
    }

    private void n() {
        df.a();
        this.h = GameMidlet.i.aw / 24;
        this.i = GameMidlet.i.ax / 24;
        ir.c(GameMidlet.i);
    }

    private static void o() {
        Vector var0 = new Vector();

        for (int var1 = 0; var1 < ir.m.size(); ++var1) {
            gx var2;
            if ((var2 = (gx) ir.m.elementAt(var1)).az == 0 && var2.w != GameMidlet.i.w) {
                var0.addElement(new Button(var2.x, 16, var1));
            }
        }

        le.getInstance().a(var0, 0);
    }

    private void p() {
        this.n();
        if (this.B == null) {
            this.B = new short[ir.d.length];

            for (int var1 = 0; var1 < ir.d.length; ++var1) {
                this.B[var1] = ir.d[var1];
            }
        }

        b = false;
        super.ad = this.k;
        super.ae = this.l;
        super.ac = new Button(StringEntity.CHOOSE, 5);
        Vector var4 = new Vector();

        for (int var2 = 0; var2 < this.r.length; ++var2) {
            if (this.r[var2].b != -1 || this.r[var2].c != -1) {
                var4.addElement(new gl(this, this.r[var2].a + "(" + main.GameGraphic.a(this.r[var2].b, this.r[var2].c, true) + ")", 17, var2, var2));
            }
        }

        if (var4.size() > 0) {
            le.getInstance().a(var4, main.GameGraphic.o, 27 * gy.Y, 27 * gy.Y);
        }

    }

    private void q() {
        this.d = -1;
        this.j = -1;
        e = false;
        b = false;
        this.i();
        super.ae = null;
        if (ir.g(GameMidlet.i.w) == null) {
            this.j();
        }

    }

    private void r() {
        Vector var1 = new Vector();

        for (int var2 = 0; var2 < fxClass.e.size(); ++var2) {
            ag var3;
            int var4;
            if ((var3 = (ag) fxClass.e.elementAt(var2)).i != 0 && (this.c != 4 && (var3.i == 1 || var3.i == 2) || this.c == 4) && (var4 = var3.g.indexOf(":")) != -1) {
                boolean var5 = false;
                String var6 = var3.g.substring(0, var4);

                for (var4 = 0; var4 < var1.size(); ++var4) {
                    if (((Button) var1.elementAt(var4)).text.equals(var6)) {
                        var5 = true;
                    }
                }

                if (!var5 || var1.size() == 0) {
                    var1.addElement(new Button(var6, 18, var2));
                }
            }
        }

        le.getInstance().a(var1, 2);
    }

    private void b(String var1) {
        this.q();
        Vector var2 = new Vector();

        for (int var3 = 0; var3 < fxClass.e.size(); ++var3) {
            ag var4;
            int var5 = (var4 = (ag) fxClass.e.elementAt(var3)).g.indexOf(var1);
            if (var4.i != 0 && var5 != -1 && (this.c != 4 && (var4.i == 1 || var4.i == 2) || this.c == 4)) {
                String var8 = var4.g.substring(var4.g.indexOf(":") + 1);
                String var6 = main.GameGraphic.a(var4.h, var4.d, true);
                var2.addElement(new gk(this, "", new gi(this, var3, var1), var4, 90, var6, var8));
            }
        }

        if (var2.size() > 0) {
            le.getInstance().a(var2, main.GameGraphic.o, 90, 90);
            le.g = new gj(this);
        }

    }

    private boolean a(ag var1) {
        if (var1.i != 2 && var1.i != 4) {
            if (ir.g[this.i * ir.e + this.h] != 80) {
                main.GameGraphic.showAlert(StringEntity.db);
                return true;
            }

            for (int var5 = 0; var5 < var1.j.size(); ++var5) {
                dr var6 = (dr) var1.j.elementAt(var5);
                if (ir.g[(this.i + var6.b) * ir.e + this.h + var6.a] != 80) {
                    main.GameGraphic.showAlert(StringEntity.db);
                    return true;
                }
            }
        } else {
            String var2 = "";

            int var3;
            for (var3 = 0; var3 < this.o.size(); ++var3) {
                kq var4 = (kq) this.o.elementAt(var3);
                if (var3 != this.d && var4.b == var1.a && this.h == var4.aw / 24 && this.i == var4.ax / 24) {
                    var2 = StringEntity.dc;
                    break;
                }
            }

            if (!var2.equals("")) {
                main.GameGraphic.showAlert(var2);
                return true;
            }

            if (var1.i == 2 || var1.i == 4) {
                var3 = (this.i - 1) * ir.e + this.h;
                if (ir.d[var3] < n || ir.d[this.i * ir.e + this.h] >= n) {
                    main.GameGraphic.showAlert(StringEntity.dd);
                    return true;
                }
            }
        }

        return false;
    }

    public final void a(kq var1) {
        if (d(var1)) {
            ++var1.ax;
        }

        this.o.addElement(var1);
        ir.l.addElement(var1);
        this.c(var1);
        ir.a(ir.l);
    }

    public final void l() {
        super.l();
        if (!e) {
            main.GameGraphic.x.a();
            GameMidlet.i.e();
        } else {
            boolean var1 = false;
            if (main.GameGraphic.a(2)) {
                if (!b(this.h, this.i - 1)) {
                    --this.i;
                }

                if (this.i < 0) {
                    this.i = 0;
                }

                var1 = true;
            } else if (main.GameGraphic.a(4)) {
                if (!b(this.h - 1, this.i)) {
                    --this.h;
                }

                if (this.h < 0) {
                    this.h = 0;
                }

                var1 = true;
                GameMidlet.i.K = gx.J;
            } else if (main.GameGraphic.a(6)) {
                if (!b(this.h + 1, this.i)) {
                    ++this.h;
                }

                if (this.h >= ir.e) {
                    this.h = ir.e - 1;
                }

                var1 = true;
                GameMidlet.i.K = 0;
            } else if (main.GameGraphic.a(8)) {
                if (!b(this.h, this.i + 1)) {
                    ++this.i;
                }

                if (this.i >= ir.f) {
                    this.i = ir.f - 1;
                }

                var1 = true;
            }

            if (main.GameGraphic.f) {
                int var3 = (do1.a().a + main.GameGraphic.h) / (ir.i * gy.Y);
                int var2 = (do1.a().b + main.GameGraphic.i) / (ir.i * gy.Y);
                if (var3 == this.h && var2 == this.i && super.ad != null) {
                    super.ad.b();
                }

                this.h = var3;
                this.i = var2;
                var1 = true;
                main.GameGraphic.f = false;
            }

            if (var1) {
                GameMidlet.i.aw = this.h * 24 + 12;
                GameMidlet.i.ax = this.i * 24 + 12;
                if (this.d != -1 && this.o.size() > 0) {
                    kq var4;
                    (var4 = (kq) this.o.elementAt(this.d)).aw = this.h * 24;
                    var4.ax = this.i * 24;
                    ir.a(ir.l);
                }
            }

        }
    }

    private static boolean b(int var0, int var1) {
        return ir.d[var1 * ir.e + var0] == ir.c.c - 2 || ir.d[var1 * ir.e + var0] == -1;
    }

    public final void k() {
        aeClass.getInstance().k();
        if (!e && !b && super.ae == null && aeClass.getInstance().ae != null) {
            super.ae = ir.q;
        }

    }

    public final void a(Graphics var1) {
        this.b(var1);
        super.a(var1);
        main.GameGraphic.a(var1);
    }

    public final void b(Graphics var1) {
        main.GameGraphic.x.b(var1);
        if (e && main.GameGraphic.t == null) {
            Graphics var3 = var1;
            ei var2 = this;
            int var6;
            if (!b && this.d == -1) {
                if (this.j != -1) {
                    var6 = 0;

                    while (true) {
                        if (var6 >= ir.g.length) {
                            ir.c.a(var2.j, var2.h * 24 * gy.Y, var2.i * 24 * gy.Y, 0, 0, var3);
                            break;
                        }

                        if (var2.p == 0 && ir.d[var6] >= n && ir.d[var6] < var2.r.length && (var2.r[ir.d[var6]].c != -1 || var2.r[ir.d[var6]].b != -1) || var2.p == 1 && ir.d[var6] < n) {
                            var2.a(var3, 2 + var6 % ir.e * 24, 2 + var6 / ir.e * 24, 0, 20);
                        }

                        ++var6;
                    }
                }
            } else if (this.j != -1) {
                ag var4;
                if ((var4 = (ag) fxClass.e.elementAt(this.j)).i != 2 && var4.i != 4) {
                    for (var6 = 0; var6 < ir.g.length; ++var6) {
                        if (ir.g[var6] == 80 && (var6 % ir.e != var2.h || var6 / ir.e != var2.i)) {
                            var2.a(var3, 2 + var6 % ir.e * 24, 2 + var6 / ir.e * 24, 0, 20);
                        }
                    }
                } else {
                    for (var6 = 0; var6 < ir.d.length; ++var6) {
                        if (var6 > 0 && ir.d[var6] < n && ir.d[var6 - ir.e] >= n) {
                            var2.a(var3, 2 + var6 % ir.e * 24, 2 + var6 / ir.e * 24, 0, 20);
                        }
                    }
                }
            }

            var2.a(var3, var2.h * 24, var2.i * 24, 1, 24);
        }

        main.GameGraphic.x.d(var1);
        if (e) {
            if (b && this.j != -1) {
                ag var5 = (ag) fxClass.e.elementAt(this.j);
                fxClass.a(var1, var5.b, (this.h * 24 + var5.e) * gy.Y, (this.i * 24 + var5.f) * gy.Y, 0);
            }

            if (main.GameGraphic.t == null) {
                var1.drawImage(this.v, (this.h * 24 + 12) * gy.Y, (this.i * 24 + this.C) * gy.Y, 33);
            }

            if (this.p != -1) {
                main.GameGraphic.L.a(var1, this.r[this.j].a + "(" + main.GameGraphic.a(this.r[this.j].b, this.r[this.j].c, true) + ")", (this.h * 24 + 12) * gy.Y, (this.i * 24 - 40) * gy.Y, 2);
            }

            ++this.C;
            if (this.C > 5) {
                this.C = 0;
            }
        }

        main.GameGraphic.c(var1);
        ir.a(var1);
    }

    private void a(Graphics var1, int var2, int var3, int var4, int var5) {
        var1.setColor(this.y[var4]);
        var1.drawRect(var2 * gy.Y, var3 * gy.Y, (var5 - 1) * gy.Y, (var5 - 1) * gy.Y);
    }

    public final void a(byte var1, int var2, short[] var3, byte var4, Vector var5, Vector var6) {
        this.c = var1;
        this.q = var2;
        this.o = var5;
        ir.e = var4;
        ir.f = (short) (var3.length / var4);
        ir.d = var3;
        if (this.c == 4) {
            main.GameGraphic.x.e(111);
        } else {
            main.GameGraphic.x.e(68 + this.c);
        }

        ir.t = -1;
        int var7 = -1;
        var2 = 0;

        int var9;
        int var15;
        for (var9 = 0; var9 < var4; ++var9) {
            for (var15 = 0; var15 < ir.f; ++var15) {
                if (ir.d[var15 * var4 + var9] < n) {
                    ir.g[var15 * var4 + var9] = 80;
                } else {
                    ir.g[var15 * var4 + var9] = 88;
                }
            }

            if (ir.d[(ir.f - 1) * var4 + var9] == this.u.e.getHeight() / (24 * gy.Y) - 1) {
                ir.d[(ir.f - 1) * var4 + var9] = ir.d[(ir.f - 2) * var4 + var9];
                ir.g[(ir.f - 1) * var4 + var9] = 21;
                ++var2;
                if (var7 == -1) {
                    var7 = var9 * 24;
                }
            }
        }

        this.t = new dr(var7 + var2 * 24 / 2, ir.f * 24 - 30);
        GameMidlet.i.aw = this.t.a;
        GameMidlet.i.ax = this.t.b;
        gr var12;
        if ((var12 = ir.h(GameMidlet.i.w)) != null) {
            var12.a(GameMidlet.i.aw, GameMidlet.i.ax);
            var12.h();
        }

        do1.a().b(70 + this.c);
        ir.c = new ht(this.u.e, 24 * gy.Y, 24 * gy.Y);

        for (var15 = 0; var15 < var6.size(); ++var15) {
            hn var8;
            (var8 = (hn) var6.elementAt(var15)).C = var8.aw;
            var8.D = var8.ax;
            if (var8.w != GameMidlet.i.w) {
                ir.b(var8);
            }
        }

        var15 = 0;
        var7 = 0;

        for (var2 = 0; var2 < this.o.size(); ++var2) {
            kq var13;
            if ((var13 = (kq) this.o.elementAt(var2)).aw == 0 && var13.ax == 0) {
                boolean var14 = false;

                for (int var17 = 0; var17 < ir.d.length; ++var17) {
                    if (ir.g[var17] == 80) {
                        var13.aw = var17 % ir.e * 24;
                        var13.ax = var17 / ir.e * 24;
                        var15 = var13.aw;
                        var7 = var13.ax;
                        var14 = true;
                        this.c(var13);
                        iy.a().a(var13.b, 0, 0, var13.aw / 24, var13.ax / 24, var13.c);
                        break;
                    }
                }

                if (!var14) {
                    var13.aw = var15;
                    var13.ax = var7;
                    iy.a().a(var13.b, 0, 0, var13.aw / 24, var13.ax / 24, var13.c);
                }
            }

            if (d(var13)) {
                ++var13.ax;
            }
        }

        aeClass.getInstance().n();
        Vector var11 = this.o;
        ei var10 = this;

        for (var9 = 0; var9 < var11.size(); ++var9) {
            kq var16 = (kq) var11.elementAt(var9);
            ir.l.addElement(var16);
            var10.c(var16);
        }

        ir.a(ir.l);
        this.a();
        main.GameGraphic.h();
    }

    private static boolean d(kq var0) {
        if (fxClass.b((int) var0.b).i != 2 && fxClass.b((int) var0.b).i != 4) {
            int var1 = (var0.ax / 24 - 1) * ir.e + var0.aw / 24;
            if (ir.d[var1] >= n && ir.d[var0.ax / 24 * ir.e + var0.aw / 24] < n) {
                return true;
            }
        }

        return false;
    }

    private ah s() {
        DataInputStream var1;
        if ((var1 = fxClass.a("avatarTileMap")) == null) {
            return null;
        } else {
            this.u = new ah();
            try {
                this.u.b = var1.readShort();
                n = var1.readShort();
                byte[] var2 = new byte[var1.available()];
                var1.read(var2);
                this.u.e = awClass.a(var2);
                var1.close();
            } catch (Exception var3) {
                var3.printStackTrace();
            }

            return this.u;
        }
    }

    public final void a(byte[] var1, int var2) {
        n = (short) var2;
        this.u.e = awClass.a(var1);
        ByteArrayOutputStream var3 = new ByteArrayOutputStream();
        DataOutputStream var4 = new DataOutputStream(var3);

        try {
            var4.writeShort(this.u.b);
            var4.writeShort(var2);
            var4.write(var1);
            awClass.addRecord("avatarTileMap", var3.toByteArray());
            var4.close();
        } catch (Exception var5) {
            var5.printStackTrace();
        }

        if (aeClass.v != -1) {
            iy.a().b(aeClass.v);
            aeClass.v = -1;
        } else {
            main.GameGraphic.h();
        }
    }

    public final void a(int var1, int var2) {
        int var3;
        Vector var7;
        switch (var1) {
            case 0:
                if (this.j != -1) {
                    var2 = this.i * ir.e + this.h;
                    if (this.r[ir.d[var2]].c == -1 && this.r[ir.d[var2]].b == -1) {
                        main.GameGraphic.showAlert(StringEntity.db);
                        break;
                    }

                    if (this.j < n && ir.d[var2] >= n || this.j >= n && ir.d[var2] < n) {
                        main.GameGraphic.showAlert(StringEntity.db);
                        break;
                    }

                    this.w = this.h;
                    this.x = this.i;
                    ir.d[this.i * ir.e + this.h] = (short) this.j;
                }

                return;
            case 1:
                this.j = -1;
                this.p = -1;
                this.w = -1;
                this.x = -1;
                boolean var6 = false;

                for (var2 = 0; var2 < this.B.length; ++var2) {
                    if (this.B[var2] != ir.d[var2]) {
                        var6 = true;
                        break;
                    }
                }

                if (var6) {
                    iy.a().a(ir.d, 0);
                    main.GameGraphic.i();
                }

                this.j();
                e = false;
                this.i();
                super.ae = null;
                return;
            case 2:
                var7 = new Vector();
                if (this.q == GameMidlet.i.w) {
                    var7.addElement(new Button(StringEntity.co, 1));
                    var7.addElement(new Button(StringEntity.cT, 2));
                    var1 = 0;

                    for (var3 = 0; var3 < ir.m.size(); ++var3) {
                        if (((js) ir.m.elementAt(var3)).az == 0) {
                            ++var1;
                        }
                    }

                    if (var1 > 1) {
                        var7.addElement(new Button(StringEntity.v, 3));
                    }

                    var7.addElement(new Button(StringEntity.t, 4));
                }

                var7.addElement(new Button(StringEntity.EXIT, 5));
                le.getInstance().a(var7, 0);
                return;
            case 3:
                (var7 = new Vector()).addElement(new Button(StringEntity.cY, 11));
                var7.addElement(new Button(StringEntity.cZ, 12));
                var7.addElement(new Button(StringEntity.bg, 13));
                le.getInstance().a(var7, 2);
                le var10000 = le.getInstance();
                int var10001 = this.h * 24 * gy.Y - do1.a().a - le.getInstance().c / 2 + 12;
                int var4 = this.i * 24 * gy.Y - do1.a().b - le.getInstance().d - 12;
                var3 = var10001;
                le var5 = var10000;
                var10000.a = var3;
                var5.b = var4;
                if (var5.a < 0) {
                    var5.a = 0;
                }

                if (var5.b < 0) {
                    var5.b = 0;
                }

                return;
            case 4:
                this.q();
                return;
            case 5:
                this.p();
                return;
            case 8:
                hi.b();
                main.GameGraphic.A = null;
                return;
            case 50:
                iy.a().a(ir.d, 1);
                main.GameGraphic.i();
                return;
            case 51:
                ir.d = this.B;
                this.B = null;
                eo.a();
                return;
            case 53:
                cx.getInstance().i(0);
                main.GameGraphic.i();
                return;
            case 100:
                iy.a().a(main.GameGraphic.u.a(), 0, 0);
                main.GameGraphic.h();
                return;
            case 101:
                cx.getInstance().a(main.GameGraphic.u.a(), (byte) 0);
        }

    }

    public final void a(short var1, String var2) {
        main.GameGraphic.h();
        if (var1 == 0) {
            Vector var3;
            (var3 = new Vector()).addElement(new Button(StringEntity.YES, 50));
            var3.addElement(new Button(StringEntity.NO, 51));
            main.GameGraphic.a(var2, var3);
        } else {
            main.GameGraphic.showAlert(var2);
            if (var1 == 2) {
                ir.d = this.B;
            }

            this.B = null;
            eo.a();
            GameMidlet.i.aw = this.t.a;
            GameMidlet.i.ax = this.t.b;
            super.ad = aeClass.getInstance().e;
            do1.a().b(70 + this.c);
        }
    }

    public final void a(he[] var1) {
        this.r = var1;
        this.p();
        main.GameGraphic.h();
    }

    private void e(kq var1) {
        int var2 = 0;

        for (int var3 = 0; var3 < this.o.size(); ++var3) {
            kq var4;
            if ((var4 = (kq) this.o.elementAt(var3)).aw / 24 == var1.aw / 24 && var4.ax / 24 == var1.ax / 24) {
                ++var2;
            }
        }

        if (var2 == 1) {
            ag var6 = fxClass.b((int) var1.b);

            for (int var7 = 0; var7 < var6.j.size(); ++var7) {
                dr var5 = (dr) var6.j.elementAt(var7);
                ir.g[(var1.ax / 24 + var5.b) * ir.e + var1.aw / 24 + var5.a] = 80;
            }
        }

    }

    public final void b(kq var1) {
        kq var2 = var1;
        ei var5 = this;
        int var3 = 0;

        kq var10000;
        while (true) {
            if (var3 >= var5.o.size()) {
                var10000 = null;
                break;
            }

            kq var4;
            if ((var4 = (kq) var5.o.elementAt(var3)).aw / 24 == var2.aw && var4.ax / 24 == var2.ax && var4.b == var2.b) {
                var10000 = var4;
                break;
            }

            ++var3;
        }

        var1 = var10000;
        ir.l.removeElement(var1);
        this.o.removeElement(var1);
        this.e(var1);
        eo.a();
        main.GameGraphic.h();
    }

    public final void c(kq var1) {
        ag var2 = fxClass.b((int) var1.b);
        byte var3 = 88;
        if (var2.a == this.A) {
            var3 = 112;
        } else if (var2.a == this.z) {
            var3 = 111;
        } else if (var2.c == 1) {
            var3 = 79;
        } else if (var2.c == 2) {
            var3 = 67;
        }

        for (int var4 = 0; var4 < var2.j.size(); ++var4) {
            dr var5 = (dr) var2.j.elementAt(var4);
            ir.g[(var1.ax / 24 + var5.b) * ir.e + var1.aw / 24 + var5.a] = var3;
        }

    }

    public final void a(int var1, int var2, short var3, Vector var4) {
        if (var1 != 0) {
            for (var1 = 0; var1 < var4.size(); ++var1) {
                hn var6;
                hn var7 = cy.b((var6 = (hn) var4.elementAt(var1)).w);
                if (var6 != null && var7 != null) {
                    var7.q = var6.q;
                }
            }

            main.GameGraphic.h();
            this.e();
        } else {
            GameMidlet.i.q = (byte) var2;
            aeClass.getInstance().a();
            boolean var10000;
            if (this.u == null) {
                this.s();
                if (this.u != null && var3 == this.u.b) {
                    var10000 = true;
                } else {
                    if (this.u == null) {
                        this.u = new ah();
                        this.u.b = var3;
                    }

                    iy var5 = iy.a();
                    var5.e((byte) -73);
                    var5.k();
                    var10000 = false;
                }
            } else {
                var10000 = true;
            }

            if (var10000) {
                if (aeClass.v != -1) {
                    iy.a().b(aeClass.v);
                    aeClass.v = -1;
                } else {
                    main.GameGraphic.J = 1;
                    main.GameGraphic.h();
                }
            } else {
                main.GameGraphic.J = 1;
            }
        }
    }

    public final void d(int var1) {
        im.d().a(var1, this);
        super.d(var1);
    }

    public final void a(String var1) {
        if (!var1.trim().equals("")) {
            bf.a().a(var1);
        }
    }

    public final void e() {
        if (cy.d == null) {
            main.GameGraphic.i();
            ie.a().d();
            cy.e = 2;
        } else if (cy.f) {
            cy.f = false;
            main.GameGraphic.i();
            iy.a().c((int) 1);
        } else {
            Vector var1 = new Vector();

            for (int var2 = 0; var2 < cy.d.size(); ++var2) {
                hn var3;
                if ((var3 = (hn) cy.d.elementAt(var2)).q == this.c) {
                    var1.addElement(var3);
                }
            }

            if (var1.size() == 0) {
                if (main.GameGraphic.r == cy.b()) {
                    cy.b().b.a();
                }

                main.GameGraphic.showAlert(StringEntity.de);
            } else {
                cy.b().a();
                cy.c = var1;
                cy.b().e();
                cy.b().g();
            }
        }
    }

    public final void d(int var1, int var2) {
        int var3 = -1;

        int var4;
        kq var5;
        for (var4 = 0; var4 < this.o.size(); ++var4) {
            if ((var5 = (kq) this.o.elementAt(var4)).aw / 24 == this.h && var5.ax / 24 == this.i) {
                var3 = var4;
                break;
            }
        }

        var5 = null;
        if (var3 != -1) {
            var5 = (kq) this.o.elementAt(var3);
        }

        var5 = var5;
        switch (var1) {
            case 1:
                cx var11;
                (var11 = cx.getInstance()).e((byte) -87);
                var11.k();
                return;
            case 2:
                Vector var10;
                (var10 = new Vector()).addElement(new Button(StringEntity.cU, 6));
                var10.addElement(new Button(StringEntity.cV, 7));
                if (this.o.size() > 0) {
                    var10.addElement(new Button(StringEntity.cW, 8));
                }

                le.getInstance().a(var10, 2);
                return;
            case 3:
                o();
                return;
            case 4:
                main.GameGraphic.u.a(StringEntity.bO + ":", 100, 2);
                return;
            case 5:
                aeClass.getInstance().e();
                return;
            case 6:
                this.r();
                return;
            case 7:
                e = true;
                if (this.r == null) {
                    if (this.r == null) {
                        df.a();
                        iy var9 = iy.a();
                        var9.e((byte) -43);
                        var9.k();
                        main.GameGraphic.i();
                    }
                    return;
                }

                this.p();
                return;
            case 8:
                this.m();
                return;
            case 9:
            case 10:
            default:
                break;
            case 11:
                if (var3 == -1) {
                    main.GameGraphic.showAlert(StringEntity.cX);
                    return;
                }

                this.d = var3;

                for (var1 = 0; var1 < fxClass.e.size(); ++var1) {
                    if (((ag) fxClass.e.elementAt(var1)).a == var5.b) {
                        this.j = var1;
                        break;
                    }
                }

                super.ac = null;
                super.ae = null;
                this.e(var5);
                this.s = new dr(this.h, this.i, var5.b);
                super.ad = new Button(StringEntity.OK, new ga(this, var5));
                return;
            case 12:
                if (var3 == -1) {
                    main.GameGraphic.showAlert(StringEntity.cX);
                    return;
                }

                if (var5.c == 0) {
                    var5.c = 2;
                } else {
                    var5.c = 0;
                }

                iy.a().a(var5.b, this.h, this.i, this.h, this.i, var5.c);
                return;
            case 13:
                if (var3 != -1 && var5.b != this.z) {
                    main.GameGraphic.a(StringEntity.da, (Intent) (new fw(this, var5)));
                    return;
                }
                main.GameGraphic.showAlert(StringEntity.cX);
                return;
            case 14:
                dp.b().d();
                main.GameGraphic.b(StringEntity.cK, 53);
                return;
            case 15:
                KeyboardManager[] var7 = new KeyboardManager[3];

                for (var2 = 0; var2 < 3; ++var2) {
                    var7[var2] = new KeyboardManager();
                    var7[var2].d(2);
                }

                var7[0].a(true);
                Button var8 = new Button(StringEntity.DONE, new gg(this, var7));
                dp.b().d();
                hi.b().a(var7, StringEntity.CHANGE_PASSWORD, StringEntity.PASSWORD_TEXTS, var8);
                main.GameGraphic.A = hi.b();
                hi.b().ac = new Button(StringEntity.CLOSE, 8);
                return;
            case 16:
                if (var2 < ir.m.size()) {
                    gx var6 = (gx) ir.m.elementAt(var2);
                    iy.a().d(var6.w);
                }
                break;
            case 17:
                for (var1 = 0; var1 < this.r.length; ++var1) {
                    if (var1 == var2) {
                        if (this.w != -1) {
                            this.h = this.w;
                            this.i = this.x;
                            GameMidlet.i.aw = this.w * 24;
                            GameMidlet.i.ax = this.x * 24;
                            do1.a().a(GameMidlet.i.aw * gy.Y, GameMidlet.i.ax * gy.Y);
                        }

                        this.j = var1;
                        if (this.j < n) {
                            this.p = 1;
                        } else {
                            this.p = 0;
                        }
                    }
                }

                return;
            case 18:
                for (var1 = 0; var1 < fxClass.e.size(); ++var1) {
                    ag var12;
                    if (var1 == var2 && (var12 = (ag) fxClass.e.elementAt(var1)).i != 0 && (this.c != 4 && (var12.i == 1 || var12.i == 2) || this.c == 4) && (var4 = var12.g.indexOf(":")) != -1) {
                        String var13 = var12.g.substring(0, var4);
                        this.b(var13);
                    }
                }
        }

    }

    public final void f() {
        this.D = null;
        this.E = null;
        bf.a().doJoinPark(21, 0);
        ir.t = -1;
    }

    public final void a(Vector var1, Vector var2, int var3, byte var4) {
        this.E = var1;
        this.D = var2;
        this.F = var3;
        this.G = var4;
        Vector var7 = aeClass.getInstance().a(var1, GameMidlet.i.w, 3);
        var2 = aeClass.getInstance().a(var2, GameMidlet.i.w, 2);
        if (main.GameGraphic.r != cd.a) {
            dp.b().m = true;
            dp.b().a(new String[]{StringEntity.by, StringEntity.co}, new Vector[]{var7, var2}, (Vector) null);
            Button var5 = aeClass.getInstance().a(var1, 1, 1, false);
            Button var6 = new Button(StringEntity.MENU, new dd(this));
            dp.b().a(var5, 0);
            dp.b().a(var6, 1);
            if (main.GameGraphic.r != dp.b()) {
                dp.b().a();
            }

        }
    }

    public static void g() {
        main.GameGraphic.u.a(StringEntity.bO, 101, 2);
    }

    public final void a(boolean var1, String var2) {
        if (!var1) {
            main.GameGraphic.showAlert(var2);
        } else {
            int var3 = dp.g;
            int var5 = dp.j;
            hx var4;
            if (var3 == 0) {
                var4 = (hx) this.E.elementAt(var5);
                this.D.addElement(var4);
                this.E.removeElement(var4);
            } else {
                var4 = (hx) this.D.elementAt(var5);
                this.E.addElement(var4);
                this.D.removeElement(var4);
            }

            this.h();
            main.GameGraphic.h();
        }
    }

    public final void h() {
        int var1 = dp.g;
        int var2 = dp.j;
        dp.b().d();
        this.a(this.E, this.D, this.F, this.G);
        dp.g = var1;
        dp.b().i();
        if (var2 >= dp.b().h[var1].size()) {
            var2 = 0;
        }

        dp.j = var2;
        dp.b().m();
        main.GameGraphic.y.a(dp.j);
    }

    public final void a(byte var1, String var2, String[] var3, short[] var4, short[] var5, String[] var6, String[] var7, int[] var8, short[] var9) {
        aeClass.getInstance();
        aeClass.d(GameMidlet.i);
        Vector var10 = new Vector();

        for (int var11 = 0; var11 < var3.length; ++var11) {
            var10.addElement(new id(this, StringEntity.CHOOSE, new cg(this, var1, var5[var11], var7[var11]), var11, var3[var11], var4[var11], var5[var11], var6[var11], var8 == null ? -1 : var8[var11], var7[var11], var9[var11]));
        }

        if (var10.size() > 0) {
            dp.b().a();
            dp.o = true;
            dp.b().a(new String[]{var2}, new Vector[]{var10}, (Vector) null);
        }

    }

    static void a(ei var0) {
        var0.n();
    }

    static int b(ei var0) {
        return var0.w;
    }

    static void a(ei var0, int var1) {
        var0.h = var1;
    }

    static int c(ei var0) {
        return var0.x;
    }

    static void b(ei var0, int var1) {
        var0.i = var1;
    }

    static void c(ei var0, int var1) {
        var0.j = var1;
    }

    static int d(ei var0) {
        return var0.h;
    }

    static void d(ei var0, int var1) {
        var0.w = var1;
    }

    static int e(ei var0) {
        return var0.i;
    }

    static void e(ei var0, int var1) {
        var0.x = var1;
    }

    static void a(ei var0, int var1, String var2) {
        ag var3 = (ag) fxClass.e.elementAt(var1);
        if (!var0.a(var3)) {
            main.GameGraphic.a(var3.h, var3.d, new cr(var0, var3, var2), new co(var0, var3, var2), new de(var0));
        }

    }

    static void f(ei var0) {
        var0.r();
    }

    static boolean a(ei var0, ag var1) {
        return var0.a(var1);
    }

    static dr g(ei var0) {
        return var0.s;
    }

    static boolean a(ei var0, kq var1) {
        return d(var1);
    }

    static void h(ei var0) {
        var0.m();
    }

    static void a(ei var0, String var1) {
        var0.b(var1);
    }

    static void i(ei var0) {
        var0.q();
    }
}
