# ItemContainerBlock

Type: class | Package: com.hypixel.hytale.server.core.modules.block.components | Implements: Component<ChunkStore>

public class ItemContainerBlock implements Component<ChunkStore>

Component attached to block entities that contain an item container (e.g., chests, barrels). Stores the `SimpleItemContainer`, its capacity, an optional droplist reference, and a map of currently open `ContainerBlockWindow` instances keyed by player UUID.

## Static Fields

- public static final BuilderCodec<ItemContainerBlock> CODEC

## Methods

- public static ComponentType<ChunkStore, ItemContainerBlock> getComponentType()
- public SimpleItemContainer getItemContainer()
- public void setItemContainer(SimpleItemContainer itemContainer)
- public String getDroplist()
- public void setDroplist(String droplist)
- public Map<UUID, ContainerBlockWindow> getWindows()
- public short getCapacity()
- public Component<ChunkStore> clone()

## Relationships

- Implements `Component<ChunkStore>`
- Managed by BlockModule
- Systems: `ItemContainerSystems.OnAddedOrRemoved`, `ItemContainerSystems.OnReplaced`
