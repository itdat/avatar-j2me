package avatar;

import java.util.Vector;

public final class lf extends kj implements kk {

    private static lf a = new lf();

    public static void a() {
        ce.a().a = a;
    }

    public final void a(IOStream iOStream) {
        try {
            ah var10;
            byte[] var13;
            switch (iOStream.a) {
                case -41:
                    var13 = new byte[iOStream.getDataInputStream().available()];
                    iOStream.getDataInputStream().read(var13);
                    fxClass.e(var13);
                    return;
                case -40:
                    var13 = new byte[iOStream.getDataInputStream().available()];
                    iOStream.getDataInputStream().read(var13);
                    fxClass.d(var13);
                    return;
                case -37:
                    var13 = new byte[iOStream.getDataInputStream().available()];
                    iOStream.getDataInputStream().read(var13);
                    fxClass.b(var13);
                    return;
                case -16:
                    var13 = new byte[iOStream.getDataInputStream().available()];
                    iOStream.getDataInputStream().read(var13);
                    fxClass.a(var13);
                    return;
                case -15:
                    byte[] var16 = new byte[iOStream.getDataInputStream().available()];
                    iOStream.getDataInputStream().read(var16);
                    fxClass.c(var16);
                    return;
                case -14:
                    (var10 = new ah()).a = iOStream.getDataInputStream().readShort();
                    var10.b = iOStream.getDataInputStream().readShort();
                    int var12 = iOStream.getDataInputStream().readUnsignedShort();
                    var10.d = new byte[var12];

                    for (int var15 = 0; var15 < var12; ++var15) {
                        var10.d[var15] = iOStream.getDataInputStream().readByte();
                    }

                    var10.c = -1;
                    if (iOStream.getDataInputStream().available() >= 2) {
                        var10.c = iOStream.getDataInputStream().readShort();
                    }

                    fxClass.a(var10);
                    return;
                case -11:
                    Vector var2 = new Vector();
                    byte var3 = iOStream.getDataInputStream().readByte();

                    for (int var4 = 0; var4 < var3; ++var4) {
                        ah var5;
                        (var5 = new ah()).a = iOStream.getDataInputStream().readShort();
                        var5.b = iOStream.getDataInputStream().readShort();
                        var2.addElement(var5);
                    }

                    short var17 = iOStream.getDataInputStream().readShort();
                    short var18 = iOStream.getDataInputStream().readShort();
                    short var14 = iOStream.getDataInputStream().readShort();
                    short var6 = iOStream.getDataInputStream().readShort();
                    short var7 = iOStream.getDataInputStream().readShort();
                    byte var8 = iOStream.getDataInputStream().readByte();

                    for (int var9 = 0; var9 < var8; ++var9) {
                        (var10 = new ah()).a = iOStream.getDataInputStream().readShort();
                        var10.b = iOStream.getDataInputStream().readShort();
                        var2.addElement(var10);
                    }

                    iOStream.getDataInputStream().readInt();
                    fxClass.a(var2, var17, var18, var14, var6, var7);
                    return;
                default:
            }
        } catch (Exception var11) {
            var11.printStackTrace();
        }
    }
}
