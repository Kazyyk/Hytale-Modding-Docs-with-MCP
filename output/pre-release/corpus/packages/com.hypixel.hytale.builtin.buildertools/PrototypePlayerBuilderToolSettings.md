# PrototypePlayerBuilderToolSettings

Type: class | Package: com.hypixel.hytale.builtin.buildertools

public class PrototypePlayerBuilderToolSettings

Per-player runtime settings for builder tool operations. Stores clipboard data for selection transform mode, scripted brush configuration, paint history for de-duplication, and miscellaneous tool state. Created and retrieved via `ToolOperation.getOrCreatePrototypeSettings(UUID)`.

## Constructor


public PrototypePlayerBuilderToolSettings(UUID player)

Initializes the settings for the specified player UUID with a default `BrushConfig` and `BrushConfigCommandExecutor`.

## Selection Transform Mode

When the player enters selection transformation mode, clipboard data (blocks, fluids, entities) is cached here for repeated transform-and-paste operations without re-copying from the world.

### isInSelectionTransformationMode


public boolean isInSelectionTransformationMode()

Returns `true` if the player is currently in selection transformation mode.

### setInSelectionTransformationMode


public void setInSelectionTransformationMode(boolean inSelectionTransformationMode)

Enters or exits transformation mode. Exiting clears all cached clipboard data (`blockChanges`, `fluidChanges`, `entityChanges`, `blockChangeOffsetOrigin`).

### Clipboard Data Accessors


public void setBlockChangesForPlaySelectionToolPasteMode(@Nullable BlockChange[] blockChangesForPlaySelectionToolPasteMode)


@Nullable
public BlockChange[] getBlockChangesForPlaySelectionToolPasteMode()


public void setFluidChangesForPlaySelectionToolPasteMode(@Nullable PrototypePlayerBuilderToolSettings.FluidChange[] fluidChanges)


@Nullable
public PrototypePlayerBuilderToolSettings.FluidChange[] getFluidChangesForPlaySelectionToolPasteMode()


public void setEntityChangesForPlaySelectionToolPasteMode(@Nullable PrototypePlayerBuilderToolSettings.EntityChange[] entityChanges)


@Nullable
public PrototypePlayerBuilderToolSettings.EntityChange[] getEntityChangesForPlaySelectionToolPasteMode()

### Block Change Offset Origin


public void setBlockChangeOffsetOrigin(@Nullable Vector3i blockChangeOffsetOrigin)


@Nullable
public Vector3i getBlockChangeOffsetOrigin()

### Transform Entity References


public void setLastTransformEntityRefs(@Nullable List<Ref<EntityStore>> refs)


@Nullable
public List<Ref<EntityStore>> getLastTransformEntityRefs()


public void clearLastTransformEntityRefs()

## Brush Configuration


public BrushConfig getBrushConfig()

Returns the player's scripted brush configuration.


public void setBrushConfig(BrushConfig brushConfig)

Replaces the brush configuration.


public BrushConfigCommandExecutor getBrushConfigCommandExecutor()

Returns the executor for scripted brush operations.


public String getCurrentlyLoadedBrushConfigName()


public void setCurrentlyLoadedBrushConfigName(String currentlyLoadedBrushConfigName)


public boolean isLoadingBrush()


public void setLoadingBrush(boolean loadingBrush)


public boolean usePrototypeBrushConfigurations()


public void setUsePrototypeBrushConfigurations(boolean usePrototypeBrushConfigurations)

## Paint History (De-duplication)

Tracks which block positions have been painted in recent brush strokes to avoid re-painting the same position during hold-down operations.

### addIgnoredPaintOperation


@Nonnull
public LongOpenHashSet addIgnoredPaintOperation()

Creates a new empty set of packed block positions for a paint operation and adds it to the history queue.

### containsLocation


public boolean containsLocation(int x, int y, int z)

Returns `true` if the packed block position `(x, y, z)` exists in any active paint operation history set.

### getIgnoredPaintOperations


@Nonnull
public LinkedList<LongOpenHashSet> getIgnoredPaintOperations()

Returns the full paint operation history queue.

### History Length


public int getMaxLengthOfIgnoredPaintOperations()


public void setMaxLengthOfIgnoredPaintOperations(int maxLengthOfIgnoredPaintOperations)

Sets the maximum number of paint operation history sets to retain. Excess entries are removed from the front (oldest first).


public void clearHistoryUntilFitMaxLength()

Trims the paint history queue to the maximum length.

## Editor Settings


public boolean isShouldShowEditorSettings()


public void setShouldShowEditorSettings(boolean shouldShowEditorSettings)

## Brush Position


@Nullable
public Vector3i getLastBrushPosition()


public void setLastBrushPosition(@Nullable Vector3i lastBrushPosition)


public void clearLastBrushPosition()

## Static Methods

### isOkayToDoCommandsOnSelection


public static boolean isOkayToDoCommandsOnSelection(Ref<EntityStore> ref, @Nonnull Player player, ComponentAccessor<EntityStore> componentAccessor)

Returns `false` and sends a warning message if the player is currently in selection transformation mode. Used by commands to prevent conflicting operations. Retrieves the player's UUID from the `UUIDComponent` and checks `isInSelectionTransformationMode()`.

## Inner Types

- EntityChange -- record storing entity position and holder for clipboard transform
- FluidChange -- record storing fluid position, ID, and level for clipboard transform

## Related Types

- BuilderToolsPlugin.BuilderState -- the per-player builder state that works alongside these settings
- BuilderToolsPacketHandler -- reads and writes these settings during packet handling
