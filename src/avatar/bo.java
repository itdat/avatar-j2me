package avatar;

final class bo implements Intent {

    private final int a;
    private final byte b;

    bo(ce var1, int var2, byte var3) {
        this.a = var2;
        this.b = var3;
    }

    public final void a() {
        cx.getInstance().a(this.a, this.b, main.GameGraphic.u.a());
        main.GameGraphic.h();
    }
}
