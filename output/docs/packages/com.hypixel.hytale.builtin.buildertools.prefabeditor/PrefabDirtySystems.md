---
title: "PrefabDirtySystems"
kind: "class"
package: "com.hypixel.hytale.builtin.buildertools.prefabeditor"
fqcn: "com.hypixel.hytale.builtin.buildertools.prefabeditor.PrefabDirtySystems"
api_surface: false
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags:
  - "builder-tools"
  - "prefab-editor"
  - "ecs"
  - "events"
---

**Package:** `com.hypixel.hytale.builtin.buildertools.prefabeditor`

```java
public final class PrefabDirtySystems
```

Contains ECS event systems that mark prefabs as dirty when blocks are placed or broken within their bounding boxes. Listens to `BreakBlockEvent` and `PlaceBlockEvent`, iterating all active edit sessions to flag affected prefabs.

## Inner Types

### BlockBreakDirtySystem (class)

```java
public static class BlockBreakDirtySystem extends EntityEventSystem<EntityStore, BreakBlockEvent>
```

Handles `BreakBlockEvent` by marking prefabs dirty at the broken block's position. Uses an empty archetype query (no component requirements).

### BlockPlaceDirtySystem (class)

```java
public static class BlockPlaceDirtySystem extends EntityEventSystem<EntityStore, PlaceBlockEvent>
```

Handles `PlaceBlockEvent` by marking prefabs dirty at the placed block's position. Uses an empty archetype query.

## See Also

- [PrefabEditSession](PrefabEditSession.md)
- [PrefabEditingMetadata](PrefabEditingMetadata.md)
