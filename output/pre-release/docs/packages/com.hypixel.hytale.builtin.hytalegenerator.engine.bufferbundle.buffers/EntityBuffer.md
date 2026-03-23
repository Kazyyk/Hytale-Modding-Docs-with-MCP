---
title: "EntityBuffer"
kind: "class"
package: "com.hypixel.hytale.builtin.hytalegenerator.engine.bufferbundle.buffers"
fqcn: "com.hypixel.hytale.builtin.hytalegenerator.engine.bufferbundle.buffers.EntityBuffer"
api_surface: false
extends: "Buffer"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-22T12:00:00Z"
tags:
  - "builtin"
  - "hytalegenerator"
  - "engine"
  - "bufferbundle"
  - "buffers"
  - "class"
---

**Package:** `com.hypixel.hytale.builtin.hytalegenerator.engine.bufferbundle.buffers`

```java
public class EntityBuffer extends Buffer
```

A [Buffer](Buffer.md) that stores a list of `EntityPlacementData` entries for entity spawning during world generation. The entity list is lazily initialized on first `addEntity` call. Supports copy-by-reference from another EntityBuffer via `copyFrom`, setting the `isReference` flag.

## Fields

| Modifier | Type | Name |
|---|---|---|
| `@Nullable private` | `List<EntityPlacementData>` | `entities` |
| `private` | `boolean` | `isReference` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `void` | `forEach(@Nonnull Consumer<EntityPlacementData> consumer)` |
| `public` | `void` | `addEntity(@Nonnull EntityPlacementData entityPlacementData)` |
| `@Nonnull @Override public` | `MemInstrument.Report` | `getMemoryUsage()` |
| `public` | `void` | `copyFrom(@Nonnull EntityBuffer sourceBuffer)` |
