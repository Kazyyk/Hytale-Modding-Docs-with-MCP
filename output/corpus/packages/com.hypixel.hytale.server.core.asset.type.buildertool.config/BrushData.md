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
