# ItemContext

Type: class | Package: com.hypixel.hytale.server.core.inventory

public class ItemContext

Immutable context binding an ItemStack to its container and slot index. Used to pass item location context through inventory operations and interactions.

## Constructors

- ItemContext(ItemContainer container, short slot, ItemStack itemStack)

## Methods

- public ItemContainer getContainer()
- public short getSlot()
- public ItemStack getItemStack()

Also in this package: Inventory, ItemPickupType, ItemStack, MaterialQuantity, Metadata, ResourceQuantity

Complete API:
  public ItemContainer getContainer()
  public short getSlot()
  public ItemStack getItemStack()
  public String toString()

Fields:
private final ItemContainer container
private final short slot
private final ItemStack itemStack
