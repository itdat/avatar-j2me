package avatar;

final class cg implements Intent {

    short a;
    private String c;
    byte b;

    public cg(ei var1, byte var2, short var3, String var4) {
        this.b = var2;
        this.a = var3;
        this.c = var4;
    }

    public final void a() {
        main.GameGraphic.a(this.c, (Intent) (new gm(this)));
    }
}
