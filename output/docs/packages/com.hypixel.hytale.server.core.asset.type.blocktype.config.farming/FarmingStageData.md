---
title: "FarmingStageData"
kind: "class"
package: "com.hypixel.hytale.server.core.asset.type.blocktype.config.farming"
fqcn: "com.hypixel.hytale.server.core.asset.type.blocktype.config.farming.FarmingStageData"
api_surface: true
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T18:30:00Z"
tags:
  - "server"
  - "core"
  - "asset"
  - "type"
  - "blocktype"
  - "config"
  - "farming"
  - "class"
---

**Package:** `com.hypixel.hytale.server.core.asset.type.blocktype.config.farming`

```java
public abstract class FarmingStageData
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `@Nonnull public static` | `CodecMapCodec<FarmingStageData>` | `CODEC` |
| `protected` | `Rangef` | `duration` |
| `@Nullable protected` | `String` | `soundEventId` |
| `protected transient` | `int` | `soundEventIndex` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nullable public` | `Rangef` | `getDuration()` |
| `@Nullable public` | `String` | `getSoundEventId()` |
| `public` | `int` | `getSoundEventIndex()` |
| `public` | `boolean` | `implementsShouldStop()` |
| `public` | `boolean` | `shouldStop(@Nonnull ComponentAccessor<ChunkStore> commandBuffer, @Nonnull Ref<ChunkStore> sectionRef, @Nonnull Ref<ChunkStore> blockRef, int x, int y, int z)` |
| `public` | `void` | `apply(@Nonnull ComponentAccessor<ChunkStore> commandBuffer,
        @Nonnull Ref<ChunkStore> sectionRef,
        @Nonnull Ref<ChunkStore> blockRef,
        int x,
        int y,
        int z,
        @Nullable FarmingStageData previousStage)` |
| `public` | `void` | `remove(@Nonnull ComponentAccessor<ChunkStore> commandBuffer, @Nonnull Ref<ChunkStore> sectionRef, @Nonnull Ref<ChunkStore> blockRef, int x, int y, int z)` |
| `@Nonnull @Override public` | `String` | `toString()` |
