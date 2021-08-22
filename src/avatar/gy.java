package avatar;

import javax.microedition.lcdui.Graphics;
import main.GameGraphic;
import main.GameMidlet;

public class gy {
    public static int Y = 1;
    public static int Z;
    public static int aa;
    public static int ab;
    public Button ac;
    public Button ad;
    public Button ae;
    public static byte af;
    public static byte ag;
    public static byte ah;
    public static byte ai;
    public boolean aj;
    public static boolean ak = false;
    private static byte a = 0;
    private static byte b = 0;
    private static byte c = 0;

    public void c() {
    }

    public void d(int var1) {
    }

    public void a(Graphics var1) {
       GameGraphic.c(var1);
       GameGraphic.S.a(var1, this.ac, this.ad, this.ae);
    }

    public void d(int var1, int var2) {
    }

    public void a(int var1) {
    }

    public void a(int var1, int var2) {
    }

    private void b(Button var1) {
        if (var1 != null) {
            GameGraphic.g = false;
            GameGraphic.f = false;
            GameGraphic.h();
            this.a(var1);
        }
    }

    public void k() {
    }

    public void l() {
       if (main.GameGraphic.f) {
          if (main.GameGraphic.b(0, main.GameGraphic.ae[0].b, main.GameGraphic.width - 1, main.GameGraphic.T)) {
             switch(main.GameGraphic.S.d()) {
             case 0:
                if (main.GameGraphic.Z == 0) {
                   this.b(this.ac);
                }
                break;
             case 1:
                if (main.GameGraphic.Z == 0) {
                   this.b(this.ad);
                }
                break;
             case 2:
                if (GameGraphic.Z == 0) {
                   this.b(this.ae);
                }
             }
          }

          a = 0;
          b = 0;
          c = 0;
          if (GameGraphic.m()) {
             if (GameGraphic.a(0, 0, 50 * Y, 50 * Y)) {
                if (!dm.d) {
                   if (KeyboardManager.m) {
                      ak = true;
                      KeyboardManager.m = false;
                   }
                } else if (ak) {
                   KeyboardManager.m = true;
                }

                dm.d = !dm.d;
                GameGraphic.INST.sizeChanged(0, 0);
                GameGraphic.f = false;
             }

             if (GameMidlet.e == 9 && GameGraphic.a(50, 0, 50 * Y, 50 * Y)) {
                if (!dm.d) {
                   dm.d = true;
                   dm.getInstance().b[4] = 1;
                   main.GameGraphic.INST.b();
                   GameGraphic.z.a = true;
                   if (GameGraphic.r == aeClass.getInstance()) {
                      im.d().d = aeClass.getInstance();
                      im.c = true;
                   }
                } else {
                   dm.d = false;
                   dm.getInstance().b[4] = 0;
                   main.GameGraphic.INST.b();
                   if (GameGraphic.r == aeClass.getInstance()) {
                      im.c = false;
                   }
                }
                GameGraphic.f = false;
             }
          }
       }

       if (GameGraphic.a(5)) {
          if (this.ad != null) {
             GameGraphic.h();
             this.a(this.ad);
             return;
          }

          if (GameGraphic.t == this) {
             this.a(this.ac);
             return;
          }
       } else {
          if (GameGraphic.a(12)) {
             this.a(this.ac);
             return;
          }

          if (GameGraphic.isRimOrBlackBerry) {
             if (GameGraphic.a(13) || GameGraphic.c[13]) {
                GameGraphic.c[13] = false;
                this.a(this.ae);
                return;
             }
          } else if (GameGraphic.a(13)) {
             this.a(this.ae);
          }
       }

    }

    public final void a(Button var1) {
       if (var1 != null) {
          if (var1.b != null) {
             var1.b.a();
             return;
          }
          if (var1.d != null) {
             var1.d.a(var1.c);
             return;
          }
          if (im.c) {
             im.d().a(var1.c, var1.e);
             return;
          }
          this.a(var1.c, var1.e);
       }
    }
}
