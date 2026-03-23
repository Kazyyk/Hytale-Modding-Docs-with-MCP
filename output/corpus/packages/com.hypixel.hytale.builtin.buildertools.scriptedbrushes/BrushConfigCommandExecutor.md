# BrushConfigCommandExecutor

Type: class | Package: com.hypixel.hytale.builtin.buildertools.scriptedbrushes

public class BrushConfigCommandExecutor

Executor that runs a sequence of `SequenceBrushOperation` and `GlobalBrushOperation` instances against a BrushConfig. Supports step-through debugging, breakpoints, persistent variables across executions, named operation index jumps, and brush config snapshot save/restore.

## Constructors


public BrushConfigCommandExecutor(BrushConfig brushConfig)

## Instance Methods


public void execute(@Nonnull Ref<EntityStore> ref, @Nonnull World world, @Nonnull Vector3i origin, boolean isHoldDownInteraction, @Nonnull InteractionType interactionType, @Nullable Consumer<BrushConfig> existingBrushDataLoadingConsumer, @Nonnull ComponentAccessor<EntityStore> componentAccessor)

Full execution entry point. Resets internal state, configures the brush, runs global operations, then iterates through sequential operations until completion or error.


public void execute(@Nonnull Ref<EntityStore> ref, World world, Vector3i origin, boolean isHoldDownInteraction, InteractionType interactionType, ComponentAccessor<EntityStore> componentAccessor)


public BrushConfig.BCExecutionStatus step(Ref<EntityStore> ref, boolean placePreviewAfterStep, ComponentAccessor<EntityStore> componentAccessor)

Executes the next sequential operation and returns the execution status.


public void exitExecution(Ref<EntityStore> ref, ComponentAccessor<EntityStore> componentAccessor)


public void storeOperatingIndex(String name, int index)


public void loadOperatingIndex(String name)


public void loadOperatingIndex(String name, boolean allowFutureJump)


public void clearAllPersistentVariables()


public void clearPersistentVariable(String variableName)


public void setPersistentVariable(String variableName, int value)


public int getPersistentVariableOrDefault(String variableName, int defaultValue)


public void storeBrushConfigSnapshot(@Nonnull String name)


public void loadBrushConfigSnapshot(String name, @Nonnull BrushConfig.DataSettingFlags... dataToLoad)


public List<SequenceBrushOperation> getSequentialOperations()


public Map<String, GlobalBrushOperation> getGlobalOperations()


public boolean isIgnoreExistingBrushData()


public boolean isInDebugSteppingMode()


public BrushConfigEditStore getEdit()


public void setInDebugSteppingMode(boolean inDebugSteppingMode)


public void setPrintOperations(boolean printOperations)


public void setIgnoreExistingBrushData(boolean ignoreExistingBrushData)


public void setCurrentlyExecutingActionIndex(int newCurrentOperationIndex)


public int getCurrentOperationIndex()


public boolean isEnableBreakpoints()


public void setEnableBreakpoints(boolean enableBreakpoints)


public DebugOutputTarget getDebugOutputTarget()


public void setDebugOutputTarget(DebugOutputTarget debugOutputTarget)


public boolean isBreakOnError()


public void setBreakOnError(boolean breakOnError)

## Inner Enums

### DebugOutputTarget


public static enum DebugOutputTarget

Values: `Chat`, `Console`, `Both`.
