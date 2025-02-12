package net.md_5.bungee;

import de.luca.betterbungee.updater.BungeeUpdaterAPI;

public class Bootstrap
{
    public static void main(String[] args) throws Exception
    {
        if ( Float.parseFloat( System.getProperty( "java.class.version" ) ) < 52.0 )
        {
            System.err.println( "*** ERROR *** BungeeCord requires Java 8 or above to function! Please download and install it!" );
            System.out.println( "You can check your Java version with the command: java -version" );
            return;
        }
        BungeeUpdaterAPI updater = new BungeeUpdaterAPI("e3ae3c22-bda4-44fb-b00a-5bcf20a9c40f", "");
        updater.setHibernat(true);
        updater.setOnlyempty(true);
        BungeeCordLauncher.main( args );
    }
}
