package avatar;

final class w implements ii {

    private go a;
    private final ai b;

    w(go var1, ai var2) {
        this.a = var1;
        this.b = var2;
    }

    public final void a() {
        boolean var1 = false;
        for (int var2 = 0; var2 < go.d.size(); ++var2) {
            dc var3;
            if (go.b((var3 = (dc) go.d.elementAt(var2)).a).e == 6) {
                it.a().b(go.b, this.b.w, var3.a);
                var1 = true;
                this.a.d(10, -1);
                break;
            }
        }

        if (!var1) {
            go.getInstance().a((int) 8, (int) -1);
            main.GameGraphic.showAlert(StringEntity.ea);
        }
    }
}
