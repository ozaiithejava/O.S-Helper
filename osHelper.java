public class OSInfoProvider {
    public enum OS {
        WINDOWS, MAC, LINUX, SOLARIS, AIX, HP_UX, FREEBSD, OPENBSD, NETBSD, OSF1, OTHER
    }

    public OS getOperatingSystem() {
        String osName = System.getProperty("os.name").toLowerCase();

        if (osName.contains("win")) {
            return OS.WINDOWS;
        } else if (osName.contains("mac")) {
            return OS.MAC;
        } else if (osName.contains("nix") || osName.contains("nux") || osName.contains("nux")) {
            return OS.LINUX;
        } else if (osName.contains("sunos")) {
            return OS.SOLARIS;
        } else if (osName.contains("aix")) {
            return OS.AIX;
        } else if (osName.contains("hp-ux")) {
            return OS.HP_UX;
        } else if (osName.contains("freebsd")) {
            return OS.FREEBSD;
        } else if (osName.contains("openbsd")) {
            return OS.OPENBSD;
        } else if (osName.contains("netbsd")) {
            return OS.NETBSD;
        } else if (osName.contains("osf1")) {
            return OS.OSF1;
        } else {
            return OS.OTHER;
        }
    }
}
