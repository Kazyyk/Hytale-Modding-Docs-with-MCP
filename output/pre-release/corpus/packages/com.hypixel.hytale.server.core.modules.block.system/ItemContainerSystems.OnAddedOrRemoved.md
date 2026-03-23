# ItemContainerSystems.OnAddedOrRemoved

Type: class | Package: com.hypixel.hytale.server.core.modules.block.system | Extends: RefSystem<ChunkStore>

public static class ItemContainerSystems.OnAddedOrRemoved extends RefSystem<ChunkStore>

Handles block entity add and remove lifecycle. On add: adjusts item container capacity to match the block type config, registers change events for save tracking, and drops overflow items as item entities. On remove (not unload): closes all windows, drops all items as item entities.

## Relationships

- Inner class of ItemContainerSystems
- Operates on ItemContainerBlock
