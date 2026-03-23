# BrushOrigin

Type: enum | Package: com.hypixel.hytale.protocol.packets.buildertools

public enum BrushOrigin

Origin point for brush placement in builder tools.

## Enum Constants

- Center | 0
- Bottom | 1
- Top | 2

## Static Fields

- VALUES | BrushOrigin[] | Cached array of all enum constants

## Methods

- getValue() | int | Returns the integer value of this constant
- fromValue(int) | BrushOrigin | Returns the constant for the given value, throws `ProtocolException` if invalid

Also in this package: Axis, BrushAxis, BrushShape, BuilderToolAction, BuilderToolArg, BuilderToolArgType, BuilderToolArgUpdate, BuilderToolBlockArg, BuilderToolBoolArg, BuilderToolBrushAxisArg, BuilderToolBrushOriginArg, BuilderToolBrushShapeArg, BuilderToolEntityAction, BuilderToolExtrudeAction, BuilderToolFloatArg, BuilderToolGeneralAction, BuilderToolHideAnchors, BuilderToolIntArg, BuilderToolLaserPointer, BuilderToolLineAction (and 28 more)

Complete API:
  public int getValue()
  public static BrushOrigin fromValue(int value)

Fields:
public static final BrushOrigin[] VALUES
private final int value
