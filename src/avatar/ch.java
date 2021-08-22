package avatar;

final class ch implements ii {

    private jd a;
    private final String b;
    private final KeyboardManager[] c;

    ch(jd var1, String var2, KeyboardManager[] var3) {
        this.a = var1;
        this.b = var2;
        this.c = var3;
    }

    public final void a() {
        jd var10000 = this.a;
        String var10001 = this.b;
        String var10002 = this.c[0].f();
        String var4 = this.c[1].f();
        String var3 = var10002;
        String var2 = var10001;
        jd var1 = var10000;
        if (var3.equals("")) {
            main.GameGraphic.showAlert(StringEntity.RECHARGE_VALIDATE_TEXTS[0]);
        } else if (var4.equals("")) {
            main.GameGraphic.showAlert(StringEntity.RECHARGE_VALIDATE_TEXTS[1]);
        } else {
            cx.getInstance().b(var2, var3, var4);
            var1.a(var1.ac.c, var1.ac.e);
            main.GameGraphic.i();
        }
    }
}
