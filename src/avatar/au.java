package avatar;

import java.util.Vector;

final class au implements Runnable {

    private final Vector a;
    private kt b;

    public au(kt var1) {
        this.b = var1;
        this.a = new Vector();
    }

    public final void a(IOStream iOStream) {
        this.a.addElement(iOStream);
    }

    public final void run() {
        while (this.b.c) {
            if (this.b.h) {
                while (this.a.size() > 0) {
                    IOStream var1 = (IOStream) this.a.elementAt(0);
                    this.a.removeElementAt(0);
                    kt.a(this.b, var1);
                }
            }
            try {
                Thread.sleep(10L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    static Vector a(au var0) {
        return var0.a;
    }
}
