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
