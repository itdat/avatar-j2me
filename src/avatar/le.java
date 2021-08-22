package avatar;

import java.util.Vector;
import javax.microedition.lcdui.Graphics;
import main.GameGraphic;

public final class le extends kr {
   private static le INST; // i
   private Vector j;
   private int k;
   private int l;
   public int a;
   public int b;
   public int c;
   public int d;
   private int m;
   public int e;
   public static ht f;
   private boolean n = false;
   private int o;
   private int p;
   private int q;
   private int r;
   private int s;
   private int t;
   private int u = 0;
   private static Button v;
   public static ii g;
   public static short[] h;
   private int w;
   private int x;
   private int y = 0;
   private int z;
   private boolean A = false;
   private long B;
   private long C;
   private long D;

    // a
    public static le getInstance() {
        return INST == null ? (INST = new le()) : INST;
    }

    public le() {
        this.c();
    }

    public final void a(int var1, int var2) {
        switch(var1) {
        case 0:
            this.d();
            return;
        case 1:
            this.n = false;
            GameGraphic.t = null;
            if (g != null) {
                g.a();
            }
        default:
        }
    }

    public final void c() {
        if (GameGraphic.Z == 0) {
            super.ac = new Button(StringEntity.CHOOSE, 0);
        }
        super.ae = new Button(StringEntity.CLOSE, 1);
    }

    public final void a(Vector var1, int var2, int var3, int var4) {
        if (var1.size() != 0) {
            if (GameGraphic.Z > 0) {
               super.aj = true;
            }
            this.u = var1.size();
            this.t = GameGraphic.height;
            this.n = true;
            this.c = this.u * var3 + (gy.Z << 1) + 4;
            if (this.c > GameGraphic.width) {
               this.c = GameGraphic.width;
            }
            this.a = var2 - this.c / 2;
            this.d = var4 + (gy.Z << 1) + 4;
            if (this.a < 0) {
               this.a = 0;
            }
            this.b = GameGraphic.height2 - GameGraphic.T - this.d - (gy.Z << 1);
            this.m = this.b;
            this.e = var4;
            this.j = var1;
            this.b();
            this.s = this.u * this.e - (this.c - (gy.Z << 1) - 4);
            if (this.s < 0) {
               this.s = 0;
            }
            this.x = this.c;
            v = null;
            g = null;
            h = null;
            GameGraphic.t = this;
        }
    }

    private void b() {
        if (this.k < 0) {
            this.k = 0;
        }
        if (this.k >= this.u) {
            this.k = 0;
        }
    }

   public final void a(Vector var1, int var2) {
      if (var1.size() != 0) {
         if (GameGraphic.Z > 0) {
            super.aj = true;
         }
         this.e = hj.av;
         h = null;
         this.t = GameGraphic.height;
         this.l = 0;
         this.j = var1;
         this.u = this.j.size();
         this.c = this.d = 0;

         for(int var4 = 0; var4 < this.u; ++var4) {
            Button var3 = (Button)this.j.elementAt(var4);
            int var5;
            if ((var5 = GameGraphic.K.a(var3.text) + 20) > this.c) {
               this.c = var5;
            }

            this.d += this.e;
         }

         if (this.c < GameGraphic.width / 3) {
            this.c = GameGraphic.width / 3;
         }

         if (this.c > GameGraphic.width - 4) {
            this.c = GameGraphic.width - 4;
         }

         this.d += 4;
         if (var2 == 0) {
            this.a = 2 * (GameGraphic.Z != 0 ? 2 : 1);
         } else if (var2 == 1) {
            this.a = GameGraphic.width - this.c - 2;
         } else {
            this.a = (GameGraphic.width >> 1) - (this.c >> 1);
         }

         if (this.u > 5) {
            this.d = hj.av * 5 + 4;
         }

         this.b = GameGraphic.height - this.d - gy.Z - GameGraphic.T;
         if (jy.b) {
            this.b = GameGraphic.height2 - GameGraphic.T - this.d - 5;
         }

         if (GameGraphic.height < 200) {
            this.b += 10;
         }

         this.m = GameGraphic.height - this.e;
         if (GameGraphic.Z > 0) {
            this.b = GameGraphic.height2 - this.d - gy.Z - 3;
            if (GameGraphic.Z == 1) {
               this.b -= 7;
            }

            super.ac = null;
         }

         this.n = false;
         this.k = 0;
         this.s = (this.u - 5) * this.e;
         if (this.s < 0) {
            this.s = 0;
         }

         this.o = 0;
         this.p = 0;
         v = null;
         if (GameGraphic.isRimOrBlackBerry) {
            GameGraphic.g();
         }

         g = null;
         this.x = this.d;
         GameGraphic.t = this;
      }
   }

   private void d() {
      this.n = false;
      GameGraphic.t = null;
      Button var1;
      if ((var1 = (Button)this.j.elementAt(this.k)).d != null) {
         var1.d.a(var1.c);
      } else if (var1.b != null) {
         var1.b.a();
      } else {
         GameGraphic.r.d(var1.c, var1.e);
      }
   }

   public final void l() {
      super.l();
      ++this.C;
      boolean var2 = false;
      if (!GameGraphic.a(2) && !GameGraphic.a(4)) {
         if (GameGraphic.a(8) || GameGraphic.a(6)) {
            var2 = true;
            ++this.k;
            if (this.k > this.u - 1) {
               this.k = 0;
            }

            super.aj = false;
         }
      } else {
         var2 = true;
         --this.k;
         if (this.k < 0) {
            this.k = this.u - 1;
         }

         super.aj = false;
      }

      if (GameGraphic.g && GameGraphic.b(this.a - 2, this.m - 7, this.c + 4, this.d + 15)) {
         GameGraphic.g = false;
         this.y = this.p;
         this.B = System.currentTimeMillis() / 10L;
         this.A = true;
      }

      if (this.A) {
         int var3 = GameGraphic.l();
         if (this.n) {
            var3 = GameGraphic.k();
         }

         long var4 = System.currentTimeMillis() / 10L - this.B;
         int var6;
         int var7;
         if (GameGraphic.e) {
            if (GameGraphic.l % 3 == 0) {
               this.z = GameGraphic.i;
               this.D = this.C;
            }

            this.w = 0;
            if (Math.abs(var3) < 20 * gy.Y) {
               var6 = this.m;
               var7 = (this.o + GameGraphic.i - var6) / this.e;
               if (this.n) {
                  var6 = this.a;
                  var7 = (this.o + GameGraphic.h - var6) / this.e;
               }

               this.k = var7;
               this.b();
            }

            if (awClass.f(var3) >= 20 * gy.Y) {
               super.aj = true;
            } else if (var4 > 10L && var4 < 20L) {
               super.aj = false;
            }

            this.o = this.y + var3;
            if (this.o < 0 || this.o > this.s) {
               this.o = this.y + var3 / 3;
            }

            this.p = this.o;
         }

         if (GameGraphic.f && GameGraphic.b(this.a - 2, this.m - 7, this.c + 4, this.d + 15)) {
            var6 = (int)(this.C - this.D);
            if (awClass.f(var7 = this.z - GameGraphic.i) > 40 && var6 < 10 && this.o > 0 && this.o < this.s) {
               this.w = var7 / var6 * 10;
            }

            this.D = -1L;
            if (Math.abs(var3) < 20 * gy.Y) {
               if (var4 <= 10L) {
                  super.aj = false;
               }

               if (!super.aj) {
                  var3 = this.m;
                  var3 = (this.o + GameGraphic.i - var3) / this.e;
                  if (this.n) {
                     var3 = this.a;
                     var3 = (this.o + GameGraphic.h - var3) / this.e;
                  }

                  this.k = var3;
                  this.b();
                  this.d();
               }
            }

            GameGraphic.f = false;
         }
      }

      if (GameGraphic.f) {
         if (!this.A) {
            this.n = false;
            GameGraphic.t = null;
            if (g != null) {
               g.a();
            }
         }

         this.A = false;
         GameGraphic.f = false;
      }

      if (var2) {
         this.o = this.k * this.e - this.c / 2 + this.e / 2;
         if (this.o > this.s) {
            this.o = this.s;
            return;
         }

         if (this.o < 0) {
            this.o = 0;
         }
      }

   }

   public final void a(Graphics var1) {
      var1.translate(0, this.t);
      int var6;
      int var8;
      if (this.n) {
         Graphics var3 = var1;
         le var2 = this;
         GameGraphic.c(var1);
         GameGraphic.S.a(var1, this.a, this.b, this.c, this.d);
         var1.translate(this.a + gy.Z + 2, this.b + gy.Z + 2);
         var1.setClip(0, 0, this.c - (gy.Z << 1) - 4, this.e);
         var1.translate(-this.p, 0);
         int var4;
         if ((var4 = this.p / this.e) < 0) {
            var4 = 0;
         }

         int var5;
         if ((var5 = var4 + this.c / this.e + 2) > this.u) {
            var5 = this.u;
         }

         if (!super.aj) {
            je.a(var1, this.k * this.e, 0, this.e, this.e);
         }

         for(var6 = var4; var6 < var5; ++var6) {
            ((Button)var2.j.elementAt(var6)).a(var3, var6 * var2.e + var2.e / 2, var2.e / 2);
         }

         if (var2.k >= 0 && var2.k < var2.j.size()) {
            Button var11 = (Button)var2.j.elementAt(var2.k);
            var3.setClip(var2.p - 50, -100, var2.p + GameGraphic.width + 100, var2.d + 200);
            int var7 = var2.k * var2.e + var2.e / 2;
            if (var2.u * var2.e + (gy.Z << 1) + 10 > GameGraphic.width) {
               var8 = GameGraphic.L.a(var11.text) / 2;
               if (var7 - var8 < var2.p) {
                  var7 = var2.p + var8;
               } else if (var7 + var8 > GameGraphic.width + var2.p - 15) {
                  var7 = GameGraphic.width + var2.p - var8 - 15;
               }
            }

            GameGraphic.L.a(var3, var11.text, var7, -gy.ag - gy.Z - 6 - (gy.Y == 2 ? 15 : 0), 2);
         }

         GameGraphic.c(var3);
      } else if (this.u != 0) {
         var1.translate(-var1.getTranslateX(), -var1.getTranslateY());
         Graphics var10 = var1;
         le var9 = this;
         GameGraphic.c(var1);
         if (jy.b) {
            GameGraphic.S.e(var1, this.a - 2, this.m - 7, this.c + 4, this.d + 15);
         } else {
            GameGraphic.S.a(var1, this.a - 2, this.m - 7, this.c + 4, this.d + 15);
         }

         var1.setClip(this.a, this.m, this.c, this.d);
         var1.translate(this.a + 3, this.m + 1);
         var1.translate(0, -this.p);
         var6 = (this.e - gy.ah) / 2;

         for(var8 = 0; var8 < var9.u; ++var8) {
            var10.setColor(0);
            if (!var9.aj && var8 == var9.k) {
               if (jy.b) {
                  var10.setColor(35217);
                  var10.fillRect(0, var8 * var9.e, var9.c - 6, var9.e);
               } else {
                  GameGraphic.S.b(var10, 0, var8 * var9.e, var9.c - 6, var9.e);
               }
            }

            short var12 = 0;
            if (h != null && var8 < h.length && h[var8] != -1 && fxClass.c(h[var8]) != null) {
               var12 = fxClass.c(h[var8]).b;
               fxClass.a(var10, h[var8], 3, var8 * var9.e + var6 + 1, 0);
            }

            if (jy.b) {
               GameGraphic.L.a(var10, ((Button)var9.j.elementAt(var8)).text, var12 + 5, var8 * var9.e + var6, 0);
            } else {
               GameGraphic.S.a(var10, ((Button)var9.j.elementAt(var8)).text, var12 + 5, var8 * var9.e + var6, 0);
            }
         }
      }

      super.a(var1);
   }

   public final void k() {
      if (this.t != 0) {
         this.t += -this.t >> 1;
      }

      if (this.t == -1) {
         this.t = 0;
      }

      if (this.w != 0) {
         if (this.p < 0 || this.p > this.s) {
            this.w -= this.w / 4;
            this.p += this.w / 20;
            if (this.w / 10 <= 1) {
               this.w = 0;
            }
         }

         if (this.p < 0) {
            if (this.p < -this.x / 2) {
               this.p = -this.x / 2;
               this.o = 0;
               this.w = 0;
            }
         } else if (this.p > this.s) {
            if (this.p < this.s + this.x / 2) {
               this.p = this.s + this.x / 2;
               this.o = this.s;
               this.w = 0;
            }
         } else {
            this.p += this.w / 10;
         }

         this.o = this.p;
         this.w -= this.w / 10;
         if (this.w / 10 == 0) {
            this.w = 0;
         }
      } else if (this.p < 0) {
         this.o = 0;
      } else if (this.p > this.s) {
         this.o = this.s;
      }

      if (this.p != this.o) {
         this.r = this.o - this.p << 2;
         this.q += this.r;
         this.p += this.q >> 4;
         this.q &= 15;
      }

      if (this.m > this.b) {
         int var2;
         if ((var2 = this.m - this.b >> 2) <= 0) {
            var2 = 1;
         }

         this.m -= var2;
      }

      this.m = this.b;
   }
}
