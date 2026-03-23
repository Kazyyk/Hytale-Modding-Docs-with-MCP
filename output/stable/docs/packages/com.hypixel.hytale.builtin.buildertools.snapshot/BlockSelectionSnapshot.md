---
title: "BlockSelectionSnapshot"
kind: "class"
package: "com.hypixel.hytale.builtin.buildertools.snapshot"
fqcn: "com.hypixel.hytale.builtin.buildertools.snapshot.BlockSelectionSnapshot"
api_surface: false
extends: ~
implements: 
  - "SelectionSnapshot<BlockSelectionSnapshot>"
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags: 
  - "builder-tools"
  - "snapshot"
---

**Package:** `com.hypixel.hytale.builtin.buildertools.snapshot`

```java
public class BlockSelectionSnapshot implements SelectionSnapshot<BlockSelectionSnapshot>
```

Immutable snapshot capturing state for undo/redo in the builder tools system.

## Fields

| Field | Type | Description |
|---|---|---|
| `selection` | `BlockSelection` | final BlockSelection field. |

## Constructors

| Constructor | Description |
|---|---|
| `BlockSelectionSnapshot(BlockSelection snapshot)` | Creates a new BlockSelectionSnapshot instance. |

## Methods

| Method | Return Type | Description |
|---|---|---|
| `getBlockSelection()` | `BlockSelection` | public method. |
| `restore(Ref<EntityStore> ref, Player player, @Nonnull World world, ComponentAccessor<EntityStore> componentAccessor)` | `BlockSelectionSnapshot` | public method. |
| `copyOf(@Nonnull BlockSelection selection)` | `BlockSelectionSnapshot` | static public method. |
