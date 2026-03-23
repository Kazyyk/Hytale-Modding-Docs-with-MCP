---
title: "BlockPhysics"
kind: "class"
package: "com.hypixel.hytale.server.core.blocktype.component"
fqcn: "com.hypixel.hytale.server.core.blocktype.component.BlockPhysics"
api_surface: true
extends: null
implements: ["Component"]
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "server"
  - "core"
  - "blocktype"
  - "component"
  - "class"
---

**Package:** `com.hypixel.hytale.server.core.blocktype.component`

```java
public class BlockPhysics implements Component
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `public static final` | `int` | `VERSION` |
| `public static final` | `BuilderCodec<BlockPhysics>` | `CODEC` |
| `public static final` | `int` | `SUPPORT_DATA_SIZE` |
| `public static final` | `int` | `IS_DECO_VALUE` |
| `public static final` | `int` | `NULL_SUPPORT` |
| `private final` | `StampedLock` | `lock` |
| `private` | `byte[]` | `supportData` |
| `private` | `int` | `nonZeroCount` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public static` | `ComponentType<ChunkStore,BlockPhysics>` | `getComponentType()` |
| `public` | `boolean` | `set(int index, int support)` |
| `public` | `boolean` | `set(int x, int y, int z, int support)` |
| `public` | `int` | `get(int index)` |
| `public` | `int` | `get(int x, int y, int z)` |
| `public` | `boolean` | `isDeco(int x, int y, int z)` |
| `public` | `boolean` | `isDeco(int index)` |
| `@Nonnull @Override public` | `Component<ChunkStore>` | `clone()` |
| `private` | `byte[]` | `serialize(ExtraInfo extraInfo)` |
| `private` | `void` | `deserialize(byte[] bytes, ExtraInfo extraInfo)` |
| `public static` | `void` | `clear(Store<ChunkStore> store, Ref<ChunkStore> section, int x, int y, int z)` |
| `public static` | `void` | `clear(Holder<ChunkStore> section, int x, int y, int z)` |
| `public static` | `void` | `reset(Store<ChunkStore> store, Ref<ChunkStore> section, int x, int y, int z)` |
| `public static` | `void` | `reset(Holder<ChunkStore> section, int x, int y, int z)` |
| `public static` | `void` | `markDeco(ComponentAccessor<ChunkStore> store, Ref<ChunkStore> section, int x, int y, int z)` |
| `public static` | `void` | `setSupportValue(Store<ChunkStore> store, Ref<ChunkStore> section, int x, int y, int z, int value)` |
| `public static` | `void` | `setSupportValue(Holder<ChunkStore> section, int x, int y, int z, int value)` |
