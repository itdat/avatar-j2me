package avatar;

import java.io.InputStream;
import java.util.Vector;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import main.GameGraphic;
import main.GameMidlet;

public final class go extends hj {
    public static go INST; // a
    public static int b;
    private String ay;
    public static Vector c;
    private static Vector az = new Vector();
    public static Vector d = new Vector();
    public static Vector e = new Vector();
    public static Vector f;
    public static Vector g;
    public static Vector h;
    public static Vector i = new Vector();
    public static Vector[] j = new Vector[2];
    public static Image[] k;
    public static String l;
    public static Image m;
    public static Image n;
    public static Image o;
    public static ht p;
    public static ht q;
    public static ht r;
    public static ht s;
    public static ht t;
    public static ht u;
    public dr[] v;
    private Vector aA;
    public static int w;
    public static int x;
    private byte[] aB = new byte[]{33, 34, 35, 36, 37};
    private byte[] aC = new byte[]{33, 120, 121, 122, 123};
    private Vector aD = new Vector();
    public static boolean y = false;
    public static boolean z = false;
    public static dr A;
    public static dr B;
    public static dr C;
    public static dr D;
    public static byte E = -1;
    public static byte F;
    private dr aE;
    private int aF;
    private static int aG = 12;
    private static int aH = 4;
    public static int G = -1;
    public static int H = -1;
    private int aI;
    private long aJ;
    private long aK;
    private static int aL = 0;
    public static boolean I = false;
    private static boolean aM = false;
    private static final byte[][] aN = new byte[][]{{0, 0, 0, 0, 0, 1, 1, 1, 1, 1}, {2, 2, 2, 2, 2, 3, 3, 3, 3, 3}, {4, 4, 4, 4, 4, 5, 5, 5, 5, 5}, {6, 6, 6, 6, 6, 7, 7, 7, 7, 7}, {8, 8, 8, 8, 8, 9, 9, 9, 9, 9}};
    private static Button aO;
    private static Button aP;
    private static Button aQ;
    private static Button aR;
    private static Button aS;
    private static Button aT;
    public static kc J;
    private Button aU;
    private Button aV;
    public Vector K = new Vector();
    private boolean aW = false;
    private boolean aX = false;
    public static int L = -1;
    ai M;
    private long aY = -1L;
    public static boolean N = false;
    private boolean aZ;
    private Vector ba = new Vector();
    private boolean bb = false;
    private int bc = 0;
    public static byte O;
    public static byte P;
    public static byte Q;
    public static boolean R = false;
    public static int S = -1;
    public static int T = -1;
    public static int U;
    public static short V = 0;
    private static int bd = -1;
    private static String be = "";
    private boolean bf = true;
    private int bg = 0;
    public static int W;
    public static int X;

    // b
    public static go getInstance() {
       if (INST == null) {
          INST = new go();
       }
       return INST;
    }

    public final void a() {
        super.a();
    }

    public static void e() {
        I = false;
        aM = false;
        if (t == null) {
            ImageModel.b(StringEntity.FARM_AV);
            m = ImageModel.getImageFromIndex("buyLand");
            t = ht.a("cut", 24 * gy.Y, 24 * gy.Y);
            p = ht.a("vp", 16 * gy.Y, 16 * gy.Y);
            (k = new Image[2])[0] = ImageModel.getImageFromIndex("w");
            k[1] = ImageModel.getImageFromIndex("g");
            q = ht.a("wg", 13 * gy.Y, 9 * gy.Y);
            r = ht.a("m", 27 * gy.Y, 17 * gy.Y);
            s = ht.a("tc", 13 * gy.Y, 13 * gy.Y);
            o = ImageModel.getImageFromIndex("focus");
            ImageModel.cleanUp();
        }
    }

    public final void c() {
        aO = new Button(StringEntity.CHOOSE, 0);
        aP = new Button(StringEntity.MENU, 7);
        aQ = new Button((String)null, 2);
        aR = new Button((String)null, 3);
        super.ac = aP;
    }

    public go() {
        j[0] = new Vector();
        j[1] = new Vector();
        this.c();
        ImageModel.b(StringEntity.FARM_AV);
        n = ImageModel.getImageFromIndex("coin");
        u = ht.a("iB", 9 * gy.Y, 13 * gy.Y);
        ImageModel.cleanUp();
        this.r();
        e();
        aS = new Button(StringEntity.DONE, 8);
        aT = new Button(StringEntity.NEXT, 9);
        this.aU = new Button(StringEntity.NEXT, 16, this);
        this.aV = new Button(StringEntity.CLOSE, 18, this);
    }

    private void q() {
        Vector vector = new Vector();
        for(int i = 0; i < d.size(); ++i) {
            dc var3 = (dc)d.elementAt(i);
            az var4 = b(var3.a);
            if (var4.e == 5 && (var4.d == 4 || var4.d == 101)) {
                vector.addElement(new hg(this, var4.f, new bx(this, var3), var4));
            }
        }
        a(vector);
    }

    private void r() {
        this.K.addElement(aeClass.getInstance().f);
        Button var1 = new Button(StringEntity.EXIT, 20);
        this.K.addElement(var1);
    }

    private void s() {
        Vector vector = new Vector();
        for(int i = 0; i < az.size(); ++i) {
            dc var3 = (dc)az.elementAt(i);
            if (gb.b((int)var3.a) != null) {
                vector.addElement(new bz(this, var3.f + "(" + var3.e + ")", 7, i, var3));
            }
        }
        a(vector);
    }

    public final void d() {
        GameGraphic.i();
        cx.getInstance().d((int)8);
    }

    private void t() {
        int var1 = this.j(A.a, A.b);
        if (var1 - c.size() == 0) {
            GameGraphic.i();
            Farm.getInstance().b(b);
        } else {
            if (var1 >= 0 && var1 < c.size()) {
               cf var8;
               if ((var8 = (cf)c.elementAt(var1)).q == 5) {
                  this.u();
                  return;
               }

               if (var8.c != -1 || (var8.p != 1 || var8.o != this.aB[1]) && (var8.p != 2 || var8.o != this.aC[1])) {
                  this.a(var8);
               } else {
                  go var9 = this;
                  if (az.size() != 0) {
                     if (E == -1) {
                        Vector var2 = new Vector();
                        int var3 = this.j(A.a, A.b);
                        cf var4 = (cf)c.elementAt(var3);
                        cf var5 = null;
                        if (var3 > 0) {
                           var5 = (cf)c.elementAt(var3 - 1);
                        }

                        for(int var6 = 0; var6 < az.size(); ++var6) {
                           dc var7;
                           if (gb.b((int)(var7 = (dc)az.elementAt(var6)).a) != null) {
                              var2.addElement(new bn(var9, var7.f + "(" + var7.e + ")", 5, var6, var7));
                           }
                        }

                        if (b == GameMidlet.i.w && (var4.p == 1 && var3 == 0 || var3 > 0 && var4.p < var5.p)) {
                           var2.addElement(new bp(var9, StringEntity.UPGRADE, 11));
                        }

                        a(var2);
                     }

                     return;
                  }
                   GameGraphic.showAlert(StringEntity.OUT_OF_SEED);
               }
            }
       }
    }

    public static void a(String var0) {
        Vector vector = new Vector();
        vector.addElement(new Button(StringEntity.COIN, 51));
        vector.addElement(new Button(StringEntity.TAEL, 52));
        vector.addElement(GameGraphic.ad);
        GameGraphic.a(var0, vector);
    }

    private void a(ii var1) {
        if (E != -1) {
            this.aD.addElement(var1);
        } else {
            var1.a();
        }
    }

    // hasMedicine
    private boolean h(int var1, int var2) {
        boolean hasMedicine = false;
        for(int i = 0; i < d.size(); ++i) {
            az var5 = b(((dc)d.elementAt(i)).a);
            if (var5.d == 0 && var5.e == var2) {
                this.a((ii)(new bs(this, var5, var1)));
                hasMedicine = true;
                break;
            }
        }
        if (!hasMedicine) {
            GameGraphic.showAlert(StringEntity.OUT_OF_MEDICINE);
        }
        return hasMedicine;
    }

   private void a(cf var1) {
      int var2 = this.j(A.a, A.b);
      cf var3 = (cf)c.elementAt(var2);
      cf var4 = null;
      if (var2 > 0) {
         var4 = (cf)c.elementAt(var2 - 1);
      }

      bv var5 = null;
      if (b == GameMidlet.i.w && (var3.p == 1 && var2 == 0 || var2 > 0 && var3.p < var4.p)) {
         var5 = new bv(this, StringEntity.UPGRADE, 11);
      }

      if (var1.c != -1 && var1.q < 6 && var1.o == 36) {
         this.a((ii)(new bg(this)));
      }

      if (var1.c == -1 || var1.q >= 6) {
         bi var7 = new bi(this, var1);
         if (var5 != null) {
            Vector var8;
            (var8 = new Vector()).addElement(new bk(this, StringEntity.be, var7));
            var8.addElement(var5);
            a(var8);
            return;
         }

         this.a((ii)var7);
      }

      if (var1.c != -1 && var1.q < 6 && var2 < c.size() && d.size() > 0) {
         if (var1.j) {
            this.h(var2, 7);
         } else if (var1.k) {
            this.h(var2, 3);
         } else if (var1.n < 80) {
            this.h(var2, 2);
         }
      }

      if (E == -1) {
         Vector var9 = new Vector();
         em var6 = new em(this, StringEntity.bd, 1);
         var9.addElement(var6);
         if (b == GameMidlet.i.w) {
            var9.addElement(new et(this, StringEntity.be, new en(this, var1)));
         }

         if (var5 != null) {
            var9.addElement(var5);
         }

         for(var2 = 0; var2 < d.size(); ++var2) {
            dc var10;
            az var12;
            if ((var12 = b((var10 = (dc)d.elementAt(var2)).a)).d == 0 && (var12.e == 3 && var1.k || var12.e == 7 && var1.j || var12.e != 3 && var12.e != 7)) {
               String var11 = var12.f + "(" + var10.e + ")";
               var9.addElement(new hg(this, var11, 6, var2, var12));
            }
         }

         a(var9);
      }

   }

   public static void a(Vector var0) {
      int var1 = ir.i * gy.Y;
      if (GameGraphic.H) {
         var1 += var1 / 3;
      }
      le.getInstance().a(var0, GameGraphic.o, var1, var1);
   }

   public final void a(int var1) {
      Farm var2;
      switch(var1) {
      case 0:
         GameGraphic.a(StringEntity.ei, 1, this);
         return;
      case 1:
         Farm.getInstance().d((short)-1);
         dp.b().d();
         return;
      case 2:
         dp.b().d();
         if (U == 0) {
             var2 = Farm.getInstance();
            var2.e((byte)92);
            var2.k();
            return;
         }

         Farm.getInstance().e(0);
         return;
      case 3:
         Farm.getInstance().f(1, 0);
         return;
      case 4:
         Farm.getInstance().f(1, 1);
         return;
      case 5:
         Farm.getInstance().g(1, 0);
         return;
      case 6:
         Farm.getInstance().g(1, 1);
         return;
      case 7:
         Farm.getInstance().c((int)1);
         return;
      case 8:
         Farm.getInstance().d((int)1);
         return;
      case 9:
         Farm.getInstance().h(1, 1);
         return;
      case 10:
         Farm.getInstance().h(1, 2);
         return;
      case 11:
         Farm.getInstance().e(1);
         return;
      case 12:
         GameGraphic.a(StringEntity.dH, (ii)(new eu(this)));
         return;
      case 13:
         Farm.getInstance().i(1, 1);
         return;
      case 14:
         Farm.getInstance().i(1, 2);
         return;
      case 15:
         cy.b().b(true);
         return;
      case 16:
         Farm.getInstance().f(0);
         return;
      case 17:
         (var2 = Farm.getInstance()).e((byte)95);
         var2.k();
         return;
      case 18:
         getInstance().j();
         return;
      case 19:
         (var2 = Farm.getInstance()).e((byte)98);
         var2.k();
         return;
      case 20:
         aM = true;
         super.ac = null;
      default:
      }
   }

   public final void d(int var1, int var2) {
      Farm var3;
      az var4;
      dc var8;
      switch(var1) {
      case 1:
         this.a((byte)1, (int)G);
         return;
      case 2:
         if (ir.p != null) {
            GameGraphic.h();
            Farm.getInstance().d(b, ((gx)ir.p).w);
            return;
         }
         break;
      case 3:
         if (ir.p != null) {
            ad var12 = gb.c(e(((gx)ir.p).w).k);

            for(int var11 = 0; var11 < d.size(); ++var11) {
               if (var2 == var11) {
                  dc var9 = (dc)d.elementAt(var11);
                  this.a(var9, var12.c == 1 ? 0 : 1);
               }
            }

            return;
         }
         break;
      case 4:
         if (ir.p != null) {
            for(var1 = 0; var1 < d.size(); ++var1) {
               if (var2 == var1) {
                  var4 = b((var8 = (dc)d.elementAt(var1)).a);
                  this.a(var4, var8.a, (ai)ir.p);
               }
            }

            return;
         }
         break;
      case 5:
         for(var1 = 0; var1 < az.size(); ++var1) {
            if (var1 == var2) {
               int var10;
               if ((var10 = this.j(A.a, A.b)) >= c.size()) {
                  return;
               }

               i(var1, var10);
            }
         }

         return;
      case 6:
         for(var1 = 0; var1 < d.size(); ++var1) {
            if (var1 == var2) {
               if ((var8 = (dc)d.elementAt(var1)).e > 0) {
                  int var5;
                  if ((var5 = this.j(A.a, A.b)) < c.size() && d.size() != 0) {
                     byte var6;
                     if ((var6 = (var4 = b(var8.a)).e) != 7) {
                        if (var6 == 1) {
                           this.a((byte)2, (int)var4.a);
                        } else {
                           this.a((byte)var6, (int)var4.a);
                        }
                     }

                     Farm.getInstance().doUsingItem(b, var5, var4.a);
                  }
               } else {
                    GameGraphic.showAlert(StringEntity.bf + var8.f);
               }
            }
         }

         return;
      case 7:
         this.h(var2);
         return;
      case 8:
         this.a((int)5, (int)-1);
         this.s();
         return;
      case 9:
         this.aX = true;
         this.h(0);
         return;
      case 10:
         y = true;

         for(var1 = this.bg; var1 < i.size(); ++var1) {
            ai var7 = (ai)i.elementAt(var1);
            boolean var10000;
            if (var7.j[1]) {
               ir.p = var7;
               do1.a().a(var7.aw * gy.Y, var7.ax * gy.Y);
               do1.g = true;
               super.ad = new Button(StringEntity.dU, new s(this, var7));
               super.ac = aS;
               super.ae = aT;
               var10000 = true;
            } else if (var7.j[0]) {
               ir.p = var7;
               do1.a().a(var7.aw * gy.Y, var7.ax * gy.Y);
               do1.g = true;
               super.ad = new Button(StringEntity.dU, new z(this, var7));
               super.ac = aS;
               super.ae = aT;
               var10000 = true;
            } else if (var7.i && !(var7 instanceof dz) && !(var7 instanceof dt)) {
               ir.p = var7;
               do1.a().a(var7.aw * gy.Y, var7.ax * gy.Y);
               do1.g = true;
               super.ad = new Button(StringEntity.dX, new ab(this, var7));
               super.ac = aS;
               super.ae = aT;
               var10000 = true;
            } else if (var7.h < 50) {
               ir.p = var7;
               do1.a().a(var7.aw * gy.Y, var7.ax * gy.Y);
               do1.g = true;
               super.ad = new Button(StringEntity.dZ, new w(this, var7));
               super.ac = aS;
               super.ae = aT;
               var10000 = true;
            } else {
               var10000 = false;
            }

            if (var10000) {
               return;
            }

            ++this.bg;
         }

         this.a((int)8, (int)-1);
         GameGraphic.showAlert(StringEntity.dI);
         return;
      case 11:
         Farm.getInstance().h(0, 0);
         return;
      case 12:
         (var3 = Farm.getInstance()).e((byte)85);
         var3.k();
         return;
      case 13:
         if (J.e > 0) {
            Farm.getInstance().d((int)0);
            return;
         }

         Farm.getInstance().c((int)0);
         return;
      case 14:
         (var3 = Farm.getInstance()).e((byte)87);
         var3.k();
         return;
      case 15:
      case 16:
      case 17:
      case 18:
      case 19:
      default:
         break;
      case 20:
         this.d();
      }

   }

   private void h(int var1) {
      H = 0;
      super.ac = new Button(StringEntity.DONE, 5);
      super.ae = null;
      do1.g = true;
      super.ad = null;
      this.aW = true;
      L = var1;
   }

   private void a(az var1, short var2, ai var3) {
      this.a((ii)(new ep(this, var1, var2, var3)));
   }

   protected final void a(dc var1, int var2) {
      int var3 = GameMidlet.i.K == 0 ? 1 : -1;
      int var4 = j[var2].size();
      if (var1.e - var4 <= 0) {
         GameGraphic.showAlert(StringEntity.bw);
      } else {
         for(int var5 = 0; var5 < 3 && var5 < var1.e - var4; ++var5) {
            dn var6 = new dn(GameMidlet.i.aw, GameMidlet.i.ax - 40);
            az var7 = b(var1.a);
            var6.j = var1.a;
            var6.d = var6.e = 2;
            var6.b = -(4 + awClass.e(3));
            var6.c = var3 * (2 + awClass.e(3));
            var6.g = GameMidlet.i.ax - 20 + awClass.e(4) * 5;
            if (var7.d == 4) {
               int var8 = ir.d(GameMidlet.i.aw, GameMidlet.i.ax + 23);
               if (ir.d[var8] == 14) {
                  var6.g = 50 + awClass.e(50);
                  var6.c = var3 * awClass.e(3);
               }
            }

            var6.a = new ft(this, var6);
            j[var2].addElement(var6);
            ir.n.addElement(var6);
         }

      }
   }

   public static void a(int var0, int var1, cf var2, ai var3) {
      if (ir.a != 25 && var0 != var1) {
         String var4 = "";
         if (var1 - var0 > 0) {
            var4 = var4 + "+";
         }

         int var5;
         int var6;
         if (var2 != null) {
            var5 = var2.a * ir.i + ir.i / 2;
            var6 = var2.b * ir.i - ir.i / 2;
         } else {
            var5 = var3.aw;
            var6 = var3.ax - 30;
         }
         GameGraphic.a(var4 + (var1 - var0), var5, var6, -1, 0, -1);
      }

   }

   private void u() {
      if (GameMidlet.i.w == b) {
         int var1 = this.j(A.a, A.b);
         GameMidlet.i.getClass();
         Farm.getInstance().doHarvest(b, var1);
      }
   }

   private static void i(int var0, int var1) {
      if (GameGraphic.I) {
         avatar.bb.g();
      }

      dc var2 = (dc)az.elementAt(var0);
      Farm.getInstance().a((int)b, (int)var1, var2.a);
   }

   private int j(int var1, int var2) {
      for(int var3 = 0; var3 < this.v.length; ++var3) {
         for(int var4 = 0; var4 < aG; ++var4) {
            int var5 = this.v[var3].a + var4 / aH;
            int var6 = this.v[var3].b + var4 % aH;
            if (var1 == var5 && var2 == var6) {
               return var3 * aG + var4;
            }
         }
      }

      return -1;
   }

   private void a(byte var1, int var2) {
      G = var2;
      E = var1;
      GameMidlet.i.Q = -1;
      GameMidlet.i.i = -1;
      GameMidlet.i.j = -1;
      if (E == 4) {
         this.aE = new dr(ir.p.aw / ir.i, ir.p.ax / ir.i);
      } else {
         this.aE = new dr(A.a, A.b);
      }

      GameMidlet.i.D = this.aE.b * ir.i + ir.i / 2;
      GameMidlet.i.C = this.aE.a * ir.i;
      if (GameMidlet.i.K == gx.J) {
         hn var10000 = GameMidlet.i;
         var10000.C += ir.i;
      }

   }

   private void v() {
      for(int var1 = 0; var1 < this.v.length; ++var1) {
         for(int var2 = 0; var2 < aG; ++var2) {
            int var3 = this.v[var1].a + var2 / aH;
            int var4 = this.v[var1].b + var2 % aH;
            if (var1 * aG + var2 < c.size()) {
               ir.a(var3, (int)var4, (byte)51);
               cf var5;
               (var5 = (cf)c.elementAt(var1 * aG + var2)).e = (short)(var1 * aG + var2);
               var5.a = var3;
               var5.b = var4;
               var5.aw = var3 * ir.i + ir.i / 2;
               var5.ax = var4 * ir.i + 18;
               this.c(var1 * aG + var2);
               ir.l.addElement(var5);
            } else {
               if (var1 * aG + var2 == c.size()) {
                  ir.l.addElement(new cc(-3, var3 * ir.i + 20, var4 * ir.i + 20, m.getWidth()));
                  ir.a(var3, (int)var4, (byte)51);
                  ir.a(ir.l);
               }

               if (ir.d[var4 * ir.e + var3] == this.aB[0]) {
                  ir.a(ir.l);
                  return;
               }

               if (var3 == this.v[var1].a && var4 == this.v[var1].b) {
                  ir.d[var4 * ir.e + var3] = 4;
               }
            }
         }
      }

      ir.a(ir.l);
   }

   public final void k() {
      this.aF += 2;
      if (this.aF >= 10) {
         this.aF = 0;
      }

      if (E != -1) {
         F = aN[E][this.aF];
         ++this.aI;
         if (this.aI > 10) {
            this.aI = 0;
            this.w();
         }
      }

      if (ir.a == 24 && ir.a == 53 && (System.currentTimeMillis() - this.aJ) / 1000L > 300L) {
         this.aJ = System.currentTimeMillis();
         this.b(b, true);
      }

        GameGraphic.x.b();
        if (!y && !N && L == -1) {
            this.y();
        }

      int var2;
      label143: {
         if (E != -1 && this.aY == -1L && GameMidlet.i.H == 0) {
            this.aY = System.currentTimeMillis() / 100L;
            var2 = -1;
            if (this.aE != null) {
               var2 = this.j(this.aE.a, this.aE.b);
            }

            if (E == 4) {
               var2 = 0;
            }

            if (this.aE.a * ir.i < GameMidlet.i.aw) {
               GameMidlet.i.K = gx.J;
            } else {
               GameMidlet.i.K = 0;
            }

            GameMidlet.i.t = GameMidlet.i.K;
            if (this.M != null) {
               this.M.p = false;
               this.M = null;
            }

            if (var2 == -1) {
               this.w();
               break label143;
            }

            cc var6 = new cc(-2, GameMidlet.i.aw, GameMidlet.i.ax - 5, t.a);
            ir.l.addElement(var6);
            byte var3 = 0;
            if (E == 0) {
               var3 = 5;
               var6.ax = GameMidlet.i.ax - 8;
            }

            if (GameMidlet.i.K == 0) {
               var6.aw = GameMidlet.i.aw + 10 + var3;
            } else {
               var6.aw = GameMidlet.i.aw - 10 - var3;
            }
         }

         if (this.aY != -1L && (E == 1 || E == 0 || E == 2) && System.currentTimeMillis() / 100L - this.aY > 2L) {
            this.aY = System.currentTimeMillis() / 100L;
            if (GameMidlet.i.H == 6) {
               GameMidlet.i.b((byte)0);
            } else {
               GameMidlet.i.b((byte)6);
            }
         }
      }

      if ((ir.a == 24 || ir.a == 53) && i.size() > 0 && ++aL > 250) {
         aL = 0;
         var2 = awClass.e(i.size());
         ai var7 = (ai)i.elementAt(var2);
         String var8 = "";
         if (var7.j[0]) {
            var8 = var8 + StringEntity.bi;
         }

         if (var7.j[1]) {
            if (!var8.equals("")) {
               var8 = var8 + ", ";
            }

            var8 = var8 + StringEntity.bj;
         }

         if (var7.i) {
            if (!var8.equals("")) {
               var8 = var8 + ", ";
            }

            var8 = var8 + StringEntity.bk;
         }

         if (var7.h < 20) {
            if (!var8.equals("")) {
               var8 = var8 + ", ";
            }

            var8 = var8 + StringEntity.bl;
         }

         if (!var8.equals("")) {
            var7.O = new fh(25, var8, (byte)0);
            var7.O.a(var7.aw, var7.ax - 45);
         }
      }

      if (System.currentTimeMillis() / 1000L - this.aK / 1000L >= 1L) {
         if (U > 0) {
            --U;
         }

         this.aK = System.currentTimeMillis();

         for(int var1 = 0; var1 < c.size(); ++var1) {
            cf var9;
            if ((var9 = (cf)c.elementAt(var1)).c != -1 && var9.q < 5) {
               ++var9.h;
               if ((long)(gb.b(var9.c).e * 60 * 60) - var9.h <= 0L) {
                  var9.q = 5;
               }
            }
         }
      }

   }

   private void w() {
      int var1;
      for(var1 = 0; var1 < ir.l.size(); ++var1) {
         if (((cc)ir.l.elementAt(var1)).f == -2) {
            ir.l.removeElementAt(var1);
            if (var1 > 0) {
               --var1;
            }
         }
      }

      this.aY = -1L;
      var1 = -1;
      if (this.aE != null) {
         int var2 = this.aE.b;
         var1 = this.aE.a;
         int var3 = c.size();
         int var4 = 0;

         int var10000;
         while(true) {
            if (var4 >= var3) {
               var10000 = -1;
               break;
            }

            cf var5;
            if ((var5 = (cf)c.elementAt(var4)).a == var1 && var5.b == var2) {
               var10000 = var4;
               break;
            }

            ++var4;
         }

         var1 = var10000;
      }

      if (var1 == -1) {
         E = -1;
         GameMidlet.i.H = 0;
         GameMidlet.i.Q = 0;
         this.x();
      } else {
         if (G == -1) {
            cf var6 = (cf)c.elementAt(var1);
            switch(E) {
            case 0:
               this.a((cf)var6, 1);
               var6.q = 0;
               ir.d[var6.b * ir.e + var6.a] = var6.o;
               if (var6.c != -1) {
                  Farm.getInstance().a((int)b, (int)var1, -1);
               }

               var6.c = -1;
               if (GameGraphic.I) {
                  avatar.bb.g();
               }
               break;
            case 1:
               this.a((cf)var6, 4);
               var6.i = false;
               ir.d[var6.b * ir.e + var6.a] = var6.o;
               Farm.getInstance().doUsingItem(b, var1, 100);
            case 2:
            }
         }

         G = -1;
         this.aE = null;
         E = -1;
         GameMidlet.i.Q = 0;
         GameMidlet.i.H = 0;
         this.x();
      }
   }

   private void x() {
      if (y) {
         this.d(10, -1);
      } else if (this.aD.size() > 0) {
         ii var1;
         (var1 = (ii)this.aD.elementAt(0)).a();
         this.aD.removeElement(var1);
      } else {
         if (this.aX) {
            this.A();
         }

      }
   }

   private void y() {
      if (ir.a != 25) {
         int var1;
         if (GameMidlet.i.K == gx.J) {
            var1 = GameMidlet.i.aw - 23;
         } else {
            var1 = GameMidlet.i.aw + 23;
         }

         var1 /= ir.i;
         int var2 = GameMidlet.i.ax / ir.i;
         short var3 = ir.g[var2 * ir.e + var1];
         int var4 = this.j(var1, var2);
         if (var3 == 51 && var4 <= c.size()) {
            A.a = var1;
            A.b = var2;
            if (E != 0 && E != 1) {
               super.ad = aO;
            } else {
               super.ad = null;
            }
         } else {
            if (super.ad == aO || super.ad == aR) {
               super.ad = null;
            }

            A.a = -1;
            A.b = -1;
            if (ir.p == null) {
               var2 = ir.d(GameMidlet.i.aw + 12, GameMidlet.i.ax);
               int var5 = ir.d(GameMidlet.i.aw, GameMidlet.i.ax + 12);
               boolean var10000;
               if ((ir.d[var2] != 100 || GameMidlet.i.K != 0) && ir.d[var5] != 14) {
                  super.ad = null;
                  var10000 = false;
               } else {
                  super.ad = aR;
                  var10000 = true;
               }

               if (var10000) {
                  return;
               }
            }

            if (ir.p != null && super.ad == null) {
               if (super.ae == null) {
                  super.ae = ir.q;
               }

               super.ad = aQ;
            }

            if (ir.p == null) {
               super.ae = null;
            }

            if (ir.p == null && super.ad == aQ) {
               super.ad = null;
            }

         }
      }
   }

   public final void l() {
      if (this.aZ && GameMidlet.i.H == 0 && GameMidlet.i.Q == 0 && GameMidlet.i.aw == GameMidlet.i.C && GameMidlet.i.ax == GameMidlet.i.D) {
         this.aZ = false;
         GameMidlet.i.K = 0;
         this.y();
         if (E == -1) {
            if (L != -1) {
               if (this.ba.size() > 0 && L != -1) {
                  label244: {
                     dr var3 = (dr)this.ba.elementAt(0);
                     cf var4;
                     (var4 = (cf)c.elementAt(var3.c)).l = false;
                     A.a = var4.aw / ir.i;
                     A.b = var4.ax / ir.i;
                     if (this.aX) {
                        if (var4.q == 5) {
                           this.u();
                           this.A();
                        } else {
                           boolean var5 = false;
                           if (var4.c != -1 && var4.q < 6 && var4.o == 36) {
                              this.a((ii)(new fp(this, var4)));
                              var5 = true;
                           }

                           if (var4.c != -1 && var4.q < 6) {
                              if (var3.c >= c.size()) {
                                 break label244;
                              }

                              if (var4.j && this.h(var3.c, 7)) {
                                 var5 = true;
                              }

                              if (var4.k && this.h(var3.c, 3)) {
                                 var5 = true;
                              }

                              if (var4.n < 80) {
                                 boolean var10 = false;

                                 for(int var6 = 0; var6 < d.size(); ++var6) {
                                    az var7;
                                    if ((var7 = b(((dc)d.elementAt(var6)).a)).e == 2 && (var7.a == 111 || var7.a == 112)) {
                                       var10 = true;
                                       Farm.getInstance().doUsingItem(b, var3.c, var7.a);
                                       break;
                                    }
                                 }

                                 if (!var10) {
                                    GameGraphic.showAlert(StringEntity.dM);
                                 }
                              }
                           }

                           if (!var5) {
                              this.A();
                           }
                        }
                     } else if (var4.q == 5) {
                        this.u();
                        this.A();
                     } else {
                        this.a((ii)(new fq(this, var4)));
                        this.a((ii)(new gc(this, var3)));
                     }

                     this.ba.removeElement(var3);
                  }
               }
            } else {
               L = -1;
               this.t();
            }
         }
      }

      int var2;
      if (H != -1) {
         if (GameGraphic.a(2)) {
            GameGraphic.d[2] = false;
            if ((var2 = H) % 12 % 4 != 0) {
               --var2;
            }

            if (var2 >= 0) {
               H = var2;
            }
         } else if (GameGraphic.a(4)) {
            GameGraphic.d[4] = false;
            var2 = H;
            var2 -= 4;
            if (var2 >= 0) {
               H = var2;
            }
         } else if (GameGraphic.a(6)) {
            GameGraphic.d[6] = false;
            var2 = H;
            var2 += 4;
            if (var2 < c.size()) {
               H = var2;
            }
         } else if (GameGraphic.a(8)) {
            GameGraphic.d[8] = false;
            if ((var2 = H) % 12 % 4 != 3) {
               ++var2;
            }

            if (var2 < c.size()) {
               H = var2;
            }
         } else if (GameGraphic.a(5)) {
            label276: {
               var2 = ir.i;
               cf var8;
               if ((var8 = (cf)c.elementAt(H)).c != -1 && var8.q < 6) {
                  if (this.aX) {
                     if (!var8.l) {
                        this.ba.addElement(new dr(var8.aw / var2, var8.ax / var2, H));
                     }

                     var8.l = true;
                     this.A();
                     break label276;
                  }
               } else if (!this.aX) {
                  if (!var8.l) {
                     this.ba.addElement(new dr(var8.aw / var2, var8.ax / var2, H));
                  }

                  var8.l = true;
                  this.A();
                  break label276;
               }

               GameGraphic.showAlert(StringEntity.dJ);
            }
         }

         if (GameGraphic.Z == 0) {
            cf var12 = (cf)c.elementAt(H);
            do1.a().a(var12.aw, var12.ax);
         }
      }

      int var9;
      int var11;
      cf var13;
      if (GameGraphic.g) {
         var2 = GameGraphic.h + do1.a().a;
         var9 = GameGraphic.i + do1.a().b;
         var11 = ir.i * gy.Y;
         if (var9 / var11 * ir.e + var2 / var11 >= 0 && var9 / var11 * ir.e + var2 / var11 <= ir.g.length && ir.g[var9 / var11 * ir.e + var2 / var11] == 51) {
            this.bb = true;
            N = true;
            var11 = this.j(var2 / var11, var9 / var11);
            var13 = (cf)c.elementAt(var11);
            A.a = var13.aw / ir.i;
            A.b = var13.ax / ir.i;
         }
      }

      if (this.bb && GameGraphic.f) {
         this.bb = false;
         N = false;
         var2 = GameGraphic.h + do1.a().a;
         var9 = GameGraphic.i + do1.a().b;
         var11 = ir.i * gy.Y;
         if (!this.aW && super.ad != null && A != null && var2 / var11 == A.a && var9 / var11 == A.b) {
            super.ad.b();
         } else if (var9 / var11 * ir.e + var2 / var11 >= 0 && var9 / var11 * ir.e + var2 / var11 <= ir.g.length && ir.g[var9 / var11 * ir.e + var2 / var11] == 51) {
            var11 = this.j(var2 / var11, var9 / var11);
            var13 = (cf)c.elementAt(var11);
            A.a = var13.aw / ir.i;
            A.b = var13.ax / ir.i;
            if (this.aW && var11 >= 0 && var11 < c.size()) {
               H = var11;
               if (var13.c != -1 && var13.q != 5 && var13.q < 6) {
                  GameGraphic.f = false;
                  if (this.aX) {
                     if (!var13.l) {
                        this.ba.addElement(new dr(var2 / ir.i, var9 / ir.i, var11));
                     }

                     var13.l = true;
                     this.A();
                  } else if (var13.q != 5) {
                     GameGraphic.showAlert(StringEntity.dL);
                  }
               } else {
                  GameGraphic.f = false;
                  if (this.aX && var13.q != 5) {
                     GameGraphic.showAlert(StringEntity.dK);
                  } else {
                     if (!var13.l) {
                        this.ba.addElement(new dr(var2 / ir.i, var9 / ir.i, var11));
                     }

                     var13.l = true;
                     this.A();
                  }
               }
            } else {
               GameGraphic.j = GameGraphic.h -= ir.i * gy.Y;
               this.aZ = true;
            }
         }
      }

      if (GameGraphic.b[5] && (ir.a == 24 || ir.a == 53) && super.ac != null && super.ad == null) {
         super.ac.b();
      }

      super.l();
      GameGraphic.x.a();
      if (E == -1) {
         GameMidlet.i.e();
      }

   }

   private void A() {
      if (this.ba.size() > 0 && L != -1) {
         this.aZ = true;
         dr var1 = (dr)this.ba.elementAt(0);
         if (GameMidlet.i.at == null) {
            ir.u = new dr();
            GameMidlet.i.n();
         }

         ir.u.a = var1.a * 24 - 24;
         ir.u.b = var1.b * 24 + 12;
         GameMidlet.i.Q = -5;
         GameMidlet.i.R = -1;
         GameMidlet.i.C = GameMidlet.i.aw;
         GameMidlet.i.D = GameMidlet.i.ax;
         GameMidlet.i.av = ir.u;
         GameMidlet.i.m();
      }

   }

   public final void a(Graphics var1) {
      this.b(var1);
      if (GameGraphic.D == null || !avatar.bb.d) {
         super.a(var1);
      }

      GameGraphic.a(var1);
   }

   public final void b(Graphics var1) {
      GameGraphic.x.b(var1);
      GameGraphic.x.d(var1);
      if (H >= 0) {
         if (this.bc >= 8) {
            this.bc = 0;
         }

         cf var4 = (cf)c.elementAt(H);
         var1.drawImage(aeClass.d, var4.aw * gy.Y, (var4.ax - 24 + this.bc / 2) * gy.Y, 3);
         ++this.bc;
      } else if (GameGraphic.Z == 0 && A != null && A.a != -1 && ir.a != 25) {
         if (this.bc >= 8) {
            this.bc = 0;
         }

         var1.drawImage(aeClass.d, (A.a * ir.i + ir.i / 2) * gy.Y, (A.b * ir.i - 4 + this.bc / 2) * gy.Y, 3);
         ++this.bc;
      }

        if (ir.a != 25) {
            GameGraphic.N.a(var1, this.ay, (B.a + 26) * gy.Y, (B.b - 14) * gy.Y + (gy.Y - 1) * 7, 2);
        }

        GameGraphic.c(var1);
        ir.a(var1);
    }

   public static void a(Vector var0, Vector var1, Vector var2, Vector var3, byte var4, int var5, boolean var6) {
      az = var0;
      z = var6;
      O = var4;
      int var7 = az.size();

      int var8;
      for(var8 = 0; var8 < var7; ++var8) {
         dc var9;
         cb var10;
         if ((var10 = gb.b((int)(var9 = (dc)az.elementAt(var8)).a)) != null) {
            var9.f = var10.a;
         }
      }

      f = var1;

      for(var8 = 0; var8 < f.size(); ++var8) {
         a((dc)f.elementAt(var8));
      }

      d = var2;
      e = var3;
   }

   private static void a(dc var0) {
      if (var0.a < 50) {
         var0.d[0] = gb.b((int)var0.a).h;
         var0.f = gb.b((int)var0.a).a;
      } else {
         if (var0.a < 100) {
            var0.d[0] = gb.c(var0.a).f;
            if (gb.c(var0.a).c == 1) {
               var0.f = StringEntity.bn + " " + gb.c(var0.a).l;
               return;
            }

            if (gb.c(var0.a).c == 2) {
               if (var0.a == 55) {
                  var0.f = StringEntity.dN + " " + gb.c(var0.a).l;
                  return;
               }

               var0.f = StringEntity.bm + " " + gb.c(var0.a).l;
            }
         }

      }
   }

   public static az b(int var0) {
      for(int var1 = 0; var1 < gb.e.size(); ++var1) {
         az var2;
         if ((var2 = (az)gb.e.elementAt(var1)).a == var0) {
            return var2;
         }
      }

      return null;
   }

   public static void a(dc var0, int var1, int var2, int var3) {
      GameMidlet.i.updateMoney(var1, var2, var3);
      dp.n = true;
      if (var0.a >= 50 && var0.a <= 100) {
         c = null;
      }

      if (var0.e > 0) {
         dc var4;
         if (var0.a >= 111) {
            if ((var4 = dc.a(d, var0.a)) != null) {
               var4.e += var0.e;
            } else {
               az var5 = b(var0.a);
               var0.f = var5.f;
               d.addElement(var0);
            }
         } else {
            if (var0.a <= 100 && var0.a < 50) {
               if ((var4 = dc.a(az, var0.a)) != null) {
                  var4.e += var0.e;
               } else {
                  az.addElement(var0);
                  var0.f = gb.b((int)var0.a).a;
               }

               if (az.size() == 0) {
                  az.addElement(var0);
               }
            }

         }
      }
   }

   public final void a(int var1, Vector var2, Vector var3, byte var4, byte var5, short var6, int var7) {
      P = var4;
      Q = var5;
      V = var6;
      U = var7;
      b = var1;
      if (var1 != GameMidlet.i.w) {
         hn var10;
         if ((var10 = cy.b(var1)) == null) {
            GameGraphic.showAlert(StringEntity.bo);
            return;
         }

         if (var10.l == null) {
            var10.a(var10.x);
         }

         this.ay = var10.l;
         j[0].removeAllElements();
         j[1].removeAllElements();
      } else {
         this.ay = GameMidlet.i.l;
      }

      c = var2;
      if (ir.a != 24 && ir.a != 53 && i.size() == 0) {
         i = var3;
      }

      f();
      if (this.bf) {
         if (R || ir.a != 24 && ir.a != 53) {
            R = false;
            A = new dr();
            E = -1;
            this.aI = 0;
            dt.v = -1;
            dz.u = -1;
            this.v = new dr[4];
            GameGraphic.x.e(25);
            GameGraphic.J = 0;
            byte var12 = var5;
            byte var11 = var4;

            try {
               x = ip.r + var12;
               w = dt.u + var11;
               int var14 = D.a / 24;
               int var17 = C.a / 24 + 2;
               InputStream var18;
               ir.d = new short[(var18 = ir.d(25)).available()];

               for(int var20 = 0; var20 < ir.d.length; ++var20) {
                  ir.d[var20] = (short)var18.read();
               }

               short[] var21 = new short[ir.d.length + ir.f * (var12 + var11)];
               int var19 = 0;

               for(var7 = 0; var7 < ir.d.length; ++var7) {
                  var21[var19] = ir.d[var7];
                  ++var19;
                  int var8;
                  if (var7 % ir.e == var14) {
                     for(var8 = 0; var8 < var12; ++var8) {
                        var21[var19] = ir.d[var7];
                        ++var19;
                     }
                  }

                  if (var7 % ir.e == var17) {
                     for(var8 = 0; var8 < var11; ++var8) {
                        var21[var19] = ir.d[var7];
                        ++var19;
                     }
                  }
               }

               ir.e = (short)(ir.e + var12 + var11);
               ir.d = var21;
               ir.l.removeAllElements();
               GameGraphic.x.a((InputStream)null, ir.a + 1, true);
               hn var10000 = GameMidlet.i;
               var10000.aw += var11 * 24;
               ir.a(849, (int)(D.a + 12 + awClass.e(x - 2) * 24), (int)(D.b + 12 + awClass.e(3) * 24));
            } catch (Exception var9) {
               var9.printStackTrace();
            }

            g = new Vector();
            h = new Vector();
            a(1, ex.s, (byte)87, -8, g);
            a(2, dt.s, (byte)86, -7, h);
            var1 = i.size();

            for(int var13 = 0; var13 < var1; ++var13) {
               ai var16;
               if ((var16 = (ai)i.elementAt(var13)) instanceof ip) {
                  ((ip)var16).a();
               } else if (var16 instanceof ex) {
                  ((ex)var16).a();
               } else if (var16 instanceof dz) {
                  ((dz)var16).a();
               } else if (var16 instanceof dt) {
                  ((dt)var16).a();
               } else {
                  var16.a();
               }

               ir.m.addElement(var16);
            }

            GameGraphic.J = 1;
            GameGraphic.h();
         }

         for(var1 = 0; var1 < ir.l.size(); ++var1) {
            cc var15;
            if ((var15 = (cc)ir.l.elementAt(var1)).f < 800 && var15.f >= 100 || var15.f == -3 || var15 instanceof cf) {
               ir.l.removeElement(var15);
               --var1;
            }
         }

         this.v();
         this.aJ = System.currentTimeMillis();
         this.aK = System.currentTimeMillis();
         if (GameGraphic.r != this) {
            this.a();
         }

         if (GameGraphic.I) {
            avatar.bb.g();
         }

         GameMidlet.i.C = GameMidlet.i.aw;
         GameMidlet.i.D = GameMidlet.i.ax;
      }

      this.bf = true;
      if (S != -1) {
         GameMidlet.i.aw = GameMidlet.i.C = S;
         GameMidlet.i.ax = GameMidlet.i.D = T;
         S = -1;
         T = -1;
      }

      super.ac = aP;
      super.ae = null;
      super.ad = null;
   }

   private static void a(int var0, dr var1, byte var2, int var3, Vector var4) {
      int var5 = 0;

      for(int var6 = 0; var6 < i.size(); ++var6) {
         ai var7;
         ad var8;
         if ((var8 = gb.c((var7 = (ai)i.elementAt(var6)).k)).c == var0 && var8.h != -1) {
            boolean var11 = false;

            int var9;
            for(var9 = 0; var9 < var4.size(); ++var9) {
               if (((dr)var4.elementAt(var9)).c == var7.k) {
                  var11 = true;
                  break;
               }
            }

            if (!var11) {
               var9 = var1.a + var5 * 24;
               var4.addElement(new dr(var9, var1.b, var7.k));
               int var10 = ir.d(var9, var1.b);
               ir.g[var10] = var2;
               ir.a(var3, var9, var1.b);
               ++var5;
            }
         }
      }

   }

   public static void f() {
      Vector var0 = new Vector();

      for(int var1 = 0; var1 < i.size(); ++var1) {
         ai var2;
         ad var3 = gb.c((var2 = (ai)i.elementAt(var1)).k);
         if (var2 instanceof is) {
            boolean var4 = false;

            for(int var5 = 0; var5 < var0.size(); ++var5) {
               dr var6;
               if ((var6 = (dr)var0.elementAt(var5)).c == var2.k) {
                  ((is)var2).t = var6.a;
                  var4 = true;
                  break;
               }
            }

            if (!var4) {
               ((is)var2).t = var2.w;
               var0.addElement(new dr(var2.w, 0, var2.k));
            }
         }

         int var7;
         if ((var7 = var3.d * 60 / 3) > 0) {
            var2.d = var2.g / var7;
         }

         if (var2.d > 2) {
            var2.d = 2;
         }

         if (var2.g == -1 || var3.c == 3) {
            var2.d = 0;
         }
      }

   }

   public final void b(int var1, int var2) {
      if (ir.a == 24 || ir.a == 53) {
         dc var3;
         if ((var3 = dc.a(az, var2)) != null) {
            cf var4;
            (var4 = (cf)c.elementAt(var1)).c = var2;
            this.a((cf)var4, 4);
            ir.d[var4.b * ir.e + var4.a] = var4.o;
            var4.q = 0;
            var4.k = false;
            var4.j = false;
            var4.d = 0;
            var4.h = 0L;
            var4.n = 100;
            var4.m = 0;
            --var3.e;
            if (var3.e <= 0) {
               az.removeElement(var3);
            }
         }

      }
   }

   public final void c(int var1) {
      cf var4;
      if ((var4 = (cf)c.elementAt(var1)).c == -1) {
         this.a((cf)var4, 2);
      } else {
         cb var2;
         int var3 = (var2 = gb.d(var4.c)).e * 60 / 5;
         var4.q = var4.d / var3;
         if (var4.q >= 5) {
            var4.q = 5;
         }

         if (var4.d < 0 || var2.f != -1 && var4.d - var2.e * 60 > var2.f * 60 || var4.m == 100 || var4.q < 0) {
            var4.q = 6;
         }

         if (var4.i) {
            this.a((cf)var4, 3);
         } else {
            this.a((cf)var4, 4);
         }
      }

      ir.d[var4.b * ir.e + var4.a] = var4.o;
   }

   private void a(cf var1, int var2) {
      if (var1.p == 2) {
         var1.o = this.aC[var2];
      } else {
         var1.o = this.aB[var2];
      }
   }

   public static void c(int var0, int var1) {
      cf var3 = (cf)c.elementAt(var0);
      if (var1 > 0) {
         cb var2;
         if ((var2 = gb.b(var3.c)).l) {
            GameGraphic.a(var1, var3.a * ir.i + 11, var3.b * ir.i, -1, 0, var2.c[var3.q], -1);
         } else {
            ke var5 = gb.a[var2.c[var3.q]];
            GameGraphic.a(var1, var3.a * ir.i + 11, var3.b * ir.i, -1, awClass.a(var5.c * gy.Y, var5.d * gy.Y, var5.e * gy.Y, var5.f * gy.Y, gb.images[var5.b]), -1);
         }
      }

      if (b == GameMidlet.i.w) {
         var3.q = 6;
         var3.m = 100;
         var3.k = false;
         var3.j = false;
      }

      cb var4;
      dc var6;
      if ((var4 = gb.b(var3.c)).l) {
         if ((var6 = f(var4.j)) != null) {
            var6.e += var1;
         } else {
            (var6 = new dc()).a = var4.j;
            var6.e = var1;
            var6.d[0] = var4.h;
            var6.f = var4.a;
            e.addElement(var6);
         }
      } else if ((var6 = dc.a(f, var4.b)) != null) {
         var6.e += var1;
      } else {
         (var6 = new dc()).a = var4.b;
         var6.e = var1;
         var6.d[0] = gb.b((int)var4.b).h;
         var6.f = gb.b((int)var4.b).a;
         f.addElement(var6);
      }
   }

   public static void e(int var0, int var1) {
      ai var6 = e(var0);
      if (var1 > 0 && var6 != null) {
         ad var2;
         ad var3 = var2 = gb.c(var6.k);
         dc var5;
         if ((var5 = dc.a(f, var3.a)) != null) {
            var5.e += var1;
         } else {
            (var5 = new dc()).a = (short)var3.a;
            var5.e = var1;
            var5.f = var3.l;
            var5.d[0] = var3.f;
            a(var5);
            f.addElement(var5);
         }

         if (fxClass.c(var2.h) != null) {
            dr var7 = null;
            if (var2.c == 1) {
               var7 = a((Vector)g, var6.k);
            } else if (var2.c == 2) {
               var7 = a((Vector)h, var6.k);
            }

            if (var7 != null) {
               GameGraphic.a(var1, var7.a, var7.b - 25, -1, fxClass.c(var2.h).a, -1);
            }
         }

      }
   }

   private static dr a(Vector var0, int var1) {
      for(int var2 = 0; var2 < var0.size(); ++var2) {
         dr var3;
         if ((var3 = (dr)var0.elementAt(var2)).c == var1) {
            return var3;
         }
      }

      return null;
   }

   public static void a(int var0, int var1, byte var2, String var3, int var4, int var5, int var6) {
      if (var0 == b) {
         System.out.println("onOpenLand: " + var1 + "    " + var2);
         GameMidlet.i.updateMoney(var4, var5, var6);
         GameGraphic.showAlert(var3);
      }
   }

   public final void b(int var1, boolean var2) {
      this.bf = var2;
      Farm.getInstance().a(var1);
   }

    public final void a(int var1, String var2) {
        GameGraphic.a(StringEntity.bp + " " + var2 + "?", (ii)(new ge(this, var1)));
    }

   public final void g() {
      Vector var1 = new Vector();

      int var2;
      for(var2 = 0; var2 < gb.b.length; ++var2) {
         fu var4 = new fu(this, StringEntity.CHOOSE, 7, gb.b[var2].b, var2);
         var1.addElement(var4);
      }

      var2 = gb.d.size();

      for(int var3 = 0; var3 < var2; ++var3) {
         ad var6 = (ad)gb.d.elementAt(var3);
         fy var7 = new fy(this, StringEntity.CHOOSE, 8, var3, var6, var3);
         var1.addElement(var7);
      }

      dp.b().a();
      dp.b().a(new String[]{StringEntity.br, StringEntity.bs, StringEntity.aN}, new Vector[]{var1, this.B(), this.C()}, (Vector)null);
      if (GameGraphic.I && !avatar.bb.g) {
         (GameGraphic.D = new bb()).a((hj)dp.a);
      }

   }

   private Vector B() {
      Vector var1 = new Vector();

      for(int var2 = 0; var2 < gb.e.size(); ++var2) {
         az var3;
         if ((var3 = (az)gb.e.elementAt(var2)).c && (var3.h > 0 || var3.g > 0)) {
            var1.addElement(new h(this, StringEntity.CHOOSE, 9, var2, var3, var2));
         }
      }

      return var1;
   }

   private Vector C() {
      Vector var1 = new Vector();
      int var2 = f.size();

      int var3;
      for(var3 = 0; var3 < var2; ++var3) {
         dc var4;
         if (gb.b((int)(var4 = (dc)f.elementAt(var3)).a) != null || var4.a >= 50) {
            ko var5 = new ko(this, StringEntity.bg, new fr(this, var3), var3, var4);
            var1.addElement(var5);
         }
      }

      for(var3 = 0; var3 < e.size(); ++var3) {
         dc var7;
         az var6 = b((var7 = (dc)e.elementAt(var3)).a);
         System.out.println("aaaaaaaaaa: " + var6 + "    " + var7.a);
         var1.addElement(new j(this, "", 11, var3, var6, var3, var7));
      }

      return var1;
   }

   public final void h() {
      if (GameMidlet.i.w != b) {
         GameGraphic.showAlert(StringEntity.bt);
      } else {
         Vector var1 = new Vector();

         int var2;
         for(var2 = 0; var2 < az.size(); ++var2) {
            dc var4;
            if (gb.b((int)(var4 = (dc)az.elementAt(var2)).a) != null) {
               d var3 = new d(this, "", 12, var2, var4, var2);
               var1.addElement(var3);
            }
         }

         for(var2 = 0; var2 < d.size(); ++var2) {
            t var6 = new t(this, "", 13, var2, var2);
            var1.addElement(var6);
         }

         dp.b().a();
         dp.b().a(new String[]{StringEntity.aN, StringEntity.bu}, new Vector[]{this.C(), var1}, (Vector)null);

         for(int var5 = 0; var5 < f.size(); ++var5) {
            f.elementAt(var5);
         }

      }
   }

   public final void f(int var1, int var2) {
      if (var2 != 3 && !dp.h()) {
         dp.g();
         if (GameGraphic.I) {
            GameGraphic.D = new bb();
            if (avatar.bb.f > 2) {
               --avatar.bb.f;
            }

            GameGraphic.D.a((hj)dp.a);
            return;
         }
      } else {
         int var3 = dp.f();
         int var4 = 0;
         int var5 = 0;
         if (var2 == 0) {
            cb var7;
            var4 = (var7 = gb.d(var1)).g[0];
            var5 = var7.g[1];
         } else if (var2 == 2) {
            var4 = gb.a(var1).d[0];
            var5 = gb.a(var1).d[1];
         } else {
            az var8;
            if (var2 == 4 && (var8 = b(var1)) != null) {
               var4 = var8.g;
               var5 = var8.h;
            }
         }

         GameGraphic.a(var4 * var3, var5 * var3, new u(this, var1, var3, var4), new r(this, var1, var3, var5), (ii)null);
      }

   }

   public final void a(int var1, int var2) {
      switch(var1) {
      case 0:
         this.t();
         return;
      case 1:
         if (GameGraphic.D == null || avatar.bb.d) {
            le.getInstance().a(this.K, 0);
            return;
         }
         break;
      case 2:
         go var10 = this;
         Vector var11 = new Vector();
         ai var3;
         ad var4 = gb.c((var3 = e(((gx)ir.p).w)).k);

         int var5;
         dc var6;
         az var7;
         for(var5 = 0; var5 < d.size(); ++var5) {
            if ((var7 = b((var6 = (dc)d.elementAt(var5)).a)).d == var4.c && var7.e == 5 && (var4.c == 4 || var4.c == 1)) {
               int var8 = var6.e;
               if (var4.c == 4) {
                  var8 -= j[1].size();
               } else if (var4.c == 1) {
                  var8 -= j[0].size();
               }

               var11.addElement(new ff(var10, var7.f + "(" + var8 + ")", new er(var10, var6, var4), var7));
            }
         }

         for(var5 = 0; var5 < d.size(); ++var5) {
            if ((var7 = b((var6 = (dc)d.elementAt(var5)).a)).e != 5 && var7.d != 0 && (var7.d == var4.c || var7.d == 101 || var7.d == 100 && var4.c != 4) && (var7.e != 4 || var3.j[0] || var3.j[1]) && (var7.e != 6 || var3.h < 100)) {
               var11.addElement(new fb(var10, var7.f + "(" + var6.e + ")", new fi(var10, var7, var6), var7));
            }
         }

         if (b == GameMidlet.i.w) {
            var11.addElement(new fd(var10, StringEntity.bg, 2));
         }

         a(var11);
         return;
      case 3:
         this.q();
         return;
      case 4:
         this.r();
         return;
      case 5:
         super.ac = aP;
         super.ae = null;
         this.aW = false;
         do1.g = false;
         this.aX = false;
         this.ba.removeAllElements();

         for(var1 = 0; var1 < c.size(); ++var1) {
            ((cf)c.elementAt(var1)).l = false;
         }

         H = -1;
         L = -1;
         N = false;
         return;
      case 6:
         this.s();
         return;
      case 7:
         Vector var9;
         (var9 = new Vector()).addElement(new Button(StringEntity.dR, 10));
         var9.addElement(new Button(StringEntity.dS, 8));
         var9.addElement(new Button(StringEntity.dT, 9));
         var9.addElement(new Button(StringEntity.EXIT, 20));
         le.getInstance().a(var9, 0);
         return;
      case 8:
         y = false;
         super.ae = null;
         super.ad = null;
         super.ac = aP;
         this.bg = 0;
         do1.g = false;
         return;
      case 9:
         ++this.bg;
         this.d(10, -1);
         return;
      case 51:
         Farm.getInstance().b(b, 1);
         this.aJ = System.currentTimeMillis();
         this.b(b, true);
         return;
      case 52:
         Farm.getInstance().b(b, 2);
         this.aJ = System.currentTimeMillis();
         this.b(b, true);
         return;
      case 53:
         this.a((byte)0, (int)-1);
         GameGraphic.h();
         return;
      case 54:
         this.j();
      }

   }

   public final void a(ad var1) {
      GameGraphic.a(var1.e[0], var1.e[1], new x(this, var1), new aj(this, var1), (ii)null);
   }

   public static void i() {
      if (ir.a == 24 || ir.a == 53) {
         GameGraphic.t = null;
         GameGraphic.b(StringEntity.bv, 54, (gy)null);
      }

   }

   public static boolean a(short var0, int var1) {
      if (dc.a(d, var0) == null) {
         return false;
      } else {
         Farm.getInstance().doUsingItem(b, var1, var0);
         return false;
      }
   }

   public final void a(byte var1, byte var2) {
      Vector var6 = new Vector();

      for(int var3 = 0; var3 < d.size(); ++var3) {
         dc var4;
         az var5;
         if (((var5 = b((var4 = (dc)d.elementAt(var3)).a)).d == var1 || var5.d == 101) && var5.e == 5) {
            var6.addElement(new hg(this, var5.f + "(" + var4.e + ")", new ak(this, var1, var4), var5));
         }
      }

      le.getInstance().a(var6, GameGraphic.o, ir.i * gy.Y, ir.i * gy.Y);
   }

   private static void a(ai var0) {
      Farm.getInstance().c(b, var0.w);
   }

   public final void a(int var1, int var2, Vector var3) {
      if (GameMidlet.i.w == b) {
         if (var2 >= 0 && var2 < var3.size()) {
            dr var6 = (dr)var3.elementAt(var2);

            for(int var7 = 0; var7 < i.size(); ++var7) {
               ai var4;
               ad var5 = gb.c((var4 = (ai)i.elementAt(var7)).k);
               if (var4.o > 0 && var6.c == var4.k) {
                  var4.o = 0;
                  if (var1 == 1 && var5.c == var1) {
                     a(var4);
                     i(-50);
                  }

                  if (var1 == 2 && var5.c == var1) {
                     a(var4);
                     i(-51);
                  }
               }
            }

         }
      }
   }

   public final void a(int var1, int var2, short var3) {
      GameMidlet.i.a[0] = var2;
      dp.n = true;
      GameGraphic.showAlert(StringEntity.bx + var1 + StringEntity.DOLLAR);
      dc var4;
      if ((var4 = dc.a(f, var3)) == null) {
         var4 = dc.a(e, var3);
         e.removeElement(var4);
      } else {
         f.removeElement(var4);
      }

      if (GameGraphic.r == dp.b()) {
         dp.b().d();
         if (ir.a == 25) {
            this.g();
            dp.b().b(2);
         } else {
            this.h();
         }
      }

      GameGraphic.h();
   }

   public static void g(int var0, int var1) {
      ai var4;
      if ((var4 = e(var0)) != null) {
         int var2 = var1 - GameMidlet.i.a[0];
         ir.p = null;
            Image var3 = fxClass.c(gb.c(var4.k).j[var4.d]).a;
            GameGraphic.a(var2, var4.aw, var4.ax - 7, -1, awClass.a(0, var4.m * var4.aA, var3.getWidth(), var4.aA, var3), -1);
         i.removeElement(var4);
         ir.m.removeElement(var4);
      }

      dp.n = true;
      GameMidlet.i.a[0] = var1;
   }

   public final void a(byte var1, String var2) {
        GameGraphic.a(var2, (ii)(new av(this, var1)));
   }

   public final void j() {
      I = false;
      aM = false;
      dt.v = -1;
      dz.u = -1;
      this.aA = null;
      super.ae = null;
      avatar.bf.a().doJoinPark(25, 0);
   }

   public static ai e(int var0) {
      for(int var1 = 0; var1 < i.size(); ++var1) {
         ai var2;
         if ((var2 = (ai)i.elementAt(var1)).w == var0) {
            return var2;
         }
      }

      return null;
   }

   public final void m() {
      if (GameMidlet.i.w == b) {
         Vector var1 = new Vector();
         if (J.d > 0) {
            var1.addElement(new ao(this, StringEntity.eO + "(" + J.d + ")", 12));
         }

         var1.addElement(new ap(this, J.e > 0 ? StringEntity.eN : StringEntity.UPGRADE, 13));
         var1.addElement(new am(this, StringEntity.cw, 14));
         a(var1);
      }
   }

   private static void i(int var0) {
      for(int var1 = 0; var1 < ir.l.size(); ++var1) {
         cc var2;
         if ((var2 = (cc)ir.l.elementAt(var1)).az == 8 && var2.f == var0) {
            ir.l.removeElement(var2);
            return;
         }
      }

   }

   public final void n() {
      if (b == GameMidlet.i.w) {
         Vector var1 = new Vector();

         for(int var2 = 0; var2 < gb.f.size(); ++var2) {
            hf var3 = (hf)gb.f.elementAt(var2);
            var1.addElement(new aq(this, StringEntity.m, new an(this, var3), var3, var2));
         }

         Vector var5 = new Vector();
         if (V > 0) {
            var5.addElement((Object)null);
            as var6 = new as(this, U == 0 ? StringEntity.eL : StringEntity.h, 2, this);
            var5.addElement(var6);
         }

         dp.b().a();
         dp.b().m = true;
         if (V > 0) {
            dp.b().a(new String[]{StringEntity.m, StringEntity.dD}, new Vector[]{var1, null}, var5);
            dp.b().a(new Button(StringEntity.CANCEL, 0, this), 1);
            dp.g = 1;
            dp.b().i();
            dp.b().m();
         } else {
            dp.b().a(new String[]{StringEntity.m}, new Vector[]{var1}, (Vector)null);
         }
      }
   }

   public static void a(short var0, short var1) {
      for(int var2 = 0; var2 < J.i.length; ++var2) {
         GameGraphic.a(0, J.aw + J.i[var2], J.ax - 45 + J.j[var2], -1, 0, J.c, -1);
      }

      GameGraphic.a(var1, GameMidlet.i.aw, GameMidlet.i.ax - GameMidlet.i.aA, -1, 10);
      J.d = 0;
      dc var3;
      if ((var3 = f(var0)) != null) {
         var3.e += var1;
      } else {
         (var3 = new dc()).a = var0;
         var3.e = var1;
         e.addElement(var3);
      }

      GameGraphic.h();
   }

   public static dc f(int var0) {
      for(int var1 = 0; var1 < e.size(); ++var1) {
         dc var2;
         if ((var2 = (dc)e.elementAt(var1)).a == var0) {
            return var2;
         }
      }

      return null;
   }

   public static dc g(int var0) {
      for(int var1 = 0; var1 < f.size(); ++var1) {
         dc var2;
         if ((var2 = (dc)f.elementAt(var1)).a == var0) {
            return var2;
         }
      }

      return null;
   }

   public static void o() {
      cy.b().b(true);
   }

   static void a(go var0, byte var1, int var2) {
      var0.a(var1, var2);
   }

   static void a(go var0, cf var1) {
      if (var1.c != -1 && var1.q < 6) {
         GameGraphic.b(StringEntity.bh, 53);
      } else {
         var0.a((byte)0, (int)-1);
         GameGraphic.h();
      }
   }

   static void a(go var0, int var1, int var2) {
      i(var1, var2);
   }

   static void a(go var0) {
      var0.A();
   }

   static Vector p() {
      return az;
   }

   static void a(go var0, az var1, short var2, ai var3) {
      var0.a(var1, var2, var3);
   }
}
