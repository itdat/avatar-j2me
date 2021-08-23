package avatar;

final class n implements ii {

    private final String a;

    n(es var1, String var2) {
        this.a = var2;
    }

    public final void a() {
        if (!kt.getInstance().c) {
            main.GameGraphic.c(StringEntity.M);
            main.GameGraphic.c();
        } else {
            main.GameGraphic.i();
        }

        cx.getInstance().sendMessageToServer((byte) 4, this.a);
    }
}
