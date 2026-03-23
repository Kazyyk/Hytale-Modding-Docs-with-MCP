# PlayerChatEvent

Type: class | Package: com.hypixel.hytale.server.core.event.events.player | Extends: PlayerRefEvent

public class PlayerChatEvent extends PlayerRefEvent

Fired when a player sends a chat message.

Also in this package: AddPlayerToWorldEvent, DrainPlayerFromWorldEvent, Formatter, PlayerConnectEvent, PlayerCraftEvent, PlayerDisconnectEvent, PlayerEvent, PlayerInteractEvent, PlayerMouseButtonEvent, PlayerMouseMotionEvent, PlayerReadyEvent, PlayerRefEvent, PlayerSetupConnectEvent, PlayerSetupDisconnectEvent, RemovedPlayerFromWorldEvent

Complete API:
  public PlayerRef getSender()
  public void setSender(PlayerRef sender)
  public List<PlayerRef> getTargets()
  public void setTargets(List<PlayerRef> targets)
  public String getContent()
  public void setContent(String content)
  public PlayerChatEvent.Formatter getFormatter()
  public void setFormatter(PlayerChatEvent.Formatter formatter)
  public boolean isCancelled()
  public void setCancelled(boolean cancelled)
  public String toString()

Fields:
public static final PlayerChatEvent.Formatter DEFAULT_FORMATTER
private PlayerRef sender
private List<PlayerRef> targets
private String content
private PlayerChatEvent.Formatter formatter
private boolean cancelled
