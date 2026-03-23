---
title: "ClipboardContentsSnapshot"
kind: "class"
package: "com.hypixel.hytale.builtin.buildertools.snapshot"
fqcn: "com.hypixel.hytale.builtin.buildertools.snapshot.ClipboardContentsSnapshot"
api_surface: false
extends: ~
implements: 
  - "ClipboardSnapshot<ClipboardContentsSnapshot>"
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags: 
  - "builder-tools"
  - "snapshot"
---

**Package:** `com.hypixel.hytale.builtin.buildertools.snapshot`

```java
public class ClipboardContentsSnapshot implements ClipboardSnapshot<ClipboardContentsSnapshot>
```

Immutable snapshot capturing state for undo/redo in the builder tools system.

## Fields

| Field | Type | Description |
|---|---|---|
| `selection` | `BlockSelection` | final BlockSelection field. |

## Constructors

| Constructor | Description |
|---|---|
| `ClipboardContentsSnapshot(BlockSelection selection)` | Creates a new ClipboardContentsSnapshot instance. |

## Methods

| Method | Return Type | Description |
|---|---|---|
| `copyOf(@Nonnull BlockSelection selection)` | `ClipboardContentsSnapshot` | static public method. |
