# EmptyItemContainer

Type: class | Package: com.hypixel.hytale.server.core.inventory.container | Extends: ItemContainer

public class EmptyItemContainer extends ItemContainer

Singleton zero-capacity item container used as the default for uninitialized inventory components. All slot operations throw `UnsupportedOperationException`. Filter and change event operations are no-ops.

## Static Fields

- public static final EmptyItemContainer INSTANCE
- public static final BuilderCodec<EmptyItemContainer> CODEC

## Methods

- public short getCapacity()
- public ClearTransaction clear()
- public EmptyItemContainer clone()
- public boolean isEmpty()

## Relationships

- Extends `ItemContainer`
- Used as default by InventoryComponent
