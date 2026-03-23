# InventoryComponent.Combined

Type: class | Package: com.hypixel.hytale.server.core.inventory | Implements: Component<EntityStore>

public static class InventoryComponent.Combined implements Component<EntityStore>

Cache component that stores `CombinedItemContainer` views keyed by arrays of component types. Avoids recomputing combined views repeatedly. Extends nothing; implements `Component<EntityStore>`.

## Methods

- public static ComponentType<EntityStore, InventoryComponent.Combined> getComponentType()
- public Component<EntityStore> clone()
