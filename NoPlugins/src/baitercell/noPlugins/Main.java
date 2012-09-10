package baitercell.noPlugins;

import java.util.logging.Logger;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;


public class Main extends JavaPlugin
{
	Logger log;
	
	public void onDisable()
	{
		log.info("No Plugin has been disabled");
	}
	public void onEnable()
	{
		log = this.getLogger();
		log.info("No Plugin has been enabled");
		new ChatListener(this);
	}
	

	
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args)
	{
	
		Player player = null;
	
	
		if(sender instanceof Player)
		{
			player = (Player) sender;
		}

		if(cmd.getName().equalsIgnoreCase("hidden"))
		{ 
			player.sendMessage("Hidden");
		}
		return false;
	}
}
