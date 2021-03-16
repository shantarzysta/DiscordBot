import Events.AntiWarcin;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.OnlineStatus;
import net.dv8tion.jda.api.entities.Activity;

import javax.security.auth.login.LoginException;

public class Main {
    public static JDA jda;
    public static String prefix = "-";

    public static void main(String[] args) throws LoginException{
        jda = JDABuilder.createDefault("TOKEN-SECRET").build();
        jda.addEventListener(new Clear());
        jda.addEventListener(new AntiWarcin());
        jda.getPresence().setStatus(OnlineStatus.ONLINE);
        jda.getPresence().setActivity(Activity.watching("Pajacowanie Warcina"));
    }
}
