package avatar;

import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.util.Random;
import javax.microedition.lcdui.Image;
import javax.microedition.rms.RecordStore;
import javax.microedition.rms.RecordStoreException;
import main.GameMidlet;

public final class awClass {

    public static Random a = new Random();
    private static short[] c = new short[]{0, 18, 36, 54, 71, 89, 107, 125, 143, 160, 178, 195, 213, 230, 248, 265, 282, 299, 316, 333, 350, 367, 384, 400, 416, 433, 449, 465, 481, 496, 512, 527, 543, 558, 573, 587, 602, 616, 630, 644, 658, 672, 685, 698, 711, 724, 737, 749, 761, 773, 784, 796, 807, 818, 828, 839, 849, 859, 868, 878, 887, 896, 904, 912, 920, 928, 935, 943, 949, 956, 962, 968, 974, 979, 984, 989, 994, 998, 1002, 1005, 1008, 1011, 1014, 1016, 1018, 1020, 1022, 1023, 1023, 1024, 1024};
    private static short[] d;
    private static int[] e;
    public static String b;

    public static void a() {
        d = new short[91];
        e = new int[91];

        for (int var0 = 0; var0 <= 90; ++var0) {
            d[var0] = c[90 - var0];
            if (d[var0] == 0) {
                e[var0] = Integer.MAX_VALUE;
            } else {
                e[var0] = (c[var0] << 10) / d[var0];
            }
        }

    }

    public static final int a(int var0) {
        if ((var0 = c(var0)) >= 0 && var0 < 90) {
            return c[var0];
        } else if (var0 >= 90 && var0 < 180) {
            return c[180 - var0];
        } else {
            return var0 >= 180 && var0 < 270 ? -c[var0 - 180] : -c[360 - var0];
        }
    }

    public static final int b(int var0) {
        if ((var0 = c(var0)) >= 0 && var0 < 90) {
            return d[var0];
        } else if (var0 >= 90 && var0 < 180) {
            return -d[180 - var0];
        } else {
            return var0 >= 180 && var0 < 270 ? -d[var0 - 180] : d[360 - var0];
        }
    }

    public static final int a(int var0, int var1) {
        int var10000;
        int var2;
        if (var0 != 0) {
            var2 = Math.abs((var1 << 10) / var0);
            label44:
            {
                for (int var3 = 0; var3 <= 90; ++var3) {
                    if (e[var3] >= var2) {
                        var10000 = var3;
                        break label44;
                    }
                }
                var10000 = 0;
            }
            var2 = var10000;
            if (var1 >= 0 && var0 < 0) {
                var2 = 180 - var2;
            }
            if (var1 < 0 && var0 < 0) {
                var2 += 180;
            }
            if (var1 >= 0 || var0 < 0) {
                return var2;
            }
            var10000 = 360 - var2;
        } else {
            var10000 = var1 > 0 ? 90 : 270;
        }
        var2 = var10000;
        return var2;
    }

    public static final int c(int var0) {
        if (var0 >= 360) {
            var0 -= 360;
        }
        if (var0 < 0) {
            var0 += 360;
        }
        return var0;
    }

    public static int d(int var0) {
        return a.nextInt() % 2;
    }

    public static int e(int var0) {
        return a.nextInt(var0);
    }

    public static int b(int var0, int var1) {
        return a.nextInt(2) == 0 ? var0 : var1;
    }

    public static int f(int var0) {
        return var0 >= 0 ? var0 : -var0;
    }

    public static void b() {
        GameMidlet.n = b(je.k);
        dp.i = b(GameMidlet.m);
        aeClass.j = b(b);
    }

    public static int a(int var0, int var1, int var2, int var3) {
        if ((var0 = (var0 - var2) * (var0 - var2) + (var1 - var3) * (var1 - var3)) <= 0) {
            return 0;
        } else {
            var1 = (var0 + 1) / 2;

            do {
                var2 = var1;
                var1 = var1 / 2 + var0 / (var1 * 2);
            } while (Math.abs(var2 - var1) > 1);

            return var1;
        }
    }

    // b byte[]
    private static byte[] getNotBytes(byte[] bytes) {
        if (bytes != null) {
            for (int i = 0; i < bytes.length; ++i) {
                bytes[i] = (byte) (~bytes[i]);
            }
        }
        return bytes;
    }

    // a String byte[]
    public static void addRecord(String name, byte[] data) {
        data = getNotBytes(data);
        try {
            RecordStore recordStore = RecordStore.openRecordStore("2.5.8" + name, true);
            if (recordStore.getNumRecords() > 0) {
                recordStore.setRecord(1, data, 0, data.length);
            } else {
                recordStore.addRecord(data, 0, data.length);
            }
            recordStore.closeRecordStore();
        } catch (RecordStoreException e) {
            e.printStackTrace();
        }
    }

    // a String
    public static byte[] getRecord(String name) {
        byte[] data;
        try {
            RecordStore var3 = RecordStore.openRecordStore("2.5.8" + name, false);
            data = (var3).getRecord(1);
            var3.closeRecordStore();
        } catch (RecordStoreException e) {
            return null;
        }
        return getNotBytes(data);
    }

    // a String String
    public static void a(String var0, String var1) {
        try {
            addRecord(var0, var1.getBytes("UTF-8"));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }

    // b String
    public static String b(String name) {
        byte[] bytes = getRecord(name);
        if (bytes == null) {
            return null;
        } else {
            try {
                return new String(bytes, "UTF-8");
            } catch (UnsupportedEncodingException e) {
                return new String(bytes);
            }
        }
    }

    public static Image a(int var0, int var1, int var2, int var3, Image var4) {
        int[] var5 = new int[var2 * var3];
        var4.getRGB(var5, 0, var2, var0, var1, var2, var3);
        return Image.createRGBImage(var5, var2, var3, true);
    }

    public static Image a(byte[] var0) {
        return Image.createImage(var0, 0, var0.length);
    }

    public static void c() {
        es.s = 1;
        for (int i = 0; i < go.getInstance().K.size(); ++i) {
            Button var1 = (Button) go.getInstance().K.elementAt(i);
            es.s += var1.text.hashCode();
        }
        es.b().saveLogin();
    }

    public static Image a(byte[] var0, byte[] var1) {
        byte[] var2 = new byte[var0.length + var1.length];
        System.arraycopy(var0, 0, var2, 0, var0.length);
        System.arraycopy(var1, 0, var2, var0.length, var1.length);
        return Image.createImage(var2, 0, var2.length);
    }

    public static InputStream c(String var0) {
        return "".getClass().getResourceAsStream(var0);
    }

    public static Image a(Image var0, int var1) {
        int var2 = var0.getWidth();
        int var3 = var0.getHeight();
        int[] var4 = new int[var2 * var3];
        var0.getRGB(var4, 0, var2, 0, 0, var2, var3);
        for (int var5 = 0; var5 < var4.length; ++var5) {
            if (var4[var5] == var1) {
                var4[var5] = 16777215;
            }
        }
        return Image.createRGBImage(var4, var2, var3, true);
    }
}
