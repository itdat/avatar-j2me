package avatar;

final class aa implements Intent {

    private final bc a;

    aa(aeClass var1, bc var2) {
        this.a = var2;
    }

    public final void a() {
        if (aeClass.h != null) {
            cx.getInstance().doRequestCmdRotate(this.a.e, aeClass.h.w);
        } else {
            cx.getInstance().doRequestCmdRotate(this.a.e, -1);
        }
    }
}
