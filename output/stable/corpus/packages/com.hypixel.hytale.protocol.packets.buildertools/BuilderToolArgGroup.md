# BuilderToolArgGroup

Type: enum | Package: com.hypixel.hytale.protocol.packets.buildertools

public enum BuilderToolArgGroup

Groups for builder tool arguments.

## Enum Constants

- Tool | 0
- Brush | 1

## Static Fields

- VALUES | BuilderToolArgGroup[] | Cached array of all enum constants

## Methods

- getValue() | int | Returns the integer value of this constant
- fromValue(int) | BuilderToolArgGroup | Returns the constant for the given value, throws `ProtocolException` if invalid

Also in this package: Axis, BrushAxis, BrushOrigin, BrushShape, BuilderToolAction, BuilderToolArg, BuilderToolArgType, BuilderToolArgUpdate, BuilderToolBlockArg, BuilderToolBoolArg, BuilderToolBrushAxisArg, BuilderToolBrushData, BuilderToolBrushOriginArg, BuilderToolBrushShapeArg, BuilderToolEntityAction, BuilderToolExtrudeAction, BuilderToolFloatArg, BuilderToolGeneralAction, BuilderToolHideAnchors, BuilderToolIntArg (and 26 more)

Complete API:
  public int getValue()
  public static BuilderToolArgGroup fromValue(int value)

Fields:
public static final BuilderToolArgGroup[] VALUES
private final int value
