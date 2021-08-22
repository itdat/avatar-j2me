package avatar;

final class iq implements ii {

    iq(ea var1) {
    }

    public final void a() {
        KeyboardManager[] var1 = new KeyboardManager[4];

        for (int var2 = 0; var2 < 4; ++var2) {
            var1[var2] = new KeyboardManager();
        }
        var1[0].d(0);
        var1[1].d(2);
        var1[2].d(2);
        var1[3].d(0);
        String[][] var3 = new String[][]{{"Tên:", ""}, {"Mật khẩu:", ""}, {"Nhập lại", "mật khẩu:"}, {"Số di động", "hoặc email:"}};
        hi.b().a(var1, "Đăng Ký", var3, new Button(StringEntity.DONE, new fn(this, var1)));
        main.GameGraphic.A = hi.b();
    }
}
