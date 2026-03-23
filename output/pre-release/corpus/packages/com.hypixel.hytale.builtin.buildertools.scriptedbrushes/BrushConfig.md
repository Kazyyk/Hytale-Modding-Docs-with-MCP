# BrushConfig

Type: class | Package: com.hypixel.hytale.builtin.buildertools.scriptedbrushes

public class BrushConfig

Mutable configuration state for a scripted brush execution. Holds the brush shape, dimensions, origin with offset, block pattern, density, masks (brush mask, operation mask, history mask), and execution error state. Defaults to a sphere shape of width/height 5 with `Rock_Stone` pattern.

## Constructors


public BrushConfig()

Creates a config with default values.


public BrushConfig(@Nonnull BrushConfig other)

Copy constructor.

## Instance Methods


public void beginExecution(Vector3i origin, boolean isHoldDownInteraction, InteractionType interactionType)


public void endExecution()


public void resetToDefaultValues()


public boolean isHoldDownInteraction()


public boolean isCurrentlyExecuting()


public InteractionType getInteractionType()


public Vector3i getOrigin()

Returns the origin with offset applied.


public Vector3i getOriginOffset()


public void setOriginOffset(Vector3i originOffset)


public void modifyOriginOffset(@Nonnull Vector3i originOffsetOffset)


public Random getRandom()


public int getNextBlock()


public Material getNextMaterial()


public BlockMask getBlockMask()


public void setOperationMask(BlockMask mask)


public void appendOperationMask(BlockMask mask)


public void clearOperationMask()


public void setUseBrushMask(boolean useBrushMask)


public void setUseOperationMask(boolean useOperationMask)


public void setBrushMask(BlockMask mask)


public int getDensity()


public void setDensity(int density)

Clamped to [1, 100].


public HistoryMask getHistoryMask()


public void setHistoryMask(HistoryMask historyMask)


public int getShapeWidth()


public void setShapeWidth(int shapeWidth)


public int getShapeHeight()


public void setShapeHeight(int shapeHeight)


public int getShapeThickness()


public void setShapeThickness(int shapeThickness)


public boolean isCapped()


public void setCapped(boolean capped)


public BrushShape getShape()


public void setShape(BrushShape shape)


public BlockPattern getPattern()


public void setPattern(BlockPattern pattern)


public void setErrorFlag(String errorMessage)


public void clearError()


public boolean isHasExecutionContextEncounteredError()


public String getExecutionErrorMessage()


public Vector3i getOriginAfterOffset()


public String getInfo()

Returns a human-readable summary of the current brush configuration.

## Inner Enums

### BCExecutionStatus


public static enum BCExecutionStatus

Values: `Continue`, `Error`, `Complete`.

### DataGettingFlags


public static enum DataGettingFlags

Flags for extracting integer values from a config: `OffsetX`, `OffsetY`, `OffsetZ`, `Height`, `Width`, `Density`.

### DataSettingFlags


public static enum DataSettingFlags

Flags for copying state between configs: `Offset`, `Shape`, `Dimensions`, `Thickness`, `Capped`, `Pattern`, `Density`, `BrushMask`, `OperationMask`, `HistoryMask`.

### HistoryMask


public static enum HistoryMask

Values: `None`, `Only`, `Not`. Controls whether operations target only previously-modified blocks, only unmodified blocks, or all blocks.

Also in this package: BCExecutionStatus, BrushConfigChunkAccessor, BrushConfigCommandExecutor, BrushConfigEditStore, DataGettingFlags, DataSettingFlags, DebugOutputTarget, HistoryMask, ScriptedBrushAsset

Complete API:
  public void beginExecution(Vector3i origin, boolean isHoldDownInteraction, InteractionType interactionType)
  public void endExecution()
  public void resetToDefaultValues()
  public boolean isHoldDownInteraction()
  public boolean isCurrentlyExecuting()
  public InteractionType getInteractionType()
  public Vector3i getExecutionOrigin()
  public Vector3i getOrigin()
  public Vector3i getOriginOffset()
  public void setOriginOffset(Vector3i originOffset)
  public void modifyOriginOffset(Vector3i originOffsetOffset)
  public void updateOriginWithOffsets()
  public Random getRandom()
  public int getNextBlock()
  public Material getNextMaterial()
  public BlockMask getBlockMask()
  public void setOperationMask(BlockMask mask)
  public void appendOperationMask(BlockMask mask)
  public void clearOperationMask()
  public void setUseBrushMask(boolean useBrushMask)
  public void setUseOperationMask(boolean useOperationMask)
  public void setBrushMask(BlockMask mask)
  private void refreshCombinedMasks()
  public int getDensity()
  public void setDensity(int density)
  public BrushConfig.HistoryMask getHistoryMask()
  public void setHistoryMask(BrushConfig.HistoryMask historyMask)
  public int getShapeWidth()
  public void setShapeWidth(int shapeWidth)
  public int getShapeHeight()
  public void setShapeHeight(int shapeHeight)
  public int getShapeThickness()
  public void setShapeThickness(int shapeThickness)
  public Vector3i getTransformOrigin()
  public void setTransformOrigin(Vector3i transformOrigin)
  public Transform getTransform()
  public void setTransform(Transform transform)
  public void resetTransform()
  public boolean isCapped()
  public void setCapped(boolean capped)
  public BrushShape getShape()
  public void setShape(BrushShape shape)
  public BlockPattern getPattern()
  public void setPattern(BlockPattern pattern)
  public void setErrorFlag(String errorMessage)
  public void clearError()
  public boolean isHasExecutionContextEncounteredError()
  public String getExecutionErrorMessage()
  public Vector3i getOriginAfterOffset()
  public String toString()
  public String getInfo()

Fields:
private static final Random random
private InteractionType interactionType
private boolean isHoldDownInteraction
private Vector3i origin
private boolean isCurrentlyExecuting
private boolean hasExecutionContextEncounteredError
private String executionErrorMessage
private Vector3i originOffset
private Vector3i originAfterOffset
private Vector3i transformOrigin
private Transform transform
private BrushShape shape
private int shapeWidth
private int shapeHeight
private int shapeThickness
private boolean capped
private BlockPattern pattern
private int density
private boolean enableBrushMask
private BlockMask brushMask
private boolean enableOperationMask
private BlockMask operationMask
private BlockMask combinedMasks
private BrushConfig.HistoryMask historyMask
