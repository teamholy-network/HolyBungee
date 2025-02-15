package de.luca.betterbungee;

import de.luca.betterbungee.ipcheck.IPChecker;
import io.netty.channel.ChannelHandlerContext;
import lombok.Getter;
import net.md_5.bungee.netty.ChannelWrapper;
import net.outfluencer.sessioncache.SessionCache;

import java.net.SocketAddress;
import java.util.concurrent.TimeUnit;

public class BetterBungeeAPI {

    @Getter
    private static final IPChecker ipchecker = new IPChecker();

    @Getter
    private static final String prefix = "§f§lHoly§6§lBungee";

    @Getter
    private static final String HolyBungeeVersion = "1.0";

    @Getter
    private static final String BetterBungeeVersion = "1.0";

    @Getter
    private static final String bungeecordversion = "556a15a6f8820467a0161b34654b3cdb35c7c89c";

	@Getter
	private static final SessionCache sessionCache = new SessionCache( TimeUnit.MINUTES.toMillis( BetterBungeeConfig.getConfigJson().getLoginCacheSettings().getCacheTimeInMinutes() ) );

    public static final String getRealAdress(ChannelHandlerContext ctx) {
        final SocketAddress remote = ctx.channel().remoteAddress();
        final String addr = remote != null ? remote.toString() : "";
        return addr.split("/")[1].split(":")[0];
    }

    public static final String getRealAdress(SocketAddress socketaddress) {
        final String addr = socketaddress.toString() != null ? socketaddress.toString() : "";
        return addr.split("/")[1].split(":")[0];
    }

    public static final String getRealAdress(ChannelWrapper channel) {
        final SocketAddress remote = channel.getRemoteAddress();
        final String addr = remote != null ? remote.toString() : "";
        return addr.split("/")[1].split(":")[0];
    }
}
