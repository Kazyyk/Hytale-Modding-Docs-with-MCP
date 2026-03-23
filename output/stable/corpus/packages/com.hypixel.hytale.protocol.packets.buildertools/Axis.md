# Axis

Type: enum | Package: com.hypixel.hytale.protocol.packets.buildertools

public enum Axis

Axis enum representing the three spatial dimensions.

## Enum Constants

- X | 0
- Y | 1
- Z | 2

## Static Fields

- VALUES | Axis[] | Cached array of all enum constants

## Methods

- getValue() | int | Returns the integer value of this constant
- fromValue(int) | Axis | Returns the constant for the given value, throws `ProtocolException` if invalid

Also in this package: BrushAxis, BrushOrigin, BrushShape, BuilderToolAction, BuilderToolArg, BuilderToolArgGroup, BuilderToolArgType, BuilderToolArgUpdate, BuilderToolBlockArg, BuilderToolBoolArg, BuilderToolBrushAxisArg, BuilderToolBrushData, BuilderToolBrushOriginArg, BuilderToolBrushShapeArg, BuilderToolEntityAction, BuilderToolExtrudeAction, BuilderToolFloatArg, BuilderToolGeneralAction, BuilderToolHideAnchors, BuilderToolIntArg (and 26 more)

Complete API:
  public int getValue()
  public static Axis fromValue(int value)

Fields:
public static final Axis[] VALUES
private final int value
