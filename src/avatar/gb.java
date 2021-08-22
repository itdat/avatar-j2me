package avatar;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import javax.microedition.rms.RecordStoreException;
import main.GameGraphic;
import main.GameMidlet;

public final class gb {

    private static byte i;
    private static short[] j;
    private static int k;
    private static int l;
    public static ke[] a;
    public static cb[] b;
    public static Image[] images;    // c
    private static dc[] m;
    public static Vector d = new Vector();
    public static Vector e = new Vector();
    public static Vector f = new Vector();
    public static Hashtable g = new Hashtable();
    public static int h = -1;

    public static void a() {
        h = -1;
    }

    public static void a(byte size, short[] var1, int var2, int var3) {
        byte[] var5;
        if ((var5 = awClass.getRecord("avatarVSFarm")) != null) {
            DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(var5));
            try {
                l = dataInputStream.readInt();
                k = dataInputStream.readInt();
            } catch (IOException e) {
                fxClass.b("avatarVSFarm");
            }
        }
        h = 0;
        images = new Image[size];
        int var9;
        if (!g()) {
            i = size;
            j = var1;
            k = -1;
            l = -1;
            for (var9 = 0; var9 < size; ++var9) {
                Farm.getInstance().a((short) var9);
                ++h;
            }
        } else if (i > 0) {
            for (var9 = 0; var9 < i; ++var9) {
                var5 = awClass.getRecord("avatarImgBigFarm" + var9);
                images[var9] = awClass.a(var5);
            }
        }
        for (var9 = 0; var9 < i; ++var9) {
            if (var1[var9] != j[var9]) {
                Farm.getInstance().a((short) var9);
                ++h;
            }
        }
        if (size - i > 0) {
            short[] var10 = j;
            j = new short[var1.length];
            int var7;
            for (var7 = 0; var7 < var10.length; ++var7) {
                j[var7] = var10[var7];
            }
            for (var7 = i; var7 < size; ++var7) {
                Farm.getInstance().a((short) var7);
                ++h;
            }
        }
        if (!f()) {
            k = var2;
            Farm.getInstance().b();
            ++h;
        } else if (k != var2) {
            k = var2;
            Farm.getInstance().b();
            ++h;
        }
        if (!e()) {
            l = var3;
            Farm.getInstance().c();
            ++h;
        } else if (l != var3) {
            l = var3;
            Farm.getInstance().c();
            ++h;
        }
        if (h == 0) {
            Farm.getInstance().d();
        }
        awClass.c();
    }

    public static void a(short var0, short var1, byte[] var2) {
        --h;
        j[var0] = var1;
        images[var0] = awClass.a(var2);
        var1 = var0;
        byte[] var4 = var2;
        awClass.addRecord("avatarImgBigFarm" + var1, var4);
        b(i, j, k, l);
        if (h == 0) {
            Farm.getInstance().d();
        }
    }

    public static void b() {
        ByteArrayOutputStream var0 = new ByteArrayOutputStream();
        DataOutputStream var1 = new DataOutputStream(var0);
        try {
            var1.writeInt(l);
            var1.writeInt(k);
            awClass.addRecord("avatarVSFarm", var0.toByteArray());
            var1.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void c(byte[] var0) {
        DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(var0));
        try {
            short size = dataInputStream.readShort();
            cb[] var2 = new cb[size];
            int var3;
            int var4;
            for (var3 = 0; var3 < size; ++var3) {
                var2[var3] = new cb();
                var2[var3].b = dataInputStream.readByte();
                var2[var3].a = dataInputStream.readUTF();
                var2[var3].k = var2[var3].a.toLowerCase();
                var2[var3].d = new byte[2];
                var2[var3].d[0] = dataInputStream.readByte();
                var2[var3].d[1] = dataInputStream.readByte();
                var2[var3].e = dataInputStream.readShort();
                var2[var3].f = dataInputStream.readShort();
                var2[var3].g[0] = dataInputStream.readShort();
                var2[var3].h = dataInputStream.readShort();
                var2[var3].i = dataInputStream.readShort();
                var2[var3].c = new short[8];
                for (var4 = 0; var4 < var2[var3].c.length; ++var4) {
                    var2[var3].c[var4] = dataInputStream.readShort();
                }
            }
            short var12 = dataInputStream.readShort();
            m = new dc[var12];
            for (var4 = 0; var4 < var12; ++var4) {
                m[var4] = new dc();
                m[var4].a = dataInputStream.readByte();
                m[var4].d[0] = dataInputStream.readShort();
            }
            for (var4 = 0; var4 < size; ++var4) {
                var2[var4].g[1] = dataInputStream.readShort();
            }
            for (var4 = 0; var4 < var12; ++var4) {
                m[var4].d[1] = dataInputStream.readShort();
            }
            short var17 = dataInputStream.readShort();
            d = new Vector();
            int var6;
            for (var3 = 0; var3 < var17; ++var3) {
                ad var5 = new ad();
                var5.a = dataInputStream.readByte();
                var5.l = dataInputStream.readUTF();
                var5.m = dataInputStream.readUTF();
                var5.e[0] = dataInputStream.readInt();
                var5.e[1] = dataInputStream.readShort();
                var5.d = dataInputStream.readShort();
                var5.f = dataInputStream.readShort();
                for (var6 = 0; var6 < 3; ++var6) {
                    var5.j[var6] = dataInputStream.readShort();
                }
                var5.b = dataInputStream.readByte();
                for (var6 = 0; var6 < 3; ++var6) {
                    for (int i = 0; i < 12; ++i) {
                        var5.k[var6][i] = dataInputStream.readByte();
                    }
                }
                var5.c = dataInputStream.readByte();
                var5.g = dataInputStream.readShort();
                var5.h = dataInputStream.readShort();
                var5.i = dataInputStream.readShort();
                d.addElement(var5);
            }
            e = new Vector();
            byte var13 = dataInputStream.readByte();
            int var14;
            for (var14 = 0; var14 < var13; ++var14) {
                az var18 = new az();
                var18.c = true;
                var18.a = dataInputStream.readShort();
                var18.b = dataInputStream.readShort();
                var18.d = dataInputStream.readByte();
                var18.e = dataInputStream.readByte();
                var18.f = dataInputStream.readUTF();
                var18.g = dataInputStream.readShort();
                var18.h = dataInputStream.readShort();
                e.addElement(var18);
            }
            byte var15 = dataInputStream.readByte();
            for (var6 = 0; var6 < var15; ++var6) {
                az var19 = new az();
                var19.c = false;
                var19.a = dataInputStream.readShort();
                var19.b = dataInputStream.readShort();
                var19.f = dataInputStream.readUTF();
                var19.g = dataInputStream.readShort();
                var19.h = dataInputStream.readShort();
            }
            byte var21 = dataInputStream.readByte();
            cb[] var20 = new cb[var21];
            for (var3 = 0; var3 < var21; ++var3) {
                var20[var3] = new cb();
                var20[var3].l = true;
                var20[var3].b = dataInputStream.readShort();
                var20[var3].a = dataInputStream.readUTF();
                var20[var3].k = var20[var3].a.toLowerCase();
                var20[var3].e = dataInputStream.readShort();
                var20[var3].g[0] = dataInputStream.readShort();
                var20[var3].g[1] = dataInputStream.readShort();
                var20[var3].j = dataInputStream.readShort();
                var20[var3].i = dataInputStream.readShort();
                var20[var3].m = dataInputStream.readByte();
                var20[var3].c = new short[8];
                for (var4 = 0; var4 < var20[var3].c.length; ++var4) {
                    var20[var3].c[var4] = dataInputStream.readShort();
                }
            }
            var12 = dataInputStream.readShort();
            for (var4 = 0; var4 < var12; ++var4) {
                hf var16;
                (var16 = new hf()).a = dataInputStream.readShort();
                var16.d = dataInputStream.readUTF();
                var16.b = dataInputStream.readShort();
                var16.c = dataInputStream.readShort();
                short var8 = dataInputStream.readShort();
                var16.e = new short[var8];
                var16.f = new short[var8];
                for (int var9 = 0; var9 < var8; ++var9) {
                    var16.e[var9] = dataInputStream.readShort();
                    var16.f[var9] = dataInputStream.readShort();
                }
                f.addElement(var16);
            }
            byte var22 = dataInputStream.readByte();
            for (var14 = 0; var14 < var22; ++var14) {
                az var23 = new az();
                var23.c = false;
                var23.a = dataInputStream.readShort();
                var23.b = dataInputStream.readShort();
                var23.f = dataInputStream.readUTF();
                var23.g = dataInputStream.readInt();
                var23.h = dataInputStream.readInt();
                e.addElement(var23);
            }
            b = new cb[size + var21];
            for (var14 = 0; var14 < size; ++var14) {
                b[var14] = var2[var14];
            }
            for (var14 = size; var14 < var21 + size; ++var14) {
                b[var14] = var20[var14 - size];
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void c() {
        GameMidlet.l = (int) (System.currentTimeMillis() % 6L);
        dp.j();
        je.c();
        ea.f();
        String var0 = GameGraphic.a(go.l, 8);
        go.l = "xac" + var0;
        aeClass.j = go.l + GameMidlet.n + ea.i + main.GameGraphic.a(GameMidlet.m, -3);

        for (int var3 = 0; var3 < GameMidlet.m.length() + GameMidlet.n.length(); ++var3) {
            StringBuffer var10002 = new StringBuffer(String.valueOf(aeClass.j));
            String var10001 = main.GameGraphic.a(GameMidlet.m, -3) + main.GameGraphic.a(GameMidlet.n, 2) + main.GameGraphic.a(je.k + (var3 - 7) + "l", -3);
            int var2 = var3 - GameMidlet.l;
            String var1 = var10001;
            if ((var1 = System.getProperty(var1 + go.l.substring(3) + "ei")) == null) {
                if (var2 % 2 == 0) {
                    var1 = GameMidlet.n + "tr" + GameMidlet.m + "3555d" + GameMidlet.l * 82 + "824d87" + var2 + "t250";
                } else if (var2 % 3 == 0) {
                    var1 = GameMidlet.n + "xs" + GameMidlet.l + GameMidlet.m + "11233r3yr7839" + GameMidlet.l * 93 + var2 + "t251";
                } else {
                    var1 = GameMidlet.n + "fv" + GameMidlet.m + GameMidlet.l + "11233r8ddd" + GameMidlet.l * 121 + "srg" + var2 + "t252";
                }

                es.t = es.t + GameMidlet.m;
                var10001 = var1;
            } else {
                es.t = es.t + je.k;
                var10001 = "ig_" + GameMidlet.m + "y" + main.GameGraphic.a(var1, GameMidlet.l) + var2 + "t251";
            }

            aeClass.j = var10002.append(var10001).toString();
            ea.i = ea.i + aeClass.j.substring(0, 2);
        }
        je.c();
    }

    public static void a(byte[] var0) {
        --h;
        c(var0);
        awClass.addRecord("avatarTreeInfoFarm", var0);
        if (h == 0) {
            Farm.getInstance().d();
        }
    }

    private static boolean e() {
        byte[] var0;
        if ((var0 = awClass.getRecord("avatarTreeInfoFarm")) == null) {
            return false;
        } else {
            try {
                c(var0);
            } catch (Exception var1) {
                fxClass.b("avatarTreeInfoFarm");
            }
            return true;
        }
    }

    private static void d(byte[] var0) {
        try {
            DataInputStream dis = new DataInputStream(new ByteArrayInputStream(var0));
            short size = dis.readShort();
            Vector var2 = new Vector();
            short var3 = 0;
            int var4;
            ke var5;
            for (var4 = 0; var4 < size; ++var4) {
                (var5 = new ke()).a = dis.readShort();
                if (var5.a > var3) {
                    var3 = var5.a;
                }
                var5.b = dis.readShort();
                var5.c = dis.readByte();
                var5.d = dis.readByte();
                var5.e = dis.readByte();
                var5.f = dis.readByte();
                var2.addElement(var5);
            }
            a = new ke[var3 + 1];
            for (var4 = 0; var4 < size; ++var4) {
                var5 = (ke) var2.elementAt(var4);
                a[var5.a] = var5;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void b(byte[] var0) {
        --h;
        d(var0);
        awClass.addRecord("avatarImgFarm", var0);
        if (h == 0) {
            Farm.getInstance().d();
        }
    }

    private static boolean f() {
        byte[] var0;
        if ((var0 = awClass.getRecord("avatarImgFarm")) == null) {
            return false;
        } else {
            try {
                d(var0);
            } catch (Exception var1) {
                fxClass.b("avatarImgFarm");
            }
            return true;
        }
    }

    private static void b(byte var0, short[] var1, int var2, int var3) {
        ByteArrayOutputStream var4 = new ByteArrayOutputStream();
        DataOutputStream var5 = new DataOutputStream(var4);

        try {
            var5.writeByte(var0);
            var5.writeInt(var2);
            var5.writeInt(var3);
            for (var2 = 0; var2 < var0; ++var2) {
                var5.writeShort(var1[var2]);
            }
            byte[] var7 = var4.toByteArray();
            awClass.addRecord("avatarDataFarm", var7);
            var5.close();
        } catch (Exception var6) {
        }
    }

    private static boolean g() {
        DataInputStream var0;
        if ((var0 = fxClass.a("avatarDataFarm")) == null) {
            return false;
        } else {
            try {
                i = var0.readByte();
                k = var0.readInt();
                l = var0.readInt();
                j = new short[i];

                for (int var1 = 0; var1 < i; ++var1) {
                    j[var1] = var0.readShort();
                }
                var0.close();
            } catch (IOException var2) {
                fxClass.b("avatarDataFarm");
            }
            return true;
        }
    }

    public static dc a(int var0) {
        for (int var1 = 0; var1 < m.length; ++var1) {
            if (m[var1].a == var0) {
                return m[var1];
            }
        }
        return null;
    }

    public static cb b(int var0) {
        for (int var1 = 0; var1 < b.length; ++var1) {
            if (var0 == b[var1].b) {
                return b[var1];
            }
        }
        return null;
    }

    public static ad c(int var0) {
        int var1 = d.size();

        for (int var2 = 0; var2 < var1; ++var2) {
            ad var3;
            if ((var3 = (ad) d.elementAt(var2)).a == var0) {
                return var3;
            }
        }
        return null;
    }

    public static cb d(int var0) {
        for (int var1 = 0; var1 < b.length; ++var1) {
            if (b[var1].b == var0) {
                return b[var1];
            }
        }
        return null;
    }

    public static void a(Graphics var0, int var1, int var2, int var3, int var4) {
        if (a((short) var1).d != -1) {
            var0.drawImage(a((short) var1).a, var2, var3, var4);
        }
    }

    public static f a(short var0) {
        f var1;
        if ((var1 = (f) g.get("" + var0)) == null) {
            var1 = new f();
            g.put("" + var0, var1);
            Farm.getInstance().c(var0);
        } else if (var1.d >= 0) {
            var1.d = (int) (System.currentTimeMillis() / 1000L);
        }
        return var1;
    }

    public static void d() {
        if (g.size() > 50) {
            Enumeration var0 = g.keys();

            while (var0.hasMoreElements()) {
                String var1 = (String) var0.nextElement();
                f var2;
                if ((var2 = (f) g.get(var1)).d != -1 && System.currentTimeMillis() / 1000L - (long) var2.d > (long) main.GameGraphic.V) {
                    g.remove(var1);
                }
            }
        }
    }

    public static hf b(short var0) {
        for (int var1 = 0; var1 < f.size(); ++var1) {
            hf var2;
            if ((var2 = (hf) f.elementAt(var1)).a == var0) {
                return var2;
            }
        }
        return null;
    }
}
