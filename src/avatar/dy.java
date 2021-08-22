package avatar;

import javax.microedition.io.Connector;
import javax.microedition.io.SocketConnection;

final class dy implements Runnable {

    private final String b;
    final kt a;

    dy(kt var1, String var2) {
        this.a = var1;
        this.b = var2;
    }

    public final void run() {
        kt.l = false;
        (new Thread(new kh(this))).start();
        this.a.d = true;
        this.a.c = true;

        try {
            String var2 = this.b;
            kt.a(this.a, (SocketConnection) Connector.open(var2));
            kt.a(this.a, kt.a(this.a).openDataOutputStream());
            this.a.a = kt.a(this.a).openDataInputStream();
            (new Thread(kt.b(this.a))).start();
            this.a.e = new Thread(new gv(this.a));
            this.a.e.start();
            this.a.j = System.currentTimeMillis();
            kt.a(this.a, new IOStream((byte) -27));
            this.a.d = false;
        } catch (Exception var4) {
            var4.printStackTrace();

            try {
                Thread.sleep(500L);
            } catch (InterruptedException var3) {
            }

            if (!kt.l) {
                if (this.a.b != null) {
                    this.a.c();
                    this.a.b.onConnectionFail();
                }
            }
        }
    }
}
