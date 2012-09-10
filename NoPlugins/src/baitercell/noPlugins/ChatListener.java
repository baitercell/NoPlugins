package baitercell.noPlugins;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;
import org.bukkit.plugin.Plugin;

public class ChatListener implements Listener
{
	public Plugin plugin;
	public ChatListener(Plugin instance)
	{
		plugin = instance;
		Bukkit.getServer().getPluginManager().registerEvents(this, plugin);
	}

	@EventHandler(priority = EventPriority.NORMAL)
	public void readChat(final PlayerCommandPreprocessEvent event )
	{	
		Player p = event.getPlayer();
		String message = event.getMessage();
		String s = "/plugins";
		
		System.out.println(message);
		
		if( p.isOp() == false )
		{		
			System.out.println(message);
			if( message.equalsIgnoreCase(s) )
			{
				System.out.println(message);
				event.setMessage("/hidden");
				System.out.println(message);
			}	
		}	
		return;	
	}
}
