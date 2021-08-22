package avatar;

final class m implements ii {

    private aeClass a;
    private final KeyboardManager[] b;

    m(aeClass var1, KeyboardManager[] var2) {
        this.a = var1;
        this.b = var2;
    }

    public final void a() {
        if (aeClass.a(this.b)) {
            cx.getInstance().a(this.b[0].f(), this.b[1].f());
            main.GameGraphic.i();
            hi.b();
            main.GameGraphic.A = null;
        }

    }
}
