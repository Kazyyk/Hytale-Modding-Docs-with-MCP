---
title: "BrushConfigCommandExecutor"
kind: "class"
package: "com.hypixel.hytale.builtin.buildertools.scriptedbrushes"
fqcn: "com.hypixel.hytale.builtin.buildertools.scriptedbrushes.BrushConfigCommandExecutor"
api_surface: false
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags:
  - "buildertools"
  - "brush"
  - "execution"
---

**Package:** `com.hypixel.hytale.builtin.buildertools.scriptedbrushes`

```java
public class BrushConfigCommandExecutor
```

Executor that runs a sequence of `SequenceBrushOperation` and `GlobalBrushOperation` instances against a [BrushConfig](BrushConfig.md). Supports step-through debugging, breakpoints, persistent variables across executions, named operation index jumps, and brush config snapshot save/restore.

## Constructors

```java
public BrushConfigCommandExecutor(BrushConfig brushConfig)
```

## Instance Methods

```java
public void execute(@Nonnull Ref<EntityStore> ref, @Nonnull World world, @Nonnull Vector3i origin, boolean isHoldDownInteraction, @Nonnull InteractionType interactionType, @Nullable Consumer<BrushConfig> existingBrushDataLoadingConsumer, @Nonnull ComponentAccessor<EntityStore> componentAccessor)
```

Full execution entry point. Resets internal state, configures the brush, runs global operations, then iterates through sequential operations until completion or error.

```java
public void execute(@Nonnull Ref<EntityStore> ref, World world, Vector3i origin, boolean isHoldDownInteraction, InteractionType interactionType, ComponentAccessor<EntityStore> componentAccessor)
```

```java
public BrushConfig.BCExecutionStatus step(Ref<EntityStore> ref, boolean placePreviewAfterStep, ComponentAccessor<EntityStore> componentAccessor)
```

Executes the next sequential operation and returns the execution status.

```java
public void exitExecution(Ref<EntityStore> ref, ComponentAccessor<EntityStore> componentAccessor)
```

```java
public void storeOperatingIndex(String name, int index)
```

```java
public void loadOperatingIndex(String name)
```

```java
public void loadOperatingIndex(String name, boolean allowFutureJump)
```

```java
public void clearAllPersistentVariables()
```

```java
public void clearPersistentVariable(String variableName)
```

```java
public void setPersistentVariable(String variableName, int value)
```

```java
public int getPersistentVariableOrDefault(String variableName, int defaultValue)
```

```java
public void storeBrushConfigSnapshot(@Nonnull String name)
```

```java
public void loadBrushConfigSnapshot(String name, @Nonnull BrushConfig.DataSettingFlags... dataToLoad)
```

```java
public List<SequenceBrushOperation> getSequentialOperations()
```

```java
public Map<String, GlobalBrushOperation> getGlobalOperations()
```

```java
public boolean isIgnoreExistingBrushData()
```

```java
public boolean isInDebugSteppingMode()
```

```java
public BrushConfigEditStore getEdit()
```

```java
public void setInDebugSteppingMode(boolean inDebugSteppingMode)
```

```java
public void setPrintOperations(boolean printOperations)
```

```java
public void setIgnoreExistingBrushData(boolean ignoreExistingBrushData)
```

```java
public void setCurrentlyExecutingActionIndex(int newCurrentOperationIndex)
```

```java
public int getCurrentOperationIndex()
```

```java
public boolean isEnableBreakpoints()
```

```java
public void setEnableBreakpoints(boolean enableBreakpoints)
```

```java
public DebugOutputTarget getDebugOutputTarget()
```

```java
public void setDebugOutputTarget(DebugOutputTarget debugOutputTarget)
```

```java
public boolean isBreakOnError()
```

```java
public void setBreakOnError(boolean breakOnError)
```

## Inner Enums

### DebugOutputTarget

```java
public static enum DebugOutputTarget
```

Values: `Chat`, `Console`, `Both`.
