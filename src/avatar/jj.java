package avatar;

import java.util.Vector;
import javax.microedition.lcdui.Graphics;
import main.GameGraphic;

public final class jj extends gs {

    private Vector c;
    private String d = "";
    private Vector e = new Vector();
    private int f = 0;
    private int g;
    private int h;
    private int i;
    private int j;
    public boolean a = false;
    private int k = 0;
    private int l = 0;
    private int m;
    private int n;
    private int o = 0;
    private int p = 0;
    private int q;
    public static ht b;
    private long r = -1L;
    private long s;
    private long t;
    private int u = 0;

    public jj() {
        this.m = gy.af;
    }

    public final void a(String var1, Button var2, Vector var3) {
        if (im.c) {
            im.d().a();
        }

        this.q = hj.av;
        this.a = false;
        this.d = var1;
        super.ad = var2;
        this.f = 0;
        this.e = var3;
        if (var3 != null) {
            Button var4 = (Button) var3.elementAt(this.f);
            super.ad = var4;
            if (var4 != null) {
                super.ad.b = var4.b;
                super.ad.c = var4.c;
                super.ad.d = var4.d;
            }

            this.u = 0;

            for (int var5 = 0; var5 < var3.size(); ++var5) {
                var2 = (Button) var3.elementAt(var5);
                if (GameGraphic.K.a(var2.text) > this.u) {
                    this.u = GameGraphic.K.a(var2.text) + (GameGraphic.H ? this.g / 3 : 0);
                }
            }
        } else {
            this.t = System.currentTimeMillis() / 100L;
        }

        this.l = 0;
        if (this.e != null) {
            this.l = this.e.size();
        }

        this.k = 0;
        this.r = -1L;
        this.a();
        GameGraphic.v = GameGraphic.s;
    }

    public final void a() {
        this.g = GameGraphic.width - 80;
        if (GameGraphic.width < 200) {
            this.g = GameGraphic.width - 40;
            if (GameGraphic.width <= 128) {
                this.g = GameGraphic.width - 10;
            }
        }

        if (this.d.equals(StringEntity.PLEASE_WAIT)) {
            this.g = GameGraphic.o;
        }

        this.c = GameGraphic.M.b(this.d, this.g - 16);
        this.h = this.c.size() * this.m + 20;
        this.n = 0;
        if (super.ad != null) {
            this.h += this.q + 15 * gy.Y;
            this.n += this.q + 15 * gy.Y;
        }

        if (this.h < this.q * 3 + (gy.Y - 1) * 15) {
            this.h = this.q * 3 + (gy.Y - 1) * 15;
        }

        this.i = GameGraphic.o - this.g / 2;
        this.j = GameGraphic.height2 - GameGraphic.T - this.h - 10;
    }

    public final void a(boolean var1) {
        this.a = var1;
        this.h = this.c.size() * this.m + 20;
        if (this.a) {
            this.h += 25 * gy.Y + 4;
            this.n += 25 * gy.Y + 4;
        }

        int var2 = this.q * 3 + (gy.Y - 1) * 15;
        if (this.h < var2) {
            this.h = var2;
        }

        this.j = GameGraphic.height2 - GameGraphic.T - this.h - 10;
        this.s = (long) GameGraphic.j();
    }

    public final void a(Graphics var1) {
        GameGraphic.c(var1);
        if (System.currentTimeMillis() / 100L - this.t >= 5L) {
            GameGraphic.S.a(var1, this.i, this.j, this.g, this.h, je.d[0], je.d[1], 0);
            if (super.ad != null) {
                je.a(this.i + 1, this.j + this.h - (this.q + 15 * gy.Y - 4), this.g - 2, this.q, 15530985, var1);
            }

            if (this.a) {
                b.a(this.k, this.i + this.g / 2, this.j + 4 + (this.h - this.n) / 2 + this.c.size() * gy.af / 2 + (this.h - (4 + (this.h - this.n) / 2 + this.c.size() * gy.af / 2)) / 2, 0, 3, var1);
            }

            if (this.l > 0) {
                Button var2 = (Button) this.e.elementAt(this.f);
                GameGraphic.K.a(var1, var2.text, GameGraphic.o, this.j + this.h - (this.q + 15 * gy.Y - 4) + this.q / 2 - gy.ah / 2, 2);
                if (this.l > 1) {
                    GameGraphic.S.b(var1, GameGraphic.o - this.u / 2 - 11, (GameGraphic.Z != 2 ? gy.ah / 2 : 0) + this.j + this.h - (this.q + 15 * gy.Y - 4) + hj.av / 2 + 1 + (GameGraphic.Z == 1 ? -7 : 0) + (GameGraphic.Z == 0 ? -3 : 0), 17 + this.u, this.o / 3, this.p / 3);
                }
            } else if (super.ad != null) {
                GameGraphic.K.a(var1, super.ad.text, GameGraphic.o, this.j + this.h - (this.q + 15 * gy.Y - 4) + this.q / 2 - gy.ah / 2, 2);
            }

            for (int var3 = 0; var3 < this.c.size(); ++var3) {
                GameGraphic.M.a(var1, (String) this.c.elementAt(var3), GameGraphic.o, this.j + 4 + (this.h - this.n) / 2 - this.c.size() * gy.af / 2 + var3 * gy.af, 2);
            }

        }
    }

    public final void a(int var1, int var2) {
        switch (var1) {
            case -2:
                aeClass.getInstance().v();
                return;
            case -1:
                this.a = false;
                GameGraphic.v = null;
                return;
            default:
                GameGraphic.r.a(var1, var2);
        }
    }

    private void b(int var1) {
        if (this.l > 0) {
            this.f += var1;
            if (this.f < 0) {
                this.f = this.l - 1;
            }

            if (this.f >= this.l) {
                this.f = 0;
            }

            Button var2 = (Button) this.e.elementAt(this.f);
            super.ad = var2;
        }

    }

    public final void l() {
        int var2;
        if (this.a) {
            ++this.k;
            if (this.k >= 8) {
                this.k = 0;
            }

            if ((long) GameGraphic.j() - this.s > 30L) {
                String var1 = "";

                for (var2 = 0; var2 < this.c.size(); ++var2) {
                    var1 = var1 + (String) this.c.elementAt(var2) + " ";
                }

                GameGraphic.b(var1, -2, (gy) null);
            }
        }

        if (this.r != -1L && System.currentTimeMillis() / 100L - this.r > 0L) {
            GameGraphic.b[5] = true;
        }

        if (this.o > 0) {
            --this.o;
        }

        if (this.p > 0) {
            --this.p;
        }

        if (GameGraphic.a(4)) {
            this.b(-1);
            this.o = 5;
        } else if (GameGraphic.a(6)) {
            this.b(1);
            this.p = 5;
        }

        if (GameGraphic.f) {
            label84:
            {
                int var3 = 0;
                if (this.e != null && this.e.size() > 0) {
                    Button var4 = (Button) this.e.elementAt(this.f);
                    var3 = GameGraphic.K.a(var4.text) + 20;
                } else if (super.ad != null) {
                    var3 = GameGraphic.K.a(super.ad.text) + 20;
                }

                var3 *= gy.Y;
                if (super.ad != null && GameGraphic.a(GameGraphic.o - var3 / 2, this.j + this.h - (this.q + 18 * gy.Y - 4), var3, this.q)) {
                    GameGraphic.h();
                    this.a(super.ad);
                } else {
                    if (!GameGraphic.a(this.i + 1, this.j + this.h - (this.q + 18 * gy.Y - 4), this.g - 2, this.q)) {
                        break label84;
                    }

                    if ((var2 = GameGraphic.o - GameGraphic.h) > var3 / 2) {
                        this.b(-1);
                        this.o = 5;
                    } else if (var2 < -var3 / 2) {
                        this.b(1);
                        this.p = 5;
                    }
                }
                GameGraphic.f = false;
            }
        }
        super.l();
    }
}
