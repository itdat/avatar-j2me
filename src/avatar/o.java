package avatar;

final class o implements ii {

    o(aeClass var1) {
    }

    public final void a() {
        int var1 = ea.b().e;
        if (main.GameGraphic.a(8)) {
            if (var1 == 0) {
                var1 = 5;
            } else if (var1 == 1) {
                var1 = 4;
            } else if (var1 == 3) {
                var1 = 6;
            } else if (var1 == 2) {
                var1 = 7;
            } else if (var1 == 4) {
                var1 = 7;
            }

            ea.b().m = true;
        } else if (main.GameGraphic.a(2)) {
            if (var1 == 4) {
                var1 = 1;
            } else if (var1 == 5) {
                var1 = 0;
            } else if (var1 == 6) {
                var1 = 3;
            } else if (var1 == 7) {
                var1 = 4;
            } else if (var1 == 3) {
                var1 = 0;
            }

            ea.b().m = true;
        } else if (main.GameGraphic.a(6)) {
            if (var1 == 0) {
                var1 = 3;
            } else if (var1 == 1) {
                var1 = 2;
            } else if (var1 == 3) {
                var1 = 4;
            } else if (var1 == 4) {
                var1 = 2;
            } else if (var1 == 6) {
                var1 = 7;
            } else if (var1 == 5) {
                var1 = 3;
            }

            ea.b().m = true;
        } else if (main.GameGraphic.a(4)) {
            if (var1 == 1) {
                var1 = 3;
            } else if (var1 == 2) {
                var1 = 1;
            } else if (var1 == 3) {
                var1 = 0;
            } else if (var1 == 6) {
                var1 = 5;
            } else if (var1 == 7) {
                var1 = 6;
            } else if (var1 == 4) {
                var1 = 3;
            }

            ea.b().m = true;
        }

        if (ea.b().m) {
            ea.b().e = var1;
        }

    }
}
