package avatar;

import java.util.Vector;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import main.GameMidlet;

public final class jd extends hj {

    public static jd a;
    private Vector b;
    private int c = 0;
    private int d = 0;
    private hj e;
    private Button f;
    private Button g;
    private Button h;
    private Image i;
    private int j;
    private int k;
    private int l;
    private int m;
    private int n;
    private int o;
    private int p;

    public static jd b() {
        if (a == null) {
            a = new jd();
        }
        return a;
    }

    public final void a(hj var1) {
        this.e();
        this.d = 0;
        super.ar = 0;
        this.e = var1;
        this.c();
        super.a();
    }

    public final void e() {
        if (this.i == null) {
            ImageModel.b(StringEntity.FARM_AV);
            this.i = ImageModel.getImageFromIndex("coin");
            ImageModel.cleanUp();
        }

        String var1;
        if (ir.a == 25) {
            this.c = 1;
            var1 = StringEntity.ev[1];
            Farm.getInstance().doOpenATM(0, 0);
            main.GameGraphic.i();
        } else {
            var1 = StringEntity.ev[0];
            this.c = 0;
        }

        this.g();
        je.a().a(var1, this.l, this.m, 2);
        if (jy.b) {
            je.a().h = 25 + hj.al + 1;
        }

        this.k = je.a().h;
        this.f();
    }

    public final void a(int var1, boolean var2) {
        if (var2 && super.ar == var1) {
            if (super.ad != null) {
                super.ad.b();
            } else if (super.ac != null) {
                super.ac.b();
            }
        }

        super.a(var1, var2);
    }

    public final void a(int var1, int var2) {
        switch (var1) {
            case 0:
                main.GameGraphic.y.m = false;
                this.e.a();
                this.i = null;
                return;
            case 1:
            case 2:
                if (this.c != 0) {
                    main.GameGraphic.u.a(StringEntity.QUANTITY, 100, 1);
                    return;
                }

                String var3;
                gu var8;
                if ((var8 = (gu) this.b.elementAt(super.ar)).c.indexOf(StringEntity.aH) != -1) {
                    var3 = main.GameGraphic.K.a(var8.c, StringEntity.aI, GameMidlet.i.x);
                    main.GameGraphic.a(StringEntity.cL, (ii) (new ci(this, var3)));
                } else {
                    String var9;
                    if (var8.c.indexOf("napthe:") != -1) {
                        var3 = var8.c.substring(0, var8.c.indexOf("napthe:") + "napthe:".length());
                        var3 = main.GameGraphic.K.a(var8.c, var3, "");
                        String var10001 = var3;
                        var3 = var8.a;
                        var9 = var10001;
                        KeyboardManager[] var4;
                        (var4 = new KeyboardManager[2])[0] = new KeyboardManager();
                        var4[1] = new KeyboardManager();
                        var4[0].d(0);
                        var4[1].d(1);
                        hi.b().a(var4, var3, StringEntity.eH, new Button(StringEntity.DONE, new ch(this, var9, var4)));
                        main.GameGraphic.A = hi.b();
                    } else {
                        if (var8.c.indexOf("ServerNap:") == -1) {
                            main.GameGraphic.i();
                            cx var10000 = cx.getInstance();
                            var9 = var8.b;
                            cx var7 = var10000;
                            var10000.e((byte) -91);
                            var7.c(var9);
                            var7.k();
                            return;
                        }

                        var3 = var8.c.substring(0, var8.c.indexOf("ServerNap:") + "ServerNap:".length());
                        var3 = main.GameGraphic.K.a(var8.c, var3, "");
                        iy var6;
                        (var6 = iy.a()).e((byte) -76);
                        var6.c(var3);
                        var6.k();
                        main.GameGraphic.i();
                    }
                }
                break;
            case 100:
                try {
                    if (main.GameGraphic.u.a().equals("")) {
                        return;
                    }

                    var1 = Integer.parseInt(main.GameGraphic.u.a());
                    Farm.getInstance().doOpenATM(var1, super.ar == 0 ? 1 : 0);
                    main.GameGraphic.i();
                    return;
                } catch (Exception var5) {
                }
        }

    }

    public final void c() {
        this.f = new Button(StringEntity.ev[0], 1);
        super.ac = this.f;
        this.g = new Button(StringEntity.CHOOSE, 2);
        super.ad = this.g;
        this.h = new Button(StringEntity.CLOSE, 0);
        super.ae = this.h;
    }

    public jd() {
        new dr(0, 1);
        this.o = 0;
        this.p = -1;
    }

    public final void a(Graphics var1) {
        main.GameGraphic.c(var1);
        if (jy.b) {
            main.GameGraphic.S.b(var1);
            main.GameGraphic.S.a(var1, StringEntity.cf.toUpperCase(), GameMidlet.i.a[0] + StringEntity.COIN, GameMidlet.i.a[2] + StringEntity.TAEL);
        } else if (this.e != null) {
            this.e.b(var1);
        }

        if (hi.a == null || main.GameGraphic.A != hi.a) {
            if (!jy.b) {
                je.a().a(var1);
                var1.translate(0, this.k + je.o + gy.Z);
                var1.setClip(this.j + 5, 0, this.l - 10, je.a().e - je.o - 2 * gy.Z);
            } else {
                var1.translate(0, this.k);
                var1.setClip(this.j + 5, 0, this.l - 10, this.m);
            }

            if (this.d == 1) {
                int var2 = (this.m - je.o + (gy.Z << 1)) / 6;
                main.GameGraphic.N.a(var1, StringEntity.aA + GameMidlet.i.x, this.j + this.l / 2, var2 / 2, 2);
                if (!go.z) {
                    main.GameGraphic.N.a(var1, StringEntity.MAIN_BALANCE + ": " + GameMidlet.i.c, this.j + this.l / 2, var2 / 2 + var2, 2);
                }

                main.GameGraphic.N.a(var1, GameMidlet.i.a[2] + StringEntity.TAEL, this.j + this.l / 2, var2 / 2 + (var2 << 1), 2);
                if (go.z) {
                    main.GameGraphic.N.a(var1, aeClass.getMainBalance(), this.j + this.l / 2, var2 / 2 + var2 * 3, 2);
                }
            } else {
                var1.translate(0, -ho.i);
                if (this.c == 0) {
                    this.d(var1);
                } else {
                    this.c(var1);
                }
            }

            if (main.GameGraphic.D == null || !bb.d) {
                super.a(var1);
            }

            main.GameGraphic.a(var1);
        }
    }

    public final void a(Vector var1) {
        this.g();
        this.b = var1;
        this.f();
        this.o = 0;
    }

    private void f() {
        if (this.b != null) {
            this.b.size();
            int var1 = this.b.size() * this.n;
            int var2 = this.b.size();
            if (ir.a == 25) {
                var1 = this.n << 1;
                var2 = 2;
            }

            main.GameGraphic.y.a(this.j, this.k + (!jy.b ? je.o + gy.Z : 0), this.l, this.n, this.l, var1, this.l, this.m - (je.o + 2 * gy.Z) - gy.Z, var2);
        }
    }

    private void g() {
        if (jy.b) {
            this.l = main.GameGraphic.width + 8;
            this.m = main.GameGraphic.height - 25 - hj.al + (gy.Z << 1);
        } else {
            this.l = es.b().l;
            this.m = es.b().m;
        }
        this.n = hj.av;
        this.j = main.GameGraphic.o - this.l / 2;
    }

    private void c(Graphics var1) {
        for (int var2 = 0; var2 < 2; ++var2) {
            if (!super.aj && var2 == super.ar) {
                main.GameGraphic.S.c(var1, this.j + 3 * gy.Y, var2 * this.n + 5, this.l - 6 * gy.Y, this.n);
            }

            main.GameGraphic.K.a(var1, StringEntity.ew[var2], this.j + 10 + (super.ar == var2 ? this.o : 0), var2 * this.n + 5 + this.n / 2 - gy.ah / 2, 0);
        }

    }

    private void d(Graphics var1) {
        int var2 = this.i.getWidth() + 14;
        int var3 = this.b.size();

        int var4;
        for (var4 = 0; var4 < var3; ++var4) {
            if (var4 == super.ar && !super.aj) {
                if (jy.b) {
                    var1.setColor(14328855);
                    var1.fillRect(this.j, var4 * this.n, this.l - 3 * gy.Y, this.n);
                } else {
                    main.GameGraphic.S.c(var1, this.j + 6, var4 * this.n, this.l - 6 * gy.Y, this.n);
                }
            }

            var1.drawImage(this.i, this.j + var2 / 2, var4 * this.n + this.n / 2, 3);
        }

        for (var4 = 0; var4 < var3; ++var4) {
            gu var5 = (gu) this.b.elementAt(var4);
            var1.setClip(this.j + var2 - 3, ho.i, this.l - var2 - 2, this.m - (!jy.b ? je.o + 2 * gy.Z : 0));
            main.GameGraphic.K.a(var1, var5.a, this.j + var2, var4 * this.n + this.n / 2 - gy.ah / 2, 0);
        }

    }

    public final void l() {
        super.l();
        if (!jy.b) {
            if (main.GameGraphic.b[4] || main.GameGraphic.b[6]) {
                this.h();
            }

            if (main.GameGraphic.g && main.GameGraphic.a(0, je.a().h, main.GameGraphic.width, je.o)) {
                main.GameGraphic.g = false;
                this.h();
            }
        }
    }

    private void h() {
        String var1;
        if (this.d == 0) {
            this.d = 1;
            super.ac = null;
            var1 = StringEntity.ev[2];
        } else {
            if (this.c == 1) {
                var1 = StringEntity.ev[1];
            } else {
                var1 = StringEntity.ev[0];
            }
            this.d = 0;
        }
        je.a().a(var1, this.d);
    }

    public final void d(int var1) {
    }

    public final void k() {
        if (this.e != null) {
            this.e.k();
        }

        int var2;
        if (this.c == 0) {
            gu var1 = (gu) this.b.elementAt(super.ar);
            var2 = main.GameGraphic.K.a(var1.a);
        } else {
            var2 = main.GameGraphic.K.a(StringEntity.ew[super.ar]);
        }

        if (var2 > this.l - 20) {
            this.o += this.p;
            if (this.o <= -(var2 - (this.l - 30))) {
                this.p = 1;
            }

            if (this.o > 0) {
                this.p = -1;
            }
        } else {
            this.o = 0;
        }

        if (this.d == 0) {
            if (ir.a != 25) {
                super.ac = this.f;
                super.ad = null;
            } else {
                super.ac = null;
                super.ad = this.g;
            }
        } else {
            super.ac = null;
            super.ad = null;
        }
    }
}
