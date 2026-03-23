---
title: "BrushConfig"
kind: "class"
package: "com.hypixel.hytale.builtin.buildertools.scriptedbrushes"
fqcn: "com.hypixel.hytale.builtin.buildertools.scriptedbrushes.BrushConfig"
api_surface: false
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags:
  - "buildertools"
  - "brush"
---

**Package:** `com.hypixel.hytale.builtin.buildertools.scriptedbrushes`

```java
public class BrushConfig
```

Mutable configuration state for a scripted brush execution. Holds the brush shape, dimensions, origin with offset, block pattern, density, masks (brush mask, operation mask, history mask), and execution error state. Defaults to a sphere shape of width/height 5 with `Rock_Stone` pattern.

## Constructors

```java
public BrushConfig()
```

Creates a config with default values.

```java
public BrushConfig(@Nonnull BrushConfig other)
```

Copy constructor.

## Instance Methods

```java
public void beginExecution(Vector3i origin, boolean isHoldDownInteraction, InteractionType interactionType)
```

```java
public void endExecution()
```

```java
public void resetToDefaultValues()
```

```java
public boolean isHoldDownInteraction()
```

```java
public boolean isCurrentlyExecuting()
```

```java
public InteractionType getInteractionType()
```

```java
public Vector3i getOrigin()
```

Returns the origin with offset applied.

```java
public Vector3i getOriginOffset()
```

```java
public void setOriginOffset(Vector3i originOffset)
```

```java
public void modifyOriginOffset(@Nonnull Vector3i originOffsetOffset)
```

```java
public Random getRandom()
```

```java
public int getNextBlock()
```

```java
public Material getNextMaterial()
```

```java
public BlockMask getBlockMask()
```

```java
public void setOperationMask(BlockMask mask)
```

```java
public void appendOperationMask(BlockMask mask)
```

```java
public void clearOperationMask()
```

```java
public void setUseBrushMask(boolean useBrushMask)
```

```java
public void setUseOperationMask(boolean useOperationMask)
```

```java
public void setBrushMask(BlockMask mask)
```

```java
public int getDensity()
```

```java
public void setDensity(int density)
```

Clamped to [1, 100].

```java
public HistoryMask getHistoryMask()
```

```java
public void setHistoryMask(HistoryMask historyMask)
```

```java
public int getShapeWidth()
```

```java
public void setShapeWidth(int shapeWidth)
```

```java
public int getShapeHeight()
```

```java
public void setShapeHeight(int shapeHeight)
```

```java
public int getShapeThickness()
```

```java
public void setShapeThickness(int shapeThickness)
```

```java
public boolean isCapped()
```

```java
public void setCapped(boolean capped)
```

```java
public BrushShape getShape()
```

```java
public void setShape(BrushShape shape)
```

```java
public BlockPattern getPattern()
```

```java
public void setPattern(BlockPattern pattern)
```

```java
public void setErrorFlag(String errorMessage)
```

```java
public void clearError()
```

```java
public boolean isHasExecutionContextEncounteredError()
```

```java
public String getExecutionErrorMessage()
```

```java
public Vector3i getOriginAfterOffset()
```

```java
public String getInfo()
```

Returns a human-readable summary of the current brush configuration.

## Inner Enums

### BCExecutionStatus

```java
public static enum BCExecutionStatus
```

Values: `Continue`, `Error`, `Complete`.

### DataGettingFlags

```java
public static enum DataGettingFlags
```

Flags for extracting integer values from a config: `OffsetX`, `OffsetY`, `OffsetZ`, `Height`, `Width`, `Density`.

### DataSettingFlags

```java
public static enum DataSettingFlags
```

Flags for copying state between configs: `Offset`, `Shape`, `Dimensions`, `Thickness`, `Capped`, `Pattern`, `Density`, `BrushMask`, `OperationMask`, `HistoryMask`.

### HistoryMask

```java
public static enum HistoryMask
```

Values: `None`, `Only`, `Not`. Controls whether operations target only previously-modified blocks, only unmodified blocks, or all blocks.
