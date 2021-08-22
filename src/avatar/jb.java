package avatar;

import java.util.Hashtable;
import java.util.Vector;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class jb extends ha {

    public static jb a;
    private int b;
    private int c;
    private int d;
    private int e;
    private int f;
    private Vector g = new Vector();
    private Vector h = new Vector();
    private Hashtable i;
    private String j = "";
    private String k = "";
    private int l = 5;
    private int m = 5;
    private int n = 30;
    private byte o;
    private static int p;
    private static int q;
    private static int r;
    private static int s;
    private static int t;
    private static int u;
    private static int v = 14;
    private long w;
    private int x = 0;
    private int y = 0;
    private boolean z = false;
    private int A;
    private int B;
    private int C;
    private int D;

    public static jb b() {
        return a == null ? (a = new jb()) : a;
    }

    public final void a(int var1, int var2) {
        switch (var1) {
            case 0:
                this.g.removeAllElements();
                this.h.removeAllElements();
                this.i.clear();
                main.GameGraphic.A = null;
                main.GameGraphic.h();
                a = null;
                return;
            case 1:
                cx.getInstance().b(this.o);
            default:
        }
    }

    public jb() {
        this.e();
        super.ae = new Button(StringEntity.CLOSE, 0);
        v = gy.af;
    }

    private void e() {
        this.e = main.GameGraphic.width - 20;
        this.f = main.GameGraphic.height - main.GameGraphic.T - 20;
    }

    public final void d() {
        this.e();
        this.a(this.i, this.j, this.k, this.o);
    }

    private void a(String var1) {
        int var2;
        if ((var2 = var1.indexOf("Ę")) != -1) {
            String var3 = var1.substring(0, var2);
            this.a(var3, "");
            if ((var2 = (var1 = var1.substring(var2 + 1)).indexOf("\n")) != -1) {
                var3 = var1.substring(0, var2);
                this.a(var3, "Ę");
                var1 = var1.substring(var2 + 1);
                this.a(var1);
            } else {
                this.a(var1, "Ę");
            }
        } else {
            this.a(var1, "");
        }
    }

    private void a(String var1, String var2) {
        if (!var1.equals("")) {
            int var3;
            if ((var3 = var1.indexOf("ę")) != -1) {
                String var4;
                if (!(var4 = var1.substring(0, var3)).equals("")) {
                    this.a(var4, var2, 0);
                }

                int var5 = Integer.parseInt(var1.substring(var3 + 1, var3 + 2));
                if ((var3 = (var1 = var1.substring(var3 + 2, var1.length())).indexOf("\n")) != -1) {
                    this.a(var1.substring(0, var3), var2, var5);
                    this.a(var1.substring(var3 + 1), var2);
                } else {
                    this.a(var1, var2, var5);
                }
            } else {
                this.a(var1, var2, 0);
            }
        }
    }

    private void a(String var1, String var2, int var3) {
        boolean var4 = false;
        String[] var5;
        if (var1.indexOf("tem") != -1) {
            var4 = true;
            var5 = main.GameGraphic.N.a(var1, this.e - 30 - 8 * gy.Y);
        } else {
            var5 = main.GameGraphic.K.a(var1, this.e - 30 - 8 * gy.Y);
        }

        for (int var6 = 0; var6 < var5.length; ++var6) {
            int var7;
            if (var4) {
                var7 = main.GameGraphic.N.a(var5[var6]);
            } else {
                var7 = main.GameGraphic.K.a(var5[var6]);
            }

            if (var7 > this.x) {
                this.x = var7;
            }

            bc var8;
            (var8 = new bc(this.l, this.m += v, var2 + var5[var6])).e = var3;
            this.g.addElement(var8);
        }

    }

    public final void a(Hashtable var1, String var2, String var3, byte var4) {
        this.B = 0;
        super.ad = null;
        if (var4 != -1) {
            super.ad = new Button(StringEntity.CHOOSE, 1);
        }

        this.o = var4;
        this.x = 0;
        this.n = main.GameGraphic.K.a(var2) + 20 * gy.Y;
        if (this.n < 50 + 20 * gy.Y) {
            this.n = 50 + 20 * gy.Y;
        }

        this.i = var1;
        this.j = var2;
        this.k = var3;
        this.g.removeAllElements();
        this.h.removeAllElements();
        boolean var9 = false;
        this.l = 0;
        this.m = -10;

        int var10;
        label97:
        while ((var10 = var3.indexOf("µ")) != -1) {
            String var13 = var3.substring(0, var10);
            var3 = var3.substring(var10 + 1, var3.length());
            String var5;
            if (var9) {
                var10 = var13.indexOf(",");
                var5 = var13.substring(0, var10);
                var10 = (var13 = var13.substring(var10 + 1, var13.length())).indexOf(",");
                int var6 = Integer.parseInt(var13.substring(0, var10));
                boolean var11 = Integer.parseInt(var13.substring(var10 + 1, var13.length())) != 0;
                Image var14 = (Image) this.i.get(var5);
                byte var7 = 0;
                if (var6 == 17) {
                    var7 = 1;
                } else if (var6 == 24) {
                    var7 = 2;
                }

                v var15 = new v(this, Integer.parseInt(var5), var7, this.m + v + 5, var6, var11);
                var14.getWidth();
                var15.e = var14.getHeight();
                if (var11) {
                    v var12 = (v) this.h.elementAt(this.h.size() - 1);
                    var6 = ((Image) this.i.get(String.valueOf(var12.d))).getHeight();
                    if (var14.getHeight() > var6) {
                        var12.b += var14.getHeight() - var6;
                    }
                    var15.b = var12.b + var6 - var14.getHeight();
                }
                this.m = var15.b + var14.getHeight() - 10;
                this.h.addElement(var15);
                var13 = "";
            }

            var9 = !var9;

            while (true) {
                while ((var10 = var13.indexOf("¶")) == -1) {
                    if (!var13.equals("")) {
                        this.a(var13.substring(0, var13.length() - 1));
                    }

                    if (var3.indexOf("µ") != -1 || var3.indexOf("¶") == -1) {
                        continue label97;
                    }

                    var13 = var3;
                    var3 = "";
                }

                var5 = var13.substring(0, var10);
                var13 = var13.substring(var10 + 1, var13.length());

                try {
                    Integer.parseInt(var5, 16);
                    this.a("¶" + var5);
                    this.m -= v / 2;
                } catch (Exception var8) {
                    this.a(var5);
                }
            }
        }

        this.a(var3);
        this.c = 9 * gy.Y;
        if (this.x < 140 * gy.Y) {
            this.x = 140 * gy.Y;
        }

        if (this.x >= 120 && this.x < this.e - 30) {
            this.e = this.x + 20 * gy.Y;
            this.c = 10 * gy.Y;
        }

        if (this.m + 10 + (v << 1) < this.f - 30) {
            this.f = this.m + 10 + (v << 1) + 20;
        }

        if (this.f < 80 * gy.Y + hj.at) {
            this.f = 80 * gy.Y + hj.at;
        }

        if ((t = this.m - (this.f - je.o - 2 * gy.Z - (v << 1))) < 0) {
            t = 0;
        }

        p = 0;
        q = 0;
        this.b = (main.GameGraphic.width - this.e) / 2;
        this.d = (main.GameGraphic.height - main.GameGraphic.T - this.f) / 2;
        this.w = System.currentTimeMillis();
    }

    public final void l() {
        if (System.currentTimeMillis() - this.w >= 1000L) {
            this.w = System.currentTimeMillis();
        }

        ++this.B;
        boolean var1 = false;
        if (u != 0) {
            u += -u >> 1;
        }

        if (u == -1) {
            u = 0;
        }

        if (main.GameGraphic.g && main.GameGraphic.a(this.b, this.d, this.e, this.f) && !this.z) {
            this.y = q;
            this.z = true;
            this.A = 0;
        }

        if (this.z) {
            int var2 = main.GameGraphic.l();
            if (main.GameGraphic.e) {
                if (main.GameGraphic.l % 3 == 0) {
                    this.D = main.GameGraphic.i;
                    this.C = this.B;
                }

                p = this.y + var2;
                this.A = 0;
                if (p < 0 || p > t) {
                    p = this.y + var2 / 2;
                }

                q = p;
            }

            if (main.GameGraphic.f) {
                this.z = false;
                int var3 = this.B - this.C;
                int var4;
                if (awClass.f(var4 = this.D - main.GameGraphic.i) > 40 && var3 < 10 && p > 0 && p < t) {
                    this.A = var4 / var3 * 10;
                }

                this.C = -1;
                if (Math.abs(var2) < 10) {
                    p = this.y + var2;
                }
            }
        }

        if (main.GameGraphic.d[2]) {
            p -= 14;
            var1 = true;
        } else if (main.GameGraphic.d[8]) {
            var1 = true;
            p += 14;
        }

        if (var1) {
            if (p < 0) {
                p = 0;
            }

            if (p > t) {
                p = t;
            }
        }

        if (this.A != 0) {
            if (q < 0 || q > t) {
                this.A -= this.A / 4;
                q += this.A / 20;
                if (this.A / 10 <= 1) {
                    this.A = 0;
                }
            }

            if (q < 0) {
                if (q < -this.f / 2) {
                    q = -this.f / 2;
                    p = 0;
                    this.A = 0;
                }
            } else if (q > t) {
                if (q < t + this.f / 2) {
                    q = t + this.f / 2;
                    p = t;
                    this.A = 0;
                }
            } else {
                q += this.A / 10;
            }

            p = q;
            this.A -= this.A / 10;
            if (this.A / 10 == 0) {
                this.A = 0;
            }
        } else if (q < 0) {
            p = 0;
        } else if (q > t) {
            p = t;
        }

        if (q != p) {
            s = p - q << 2;
            r += s;
            q += r >> 4;
            r &= 15;
        }

        super.l();
    }

    public final void a(Graphics var1) {
        main.GameGraphic.c(var1);
        main.GameGraphic.S.a(var1, this.b, this.d, this.f, this.e, 0, 0, je.a().j, this.n, je.o, 1, 1, je.a().n, je.a().m, this.j);
        var1.setClip(this.b + 4, this.d + je.o + 4 * gy.Y, this.e - 8, this.f - je.o - 8 * gy.Y);
        var1.translate(this.b + this.c, this.d + je.o);
        var1.translate(0, -q);
        var1.setColor(0);

        int var2;
        for (var2 = 0; var2 < this.g.size(); ++var2) {
            bc var3;
            if ((var3 = (bc) this.g.elementAt(var2)).ax > q - 10 && var3.ax < q + this.f) {
                int var4;
                if (var3.a.length() > 2 && var3.a.substring(0, 1).equals("¶")) {
                    var4 = Integer.parseInt(var3.a.substring(1, var3.a.length()), 16);
                    je.a(var3.aw, var3.ax, main.GameGraphic.width - (var3.aw << 1), 1, var4, var1);
                } else {
                    var4 = var3.aw;
                    if (var3.e == 2) {
                        var4 += (this.e - 30) / 2 + 4;
                    } else if (var3.e == 1) {
                        var4 += this.e - 30 + 10;
                    }

                    if (var3.a.length() > 2 && var3.a.substring(0, 1).equals("Ę")) {
                        main.GameGraphic.N.a(var1, var3.a.substring(1, var3.a.length()), var4, var3.ax, var3.e);
                    } else if (var3.a.length() > 1 && var3.a.substring(0, 1).equals("0")) {
                        var1.setColor(8654855);
                        int var5 = main.GameGraphic.M.a(var3.a.substring(1) + "") + 20;
                        var1.fillRect(var4 - var5 / 2, var3.ax + gy.ah / 2 - gy.ai / 2 - 1, var5, main.GameGraphic.M.getLastByte());
                        main.GameGraphic.M.a(var1, var3.a.substring(1) + "", var4, var3.ax + gy.ah / 2 - gy.af / 2, var3.e);
                    } else {
                        main.GameGraphic.K.a(var1, var3.a, var4, var3.ax, var3.e);
                    }
                }
            }
        }

        for (var2 = 0; var2 < this.h.size(); ++var2) {
            v var6 = (v) this.h.elementAt(var2);
            if (var6.b + var6.e > q && var6.b < q + this.f) {
                var1.drawImage((Image) this.i.get(String.valueOf(var6.d)), var6.a * ((this.e - (this.c << 1)) / 2), var6.b, var6.c);
            }
        }
        super.a(var1);
    }
}
