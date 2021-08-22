package avatar;

import java.io.IOException;
import java.util.Vector;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import main.GameMidlet;

public final class gw implements EwInterface {

    private static ht a;
    private static Image b;
    private static Image c;
    private static Image d;
    private static Image e;
    private static Image[] f;
    private static ht[] g;
    private static ht h;
    private static ht i;
    private static Image[] j;
    private static ht k;
    private static ht l;
    private static byte[][] m = new byte[][]{{4, 6, 17, 0, 27, 14, 0, 27, 36}, {4, 6, 17, 0, 17, 13, 0, 37, 13}, {4, 6, 17, 0, 17, 13, 0, 37, 13, 0, 27, 36}, {4, 6, 17, 0, 17, 13, 0, 37, 13, 0, 17, 36, 0, 37, 36}, {4, 6, 17, 0, 17, 13, 0, 37, 13, 0, 17, 36, 0, 37, 36, 0, 27, 30}, {4, 6, 17, 0, 17, 13, 0, 37, 13, 0, 17, 28, 0, 37, 28}, {4, 6, 17, 0, 17, 13, 0, 37, 13, 0, 17, 28, 0, 37, 28, 0, 27, 36}, {4, 6, 17, 0, 17, 13, 0, 37, 13, 0, 17, 28, 0, 37, 28, 0, 27, 20}, {4, 6, 17, 8, 27, 36}, {4, 6, 17, 9, 27, 36}, {4, 6, 17, 10, 27, 36}, {4, 6, 17, 0, 27, 36}, {4, 6, 17, 0, 27, 14}};
    private static int n;
    private byte o;
    private byte p;
    private byte q;
    private static int r;
    private static int s;
    private static int t;
    private static int u;

    static {
        KeyboardManager.s = 0;
        je.d = new int[]{6201499, 2378578, 8705740, 2716523, 16701696, 7042560};
        n = 0;
        r = 35217;
        s = 32382;
        t = 23135;
        u = 14414578;
    }

    public gw() {
        try {
            main.GameGraphic.Y = Image.createImage(StringEntity.a() + "/12Plus.png");
        } catch (IOException var3) {
            var3.printStackTrace();
        }

        ImageModel.b(StringEntity.EFFECT_AV);
        hn.ap = ht.a("5", 50, 48);
        hn.aq = ht.a("2", 11, 10);
        main.GameGraphic.image = ImageModel.getImageFromIndex("transtab");
        gr.s[0] = ImageModel.getImageFromIndex("s1");
        gr.s[1] = ImageModel.getImageFromIndex("s2");
        je.a = ht.a("arrowup", 9, 6);
        jj.b = ht.a("busy", 16, 16);
        le.f = ht.a("cmd", 24, 24);
        aeClass.k = ImageModel.getImageFromIndex("bar");
        aeClass.d = ImageModel.getImageFromIndex("arF");
        ht.a("icon", 17, 19);
        hn.ae = new ht(ImageModel.getImageFromIndex("dauhoathi"), 9, 9);
        h = ht.a("check", 12, 12);
        KeyboardManager.r = ht.a("tb", 4, 19);
        a = ht.a("round", 8, 8);
        je.b = ht.a("ar2", 4, 6);
        i = new ht(ImageModel.getImageFromIndex("arW"), 6, 11);

        for (int var1 = 0; var1 < 2; ++var1) {
            ea.k[var1] = ImageModel.getImageFromIndex("cl" + var1);
        }

        ImageModel.cleanUp();

        try {
            hj.ao = Image.createImage(StringEntity.a() + "/on/msg0.on");
            el.b = new ht(Image.createImage(StringEntity.a() + "/on/stat.on"), 11, 11);
        } catch (IOException var2) {
            var2.printStackTrace();
        }
    }

    public final void a(Graphics var1, int var2, int var3, int var4, int var5, KeyboardManager var6, boolean var7) {
        if (var7) {
            KeyboardManager.r.a(2, var2 + 1, var3 + 1, 0, var1);
            KeyboardManager.r.a(3, var2 + var4 - 5, var3 + 1, 0, var1);
            je.a(var2 + 4, var3 + 1, var4 - 8, 2, 2716523, var1);
            var1.fillRect(var2 + 4, var3 + 18, var4 - 8, 2);
            je.a(var2 + 4, var3 + 3, var4 - 8, 1, 2704964, var1);
            je.a(var2 + 4, var3 + 4, var4 - 8, 1, 5014141, var1);
            je.a(var2 + 4, var3 + 5, var4 - 8, 13, 6201499, var1);
        } else {
            KeyboardManager.r.a(0, var2 + 1, var3 + 1, 0, var1);
            KeyboardManager.r.a(1, var2 + var4 - 5, var3 + 1, 0, var1);
            je.a(var2 + 4, var3 + 2, var4 - 9, 1, 11074288, var1);
            var1.fillRect(var2 + 4, var3 + 18, var4 - 9, 1);
            je.a(var2 + 4, var3 + 3, var4 - 9, 1, 2704964, var1);
            je.a(var2 + 4, var3 + 4, var4 - 9, 1, 5014141, var1);
            je.a(var2 + 4, var3 + 5, var4 - 9, 13, 6201499, var1);
        }

        var1.setClip(var2 + 3, var3 + 1, var4 - 8, var5 - 2);
        var1.setColor(0);
        if (var6.g.equals("")) {
            main.GameGraphic.K.a(var1, var6.q, 5 + var6.j + var2, var3 + (var5 - gy.af) / 2, 0);
        } else {
            main.GameGraphic.M.a(var1, var6.g, 5 + var6.j + var2, var3 + (var5 - gy.af) / 2 + 1, 0);
        }

        if (var6.d() && var6.k == 0 && (var6.l > 0 || var6.i / 5 % 2 == 0)) {
            var1.setColor(16777215);
            var1.fillRect(5 + var6.j + var2 + main.GameGraphic.M.a(var6.g.substring(0, var6.h)) - 1 + 1, var3 + (var5 - KeyboardManager.f) / 2 + 2, 1, var5 - 5 * gy.Y);
        }

        if (var7 && main.GameGraphic.j() - KeyboardManager.o < 2) {
            int var8 = main.GameGraphic.K.a(KeyboardManager.p[KeyboardManager.n]);
            var1.setClip(0, 0, main.GameGraphic.width, main.GameGraphic.height);
            je.a(var2 + var4 - var8 - 4, var3 + 4, var8 + 1, var5 - 6, 8969676, var1);
            je.a(var2 + var4 - var8 - 4, var3 + 4, var8 + 1, 1, 5614233, var1);
            main.GameGraphic.K.a(var1, KeyboardManager.p[KeyboardManager.n], var2 + var4 - 3, var3 + 3, 1);
        }

    }

    public final void a(Graphics var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
        a.a(0 + (var8 << 2), var2, var3, 0, var1);
        a.a(1 + (var8 << 2), var2 + var4 - 8, var3, 0, var1);
        a.a(2 + (var8 << 2), var2, var3 + var5 - 8, 0, var1);
        a.a(3 + (var8 << 2), var2 + var4 - 8, var3 + var5 - 8, 0, var1);
        je.a(var2 + 8, var3, var4 - 16, 8, var6, var1);
        var1.fillRect(var2 + 8, var3 + var5 - 8, var4 - 16, 7);
        var1.fillRect(var2, var3 + 8, var4, var5 - 16);
        je.a(var2 + 8, var3, var4 - 16, 1, var7, var1);
        var1.fillRect(var2 + 8, var3 + var5 - 1, var4 - 16, 1);
        var1.fillRect(var2, var3 + 8, 1, var5 - 16);
        var1.fillRect(var2 + var4 - 1, var3 + 8, 1, var5 - 16);
    }

    public final void a(Graphics var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int[] var13, int[] var14, String var15) {
        main.GameGraphic.c(var1);
        this.a(var1, var2, var3, var5, var4, je.d[0], je.d[1], 0);

        int var16;
        int var17;
        int var10002;
        int var18;
        for (var17 = var7; var17 < var6; ++var17) {
            var10002 = var13[var17]++;
            if (var13[var17] > 20) {
                var13[var17] = 0;
            }

            var18 = var14[var17];
            if (je.a().n[var17] > 5) {
                var18 = 0;
            }

            var16 = var17 - var7;
            a.a(var18 + 4, var2 + 3 + var16 * var8, var3 + 3, 0, var1);
            je.a(var2 + 11 + var16 * var8, var3 + 3, var9 - 16, var10 - 2, je.d[2 + var18 / 2], var1);
            var1.fillRect(var2 + 3 + var16 * var8, var3 + 11, var9 - 1, var10);
            je.a(var2 + 11 + var16 * var8, var3 + 3, var9 - 16, 1, je.d[3 + var18 / 2], var1);
            var1.fillRect(var2 + 3 + var16 * var8, var3 + 11, 1, var10 + 1);
            var1.fillRect(var2 + 2 + var9 + var16 * var8, var3 + 11, 1, var10 + 1);
        }

        var17 = var11;
        if (var11 >= var12) {
            var17 = var12 + var7;
        }

        for (var18 = var17 - 1; var18 >= var6; --var18) {
            var10002 = var13[var18]++;
            if (var13[var18] > 20) {
                var13[var18] = 0;
            }

            var11 = var14[var18];
            if (var13[var18] > 5) {
                var11 = 0;
            }

            var16 = var18 - var7;
            if (var18 == var6) {
                a.a(var11 + 4, var2 + 3 + var16 * var8, var3 + 3, 0, var1);
            }

            a.a(var11 + 5, var2 + 3 + var9 - 8 + var16 * var8, var3 + 3, 0, var1);
            je.a(var2 + 11 + var16 * var8, var3 + 3, var9 - 16, 8, je.d[2 + var11 / 2], var1);
            var1.fillRect(var2 + 3 + var16 * var8, var3 + 11, var9 - 1, 15);
            je.a(var2 + 11 + var16 * var8, var3 + 3, var9 - 16, 1, je.d[3 + var11 / 2], var1);
            var1.fillRect(var2 + 3 + var16 * var8, var3 + 11, 1, 20);
            var1.fillRect(var2 + 2 + var9 + var16 * var8, var3 + 11, 1, 15);
        }

        this.a(var1, var2 + 3, var3 + var10, var5 - 6, var4 - var10 - 3, je.d[2], je.d[3], 1);
        je.a(var2 + 4 + (var6 - var7) * var8, var3 + var10 / 2, var9 - 2, var10, je.d[2], var1);
        main.GameGraphic.K.a(var1, var15, var2 + 3 + var9 / 2 + (var6 - var7) * var8, var3 + var10 / 2 - gy.ah / 2, 2);
    }

    public final void a(Graphics var1, Button var2, Button var3, Button var4) {
        if (var2 != null && var2.text != null) {
            main.GameGraphic.L.a(var1, var2.text, main.GameGraphic.ae[0].a + 2, main.GameGraphic.ae[0].b + main.GameGraphic.T / 2 - gy.ag / 2, 0);
        }

        if (var3 != null && var3.text != null) {
            main.GameGraphic.L.a(var1, var3.text, main.GameGraphic.ae[1].a + hj.au / 2, main.GameGraphic.ae[1].b + main.GameGraphic.T / 2 - gy.ag / 2, 2);
        }

        if (var4 != null && var4.text != null) {
            main.GameGraphic.L.a(var1, var4.text, main.GameGraphic.ae[2].a + hj.au - 2, main.GameGraphic.ae[2].b + main.GameGraphic.T / 2 - gy.ag / 2, 1);
        }

    }

    public final void a(Graphics var1, int var2, int var3, int var4, int var5) {
        this.a(var1, var2, var3, var4, var5, 0);
    }

    public final void b() {
        if (b == null) {
            try {
                f = new Image[14];
                g = new ht[2];

                int var1;
                for (var1 = 0; var1 < 14; ++var1) {
                    f[var1] = Image.createImage(StringEntity.a() + "/card/c" + var1 + ".png");
                }

                var1 = f[12].getWidth();
                int var2 = f[12].getHeight();
                Image var3;
                Graphics var4;
                (var4 = (var3 = Image.createImage(var1 << 1, var2 << 1)).getGraphics()).setColor(-523560);
                var4.fillRect(0, 0, var1 << 1, var2 << 1);
                var4.drawImage(f[12], 0, 0, 0);
                var4.drawRegion(f[12], 0, 0, var1, var2, 2, var1, 0, 0);
                var4.drawRegion(f[12], 0, 0, var1, var2, 1, 0, var2, 0);
                var4.drawRegion(f[12], 0, 0, var1, var2, 3, var1, var2, 0);
                var3 = awClass.a(var3, -65315);
                f[12] = var3;
                g[0] = new ht(Image.createImage(StringEntity.a() + "/card/f.png"), 8, 9);
                g[1] = new ht(Image.createImage(StringEntity.a() + "/card/g.png"), 8, 9);
                b = Image.createImage(StringEntity.a() + "/card/cb.png");
                c = Image.createImage(StringEntity.a() + "/card/cb1.png");
                d = Image.createImage(StringEntity.a() + "/card/cb2.png");
            } catch (Exception var5) {
                var5.printStackTrace();
            }
        }
    }

    public final void a(Graphics var1, ax var2) {
        if (var2.b == -1) {
            var1.drawImage(f[12], var2.c - 27, var2.d - 36, 0);
        } else {
            var1.drawImage(c, var2.c - 27, var2.d - 36, 0);
            d(var1, var2);
        }
    }

    public final void b(Graphics var1, ax var2) {
        if (var2.b == -1) {
            var1.drawImage(f[12], var2.c - 27, var2.d - 36, 0);
        } else {
            var1.drawImage(b, var2.c - 27, var2.d - 36, 0);
            d(var1, var2);
        }
    }

    private static void d(Graphics var0, ax var1) {
        int var2 = 0;

        while (var2 < 2) {
            int var3;
            if ((var3 = m[var1.h[var1.j]][var2++]) == 0 || var3 == 4) {
                var3 += var1.i;
            }

            if (var1.i == 0 && var1.h[var1.j] == 11 && var3 == 0) {
                var3 = 11;
            }

            byte var4 = m[var1.h[var1.j]][var2++];
            byte var5 = m[var1.h[var1.j]][var2++];
            var0.drawImage(f[var3], var1.c - 27 + var4, var1.d - 36 + var5, 3);
        }

        g[var1.k].a(var1.h[var1.j], var1.c - 27 + 5, var1.d - 36 + 7, 0, 3, var0);
    }

    public final void c(Graphics var1, ax var2) {
        if (var2.b == -1) {
            var1.drawImage(f[12], var2.c - 27, var2.d - 36, 0);
        } else {
            var1.drawImage(b, var2.c - 27, var2.d - 36, 0);
            int var3 = 0;

            while (var3 < m[var2.h[var2.j]].length) {
                int var4;
                if ((var4 = m[var2.h[var2.j]][var3++]) == 0 || var4 == 4) {
                    var4 += var2.i;
                }

                if (var2.i == 0 && var2.h[var2.j] == 11 && var4 == 0) {
                    var4 = 11;
                }

                byte var5 = m[var2.h[var2.j]][var3++];
                byte var6 = m[var2.h[var2.j]][var3++];
                var1.drawImage(f[var4], var2.c - 27 + var5, var2.d - 36 + var6, 3);
                if (var6 < 30) {
                    var1.drawRegion(f[var4], 0, 0, f[var4].getWidth(), f[var4].getHeight(), 1, var2.c + 27 - var5, var2.d + 36 - var6, 3);
                }
            }

            g[var2.k].a(var2.h[var2.j], var2.c - 27 + 5, var2.d - 36 + 7, 0, 3, var1);
            g[var2.k].a(var2.h[var2.j], var2.c + 27 - 5, var2.d + 36 - 7, 3, 3, var1);
        }
    }

    public final void a(Graphics var1, ax var2, boolean var3) {
        if (var2.b == -1) {
            var1.drawImage(f[12], var2.c - 13, var2.d - 16, 0);
        } else {
            var1.drawImage(d, var2.c - 13, var2.d - 16, 0);
            g[var2.k].a(var2.h[var2.j], var2.c - 13 + 6, var2.d - 16 + 7, 0, 3, var1);
            if (var3) {
                var1.drawImage(f[var2.i + 4], var2.c - 13 + 6 + 7, var2.d - 16 + 7, 3);
            } else {
                var1.drawImage(f[var2.i + 4], var2.c - 13 + 6, var2.d - 16 + 17, 3);
            }

            var1.drawImage(f[var2.i], var2.c - 13 + 17, var2.d - 16 + 17, 3);
        }
    }

    public final void a() {
        gy.Z = 5;
    }

    public final void a(Graphics var1) {
        byte var2 = 0;
        if (main.GameGraphic.r == es.a || main.GameGraphic.r == ea.a) {
            var2 = 14;
        }

        if (hj.as > 0 && main.GameGraphic.v == null) {
            var1.drawImage(hj.ao, main.GameGraphic.width - 8 * gy.Y - 2, var2 + 2, 17);
            main.GameGraphic.L.a(var1, "" + hj.as, main.GameGraphic.width - 16 * gy.Y - 4, 1 + 6 * gy.Y - gy.ag / 2 + var2, 1);
        }

        if (hj.ap != null && main.GameGraphic.m()) {
            var1.drawImage(hj.ap, 25, 25, 3);
            if (GameMidlet.e == 9) {
                var1.drawImage(hj.aq, 75, 25, 3);
            }
        }

    }

    public final void c() {
        hj.av = main.GameGraphic.height / 12;
        if ((hj.at = main.GameGraphic.height / 18) < 18) {
            hj.at = 18;
        }

        if (hj.at > 45) {
            hj.at = 45;
        }

        if (main.GameGraphic.H) {
            hj.at = 35;
        }

        gy.ab = 0;
        int var1 = main.GameGraphic.T = hj.at;
        if (hj.av < 20 || main.GameGraphic.INST == null || !main.GameGraphic.H) {
            hj.av = 20;
        }

        if (hj.av > 50) {
            hj.av = 50;
        }

        hj.au = main.GameGraphic.width / 4;
        main.GameGraphic.ae[0] = new dr(2, main.GameGraphic.height - var1, 2);
        main.GameGraphic.ae[1] = new dr(main.GameGraphic.o - hj.au / 2, main.GameGraphic.height - var1, 2);
        main.GameGraphic.ae[2] = new dr(main.GameGraphic.width - hj.au - 2, main.GameGraphic.height - var1, 2);
        main.GameGraphic.af = new dr(main.GameGraphic.width - 2, 1, 1);
    }

    public final int d() {
        for (int var1 = 0; var1 < 3; ++var1) {
            if (main.GameGraphic.a(main.GameGraphic.ae[var1].a, main.GameGraphic.ae[var1].b, hj.au, main.GameGraphic.T)) {
                return var1;
            }
        }

        return -1;
    }

    public final void a(es var1) {
        var1.l = 176;
        if (var1.i) {
            var1.m = 170;
        } else {
            var1.m = 130;
        }

        if (var1.l > main.GameGraphic.width) {
            var1.l = main.GameGraphic.width;
            var1.m = 100;
        }

        var1.x = (var1.m - 20) / 3;
        var1.y = 10;
        var1.j = main.GameGraphic.o - var1.l / 2;
        var1.k = main.GameGraphic.p - var1.m / 2 + 5;
        int var2 = var1.k + 15 + 4;
        var1.b.b = var2;
        var1.b.a = var1.c.a = var1.d.a = var1.e.a = var1.q;
        var1.b.c = var1.c.c = var1.d.c = var1.e.c = var1.p;
        var2 += var1.b.d + 15;
        var1.c.b = var2;
        var2 += var1.b.d + 15;
        var1.d.b = var2;
        var1.o = var2 - 10;
        var2 += var1.b.d + 15;
        var1.e.b = var2;
        var1.n = var1.c.a - 40;
    }

    public final void a(Graphics var1, int var2, int var3, int var4, int var5, int var6) {
        this.a(var1, var2, var3, var4, var5, je.d[var6], je.d[var6 + 1], 0);
        this.a(var1, var2 + 3, var3 + 3, var4 - 6, var5 - 6, je.d[2], je.d[3], 1);
    }

    public final void a(Graphics var1, int var2, int var3, int var4, boolean var5) {
        byte var6 = 0;
        if (var4 == 2) {
            var6 = 1;
        }

        h.a(var6, var2, var3 + gy.ah / 2, 0, var1);
        if (var5) {
            h.a(2, var2, var3 + gy.ah / 2, 0, var1);
        }

        main.GameGraphic.K.a(var1, StringEntity.bQ, var2 + 15, var3 + h.b / 2, 0);
    }

    public final void b(Graphics var1, int var2, int var3, int var4, int var5) {
        var1.setColor(15530985);
        var1.fillRect(0, var3, var4, var5);
    }

    public final void b(Graphics var1, int var2, int var3, int var4, int var5, int var6) {
        je.b.a(var5, var2 - n / 5, var3 - 3, 0, 3, var1);
        je.b.a(var6, var2 + var4 + n / 5, var3 - 3, 3, 3, var1);
        if (++n >= 15) {
            n = 0;
        }

    }

    public final void a(Graphics var1, String var2, int var3, int var4, int var5) {
        main.GameGraphic.K.a(var1, var2, var3, var4, var5);
    }

    public final void c(Graphics var1, int var2, int var3, int var4, int var5) {
        var1.setColor(14279153);
        var1.fillRect(var2, var3, var4, var5);
    }

    public final void a(int var1) {
        if (var1 == 14 || var1 == 15 || var1 == 16) {
            if (gy.ak) {
                KeyboardManager.m = true;
            }

            dm.d = true;
            main.GameGraphic.INST.sizeChanged(0, 0);
        }

    }

    public final void e() {
        int var1 = main.GameGraphic.height;
        dr[] var10000 = new dr[]{new dr(main.GameGraphic.o + 5, 5, 0), new dr(5, var1 / 2, 0), new dr(main.GameGraphic.o + 5, var1 - 50, 0), new dr(main.GameGraphic.width - 5, var1 / 2, 1)};
        var10000 = new dr[]{new dr(main.GameGraphic.o, 2, 3), new dr(10, var1 / 2, 20), new dr(main.GameGraphic.o - 10, var1 - 75 - hj.at, 3), new dr(main.GameGraphic.width - 60, var1 / 2, 3)};
        int var2 = main.GameGraphic.height - 24;
        var1 = var1 - 15 - main.GameGraphic.T;
        if (main.GameGraphic.width < 200) {
            kg.c = new dr[]{new dr(main.GameGraphic.o, kx.A / 2, 0), new dr(kx.z / 2, var2 / 2, 0), new dr(main.GameGraphic.o, var1 - kx.A + 20, 0), new dr(main.GameGraphic.width - kx.z / 2 - 3, var2 / 2, 0)};
            kg.d = new dr[]{new dr(main.GameGraphic.o, kx.A, 0), new dr(kx.z + 3, var2 / 2, 0), new dr(main.GameGraphic.o, var1 - kx.A / 2 + 20, 0), new dr(main.GameGraphic.width - 3, var2 / 2, 0)};
            kg.b = new dr[]{new dr(main.GameGraphic.o, kx.A + kx.A / 2 + 2, 2), new dr(kx.z / 4 * 3 + kx.z / 2 + 5, var2 / 2, 0), new dr(main.GameGraphic.o, var1 - kx.A - gy.ai - 5, 2), new dr(main.GameGraphic.width - kx.z - 5, var2 / 2 - 5, 1)};
        } else {
            kg.c = new dr[]{new dr(main.GameGraphic.o, kx.A / 2, 0), new dr(kx.z / 2, var2 / 2, 0), new dr(main.GameGraphic.o, var1 - kx.A / 2, 0), new dr(main.GameGraphic.width - kx.z / 2, var2 / 2, 0)};
            kg.d = new dr[]{new dr(main.GameGraphic.o, 0, 0), new dr(kx.z / 4 * 3, var2 / 2, 0), new dr(main.GameGraphic.o, var1 - kx.A / 2 + kx.A / 4, 0), new dr(main.GameGraphic.width - kx.z / 4, var2 / 2, 0)};
            kg.b = new dr[]{new dr(main.GameGraphic.o, kx.A + 2, 2), new dr(kx.z / 4 * 3 + kx.z / 2 + 5, var2 / 2 - 10, 0), new dr(main.GameGraphic.o, var1 - kx.A - gy.ai - 1, 2), new dr(main.GameGraphic.width - kx.z - 5, var2 / 2 - 10, 1)};
        }
    }

    public final void a(Graphics var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, String var10, int var11, int var12) {
        var6 = var2 % var3 * var4;
        var3 = (var2 / var3 + 1) * var4;
        var4 = var6 + var4 / 2;
        var1.setClip(var4 - var5 / 2, var3, var5, var7);
        var6 = (var7 - (gy.Z << 1)) / 4;
        this.a(var1, var4 - var5 / 2, var3, var5, var7, 0);
        var3 += gy.Z + 8;
        if (var8 == 1) {
            ((az) gb.e.elementAt(var2)).a(var1, var4, var3 + var6 / 2, 0, 3);
        } else {
            gb.b[var2].a(var1, 7, var4, var3 + var6 / 2, 3);
        }

        main.GameGraphic.L.a(var1, String.valueOf(var9), var4, var3 + var6 / 2 + var6 - 2, 2);
        main.GameGraphic.K.a(var1, var10, var4, var3 + var6 / 2 + (var6 << 1), 2);
        var2 = var3 + var6 / 2 + var6 + gy.ah / 2;
        i.a(var11 / 3, var4 - 17, var2 + 1, 2, 3, var1);
        i.a(var12 / 3, var4 - 17 + 35, var2, 0, 3, var1);
    }

    public final void a(Graphics var1, int var2, int var3, int var4, boolean var5, int var6, int[] var7) {
        main.GameGraphic.N.a(var1, StringEntity.aX + var6, main.GameGraphic.o, main.GameGraphic.p + var2 * var4 / 2 - 20, 2);
        var1.translate(main.GameGraphic.o - (var2 * var3 + 10) / 2 + 4, main.GameGraphic.p - var2 * var4 / 2 + 4);
        var1.setClip(0, 3, var2 * var3 + 2, var2 * var4 - 32);
        var1.translate(1, -ho.i);
        if (!var5) {
            main.GameGraphic.S.c(var1, var6 % var3 * var2, var6 / var3 * var2, var2, var2);
        }

        int var8;
        if ((var8 = (var4 = ho.i / var2 * var3) + var2 * 7 / var2 * var3 + var3) > var7.length) {
            var8 = var7.length;
        }

        for (var4 = var4; var4 < var8; ++var4) {
            el.b.a(var7[var4], var4 % var3 * var2 + var2 / 2, var4 / var3 * var2 + var2 / 2, 0, 3, var1);
        }

    }

    public final void b(Graphics var1) {
        for (int var2 = 0; var2 < main.GameGraphic.width / 50 + 1; ++var2) {
            for (int var3 = 0; var3 < main.GameGraphic.height / 71 + 1; ++var3) {
                var1.drawImage(e, var2 * 50, var3 * 71, 0);
            }
        }
    }

    public final void a(Graphics var1, int var2, int var3) {
        var1.drawImage(la.c, var2, var3, 3);
    }

    public final void a(Graphics var1, String var2, String var3, String var4) {
        var1.setClip(0, 0, main.GameGraphic.width, main.GameGraphic.height);
        main.GameGraphic.S.b(var1);
        main.GameGraphic.R.a(var1, var2, main.GameGraphic.o, 2, 2);
        var1.setColor(6192786);
        var1.fillRect(0, 25, main.GameGraphic.width, hj.al);
        main.GameGraphic.M.a(var1, var3, 10, 28, 0);
        main.GameGraphic.M.a(var1, var4, main.GameGraphic.width - 10, 28, 1);
    }

    public final void b(int var1) {
        try {
            if (var1 == 0) {
                jp.f = new ht(Image.createImage(StringEntity.a() + "/on/imgBan2.on"), 60, 46);
            } else if (var1 == 1) {
                jp.f = new ht(Image.createImage(StringEntity.a() + "/on/imgBan4.on"), 60, 46);
            } else {
                jp.f = new ht(Image.createImage(StringEntity.a() + "/on/imgBan5.on"), 60, 46);
            }
        } catch (IOException var2) {
            var2.printStackTrace();
        }
    }

    public final void f() {
        try {
            je.d = new int[]{21080, 12313816, 8703190, 2713971, 5107863, 4559225};
            a = new ht(Image.createImage(StringEntity.a() + "/on/round.on"), 8, 8);
            e = Image.createImage(StringEntity.a() + "/on/bg.on");
            j = new Image[8];

            for (int var1 = 0; var1 < 8; ++var1) {
                j[var1] = Image.createImage(StringEntity.a() + "/on/imgPopup" + var1 + ".on");
            }

            l = new ht(Image.createImage(StringEntity.a() + "/barMoney.png"), 10, 10);
        } catch (IOException var2) {
            var2.printStackTrace();
        }
    }

    public final void g() {
        je.d = new int[]{6201499, 2378578, 8705740, 2716523, 16701696, 7042560};
        ImageModel.b(StringEntity.EFFECT_AV);
        a = ht.a("round", 8, 8);
        ImageModel.cleanUp();
        e = null;
        l = null;
        jy.a = null;
        kd.a = null;
        kg.a = null;
        la.a = null;
        kx.i = null;
        kn.d = null;
    }

    public final void h() {
        try {
            k = new ht(Image.createImage(StringEntity.a() + "/on/imgDoor.on"), 45, 44);
            new ht(Image.createImage(StringEntity.a() + "/on/trangthai.on"), 11, 4);
            jp.i = Image.createImage(StringEntity.a() + "/on/imgSelectban.on");
        } catch (IOException var2) {
            var2.printStackTrace();
        }
    }

    public final void i() {
        el.a = null;
        jp.a = null;
        kx.i = null;
        ek.a = null;
        ja.a = null;
    }

    public final void d(Graphics var1, int var2, int var3, int var4, int var5) {
        var1.setColor(12442838);
        byte var6 = 0;
        byte var7 = 30;
        if (var2 > 0) {
            var7 = 50;
            var6 = 40;
        }

        var1.fillRect(4, je.o + 20 + gy.af / 2 + var6 - var7 / 2, je.a().f - 8, var7);
        main.GameGraphic.K.a(var1, var3 == 1 ? StringEntity.et[0] : StringEntity.et[1], je.a().f / 2, je.o + 20, 2);
        je.a.a(0, je.a().f / 2 - 35 - var4 / 2, je.o + 20 + gy.af / 2 + var6, 4, 3, var1);
        je.a.a(0, je.a().f / 2 + 35 + var5 / 2, je.o + 20 + gy.af / 2 + var6, 7, 3, var1);
        GameMidlet.i.a(var1, je.a().f / 2 + 1, je.o + 87, false);
        main.GameGraphic.K.a(var1, StringEntity.aA + GameMidlet.i.x, je.a().f / 2, je.o + 100, 2);
        main.GameGraphic.K.a(var1, StringEntity.ao + GameMidlet.i.c, je.a().f / 2, je.o + 115, 2);
    }

    public final void j() {
        if (main.GameGraphic.g) {
            if (main.GameGraphic.b(je.a().g + je.a().f / 2 - 20, je.a().h + je.o + gy.af / 2, 40, 40)) {
                ic.b().b(0);
                main.GameGraphic.g = false;
            } else if (main.GameGraphic.b(je.a().g + je.a().f / 2 - 20, je.a().h + je.o + 95 - GameMidlet.i.aA / 2 - 20, 40, 45)) {
                ic.b().b(1);
                main.GameGraphic.g = false;
            } else if (main.GameGraphic.b(je.a().g + je.a().f / 2 - 20 - 40, je.a().h + je.o + gy.af / 2 + 50 * ic.b().a, 40, 40)) {
                ic.b().c(-1);
                ic.b().b = 6;
                main.GameGraphic.g = false;
            } else if (main.GameGraphic.b(je.a().g + je.a().f / 2 - 20 + 40, je.a().h + je.o + gy.af / 2 + 50 * ic.b().a, 40, 40)) {
                ic.b().c(1);
                ic.b().c = 6;
                main.GameGraphic.g = false;
            }
        }

        if (main.GameGraphic.a(2)) {
            ic.b().b(ic.b().a - 1);
        } else if (main.GameGraphic.a(4)) {
            ic.b().c(-1);
            ic.b().b = 6;
        } else if (main.GameGraphic.a(6)) {
            ic.b().c(1);
            ic.b().c = 6;
        } else {
            if (main.GameGraphic.a(8)) {
                ic.b().b(ic.b().a + 1);
            }

        }
    }

    public final void b(Graphics var1, Button var2, Button var3, Button var4) {
        int var5 = main.GameGraphic.height2 - main.GameGraphic.T / 2 - gy.ag / 2;
        if (var2 != null && var2.text != "") {
            main.GameGraphic.L.a(var1, var2.text, 4, var5, 0);
        }

        if (var3 != null && var3.text != "") {
            main.GameGraphic.L.a(var1, var3.text, main.GameGraphic.o, var5, 2);
        }

        if (var4 != null && var4.text != "") {
            main.GameGraphic.L.a(var1, var4.text, main.GameGraphic.width - 4, var5, 1);
        }

    }

    public final void e(Graphics var1, int var2, int var3, int var4, int var5) {
        boolean var9 = true;
        var5 = var5;
        var4 = var4;
        var3 = var3;
        var2 = var2;
        var1 = var1;
        int var6 = j[0].getWidth();
        int var7 = j[0].getHeight();
        var1.drawImage(j[0], var2, var3, 0);

        int var8;
        for (var8 = 1; var8 < var4 / var6 - 1; ++var8) {
            var1.drawImage(j[1], var2 + var6 * var8, var3, 0);
        }

        var1.drawImage(j[1], var2 + var4 - (var6 << 1), var3, 0);
        var1.drawImage(j[2], var2 + var4 - var6, var3, 0);
        if (var5 / var7 > 2) {
            for (var8 = 1; var8 < var5 / var7; ++var8) {
                var1.drawImage(j[3], var2, var3 + var7 * var8, 0);
                var1.drawImage(j[4], var2 + var4 - var6, var3 + var7 * var8, 0);
            }

            var1.drawImage(j[3], var2, var3 + var5 - (var7 << 1), 0);
            var1.drawImage(j[4], var2 + var4 - var6, var3 + var5 - (var7 << 1), 0);
        }

        if (var5 > (var7 << 1) - 20 && var5 <= var7 * 3) {
            var1.drawImage(j[3], var2, var3 + var5 / 2 - var7 / 2, 0);
            var1.drawImage(j[4], var2 + var4 - var6, var3 + var5 / 2 - var7 / 2, 0);
        }

        var1.drawImage(j[5], var2, var3 + var5 - var7, 0);

        for (var8 = 1; var8 < var4 / var6 - 1; ++var8) {
            var1.drawImage(j[6], var2 + var6 * var8, var3 + var5 - var7, 0);
        }

        var1.drawImage(j[6], var2 + var4 - (var6 << 1), var3 + var5 - var7, 0);
        var1.drawImage(j[7], var2 + var4 - var6, var3 + var5 - var7, 0);
        var1.setColor(t);
        var1.fillRect(var2 + 10, var3 + 10, var4 - 20, var5 - 20);
    }

    public final void f(Graphics var1, int var2, int var3, int var4, int var5) {
        if (gy.Y == 1) {
            var1.setColor(s);
            var1.fillRect(0, var3 + 1, var4, var5 - var3 + 1);
        } else {
            var1.setColor(s);
            var1.fillRect(0, var3 + 1, var4, var5 - var3 + 2);
        }
    }

    public final void g(Graphics var1, int var2, int var3, int var4, int var5) {
        var1.setColor(r);
        var1.fillRect(2, var3, var4, var5);
    }

    public final void c(Graphics var1) {
        var1.setColor(s);
        var1.fillRect(0, main.GameGraphic.height2 - main.GameGraphic.T + 1, main.GameGraphic.width, main.GameGraphic.T);
        var1.setColor(u);
        var1.fillRect(0, main.GameGraphic.height2 - main.GameGraphic.T, main.GameGraphic.width, 1);
    }

    public final void a(Button var1, Button var2, Button var3) {
        if (main.GameGraphic.g) {
            switch (b(var1, var2, var3)) {
                case 1:
                    this.o = 1;
                    main.GameGraphic.g = false;
                    break;
                case 2:
                    this.p = 1;
                    main.GameGraphic.g = false;
                    break;
                case 3:
                    this.q = 1;
                    main.GameGraphic.g = false;
            }
        }

        if (main.GameGraphic.e) {
            switch (b(var1, var2, var3)) {
                case 1:
                    this.p = this.q = 0;
                    break;
                case 2:
                    this.o = this.q = 0;
                    break;
                case 3:
                    this.p = this.o = 0;
                    break;
                default:
                    this.p = this.o = this.q = 0;
            }
        }

        if (main.GameGraphic.f) {
            switch (b(var1, var2, var3)) {
                case 1:
                    if (this.o == 1) {
                        var1.b();
                        main.GameGraphic.f = false;
                        this.o = 0;
                        return;
                    }
                    break;
                case 2:
                    if (this.p == 1) {
                        this.p = 0;
                        var2.b();
                        main.GameGraphic.f = false;
                        return;
                    }
                    break;
                case 3:
                    if (this.q == 1) {
                        this.q = 0;
                        var3.b();
                        main.GameGraphic.f = false;
                    }
            }
        }

    }

    private static int b(Button var0, Button var1, Button var2) {
        if (var0 != null && !var0.text.equals("") && main.GameGraphic.a(0, main.GameGraphic.height2 - main.GameGraphic.T, 95, main.GameGraphic.T)) {
            return 1;
        } else if (var1 != null && !var1.text.equals("") && main.GameGraphic.a(main.GameGraphic.width / 2 - 43 - 8, main.GameGraphic.height2 - main.GameGraphic.T, 95, main.GameGraphic.T)) {
            return 2;
        } else {
            return var2 != null && !var2.text.equals("") && main.GameGraphic.a(main.GameGraphic.width - 87 - 8, main.GameGraphic.height2 - main.GameGraphic.T, 95, main.GameGraphic.T) ? 3 : 0;
        }
    }

    public final void a(Graphics var1, Vector var2, int var3, int var4) {
        main.GameGraphic.c(var1);
        var1.translate(0, main.GameGraphic.y.e);
        var1.translate(0, -ho.i);
        int var6 = (var3 - gy.ag) / 2;
        int var7;
        if ((var7 = ho.i / var3 - 2) < 0) {
            var7 = 0;
        }

        int var8;
        if ((var8 = var7 + (main.GameGraphic.height - 40) / var3 + 3) > var2.size()) {
            var8 = var2.size();
        }

        int var5 = 4 + var7 * var3;

        for (var7 = var7; var7 < var8; ++var7) {
            be var9 = (be) var2.elementAt(var7);
            if (var7 == var4 && var9.a != -1) {
                main.GameGraphic.S.g(var1, 2, var5, main.GameGraphic.width - 4, var3);
            }

            if (var9.a == -1) {
                main.GameGraphic.L.a(var1, StringEntity.ex[var9.c], 15, var5 + 8 + (main.GameGraphic.Z == 0 ? -4 : 0), 0);
                main.GameGraphic.S.f(var1, 0, var5 + 25, main.GameGraphic.width, var5 + 25);
            } else {
                k.a(0, 22, var5 + var3 / 2 + 1, 0, 3, var1);
                main.GameGraphic.M.a(var1, StringEntity.V + var9.a, 50, var5 + var6, 0);
                if (var9.b >= 0 && var9.b <= 2) {
                    el.b.a(var9.b, main.GameGraphic.width - 20, var5 + var3 / 2, 0, 3, var1);
                }
            }

            var5 += var3;
        }

    }

    public final void h(Graphics var1, int var2, int var3, int var4, int var5) {
        l.a(0, var2, var3, 0, var1);
        l.a(1, var2 + var4 - 10, var3, 0, var1);
        l.a(2, var2, var3 + var5 - 10, 0, var1);
        l.a(3, var2 + var4 - 10, var3 + var5 - 10, 0, var1);
        var1.setColor(29555);
        var1.fillRect(var2 + 10, var3 + 1, var4 - 20, var5 - 2);
        var1.fillRect(var2 + 1, var3 + 10, 9, var5 - 20);
        var1.fillRect(var2 + var4 - 10, var3 + 10, 9, var5 - 20);
        var1.setColor(16777215);
        var1.fillRect(var2 + 10, var3, var4 - 20, 1);
        var1.fillRect(var2 + 10, var3 + var5 - 1, var4 - 20, 1);
        var1.fillRect(var2, var3 + 10, 1, var5 - 20);
        var1.fillRect(var2 + var4 - 1, var3 + 10, 1, var5 - 20);
    }
}
