---
title: "ChunkSuppressionEntry"
kind: "class"
package: "com.hypixel.hytale.server.spawning.suppression.component"
fqcn: "com.hypixel.hytale.server.spawning.suppression.component.ChunkSuppressionEntry"
api_surface: false
extends: ~
implements: 
  - "Component<ChunkStore>"
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags: 
  - "spawning"
  - "ecs"
---

**Package:** `com.hypixel.hytale.server.spawning.suppression.component`

```java
public class ChunkSuppressionEntry implements Component<ChunkStore>
```

Implementation of `Component<ChunkStore>`.

## Fields

| Field | Type | Description |
|---|---|---|
| `suppressionSpans` | `List<ChunkSuppressionEntry.SuppressionSpan>` | final List<ChunkSuppressionEntry.SuppressionSpan> field. |

## Constructors

| Constructor | Description |
|---|---|
| `ChunkSuppressionEntry(@Nonnull List<ChunkSuppressionEntry.SuppressionSpan> suppressionSpans)` | Creates a new ChunkSuppressionEntry instance. |

## Methods

| Method | Return Type | Description |
|---|---|---|
| `getComponentType()` | `ComponentType<ChunkStore, ChunkSuppressionEntry>` | static public method. |
| `getSuppressionSpans()` | `List<ChunkSuppressionEntry.SuppressionSpan>` | public method. |
| `containsOnly(UUID suppressorId)` | `boolean` | public method. |
| `isSuppressingRoleAt(int roleIndex, int yPosition)` | `boolean` | public method. |
| `clone()` | `Component<ChunkStore>` | public method. |
