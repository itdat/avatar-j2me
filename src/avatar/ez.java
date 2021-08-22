package avatar;

import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import main.GameMidlet;

public final class ez extends hj {

    public static ez a;
    public int b;
    private Image c;
    private boolean d = false;
    private static int e;
    private static int f;
    private static int g;
    private static int h;
    private static int i;
    private static int j;
    private static int k;
    private static int l;
    private int m = 0;
    private long n;
    private int o;
    private boolean p;
    private int q;
    private long r;
    private long s;
    private int t;

    public static ez b() {
        return a == null ? (a = new ez()) : a;
    }

    public final void a() {
        super.a();
        this.e();
        this.m = 0;
        if (super.ad == null) {
            this.c();
        }
        this.g();
    }

    public ez() {
        ImageModel.b(StringEntity.EFFECT_AV);
        this.c = ImageModel.getImageFromIndex("tp");
        ImageModel.cleanUp();
        this.c();
        awClass.b();
    }

    public final void a(int var1, int var2) {
        switch (var1) {
            case 0:
                if (this.d && super.ar > 0) {
                    main.GameGraphic.d(StringEntity.N);
                    es.b().r = System.currentTimeMillis();
                    es.b().doLogin();
                    return;
                } else {
                    if (!this.d) {
                        this.d = true;
                        this.e();
                        super.ar = 1 + awClass.e(GameMidlet.cityNames[dm.getInstance().b[4]][this.b].length - 1);
                        this.g();
                        return;
                    }

                    this.d = false;
                    return;
                }
            case 1:
                this.f();
                return;
            case 2:
                this.d = false;
                this.b = 0;
                super.ar = 0;
                es.b().a();
            default:
        }
    }

    public final void c() {
        if (StringEntity.CHOOSE != null) {
            if (main.GameGraphic.Z == 0) {
                super.ad = new Button(StringEntity.CHOOSE, 0);
            }

            if (GameMidlet.providerByte == 0) {
                super.ac = new Button(StringEntity.f, 1);
            }

            super.ae = new Button(StringEntity.dw, 2);
        }
    }

    private void f() {
        while (true) {
            main.GameGraphic.d(StringEntity.PLEASE_WAIT);
            if (this.m >= GameMidlet.d[dm.getInstance().b[4]].length) {
                main.GameGraphic.showAlert(StringEntity.ds);
                this.m = 0;
                return;
            }

            String var1 = GameMidlet.getRequest(GameMidlet.d[dm.getInstance().b[4]][this.m]);
            if ((var1) != null) {
                String[] var6 = main.GameGraphic.K.a(var1, "*");
                GameMidlet.cityPorts[dm.getInstance().b[4]] = new int[var6.length - 1][];
                GameMidlet.cityIpAddresses[dm.getInstance().b[4]] = new String[var6.length - 1][];
                GameMidlet.cityNames[dm.getInstance().b[4]] = new String[var6.length - 1][];

                for (int var2 = 1; var2 < var6.length; ++var2) {
                    String[] var3 = main.GameGraphic.K.a(var6[var2], "\n");
                    GameMidlet.cityNames[dm.getInstance().b[4]][var2 - 1] = new String[var3.length - 1];
                    GameMidlet.cityIpAddresses[dm.getInstance().b[4]][var2 - 1] = new String[var3.length - 2];
                    GameMidlet.cityPorts[dm.getInstance().b[4]][var2 - 1] = new int[var3.length - 2];
                    GameMidlet.cityNames[dm.getInstance().b[4]][var2 - 1][0] = var3[0];

                    for (int var4 = 1; var4 < var3.length - 1; ++var4) {
                        String[] var5 = main.GameGraphic.K.a(var3[var4], ":");
                        GameMidlet.cityNames[dm.getInstance().b[4]][var2 - 1][var4] = var5[0];
                        GameMidlet.cityIpAddresses[dm.getInstance().b[4]][var2 - 1][var4 - 1] = var5[1];
                        var5[2] = var5[2].substring(0, var5[2].length() - 1);
                        GameMidlet.cityPorts[dm.getInstance().b[4]][var2 - 1][var4 - 1] = Integer.parseInt(var5[2]);
                    }
                }
                fxClass.e();
                main.GameGraphic.h();
                this.e();
                return;
            }
            ++this.m;
        }
    }

    public final void e() {
        if (main.GameGraphic.Z > 0) {
            super.aj = true;
        }

        int var1 = 176;
        if (176 > main.GameGraphic.width) {
            var1 = main.GameGraphic.width;
        }

        je.a().a(StringEntity.bP, var1 * gy.Y, hj.av * 6, 1);
        k = je.a().g + 4;
        l = je.a().h + je.o + gy.Z;
        j = je.a().e - (je.o + (gy.Z << 1));
        i = GameMidlet.cityNames[dm.getInstance().b[4]].length * hj.av + (this.d ? GameMidlet.cityNames[dm.getInstance().b[4]][this.b].length * hj.av : 0) - j;
        e = 0;
        f = 0;
        if (i < 0) {
            i = 0;
        }

    }

    public final void k() {
        if (this.o != 0) {
            if (f < 0 || f > i) {
                this.o -= this.o / 4;
                f += this.o / 20;
                if (this.o / 10 <= 1) {
                    this.o = 0;
                }
            }

            if (f < 0) {
                if (f < -j / 2) {
                    f = -j / 2;
                    e = 0;
                    this.o = 0;
                }
            } else if (f > i) {
                if (f < i + j / 2) {
                    f = i + j / 2;
                    e = i;
                    this.o = 0;
                }
            } else {
                f += this.o / 10;
            }

            e = f;
            this.o -= this.o / 10;
            if (this.o / 10 == 0) {
                this.o = 0;
            }
        } else if (f < 0) {
            e = 0;
        } else if (f > i) {
            e = i;
        }

        if (f != e) {
            h = e - f << 2;
            g += h;
            f += g >> 4;
            g &= 15;
        }
        main.GameGraphic.x.b();
    }

    private void b(int var1) {
        this.b = var1;
        if (this.b >= GameMidlet.cityNames[dm.getInstance().b[4]].length) {
            this.b = 0;
        }
        if (this.b < 0) {
            this.b = GameMidlet.cityNames[dm.getInstance().b[4]].length - 1;
        }

    }

    public final void a(int var1, boolean var2) {
        super.ar = var1;
        if (super.ar >= GameMidlet.cityNames[dm.getInstance().b[4]][this.b].length || super.ar <= 0) {
            super.ar = 0;
            if (var2) {
                this.d = false;
                this.e();
            }
        }
    }

    public final void l() {
        ++this.r;
        boolean var1 = false;
        if (main.GameGraphic.a(8)) {
            var1 = true;
            if (!this.d) {
                this.b(this.b + 1);
            } else {
                this.a(super.ar + 1, true);
            }
        } else if (main.GameGraphic.a(2)) {
            var1 = true;
            if (!this.d) {
                this.b(this.b - 1);
            } else {
                this.a(super.ar - 1, true);
            }
        }

        if (main.GameGraphic.g && main.GameGraphic.b(k, l, je.a().f, j)) {
            main.GameGraphic.g = false;
            this.q = f;
            this.p = true;
            this.n = System.currentTimeMillis() / 10L;
        }

        if (this.p) {
            long var2 = System.currentTimeMillis() / 10L - this.n;
            int var4 = main.GameGraphic.l();
            int var5;
            if (main.GameGraphic.e) {
                if (main.GameGraphic.l % 3 == 0) {
                    this.t = main.GameGraphic.i;
                    this.s = this.r;
                }

                this.o = 0;
                var5 = (e + main.GameGraphic.i - l) / hj.av;
                if (this.d) {
                    super.ar = var5 - this.b;
                } else if (var5 >= 0 && var5 < GameMidlet.cityNames[dm.getInstance().b[4]].length) {
                    this.b = var5;
                }

                if (awClass.f(var4) >= 20 * gy.Y) {
                    super.aj = true;
                } else if (var2 > 10L && var2 < 20L) {
                    super.aj = false;
                }

                if ((e = this.q + var4) < 0 || e > i) {
                    e = this.q + var4 / 2;
                }

                f = e;
            }

            if (main.GameGraphic.f && main.GameGraphic.b(k, l, je.a().f, j)) {
                var5 = (int) (this.r - this.s);
                int var6;
                if (awClass.f(var6 = this.t - main.GameGraphic.i) > 40 && var5 < 10 && e > 0 && e < i) {
                    this.o = var6 / var5 * 10;
                }

                this.s = -1L;
                if (Math.abs(var4) < 20 * gy.Y) {
                    if (var2 <= 10L) {
                        super.aj = false;
                    }

                    if (!super.aj) {
                        int var7 = (e + main.GameGraphic.i - l) / hj.av;
                        if (this.d) {
                            if (var7 - this.b > 0 && var7 - this.b < GameMidlet.cityNames[dm.getInstance().b[4]][this.b].length) {
                                super.ar = var7 - this.b;
                                this.a(0, -1);
                            } else {
                                if (var7 - this.b <= 0) {
                                    this.d = false;
                                    super.ar = 0;
                                    this.b = var7;
                                    var1 = true;
                                }

                                if (var7 >= GameMidlet.cityNames[dm.getInstance().b[4]][this.b].length - this.b && var7 < GameMidlet.cityNames[dm.getInstance().b[4]][this.b].length - 1 + GameMidlet.cityNames[dm.getInstance().b[4]].length) {
                                    this.d = false;
                                    super.ar = 0;
                                    this.b = var7 - GameMidlet.cityNames[dm.getInstance().b[4]][this.b].length + 1;
                                    var1 = true;
                                }
                            }
                        } else if (var7 >= 0 && var7 < GameMidlet.cityNames[dm.getInstance().b[4]].length) {
                            this.b = var7;
                            this.a(0, -1);
                        }
                    }
                }
            }
        }

        if (main.GameGraphic.f) {
            this.p = false;
        }

        if (var1) {
            this.g();
        }

        super.l();
    }

    private void g() {
        if ((e = (this.b + (this.d ? super.ar : 0)) * hj.av - j / 2 + hj.av / 2) < 0) {
            e = 0;
        }

        if (e > i) {
            e = i;
        }

    }

    public final void a(Graphics var1) {
        main.GameGraphic.x.b(var1);
        main.GameGraphic.x.d(var1);
        main.GameGraphic.c(var1);
        je.a().a(var1);
        if (GameMidlet.i != null && !GameMidlet.i.x.equals("")) {
            main.GameGraphic.L.a(var1, StringEntity.dz + ", " + GameMidlet.i.x, je.a().g + je.a().f / 2, je.a().h - gy.ag, 2);
        }

        var1.translate(k, l);
        var1.setClip(0, 0, je.a().f - 9, je.a().e - (je.o + (gy.Z << 1)));
        var1.translate(0, -f);
        if (!super.aj) {
            main.GameGraphic.S.c(var1, 2 * gy.Y, this.b * hj.av + (this.d ? super.ar * hj.av : 0), je.a().f - 8 - 4 * gy.Y, hj.av);
        }

        int var2 = (hj.av - gy.ah) / 2;

        for (int var3 = 0; var3 < GameMidlet.cityNames[dm.getInstance().b[4]].length; ++var3) {
            main.GameGraphic.K.a(var1, GameMidlet.cityNames[dm.getInstance().b[4]][var3][0], 24 * gy.Y, var2, 0);
            je.a.a(0, 14 * gy.Y, var2 + gy.ah / 2, 5, 3, var1);
            var2 += hj.av;
            if (this.d && this.b == var3) {
                for (int var4 = 1; var4 < GameMidlet.cityNames[dm.getInstance().b[4]][var3].length; ++var4) {
                    main.GameGraphic.K.a(var1, GameMidlet.cityNames[dm.getInstance().b[4]][var3][var4], 36 * gy.Y, var2, 0);
                    var1.drawImage(this.c, 24 * gy.Y, var2 + gy.ah / 2, 3);
                    var2 += hj.av;
                }
            }
        }
        super.a(var1);
        main.GameGraphic.a(var1);
    }
}
