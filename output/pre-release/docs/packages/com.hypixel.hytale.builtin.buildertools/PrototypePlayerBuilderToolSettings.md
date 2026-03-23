---
title: "PrototypePlayerBuilderToolSettings"
kind: "class"
package: "com.hypixel.hytale.builtin.buildertools"
fqcn: "com.hypixel.hytale.builtin.buildertools.PrototypePlayerBuilderToolSettings"
api_surface: false
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T00:00:00Z"
tags:
  - "buildertools"
  - "creative"
  - "per-player"
  - "clipboard"
  - "brush"
---

**Package:** `com.hypixel.hytale.builtin.buildertools`

```java
public class PrototypePlayerBuilderToolSettings
```

Per-player runtime settings for builder tool operations. Stores clipboard data for selection transform mode, scripted brush configuration, paint history for de-duplication, and miscellaneous tool state. Created and retrieved via `ToolOperation.getOrCreatePrototypeSettings(UUID)`.

## Constructor

```java
public PrototypePlayerBuilderToolSettings(UUID player)
```

Initializes the settings for the specified player UUID with a default `BrushConfig` and `BrushConfigCommandExecutor`.

## Selection Transform Mode

When the player enters selection transformation mode, clipboard data (blocks, fluids, entities) is cached here for repeated transform-and-paste operations without re-copying from the world.

### isInSelectionTransformationMode

```java
public boolean isInSelectionTransformationMode()
```

Returns `true` if the player is currently in selection transformation mode.

### setInSelectionTransformationMode

```java
public void setInSelectionTransformationMode(boolean inSelectionTransformationMode)
```

Enters or exits transformation mode. Exiting clears all cached clipboard data (`blockChanges`, `fluidChanges`, `entityChanges`, `blockChangeOffsetOrigin`).

### Clipboard Data Accessors

```java
public void setBlockChangesForPlaySelectionToolPasteMode(@Nullable BlockChange[] blockChangesForPlaySelectionToolPasteMode)
```

```java
@Nullable
public BlockChange[] getBlockChangesForPlaySelectionToolPasteMode()
```

```java
public void setFluidChangesForPlaySelectionToolPasteMode(@Nullable PrototypePlayerBuilderToolSettings.FluidChange[] fluidChanges)
```

```java
@Nullable
public PrototypePlayerBuilderToolSettings.FluidChange[] getFluidChangesForPlaySelectionToolPasteMode()
```

```java
public void setEntityChangesForPlaySelectionToolPasteMode(@Nullable PrototypePlayerBuilderToolSettings.EntityChange[] entityChanges)
```

```java
@Nullable
public PrototypePlayerBuilderToolSettings.EntityChange[] getEntityChangesForPlaySelectionToolPasteMode()
```

### Block Change Offset Origin

```java
public void setBlockChangeOffsetOrigin(@Nullable Vector3i blockChangeOffsetOrigin)
```

```java
@Nullable
public Vector3i getBlockChangeOffsetOrigin()
```

### Transform Entity References

```java
public void setLastTransformEntityRefs(@Nullable List<Ref<EntityStore>> refs)
```

```java
@Nullable
public List<Ref<EntityStore>> getLastTransformEntityRefs()
```

```java
public void clearLastTransformEntityRefs()
```

## Brush Configuration

```java
public BrushConfig getBrushConfig()
```

Returns the player's scripted brush configuration.

```java
public void setBrushConfig(BrushConfig brushConfig)
```

Replaces the brush configuration.

```java
public BrushConfigCommandExecutor getBrushConfigCommandExecutor()
```

Returns the executor for scripted brush operations.

```java
public String getCurrentlyLoadedBrushConfigName()
```

```java
public void setCurrentlyLoadedBrushConfigName(String currentlyLoadedBrushConfigName)
```

```java
public boolean isLoadingBrush()
```

```java
public void setLoadingBrush(boolean loadingBrush)
```

```java
public boolean usePrototypeBrushConfigurations()
```

```java
public void setUsePrototypeBrushConfigurations(boolean usePrototypeBrushConfigurations)
```

## Paint History (De-duplication)

Tracks which block positions have been painted in recent brush strokes to avoid re-painting the same position during hold-down operations.

### addIgnoredPaintOperation

```java
@Nonnull
public LongOpenHashSet addIgnoredPaintOperation()
```

Creates a new empty set of packed block positions for a paint operation and adds it to the history queue.

### containsLocation

```java
public boolean containsLocation(int x, int y, int z)
```

Returns `true` if the packed block position `(x, y, z)` exists in any active paint operation history set.

### getIgnoredPaintOperations

```java
@Nonnull
public LinkedList<LongOpenHashSet> getIgnoredPaintOperations()
```

Returns the full paint operation history queue.

### History Length

```java
public int getMaxLengthOfIgnoredPaintOperations()
```

```java
public void setMaxLengthOfIgnoredPaintOperations(int maxLengthOfIgnoredPaintOperations)
```

Sets the maximum number of paint operation history sets to retain. Excess entries are removed from the front (oldest first).

```java
public void clearHistoryUntilFitMaxLength()
```

Trims the paint history queue to the maximum length.

## Editor Settings

```java
public boolean isShouldShowEditorSettings()
```

```java
public void setShouldShowEditorSettings(boolean shouldShowEditorSettings)
```

## Brush Position

```java
@Nullable
public Vector3i getLastBrushPosition()
```

```java
public void setLastBrushPosition(@Nullable Vector3i lastBrushPosition)
```

```java
public void clearLastBrushPosition()
```

## Static Methods

### isOkayToDoCommandsOnSelection

```java
public static boolean isOkayToDoCommandsOnSelection(Ref<EntityStore> ref, @Nonnull Player player, ComponentAccessor<EntityStore> componentAccessor)
```

Returns `false` and sends a warning message if the player is currently in selection transformation mode. Used by commands to prevent conflicting operations. Retrieves the player's UUID from the `UUIDComponent` and checks `isInSelectionTransformationMode()`.

## Inner Types

- [EntityChange](PrototypePlayerBuilderToolSettings.EntityChange.md) -- record storing entity position and holder for clipboard transform
- [FluidChange](PrototypePlayerBuilderToolSettings.FluidChange.md) -- record storing fluid position, ID, and level for clipboard transform

## Related Types

- [BuilderToolsPlugin.BuilderState](BuilderToolsPlugin.BuilderState.md) -- the per-player builder state that works alongside these settings
- [BuilderToolsPacketHandler](BuilderToolsPacketHandler.md) -- reads and writes these settings during packet handling
