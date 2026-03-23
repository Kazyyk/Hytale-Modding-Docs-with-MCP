# InventoryPacketHandler

Type: class | Package: com.hypixel.hytale.server.core.io.handlers.game | Implements: SubPacketHandler

public class InventoryPacketHandler implements SubPacketHandler

Sub-packet handler for inventory-related client packets.

Also in this package: GamePacketHandler

Complete API:
  public void registerHandlers()
  public void handle(SetCreativeItem packet)
  public void handle(DropCreativeItem packet)
  public void handle(SwitchHotbarBlockSet packet)
  public void handle(SmartGiveCreativeItem packet)
  public void handle(DropItemStack packet)
  public void handle(MoveItemStack packet)
  public void handle(SmartMoveItemStack packet)
  public void handle(SetActiveSlot packet)
  public void handle(InventoryAction packet)

Fields:
private final IPacketHandler packetHandler
