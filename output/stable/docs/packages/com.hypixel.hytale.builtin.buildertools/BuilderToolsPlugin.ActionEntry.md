---
title: "BuilderToolsPlugin.ActionEntry"
kind: "class"
package: "com.hypixel.hytale.builtin.buildertools"
fqcn: "com.hypixel.hytale.builtin.buildertools.BuilderToolsPlugin.ActionEntry"
api_surface: false
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T00:00:00Z"
tags:
  - "buildertools"
  - "creative"
  - "undo-redo"
---

**Package:** `com.hypixel.hytale.builtin.buildertools`

```java
public static class ActionEntry
```

Pairs an [Action](BuilderToolsPlugin.Action.md) type with a list of `SelectionSnapshot<?>` objects that can be restored for undo/redo. Stored in the undo and redo queues of [BuilderState](BuilderToolsPlugin.BuilderState.md).

## Constructors

```java
public ActionEntry(BuilderToolsPlugin.Action action, SelectionSnapshot<?> snapshots)
```

Creates an entry with a single snapshot (wrapped in a singleton list).

```java
public ActionEntry(BuilderToolsPlugin.Action action, List<SelectionSnapshot<?>> snapshots)
```

Creates an entry with multiple snapshots.

## Methods

### getAction

```java
public BuilderToolsPlugin.Action getAction()
```

Returns the action type.

### restore

```java
@Nonnull
public BuilderToolsPlugin.ActionEntry restore(Ref<EntityStore> ref, Player player, World world, ComponentAccessor<EntityStore> componentAccessor)
```

Restores all snapshots and returns a new `ActionEntry` containing the inverse snapshots (for re-doing the undo, or vice versa). Each snapshot's `restore()` produces a new snapshot representing the state before the restore.

For `ROTATE` actions, special handling removes entities from the previous rotation (via `EntityRemoveSnapshot`) before processing the remaining snapshots, and tracks newly created entity refs in [PrototypePlayerBuilderToolSettings](PrototypePlayerBuilderToolSettings.md) for future undo operations.

## Related Types

- [BuilderToolsPlugin.Action](BuilderToolsPlugin.Action.md) -- the action enum
- [BuilderToolsPlugin.BuilderState](BuilderToolsPlugin.BuilderState.md) -- stores entries in undo/redo queues
