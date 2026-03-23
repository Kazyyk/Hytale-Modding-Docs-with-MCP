---
title: "BlockyAnimationCache"
kind: "class"
package: "com.hypixel.hytale.server.core.asset.common"
fqcn: "com.hypixel.hytale.server.core.asset.common.BlockyAnimationCache"
api_surface: false
extends: null
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "asset"
  - "common"
---

**Package:** `com.hypixel.hytale.server.core.asset.common`

```java
public class BlockyAnimationCache
```

Cache for blocky animation data parsed from common assets. Stores `BlockyAnimation` instances keyed by name, loading and decoding them on demand from `CommonAssetRegistry`. Supports both synchronous (`getNow`) and asynchronous (`get`) retrieval.

## Fields

| Modifier | Type | Name |
|---|---|---|
| `public static final` | `HytaleLogger` | `LOGGER` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nonnull public static` | `CompletableFuture<BlockyAnimation>` | `get(String name)` |
| `@Nonnull public static` | `CompletableFuture<BlockyAnimation>` | `get(@Nonnull CommonAsset asset)` |
| `@Nullable public static` | `BlockyAnimation` | `getNow(String name)` |
| `public static` | `BlockyAnimation` | `getNow(@Nonnull CommonAsset asset)` |
| `public static` | `void` | `invalidate(String name)` |

## Inner Classes

### BlockyAnimation

Static inner class representing a parsed blocky animation with duration.

| Modifier | Type | Name |
|---|---|---|
| `public static final` | `BuilderCodec<BlockyAnimation>` | `CODEC` |
| `public static final` | `double` | `FRAMES_PER_SECOND` |

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `int` | `getDurationFrames()` |
| `public` | `double` | `getDurationMillis()` |
| `public` | `double` | `getDurationSeconds()` |
