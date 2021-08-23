package avatar;

import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Vector;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import main.GameMidlet;

public final class es extends hj {

    public static es a;
    public KeyboardManager b = new KeyboardManager();
    public KeyboardManager c = new KeyboardManager();
    public KeyboardManager d = new KeyboardManager();
    public KeyboardManager e = new KeyboardManager();
    private int z;
    private int A;
    private int B;
    private Button button;
    Button f;
    private Button D;
    Button g;
    private boolean E = true;
    Button h;
    public boolean i = false;
    private String F = "19006610";
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;
    public int o;
    public int p;
    public int q;
    public long r = 0L;
    public static int s = 0;
    public static String t;
    public static boolean u = false;
    public static boolean v;
    public static boolean w;
    private String[] G = new String[]{"Chơi mới", "Chơi tiếp", "Đổi tài khoản"};
    public int x;
    public int y;
    private byte H;
    private String I = "";
    private String J = "";
    private boolean K;

    public static es b() {
        if (a == null) {
            a = new es();
        }

        return a;
    }

    public final void d() {
        main.GameGraphic.b(StringEntity.WANT_EXIT, 54);
    }

    public final void a() {
        this.c();
        super.a();
        main.GameGraphic.h();
        if (main.GameGraphic.H) {
            this.H = -1;
        }

        v = true;
        super.ad = this.g;
        if (this.I.equals("") && this.b.f().equals("")) {
            this.G = new String[]{"Chơi mới", "Đổi tài khoản"};
        } else {
            this.G = new String[]{"Chơi tiếp" + (!this.b.f().equals("") ? ", " + this.b.f() : ""), "Chơi mới", "Đổi tài khoản"};
        }
    }

    public final void e() {
        this.r = System.currentTimeMillis();
        ImageModel.b(StringEntity.MAIN_AV);
        try {
            if (GameMidlet.providerByte == 6) {
                hj.am = Image.createImage("/lgyeah.png");
            } else {
                hj.am = Image.createImage(StringEntity.a() + "/l.png");
            }
        } catch (IOException var2) {
            var2.printStackTrace();
        }

        c.a();
        this.A = -50;
        main.GameGraphic.x.e(26);
        GameMidlet.i.aw = GameMidlet.i.C = ir.e * 24 / 2 + 30;
        do1.a().a = do1.a().c = 200;
        this.b.a(true);
        this.c.a(false);
        this.z = 0;
        this.b.a(true);
    }

    public final void c() {
        this.h = new Button(StringEntity.MENU, 0);
        this.D = new Button(StringEntity.dt, 3);
        this.f = new Button(StringEntity.CHOOSE, 1);
        this.button = new Button(StringEntity.bA, 2);
        this.g = new Button(StringEntity.CHOOSE, 104);
        super.ac = this.h;
    }

    public es() {
        this.f();
        this.b.a(true);
        this.b.d(0);
        this.c.d(2);
        this.d.d(2);
        this.e.d(0);
        this.e.q = "Tùy chọn";
        this.z = 0;
        if (awClass.b(awClass.b) == null) {
            fxClass.b();
        }

    }

    public final void f() {
        if (main.GameGraphic.height > 200) {
            this.B = main.GameGraphic.p - 80;
        } else {
            this.B = main.GameGraphic.p - 65;
        }

        this.A = -50;
        this.p = main.GameGraphic.width - 30;
        if (this.p < 70) {
            this.p = 70;
        }

        if (this.p > 99) {
            this.p = 99;
        }

        this.q = (main.GameGraphic.width - this.p >> 1) + 29;
        if (main.GameGraphic.width <= 128) {
            this.p = 80;
            this.q = (main.GameGraphic.width - this.p >> 1) + 20;
        }

        this.q -= (gy.Y - 1) * 40;
        main.GameGraphic.S.a(this);
        this.B = this.k / 2;
        this.A = this.B;
        do1.a().h = GameMidlet.i;
        do1.a().d();
    }

    public final void d(int var1, int var2) {
        switch (var1) {
            case 0:
                this.i = true;
                main.GameGraphic.S.a(this);
                return;
            case 1:
                this.i = false;
                main.GameGraphic.S.a(this);
                return;
            case 2:
                main.GameGraphic.b(StringEntity.WANT_EXIT, 54);
                return;
            case 3:
                main.GameGraphic.b(StringEntity.du, 55, (gy) null);
                return;
            case 4:
                main.GameGraphic.u.a(StringEntity.bC, 100, 3);
                return;
            case 5:
                dm.INST.a();
                return;
            case 6:
                GameMidlet.b("http://wap.teamobi.com/faqs.php?provider=" + GameMidlet.providerByte);
                return;
            case 7:
                GameMidlet.b("http://wap.teamobi.com?info=checkupdate&game=8&version=2.5.8&provider=" + GameMidlet.providerByte + "&agent=" + GameMidlet.agentStr);
                return;
            case 8:
                if (!this.F.equals("")) {
                    GameMidlet.b("tel:" + this.F);
                    return;
                }

                if (!kt.getInstance().c) {
                    main.GameGraphic.c(StringEntity.M);
                    main.GameGraphic.c();
                } else {
                    main.GameGraphic.i();
                }

                cx.getInstance().sendMessageToServer((byte) 5, (String) null);
                return;
            case 9:
                main.GameGraphic.showAlert(StringEntity.bH + StringEntity.bG);
                fxClass.deleteRecordStores();
            case 50:
            default:
        }
    }

    private void j() {
        if (!this.E) {
            this.E = true;
            this.button.text = StringEntity.GIVE_UP;
        } else {
            this.E = false;
            this.button.text = StringEntity.bA;
        }
    }

    public final void a(int var1, int var2) {
        switch (var1) {
            case 0:
                Vector var5 = new Vector();
                Button var4 = new Button(StringEntity.EXIT, 2);
                var5.addElement(new Button(StringEntity.bB, 4));
                var5.addElement(new Button(StringEntity.ab, 5));
                if (dm.INST.b[4] == 0) {
                    var5.addElement(new Button(StringEntity.bD, 6));
                }

                var5.addElement(new Button(StringEntity.bE, 7));
                if (dm.INST.b[4] == 0) {
                    var5.addElement(new Button(StringEntity.bF, 8));
                }

                var5.addElement(new Button(StringEntity.bG, 9));
                var5.addElement(var4);
                le.getInstance().a(var5, 0);
                return;
            case 1:
                v = true;
                super.ac = this.h;
                super.ad = this.g;
                this.H = 0;
                this.G = new String[]{"Chơi tiếp" + (!this.b.f().equals("") ? ", " + this.b.f() : ""), "Chơi mới", "Đổi tài khoản"};
                return;
            case 2:
                this.j();
                return;
            case 3:
                if (this.b.f().equals("")) {
                    main.GameGraphic.showAlert(StringEntity.eo[0]);
                } else if (this.c.f().equals("")) {
                    main.GameGraphic.showAlert(StringEntity.eo[1]);
                } else if (this.d.f().equals("")) {
                    main.GameGraphic.showAlert(StringEntity.eo[2]);
                } else if (!this.c.f().equals(this.d.f())) {
                    main.GameGraphic.showAlert(StringEntity.eo[3]);
                } else {
                    main.GameGraphic.h();
                    this.r = System.currentTimeMillis();
                    if (this.e.f().equals("")) {
                        n();
                        return;
                    }

                    main.GameGraphic.b("Bạn nên điền chính xác số di động hoặc email. Khi quên mật khẩu, bạn sẽ dùng nó để lấy lại. Bạn có chắc chắn đã điền số di động / email đúng chưa?", 102);
                }
                break;
            case 50:
                main.GameGraphic.showAlert(StringEntity.bI);
                return;
            case 51:
                this.m();
                return;
            case 52:
                return;
            case 53:
                GameMidlet.b("http://teamobi.com/dieukhoan.htm");
                return;
            case 54:
                GameMidlet.a();
                return;
            case 55:
                u = false;
                this.saveLogin();
                fxClass.b("avatarSV");
                GameMidlet.a();
                return;
            case 100:
                String var3;
                if ((var3 = main.GameGraphic.u.a()).equals("")) {
                    return;
                }

                (new n(this, var3)).a();
                return;
            case 101:
                this.m();
                return;
            case 102:
                n();
                return;
            case 103:
                return;
            case 104:
                this.clickNewGame();
        }

    }

    private void m() {
        main.GameGraphic.i();
        main.GameGraphic.c();
        cx.getInstance().doRegisterByEmail(this.b.f().toLowerCase(), this.c.f().toLowerCase(), this.e.f());
        this.i = false;
        super.ad = this.f;
        main.GameGraphic.S.a(this);
    }

    private static void n() {
        Vector var0 = new Vector();
        var0.addElement(new Button(StringEntity.ACCEPT, 51));
        var0.addElement(new Button(StringEntity.NOT_ACCEPT, 52));
        var0.addElement(new Button(StringEntity.bL, 53));
        main.GameGraphic.a(StringEntity.bM, var0);
    }

    public final void k() {
        if ((System.currentTimeMillis() - this.r) / 1000L > 300L) {
            GameMidlet.gameMidlet.notifyDestroyed();
        }

        if (!v && this == main.GameGraphic.r && main.GameGraphic.t == null && !v) {
            this.b.e();
            this.c.e();
            if (this.i) {
                this.d.e();
                this.e.e();
            }

            if (this.b.d()) {
                super.ae = this.b.a();
            } else if (this.c.d()) {
                super.ae = this.c.a();
            } else if (this.d.d()) {
                super.ae = this.d.a();
            }
        } else {
            super.ae = null;
        }

        if (this.B != this.A) {
            this.A += this.B - this.A >> 1;
        }

        if (this.i) {
            super.ad = this.D;
        } else if (this.z == 2) {
            super.ae = this.button;
        }

        main.GameGraphic.x.b();
    }

    public final void d(int var1) {
        if (this.b.d()) {
            this.b.b(var1);
        } else if (this.c.d()) {
            this.c.b(var1);
        } else if (this.d.d()) {
            this.d.b(var1);
        } else if (this.e.d()) {
            this.e.b(var1);
        }

        super.d(var1);
    }

    public final void a(Graphics var1) {
        this.b(var1);
        super.a(var1);
        main.GameGraphic.a(var1);
    }

    public final void b(Graphics var1) {
        main.GameGraphic.x.b(var1);
        main.GameGraphic.x.d(var1);
        main.GameGraphic.c(var1);
        int var4;
        if (v) {
            Graphics var3 = var1;
            es var2 = this;
            main.GameGraphic.S.a(var1, this.j, this.k, this.l, this.m, 0);
            var1.translate(this.j, this.k + this.y);
            if (this.H != -1) {
                main.GameGraphic.S.c(var1, 5 * gy.Y, this.H * this.x, this.l - 10 * gy.Y, this.x);
            }

            for (var4 = 0; var4 < var2.G.length; ++var4) {
                main.GameGraphic.K.a(var3, var2.G[var4], var2.l / 2, var4 * var2.x + var2.x / 2 - main.GameGraphic.K.getLastByte() / 2, 2);
            }
        } else if (main.GameGraphic.v == null && this == main.GameGraphic.r) {
            main.GameGraphic.S.a(var1, this.j, this.k, this.l, this.m, 0);
            var1.setClip(this.j + 4, this.k + 4, this.l - 8, this.m - 8);
            if (!this.F.equals("") && dm.INST.b[4] == 0) {
                main.GameGraphic.S.a(var1, "Hotline: " + this.F, this.j + this.l - 8, this.k + this.m - gy.ah - 4, 1);
            }

            this.b.a(var1);
            var1.setClip(this.j + 4, this.k + 4, this.l - 8, this.m - 8);
            if ((var4 = main.GameGraphic.K.a(StringEntity.bN + ":")) < this.b.a - this.j) {
                var4 = (this.b.a - this.j - var4) / 2 + gy.Z;
            } else {
                var4 = this.b.a - var4 - 5;
            }

            main.GameGraphic.S.a(var1, StringEntity.bN, this.j + var4, this.b.b + this.b.d / 2 - gy.ah / 2, 0);
            main.GameGraphic.S.a(var1, StringEntity.bO + ":", this.j + var4, this.c.b + this.b.d / 2 - gy.ah / 2, 0);
            if (!this.i) {
                main.GameGraphic.S.a(var1, this.n, this.o, this.z, this.E);
            } else {
                main.GameGraphic.S.a(var1, StringEntity.cE, this.j + var4, this.d.b + this.b.d / 2 - gy.ah, 0);
                main.GameGraphic.S.a(var1, StringEntity.bO + ":", this.j + var4, this.d.b + this.b.d / 2, 0);
                main.GameGraphic.S.a(var1, "Số di động", this.j + var4, this.e.b + this.b.d / 2 - gy.ah, 0);
                main.GameGraphic.S.a(var1, "hoặc email:", this.j + var4, this.e.b + this.b.d / 2, 0);
                this.d.a(var1);
                this.e.a(var1);
            }

            this.c.a(var1);
        }

        main.GameGraphic.c(var1);
        var1.drawImage(hj.am, main.GameGraphic.o, this.A, 3);
    }

    public final void l() {
        if (v) {
            es var1 = this;
            if (main.GameGraphic.a(2)) {
                --this.H;
                if (this.H < 0) {
                    this.H = (byte) (this.G.length - 1);
                }
            } else if (main.GameGraphic.a(8)) {
                ++this.H;
                if (this.H >= this.G.length) {
                    this.H = 0;
                }
            }

            if (main.GameGraphic.g) {
                for (int var2 = 0; var2 < var1.G.length; ++var2) {
                    if (main.GameGraphic.b(var1.j, var1.k + var1.y + var2 * var1.x, var1.l, var1.x)) {
                        var1.H = (byte) var2;
                        main.GameGraphic.g = false;
                        var1.K = true;
                        break;
                    }
                }
            }

            if (var1.K) {
                if (main.GameGraphic.e && !main.GameGraphic.b(var1.j, var1.k + var1.y + var1.H * var1.x, var1.l, var1.x)) {
                    var1.H = -1;
                }

                if (main.GameGraphic.f) {
                    main.GameGraphic.f = false;
                    var1.K = false;
                    if (var1.H != -1) {
                        var1.clickNewGame();
                    }
                }
            }

            var1.l();
        } else {
            if (main.GameGraphic.f && main.GameGraphic.a(0, 0, main.GameGraphic.width, main.GameGraphic.height) && main.GameGraphic.a(this.n - 10, this.o, 70, hj.al * gy.Y + 10)) {
                this.j();
            }

            if (main.GameGraphic.b[2]) {
                if (this.z > 0) {
                    --this.z;
                } else if (this.i) {
                    this.z = 3;
                } else {
                    this.z = 2;
                }
            }

            if (main.GameGraphic.b[8]) {
                if (this.z < (this.i ? 3 : 2)) {
                    ++this.z;
                } else {
                    this.z = 0;
                }
            }

            if (main.GameGraphic.b[2] || main.GameGraphic.b[8]) {
                main.GameGraphic.e();
                if (this.z == 0) {
                    this.b.a(true);
                    this.c.a(false);
                    this.d.a(false);
                    this.e.a(false);
                } else if (this.z == 1) {
                    this.b.a(false);
                    this.c.a(true);
                    this.d.a(false);
                    this.e.a(false);
                } else if (this.z == 2) {
                    this.b.a(false);
                    this.c.a(false);
                    super.ae = null;
                    if (this.i) {
                        this.d.a(true);
                        this.e.a(false);
                    }
                } else {
                    this.b.a(false);
                    this.c.a(false);
                    this.d.a(false);
                    this.e.a(true);
                }
            }
            super.l();
        }
    }

    // o
    private void clickNewGame() {
        System.out.println("clickNewGame: " + w + "    " + this.H);
        switch (this.H) {
            case 0:
                if (this.G.length == 2) {
                    (new jk(this)).a();
                    return;
                }
                if (w) {
                    ez.b().a();
                    return;
                }
                String var2 = this.b.f().toLowerCase().trim();
                String var3 = this.c.f();
                if (!var2.equals("")) {
                    if (var3.equals("")) {
                        this.z = 1;
                        this.b.a(false);
                        this.c.a(true);
                        break;
                    }
                    ez.b().a();
                }
                return;
            case 1:
                if (this.G.length != 2) {
                    jk var1 = new jk(this);
                    if (!this.I.equals("") && this.b.f().equals("")) {
                        main.GameGraphic.a("Tài khoản của bạn chưa được đăng kí liên kết với một tài khoản Team. Bạn sẽ mất tài khoản đang chơi nếu tiếp tục. Bạn có muốn tiếp tục ?", (ii) var1);
                        return;
                    }

                    var1.a();
                    return;
                }
            case 2:
                this.p();
        }

    }

    private void p() {
        dg var1 = new dg(this);
        if (!this.I.equals("") && this.b.f().equals("")) {
            main.GameGraphic.a("Tài khoản của bạn chưa được đăng kí liên kết với một tài khoản Team. Bạn sẽ mất tài khoản đang chơi nếu tiếp tục. Bạn có muốn tiếp tục ?", (ii) var1);
        } else {
            var1.a();
        }
    }

    // g
    public final void saveLogin() {
        System.out.println("saveLogin");
        ByteArrayOutputStream var1 = new ByteArrayOutputStream();
        DataOutputStream var2 = new DataOutputStream(var1);
        try {
            var2.writeUTF("2.5.8");
            var2.writeByte(super.ar);
            var2.writeUTF(this.F);
            var2.writeUTF(this.I);
            var2.writeUTF(this.J);
            if (this.E) {
                var2.writeUTF(b().b.f());
                var2.writeUTF(b().c.f());
            }
            var2.writeInt(s);
            var2.writeBoolean(u);
            var2.writeBoolean(w);
            awClass.addRecord("avlogin", var1.toByteArray());
            var2.close();
        } catch (Exception var3) {
            var3.printStackTrace();
        }
    }

    public final void h() {
        DataInputStream dis = fxClass.a("avlogin");
        if (dis != null) {
            String version = "";
            try {
                version = dis.readUTF();
                super.ar = dis.readByte();
                this.F = dis.readUTF();
                this.I = dis.readUTF();
                this.J = dis.readUTF();
                if (this.E) {
                    this.b.a(dis.readUTF());
                    this.c.a(dis.readUTF());
                }
                s = dis.readInt();
                u = dis.readBoolean();
                w = dis.readBoolean();
                dis.close();
            } catch (IOException e) {
                fxClass.b("avlogin");
            }
            if (!u) {
                fxClass.b("avatarSV");
            }
            if (!"2.5.8".equals(version)) {
                fxClass.deleteRecordStores();
            }
        }
    }

    public final void a(String var1) {
        this.F = var1;
    }

    // i
    public final void doLogin() {
        main.GameGraphic.c();
        cx.getInstance().f(b().F.hashCode());
        System.out.println("login: " + v + "    " + this.H);
        if (!v || (this.H != 0 || this.G.length != 2) && (this.H != 1 || this.G.length != 3)) {
            if (this.b.f().equals("")) {
                cx.getInstance().login(this.I, this.J, "2.5.8");
                w = true;
            } else {
                w = false;
                this.I = "";
                this.J = "";
                cx.getInstance().login(this.b.f().toLowerCase(), this.c.f(), "2.5.8");
            }
        } else {
            cx var1 = cx.getInstance();
            System.out.println("doLoginNewGame");
            var1.e((byte) -12);
            var1.k();
        }
    }

    // a String String
    public final void onLoginNewGame(String var1, String var2) {
        System.out.println("onLoginNewGame: " + var1 + "   " + var2);
        this.I = var1;
        this.J = var2;
        this.b.a("");
        this.c.a("");
        w = true;
        v = false;
        this.doLogin();
    }
}
