package avatar;

import java.io.IOException;
import java.util.Hashtable;
import java.util.Vector;
import javax.microedition.lcdui.Image;
import main.GameGraphic;
import main.GameMidlet;

public final class ce extends kj implements CmInterface {

    private jn c = new jn();
    private static ce d;
    public kk a;

    public static ce a() {
        if (d == null) {
            d = new ce();
        }
        return d;
    }

    // b
    public final void onConnectionFail() {
        System.out.println("onConnectionFail");
        GameGraphic.showAlert(StringEntity.CONNECT_FAIL);
    }

    // c
    public final void onDisconnected() {
        System.out.println("onDisconnected");
        GameGraphic.h();
        GameMidlet.e = 8;
        if (GameGraphic.r != es.a) {
            GameGraphic.b(StringEntity.LOST_CONNECTION, new du());
        } else {
            GameGraphic.showAlert(StringEntity.LOST_CONNECTION);
        }
        GameGraphic.t = null;
        ei.a = null;
        hc.d = null;
        q.a.a();
        if (im.d().ac.b != null) {
            im.d().ac.b.a();
        }
        gb.a();
    }

    public final void a(IOStream iOStream) {
        byte var2;
        byte var3;
        int var188;
        int var190;
        int var196;
        byte var203;
        String var205;
        hx var210;
        try {
            short var4;
            short var5;
            Vector var6;
            int var7;
            int var8;
            int var72;
            int var82;
            int var94;
            int var107;
            short var109;
            short var110;
            int var114;
            String var189;
            String var192;
            boolean var193;
            String var197;
            int var201;
            byte var204;
            String var208;
            int var212;
            byte var237;
            int var249;
            byte var267;
            label823:
            switch (iOStream.a) {
                case -107:
                    byte var270 = iOStream.getDataInputStream().readByte();
                    String var271 = null;
                    String[] var272 = null;
                    String[] var174 = null;
                    String[] var273 = null;
                    short[] var176 = null;
                    short[] var177 = null;
                    short[] var178 = null;
                    int[] var179 = null;
                    int var181;
                    short var274;
                    if (var270 == 0) {
                        var271 = iOStream.getDataInputStream().readUTF();
                        var272 = new String[var274 = iOStream.getDataInputStream().readShort()];
                        var176 = new short[var274];
                        var174 = new String[var274];
                        var273 = new String[var274];
                        var177 = new short[var274];
                        var178 = new short[var274];

                        for (var181 = 0; var181 < var274; ++var181) {
                            var177[var181] = iOStream.getDataInputStream().readShort();
                            var176[var181] = iOStream.getDataInputStream().readShort();
                            var178[var181] = iOStream.getDataInputStream().readShort();
                            var272[var181] = iOStream.getDataInputStream().readUTF();
                            var174[var181] = iOStream.getDataInputStream().readUTF();
                            var273[var181] = iOStream.getDataInputStream().readUTF();
                        }
                    } else if (var270 == 1) {
                        var271 = iOStream.getDataInputStream().readUTF();
                        var177 = new short[var274 = iOStream.getDataInputStream().readShort()];
                        var272 = new String[var274];
                        var176 = new short[var274];
                        var179 = new int[var274];
                        var273 = new String[var274];
                        var178 = new short[var274];
                        var174 = new String[var274];

                        for (var181 = 0; var181 < var274; ++var181) {
                            var177[var181] = iOStream.getDataInputStream().readShort();
                            var272[var181] = iOStream.getDataInputStream().readUTF();
                            var174[var181] = iOStream.getDataInputStream().readUTF();
                            var176[var181] = iOStream.getDataInputStream().readShort();
                            var178[var181] = iOStream.getDataInputStream().readShort();
                            var179[var181] = iOStream.getDataInputStream().readInt();
                            var273[var181] = iOStream.getDataInputStream().readUTF();
                        }
                    }

                    ei.b().a(var270, var271, var272, var176, var177, var174, var273, var179, var178);
                    return;
                case -105:
                    byte var169 = iOStream.getDataInputStream().readByte();
                    Vector var170 = new Vector();

                    for (int var171 = 0; var171 < var169; ++var171) {
                        short var172 = iOStream.getDataInputStream().readShort();
                        String var173 = iOStream.getDataInputStream().readUTF();
                        bu var175 = new bu(this, var173, new br(this, var171), var172);
                        var170.addElement(var175);
                    }
                    GameGraphic.h();
                    go.getInstance().a(var170);
                    break;
                case -103:
                    hn var164 = ir.g(iOStream.getDataInputStream().readInt());
                    if (iOStream.getDataInputStream().readByte() == 0) {
                        var164.X = iOStream.getDataInputStream().readShort();
                    } else {
                        var164.aa = iOStream.getDataInputStream().readShort();
                    }
                    break;
                case -102:
                    int var166 = iOStream.getDataInputStream().readInt();
                    int var167 = iOStream.getDataInputStream().readInt();
                    hn var168;
                    if (jy.b) {
                        var168 = kx.h(var166);
                    } else {
                        var168 = ir.g(var166);
                    }

                    if (var168 != null) {
                        var168.a[3] = var167;
                    }

                    return;
                case -101:
                    var267 = iOStream.getDataInputStream().readByte();
                    short var268 = iOStream.getDataInputStream().readShort();
                    if (var267 == 1) {
                        bc var163;
                        (var163 = new bc()).e = var268;
                        var163.a = iOStream.getDataInputStream().readUTF();
                        var163.d = iOStream.getDataInputStream().readShort();
                        var163.f = iOStream.getDataInputStream().readByte();
                        aeClass.o.addElement(var163);
                        if (GameGraphic.r == dp.b()) {
                            dp.b().d();
                        }

                        if (ir.p != null) {
                            cd.b().e();
                        } else {
                            cd.b().f();
                        }
                        break;
                    } else {
                        int var269 = 0;

                        while (true) {
                            if (var269 >= aeClass.o.size()) {
                                break label823;
                            }

                            if (((bc) aeClass.o.elementAt(var269)).e == var268) {
                                aeClass.o.removeElementAt(var269);
                                break label823;
                            }

                            ++var269;
                        }
                    }
                case -99:
                    byte var155 = iOStream.getDataInputStream().readByte();
                    byte var156 = iOStream.getDataInputStream().readByte();
                    Vector var157 = new Vector();

                    for (int var158 = 0; var158 < var156; ++var158) {
                        hn var159;
                        (var159 = new hn()).w = iOStream.getDataInputStream().readInt();
                        var159.a(iOStream.getDataInputStream().readUTF());
                        byte var160 = iOStream.getDataInputStream().readByte();

                        for (int var161 = 0; var161 < var160; ++var161) {
                            var159.a(new hx(iOStream.getDataInputStream().readShort()));
                        }

                        var159.aw = iOStream.getDataInputStream().readShort();
                        var159.ax = iOStream.getDataInputStream().readShort();
                        var159.ac = iOStream.getDataInputStream().readByte();
                        var159.W = (byte) (100 - iOStream.getDataInputStream().readByte());
                        var159.X = iOStream.getDataInputStream().readShort();
                        var267 = iOStream.getDataInputStream().readByte();
                        var159.ar = new String[var267];

                        for (int var162 = 0; var162 < var267; ++var162) {
                            var159.ar[var162] = iOStream.getDataInputStream().readUTF();
                        }

                        var157.addElement(var159);
                    }

                    short var264 = iOStream.getDataInputStream().readShort();
                    Vector var265 = null;
                    Vector var266 = null;
                    if (var264 > 0) {
                        var265 = f(iOStream);
                        var266 = readMapItem(iOStream);
                    }

                    aeClass.getInstance().a(var155, var157, var265, var266);
                    break;
                case -98:
                    short var262 = iOStream.getDataInputStream().readShort();
                    byte[] var263 = new byte[iOStream.getDataInputStream().readShort()];
                    iOStream.getDataInputStream().read(var263);
                    fxClass.i.put("" + var262, new f(awClass.a(var263)));
                    return;
                case -97:
                    byte[] var144 = new byte[iOStream.getDataInputStream().available()];
                    iOStream.getDataInputStream().read(var144);
                    ld var146 = (ld) fxClass.a(var144, true).elementAt(0);
                    fxClass.j.put("" + var146.g, var146);

                    for (int var147 = 0; var147 < ir.m.size(); ++var147) {
                        js var148;
                        if ((var148 = (js) ir.m.elementAt(var147)).az == 0) {
                            hn var149;
                            (var149 = (hn) var148).h();
                        }
                    }

                    return;
                case -96:
                    GameGraphic.h();
                    aeClass.getInstance().n();
                    la.b().a();
                    la.b().b = 0;
                    return;
                case -94:
                    byte var142 = iOStream.getDataInputStream().readByte();
                    byte[] var143 = new byte[iOStream.getDataInputStream().available()];
                    iOStream.getDataInputStream().read(var143);
                    GameGraphic.x.a(var142, var143);
                    return;
                case -93:
                    byte var258 = iOStream.getDataInputStream().readByte();
                    byte var259 = iOStream.getDataInputStream().readByte();
                    iOStream.getDataInputStream().readShort();
                    byte var132 = iOStream.getDataInputStream().readByte();
                    byte[] var134 = new byte[iOStream.getDataInputStream().readShort()];
                    iOStream.getDataInputStream().read(var134);
                    short[] var135 = null;
                    byte var136;
                    if ((var136 = iOStream.getDataInputStream().readByte()) > 0) {
                        var135 = new short[var136];

                        for (int var137 = 0; var137 < var136; ++var137) {
                            var135[var137] = iOStream.getDataInputStream().readShort();
                        }
                    }

                    short var260 = iOStream.getDataInputStream().readShort();
                    Image var138 = null;
                    if (var260 > 0) {
                        byte[] var139 = new byte[var260];
                        iOStream.getDataInputStream().read(var139);
                        var138 = awClass.a(var139);
                    }

                    short var261 = iOStream.getDataInputStream().readShort();
                    Vector var140 = null;
                    Vector var141 = null;
                    if (var261 > 0) {
                        var140 = f(iOStream);
                        var141 = readMapItem(iOStream);
                    }

                    aeClass.getInstance();
                    aeClass.a(var134, var258, var259, var132, var138, var135, var140, var141);
                    return;
                case -92:
                    iOStream.getDataInputStream().readByte();
                    byte[] var125 = new byte[iOStream.getDataInputStream().readInt()];
                    iOStream.getDataInputStream().read(var125);
                    int var126 = iOStream.getDataInputStream().readInt();
                    iOStream.getDataInputStream().readByte();
                    byte[] var127 = new byte[var126];

                    for (int var128 = 0; var128 < var126; ++var128) {
                        var127[var128] = iOStream.getDataInputStream().readByte();
                    }

                    byte var257 = iOStream.getDataInputStream().readByte();
                    Vector var129 = new Vector();

                    for (int var130 = 0; var130 < var257; ++var130) {
                        kb var131 = new kb();
                        iOStream.getDataInputStream().readByte();
                        var131.d = iOStream.getDataInputStream().readShort();
                        var131.c = iOStream.getDataInputStream().readUTF();
                        var131.a = iOStream.getDataInputStream().readByte();
                        var131.b = iOStream.getDataInputStream().readByte();
                        var129.addElement(var131);
                    }

                    ea.j = false;
                    ea.b().a();
                    ir.a = -1;
                    ir.D = -108;
                    ir.E = -1;
                    return;
                case -90:
                case -53:
                    var2 = iOStream.getDataInputStream().readByte();
                    var192 = iOStream.getDataInputStream().readUTF();
                    this.c.a((byte) (iOStream.a == -53 ? 0 : 1), var2, var192);
                    return;
                case -89:
                    ei.b().a(iOStream.getDataInputStream().readBoolean(), iOStream.getDataInputStream().readUTF());
                    return;
                case -88:
                    ei.b();
                    ei.g();
                    return;
                case -87:
                    short var117 = iOStream.getDataInputStream().readShort();
                    Vector var118 = new Vector();

                    int var119;
                    for (var119 = 0; var119 < var117; ++var119) {
                        hx var120;
                        (var120 = new hx()).a = iOStream.getDataInputStream().readShort();
                        var120.b = iOStream.getDataInputStream().readByte();
                        var120.c = iOStream.getDataInputStream().readUTF();
                        var118.addElement(var120);
                    }

                    var119 = iOStream.getDataInputStream().readInt();
                    byte var256 = iOStream.getDataInputStream().readByte();
                    short var121 = iOStream.getDataInputStream().readShort();
                    Vector var122 = new Vector();

                    for (int var123 = 0; var123 < var121; ++var123) {
                        hx var124;
                        (var124 = new hx()).a = iOStream.getDataInputStream().readShort();
                        var124.b = iOStream.getDataInputStream().readByte();
                        var124.c = iOStream.getDataInputStream().readUTF();
                        var122.addElement(var124);
                    }

                    ei.b().a(var118, var122, var119, var256);
                    return;
                case -85:
                    var107 = iOStream.getDataInputStream().readInt();
                    byte var244 = iOStream.getDataInputStream().readByte();
                    Vector var247 = new Vector();

                    for (var249 = 0; var249 < var244; ++var249) {
                        bd var253 = new bd(this);
                        iOStream.getDataInputStream().readByte();
                        var253.a = iOStream.getDataInputStream().readShort();
                        var253.b = iOStream.getDataInputStream().readShort();
                        var247.addElement(var253);
                    }

                    aeClass.getInstance();
                    aeClass.a(var107, var247);
                    return;
                case -84:
                    var237 = iOStream.getDataInputStream().readByte();
                    byte var241;
                    if ((var241 = iOStream.getDataInputStream().readByte()) != 5 && var241 != 2) {
                        int var111;
                        byte var248;
                        if (var237 == 0) {
                            if (fxClass.d((short) var241) == null) {
                                iy.a().c((short) var241);
                            }

                            lc var243 = new lc();
                            var243.a = var241;
                            var243.k = iOStream.getDataInputStream().readByte();
                            var243.c = var243.g = iOStream.getDataInputStream().readByte();
                            if (var243.k != 4) {
                                var243.b = iOStream.getDataInputStream().readShort();
                                var243.l = iOStream.getDataInputStream().readByte();
                                if (var243.l == 1) {
                                    var243.d = iOStream.getDataInputStream().readShort();
                                } else if (var243.l == 2) {
                                    byte var246 = iOStream.getDataInputStream().readByte();
                                    var243.m = new short[var246];
                                    var243.n = new short[var246];

                                    for (var249 = 0; var249 < var246; ++var249) {
                                        var243.m[var249] = iOStream.getDataInputStream().readShort();
                                        var243.n[var249] = iOStream.getDataInputStream().readShort();
                                    }
                                }

                                if (var243.k == 0) {
                                    var243.j = iOStream.getDataInputStream().readInt();
                                } else {
                                    var243.e = iOStream.getDataInputStream().readShort();
                                    var243.f = iOStream.getDataInputStream().readShort();
                                }

                                aeClass.getInstance();
                                aeClass.a(var243);
                                return;
                            }

                            var109 = iOStream.getDataInputStream().readShort();
                            var248 = iOStream.getDataInputStream().readByte();
                            if (GameGraphic.B.size() > 0) {
                                for (var111 = 0; var111 < GameGraphic.B.size(); ++var111) {
                                    if (((gz) GameGraphic.B.elementAt(var111)).c == var241) {
                                        return;
                                    }
                                }
                            }

                            ba var251;
                            (var251 = new ba(2, var109)).a = var248;
                            var251.c = var241;
                            var251.c();
                            return;
                        }

                        al var242;
                        (var242 = new al()).e = var241;
                        byte[] var245 = new byte[iOStream.getDataInputStream().readShort()];
                        iOStream.getDataInputStream().read(var245);
                        var242.c = awClass.a(var245);
                        var248 = iOStream.getDataInputStream().readByte();
                        var242.b = new ke[var248];

                        for (var111 = 0; var111 < var248; ++var111) {
                            var242.b[var111] = new ke();
                            var242.b[var111].a = iOStream.getDataInputStream().readByte();
                            var242.b[var111].c = iOStream.getDataInputStream().readByte();
                            var242.b[var111].d = iOStream.getDataInputStream().readByte();
                            var242.b[var111].e = iOStream.getDataInputStream().readByte();
                            var242.b[var111].f = iOStream.getDataInputStream().readByte();
                        }

                        byte var250 = iOStream.getDataInputStream().readByte();
                        var242.d = new jf[var250];

                        for (int var112 = 0; var112 < var250; ++var112) {
                            var242.d[var112] = new jf(this);
                            byte var254 = iOStream.getDataInputStream().readByte();
                            var242.d[var112].b = new short[var254];
                            var242.d[var112].c = new short[var254];
                            var242.d[var112].a = new byte[var254];

                            for (var114 = 0; var114 < var254; ++var114) {
                                var242.d[var112].b[var114] = iOStream.getDataInputStream().readByte();
                                var242.d[var112].c[var114] = iOStream.getDataInputStream().readByte();
                                var242.d[var112].a[var114] = iOStream.getDataInputStream().readByte();
                            }
                        }

                        byte var252 = iOStream.getDataInputStream().readByte();
                        var242.a = new byte[var252];

                        for (int var255 = 0; var255 < var252; ++var255) {
                            var242.a[var255] = iOStream.getDataInputStream().readByte();
                        }

                        fxClass.k.addElement(var242);
                        return;
                    }

                    return;
                case -83:
                    byte var92 = iOStream.getDataInputStream().readByte();
                    Vector var93 = new Vector();

                    for (var94 = 0; var94 < var92; ++var94) {
                        bc var234;
                        (var234 = new bc()).e = iOStream.getDataInputStream().readShort();
                        var234.a = iOStream.getDataInputStream().readUTF();
                        var234.d = iOStream.getDataInputStream().readShort();
                        var93.addElement(var234);
                    }

                    aeClass.getInstance().b(var93);
                    return;
                case -82:
                    int var90 = iOStream.getDataInputStream().readInt();
                    short var91 = iOStream.getDataInputStream().readShort();
                    aeClass.getInstance();
                    aeClass.b(var90, var91);
                    return;
                case -81:
                    String var87 = iOStream.getDataInputStream().readUTF();
                    int var88 = 0;

                    for (int var89 = 0; var89 < var87.length(); ++var89) {
                        if (var87.charAt(var89) == '-') {
                            ++var88;
                        }
                    }

                    byte[] var233 = new byte[iOStream.getDataInputStream().available()];
                    iOStream.getDataInputStream().read(var233);
                    if (var88 != 2 && !var87.equals(cy.h)) {
                        cy.b().a(var233, var87);
                        GameGraphic.h();
                        return;
                    }

                    cy.i.put(var87, var233);
                    cy.b().a(var87);
                    return;
                case -80:
                    short var232 = iOStream.getDataInputStream().readShort();
                    byte[] var86 = new byte[iOStream.getDataInputStream().readShort()];
                    iOStream.getDataInputStream().read(var86);
                    fxClass.h.put("" + var232, new f(awClass.a(var86)));
                    return;
                case -78:
                    byte var235 = iOStream.getDataInputStream().readByte();
                    int var100 = iOStream.getDataInputStream().readInt();
                    byte var101 = iOStream.getDataInputStream().readByte();
                    String var102 = iOStream.getDataInputStream().readUTF();
                    short var103;
                    if ((var103 = iOStream.getDataInputStream().readShort()) > 0) {
                        short[] var236 = new short[var103];
                        String[] var238 = new String[var103];
                        String[] var240 = null;
                        if (var235 == 1) {
                            var240 = new String[var103];
                        }

                        for (var107 = 0; var107 < var103; ++var107) {
                            var236[var107] = iOStream.getDataInputStream().readShort();
                            var238[var107] = iOStream.getDataInputStream().readUTF();
                            if (var235 == 1) {
                                var240[var107] = iOStream.getDataInputStream().readUTF();
                            }
                        }

                        aeClass.getInstance().a(var235, var101, var102, var236, var100, var238);
                    }

                    return;
                case -77:
                    var94 = iOStream.getDataInputStream().readInt();
                    byte var95 = iOStream.getDataInputStream().readByte();
                    String var96 = iOStream.getDataInputStream().readUTF();
                    byte var97;
                    String[] var98 = new String[var97 = iOStream.getDataInputStream().readByte()];

                    for (int var99 = 0; var99 < var97; ++var99) {
                        var98[var99] = iOStream.getDataInputStream().readUTF();
                    }

                    if (dp.a != GameGraphic.r) {
                        aeClass.getInstance().a(var94, var95, var96, var98);
                    }

                    return;
                case -74:
                    kq var180 = new kq();
                    var180.b = iOStream.getDataInputStream().readShort();
                    var180.aw = 24 * iOStream.getDataInputStream().readByte();
                    var180.ax = 24 * iOStream.getDataInputStream().readByte();
                    ei.b().a(var180);
                    return;
                case -70:
                    var82 = iOStream.getDataInputStream().readInt();
                    byte var231 = (byte) (100 - iOStream.getDataInputStream().readByte());
                    aeClass.getInstance();
                    aeClass.b(var82, var231);
                    return;
                case -64:
                    int var78 = iOStream.getDataInputStream().readInt();
                    short var79 = iOStream.getDataInputStream().readShort();
                    byte var80 = iOStream.getDataInputStream().readByte();
                    Vector var81 = new Vector();

                    for (var82 = 0; var82 < var80; ++var82) {
                        jh var83;
                        (var83 = new jh()).b = iOStream.getDataInputStream().readByte();
                        switch (var83.b) {
                            case 1:
                                var83.a = iOStream.getDataInputStream().readShort();
                                byte var84;
                                if ((var84 = iOStream.getDataInputStream().readByte()) == -1) {
                                    var83.h = "(" + StringEntity.cQ + ")";
                                } else {
                                    var83.h = "(" + var84 + " " + StringEntity.cM + ")";
                                }
                                break;
                            case 2:
                                var83.c = iOStream.getDataInputStream().readInt();
                                break;
                            case 3:
                                var83.f = iOStream.getDataInputStream().readInt();
                                break;
                            case 4:
                                var83.g = iOStream.getDataInputStream().readInt();
                        }

                        var81.addElement(var83);
                    }

                    hw.b().a(var78, var79, var81);
                    return;
                case -63:
                    ir.a(iOStream.getDataInputStream().readByte());
                    return;
                case -62:
                    System.out.println("CHANGE_PASS");
                    es.b().c.a(iOStream.getDataInputStream().readUTF());
                    es.b().saveLogin();
                    break;
                case -60:
                    var72 = iOStream.getDataInputStream().readInt();
                    byte var73 = iOStream.getDataInputStream().readByte();
                    String var74 = iOStream.getDataInputStream().readUTF();
                    byte var75 = iOStream.getDataInputStream().readByte();
                    byte[] var76 = null;
                    if (iOStream.getDataInputStream().available() > 0) {
                        var76 = new byte[iOStream.getDataInputStream().readShort()];
                        iOStream.getDataInputStream().read(var76);
                    }

                    GameGraphic.u.a(var74, new bo(this, var72, var73), var75);
                    if (var76 != null) {
                        GameGraphic.u.a(Image.createImage(var76, 0, var76.length));
                    }

                    return;
                case -59:
                    if (GameGraphic.v == GameGraphic.s) {
                        GameGraphic.v = null;
                    }

                    if (GameGraphic.v != null) {
                        return;
                    }

                    int var225 = iOStream.getDataInputStream().readInt();
                    byte var227 = iOStream.getDataInputStream().readByte();
                    byte var228;
                    String[] var229 = new String[var228 = iOStream.getDataInputStream().readByte()];
                    short[] var68 = new short[var228];

                    int var69;
                    for (var69 = 0; var69 < var228; ++var69) {
                        var229[var69] = iOStream.getDataInputStream().readUTF();
                    }

                    if (iOStream.getDataInputStream().available() > 0) {
                        for (var69 = 0; var69 < var228; ++var69) {
                            var68[var69] = iOStream.getDataInputStream().readShort();
                        }
                    }

                    String var230 = null;
                    String var70 = null;
                    boolean[] var71 = null;
                    if (iOStream.getDataInputStream().available() > 0) {
                        var230 = iOStream.getDataInputStream().readUTF();
                        var70 = iOStream.getDataInputStream().readUTF();
                        var71 = new boolean[var228];

                        for (var72 = 0; var72 < var228; ++var72) {
                            var71[var72] = iOStream.getDataInputStream().readBoolean();
                        }
                    }

                    this.c.a(var225, var227, var229, var230, var70, var71);
                    return;
                case -58:
                    var2 = iOStream.getDataInputStream().readByte();
                    Hashtable var222 = new Hashtable();

                    for (var196 = 0; var196 < var2; ++var196) {
                        var5 = iOStream.getDataInputStream().readShort();
                        byte[] var224 = new byte[iOStream.getDataInputStream().readShort()];
                        iOStream.getDataInputStream().read(var224);
                        Image var226 = awClass.a(var224);
                        var222.put("" + var5, var226);
                    }

                    var197 = iOStream.getDataInputStream().readUTF();
                    var205 = iOStream.getDataInputStream().readUTF();
                    System.err.println("CUSTOM_TAB: " + var197);
                    System.err.println("CUSTOM_TAB111: " + var205);
                    byte var220 = -1;
                    if (iOStream.getDataInputStream().available() > 0) {
                        var220 = iOStream.getDataInputStream().readByte();
                    }

                    jb.a = null;
                    jb.b().a(var222, var197, var205, var220);
                    jb.b().a();
                    return;
                case -54:
                    var189 = iOStream.getDataInputStream().readUTF();
                    var192 = iOStream.getDataInputStream().readUTF();
                    var197 = iOStream.getDataInputStream().readUTF();
                    GameGraphic.h();
                    GameGraphic.a(var189, (Intent) (new bm(this, var192, var197)));
                    break;
                case -52:
                    var189 = iOStream.getDataInputStream().readUTF();
                    iOStream.getDataInputStream().readInt();
                    es.b().a(var189);
                    return;
                case -51:
                    var2 = iOStream.getDataInputStream().readByte();
                    byte[] var221 = new byte[iOStream.getDataInputStream().available()];
                    iOStream.getDataInputStream().read(var221);
                    q.a.a(var221, var2);
                    return;
                case -50:
                    var208 = iOStream.getDataInputStream().readUTF();
                    var2 = iOStream.getDataInputStream().readByte();
                    q.a.a(var208, var2);
                    return;
                case -49:
                    var2 = iOStream.getDataInputStream().readByte();
                    System.out.println("OPEN_SHOP: " + var2);
                    var192 = iOStream.getDataInputStream().readUTF();
                    short[] var213 = null;
                    if ((var5 = iOStream.getDataInputStream().readShort()) > 0) {
                        var213 = new short[var5];

                        for (var212 = 0; var212 < var5; ++var212) {
                            var213[var212] = iOStream.getDataInputStream().readShort();
                        }
                    }

                    aeClass.getInstance().a((byte) 0, var2, var192, var213, -1, (String[]) null);
                    return;
                case -48:
                    var190 = iOStream.getDataInputStream().readInt();
                    var4 = iOStream.getDataInputStream().readShort();
                    aeClass.getInstance();
                    aeClass.a(var190, var4);
                    return;
                case -47:
                    Vector var218 = new Vector();
                    short var206 = iOStream.getDataInputStream().readShort();

                    for (var190 = 0; var190 < var206; ++var190) {
                        (var210 = new hx()).a = iOStream.getDataInputStream().readShort();
                        var210.b = iOStream.getDataInputStream().readByte();
                        var210.c = iOStream.getDataInputStream().readUTF();
                        var218.addElement(var210);
                    }

                    aeClass.getInstance().a(var218);
                    return;
                case -42:
                    var6 = new Vector();
                    var2 = iOStream.getDataInputStream().readByte();

                    for (var190 = 0; var190 < var2; ++var190) {
                        hd var209 = new hd(this);
                        iOStream.getDataInputStream().readShort();
                        var209.b = iOStream.getDataInputStream().readUTF();
                        var209.c = iOStream.getDataInputStream().readUTF();
                        var209.d = iOStream.getDataInputStream().readUTF();
                        var209.e = iOStream.getDataInputStream().readUTF();
                        var209.f = iOStream.getDataInputStream().readUTF();
                        var209.g = new Vector();
                        var204 = iOStream.getDataInputStream().readByte();

                        for (var7 = 0; var7 < var204; ++var7) {
                            dr var216;
                            (var216 = new dr()).c = iOStream.getDataInputStream().readByte();
                            var216.a = iOStream.getDataInputStream().readByte();
                            var216.b = iOStream.getDataInputStream().readByte();
                            var209.g.addElement(var216);
                        }

                        var6.addElement(var209);
                    }

                    for (var190 = 0; var190 < var2; ++var190) {
                        ((hd) var6.elementAt(var190)).a = iOStream.getDataInputStream().readByte();
                    }

                    fxClass.a(var6);
                    return;
                case -38:
                    short var150 = iOStream.getDataInputStream().readShort();
                    int var151 = 0;
                    if (var150 != -1) {
                        var151 = iOStream.getDataInputStream().readInt();
                    }

                    int var152 = iOStream.getDataInputStream().readInt();
                    int var153 = iOStream.getDataInputStream().readInt();
                    int var154 = iOStream.getDataInputStream().readInt();
                    GameMidlet.i.updateMoney(var152, var153, var154);
                    aeClass.getInstance();
                    aeClass.a(var150, var151);
                    return;
                case -36:
                    var188 = iOStream.getDataInputStream().readInt();
                    short var211 = iOStream.getDataInputStream().readShort();
                    aeClass.getInstance();
                    aeClass.b(var188, (int) var211);
                    return;
                case -35:
                    var193 = iOStream.getDataInputStream().readBoolean();
                    ic.b();
                    ic.b(var193);
                    return;
                case -33:
                    var190 = iOStream.getDataInputStream().readInt();
                    var203 = iOStream.getDataInputStream().readByte();
                    if (var190 != 0 && var203 != 1 && var203 == 2 && var203 == 5) {
                        GameMidlet.i.b(GameMidlet.i.a[3] + var190);
                        GameGraphic.a(var190 + "xeng", GameMidlet.i.aw, GameMidlet.i.ax, -1, 0, -1);
                    }

                    var201 = iOStream.getDataInputStream().readInt();
                    var7 = iOStream.getDataInputStream().readInt();
                    var8 = iOStream.getDataInputStream().readInt();
                    GameMidlet.i.updateMoney(var201, var7, var8);
                    return;
                case -25:
                    var203 = iOStream.getDataInputStream().readByte();
                    var189 = null;
                    var192 = null;
                    var205 = null;
                    if (var203 == 2) {
                        var192 = iOStream.getDataInputStream().readUTF();
                        var205 = iOStream.getDataInputStream().readUTF();
                    } else {
                        var189 = iOStream.getDataInputStream().readUTF();
                    }

                    ea.b().onRegisterByEmail(var203, var189, var192, var205);
                    break;
                case -24:
                    if ((var110 = iOStream.getDataInputStream().readShort()) != -1) {
                        iOStream.getDataInputStream().readInt();
                        iOStream.getDataInputStream().readByte();
                    }

                    String var113 = iOStream.getDataInputStream().readUTF();
                    var114 = iOStream.getDataInputStream().readInt();
                    int var115 = iOStream.getDataInputStream().readInt();
                    int var116 = iOStream.getDataInputStream().readInt();
                    aeClass.getInstance();
                    aeClass.a(var110, var113, var114, var115, var116);
                    return;
                case -23:
                    Vector var195 = new Vector();

                    while (iOStream.getDataInputStream().available() > 0) {
                        gu var202;
                        (var202 = new gu()).a = iOStream.getDataInputStream().readUTF();
                        var202.c = iOStream.getDataInputStream().readUTF();
                        iOStream.getDataInputStream().readUTF();
                        var202.b = iOStream.getDataInputStream().readUTF();
                        var195.addElement(var202);
                    }

                    jd.b().a(var195);
                    jd.b().a(GameGraphic.r);
                    GameGraphic.h();
                    return;
                case -22:
                    var188 = iOStream.getDataInputStream().readInt();
                    CharacterStatsEntity var200 = new CharacterStatsEntity();
                    var200.g = iOStream.getDataInputStream().readByte();
                    var200.f = iOStream.getDataInputStream().readByte();
                    var200.a = iOStream.getDataInputStream().readByte();
                    var200.b = iOStream.getDataInputStream().readByte();
                    var200.e = iOStream.getDataInputStream().readByte();
                    var200.c = iOStream.getDataInputStream().readByte();
                    var200.d = iOStream.getDataInputStream().readByte();
                    hn var198 = null;
                    var201 = iOStream.getDataInputStream().readInt();
                    var208 = "";
                    String var207 = "";
                    short var214 = 0;
                    byte var215 = 0;
                    byte var10 = 0;
                    short var11 = -1;
                    String var12 = "";
                    if (var201 != -1) {
                        (var198 = new hn()).w = var201;
                        var198.a(iOStream.getDataInputStream().readUTF());
                        var204 = iOStream.getDataInputStream().readByte();

                        for (var212 = 0; var212 < var204; ++var212) {
                            var198.a(new hx(iOStream.getDataInputStream().readShort()));
                        }

                        var208 = iOStream.getDataInputStream().readUTF();
                        var214 = iOStream.getDataInputStream().readShort();
                        var215 = iOStream.getDataInputStream().readByte();
                        var10 = iOStream.getDataInputStream().readByte();
                        var207 = iOStream.getDataInputStream().readUTF();
                        if ((var11 = iOStream.getDataInputStream().readShort()) != -1) {
                            var12 = iOStream.getDataInputStream().readUTF();
                        }
                    }

                    if (iOStream.getDataInputStream().available() > 0) {
                        GameMidlet.i.v = GameMidlet.j.g = var200.g = iOStream.getDataInputStream().readShort();
                    }

                    aeClass.getInstance().a(var188, var200, var198, var208, var214, var215, var10, var207, var11, var12);
                    return;
                case -21:
                    hn var199;
                    (var199 = new hn()).w = iOStream.getDataInputStream().readInt();
                    var199.x = iOStream.getDataInputStream().readUTF();
                    var189 = iOStream.getDataInputStream().readUTF();
                    aeClass.getInstance().a(var199, var189);
                    return;
                case -19:
                    hn var191;
                    (var191 = new hn()).w = iOStream.getDataInputStream().readInt();
                    var191.x = iOStream.getDataInputStream().readUTF();
                    var193 = iOStream.getDataInputStream().readBoolean();
                    var192 = iOStream.getDataInputStream().readUTF();
                    aeClass.getInstance();
                    aeClass.a(var193, var192);
                    return;
                case -17:
                    GameMidlet.providerByte = iOStream.getDataInputStream().readByte();
                    GameMidlet.agentStr = iOStream.getDataInputStream().readUTF();
                    fxClass.c();
                    break;
                case -12:
                    var189 = iOStream.getDataInputStream().readUTF();
                    var192 = iOStream.getDataInputStream().readUTF();
                    es.b().onLoginNewGame(var189, var192);
                    break;
                case -10:
                    var189 = iOStream.getDataInputStream().readUTF();
                    boolean var194 = false;
                    if (iOStream.getDataInputStream().available() > 0) {
                        var194 = iOStream.getDataInputStream().readBoolean();
                    }

                    this.c.a(var189, var194);
                    return;
                case -9:
                    GameGraphic.showAlert(iOStream.getDataInputStream().readUTF());
                    return;
                case -8:
                    GameGraphic.a(iOStream.getDataInputStream().readUTF());
                    return;
                case -7:
                    this.c.a(iOStream.getDataInputStream().readUTF(), iOStream.getDataInputStream().readUTF());
                    return;
                case -6:
                    var188 = iOStream.getDataInputStream().readInt();
                    var192 = iOStream.getDataInputStream().readUTF();
                    var197 = iOStream.getDataInputStream().readUTF();
                    if (GameGraphic.r != hc.b()) {
                        ++hj.as;
                    }
                    hc.b().a(var188, var192, var197);
                    return;
                case -1:
                    jn.a(iOStream.getDataInputStream().readByte());
                    return;
                case 34:
                    if (iOStream.getDataInputStream().readInt() != -1) {
                        var208 = iOStream.getDataInputStream().readUTF();
                        var188 = iOStream.getDataInputStream().readInt();
                        iOStream.getDataInputStream().readShort();
                        var190 = iOStream.getDataInputStream().readInt();
                        var196 = iOStream.getDataInputStream().readInt();
                        var201 = iOStream.getDataInputStream().readInt();
                        var7 = iOStream.getDataInputStream().readInt();
                        var8 = iOStream.getDataInputStream().readInt();
                        hn var9 = new hn();
                        var9.d(var190);
                        GameGraphic.showAlert(StringEntity.aA + var208 + ". " + StringEntity.ao + var188 + "$. Level: " + var9.v + "+" + var9.r + "%. " + StringEntity.aP + ": " + var196 + ". " + StringEntity.aQ + ": " + var201 + ". " + StringEntity.aR + ": " + var7 + ". " + StringEntity.aS + ": " + var8);
                    }

                    return;
                case 50:
                    if (this.a == kz.a || this.a == eo.a || this.a == df.a) {
                        var2 = iOStream.getDataInputStream().readByte();
                        var3 = iOStream.getDataInputStream().readByte();
                        var4 = 0;
                        var5 = 0;
                        var6 = new Vector();
                        if (var3 != -1 && var3 != -2) {
                            var4 = iOStream.getDataInputStream().readShort();
                            var5 = iOStream.getDataInputStream().readShort();
                            var6 = b(iOStream);
                        }

                        short var64 = iOStream.getDataInputStream().readShort();
                        Vector var65 = null;
                        Vector var66 = null;
                        if (var64 > 0) {
                            var65 = f(iOStream);
                            var66 = readMapItem(iOStream);
                        }

                        if (GameMidlet.e == 9) {
                            for (int var67 = 0; var67 < var6.size(); ++var67) {
                                ((hn) var6.elementAt(var67)).aa = iOStream.getDataInputStream().readShort();
                            }
                        }

                        aeClass.getInstance().a(var2, var3, var4, var5, var6, var65, var66);
                        if (ir.a == 21) {
                            GameGraphic.J = 0;
                            df.a();
                            iy.a().c((int) 0);
                            GameGraphic.i();
                        }
                    }
                    break;
                case 89:
                    byte var104 = iOStream.getDataInputStream().readByte();
                    System.out.println("DROP_PART: " + var104 + "    " + iOStream.getDataInputStream().available());
                    if (var104 == 0) {
                        var237 = iOStream.getDataInputStream().readByte();
                        short var239 = iOStream.getDataInputStream().readShort();
                        var107 = iOStream.getDataInputStream().readInt();
                        int var108 = iOStream.getDataInputStream().readInt();
                        System.out.println("aaaaaa: " + var237 + "   " + var239 + "   " + var107 + "   " + var108);
                        var109 = iOStream.getDataInputStream().readShort();
                        var110 = iOStream.getDataInputStream().readShort();
                        aeClass.getInstance();
                        aeClass.a(var237, var108, var239, var107, var109, var110);
                        return;
                    }

                    int var105 = iOStream.getDataInputStream().readInt();
                    int var106 = iOStream.getDataInputStream().readInt();
                    aeClass.getInstance();
                    aeClass.c(var105, var106);
                    return;
                case 122:
                    iOStream.getDataInputStream().readByte();
                    byte var182 = iOStream.getDataInputStream().readByte();
                    byte var183 = iOStream.getDataInputStream().readByte();
                    short var184 = iOStream.getDataInputStream().readShort();
                    short var185 = iOStream.getDataInputStream().readShort();
                    ir.a(var182, var183, var184, var185);
                    return;
            }
        } catch (Exception var187) {
            var187.printStackTrace();
        }

        if (this.a != null) {
            this.a.a(iOStream);
        } else {
            try {
                System.out.println("cmd: " + iOStream.a);
                switch (iOStream.a) {
                    case -5:
                        jn.a(iOStream.getDataInputStream().readUTF());
                        return;
                    case -4:
                        es.b().saveLogin();
                        (GameMidlet.i = new hn()).w = iOStream.getDataInputStream().readInt();
                        var2 = iOStream.getDataInputStream().readByte();
                        GameMidlet.i.e = new Vector();

                        for (var190 = 0; var190 < var2; ++var190) {
                            (var210 = new hx()).a = iOStream.getDataInputStream().readShort();
                            GameMidlet.i.a(var210);
                        }

                        GameMidlet.i.d = iOStream.getDataInputStream().readByte();
                        GameMidlet.j.g = iOStream.getDataInputStream().readByte();
                        GameMidlet.j.f = iOStream.getDataInputStream().readByte();
                        GameMidlet.i.a(iOStream.getDataInputStream().readInt());
                        GameMidlet.j.a = iOStream.getDataInputStream().readByte();
                        GameMidlet.j.b = iOStream.getDataInputStream().readByte();
                        GameMidlet.j.e = iOStream.getDataInputStream().readByte();
                        GameMidlet.j.c = iOStream.getDataInputStream().readByte();
                        GameMidlet.j.d = iOStream.getDataInputStream().readByte();
                        GameMidlet.i.a[2] = iOStream.getDataInputStream().readInt();
                        GameMidlet.i.ac = iOStream.getDataInputStream().readByte();

                        for (var190 = 0; var190 < GameMidlet.i.e.size(); ++var190) {
                            (var210 = (hx) GameMidlet.i.e.elementAt(var190)).b = iOStream.getDataInputStream().readByte();
                            var210.c = iOStream.getDataInputStream().readUTF();
                        }

                        GameMidlet.i.X = iOStream.getDataInputStream().readShort();
                        aeClass.n = new Vector();
                        var3 = iOStream.getDataInputStream().readByte();

                        for (var196 = 0; var196 < var3; ++var196) {
                            bc var219;
                            (var219 = new bc()).a = iOStream.getDataInputStream().readUTF();
                            var219.d = iOStream.getDataInputStream().readShort();
                            aeClass.n.addElement(var219);
                        }

                        aeClass.o = new Vector();
                        var203 = iOStream.getDataInputStream().readByte();

                        for (var188 = 0; var188 < var203; ++var188) {
                            bc var223;
                            (var223 = new bc()).e = iOStream.getDataInputStream().readShort();
                            var223.a = iOStream.getDataInputStream().readUTF();
                            var223.d = iOStream.getDataInputStream().readShort();
                            aeClass.o.addElement(var223);
                        }

                        aeClass.getInstance().y = iOStream.getDataInputStream().readBoolean();
                        if (iOStream.getDataInputStream().available() > 0) {
                            for (var188 = 0; var188 < var203; ++var188) {
                                ((bc) aeClass.o.elementAt(var188)).f = iOStream.getDataInputStream().readByte();
                            }
                        }

                        if (iOStream.getDataInputStream().available() > 0) {
                            GameGraphic.W = iOStream.getDataInputStream().readByte();
                        }

                        GameMidlet.i.v = GameMidlet.j.g = iOStream.getDataInputStream().readShort();
                        if (GameGraphic.W == 1 || GameGraphic.W == 2) {
                            StringEntity.ek = StringEntity.el;
                        }

                        GameMidlet.i.aa = iOStream.getDataInputStream().readShort();
                        if (iOStream.getDataInputStream().available() > 0) {
                            aeClass.u = iOStream.getDataInputStream().readBoolean();
                        }

                        if (aeClass.u) {
                            GameMidlet.i.a[3] = iOStream.getDataInputStream().readInt();
                        }

                        aeClass.q = new Vector();
                        var2 = iOStream.getDataInputStream().readByte();

                        for (var190 = 0; var190 < var2; ++var190) {
                            km var217;
                            (var217 = new km()).a = iOStream.getDataInputStream().readShort();
                            var217.c = iOStream.getDataInputStream().readUTF();
                            var217.b = iOStream.getDataInputStream().readShort();
                            var217.d = iOStream.getDataInputStream().readInt();
                            var217.e = iOStream.getDataInputStream().readByte();
                            aeClass.q.addElement(var217);
                        }

                        GameMidlet.i.c(iOStream.getDataInputStream().readInt());
                        GameMidlet.i.b = iOStream.getDataInputStream().readInt();
                        iOStream.getDataInputStream().readByte();
                        var205 = iOStream.getDataInputStream().readUTF();
                        GameMidlet.i.a(var205);
                        System.out.println("money: " + GameMidlet.i.a[2] + "    " + var205);
                        jn.a();
                        System.out.println("2222222222222222222");
                    default:
                }
            } catch (Exception var186) {
                var186.printStackTrace();
            }
        }
    }

    public static Vector b(IOStream iOStream) {
        Vector var1 = new Vector();

        try {
            byte var2 = iOStream.getDataInputStream().readByte();

            int var3;
            for (var3 = 0; var3 < var2; ++var3) {
                hn var4;
                (var4 = new hn()).w = iOStream.getDataInputStream().readInt();
                var4.a(iOStream.getDataInputStream().readUTF());
                byte var5 = iOStream.getDataInputStream().readByte();

                for (int var6 = 0; var6 < var5; ++var6) {
                    short var7 = iOStream.getDataInputStream().readShort();
                    var4.a(new hx(var7));
                }

                var4.aw = iOStream.getDataInputStream().readShort();
                var4.ax = iOStream.getDataInputStream().readShort();
                var4.ac = iOStream.getDataInputStream().readByte();
                var1.addElement(var4);
            }

            for (var3 = 0; var3 < var2; ++var3) {
                ((hn) var1.elementAt(var3)).K = iOStream.getDataInputStream().readByte();
            }

            for (var3 = 0; var3 < var2; ++var3) {
                ((hn) var1.elementAt(var3)).W = (byte) (100 - iOStream.getDataInputStream().readByte());
            }

            for (var3 = 0; var3 < var2; ++var3) {
                ((hn) var1.elementAt(var3)).X = iOStream.getDataInputStream().readShort();
            }

            byte var12 = iOStream.getDataInputStream().readByte();

            for (int var9 = 0; var9 < var12; ++var9) {
                hm var11;
                (var11 = new hm()).e = iOStream.getDataInputStream().readByte();
                var11.a = iOStream.getDataInputStream().readShort();
                var11.d = iOStream.getDataInputStream().readInt();
                var11.aw = iOStream.getDataInputStream().readShort();
                var11.ax = iOStream.getDataInputStream().readShort();
                var1.addElement(var11);
            }

            ir.o = null;
            byte var10 = 0;
            if (iOStream.getDataInputStream().available() > 0) {
                var10 = iOStream.getDataInputStream().readByte();
            }

            if (var10 > 0) {
                ir.o = new Vector();

                for (int var13 = 0; var13 < var10; ++var13) {
                    dr var14;
                    (var14 = new dr()).c = iOStream.getDataInputStream().readShort();
                    var14.a = iOStream.getDataInputStream().readShort();
                    var14.b = iOStream.getDataInputStream().readShort();
                    var14.d = iOStream.getDataInputStream().readByte();
                    ir.o.addElement(var14);
                }
            }
        } catch (IOException var8) {
            var8.printStackTrace();
        }

        return var1;
    }

    // e
    private static Vector readMapItem(IOStream iOStream) {
        try {
            byte item = iOStream.getDataInputStream().readByte();
            System.out.println("readMapItemaaaa: " + item);
            Vector var2 = new Vector();

            for (int i = 0; i < item; ++i) {
                kq var4 = new kq();
                var4.f = iOStream.getDataInputStream().readByte();
                var4.b = iOStream.getDataInputStream().readByte();
                var4.aw = iOStream.getDataInputStream().readByte();
                var4.ax = iOStream.getDataInputStream().readByte();
                var4.d = true;
                var2.addElement(var4);
            }
            return var2;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    private static Vector f(IOStream iOStream) {
        try {
            byte var1 = iOStream.getDataInputStream().readByte();
            Vector var2 = new Vector();
            System.out.println("size item: " + var1);

            for (int var3 = 0; var3 < var1; ++var3) {
                ag var4;
                (var4 = new ag()).a = iOStream.getDataInputStream().readByte();
                var4.b = iOStream.getDataInputStream().readShort();
                var4.c = iOStream.getDataInputStream().readByte();
                var4.e = iOStream.getDataInputStream().readShort();
                var4.f = iOStream.getDataInputStream().readShort();
                byte var5 = iOStream.getDataInputStream().readByte();
                var4.j = new Vector();

                for (int var6 = 0; var6 < var5; ++var6) {
                    dr var7;
                    (var7 = new dr()).a = iOStream.getDataInputStream().readByte();
                    var7.b = iOStream.getDataInputStream().readByte();
                    var4.j.addElement(var7);
                }
                var2.addElement(var4);
            }
            return var2;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void c(IOStream iOStream) {
        try {
            int var1 = iOStream.getDataInputStream().readInt();
            short var2 = iOStream.getDataInputStream().readShort();
            short var3 = iOStream.getDataInputStream().readShort();
            byte var4 = iOStream.getDataInputStream().readByte();
            short var5 = 0;
            if (iOStream.getDataInputStream().available() > 0) {
                var5 = iOStream.getDataInputStream().readShort();
            }
            aeClass.getInstance();
            aeClass.a(var1, var2, var3, var4, (short) var5);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void d(IOStream iOStream) {
        try {
            int var1 = iOStream.getDataInputStream().readInt();
            String var2 = iOStream.getDataInputStream().readUTF();
            aeClass.getInstance();
            aeClass.a(var1, var2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
