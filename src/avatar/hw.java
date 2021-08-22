package avatar;

import java.util.Vector;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import main.GameMidlet;

public final class hw extends hj {

    private static hw a;
    private Image b;
    private Image c;
    private Image d;
    private Image e;
    private ht f;
    private int g;
    private int h;
    private int i;
    private int j;
    private int k;
    private int l;
    private int m;
    private dr n;
    private boolean o;
    private boolean p;
    private boolean q = false;
    private hj r;
    private short s;
    private Button t;
    private Button u;
    private Button v;
    private Vector w = new Vector();
    private long x = 0L;
    private boolean[] y;
    private Vector z;

    public static hw b() {
        return a == null ? (a = new hw()) : a;
    }

    public final void a(hj var1, short var2) {
        this.r = var1;
        this.s = var2;
        main.GameGraphic.d[5] = false;
        super.a();
    }

    public final void a(int var1, int var2) {
        switch (var1) {
            case 0:
                this.q = true;
                return;
            case 1:
                return;
            case 2:
                this.r.a();
                hw var3 = this;
                this.p = false;
                super.ad = this.t;

                for (var2 = 0; var2 < 3; ++var2) {
                    var3.y[var2] = false;
                }

                var3.z.removeAllElements();
                a(var3.w, GameMidlet.i, 0);
            default:
        }
    }

    public hw() {
        ImageModel.b(StringEntity.ax);
        this.b = ImageModel.getImageFromIndex("c");
        this.d = ImageModel.getImageFromIndex("sq");
        this.e = ImageModel.getImageFromIndex("q");
        this.f = ht.a("st", 11 * gy.Y, 11 * gy.Y);
        this.c = ImageModel.getImageFromIndex("cb");
        ImageModel.cleanUp();
        if (main.GameGraphic.width < 200) {
            this.g = 80;
        } else {
            this.g = 90;
        }

        this.n = new dr(main.GameGraphic.width, main.GameGraphic.p);
        this.i = 30;
        this.l = 360 / this.i;
        this.t = new Button(StringEntity.dv, 0);
        this.u = new Button(StringEntity.PLEASE_WAIT, 1);
        this.v = new Button(StringEntity.CLOSE, 2);
        super.ad = this.t;
        this.k = 90;
        this.y = new boolean[3];
        this.z = new Vector();
    }

    private static void a(Vector var0, hn var1, int var2) {
        for (int var3 = 0; var3 < var0.size(); ++var3) {
            jh var4 = (jh) var0.elementAt(var3);
            String var5 = "";
            switch (var4.b) {
                case 1:
                    ld var6 = fxClass.a(var4.a);
                    ke var7 = fxClass.a[var6.h];
                    main.GameGraphic.a(0, var1.aw, var1.ax - 50, -1, awClass.a(var7.c * gy.Y, var7.d * gy.Y, var7.e * gy.Y, var7.f * gy.Y, fxClass.a((int) var7.b).e), var2);
                    break;
                case 2:
                    var5 = "+" + var4.c + StringEntity.COIN;
                    var1.a(var1.a[0] + var4.c);
                    var2 += 20;
                    break;
                case 3:
                    var5 = "+" + var4.f + " xp";
                    var1.d(var1.n + var4.f);
                    var2 += 20;
                    break;
                case 4:
                    var5 = "+" + var4.g + StringEntity.TAEL;
                    int[] var10000 = var1.a;
                    var10000[2] += var4.g;
                    var2 += 20;
            }

            if (!var5.equals("")) {
                main.GameGraphic.a(var5, var1.aw, var1.ax - 50, -1, 1, var2);
            }
        }
    }

    public final void k() {
        this.r.k();
        int var1;
        int var2;
        if (this.j > 0) {
            this.h -= this.j;
            if (this.h < 0) {
                this.h += 7200;
            }

            if (this.j < 10) {
                if (this.h / 20 % 30 == 0) {
                    this.j = 0;
                }
            } else {
                --this.j;
            }

            if (main.GameGraphic.l % 8 == 4) {
                var1 = awClass.e(this.l);
                if ((var2 = this.h / 20 + var1 * this.i) > 360) {
                    var2 -= 360;
                }

                var2 = awClass.c(var2);
                var1 = this.g * awClass.b(var2) >> 10;
                var2 = -(this.g * awClass.a(var2)) >> 10;
                this.b(this.n.a + var1, this.n.b + var2);
            }
        } else if (this.o) {
            hw var6 = this;
            this.o = false;
            this.p = true;
            this.q = false;
            this.x = System.currentTimeMillis() / 100L;

            for (var2 = 0; var2 < var6.w.size(); ++var2) {
                jh var3 = (jh) var6.w.elementAt(var2);
                short var4;
                if (var2 == 0) {
                    var4 = 150;
                } else if (var2 == 1) {
                    var4 = 180;
                } else {
                    var4 = 210;
                }

                int var8 = awClass.c(var4);
                int var5 = var6.g * awClass.b(var8) >> 10;
                var8 = -(var6.g * awClass.a(var8)) >> 10;
                var3.d = var6.n.a + var5;
                var3.e = var6.n.b + var8;
            }
        }

        if (super.ad == this.u) {
            var1 = 0;

            for (var2 = 0; var2 < this.y.length; ++var2) {
                if (this.y[var2]) {
                    ++var1;
                }
            }

            if (var1 == 3) {
                super.ad = this.v;
            }
        }

        for (var1 = 0; var1 < this.z.size(); ++var1) {
            dn var7;
            dn var10000 = var7 = (dn) this.z.elementAt(var1);
            var10000.aw += var7.b;
            if (var7.b > 1 || var7.b < -1) {
                var7.b -= var7.b / awClass.f(var7.b);
            }

            var7.ax += var7.e;
            ++var7.e;
            ++var7.f;
            if (var7.f > 20) {
                this.z.removeElement(var7);
            }
        }

        if (this.p) {
            for (var1 = 0; var1 < this.w.size(); ++var1) {
                if (!this.y[var1] && System.currentTimeMillis() / 100L - this.x > (long) ((var1 + 1) * 5)) {
                    this.y[var1] = true;
                    jh var9 = (jh) this.w.elementAt(var1);
                    this.b(var9.d, var9.e);
                }
            }
        }

    }

    private void b(int var1, int var2) {
        for (int var3 = 0; var3 < 10; ++var3) {
            byte var4 = 1;
            if (var3 % 2 == 0) {
                var4 = -1;
            }

            dn var5;
            (var5 = new dn(var1, var2)).f = 0;
            var5.b = var4 * (awClass.e(80) / 10);
            var5.e = -awClass.e(70) / 10;
            this.z.addElement(var5);
        }

    }

    public final void l() {
        if (!this.p) {
            if (main.GameGraphic.S.d() == 1) {
                if (main.GameGraphic.e) {
                    main.GameGraphic.d[5] = true;
                }

                if (main.GameGraphic.f) {
                    main.GameGraphic.c[5] = true;
                }
            }

            if (main.GameGraphic.d[5] && !this.o && this.q) {
                if (this.k < 270) {
                    this.k += 3;
                }
            } else if (this.k > 90) {
                this.k -= 3;
            }

            if (main.GameGraphic.c[5]) {
                if (this.k > 90 && !this.o && this.q) {
                    this.m = this.k;
                    cx.getInstance().a(this.s, this.m - 90);
                    main.GameGraphic.i();
                }

                main.GameGraphic.c[5] = false;
            }
        }

        super.l();
    }

    public final void a(int var1, int var2, Vector var3) {
        if (var1 != GameMidlet.i.w) {
            hn var4;
            if ((var4 = ir.g(var1)) != null) {
                a(var3, var4, var2 + 100 + 20);
                return;
            }
        } else {
            super.ad = this.u;
            this.w = var3;
            this.j = 100 + (this.m - 90);
            this.o = true;
            main.GameGraphic.h();
        }

    }

    public final void a(Graphics var1) {
        this.r.b(var1);
        main.GameGraphic.c(var1);
        int var2 = this.h / 20;

        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        for (var3 = 0; var3 < this.l; ++var3) {
            if ((var4 = var2 + var3 * this.i) > 360) {
                var4 -= 360;
            }

            if (var4 >= 82 && var4 <= 278) {
                var5 = awClass.c(var4);
                var6 = this.g * awClass.b(var5) >> 10;
                var7 = -(this.g * awClass.a(var5)) >> 10;
                var1.drawImage(this.c, this.n.a + var6, this.n.b + var7, 3);
            }
        }

        if (this.p) {
            Graphics var12 = var1;
            hw var11 = this;

            for (var5 = 0; var5 < var11.w.size(); ++var5) {
                if (System.currentTimeMillis() / 100L - var11.x > (long) ((var5 + 1) * 5)) {
                    jh var13;
                    switch ((var13 = (jh) var11.w.elementAt(var5)).b) {
                        case 1:
                            fxClass.a(var13.a).a(var12, var13.d, var13.e, 3);
                            main.GameGraphic.L.a(var12, var13.h, var13.d - 17, var13.e - 7, 1);
                            break;
                        case 2:
                            main.GameGraphic.L.a(var12, StringEntity.COIN, var13.d, var13.e - gy.ag / 2, 2);
                            main.GameGraphic.L.a(var12, String.valueOf(var13.c), var13.d - 17, var13.e - 8, 1);
                            break;
                        case 3:
                            main.GameGraphic.L.a(var12, "xp", var13.d, var13.e - gy.ag / 2, 2);
                            main.GameGraphic.L.a(var12, String.valueOf(var13.f), var13.d - 17, var13.e - 8, 1);
                            break;
                        case 4:
                            main.GameGraphic.L.a(var12, StringEntity.TAEL, var13.d, var13.e - gy.ag / 2, 2);
                            main.GameGraphic.L.a(var12, String.valueOf(var13.g), var13.d - 17, var13.e - 8, 1);
                    }
                }
            }
        }

        var3 = 0;

        for (var4 = 0; var4 < this.l; ++var4) {
            if ((var5 = var2 + var4 * this.i) > 360) {
                var5 -= 360;
            }

            if (var5 >= 82 && var5 <= 278) {
                var6 = awClass.c(var5);
                var7 = this.g * awClass.b(var6) >> 10;
                var6 = -(this.g * awClass.a(var6)) >> 10;
                long var9 = System.currentTimeMillis() / 100L - this.x;
                if (this.p && var5 >= 150 && var5 <= 210 && (var9 > (long) ((var3 + 1) * 5) || var9 <= (long) ((var3 + 1) * 5 - 5))) {
                    ++var3;
                } else {
                    var1.drawImage(this.e, this.n.a + var7, this.n.b + var6, 3);
                }
                var1.drawImage(this.b, this.n.a + var7, this.n.b + var6, 3);
            }
        }

        var1.drawRegion(this.d, 0, 0, 64, 62, 0, this.n.a, this.n.b, 40);
        var1.drawRegion(this.d, 0, 0, 64, 62, 1, this.n.a, this.n.b, 24);
        var5 = awClass.c(this.k);
        var6 = (this.g / 3 + 2) * awClass.b(var5) >> 10;
        var7 = -((this.g / 3 + 2) * awClass.a(var5)) >> 10;
        if ((var2 = this.k + 90) > 360) {
            var2 -= 360;
        }

        var2 = awClass.c(var2);
        var5 = 6 * awClass.b(var2) >> 10;
        var2 = -(6 * awClass.a(var2)) >> 10;
        int var8;
        if ((var8 = this.k - 90) < 0) {
            var8 += 360;
        }

        var8 = awClass.c(var8);
        int var14 = 6 * awClass.b(var8) >> 10;
        var8 = -(6 * awClass.a(var8)) >> 10;
        var1.setColor(14483456);
        var1.fillTriangle(this.n.a + var6, this.n.b + var7, this.n.a + var5, this.n.b + var2, this.n.a + var14, this.n.b + var8);
        var1.fillRoundRect(this.n.a - 6, this.n.b - 6, 12, 12, 12, 12);
        if (this.p || this.j > 0) {
            this.c(var1);
        }

        super.a(var1);
    }

    private void c(Graphics var1) {
        for (int var2 = 0; var2 < this.z.size(); ++var2) {
            dn var3 = (dn) this.z.elementAt(var2);
            this.f.a(var3.f / 5, var3.aw, var3.ax, 0, 3, var1);
        }
    }
}
