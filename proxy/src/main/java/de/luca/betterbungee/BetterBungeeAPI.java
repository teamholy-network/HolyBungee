package de.luca.betterbungee;

import de.luca.betterbungee.ipcheck.IPChecker;
import lombok.Getter;

public class BetterBungeeAPI {
    @Getter
    private static IPChecker ipchecker = new IPChecker();

    @Getter
    private static String prefix = "§f§lHoly§6§lBungee";

    @Getter
    private static String HolyBungeeVersion = "1.0";

    @Getter
    private static String BetterBungeeVersion = "1.0";

    @Getter
    private static String bungeecordversion = "d99570214aca18a7eb0f6682a36d8992da65b57a";
}
