package avatar;

final class fn implements ii {

    private final KeyboardManager[] a;

    fn(iq var1, KeyboardManager[] var2) {
        this.a = var2;
    }

    public final void a() {
        if (this.a[0].f().equals("")) {
            main.GameGraphic.showAlert("Bạn chưa nhập tên");
        } else if (!this.a[1].f().equals("") && !this.a[2].f().equals("")) {
            if (!this.a[1].f().equals(this.a[2].f())) {
                main.GameGraphic.showAlert("Hai mật khẩu không giống nhau");
            } else {
                main.GameGraphic.A = null;
                cx.getInstance().doRegisterByEmail(this.a[0].f().toLowerCase(), this.a[1].f().toLowerCase(), this.a[3].f());
            }
        } else {
            main.GameGraphic.showAlert("Bạn chưa nhập mật khẩu");
        }
    }
}
