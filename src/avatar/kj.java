package avatar;

import java.io.IOException;

public class kj {

    private hq a = kt.getInstance();
    protected IOStream b;

    protected final void n(int var1) {
        try {
            this.b.getDataOutputStream().writeInt(var1);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    protected final void o(int var1) {
        try {
            this.b.getDataOutputStream().writeByte(var1);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    protected final void p(int var1) {
        try {
            this.b.getDataOutputStream().writeShort(var1);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public final void c(String var1) {
        try {
            this.b.getDataOutputStream().writeUTF(var1);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public final void k() {
        this.a.a(this.b);
        this.b.closeDataStream();
    }

    public final void e(byte var1) {
        this.b = new IOStream(var1);
    }
}
