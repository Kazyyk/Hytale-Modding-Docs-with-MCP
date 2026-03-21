---
title: "BuilderToolsPlugin.BuilderState"
kind: "class"
package: "com.hypixel.hytale.builtin.buildertools"
fqcn: "com.hypixel.hytale.builtin.buildertools.BuilderToolsPlugin.BuilderState"
api_surface: false
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T00:00:00Z"
tags:
  - "buildertools"
  - "creative"
  - "per-player"
  - "selection"
  - "clipboard"
  - "undo-redo"
---

**Package:** `com.hypixel.hytale.builtin.buildertools`

```java
public static class BuilderState
```

Per-player state for the builder tools system. Each connected player with builder tool permissions gets a `BuilderState` that manages their block selection, clipboard, undo/redo history, task queue, global mask, and prefab browsing state. Stored in a `ConcurrentHashMap<UUID, BuilderState>` within [BuilderToolsPlugin](BuilderToolsPlugin.md).

## State Management

Builder states are created when a player first uses builder tools and retained after disconnect for a configurable duration (`toolExpireTime`). On reconnection, the existing state is re-attached (`retain()`), preserving the player's selection, clipboard, and history.

## Fields

| Field | Type | Description |
|---|---|---|
| `player` | `Player` | Current player entity reference. |
| `playerRef` | `PlayerRef` | Current player ref for packet sending. |
| `userData` | `BuilderToolsUserData` | Player's builder tools preferences. |
| `selection` | `BlockSelection` | Current clipboard/selection data. |
| `globalMask` | `BlockMask` | Global mask applied to all operations. |
| `undo` | `ObjectArrayFIFOQueue<ActionEntry>` | Undo history queue. |
| `redo` | `ObjectArrayFIFOQueue<ActionEntry>` | Redo history queue. |
| `tasks` | `ObjectArrayFIFOQueue<QueuedTask>` | Pending async operation queue. |
| `taskFuture` | `CompletableFuture<Void>` | Current task execution future. |
| `random` | `Random` | Per-player random (seed: `26061984`). |
| `activePrefabPath` | `UUID` | Currently active prefab path UUID. |
| `prefabListRoot` | `Path` | Root path for prefab browser. |
| `prefabListPath` | `Path` | Current path in prefab browser. |
| `prefabListSearchQuery` | `String` | Search query in prefab browser. |
| `timestamp` | `long` | Nanotime of state release for cleanup. |

## Task Queue

All editing operations are executed asynchronously via a task queue to ensure sequential execution on the world thread.

### addToQueue

```java
public <T extends Throwable> void addToQueue(
    @Nonnull ThrowableTriConsumer<Ref<EntityStore>, BuilderToolsPlugin.BuilderState, ComponentAccessor<EntityStore>, T> task
)
```

Enqueues a task for execution. If no task is currently running, starts execution immediately via `CompletableFuture.runAsync()` on the player's world executor. Protected by a `StampedLock`.

## Undo/Redo

Undo and redo are FIFO queues of [ActionEntry](BuilderToolsPlugin.ActionEntry.md) objects, each pairing an [Action](BuilderToolsPlugin.Action.md) type with snapshot data. Protected by a `StampedLock`.

### undo

Restores the most recent action entry, moves its inverse to the redo queue, and sends a notification to the player.

### redo

Restores the most recent redo entry, moves its inverse to the undo queue, and sends a notification.

### pushHistory

Adds an action entry to the undo queue and clears the redo queue. Enforces the `historyCount` limit by removing the oldest entry when full.

## Editing Operations

The `BuilderState` provides methods for all editing operations, each creating appropriate snapshots and pushing to undo history:

- **Selection:** `pos1()`, `pos2()`, `select()`, `update()`, `expand()`, `contract()`, `shift()`, `deselect()`
- **Block operations:** `set()`, `fill()`, `replace()`, `clear()`, `walls()`, `hollow()`, `layer()`, `submerge()`
- **Clipboard:** `copyOrCut()`, `paste()`, `rotate()`, `rotateArbitrary()`, `flip()`, `move()`, `stack()`
- **Brush tools:** `edit()` (brush use), `editLine()`, `extendFace()`
- **Transforms:** `transformThenPasteClipboard()`, `transformSelectionPoints()`
- **Environment:** `tint()`, `environment()`
- **Scripted brushes:** `placeBrushConfig()`, `flood()`
- **Smooth:** `smooth()` using a 3x3x3 weighted kernel

## Metrics

Exports metrics via `STATE_METRICS_REGISTRY`:
- UUID, Username, ActivePrefabPath, Selection, TaskFuture, TaskCount, UndoCount, RedoCount

## Inner Types

- [BlocksSampleData](BuilderToolsPlugin.BuilderState.BlocksSampleData.md) -- sample data for block majority calculations
- [SmoothSampleData](BuilderToolsPlugin.BuilderState.SmoothSampleData.md) -- sample data for smooth operations

## Related Types

- [BuilderToolsPlugin](BuilderToolsPlugin.md) -- enclosing class and singleton owner
- [BuilderToolsPlugin.ActionEntry](BuilderToolsPlugin.ActionEntry.md) -- undo/redo entries
- [BuilderToolsPlugin.QueuedTask](BuilderToolsPlugin.QueuedTask.md) -- task wrapper
- [PrototypePlayerBuilderToolSettings](PrototypePlayerBuilderToolSettings.md) -- companion per-player settings
- [EditOperation](EditOperation.md) -- block change tracking for brush operations
- [BuilderToolsUserData](BuilderToolsUserData.md) -- user preferences (selection history)
