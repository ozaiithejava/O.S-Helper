# OSInfoProvider ve Main Sınıfları Kullanımı

Bu belge, `OSInfoProvider` ve `Main` sınıflarının kullanımını içermektedir.

## OSInfoProvider Sınıfı

`OSInfoProvider` sınıfı, işletim sistemini belirlemek için kullanılır. Aşağıda örnekte olduğu gibi bir işletim sistemi belirlenir ve enum değeri olarak döndürülür.

```java
public class OSInfoProvider {
    public enum OS {
        WINDOWS, MAC, LINUX, SOLARIS, AIX, HP_UX, FREEBSD, OPENBSD, NETBSD, OSF1, OTHER
    }

    public OS getOperatingSystem() {
        String osName = System.getProperty("os.name").toLowerCase();

        // OS belirleme koşulları...

        return selectedOS;
    }
}
```
## Main Kullanım:
```Java
public class Main {
    public static void main(String[] args) {
        useOSInfoProvider();
    }

    public static void useOSInfoProvider() {
        OSInfoProvider osInfoProvider = new OSInfoProvider();
        OSInfoProvider.OS selectedOS = osInfoProvider.getOperatingSystem();

        // İşletim sistemine özgü işlemler...

        switch (selectedOS) {
            case WINDOWS:
                // Windows'a özgü işlemler...
                break;
            case MAC:
                // Mac'e özgü işlemler...
                break;
            case LINUX:
                // Linux'a özgü işlemler...
                break;
            // Diğer işletim sistemleri için case'ler...
        }
    }
}
```
