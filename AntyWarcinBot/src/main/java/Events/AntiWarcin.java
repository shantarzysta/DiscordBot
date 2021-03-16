package Events;

import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import java.util.Random;

public class AntiWarcin extends ListenerAdapter {
    public void onGuildMessageReceived(GuildMessageReceivedEvent event){
        if(event.getAuthor().getAsTag().equalsIgnoreCase("ProEloKozakMocny#2426")){
            Random rand = new Random();

            int number = rand.nextInt(5);

            switch (number){
                case 0:
                    event.getMessage().addReaction("👎").queue();
                    break;
                case 1:
                    event.getChannel().sendMessage("Cicho Warcin.").reference(event.getMessage()).queue();
                    break;
                case 2:
                    event.getChannel().sendMessage("'" + event.getMessage().getContentDisplay() + "' ~ Warcin Pajac").queue();
                    break;
                case 3:
                    event.getMessage().addReaction("\uD83D\uDE42").queue();
                    break;
                case 4:
                    StringBuilder stringBuilder = new StringBuilder(event.getMessage().getContentDisplay());
                    for(int i = 0; i<stringBuilder.length(); i++){
                        if(i % 2 == 0 && Character.isLetter(stringBuilder.charAt(i))) {
                            stringBuilder.setCharAt(i, Character.toUpperCase(stringBuilder.charAt(i)));
                        }
                        else if(i % 2 == 1 && Character.isLetter(stringBuilder.charAt(i))){
                            stringBuilder.setCharAt(i, Character.toLowerCase(stringBuilder.charAt(i)));
                        }
                    }
                    event.getChannel().sendMessage(stringBuilder).queue();
                    break;
            }
        }else {
            if (!event.getAuthor().getName().equalsIgnoreCase("AntyWarcin Bot")) {
                event.getMessage().addReaction("\uD83D\uDC4D").queue();
            }
        }
    }
}
