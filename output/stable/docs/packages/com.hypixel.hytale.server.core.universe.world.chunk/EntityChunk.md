---
title: "EntityChunk"
kind: "class"
package: "com.hypixel.hytale.server.core.universe.world.chunk"
fqcn: "com.hypixel.hytale.server.core.universe.world.chunk.EntityChunk"
api_surface: true
extends: ~
implements:
  - "Component<ChunkStore>"
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags:
  - "chunk"
  - "entity"
  - "ecs"
---

**Package:** `com.hypixel.hytale.server.core.universe.world.chunk`

```java
public class EntityChunk implements Component<ChunkStore>
```

ECS component that stores world entities (NPCs, items, projectiles, etc.) associated with a chunk column. Similar to [BlockComponentChunk](BlockComponentChunk.md) but for the `EntityStore` rather than `ChunkStore`. Maintains parallel collections of `Holder<EntityStore>` (serialized entities not yet in the live store) and `Ref<EntityStore>` (live entity references).

## Static Fields

| Field | Type | Description |
|---|---|---|
| `CODEC` | `BuilderCodec<EntityChunk>` | Codec serializing the `"Entities"` array of stored holders. |

## Static Methods

```java
@Nonnull
public static ComponentType<ChunkStore, EntityChunk> getComponentType()
```

## Instance Methods

```java
@Nonnull
public List<Holder<EntityStore>> getEntityHolders()
```

Returns an unmodifiable view of the stored entity holders.

```java
public void addEntityHolder(@Nonnull Holder<EntityStore> holder)
```

Adds a holder and marks the chunk as needing to be saved.

```java
@Nonnull
public Set<Ref<EntityStore>> getEntityReferences()
```

Returns an unmodifiable view of the live entity references.

```java
public void addEntityReference(@Nonnull Ref<EntityStore> reference)
```

```java
public void removeEntityReference(@Nonnull Ref<EntityStore> reference)
```

```java
@Nullable
public Holder<EntityStore>[] takeEntityHolders()
```

Returns and clears all entity holders. Returns `null` if empty.

```java
@Nullable
public Ref<EntityStore>[] takeEntityReferences()
```

Returns and clears all entity references. Returns `null` if empty.

## Inner Classes

- `EntityChunkLoadingSystem` -- `RefChangeSystem` that converts between holders and live references during chunk ticking transitions.
