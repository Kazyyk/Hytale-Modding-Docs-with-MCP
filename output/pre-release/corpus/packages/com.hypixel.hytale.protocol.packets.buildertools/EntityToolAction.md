# EntityToolAction

Type: enum | Package: com.hypixel.hytale.protocol.packets.buildertools

public enum EntityToolAction

Actions for the entity tool packet.

## Enum Constants

- Remove | 0
- Duplicate | 1
- Copy | 2

## Static Fields

- VALUES | EntityToolAction[] | Cached array of all enum constants

## Methods

- getValue() | int | Returns the integer value of this constant
- fromValue(int) | EntityToolAction | Returns the constant for the given value, throws `ProtocolException` if invalid

Also in this package: Axis, BrushAxis, BrushOrigin, BrushShape, BuilderToolAction, BuilderToolArg, BuilderToolArgType, BuilderToolArgUpdate, BuilderToolBlockArg, BuilderToolBoolArg, BuilderToolBrushAxisArg, BuilderToolBrushOriginArg, BuilderToolBrushShapeArg, BuilderToolEntityAction, BuilderToolExtrudeAction, BuilderToolFloatArg, BuilderToolGeneralAction, BuilderToolHideAnchors, BuilderToolIntArg, BuilderToolLaserPointer (and 28 more)

Complete API:
  public int getValue()
  public static EntityToolAction fromValue(int value)

Fields:
public static final EntityToolAction[] VALUES
private final int value
