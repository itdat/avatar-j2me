package avatar;

import java.util.Vector;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Form;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import javax.microedition.lcdui.TextField;
import main.GameMidlet;

public final class ea extends hj {

    public static ea a;
    private ht p;
    public ht b;
    private byte[] q;
    private Vector r;
    private byte s;
    private byte t;
    private byte u = 16;
    public int c;
    public int d;
    private static Image v;
    private static Image w;
    public int e;
    private static int x;
    public static int f;
    private static int y;
    private static int z;
    private static int A;
    private static int B;
    public static int g;
    private static int C;
    private static int D;
    private static int E;
    public Intent h;
    public static String i;
    private boolean F;
    public static boolean j = false;
    public static Image[] k = new Image[2];
    private static Vector G = new Vector();
    private static ht H;
    public Button l;
    private Button I;
    private int J;
    private int K;
    private int L;
    private int M;
    boolean m = false;
    private int N;
    private int O;
    private long P;
    private long Q;
    public static Intent n;
    public static byte o;

    public static ea b() {
        return a == null ? (a = new ea()) : a;
    }

    public final void a() {
        super.a();
        if (!jn.a) {
            main.GameGraphic.h();
        }

        if (ir.y != -1) {
            main.GameGraphic.h();
        }

        super.ac = this.l;
        if (main.GameGraphic.I) {
            (main.GameGraphic.D = new bb()).a();
            super.ac = null;
        } else if (hj.as > 0 && o == 1) {
            hc.b().a(main.GameGraphic.r);
        }

        if (main.GameGraphic.J == 0) {
            main.GameGraphic.J = 1;
        }

        main.GameGraphic.B.removeAllElements();
        this.g();
        aeClass.G = -1;
    }

    public ea() {
        ImageModel.b(StringEntity.MAIN_AV);
        this.b = ht.a("up", 13 * gy.Y, 11 * gy.Y);
        ImageModel.cleanUp();
        ImageModel.b(StringEntity.EFFECT_AV);
        v = ImageModel.getImageFromIndex("sIc");
        w = ImageModel.getImageFromIndex("b_p");
        ImageModel.cleanUp();
        this.l = new Button(StringEntity.MENU, 0);
        super.ac = this.l;
    }

    public final void a(int var1, int var2) {
        switch (var1) {
            case 0:
                if (main.GameGraphic.D == null || !bb.d) {
                    Vector var3 = new Vector();
                    if (n != null) {
                        var3.addElement(new Button("Đăng ký", n));
                    }

                    if (main.GameGraphic.Z == 0) {
                        var3.addElement(aeClass.getInstance().f);
                    }

                    var3.addElement(new Button(StringEntity.ab, 1));
                    var3.addElement(new Button(StringEntity.cw, 2));
                    if (!es.w) {
                        var3.addElement(new Button(StringEntity.CHANGE_PASSWORD, 3));
                    }

                    var3.addElement(new Button(StringEntity.cF, 4));
                    var3.addElement(new Button(StringEntity.cJ, 5));
                    var3.addElement(new Button(StringEntity.EXIT, 6));
                    le.getInstance().a(var3, 0);
                }

                return;
            case 1:
                aeClass.getInstance().a();
                H = null;
            default:
        }
    }

    public final void d(int command, int var2) {
        switch (command) {
            case 1:
                System.out.println("COMMAND: OPEN GAME SETTINGS");
                dm.INST.a();
                return;
            case 2:
                System.out.println("COMMAND: VIEW CITY INFORMATION");
                cx.getInstance().sendMessageToServer((byte) 6, "");
                return;
            case 3:
                System.out.println("COMMAND: CHANGE PASSWORD");
                aeClass.getInstance().u();
                return;
            case 4:
                System.out.println("COMMAND: SEND GAME TO FRIEND");
                Form inputForm = new Form(StringEntity.SEND_GAME_TO_FRIEND);
                TextField phoneNumberInput = new TextField(StringEntity.PHONE_NUMBER, "", 11, TextField.PHONENUMBER);
                inputForm.append(phoneNumberInput);
                inputForm.append(StringEntity.cI);  // ban co the chon so tu menu/danh ba
                Command okCommand = new Command(StringEntity.OK, Command.OK, 1);
                inputForm.addCommand(okCommand);
                Command closeCommand = new Command(StringEntity.CLOSE, Command.BACK, 1);
                inputForm.addCommand(closeCommand);
                inputForm.setCommandListener(new SendGameCommandListener(this, okCommand, phoneNumberInput));
                Display.getDisplay(GameMidlet.gameMidlet).setCurrent(inputForm);
                return;
            case 5:
                System.out.println("COMMAND: MORE GAMES");
                cx.getInstance().sendMessageToServer((byte) 3, (String) null);
                return;
            case 6:
                System.out.println("COMMAND: EXIT GAME");
                aeClass.getInstance().v();
                return;
            case 7:
                System.out.println("###CASE 7");
                bb.h();
                (main.GameGraphic.D = new bb()).a();
                super.ac = null;
            default:
        }
    }

    public final void d() {
        if (!j && main.GameGraphic.r != ez.a) {
            aeClass.getInstance().a();
            H = null;
        } else {
            aeClass.getInstance().v();
        }
    }

    public final void a(ht var1, byte[] var2, Vector var3, byte var4, int var5, Button var6) {
        fxClass.c((short) 839);
        GameMidlet.i.L = false;
        this.u = (byte) var5;
        this.p = var1;
        this.q = var2;
        this.r = var3;
        this.s = 34;
        this.I = var6;
        if (main.GameGraphic.Z == 0) {
            super.ad = var6;
        }

        this.t = (byte) (var2.length / this.s);
        super.ae = null;
        this.e();
        this.h = null;
        G.removeAllElements();

        for (int var7 = 0; var7 < 7; ++var7) {
            G.addElement(new dr(var7 * this.s * this.u / 10 + 50, awClass.e(10) * (this.t * this.u / 10) + 20, awClass.e(2)));
        }

        B = g = f = x = this.e = 0;
        this.g();
        if (j) {
            ImageModel.b(StringEntity.EFFECT_AV);
            H = new ht(ImageModel.getImageFromIndex("k"), 40 * gy.Y, 40 * gy.Y);
            ImageModel.cleanUp();
        }

    }

    public final void e() {
        this.c = (main.GameGraphic.width - this.s * this.u) / 2;
        this.d = (main.GameGraphic.height2 - main.GameGraphic.T - this.t * this.u) / 2;
        if (this.c < 0) {
            this.c = 0;
        }

        if (this.d < 0) {
            this.d = 0;
        }

        A = this.s * this.u - main.GameGraphic.width;
        E = this.t * this.u - main.GameGraphic.height2;
        if (A < 0) {
            f = 0;
            A = 0;
        }

        if (E < 0) {
            g = 0;
            E = 0;
        }

    }

    public final void k() {
        if (this.J != 0) {
            if (g < 0 || g > E) {
                this.J -= this.J / 4;
                g += this.J / 20;
                if (this.J / 10 <= 1) {
                    this.J = 0;
                }
            }

            B = g += this.J / 10;
            this.J -= this.J / 10;
            if (this.J / 10 == 0) {
                this.J = 0;
            }
        }

        if (g < 0) {
            B = 0;
            this.J = 0;
        } else if (g > E) {
            B = E;
            this.J = 0;
        }

        if (this.K != 0) {
            if (f < 0 || f > A) {
                this.K -= this.K / 4;
                f += this.K / 20;
                if (this.K / 10 <= 1) {
                    this.K = 0;
                }
            }

            f += this.K / 10;
            this.K -= this.K / 10;
            x = f;
            if (this.K / 10 == 0) {
                this.K = 0;
            }
        }

        if (f < 0) {
            x = 0;
            this.K = 0;
        } else if (f > A) {
            x = A;
            this.K = 0;
        }

        if (g != B) {
            D = B - g << 2;
            C += D;
            g += C >> 4;
            C &= 15;
        }

        if (f != x) {
            z = x - f << 2;
            y += z;
            f += y >> 4;
            y &= 15;
        }

        if (B < 0 || g < 0) {
            g = 0;
            B = 0;
        }

        if (B > E || g > E) {
            B = g = E;
        }

        if (x < 0 || f < 0) {
            f = 0;
            x = 0;
        }

        if (x > A || f > A) {
            x = f = A;
        }

        for (int var1 = 0; var1 < G.size(); ++var1) {
            dr var2;
            dr var10000 = var2 = (dr) G.elementAt(var1);
            var10000.a -= var2.c + (main.GameGraphic.l % 5 == 1 ? 1 : 0);
            if (var2.a < -this.c - 50) {
                var2.a = this.c + awClass.e(4) * 50 + this.s * this.u;
                var2.b = awClass.e(10) * (this.t * this.u / 10) + 10;
                var2.c = awClass.e(2);
            }
        }

    }

    public static void f() {
        go.l = "e";
        dp.i = "f";
        es.t = "a";
        aeClass.j = main.GameGraphic.a(i, -2);
    }

    public final void l() {
        ++this.Q;
        if (main.GameGraphic.D == null || !bb.d) {
            super.l();
        }

        this.m = false;
        if (main.GameGraphic.a(0, 0, main.GameGraphic.width, main.GameGraphic.height)) {
            int var1 = main.GameGraphic.k();
            int var2 = main.GameGraphic.l();
            int var3;
            kb var4;
            if (main.GameGraphic.D == null && main.GameGraphic.g) {
                main.GameGraphic.g = false;

                for (var3 = 0; var3 < this.r.size(); ++var3) {
                    var4 = (kb) this.r.elementAt(var3);
                    if (main.GameGraphic.a(this.c + var4.a * this.u + this.u / 2 - 24 * gy.Y - f, this.d + var4.b * this.u - 56 * gy.Y - g, 48 * gy.Y, 56 * gy.Y)) {
                        this.e = var3;
                        return;
                    }
                }
            }

            if (main.GameGraphic.e) {
                if (main.GameGraphic.l % 3 == 0) {
                    this.N = main.GameGraphic.i;
                    this.O = main.GameGraphic.h;
                    this.P = this.Q;
                }

                this.J = 0;
                this.K = 0;
                if (!this.F) {
                    this.F = true;
                    this.L = f;
                    this.M = g;
                }

                B = this.M + var2;
                x = this.L + var1;
                h();
                g = B;
                f = x;
            }

            if (main.GameGraphic.f) {
                var3 = (int) (this.Q - this.P);
                int var5 = this.N - main.GameGraphic.i;
                if (var3 < 10) {
                    if (B >= 0 && B < E) {
                        this.J = var5 / var3 * 10;
                    }

                    var5 = this.O - main.GameGraphic.h;
                    if (x >= 0 && x < A) {
                        this.K = var5 / var3 * 10;
                    }
                }

                this.P = -1L;
                this.F = false;
                if (awClass.f(var1) < 10 && awClass.f(var2) < 10) {
                    var4 = (kb) this.r.elementAt(this.e);
                    if (main.GameGraphic.a(this.c + var4.a * this.u + this.u / 2 - 24 * gy.Y - f, this.d + var4.b * this.u - 56 * gy.Y - g, 48 * gy.Y, 56 * gy.Y)) {
                        this.I.b();
                        return;
                    }

                    x = main.GameGraphic.h + f - main.GameGraphic.o;
                    B = main.GameGraphic.i + g - main.GameGraphic.p;
                    h();
                }
            }
        }

        if (this.h == null) {
            if (!main.GameGraphic.a(2) && !main.GameGraphic.a(4)) {
                if (main.GameGraphic.a(8) || main.GameGraphic.a(6)) {
                    ++this.e;
                    if (this.e >= this.r.size()) {
                        this.e = 0;
                    }

                    this.m = true;
                }
            } else {
                --this.e;
                if (this.e < 0) {
                    this.e = this.r.size() - 1;
                }

                this.m = true;
            }
        } else if (main.GameGraphic.D == null) {
            this.h.a();
        }
        if (this.m) {
            this.g();
        }
    }

    private void g() {
        kb var1 = (kb) this.r.elementAt(this.e);
        x = var1.a * this.u - main.GameGraphic.width / 2;
        B = var1.b * this.u - main.GameGraphic.height2 / 2;
        h();
    }

    private static void h() {
        if (B < 0) {
            B = 0;
        }
        if (B > E) {
            B = E;
        }
        if (x < 0) {
            x = 0;
        }
        if (x > A) {
            x = A;
        }
    }

    public final void a(Graphics var1) {
        this.b(var1);
        if (main.GameGraphic.D == null || !bb.d) {
            super.a(var1);
        }

        main.GameGraphic.a(var1);
    }

    public final void b(Graphics var1) {
        main.GameGraphic.c(var1);
        var1.setColor(0);
        var1.fillRect(0, 0, main.GameGraphic.width, main.GameGraphic.height2);
        var1.translate(this.c, this.d);
        var1.translate(-f, -g);

        int var2;
        int var4;
        for (var2 = 0; var2 < this.q.length; ++var2) {
            byte var3;
            var4 = (var3 = this.q[var2]) / this.p.c;
            this.p.b(var4, var3 % this.p.c, var2 % this.s * this.u, var2 / this.s * this.u, var1);
        }

        for (var2 = 0; var2 < this.r.size(); ++var2) {
            kb var9 = (kb) this.r.elementAt(var2);
            if (var2 == this.e) {
                var1.drawImage(w, var9.a * this.u + this.u / 2, var9.b * this.u, 33);
                if (j) {
                    H.a(var2, var9.a * this.u + this.u / 2, var9.b * this.u - 12 * gy.Y, 0, 33, var1);
                } else {
                    fxClass.a(var1, var9.d, var9.a * this.u + this.u / 2, var9.b * this.u - 12 * gy.Y, 33);
                }
            } else {
                var1.drawImage(v, var9.a * this.u + this.u / 2, var9.b * this.u - var9.e / 3, 33);
                ++var9.e;
                if (var9.e >= 9) {
                    var9.e = 0;
                }
            }
        }

        Graphics var10 = var1;
        ea var8 = this;

        for (var4 = 0; var4 < var8.r.size(); ++var4) {
            kb var5;
            int var6 = (var5 = (kb) var8.r.elementAt(var4)).a * var8.u;
            int var7;
            if ((var7 = var5.b * var8.u) < g + 50) {
                var7 = g + 50;
            }

            if (var7 > g + main.GameGraphic.height2 - 20) {
                var7 = g + main.GameGraphic.height2 - 20;
            }

            if (var6 < f + 20) {
                var6 = f + 20;
            }

            if (var6 > f + main.GameGraphic.width - 47) {
                var6 = f + main.GameGraphic.width - 47;
            }

            main.GameGraphic.L.a(var10, var5.c, var6 + 10, var7 - (var4 == var8.e ? 70 * gy.Y : 35 * gy.Y) - var5.e / 3, 2);
        }

        Graphics var11 = var1;

        for (var4 = 0; var4 < G.size(); ++var4) {
            dr var12;
            if ((var12 = (dr) G.elementAt(var4)).a > f - 30 && var12.a < f + 30 + main.GameGraphic.width && var12.b > g - 20 && var12.b < g + 20 + main.GameGraphic.height) {
                var11.drawImage(k[var12.c], var12.a, var12.b, 3);
            }
        }

        main.GameGraphic.c(var1);
    }

    // a byte String String String
    public final void onRegisterByEmail(byte var1, String var2, String var3, String var4) {
        System.out.println("onRegisterByEmail: " + var3 + "   " + var4);
        switch (var1) {
            case 0:
                n = new ct(this, var2);
                break;
            case 1:
                n = new ay(this, var2);
                break;
            default:
                if (var1 == 2) {
                    es.b().b.a(var3);
                    es.b().c.a(var4);
                    es.b().saveLogin();
                    main.GameGraphic.showAlert("Đăng ký thành công.");
                    n = null;
                }
                break;
        }
    }
}
