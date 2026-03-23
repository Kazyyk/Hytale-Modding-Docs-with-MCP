# BrushAxis

Type: enum | Package: com.hypixel.hytale.protocol.packets.buildertools

public enum BrushAxis

Brush axis selection for builder tool brush operations.

## Enum Constants

- None | 0
- Auto | 1
- X | 2
- Y | 3
- Z | 4

## Static Fields

- VALUES | BrushAxis[] | Cached array of all enum constants

## Methods

- getValue() | int | Returns the integer value of this constant
- fromValue(int) | BrushAxis | Returns the constant for the given value, throws `ProtocolException` if invalid

Also in this package: Axis, BrushOrigin, BrushShape, BuilderToolAction, BuilderToolArg, BuilderToolArgGroup, BuilderToolArgType, BuilderToolArgUpdate, BuilderToolBlockArg, BuilderToolBoolArg, BuilderToolBrushAxisArg, BuilderToolBrushData, BuilderToolBrushOriginArg, BuilderToolBrushShapeArg, BuilderToolEntityAction, BuilderToolExtrudeAction, BuilderToolFloatArg, BuilderToolGeneralAction, BuilderToolHideAnchors, BuilderToolIntArg (and 26 more)

Complete API:
  public int getValue()
  public static BrushAxis fromValue(int value)

Fields:
public static final BrushAxis[] VALUES
private final int value
