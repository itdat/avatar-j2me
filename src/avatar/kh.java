package avatar;

final class kh implements Runnable {

    private dy a;

    kh(dy var1) {
        this.a = var1;
    }

    public final void run() {
        try {
            Thread.sleep(20000L);
        } catch (InterruptedException var3) {
            System.out.println("ERROR 1111111111");
        }
        if (this.a.a.d) {
            try {
                kt.a(this.a.a).close();
                au.a(kt.b(this.a.a)).removeAllElements();
            } catch (Exception var2) {
            }
            kt.l = true;
            this.a.a.d = false;
            this.a.a.c = false;
            this.a.a.b.onConnectionFail();
        }
    }
}
