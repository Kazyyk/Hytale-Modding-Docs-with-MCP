---
title: "TurnOffTeleportersSystem"
kind: "class"
package: "com.hypixel.hytale.builtin.adventure.teleporter.system"
fqcn: "com.hypixel.hytale.builtin.adventure.teleporter.system.TurnOffTeleportersSystem"
api_surface: false
extends: "RefSystem<ChunkStore>"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T18:30:00Z"
tags:
  - "builtin"
  - "adventure"
  - "teleporter"
  - "system"
  - "class"
---

**Package:** `com.hypixel.hytale.builtin.adventure.teleporter.system`

```java
public class TurnOffTeleportersSystem extends RefSystem<ChunkStore>
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `public static final` | `Query<ChunkStore>` | `QUERY` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Override public` | `void` | `onEntityAdded(@Nonnull Ref<ChunkStore> ref, @Nonnull AddReason reason, @Nonnull Store<ChunkStore> store, @Nonnull CommandBuffer<ChunkStore> commandBuffer)` |
| `@Override public` | `void` | `onEntityRemove(@Nonnull Ref<ChunkStore> ref, @Nonnull RemoveReason reason, @Nonnull Store<ChunkStore> store, @Nonnull CommandBuffer<ChunkStore> commandBuffer)` |
| `public static` | `void` | `updatePortalBlocksInWorld(World world)` |
| `private static` | `void` | `updatePortalBlockInWorld(Ref<ChunkStore> ref, ComponentAccessor<ChunkStore> store)` |
| `public static` | `void` | `updatePortalBlockInWorld(ComponentAccessor<ChunkStore> store, Teleporter teleporter, BlockModule.BlockStateInfo blockStateInfo)` |
| `@NullableDecl @Override public` | `Query<ChunkStore>` | `getQuery()` |
