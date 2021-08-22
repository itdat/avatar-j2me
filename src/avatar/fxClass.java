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
import javax.microedition.rms.RecordStore;
import javax.microedition.rms.RecordStoreException;
import main.GameMidlet;

public final class fxClass {

    private static int m;
    private static int n;
    private static int o;
    public static ke[] a;
    public static ld[] b;
    public static Vector c;
    private static Vector p = new Vector();
    private static Hashtable q = new Hashtable();
    private static Hashtable r;
    public static int d = -1;
    public static Vector e = new Vector();
    private static int s;
    private static int t;
    public static Vector f = new Vector();
    public static Vector g;
    public static Hashtable h = new Hashtable();
    public static Hashtable i = new Hashtable();
    public static Hashtable j = new Hashtable();
    public static Vector k = new Vector();
    public static String l;
    private static String u;
    private static int v = 0;

    // a
    public static void deleteRecordStores() {
        try {
            String[] listRecordStores = RecordStore.listRecordStores();
            if (listRecordStores != null) {
                for (int i = 0; i < listRecordStores.length; ++i) {
                    RecordStore.deleteRecordStore(listRecordStores[i]);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void a(Vector var0, int var1, int var2, int var3, int var4, int var5) {
        awClass.a("avatar", "2.5.8");
        try {
            d = 0;
            byte[] var6 = awClass.getRecord("avatarVs");
            if (var6 != null) {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(var6);
                DataInputStream dataInputStream = new DataInputStream(byteArrayInputStream);
                n = dataInputStream.readInt();
                s = dataInputStream.readInt();
                m = dataInputStream.readInt();
                o = dataInputStream.readInt();
                t = dataInputStream.readInt();
            }

            int var7;
            ah var8;
            int var13;
            if (!i()) {
                p = var0;
                var13 = var0.size();
                for (var7 = 0; var7 < var13; ++var7) {
                    var8 = (ah) var0.elementAt(var7);
                    iy.a().a(var8.a);
                    ++d;
                }
            } else {
                var13 = var0.size();
                for (var7 = 0; var7 < var13; ++var7) {
                    ah var9;
                    if ((var9 = d((int) (var8 = (ah) var0.elementAt(var7)).a)) == null) {
                        p.addElement(var8);
                        iy.a().a(var8.a);
                        ++d;
                    } else if (var8.b != var9.b) {
                        iy.a().a(var8.a);
                        ++d;
                    }
                }
            }

            var6 = awClass.getRecord("avatarImgData");
            l = awClass.b("partImageNormal");
            boolean var10000;
            if (var6 == null) {
                var10000 = false;
            } else {
                a = g(var6);
                var10000 = true;
            }

            if (!var10000) {
                m = var1;
                iy.a().c();
                ++d;
            } else if (m != var1) {
                m = var1;
                iy.a().c();
                ++d;
            }

            if (!j()) {
                n = var2;
                iy.a().d();
                ++d;
            } else if (n != var2) {
                n = var2;
                iy.a().d();
                ++d;
            } else {
                k();
            }

            if ((var6 = awClass.getRecord("avatarItemInfo")) == null) {
                var10000 = false;
            } else {
                f(var6);
                var10000 = true;
            }

            if (!var10000) {
                o = var3;
                iy.a().e();
                ++d;
            } else if (o != var3) {
                o = var3;
                iy.a().e();
                ++d;
            }

            if ((var6 = awClass.getRecord("avatarMapItemType")) == null) {
                var10000 = false;
            } else {
                e = h(var6);
                var10000 = true;
            }

            if (!var10000) {
                s = var4;
                iy.a().f();
                ++d;
            } else if (s != var4) {
                s = var4;
                iy.a().f();
                ++d;
            }

            if ((var6 = awClass.getRecord("avatarMapType")) == null) {
                var10000 = false;
            } else {
                readMapItem(var6);
                var10000 = true;
            }

            if (!var10000) {
                t = var5;
                iy.a().g();
                ++d;
            } else if (t != var5) {
                t = var5;
                iy.a().g();
                ++d;
            }

            l();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void a(ah var0) {
        --d;
        int var1 = p.size();

        for (int var2 = 0; var2 < var1; ++var2) {
            ah var3;
            if ((var3 = (ah) p.elementAt(var2)).a == var0.a) {
                var3.d = var0.d;
                var3.b = var0.b;
                var3.c = var0.c;
                break;
            }
        }
        l();
    }

    private static void h() {
        ByteArrayOutputStream var0 = new ByteArrayOutputStream();
        DataOutputStream var1 = new DataOutputStream(var0);

        try {
            var1.writeShort(p.size());

            for (int var2 = 0; var2 < p.size(); ++var2) {
                ah var3 = (ah) p.elementAt(var2);
                var1.writeShort(var3.a);
                var1.writeShort(var3.c);
                var1.writeInt(var3.d.length);
                var1.write(var3.d);
                var1.writeShort(var3.b);
            }

            awClass.addRecord("avatarImgBig", var0.toByteArray());
            var1.close();
            awClass.a("partImageNormal", l);
        } catch (Exception var4) {
        }
    }

    private static boolean i() {
        DataInputStream var0 = a("avatarImgBig");
        long var1 = System.currentTimeMillis() / 86400000L;
        String var6 = String.valueOf((int) (var1 - 15340L));
        String var2 = String.valueOf(var6.length());
        u = var2 + System.currentTimeMillis() + var6;
        if (var0 == null) {
            return false;
        } else {
            try {
                short var7 = var0.readShort();
                p = new Vector();

                for (int var8 = 0; var8 < var7; ++var8) {
                    ah var3;
                    (var3 = new ah()).a = var0.readShort();
                    var3.c = var0.readShort();
                    int var4 = var0.readInt();
                    var3.d = new byte[var4];
                    var0.read(var3.d);
                    var3.b = var0.readShort();
                    p.addElement(var3);
                }

                var0.close();
            } catch (Exception var5) {
                b("avatarImgBig");
            }

            return true;
        }
    }

    private static ld[] b(Vector var0) {
        short var1 = 0;

        for (int var2 = 0; var2 < var0.size(); ++var2) {
            ld var3;
            if ((var3 = (ld) var0.elementAt(var2)).g > var1) {
                var1 = var3.g;
            }
        }

        ld[] var5 = new ld[var1 + 1];

        for (int var6 = 0; var6 < var0.size(); ++var6) {
            ld var4 = (ld) var0.elementAt(var6);
            var5[var4.g] = var4;
        }

        return var5;
    }

    public static Vector a(byte[] var0, boolean var1) {
        ByteArrayInputStream var9 = new ByteArrayInputStream(var0);
        DataInputStream var10 = new DataInputStream(var9);
        try {
            short var2 = 1;
            if (!var1) {
                var2 = var10.readShort();
            }
            Vector var11 = new Vector();
            for (int var3 = 0; var3 < var2; ++var3) {
                short var4 = var10.readShort();
                int var5 = var10.readInt();
                short var6 = var10.readShort();
                short var7;
                if ((var7 = var10.readShort()) == -2) {
                    iw var14;
                    (var14 = new iw()).g = var4;
                    var14.i[0] = var5;
                    var14.i[1] = var6;
                    var14.f = var7;
                    var14.l = var10.readUTF();
                    var14.k = var10.readByte();
                    var14.h = var10.readShort();
                    var11.addElement(var14);
                } else if (var7 != -1) {
                    lb var13;
                    (var13 = new lb()).g = var4;
                    var13.i[0] = var5;
                    var13.i[1] = var6;
                    var13.f = var7;
                    var13.a = var10.readShort();
                    var11.addElement(var13);
                } else {
                    fa var8;
                    (var8 = new fa()).g = var4;
                    var8.i[0] = var5;
                    var8.i[1] = var6;
                    var8.f = var7;
                    var8.l = var10.readUTF();
                    var8.k = var10.readByte();
                    var8.j = var10.readByte();
                    var8.b = var10.readByte();
                    var8.a = var10.readByte();
                    var8.h = var10.readShort();
                    var8.c = new short[15];
                    var8.d = new byte[15];
                    var8.e = new byte[15];
                    for (int var12 = 0; var12 < 15; ++var12) {
                        var8.c[var12] = var10.readShort();
                        var8.d[var12] = var10.readByte();
                        var8.e[var12] = var10.readByte();
                    }
                    var11.addElement(var8);
                }
            }
            return var11;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

    }

    public static void a(byte[] var0) {
        --d;
        b = b(a(var0, false));
        awClass.addRecord("avatarPart", var0);
        k();
        l();
    }

    private static boolean j() {
        byte[] var0 = awClass.getRecord("avatarPart");
        if (l == null) {
            char[] var1 = u.toCharArray();
            int var2 = 0;
            for (int var3 = 1; var3 < var1.length - 1; var3 += 2) {
                int var4 = Integer.parseInt(String.valueOf(var1[var3]));
                var2 += var4;
            }
            String var5 = String.valueOf(var2);
            l = var5.length() + u.substring(0, 5) + var2 + u.substring(5, u.length());
        }
        if (var0 == null) {
            return false;
        } else {
            b = b(a(var0, false));
            return true;
        }
    }

    private static void k() {
        for (int var0 = 0; var0 < b.length; ++var0) {
            if (b[var0].f >= 0) {
                ld var1 = b[b[var0].f];
                ld var2 = b[var0];
                var2.l = var1.l;
                var2.k = var1.k;
                var2.j = var1.j;
                var2.h = var1.h;
            }
        }

    }

    private static void f(byte[] bytes) {
        DataInputStream dis = new DataInputStream(new ByteArrayInputStream(bytes));
        try {
            short var1 = dis.readShort();
            c = new Vector();
            for (int var2 = 0; var2 < var1; ++var2) {
                dc var3 = new dc();
                var3.a = dis.readShort();
                var3.f = dis.readUTF();
                dis.readUTF();
                var3.d[0] = dis.readInt();
                var3.c = dis.readByte();
                var3.b = dis.readShort();
                c.addElement(var3);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void b(byte[] var0) {
        --d;
        f(var0);
        awClass.addRecord("avatarItemInfo", var0);
        l();
    }

    private static ke[] g(byte[] bytes) {
        DataInputStream dis = new DataInputStream(new ByteArrayInputStream(bytes));
        try {
            short size = dis.readShort();
            Vector var2 = new Vector();
            short var3 = 0;
            for (int i = 0; i < size; ++i) {
                ke var5 = new ke();
                var5.a = dis.readShort();
                if (var5.a > var3) {
                    var3 = var5.a;
                }
                var5.b = dis.readShort();
                var5.c = (short) dis.readUnsignedByte();
                var5.d = (short) dis.readUnsignedByte();
                var5.e = dis.readByte();
                var5.f = dis.readByte();
                var2.addElement(var5);
            }
            ke[] var9 = new ke[var3 + 1];
            for (int i = 0; i < var2.size(); ++i) {
                ke var8 = (ke) var2.elementAt(i);
                var9[var8.a] = var8;
            }
            return var9;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void b() {
        awClass.a(je.k, GameMidlet.n + go.l);
        awClass.a(GameMidlet.m, awClass.b + aeClass.j);
        awClass.a(awClass.b, GameMidlet.l + ea.i);
    }

    public static void c(byte[] var0) {
        --d;
        a = g(var0);
        awClass.addRecord("avatarImgData", var0);
        l();
    }

    private static Vector h(byte[] var0) {
        try {
            DataInputStream dis = new DataInputStream(new ByteArrayInputStream(var0));
            short var1 = dis.readShort();
            Vector var2 = new Vector();
            for (byte var3 = 0; var3 < var1; ++var3) {
                ag var4;
                (var4 = new ag()).a = dis.readShort();
                var4.g = dis.readUTF();
                dis.readUTF();
                var4.b = dis.readShort();
                var4.c = dis.readShort();
                var4.e = dis.readByte();
                var4.f = dis.readByte();
                var4.h = dis.readShort();
                if (var4.h == 32767) {
                    var4.h = -1;
                }
                if (var4.h >= 0) {
                    var4.h *= 1000;
                }
                var4.d = dis.readShort();
                var4.i = dis.readByte();
                var4.j = new Vector();
                byte var5 = dis.readByte();
                for (byte var6 = 0; var6 < var5; ++var6) {
                    dr var7 = new dr();
                    var7.a = dis.readByte();
                    var7.b = dis.readByte();
                    var4.j.addElement(var7);
                }
                var2.addElement(var4);
            }
            return var2;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void d(byte[] var0) {
        --d;
        e.removeAllElements();
        e = h(var0);
        awClass.addRecord("avatarMapItemType", var0);
        l();
    }

    // i byte[]
    private static void readMapItem(byte[] var0) {
        try {
            DataInputStream dis = new DataInputStream(new ByteArrayInputStream(var0));
            f = new Vector();
            short var1 = dis.readShort();
            System.out.println("readMapItem: " + var1);
            for (byte var2 = 0; var2 < var1; ++var2) {
                kq var3 = new kq();
                var3.a = dis.readShort();
                var3.b = dis.readShort();
                var3.f = dis.readByte();
                var3.aw = dis.readByte();
                var3.ax = dis.readByte();
                f.addElement(var3);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void e(byte[] var0) {
        --d;
        f.removeAllElements();
        readMapItem(var0);
        awClass.addRecord("avatarMapType", var0);
        l();
    }

    private static void l() {
        if (d == 0) {
            ByteArrayOutputStream var0 = new ByteArrayOutputStream();
            DataOutputStream var1 = new DataOutputStream(var0);

            try {
                var1.writeInt(n);
                var1.writeInt(s);
                var1.writeInt(m);
                var1.writeInt(o);
                var1.writeInt(t);
                awClass.addRecord("avatarVs", var0.toByteArray());
                var1.close();
            } catch (Exception var4) {
            }
            h();
            int var5 = p.size();
            ah var2;
            int var6;
            for (var6 = 0; var6 < var5; ++var6) {
                if ((var2 = (ah) p.elementAt(var6)).c != -1) {
                    byte[] var3 = d((int) var2.c).d;
                    System.arraycopy(var2.d, 0, var3, 0, var2.d.length);
                    var2.d = var3;
                }
                var2.e = awClass.a(var2.d);
            }

            if (main.GameGraphic.isRimOrBlackBerry || main.GameGraphic.isNokiaN7) {
                r = new Hashtable();
            }

            for (var6 = 0; var6 < p.size(); ++var6) {
                (var2 = (ah) p.elementAt(var6)).d = null;
                q.put("" + var2.a, var2);
            }

            for (var6 = 0; var6 < p.size(); ++var6) {
                var2 = (ah) p.elementAt(var6);
                if (r != null) {
                    b(var2);
                }
            }
            p.removeAllElements();
            p = null;
            GameMidlet.i.h();
            aeClass.getInstance().t();
        }
    }

    private static void b(ah var0) {
        Image var1 = Image.createImage(var0.e.getWidth(), var0.e.getHeight());
        Graphics var2 = var1.getGraphics();
        var2.setColor(16711935);
        var2.fillRect(0, 0, var1.getWidth(), var1.getHeight());

        int var3;
        for (var3 = 0; var3 < a.length; ++var3) {
            if (var0.a == a[var3].b) {
                var2.drawRegion(var0.e, a[var3].c * gy.Y, a[var3].d * gy.Y, a[var3].e * gy.Y, a[var3].f * gy.Y, gx.J, a[var3].c, a[var3].d, 0);
            }
        }

        for (var3 = 0; var3 < b.length; ++var3) {
            if (b[var3] != null && b[var3].f >= 0 && b[var3].g < 2000) {
                fa var4 = (fa) a(b[var3].f);
                for (int var5 = 0; var5 < var4.c.length; ++var5) {
                    ke var6 = a[var4.c[var5]];
                    if (((lb) b[var3]).a == var0.a) {
                        int var10002 = var6.c * gy.Y;
                        int var10003 = var6.d * gy.Y;
                        int var10004 = var6.e * gy.Y;
                        int var10005 = var6.f * gy.Y;
                        var2.drawRegion(a((int) var0.a).e, var10002, var10003, var10004, var10005, gx.J, var6.c, var6.d, 0);
                    }
                }
            }
        }

        var1 = awClass.a(var1, -65281);
        ah var7;
        (var7 = new ah()).c = var0.c;
        var7.a = var0.a;
        var7.e = var1;
        var7.b = var0.b;
        r.put("" + var7.a, var7);
    }

    public static void a(Graphics var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
        int var10002;
        if (var8 != 0 && (main.GameGraphic.isRimOrBlackBerry || main.GameGraphic.isNokiaN7)) {
            var10002 = var2 * gy.Y;
            var0.drawRegion(((ah) r.get("" + var1)).e, var10002, var3 * gy.Y, var4 * gy.Y, var5 * gy.Y, 0, var6, var7, 0);
        } else {
            var10002 = var2 * gy.Y;
            int var10003 = var3 * gy.Y;
            int var10004 = var4 * gy.Y;
            int var10005 = var5 * gy.Y;
            var0.drawRegion(a(var1).e, var10002, var10003, var10004, var10005, var8, var6, var7, 0);
        }
    }

    public static DataInputStream a(String var0) {
        byte[] var1;
        if ((var1 = awClass.getRecord(var0)) == null) {
            return null;
        } else {
            ByteArrayInputStream var2 = new ByteArrayInputStream(var1);
            return new DataInputStream(var2);
        }
    }

    public static void c() {
        ByteArrayOutputStream var0 = new ByteArrayOutputStream();
        DataOutputStream var1 = new DataOutputStream(var0);
        try {
            var1.writeByte(GameMidlet.providerByte);
            var1.writeUTF(GameMidlet.agentStr);
            awClass.addRecord("avatarSV", var0.toByteArray());
            var1.close();
        } catch (Exception var2) {
            var2.printStackTrace();
        }
    }

    public static void d() {
        DataInputStream var0;
        if ((var0 = a("avatarSV")) != null) {
            try {
                GameMidlet.providerByte = var0.readByte();
                GameMidlet.agentStr = var0.readUTF();
                var0.close();
            } catch (Exception var1) {
                var1.printStackTrace();
            }
        }
    }

    public static void e() {
        ByteArrayOutputStream var0 = new ByteArrayOutputStream();
        DataOutputStream var1 = new DataOutputStream(var0);
        try {
            var1.writeByte(dm.getInstance().b[4]);
            var1.writeByte(GameMidlet.cityIpAddresses[dm.getInstance().b[4]].length);
            for (int var2 = 0; var2 < GameMidlet.cityIpAddresses[dm.getInstance().b[4]].length; ++var2) {
                var1.writeByte(GameMidlet.cityIpAddresses[dm.getInstance().b[4]][var2].length);
                var1.writeUTF(GameMidlet.cityNames[dm.getInstance().b[4]][var2][0]);

                for (int var3 = 0; var3 < GameMidlet.cityIpAddresses[dm.getInstance().b[4]][var2].length; ++var3) {
                    var1.writeUTF(GameMidlet.cityNames[dm.getInstance().b[4]][var2][var3 + 1]);
                    var1.writeUTF(GameMidlet.cityIpAddresses[dm.getInstance().b[4]][var2][var3]);
                    var1.writeInt(GameMidlet.cityPorts[dm.getInstance().b[4]][var2][var3]);
                }
            }
            awClass.addRecord("avatarSV", var0.toByteArray());
            var1.close();
        } catch (Exception var4) {
            var4.printStackTrace();
        }
    }

    public static void f() {
        DataInputStream var0;
        if ((var0 = a("avatarSV")) != null) {
            try {
                if (var0.readByte() == dm.getInstance().b[4]) {
                    byte var1;
                    if ((var1 = var0.readByte()) == 0) {
                        b("avatarSV");
                    } else {
                        GameMidlet.cityNames = new String[2][var1][];
                        GameMidlet.cityIpAddresses = new String[2][var1][];
                        GameMidlet.cityPorts = new int[2][var1][];

                        for (int var2 = 0; var2 < var1; ++var2) {
                            byte var3 = var0.readByte();
                            GameMidlet.cityNames[dm.getInstance().b[4]][var2] = new String[var3 + 1];
                            GameMidlet.cityNames[dm.getInstance().b[4]][var2][0] = var0.readUTF();
                            GameMidlet.cityIpAddresses[dm.getInstance().b[4]][var2] = new String[var3];
                            GameMidlet.cityPorts[dm.getInstance().b[4]][var2] = new int[var3];

                            for (int var4 = 0; var4 < var3; ++var4) {
                                GameMidlet.cityNames[dm.getInstance().b[4]][var2][var4 + 1] = var0.readUTF();
                                GameMidlet.cityIpAddresses[dm.getInstance().b[4]][var2][var4] = var0.readUTF();
                                GameMidlet.cityPorts[dm.getInstance().b[4]][var2][var4] = var0.readInt();
                            }
                        }
                        var0.close();
                    }
                }
            } catch (IOException var5) {
                var5.printStackTrace();
                b("avatarSV");
            }
        }
    }

    private static ah d(int var0) {
        int var1 = p.size();
        for (int var2 = 0; var2 < var1; ++var2) {
            ah var3;
            if ((var3 = (ah) p.elementAt(var2)).a == var0) {
                return var3;
            }
        }
        return null;
    }

    public static ah a(int var0) {
        return (ah) q.get("" + var0);
    }

    public static ag b(int var0) {
        int var1 = e.size();

        for (int var2 = 0; var2 < var1; ++var2) {
            if (((ag) e.elementAt(var2)).a == var0) {
                return (ag) e.elementAt(var2);
            }
        }
        return null;
    }

    public static void a(Vector var0) {
        g = var0;
    }

    public static boolean c(int var0) {
        return var0 == 10 || var0 == 20 || var0 == 30 || var0 == 40 || var0 == 50;
    }

    public static fa a(Vector var0, int var1) {
        if (var0 != null) {
            for (int var2 = 0; var2 < var0.size(); ++var2) {
                hx var3;
                ld var4 = a((var3 = (hx) var0.elementAt(var2)).a);
                if (var3 != null && var4 instanceof fa && ((fa) var4).j == var1) {
                    return (fa) var4;
                }
            }
        }
        return null;
    }

    public static hx b(Vector var0, int var1) {
        int var2 = var0.size();

        for (int var3 = 0; var3 < var2; ++var3) {
            hx var4;
            if ((var4 = (hx) var0.elementAt(var3)).a == var1) {
                return var4;
            }
        }
        return null;
    }

    public static hx a(int var0, Vector var1) {
        int var2 = var1.size();

        for (int var3 = 0; var3 < var2; ++var3) {
            hx var4;
            if (a((var4 = (hx) var1.elementAt(var3)).a).j == var0) {
                return var4;
            }
        }
        return null;
    }

    public static ld a(short var0) {
        if (var0 >= 2000) {
            Object var1;
            if ((var1 = (ld) j.get("" + var0)) == null) {
                ((ld) (var1 = new fa())).g = -1;
                j.put("" + var0, var1);
                cx.getInstance().b(var0);
            }
            return (ld) var1;
        } else {
            return b[var0];
        }
    }

    public static String a(ld var0) {
        return var0.f >= 0 ? a(var0.f).l : var0.l;
    }

    public static void a(Graphics var0, int var1, int var2, int var3, int var4) {
        if (c((short) var1).d != -1) {
            var0.drawImage(c((short) var1).a, var2, var3, var4);
        }
    }

    public static f b(short var0) {
        f var1;
        if ((var1 = (f) i.get("" + var0)) == null) {
            var1 = new f();
            i.put("" + var0, var1);
            cx.getInstance().c(var0);
        } else if (var1.d >= 0) {
            var1.d = (int) (System.currentTimeMillis() / 1000L);
        }
        return var1;
    }

    public static f c(short var0) {
        f var1;
        if ((var1 = (f) h.get("" + var0)) == null) {
            var1 = new f();
            h.put("" + var0, var1);
            iy.a().b(var0);
        } else if (var1.d >= 0) {
            var1.d = (int) (System.currentTimeMillis() / 1000L);
        }
        return var1;
    }

    public static void g() {
        Enumeration var0;
        String var1;
        f var2;
        if (h.size() > 50) {
            var0 = h.keys();
            while (var0.hasMoreElements()) {
                var1 = (String) var0.nextElement();
                if ((var2 = (f) h.get(var1)).d != -1 && System.currentTimeMillis() / 1000L - (long) var2.d > (long) main.GameGraphic.V) {
                    h.remove(var1);
                }
            }
        }

        if (i.size() > 50) {
            var0 = i.keys();
            while (var0.hasMoreElements()) {
                var1 = (String) var0.nextElement();
                if ((var2 = (f) i.get(var1)).d != -1 && System.currentTimeMillis() / 1000L - (long) var2.d > (long) main.GameGraphic.V) {
                    i.remove(var1);
                }
            }
        }
    }

    public static int b(ld var0) {
        byte var1;
        if (var0.f >= 0) {
            var1 = ((fa) a(var0.f)).a;
        } else {
            var1 = ((fa) var0).a;
        }
        return var1;
    }

    public static al d(short var0) {
        for (int var1 = 0; var1 < k.size(); ++var1) {
            al var2;
            if ((var2 = (al) k.elementAt(var1)).e == var0) {
                return var2;
            }
        }
        return null;
    }

    public static void b(String var0) {
        try {
            RecordStore.deleteRecordStore("2.5.8" + var0);
        } catch (RecordStoreException var1) {
        }
    }
}
