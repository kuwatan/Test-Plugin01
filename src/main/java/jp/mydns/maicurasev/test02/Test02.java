package jp.mydns.maicurasev.test02;

import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;


public final class Test02 extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getServer().getPluginManager().registerEvents(this, this);
    }

    @EventHandler
        public void onChat(AsyncPlayerChatEvent event) {
        // ifがgetMessageがメッセージ内容取得,equals("hello")が文字列のif
        if(event.getMessage().equals("hello")){
            // ifの内部処理で、helloだったときsetMessageで文字を変える
            event.setMessage("こんにちは、"+event.getPlayer().getDisplayName());
        }
    }
    public void join(PlayerJoinEvent event) {
        // プレイヤー参加メッセージ変更
         event.setJoinMessage(ChatColor.YELLOW+"サーバーに"+event.getPlayer().getDisplayName() + "が参加しました！");
     }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
