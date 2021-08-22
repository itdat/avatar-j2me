package avatar;


import main.GameGraphic;

public final class ho {
   public int a;
   public int b;
   public int c;
   private int q;
   private int r;
   public int d;
   private int s;
   private int t;
   private int u;
   private int v;
   private int w;
   public int e;
   private int x;
   public int f;
   public int g;
   public int h;
   public static int i;
   public static int j;
   public static int k;
   public static int l;
   private int y;
   public boolean m = false;
   private boolean z = false;
   private long A;
   private long B = 0L;
   private boolean C;
   private int D = 0;
   private int E = 0;
   public int n;
   public int o;
   private int F;
   private int G;
   private int H;
   public boolean p = false;
   private boolean I = false;
   private long J = 0L;
   private long K = 0L;
   private int L;
   private int M;

   public final void a(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      this.z = false;
      this.w = var1;
      this.e = var2;
      this.t = var6 / var4;
      this.s = var5 / var3;
      this.x = var9;
      this.u = var3;
      this.v = var4;
      this.q = var5;
      this.r = var8;
      this.d = var7;
      this.y = 0;
      j = 0;
      i = 0;
      this.c = var6 - this.r;
      if (this.c < 0) {
         this.c = 0;
      }

      l = 0;
      k = 0;
      this.h = var5 - this.d;
      if (this.h < 0) {
         this.h = 0;
      }

      this.m = true;
      this.B = 0L;
   }

   public final void a(int var1) {
      this.y = var1;
      this.b();
   }

   public final void a() {
      ++this.B;
      this.C = false;
      if (GameGraphic.b[8]) {
         this.y += this.s;
         if (this.y >= this.x) {
            this.y = 0;
         }
      } else if (GameGraphic.b[2]) {
         this.y -= this.s;
         if (this.y < 0) {
            this.y = this.x - 1;
         }
      } else if (GameGraphic.b[6]) {
         ++this.y;
         if (this.y >= this.x) {
            this.y = 0;
         }
      } else if (GameGraphic.b[4]) {
         --this.y;
         if (this.y < 0) {
            this.y = this.x - 1;
         }
      }

      if (GameGraphic.b[4] || GameGraphic.b[6] || GameGraphic.b[8] || GameGraphic.b[2]) {
         this.C = true;
         GameGraphic.r.a(this.y, false);
         GameGraphic.b[4] = false;
         GameGraphic.b[6] = false;
         GameGraphic.b[8] = false;
         GameGraphic.b[2] = false;
      }

      if (this.C) {
         this.b();
      }

      if (GameGraphic.t == null && GameGraphic.v == null) {
         if (this.H > 0) {
            --this.H;
            if (this.H == 0 && GameGraphic.r != dp.a) {
               GameGraphic.r.a(this.y, true);
            }

         } else {
            if (GameGraphic.g && GameGraphic.a(this.w, this.e, this.q, this.r)) {
               this.M = GameGraphic.k;
               this.L = GameGraphic.j;
               GameGraphic.g = false;
               this.A = this.B;
               this.D = i;
               this.E = k;
               this.p = true;
               this.n = 0;
               this.o = 0;
            }

            if (this.p) {
               long var1 = this.B - this.A;
               int var3 = this.M - GameGraphic.i;
               this.M = GameGraphic.i;
               int var4 = this.L - GameGraphic.h;
               this.L = GameGraphic.h;
               if (GameGraphic.e) {
                  if (this.B % 2L == 0L) {
                     this.F = GameGraphic.i;
                     this.G = GameGraphic.h;
                     this.J = this.B;
                     this.K = this.B;
                  }

                  this.n = 0;
                  this.o = 0;
                  if (j > 0 && j < this.c) {
                     j = this.D + var3;
                     this.D = j;
                  } else {
                     j = this.D + GameGraphic.l() / 2;
                  }

                  if (l > 0 && l < this.h) {
                     l = this.E + var4;
                     this.E = l;
                  } else {
                     l = this.E + GameGraphic.k() / 2;
                  }

                  i = j;
                  k = l;
                  if (var1 < 20L) {
                     var3 = (j + GameGraphic.i - this.e) / this.v;
                     var4 = (l + GameGraphic.h - this.w) / this.u;
                     this.y = var3 * this.s + var4;
                     if (this.y < 0) {
                        this.y = 0;
                     }

                     if (this.y >= this.t * this.s) {
                        this.y = this.t * this.s - 1;
                     }

                     GameGraphic.r.a(this.y, false);
                  }

                  if (awClass.f(GameGraphic.l()) < 10 * gy.Y && awClass.f(GameGraphic.k()) < 10 * gy.Y) {
                     if (var1 > 3L && var1 < 8L) {
                        this.I = false;
                        GameGraphic.r.a(false);
                     }
                  } else {
                     GameGraphic.r.a(true);
                  }
               }

               if (GameGraphic.f) {
                  this.p = false;
                  var3 = (int)(this.B - this.J);
                  var4 = this.F - GameGraphic.i;
                  int var5 = this.G - GameGraphic.h;
                  if (awClass.f(var4) > 40 && var3 < 20 && j > 0 && j < this.c) {
                     this.n = var4 / var3 * 10;
                  }

                  var3 = (int)(this.B - this.K);
                  if (awClass.f(var5) > 40 && var3 < 20 && l > 0 && l < this.h) {
                     this.o = var5 / var3 * 10;
                  }

                  this.J = -1L;
                  this.K = -1L;
                  if (awClass.f(GameGraphic.l()) < 10 * gy.Y && awClass.f(GameGraphic.k()) < 10 * gy.Y) {
                     if (var1 <= 4L) {
                        this.H = 5;
                        GameGraphic.r.a(false);
                     } else {
                        GameGraphic.r.a(this.y, true);
                        if (GameGraphic.r != dp.a) {
                           GameGraphic.r.a(true);
                        }
                     }

                     this.I = false;
                  }

                  GameGraphic.f = false;
               }
            }

         }
      }
   }

   private void b() {
      if (!GameGraphic.e) {
         if ((j = this.y / this.s * this.v - this.r / 2 + this.v / 2) < 0) {
            j = 0;
         }

         if (j > this.c) {
            j = this.c;
         }

         if (this.y / this.s > this.t - 1 || this.y / this.s == 0) {
            i = j;
         }

         if ((l = this.y % this.s * this.u - this.d / 2 + this.u / 2) < 0) {
            l = 0;
         }

         if (l > this.h) {
            l = this.h;
         }

         if (this.y % this.s > this.s - 1 || this.y % this.s == 0) {
            k = l;
         }
      }

   }
}
