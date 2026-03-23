# PrefabDirtySystems

Type: class | Package: com.hypixel.hytale.builtin.buildertools.prefabeditor

public final class PrefabDirtySystems

Contains ECS event systems that mark prefabs as dirty when blocks are placed or broken within their bounding boxes. Listens to `BreakBlockEvent` and `PlaceBlockEvent`, iterating all active edit sessions to flag affected prefabs.

## Inner Types

### BlockBreakDirtySystem (class)


public static class BlockBreakDirtySystem extends EntityEventSystem<EntityStore, BreakBlockEvent>

Handles `BreakBlockEvent` by marking prefabs dirty at the broken block's position. Uses an empty archetype query (no component requirements).

### BlockPlaceDirtySystem (class)


public static class BlockPlaceDirtySystem extends EntityEventSystem<EntityStore, PlaceBlockEvent>

Handles `PlaceBlockEvent` by marking prefabs dirty at the placed block's position. Uses an empty archetype query.

## See Also

- PrefabEditSession
- PrefabEditingMetadata
