package avatar;

import java.util.Vector;
import javax.microedition.lcdui.Graphics;
import main.GameGraphic;

public final class cw {
   public boolean a;
   public String b;
   public Button c;
   public Button d;
   public Vector e = new Vector();
   public String f = "";
   public int g;
   public boolean h;
   public int i;
   private static int l;
   public static int j;
   private static int m;
   private static int n;
   private static int o;
   public static int k;
   private int p = 0;
   private int q;
   private int r;
   private boolean s = false;
   private long t;
   private long u;

    static {
        l = GameGraphic.N.getLastByte();
    }

    public cw(String var1, int var2, Button var3, Button var4, boolean var5) {
        this.b = var1;
        this.g = var2;
        this.c = var3;
        this.h = var5;
        if (var4 == null && hc.d != null) {
            this.d = hc.d.f;
        } else {
            this.d = var4;
        }
        this.d();
        this.c();
        this.a = true;
    }

   private void d() {
      this.i = je.a().e - je.o - (gy.Z << 1) - 7 - (this.h ? hc.c.d : 0);
   }

   public final void a(String var1, String var2) {
      this.a = true;
      this.a(var1 + ": " + var2);
   }

    public final void a(String var1) {
        Vector var4 = GameGraphic.N.b(var1, GameGraphic.width - ((hc.e << 1) + 30 + 10 * (gy.Y - 1)));
        int var2 = var4.size();
        for (int i = 0; i < var2; ++i) {
            this.e.addElement(var4.elementAt(i));
            if (this.e.size() > 100) {
                this.e.removeElementAt(0);
            }
        }
        if (hc.b().b(hc.b().b) == this) {
            this.a();
        }
    }

    public final void a() {
        int var1 = this.e.size();
        il.a().a(var1 * l, this.i);
        if ((k = var1 * l - this.i) < 0) {
            k = 0;
        }
        if (awClass.f(j - k) <= l) {
            j = k;
        }
    }

    public final void a(Graphics var1) {
        il.a().a(var1, GameGraphic.width - 50, 0);
        var1.setClip(0, 0, GameGraphic.width - (hc.e << 1), this.i + 4);
        var1.translate(0, -m);
        int var2;
        if ((var2 = m / l) < 0) {
            var2 = 0;
        }
        int var3;
        if ((var3 = var2 + this.i / l + 1) > this.e.size()) {
            var3 = this.e.size();
        }
        for (; var2 < var3; ++var2) {
            String var4 = (String) this.e.elementAt(var2);
            GameGraphic.N.a(var1, var4, 10 * gy.Y, var2 * l + 5, 0);
        }
    }

    public final void b() {
        ++this.t;
        boolean var1 = false;
        if (GameGraphic.d[2]) {
            var1 = true;
            j -= l;
        } else if (GameGraphic.d[8]) {
            j += l;
            var1 = true;
        }
        if (GameGraphic.g) {
            GameGraphic.g = false;
            this.p = m;
            this.s = true;
            this.q = 0;
        }
        if (this.s) {
            if (GameGraphic.e) {
                if (GameGraphic.l % 3 == 0) {
                    this.r = GameGraphic.i;
                    this.u = this.t;
                }
                this.q = 0;
                if ((j = this.p + GameGraphic.l()) < 0 || j > k) {
                    j = this.p + GameGraphic.l() / 2;
                }
                m = j;
            }
            if (GameGraphic.f) {
                int var2 = (int) (this.t - this.u);
                int var3;
                if (awClass.f(var3 = this.r - GameGraphic.i) > 40 && var2 < 10 && j > 0 && j < k) {
                    this.q = var3 / var2 * 10;
                }
                this.u = -1L;
            }
        }
        if (var1) {
            if (j < 0) {
                j = 0;
            }
            if (j > k) {
                j = k;
            }
        }
        if (this.q != 0) {
            if (m < 0 || m > k) {
                this.q -= this.q / 4;
                m += this.q / 20;
                if (this.q / 10 <= 1) {
                    this.q = 0;
                }
            }
            if (m < 0) {
                if (m < -this.i / 2) {
                    m = -this.i / 2;
                    j = 0;
                    this.q = 0;
                }
            } else if (m > k) {
                if (m < k + this.i / 2) {
                    m = k + this.i / 2;
                    j = k;
                    this.q = 0;
                }
            } else {
                m += this.q / 10;
            }
            j = m;
            this.q -= this.q / 10;
            if (this.q / 10 == 0) {
                this.q = 0;
            }
        } else if (m < 0) {
            j = 0;
        } else if (m > k) {
            j = k;
        }
        if (m != j) {
            o = j - m << 2;
            n += o;
            m += n >> 4;
            n &= 15;
        }
        il.a().b(m, j);
    }

    public final void c() {
        this.d();
        m = 0;
        j = 0;
        this.a();
        j = m;
    }
}
