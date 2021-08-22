package avatar;

import java.util.Vector;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import main.GameMidlet;

public final class kv extends hj {

    private static kv c;
    private Button d;
    private Button e;
    private Button f;
    public Image a;
    public ht b;
    private db g = new db();
    private int h;
    private int i;
    private int j;
    private Image[] k;
    private int l = 0;
    private byte[] m;
    private long n;
    private short o;
    private int p;
    private int q;
    private int r;

    public static kv b() {
        return c == null ? (c = new kv()) : c;
    }

    public final void a(int var1, int var2) {
        switch (var1) {
            case 0:
                if (GameMidlet.i.H != 2 && GameMidlet.i.H != 13) {
                    aeClass.getInstance().a();
                }

                bf var3;
                (var3 = bf.a()).e((byte) 82);
                var3.k();
                main.GameGraphic.i();
                super.ad = null;
                return;
            case 1:
                bf.a().b();
                main.GameGraphic.i();
                return;
            case 2:
                this.e();
                bf.a().b();
            default:
        }
    }

    public kv() {
        this.d = new Button(StringEntity.cz, 0);
        this.f = new Button(StringEntity.DONE, 1);
        this.e = new Button(StringEntity.CLOSE, 2);
        super.ad = this.d;
        ImageModel.b(StringEntity.EFFECT_AV);
        this.a = ImageModel.getImageFromIndex("cucphao");
        this.b = ht.a("ca", 14 * gy.Y, 14 * gy.Y);
        ImageModel.cleanUp();
        this.j = 530;
    }

    private void e() {
        GameMidlet.i.f();
        hn var10000;
        if (GameMidlet.i.K == 0) {
            var10000 = GameMidlet.i;
            var10000.aw -= 18;
        } else {
            var10000 = GameMidlet.i;
            var10000.aw += 18;
        }

        var10000 = GameMidlet.i;
        var10000.ax -= 10;
        do1.a(main.GameGraphic.width / 10);
        aeClass.l.removeElement(this.g);
        aeClass.getInstance().a();
    }

    public final boolean b(int var1, int var2) {
        this.r = main.GameGraphic.height - main.GameGraphic.height / 4;
        if (this.r > main.GameGraphic.height - 70 * gy.Y) {
            this.r = main.GameGraphic.height - 70 * gy.Y;
        }

        this.q = 60;
        if (this.q < (main.GameGraphic.width - ir.e * 24) / 2 + 50 * gy.Y) {
            this.q = (main.GameGraphic.width - ir.e * 24) / 2 + 50 * gy.Y;
        }

        this.l = 0;
        int var3 = ir.d(var1, var2);
        if (ir.d[var3 + 1] != 100 && ir.d[var3 + 1] != 16 && ir.d[var3 + 1] != 13) {
            GameMidlet.i.K = gx.J;
        } else {
            GameMidlet.i.K = 0;
            this.q = main.GameGraphic.width - this.q;
        }

        GameMidlet.i.e(var1, var2);
        bf var4;
        (var4 = bf.a()).e((byte) 86);
        var4.k();
        main.GameGraphic.i();
        super.ae = this.e;
        main.GameGraphic.f();
        return true;
    }

    public final void k() {
        aeClass.getInstance().k();
        if (this.g.i && !this.g.j) {
            if (this.l < this.m.length && System.currentTimeMillis() - this.n > (long) this.o) {
                this.f(0);
            }

            if (GameMidlet.i.H == 2) {
                --this.p;
                if (this.p < 0) {
                    this.p = 0;
                    this.g.a(1);
                }
            }
        }

    }

    public final void d(int var1) {
        if (this.g.i && !this.g.j) {
            switch (var1) {
                case 50:
                case 52:
                case 54:
                case 56:
                    main.GameGraphic.b[var1 - 48] = true;
                case 51:
                case 53:
                case 55:
                default:
            }
        } else {
            aeClass.getInstance().d(var1);
        }
    }

    public final void l() {
        if (this.g.i && !this.g.j) {
            if (main.GameGraphic.a(2)) {
                this.f(2);
            } else if (main.GameGraphic.a(4)) {
                this.f(1);
            } else if (main.GameGraphic.a(6)) {
                this.f(3);
            } else if (main.GameGraphic.a(8)) {
                this.f(4);
            }
        }

        super.l();
    }

    private void f(int var1) {
        this.n = System.currentTimeMillis();
        if (this.l < this.m.length) {
            this.m[this.l] = (byte) var1;
        }

        ++this.l;
        if (GameMidlet.i.H != 2) {
            this.g.a(0);
            this.p = 2;
        }

        if (this.l >= this.m.length) {
            this.g.a(0);
            this.g.j = true;
            bf.a().a(true, this.m);
            main.GameGraphic.i();
        }

    }

    public final void a(Graphics var1) {
        aeClass.getInstance().b(var1);
        if (this.g.i && !this.g.j && this.o != -1) {
            main.GameGraphic.c(var1);
            var1.translate(-do1.a().a, -do1.a().b);
            var1.setColor(8575990);
            if (this.k != null && this.l < this.k.length) {
                if (System.currentTimeMillis() - this.n > 50L) {
                    var1.setColor(1423411);
                } else {
                    var1.setColor(15612731);
                }

                var1.fillRoundRect(this.h - 1, this.i * gy.Y - 1, this.k[this.l].getWidth() + 2, this.k[this.l].getHeight() + 2, 5, 5);
                var1.drawImage(this.k[this.l], this.h, this.i * gy.Y, 0);
            }
        }

        super.a(var1);
    }

    public final void b(int var1) {
        hn var4;
        if ((var4 = ir.g(var1)) != null) {
            db var3;
            if ((var3 = c(var4.w)) != null) {
                aeClass.l.removeElement(var3);
            }

            var3 = new db();
            if (var4.w == GameMidlet.i.w) {
                main.GameGraphic.h();
                this.g = var3;
            } else {
                var3 = new db();
            }

            aeClass.l.addElement(var3);
            if (var4.H != 2) {
                if (var4.w != GameMidlet.i.w) {
                    var3.b = var4;
                    var3.k = true;
                }

                return;
            }

            var3.a(var4);
        }

    }

    public final void a(int var1, int var2, short var3, byte[][] var4) {
        db var5;
        if ((var5 = c(var1)) != null && var5.f != 0) {
            if (var5.b.H != 13 && var5.b.H != 2 || var5.i) {
                return;
            }

            var5.i = true;
            var5.a(0);
            var5.b.H = 2;
            var5.h = var2;
            if (var3 != -1) {
                main.GameGraphic.a(StringEntity.cA, var5.b.aw, var5.b.ax - 60, -1, 1, -1);
            }

            if (var1 == GameMidlet.i.w) {
                this.n = System.currentTimeMillis();
                this.l = 0;
                this.p = 2;
                this.k = new Image[var4.length];
                this.m = new byte[var4.length];

                for (var1 = 0; var1 < this.k.length; ++var1) {
                    this.k[var1] = awClass.a(var4[var1]);
                }

                this.o = var3;
                this.h = this.g.d[this.g.a - 2].a;
                this.i = this.g.d[this.g.a - 2].b - 30;
                if (var3 == -1) {
                    this.f(0);
                }
            }
        }

    }

    public final void c(int var1, int var2) {
        db var3;
        if ((var3 = c(var1)) != null) {
            if (var3.b.H != 2 && var3.b.H != 13) {
                aeClass.l.removeElement(var3);
                return;
            }

            if (var2 < 0) {
                main.GameGraphic.a(StringEntity.cB, var3.b.aw, var3.b.ax - 60, -1, 1, -1);
            }

            var3.h = var2;
            var3.j = true;
            var3.a(0);
            if (var3.b.w == GameMidlet.i.w) {
                super.ae = this.f;
                main.GameGraphic.h();
            }
        }

    }

    public static db c(int var0) {
        for (int var1 = 0; var1 < aeClass.l.size(); ++var1) {
            db var2;
            if ((var2 = (db) aeClass.l.elementAt(var1)).b.w == var0) {
                return var2;
            }
        }

        return null;
    }

    public final void e(int var1) {
        db var2 = c(var1);
        if (var1 == GameMidlet.i.w) {
            super.ad = this.d;
            super.ae = this.e;
            main.GameGraphic.h();
        }

        if (var2 != null) {
            iw var3 = (iw) fxClass.a((short) var2.h);
            if (var2.h > 0 && var3 != null) {
                ke var4 = fxClass.a[var3.h];
                int var10001 = var4.c * gy.Y;
                int var10002 = var4.d * gy.Y;
                int var10003 = var4.e * gy.Y;
                Image var5 = Image.createImage(fxClass.a((int) var4.b).e, var10001, var10002, var10003, var4.f * gy.Y, 0);
                main.GameGraphic.a(1, var2.b.aw, var2.b.ax + var2.b.h - 50, -1, var5, -1);
            }

            aeClass.l.removeElement(var2);
        }

    }

    public final void a(boolean var1, String var2) {
        if (var1) {
            this.g.a();
            super.ad = this.d;
            this.a();
            do1.a(main.GameGraphic.width / 3);
            main.GameGraphic.h();
        } else {
            main.GameGraphic.b(var2, 0, this);
        }
    }

    public final void a(int var1) {
        switch (var1) {
            case 0:
                this.e();
            default:
        }
    }

    public static void e(int var0, int var1) {
        hn var3;
        if ((var3 = ir.g(var0)) != null && (var3.H == 2 || var3.H == 13)) {
            db var2 = new db();
            aeClass.l.addElement(var2);
            var2.a(var3);
            var2.b();
            var2.c[var2.a - 1].a = var3.aw + 70 + (gy.Y - 1) * 35 + awClass.e(25);
            var2.c[var2.a - 1].b = var3.ax;
            var2.f = 1;
            var2.g = -1;
            var2.a(1);
            if (var1 == 2) {
                var2.i = true;
                return;
            }

            if (var1 == 3) {
                var2.i = true;
                var2.j = true;
                var2.e = 2;
            }
        }

    }

    public final void d(int var1, int var2) {
    }

    public final void a(int var1, byte var2, byte var3, int var4, short var5) {
        hn var6;
        if ((var6 = ir.g(var1)) == null && cy.c != null) {
            for (int var7 = 0; var7 < cy.c.size(); ++var7) {
                hn var8;
                if ((var8 = (hn) cy.c.elementAt(var7)).w == var1) {
                    var6 = var8;
                }
            }
        }

        if (var6 != null) {
            Vector var9;
            (var9 = new Vector()).addElement(new jq(this, (String) null, 0, var6, var2, var3, var4, var5));
            dp.b().a(new String[]{StringEntity.cw}, new Vector[1], var9);
            dp.b().a();
        }
        main.GameGraphic.h();
    }
}
