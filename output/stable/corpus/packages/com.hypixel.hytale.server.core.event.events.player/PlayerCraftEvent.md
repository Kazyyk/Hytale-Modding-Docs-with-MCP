# PlayerCraftEvent

Type: class | Package: com.hypixel.hytale.server.core.event.events.player | Extends: PlayerRefEvent

public class PlayerCraftEvent extends PlayerRefEvent

Fired when a player crafts an item.

Also in this package: AddPlayerToWorldEvent, DrainPlayerFromWorldEvent, Formatter, PlayerChatEvent, PlayerConnectEvent, PlayerDisconnectEvent, PlayerEvent, PlayerInteractEvent, PlayerMouseButtonEvent, PlayerMouseMotionEvent, PlayerReadyEvent, PlayerRefEvent, PlayerSetupConnectEvent, PlayerSetupDisconnectEvent

Complete API:
  public CraftingRecipe getCraftedRecipe()
  public int getQuantity()
  public String toString()

Fields:
private final CraftingRecipe craftedRecipe
private final int quantity
