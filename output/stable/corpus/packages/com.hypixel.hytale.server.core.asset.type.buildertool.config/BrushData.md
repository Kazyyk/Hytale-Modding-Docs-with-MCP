# BrushData

Type: class | Package: com.hypixel.hytale.server.core.asset.type.buildertool.config | Implements: NetworkSerializable<BuilderToolBrushData>

public class BrushData implements NetworkSerializable<BuilderToolBrushData>

Configuration data for builder tool brushes. Defines shape parameters (width, height, thickness, capped), spatial transforms (origin, rotation axis/angle, mirror axis), material selection with favorites, and mask filters (block, above, below, adjacent, neighbor, custom commands). Contains an inner `Values` class that holds resolved runtime brush values.

## Constants

- public static final int DEFAULT_WIDTH
- public static final int DEFAULT_HEIGHT
- public static final BrushData DEFAULT
- public static final int DEFAULT_FAVORITE_MATERIALS_CAPACITY
- public static final BuilderCodec<BrushData> CODEC

## Methods

- public IntArg getWidth()
- public IntArg getHeight()
- public IntArg getThickness()
- public BoolArg getCapped()
- public BrushShapeArg getShape()
- public BrushOriginArg getOrigin()
- public BoolArg getOriginRotation()
- public BrushAxisArg getRotationAxis()
- public BrushRotationArg getRotationAngle()
- public BrushAxisArg getMirrorAxis()
- public BlockArg getMaterial()
- public BlockArg[] getFavoriteMaterials()
- public MaskArg getMask()
- public MaskArg getMaskAbove()
- public MaskArg getMaskNot()
- public MaskArg getMaskBelow()
- public MaskArg getMaskAdjacent()
- public MaskArg getMaskNeighbor()
- public StringArg[] getMaskCommands()
- public BoolArg getUseMaskCommands()
- public BoolArg getInvertMask()
- public void updateArgValue(BrushData.Values brush, String id, String value)
- public BuilderToolBrushData toPacket()

## Inner Types

- BrushData.Values | class | Resolved runtime brush parameter values with codec support

Also in this package: ArgData, BlockTypeListAsset, BuilderTool, BuilderToolData, PrefabListAsset, PrefabReference, PrefabRootDirectory, Values

Complete API:
  public IntArg getWidth()
  public IntArg getHeight()
  public IntArg getThickness()
  public BoolArg getCapped()
  public BrushShapeArg getShape()
  public BrushOriginArg getOrigin()
  public BoolArg getOriginRotation()
  public BrushAxisArg getRotationAxis()
  public BrushRotationArg getRotationAngle()
  public BrushAxisArg getMirrorAxis()
  public BlockArg getMaterial()
  public BlockArg[] getFavoriteMaterials()
  public MaskArg getMask()
  public MaskArg getMaskAbove()
  public MaskArg getMaskNot()
  public MaskArg getMaskBelow()
  public MaskArg getMaskAdjacent()
  public MaskArg getMaskNeighbor()
  public StringArg[] getMaskCommands()
  public BoolArg getUseMaskCommands()
  public BoolArg getInvertMask()
  public void updateArgValue(BrushData.Values brush, String id, String value)
  public BuilderToolBrushData toPacket()
  public String toString()

Fields:
public static final String WIDTH_KEY
public static final String HEIGHT_KEY
public static final String SHAPE_KEY
public static final String THICKNESS_KEY
public static final String CAPPED_KEY
public static final String ORIGIN_KEY
public static final String ORIGIN_ROTATION_KEY
public static final String ROTATION_AXIS_KEY
public static final String ROTATION_ANGLE_KEY
public static final String MIRROR_AXIS_KEY
public static final String MATERIAL_KEY
public static final String FAVORITE_MATERIALS_KEY
public static final String MASK_KEY
public static final String MASK_ABOVE_KEY
public static final String MASK_NOT_KEY
public static final String MASK_BELOW_KEY
public static final String MASK_ADJACENT_KEY
public static final String MASK_NEIGHBOR_KEY
public static final String MASK_COMMANDS_KEY
public static final String USE_MASK_COMMANDS_KEY
public static final String INVERT_MASK_KEY
private static final String WIDTH_DOC
private static final String HEIGHT_DOC
private static final String THICKNESS_DOC
private static final String CAPPED_DOC
private static final String SHAPE_DOC
private static final String ORIGIN_DOC
private static final String ORIGIN_ROTATION_DOC
private static final String ROTATION_AXIS_DOC
private static final String ROTATION_ANGLE_DOC
private static final String MIRROR_AXIS_DOC
private static final String MATERIAL_DOC
private static final String FAVORITE_MATERIALS_DOC
private static final String MASK_DOC
private static final String MASK_ABOVE_DOC
private static final String MASK_NOT_DOC
private static final String MASK_BELOW_DOC
private static final String MASK_ADJACENT_DOC
private static final String MASK_NEIGHBOR_DOC
private static final String MASK_COMMANDS_DOC
private static final String USE_MASK_COMMANDS_DOC
private static final String INVERT_MASK_DOC
public static final int DEFAULT_WIDTH
public static final int DEFAULT_HEIGHT
public static final BrushData DEFAULT
public static final int DEFAULT_FAVORITE_MATERIALS_CAPACITY
private static final Pattern NEWLINES_PATTERN
public static final BuilderCodec<BrushData> CODEC
protected IntArg width
protected IntArg height
protected IntArg thickness
protected BoolArg capped
protected BrushShapeArg shape
protected BrushOriginArg origin
protected BoolArg originRotation
protected BrushAxisArg rotationAxis
protected BrushRotationArg rotationAngle
protected BrushAxisArg mirrorAxis
protected BlockArg material
protected BlockArg[] favoriteMaterials
protected MaskArg mask
protected MaskArg maskAbove
protected MaskArg maskNot
protected MaskArg maskBelow
protected MaskArg maskAdjacent
protected MaskArg maskNeighbor
protected StringArg[] maskCommands
protected BoolArg useMaskCommands
protected BoolArg invertMask
