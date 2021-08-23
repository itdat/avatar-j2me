package avatar;

import java.io.IOException;
import javax.microedition.rms.RecordStore;
import main.GameGraphic;
import main.GameMidlet;

public final class cx extends kj {
    private static cx INST;

    // a
    public static cx getInstance() {
        if (INST == null) {
            INST = new cx();
        }
        return INST;
    }

    // sendMessageToServer
    public final void sendMessageToServer(byte type, String message) {
        if (message == null) {
            message = "";
        }
        this.e((byte) -55);
        try {
            super.iOStream.getDataOutputStream().writeByte(type);
            super.iOStream.getDataOutputStream().writeUTF(message);
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.k();
    }

    // b
    public final void setProviderAndClientType() {
        this.e((byte) -1);
        this.o(GameMidlet.e);
        this.k();
        this.e((byte) -17);
        try {
            super.iOStream.getDataOutputStream().writeByte(GameMidlet.providerByte);
            Runtime var1 = Runtime.getRuntime();
            super.iOStream.getDataOutputStream().writeInt((int) (var1.totalMemory() / 1024L));
            String var4;
            if ((var4 = System.getProperty("microedition.platform")) == null) {
                var4 = "null";
            }
            super.iOStream.getDataOutputStream().writeUTF(var4);
            super.iOStream.getDataOutputStream().writeInt(d());
            super.iOStream.getDataOutputStream().writeInt(GameGraphic.width);
            super.iOStream.getDataOutputStream().writeInt(GameGraphic.height);
            super.iOStream.getDataOutputStream().writeBoolean(GameGraphic.H);
            super.iOStream.getDataOutputStream().writeByte(gy.Y - 1);
            super.iOStream.getDataOutputStream().writeUTF("2.5.8");
            System.out.println("setProviderAndClientType: " + dp.i + "    " + ea.i + "    " + aeClass.j);
            super.iOStream.getDataOutputStream().writeUTF(dp.i);
            super.iOStream.getDataOutputStream().writeUTF(ea.i);
            super.iOStream.getDataOutputStream().writeUTF(aeClass.j);
        } catch (IOException e) {
            e.printStackTrace();
        }
        this.k();
        this.e((byte) -79);
        try {
            super.iOStream.getDataOutputStream().writeUTF(GameMidlet.agentStr);
        } catch (IOException e) {
            e.printStackTrace();
        }
        this.k();
    }

    private static int d() {
        long var0 = 0L;
        RecordStore var2 = null;
        try {
            var0 = (long) ((var2 = RecordStore.openRecordStore("textrms", true)).getSizeAvailable() + var2.getSize());
        } catch (Exception var9) {
        } finally {
            try {
                if (var2 != null) {
                    var2.closeRecordStore();
                }
                RecordStore.deleteRecordStore("textrms");
            } catch (Exception var8) {
            }
        }
        if (var0 > 0L) {
            var0 /= 1024L;
        }
        return (int) var0;
    }

    public final void a(int var1) {
        this.e((byte) 34);
        this.n(var1);
        this.k();
    }

    public final void login(String username, String password, String var3) {
        this.e((byte) -2);
        try {
            System.out.println("login: " + username + " " + password);
            super.iOStream.getDataOutputStream().writeUTF(username);
            super.iOStream.getDataOutputStream().writeUTF(password);
            super.iOStream.getDataOutputStream().writeUTF(var3);
        } catch (IOException e) {
            e.printStackTrace();
        }
        this.k();
    }

    public final void b(int var1) {
        this.e((byte) 61);
        this.o(var1);
        this.k();
    }

    public final void a(int var1, String var2) {
        this.e((byte) -6);
        try {
            super.iOStream.getDataOutputStream().writeInt(var1);
            super.iOStream.getDataOutputStream().writeUTF(var2);
        } catch (IOException e) {
            e.printStackTrace();
        }
        this.k();
    }

    public final void c() {
        this.e((byte) -35);
        try {
            super.iOStream.getDataOutputStream().writeByte(GameMidlet.i.d);
            int var1 = GameMidlet.i.e.size();
            super.iOStream.getDataOutputStream().writeByte(var1);
            for (int i = 0; i < var1; ++i) {
                hx var3 = (hx) GameMidlet.i.e.elementAt(i);
                super.iOStream.getDataOutputStream().writeShort(var3.a);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        this.k();
    }

    public final void a(int var1, int var2) {
        this.e((byte) -36);
        try {
            super.iOStream.getDataOutputStream().writeShort(var1);
            super.iOStream.getDataOutputStream().writeByte(var2);
        } catch (IOException e) {
            e.printStackTrace();
        }
        this.k();
    }

    public final void c(int var1) {
        this.e((byte) -47);
        this.n(var1);
        this.k();
    }

    public final void a(short var1, byte var2) {
        this.e((byte) -48);
        super.iOStream = new IOStream((byte) -48);
        try {
            super.iOStream.getDataOutputStream().writeShort(var1);
            super.iOStream.getDataOutputStream().writeByte(var2);
        } catch (IOException e) {
            e.printStackTrace();
        }
        this.k();
    }

    public final void d(int var1) {
        this.e((byte) -1);
        this.o(var1);
        this.k();
    }

    public final void a(byte var1) {
        this.e((byte) -51);
        this.o(var1);
        this.k();
    }

    // e int
    public final void requestShop(int var1) {
        this.e((byte) -49);
        System.out.println("requestShop: " + var1);
        this.o(var1);
        this.k();
    }

    public final void f(int var1) {
        this.e((byte) -52);
        this.n(var1);
        this.k();
    }

    public final void g(int var1) {
        this.e((byte) -53);
        this.o(var1);
        this.k();
    }

    public final void a(int var1, byte var2, int var3) {
        this.e((byte) -59);
        try {
            super.iOStream.getDataOutputStream().writeInt(var1);
            super.iOStream.getDataOutputStream().writeByte(var2);
            super.iOStream.getDataOutputStream().writeByte(var3);
        } catch (IOException e) {
            e.printStackTrace();
        }
        this.k();
    }

    public final void a(int var1, byte var2, String var3) {
        this.e((byte) -60);
        try {
            super.iOStream.getDataOutputStream().writeInt(var1);
            super.iOStream.getDataOutputStream().writeByte(var2);
            super.iOStream.getDataOutputStream().writeUTF(var3);
        } catch (IOException e) {
            e.printStackTrace();
        }
        this.k();
    }

    // h int
    public final void doCommunicate(int var1) {
        System.out.println("doCommunicate: " + var1);
        this.e((byte) -61);
        this.n(var1);
        this.k();
    }

    public final void b(String var1, String var2, String var3) {
        this.e((byte) -56);
        try {
            super.iOStream.getDataOutputStream().writeUTF(var1);
            super.iOStream.getDataOutputStream().writeUTF(var2);
            super.iOStream.getDataOutputStream().writeUTF(var3);
        } catch (IOException e) {
            e.printStackTrace();
        }
        this.k();
    }

    public final void a(String var1, String var2) {
        this.e((byte) -62);
        try {
            super.iOStream.getDataOutputStream().writeUTF(var1);
            super.iOStream.getDataOutputStream().writeUTF(var2);
        } catch (IOException e) {
            e.printStackTrace();
        }
        this.k();
    }

    public final void a(short var1, int var2) {
        this.e((byte) -64);
        try {
            super.iOStream.getDataOutputStream().writeShort(var1);
            super.iOStream.getDataOutputStream().writeShort(var2);
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.k();
    }

    public final void b(int var1, String var2) {
        this.e((byte) -72);
        try {
            super.iOStream.getDataOutputStream().writeInt(var1);
            super.iOStream.getDataOutputStream().writeUTF(var2);
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.k();
    }

    public final void a(int var1, byte var2, int var3, byte var4) {
        this.e((byte) -81);
        try {
            super.iOStream.getDataOutputStream().writeInt(var1);
            super.iOStream.getDataOutputStream().writeByte(var2);
            super.iOStream.getDataOutputStream().writeShort(var3);
            super.iOStream.getDataOutputStream().writeByte(var4);
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.k();
    }

    public final void doRequestCmdRotate(int var1, int var2) {
        System.out.println("doRequestCmdRotate: " + var1);
        this.e((byte) -83);
        try {
            super.iOStream.getDataOutputStream().writeShort(var1);
            super.iOStream.getDataOutputStream().writeInt(var2);
        } catch (IOException e) {
            e.printStackTrace();
        }
        this.k();
    }

    public final void b(byte var1) {
        this.e((byte) -58);
        this.o(var1);
        this.k();
    }

    public final void a(String var1, byte var2) {
        this.e((byte) -88);
        try {
            super.iOStream.getDataOutputStream().writeByte(0);
            super.iOStream.getDataOutputStream().writeUTF(var1);
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.k();
    }

    public final void b(String var1, String var2) {
        this.e((byte) -88);
        try {
            super.iOStream.getDataOutputStream().writeByte(1);
            super.iOStream.getDataOutputStream().writeUTF(var1);
            super.iOStream.getDataOutputStream().writeUTF(var2);
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.k();
    }

    public final void i(int var1) {
        this.e((byte) -90);
        this.o(var1);
        this.k();
    }

    public final void a(int var1, int var2, short var3) {
        this.e((byte) -89);
        try {
            super.iOStream.getDataOutputStream().writeByte(var1);
            super.iOStream.getDataOutputStream().writeShort(var2);
            super.iOStream.getDataOutputStream().writeShort(var3);
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.k();
    }

    public final void c(byte var1) {
        this.e((byte) -92);
        if (var1 != -1) {
            this.o(var1);
        }
        this.k();
    }

    public final void d(byte var1) {
        this.e((byte) -94);
        this.o(var1);
        this.k();
    }

    public final void a(short var1) {
        this.e((byte) -95);
        try {
            super.iOStream.getDataOutputStream().writeByte(aeClass.A);
            super.iOStream.getDataOutputStream().writeByte(0);
            super.iOStream.getDataOutputStream().writeShort(var1);
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.k();
    }

    public final void b(short var1) {
        this.e((byte) -97);
        this.p(var1);
        this.k();
    }

    public final void c(short var1) {
        this.e((byte) -98);
        this.p(var1);
        this.k();
    }

    public final void j(int var1) {
        GameGraphic.i();
        this.e((byte) -99);
        this.o(var1);
        this.k();
    }

    public final void c(int var1, int var2) {
        GameGraphic.i();
        this.e((byte) 5);
        this.o(var1);
        this.n(var2);
        this.k();
    }

    public final void k(int var1) {
        this.e((byte) 2);
        this.o(var1);
        this.k();
    }

    public final void l(int var1) {
        this.e((byte) -102);
        this.n(var1);
        this.k();
    }

    public final void m(int var1) {
        this.e((byte) -106);
        this.o(var1);
        this.k();
    }

    public final void a(byte var1, short var2) {
        this.e((byte) -107);
        try {
            super.iOStream.getDataOutputStream().writeByte(var1);
            super.iOStream.getDataOutputStream().writeShort(var2);
            this.k();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // c String String String
    public final void doRegisterByEmail(String var1, String var2, String var3) {
        System.out.println("doRegisterByEmail: " + var1 + "   " + var2 + "   " + var3);
        this.e((byte) -25);
        try {
            this.c(var1);
            this.c(var2);
            this.c(var3);
            this.o(0);
            this.k();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
