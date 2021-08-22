package avatar;

import java.io.IOException;
import main.GameMidlet;

public final class eo extends kj implements kk {

    public static eo a;

    public static void a() {
        if (a == null) {
            a = new eo();
        }
        ce.a().a = a;
    }

    public final void a(IOStream iOStream) {
        try {
            int var2;
            short var4;
            int var7;
            int var10;
            short var11;
            byte var12;
            byte var14;
            int var16;
            int var18;
            String var20;
            switch (iOStream.a) {
                case -69:
                    main.GameGraphic.b(StringEntity.dl, new ka(this));
                    return;
                case -68:
                    var14 = iOStream.getDataInputStream().readByte();
                    var10 = iOStream.getDataInputStream().readInt();
                    aeClass.getInstance().a(var14, var10);
                    return;
                case 51:
                    aeClass.getInstance().a(b(iOStream));
                    return;
                case 53:
                    var10 = iOStream.getDataInputStream().readInt();
                    aeClass.getInstance();
                    aeClass.c(var10);
                    return;
                case 54:
                    ce.c(iOStream);
                    return;
                case 55:
                    ce.d(iOStream);
                    return;
                case 57:
                    var2 = iOStream.getDataInputStream().readInt();
                    var12 = iOStream.getDataInputStream().readByte();
                    aeClass.getInstance();
                    aeClass.a(var2, var12);
                    return;
                case 58:
                    var2 = iOStream.getDataInputStream().readInt();
                    var16 = iOStream.getDataInputStream().readInt();
                    var4 = iOStream.getDataInputStream().readShort();
                    var20 = "";
                    if (var4 == -1) {
                        var20 = iOStream.getDataInputStream().readUTF();
                    }

                    int var22 = iOStream.getDataInputStream().readInt();
                    iOStream.getDataInputStream().readByte();
                    System.out.println("AVATAR_GIFT_GIVING: " + iOStream.getDataInputStream().available());
                    var7 = iOStream.getDataInputStream().readInt();
                    int var25 = iOStream.getDataInputStream().readInt();
                    var10 = iOStream.getDataInputStream().readInt();
                    aeClass.getInstance().onGiftGiving(var2, var16, var4, var20, var22, var7, var25, var10);
                    return;
                case 59:
                    var2 = iOStream.getDataInputStream().readInt();
                    var16 = iOStream.getDataInputStream().readInt();
                    var4 = iOStream.getDataInputStream().readShort();
                    var20 = "";
                    short var21 = 0;
                    if (var4 == -1) {
                        var20 = iOStream.getDataInputStream().readUTF();
                    } else {
                        var21 = iOStream.getDataInputStream().readShort();
                    }

                    aeClass.getInstance().a(var2, var16, var4, var20, var21);
                    return;
                case 60:
                    int[] var15 = new int[var14 = iOStream.getDataInputStream().readByte()];

                    for (var18 = 0; var18 < var14; ++var18) {
                        var15[var18] = iOStream.getDataInputStream().readByte();
                    }

                    aeClass.getInstance().a(var15);
                    main.GameGraphic.h();
                    return;
                case 78:
                    return;
                case 82:
                    var18 = iOStream.getDataInputStream().readInt();
                    kv.b().b(var18);
                    return;
                case 84:
                    var2 = iOStream.getDataInputStream().readInt();
                    var11 = iOStream.getDataInputStream().readShort();
                    kv.b().c(var2, var11);
                    return;
                case 85:
                    var10 = iOStream.getDataInputStream().readInt();
                    kv.b().e(var10);
                    return;
                case 86:
                    boolean var23 = iOStream.getDataInputStream().readBoolean();
                    String var24 = "";
                    if (!var23) {
                        var24 = iOStream.getDataInputStream().readUTF();
                    }

                    kv.b().a(var23, var24);
                    return;
                case 87:
                    var2 = iOStream.getDataInputStream().readInt();
                    var12 = iOStream.getDataInputStream().readByte();
                    kv.b();
                    kv.e(var2, var12);
                    return;
                case 88:
                    var2 = iOStream.getDataInputStream().readInt();
                    byte var13 = iOStream.getDataInputStream().readByte();
                    byte var17 = iOStream.getDataInputStream().readByte();
                    int var19 = iOStream.getDataInputStream().readInt();
                    var11 = iOStream.getDataInputStream().readShort();
                    kv.b().a(var2, var13, var17, var19, var11);
                    return;
                case 91:
                    var2 = iOStream.getDataInputStream().readInt();
                    short var3 = iOStream.getDataInputStream().readShort();
                    var4 = iOStream.getDataInputStream().readShort();
                    byte var5;
                    byte[][] var6 = new byte[var5 = iOStream.getDataInputStream().readByte()][];

                    for (var7 = 0; var7 < var5; ++var7) {
                        short var8 = iOStream.getDataInputStream().readShort();
                        var6[var7] = new byte[var8];
                        iOStream.getDataInputStream().read(var6[var7]);
                    }

                    kv.b().a(var2, var3, var4, var6);
                    return;
                case 92:
                    if (aeClass.s = iOStream.getDataInputStream().readBoolean()) {
                        GameMidlet.i.Z = iOStream.getDataInputStream().readShort();
                    }
                    break;
                case 93:
                    var2 = iOStream.getDataInputStream().readInt();
                    var10 = iOStream.getDataInputStream().readInt();
                    aeClass.getInstance().onWeddingStart(var2, var10);
                default:
            }
        } catch (Exception var9) {
            var9.printStackTrace();
        }

    }

    public static hn b(IOStream iOStream) {
        hn var1 = new hn();
        try {
            var1.w = iOStream.getDataInputStream().readInt();
            var1.a(iOStream.getDataInputStream().readUTF());
            byte var2 = iOStream.getDataInputStream().readByte();
            for (int var3 = 0; var3 < var2; ++var3) {
                var1.a(new hx(iOStream.getDataInputStream().readShort()));
            }
            var1.aw = var1.C = iOStream.getDataInputStream().readShort();
            var1.ax = var1.D = iOStream.getDataInputStream().readShort();
            var1.ac = iOStream.getDataInputStream().readByte();
            var1.W = (byte) (100 - iOStream.getDataInputStream().readByte());
            var1.X = iOStream.getDataInputStream().readShort();
            var1.aa = iOStream.getDataInputStream().readShort();
            return var1;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
