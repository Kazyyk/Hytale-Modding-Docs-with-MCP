---
title: "ChunkColumn"
kind: "class"
package: "com.hypixel.hytale.server.core.universe.world.chunk"
fqcn: "com.hypixel.hytale.server.core.universe.world.chunk.ChunkColumn"
api_surface: true
extends: ~
implements:
  - "Component<ChunkStore>"
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags:
  - "chunk"
  - "section"
  - "ecs"
  - "deprecated"
---

**Package:** `com.hypixel.hytale.server.core.universe.world.chunk`

```java
@Deprecated
public class ChunkColumn implements Component<ChunkStore>
```

ECS component representing the vertical subdivision of a chunk into 10 sections (each 32 blocks tall). Holds an array of `Ref<ChunkStore>` for live section entities and an optional array of `Holder<ChunkStore>` for serialized section data not yet loaded into the store.

## Static Methods

```java
public static ComponentType<ChunkStore, ChunkColumn> getComponentType()
```

## Instance Methods

```java
@Nullable
public Ref<ChunkStore> getSection(int section)
```

Returns the live section reference at the given index (0-9), or `null` if out of range or not loaded.

```java
@Nonnull
public Ref<ChunkStore>[] getSections()
```

Returns the full 10-element section reference array.

```java
@Nullable
public Holder<ChunkStore>[] getSectionHolders()
```

Returns the serialized section holders, or `null` if already consumed.

```java
@Nullable
public Holder<ChunkStore>[] takeSectionHolders()
```

Returns and clears the section holders array.

```java
public void putSectionHolders(Holder<ChunkStore>[] holders)
```

Sets the section holders array (used during serialization or migration).
