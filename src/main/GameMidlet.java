package main;

import avatar.*;
import java.io.IOException;
import java.io.InputStream;
import java.util.Vector;
import javax.microedition.io.ConnectionNotFoundException;
import javax.microedition.io.Connector;
import javax.microedition.io.HttpConnection;
import javax.microedition.lcdui.Display;
import javax.microedition.midlet.MIDlet;

public class GameMidlet extends MIDlet {
    public static String[][][] cityNames = new String[][][]{
        {
            {
                "Xu So Dieu Ky",
                "Thanh Pho Hoan My",
                "Thanh Pho Tam Giao",
                "Thanh Pho Than Thoai",
                "Thanh Pho Tri Ky",
                "Thanh Pho Hoa Binh",
                "Thanh Pho Dieu Ky",
                "Thanh Pho Mong Mo"
            },
            {
                "Xu So Than Tien",
                "Thanh Pho Bao Binh",
                "Thanh Pho Nhan Ma",
                "Thanh Pho Su Tu"
            }
        },
        {
            {
                "International Server",
                "Aries City"
            }
        }
    };
    
    public static String[][][] cityIpAddresses = new String[][][]{
        {
            {
                "112.213.85.102",
                "112.213.85.104",
                "27.0.14.77",
                "112.213.85.106",
                "112.213.85.110",
                "112.213.85.101",
                "112.213.85.103"
            },
            {
                "115.84.183.38",
                "210.211.109.119",
                "210.211.109.119"
            }
        },
        {
            {
                "112.78.1.25"
            }
        }
    };
    
    public static int[][][] cityPorts = new int[][][]{
        {
            {
                19128, 19128, 19128, 19128, 19128, 19128, 19128, 19128, 19128
            }, 
            {
                19128, 19128, 18128
            }
        },
        {
            {
                19128
            }
        }
    };
    
    public static final String[][] d = new String[][]{
        {
            "http://teamobi.com/srvips/avatar2.txt",
            "http://trochoididong.us/srvips/avatar_C.txt"
        }, 
        {
            "http://teamobi.com/srvips/avatarinterd2.txt", 
            "http://trochoididong.us/srvips/avatarinter_C.txt"
        }
    };
    
    public static int e = 8;
    public static byte providerByte = -1;  // f
    public static String agentStr; // g
    private static GameGraphic gameGraphic;   // o
    public static GameMidlet gameMidlet; // h
    public static hn i;
    public static CharacterStatsEntity j;
    public static Vector k;
    private static Display display;   // p
    public static int l;
    public static String m;
    public static String n;

    public GameMidlet() {
        gameMidlet = this;
        InputStream inputStream = this.getClass().getResourceAsStream("/provider.txt");
        StringBuffer buffer = new StringBuffer();
        try {
            int tmp;
            while((tmp = inputStream.read()) != -1) {
               buffer.append((char)tmp);
            }
            providerByte = Byte.parseByte(buffer.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (providerByte == -1) {
            fxClass.d();
        }

        InputStream agentIS = awClass.c("/agent.txt");
        StringBuffer buff = new StringBuffer();
        try {
            int tmp;
            while((tmp = agentIS.read()) != -1) {
                buff.append((char)tmp);
            }
            agentStr = buff.toString();
        } catch (Exception e) {
            e.printStackTrace();
        }
        gameGraphic = new GameGraphic();
        gameGraphic.d();
        i = new hn();
        j = new CharacterStatsEntity();
        jv.b().a();
        gameGraphic.sizeChanged(0, 0);
        gameGraphic.b();
        Display.getDisplay(this).setCurrent(gameGraphic);
        kt.getInstance().a((CmInterface)ce.a());
        String var8 = awClass.b("avatar");
        if (var8 == null || !var8.equals("2.5.8")) {
            fxClass.deleteRecordStores();
        }
   }

    public void destroyApp(boolean var1) {
        gameMidlet.notifyDestroyed();
    }

    public static void a() {
        gameMidlet.destroyApp(true);
    }

    protected void pauseApp() {
    }

    protected void startApp() {
       display = Display.getDisplay(this);
       display.setCurrent(gameGraphic);
    }

    public static void a(String var0, String var1) {
        (new Thread(new MessageSender(var1, var0))).start();
    }

    // a
    public static String getRequest(String uri) {
        try {
            HttpConnection httpConnection = (HttpConnection) Connector.open(uri);
            httpConnection.setRequestMethod("GET");
            httpConnection.setRequestProperty("Content-Type", "//textMiniMap plain");
            httpConnection.setRequestProperty("Connection", "close");
            if (httpConnection.getResponseCode() == 200) {
                String dataStr = "";
                InputStream inputStream = httpConnection.openInputStream();
                int length = (int) httpConnection.getLength();
                if (length != -1) {
                    byte[] data = new byte[length];
                    inputStream.read(data);
                    dataStr = new String(data);
                }
                return dataStr;
            } else {
                return null;
            }
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void b(String uri) {
        try {
            gameMidlet.platformRequest(uri);
            gameMidlet.notifyDestroyed();
        } catch (ConnectionNotFoundException e) {
            e.printStackTrace();
        }
    }
}
