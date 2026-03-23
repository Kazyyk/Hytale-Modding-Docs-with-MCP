---
title: "BlockPhysics"
kind: "class"
package: "com.hypixel.hytale.server.core.blocktype.component"
fqcn: "com.hypixel.hytale.server.core.blocktype.component.BlockPhysics"
api_surface: true
extends: null
implements:
  - "Component<ChunkStore>"
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "blocktype"
  - "component"
  - "chunk"
  - "physics"
  - "api-surface"
---

**Package:** `com.hypixel.hytale.server.core.blocktype.component`

```java
public class BlockPhysics implements Component<ChunkStore>
```

A `ChunkStore` component that stores per-block support values for a chunk section. Each block position is assigned a 4-bit (nibble) support value, packed into a byte array of 16,384 bytes (32x32x32 blocks, two nibbles per byte). A support value of `15` (`IS_DECO_VALUE`) marks a block as decorative. A value of `0` (`NULL_SUPPORT`) indicates no support data.

The data is thread-safe via a `StampedLock` and is lazily allocated -- the backing array is `null` until a non-zero value is stored. When all values return to zero, the array is released.

## Fields

| Modifier | Type | Name |
|---|---|---|
| `public static final` | `int` | `VERSION` |
| `public static final` | `BuilderCodec<BlockPhysics>` | `CODEC` |
| `public static final` | `int` | `SUPPORT_DATA_SIZE` |
| `public static final` | `int` | `IS_DECO_VALUE` |
| `public static final` | `int` | `NULL_SUPPORT` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public static` | `ComponentType<ChunkStore, BlockPhysics>` | `getComponentType()` |
| `public` | `boolean` | `set(int index, int support)` |
| `public` | `boolean` | `set(int x, int y, int z, int support)` |
| `public` | `int` | `get(int index)` |
| `public` | `int` | `get(int x, int y, int z)` |
| `public` | `boolean` | `isDeco(int x, int y, int z)` |
| `public` | `boolean` | `isDeco(int index)` |
| `@Nonnull public` | `Component<ChunkStore>` | `clone()` |
| `public static` | `void` | `clear(@Nonnull Store<ChunkStore> store, @Nonnull Ref<ChunkStore> section, int x, int y, int z)` |
| `public static` | `void` | `clear(@Nonnull Holder<ChunkStore> section, int x, int y, int z)` |
| `public static` | `void` | `reset(@Nonnull Store<ChunkStore> store, @Nonnull Ref<ChunkStore> section, int x, int y, int z)` |
| `public static` | `void` | `reset(@Nonnull Holder<ChunkStore> section, int x, int y, int z)` |
| `public static` | `void` | `markDeco(@Nonnull ComponentAccessor<ChunkStore> store, @Nonnull Ref<ChunkStore> section, int x, int y, int z)` |
| `public static` | `void` | `setSupportValue(@Nonnull Store<ChunkStore> store, @Nonnull Ref<ChunkStore> section, int x, int y, int z, int value)` |
| `public static` | `void` | `setSupportValue(@Nonnull Holder<ChunkStore> section, int x, int y, int z, int value)` |

## Related Types

- [BlockTypeModule](../com.hypixel.hytale.server.core.blocktype/BlockTypeModule.md) -- registers this component
