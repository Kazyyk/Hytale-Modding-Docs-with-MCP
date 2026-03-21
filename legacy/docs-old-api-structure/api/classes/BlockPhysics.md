---
title: "BlockPhysics"
kind: "class"
package: "com.hypixel.hytale.server.core.blocktype.component"
fqcn: "com.hypixel.hytale.server.core.blocktype.component.BlockPhysics"
api_surface: true
extends: ~
implements:
  - "Component<ChunkStore>"
generator_version: "1.0.0"
generated_at: "2026-03-20T20:00:00Z"
tags:
  - "ecs"
  - "chunk-store"
  - "component"
  - "physics"
  - "block"
---

**Package:** `com.hypixel.hytale.server.core.blocktype.component`

```java
public class BlockPhysics implements Component<ChunkStore>
```

An ECS component on `ChunkStore` that tracks per-block support values within a chunk section. Each block position stores a 4-bit nibble (0--15) representing its physics support state. A value of `0` means no support data, and the special value `15` (`IS_DECO_VALUE`) marks a block as decorative. The component uses a lazily-allocated byte array and a `StampedLock` for thread-safe access.

## Fields

| Field | Type | Value | Description |
|---|---|---|---|
| `VERSION` | `int` | `0` | Codec version for serialization. |
| `CODEC` | `BuilderCodec<BlockPhysics>` | -- | Codec for serializing and deserializing the support data. |
| `SUPPORT_DATA_SIZE` | `int` | `16384` | Size of the internal byte array. Each byte stores two 4-bit nibbles, covering all block positions in a chunk section. |
| `IS_DECO_VALUE` | `int` | `15` | The support value that marks a block as decorative. |
| `NULL_SUPPORT` | `int` | `0` | The support value indicating no support data. |

## Component Registration

```java
public static ComponentType<ChunkStore, BlockPhysics> getComponentType()
```

Returns the [ComponentType](ComponentType.md) for `BlockPhysics`, obtained from `BlockTypeModule`. Used to look up or register this component on chunk stores.

## Instance Methods

### Setting Support Values

```java
public boolean set(int index, int support)
```

Sets the support value (masked to 4 bits) at the given flat block index. Returns `true` if the value changed. The internal byte array is allocated lazily on the first non-zero write and deallocated when all values return to zero.

```java
public boolean set(int x, int y, int z, int support)
```

Sets the support value at the given block coordinates within the chunk section. Converts coordinates to a flat index via `ChunkUtil.indexBlock`.

### Getting Support Values

```java
public int get(int index)
```

Returns the 4-bit support value at the given flat block index. Returns `0` if the internal data array has not been allocated.

```java
public int get(int x, int y, int z)
```

Returns the support value at the given block coordinates. Converts coordinates to a flat index via `ChunkUtil.indexBlock`.

### Decorative Block Queries

```java
public boolean isDeco(int x, int y, int z)
```

Returns `true` if the block at the given coordinates is marked as decorative (support value equals `IS_DECO_VALUE`, i.e., `15`).

```java
public boolean isDeco(int index)
```

Returns `true` if the block at the given flat index is marked as decorative.

### Clone

```java
@Nonnull
@Override
public Component<ChunkStore> clone()
```

Creates a deep copy of this component, including a copy of the support data array if it exists.

## Static Utility Methods

These convenience methods operate directly on chunk stores and chunk section references, handling component lookup and creation automatically.

### clear

```java
public static void clear(@Nonnull Store<ChunkStore> store, @Nonnull Ref<ChunkStore> section, int x, int y, int z)
```

Clears (sets to `0`) the support value for the block at the given position. Does nothing if the `BlockPhysics` component does not exist on the section.

```java
public static void clear(@Nonnull Holder<ChunkStore> section, int x, int y, int z)
```

Overload that takes a `Holder<ChunkStore>` instead of a store + ref pair.

### reset

```java
public static void reset(@Nonnull Store<ChunkStore> store, @Nonnull Ref<ChunkStore> section, int x, int y, int z)
```

Resets the support value for the block at the given position to `0`. Unlike `clear`, this method creates the `BlockPhysics` component if it does not already exist (via `ensureAndGetComponent`).

```java
public static void reset(@Nonnull Holder<ChunkStore> section, int x, int y, int z)
```

Overload that takes a `Holder<ChunkStore>`. Delegates to `setSupportValue` with a value of `0`.

### markDeco

```java
public static void markDeco(@Nonnull ComponentAccessor<ChunkStore> store, @Nonnull Ref<ChunkStore> section, int x, int y, int z)
```

Marks the block at the given position as decorative (sets the support value to `IS_DECO_VALUE`, i.e., `15`). Creates the `BlockPhysics` component if it does not already exist.

### setSupportValue

```java
public static void setSupportValue(@Nonnull Store<ChunkStore> store, @Nonnull Ref<ChunkStore> section, int x, int y, int z, int value)
```

Sets the support value for the block at the given position to the specified value. Creates the `BlockPhysics` component if it does not already exist.

```java
public static void setSupportValue(@Nonnull Holder<ChunkStore> section, int x, int y, int z, int value)
```

Overload that takes a `Holder<ChunkStore>` instead of a store + ref pair.

## Related Types

- [Store](Store.md) -- the generic ECS store; `BlockPhysics` lives on `ChunkStore`
- [Ref](Ref.md) -- typed reference to a chunk section in the store
- [ComponentType](ComponentType.md) -- type descriptor returned by `getComponentType()`
- [ComponentRegistryProxy](ComponentRegistryProxy.md) -- used by plugins to register custom chunk store components
- [BreakBlockEvent](../events/BreakBlockEvent.md) -- block removal may interact with physics support
- [PlaceBlockEvent](../events/PlaceBlockEvent.md) -- block placement may set physics support values
