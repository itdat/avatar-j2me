package avatar;

import java.io.ByteArrayInputStream;
import java.util.Vector;
import javax.microedition.media.Manager;
import javax.microedition.media.MediaException;
import javax.microedition.media.Player;
import javax.microedition.media.control.VolumeControl;

public final class q {

    private int c;
    private Player d;
    public static q a = new q();
    private Vector e;
    private Vector f;
    int b = -1;

    public final void a(String var1, byte var2) {
        if (this.b != 0) {
            bl var4 = new bl(this, var2);
            if (this.b == 1) {
                var4.a();
            } else {
                Vector var3 = new Vector();
                if (aeClass.t) {
                    dm.getInstance().b(dm.getInstance().c / 10);
                    var4.a();
                } else {
                    var3.addElement(new Button(StringEntity.ep[1], new bj(this, var4)));
                    var3.addElement(new Button(StringEntity.ep[2], new bh(this, var4)));
                    var3.addElement(new Button(StringEntity.NO, new bw(this)));
                    var3.addElement(new Button(StringEntity.ep[0], new bt(this, var4)));
                    main.GameGraphic.a(var1, var3);
                }
            }
        }
    }

    public final int a(String var1) {
        if (this.f == null) {
            this.f = new Vector();
        }

        for (int var2 = 0; var2 < this.f.size(); ++var2) {
            if (((String) this.f.elementAt(var2)).equals(var1)) {
                return var2;
            }
        }

        return -1;
    }

    public final void a(byte[] var1, byte var2) {
        if (this.e == null) {
            this.e = new Vector();
            this.f = new Vector();
        }

        try {
            this.f.addElement("" + var2);
            this.e.addElement(var1);
            a.a(var1);
        } catch (Exception var3) {
            var3.printStackTrace();
        }
    }

    public final void a() {
        if (this.d != null) {
            if (this.d.getState() == 400) {
                try {
                    this.d.stop();
                } catch (MediaException var2) {
                    var2.printStackTrace();
                }
            }

            this.d.close();
        }

    }

    public final void a(byte[] var1) {
        this.a();

        try {
            ByteArrayInputStream var3 = new ByteArrayInputStream(var1);
            this.d = Manager.createPlayer(var3, "audio/midi");
            this.d.setLoopCount(1);
            var3.close();
            if (this.c > 0) {
                this.d.start();
                ((VolumeControl) this.d.getControl("VolumeControl")).setLevel(this.c * 20);
                return;
            }
        } catch (Exception var2) {
            var2.printStackTrace();
        }

    }

    public final void a(int var1) {
        if (this.d != null && this.d.getState() != 0) {
            try {
                if (var1 > 0) {
                    this.d.start();
                    ((VolumeControl) this.d.getControl("VolumeControl")).setLevel(var1 * 20);
                } else {
                    this.d.stop();
                }
            } catch (MediaException var3) {
                var3.printStackTrace();
            }
        }
        this.c = var1;
    }

    static Vector a(q var0) {
        return var0.e;
    }
}
