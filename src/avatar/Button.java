package avatar;

import javax.microedition.lcdui.Graphics;
import main.GameGraphic;

public class Button {

    public String text;
    public Intent b;
    public byte c;
    public gy d;
    public short e = -1;

    public Button(String text, Intent var2) {
        this.text = text;
        this.b = var2;
    }

    public Button(String text, int var2) {
        this.text = text;
        this.c = (byte) var2;
    }

    public Button(String text, int var2, gy var3) {
        this.text = text;
        this.c = (byte) var2;
        this.d = var3;
    }

    public Button(String text, int var2, int var3) {
        this.text = text;
        this.c = (byte) var2;
        this.e = (byte) var3;
    }

    public final void b() {
        if (this.b != null) {
            this.b.a();
        } else if (this.d != null) {
            this.d.a(this.c);
        } else if (im.c) {
            im.d().a(this.c, this.e);
        } else {
            GameGraphic.r.a(this.c, this.e);
        }
    }

    public void a() {
    }

    public void a(Graphics var1, int var2, int var3) {
        GameGraphic.L.a(var1, this.text, var2, var3, 2);
    }
}
