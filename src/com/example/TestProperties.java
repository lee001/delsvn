package com.example;

import java.util.Enumeration;
import java.util.Properties;

/**
 * Created by zw on 2017/11/16.
 */
public class TestProperties {

    public static void main(String[] args) {
        Properties p = System.getProperties();
        Enumeration en = p.keys();
        while(en.hasMoreElements()){
            String key = (String) en.nextElement();
            String val = p.getProperty(key);
            System.err.println(key+"-------"+val);
        }
    }

    /**
     * java.runtime.name-------Java(TM) SE Runtime Environment
     sun.boot.library.path-------C:\Program Files\Java\jdk1.8.0_131\jre\bin
     java.vm.version-------25.131-b11
     java.vm.vendor-------Oracle Corporation
     java.vendor.url-------http://java.oracle.com/
     path.separator-------;
     java.vm.name-------Java HotSpot(TM) 64-Bit Server VM
     file.encoding.pkg-------sun.io
     user.country-------CN
     user.script-------
     sun.java.launcher-------SUN_STANDARD
     sun.os.patch.level-------
     java.vm.specification.name-------Java Virtual Machine Specification
     user.dir-------D:\Develop\IdeaProjects\delsvn
     java.runtime.version-------1.8.0_131-b11
     java.awt.graphicsenv-------sun.awt.Win32GraphicsEnvironment
     java.endorsed.dirs-------C:\Program Files\Java\jdk1.8.0_131\jre\lib\endorsed
     os.arch-------amd64
     java.io.tmpdir-------C:\Users\zw\AppData\Local\Temp\
     line.separator-------

     java.vm.specification.vendor-------Oracle Corporation
     user.variant-------
     os.name-------Windows 10
     sun.jnu.encoding-------GBK
     java.library.path-------C:\Program Files\Java\jdk1.8.0_131\bin;C:\windows\Sun\Java\bin;C:\windows\system32;C:\windows;C:\ProgramData\Oracle\Java\javapath;C:\Program Files (x86)\Intel\iCLS Client\;C:\Program Files\Intel\iCLS Client\;C:\windows\system32;C:\windows;C:\windows\System32\Wbem;C:\windows\System32\WindowsPowerShell\v1.0\;C:\Program Files (x86)\Intel\Intel(R) Management Engine Components\DAL;C:\Program Files\Intel\Intel(R) Management Engine Components\DAL;C:\Program Files (x86)\Intel\Intel(R) Management Engine Components\IPT;C:\Program Files\Intel\Intel(R) Management Engine Components\IPT;C:\Program Files (x86)\NVIDIA Corporation\PhysX\Common;D:\Develop\TortoiseSVN\bin;D:\Develop\Git\cmd;C:\Program Files\Intel\WiFi\bin\;C:\Program Files\Common Files\Intel\WirelessCommon\;C:\Program Files\nodejs\;D:\Develop\apache-maven-3.5.0\bin;C:\Users\zw\AppData\Local\Microsoft\WindowsApps;C:\Users\zw\AppData\Roaming\npm;C:\Program Files\Microsoft VS Code\bin;.
     java.specification.name-------Java Platform API Specification
     java.class.version-------52.0
     sun.management.compiler-------HotSpot 64-Bit Tiered Compilers
     os.version-------10.0
     user.home-------C:\Users\zw
     user.timezone-------
     java.awt.printerjob-------sun.awt.windows.WPrinterJob
     file.encoding-------UTF-8
     java.specification.version-------1.8
     java.class.path-------C:\Program Files\Java\jdk1.8.0_131\jre\lib\charsets.jar;C:\Program Files\Java\jdk1.8.0_131\jre\lib\deploy.jar;C:\Program Files\Java\jdk1.8.0_131\jre\lib\ext\access-bridge-64.jar;C:\Program Files\Java\jdk1.8.0_131\jre\lib\ext\cldrdata.jar;C:\Program Files\Java\jdk1.8.0_131\jre\lib\ext\dnsns.jar;C:\Program Files\Java\jdk1.8.0_131\jre\lib\ext\jaccess.jar;C:\Program Files\Java\jdk1.8.0_131\jre\lib\ext\jfxrt.jar;C:\Program Files\Java\jdk1.8.0_131\jre\lib\ext\localedata.jar;C:\Program Files\Java\jdk1.8.0_131\jre\lib\ext\nashorn.jar;C:\Program Files\Java\jdk1.8.0_131\jre\lib\ext\sunec.jar;C:\Program Files\Java\jdk1.8.0_131\jre\lib\ext\sunjce_provider.jar;C:\Program Files\Java\jdk1.8.0_131\jre\lib\ext\sunmscapi.jar;C:\Program Files\Java\jdk1.8.0_131\jre\lib\ext\sunpkcs11.jar;C:\Program Files\Java\jdk1.8.0_131\jre\lib\ext\zipfs.jar;C:\Program Files\Java\jdk1.8.0_131\jre\lib\javaws.jar;C:\Program Files\Java\jdk1.8.0_131\jre\lib\jce.jar;C:\Program Files\Java\jdk1.8.0_131\jre\lib\jfr.jar;C:\Program Files\Java\jdk1.8.0_131\jre\lib\jfxswt.jar;C:\Program Files\Java\jdk1.8.0_131\jre\lib\jsse.jar;C:\Program Files\Java\jdk1.8.0_131\jre\lib\management-agent.jar;C:\Program Files\Java\jdk1.8.0_131\jre\lib\plugin.jar;C:\Program Files\Java\jdk1.8.0_131\jre\lib\resources.jar;C:\Program Files\Java\jdk1.8.0_131\jre\lib\rt.jar;D:\Develop\IdeaProjects\delsvn\out\production\delsvn;D:\Develop\IntelliJ IDEA 2017.1.4\lib\idea_rt.jar
     user.name-------zw
     java.vm.specification.version-------1.8
     sun.java.command-------com.example.TestProperties
     java.home-------C:\Program Files\Java\jdk1.8.0_131\jre
     sun.arch.data.model-------64
     user.language-------zh
     java.specification.vendor-------Oracle Corporation
     awt.toolkit-------sun.awt.windows.WToolkit
     java.vm.info-------mixed mode
     java.version-------1.8.0_131
     java.ext.dirs-------C:\Program Files\Java\jdk1.8.0_131\jre\lib\ext;C:\windows\Sun\Java\lib\ext
     sun.boot.class.path-------C:\Program Files\Java\jdk1.8.0_131\jre\lib\resources.jar;C:\Program Files\Java\jdk1.8.0_131\jre\lib\rt.jar;C:\Program Files\Java\jdk1.8.0_131\jre\lib\sunrsasign.jar;C:\Program Files\Java\jdk1.8.0_131\jre\lib\jsse.jar;C:\Program Files\Java\jdk1.8.0_131\jre\lib\jce.jar;C:\Program Files\Java\jdk1.8.0_131\jre\lib\charsets.jar;C:\Program Files\Java\jdk1.8.0_131\jre\lib\jfr.jar;C:\Program Files\Java\jdk1.8.0_131\jre\classes
     java.vendor-------Oracle Corporation
     file.separator-------\
     java.vendor.url.bug-------http://bugreport.sun.com/bugreport/
     sun.io.unicode.encoding-------UnicodeLittle
     sun.cpu.endian-------little
     sun.desktop-------windows
     sun.cpu.isalist-------amd64
     */
}
