---
title: "SuppressionSpanHelper"
kind: "class"
package: "com.hypixel.hytale.server.spawning.suppression"
fqcn: "com.hypixel.hytale.server.spawning.suppression.SuppressionSpanHelper"
api_surface: false
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags: 
  - "spawning"
---

**Package:** `com.hypixel.hytale.server.spawning.suppression`

```java
public class SuppressionSpanHelper
```

Class in the suppression subsystem.

## Fields

| Field | Type | Description |
|---|---|---|
| `currentSpanIndex` | `int` | int field. |

## Methods

| Method | Return Type | Description |
|---|---|---|
| `optimiseSuppressedSpans(int roleIndex, @Nullable ChunkSuppressionEntry entry)` | `void` | public method. |
| `adjustSpawnRangeMin(int min)` | `int` | public method. |
| `adjustSpawnRangeMax(int min, int max)` | `int` | public method. |
| `reset()` | `void` | public method. |
| `allocateSpan(@Nonnull ArrayDeque<SuppressionSpanHelper.Span> spanPool)` | `SuppressionSpanHelper.Span` | static private method. |
