# ItemContainerSystems

Type: class | Package: com.hypixel.hytale.server.core.modules.block.system

public class ItemContainerSystems

Container for ECS systems managing `ItemContainerBlock` lifecycle events. Handles capacity adjustment and change event registration on add, item dropping on remove, and item migration when block entities are replaced.

## Inner Classes

- ItemContainerSystems.OnAddedOrRemoved | RefSystem<ChunkStore> | Adjusts capacity and drops items on add/remove
- ItemContainerSystems.OnReplaced | EntityEventSystem<ChunkStore, BlockReplaceEvent> | Migrates items from old to new block entity
- ItemContainerSystems.OnReplacedHolder | EntityHolderEventSystem<ChunkStore, BlockReplaceEvent> | Migrates items from old holder to new block entity
