package avatar;

import java.util.Vector;
import main.GameGraphic;

public final class df extends kj implements kk {

    public static df a = new df();

    public static void a() {
        ce.a().a = a;
    }

    public final void a(IOStream iOStream) {
        try {
            Vector var20;
            short var22;
            switch (iOStream.a) {
                case -75:
                    int var12 = iOStream.getDataInputStream().readInt();
                    GameGraphic.u.a(StringEntity.t, new a(this, var12), 0);
                default:
                    return;
                case -73:
                    var22 = iOStream.getDataInputStream().readShort();
                    byte[] var26 = new byte[iOStream.getDataInputStream().readInt()];
                    iOStream.getDataInputStream().read(var26);
                    ei.b().a((byte[]) var26, var22);
                    return;
                case -67:
                    byte var15 = iOStream.getDataInputStream().readByte();
                    byte var17 = -1;
                    short var19 = 0;
                    var20 = null;
                    if (var15 == 0) {
                        var19 = iOStream.getDataInputStream().readShort();
                        var17 = iOStream.getDataInputStream().readByte();
                    } else {
                        var20 = new Vector();
                        var22 = iOStream.getDataInputStream().readShort();

                        for (int var23 = 0; var23 < var22; ++var23) {
                            hn var25;
                            (var25 = new hn()).w = iOStream.getDataInputStream().readInt();
                            var25.q = iOStream.getDataInputStream().readByte();
                            var20.addElement(var25);
                        }
                    }

                    ei.b().a(var15, var17, var19, var20);
                    return;
                case -66:
                    kq var14 = new kq();
                    var14.b = iOStream.getDataInputStream().readShort();
                    var14.aw = iOStream.getDataInputStream().readByte();
                    var14.ax = iOStream.getDataInputStream().readByte();
                    ei.b().b(var14);
                    return;
                case -65:
                    byte var18 = iOStream.getDataInputStream().readByte();
                    int var13 = iOStream.getDataInputStream().readInt();
                    short var5;
                    short[] var16 = new short[var5 = iOStream.getDataInputStream().readShort()];

                    for (int var6 = 0; var6 < var5; ++var6) {
                        var16[var6] = iOStream.getDataInputStream().readByte();
                    }

                    byte var21 = iOStream.getDataInputStream().readByte();
                    var20 = new Vector();
                    short var7 = iOStream.getDataInputStream().readShort();

                    for (int var8 = 0; var8 < var7; ++var8) {
                        kq var27 = new kq();
                        var27.b = iOStream.getDataInputStream().readShort();
                        var27.aw = iOStream.getDataInputStream().readByte() * 24;
                        var27.ax = iOStream.getDataInputStream().readByte() * 24;
                        var27.c = iOStream.getDataInputStream().readByte();
                        var20.addElement(var27);
                    }

                    Vector var24 = ce.b(iOStream);
                    eo.a();
                    ei.b().a(var18, var13, var16, var21, var20, var24);
                    return;
                case -46:
                    short var9 = iOStream.getDataInputStream().readShort();
                    String var11 = iOStream.getDataInputStream().readUTF();
                    ei.b().a(var9, var11);
                    return;
                case -43:
                    short var2;
                    he[] var3 = new he[var2 = iOStream.getDataInputStream().readShort()];

                    for (int var4 = 0; var4 < var2; ++var4) {
                        var3[var4] = new he();
                        var3[var4].a = iOStream.getDataInputStream().readUTF();
                        var3[var4].b = iOStream.getDataInputStream().readInt();
                        var3[var4].c = iOStream.getDataInputStream().readInt();
                    }

                    ei.b().a(var3);
                    return;
                case 51:
                    aeClass.getInstance().a(eo.b(iOStream));
                    return;
                case 76:
                    ce.c(iOStream);
                    return;
                case 77:
                    ce.d(iOStream);
            }
        } catch (Exception var10) {
            var10.printStackTrace();
        }
    }
}
