---
title: "ClipboardBoundsSnapshot"
kind: "class"
package: "com.hypixel.hytale.builtin.buildertools.snapshot"
fqcn: "com.hypixel.hytale.builtin.buildertools.snapshot.ClipboardBoundsSnapshot"
api_surface: false
extends: ~
implements: 
  - "ClipboardSnapshot<ClipboardBoundsSnapshot>"
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags: 
  - "builder-tools"
  - "snapshot"
---

**Package:** `com.hypixel.hytale.builtin.buildertools.snapshot`

```java
public class ClipboardBoundsSnapshot implements ClipboardSnapshot<ClipboardBoundsSnapshot>
```

Immutable snapshot capturing state for undo/redo in the builder tools system.

## Fields

| Field | Type | Description |
|---|---|---|
| `min` | `Vector3i` | final Vector3i field. |
| `max` | `Vector3i` | final Vector3i field. |

## Constructors

| Constructor | Description |
|---|---|
| `ClipboardBoundsSnapshot(@Nonnull BlockSelection selection)` | Creates a new ClipboardBoundsSnapshot instance. |
| `ClipboardBoundsSnapshot(Vector3i min, Vector3i max)` | Creates a new ClipboardBoundsSnapshot instance. |

## Methods

| Method | Return Type | Description |
|---|---|---|
| `getMin()` | `Vector3i` | public method. |
| `getMax()` | `Vector3i` | public method. |
