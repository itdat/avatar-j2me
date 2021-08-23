package avatar;

import java.io.IOException;

public class kj {

    private hq a = kt.getInstance();
    protected IOStream iOStream;

    protected final void n(int var1) {
        try {
            this.iOStream.getDataOutputStream().writeInt(var1);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    protected final void o(int var1) {
        try {
            this.iOStream.getDataOutputStream().writeByte(var1);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    protected final void p(int var1) {
        try {
            this.iOStream.getDataOutputStream().writeShort(var1);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public final void c(String var1) {
        try {
            this.iOStream.getDataOutputStream().writeUTF(var1);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public final void k() {
        this.a.a(this.iOStream);
        this.iOStream.closeDataStream();
    }

    // prepare before send message
    public final void e(byte var1) {
        this.iOStream = new IOStream(var1);
    }
}
