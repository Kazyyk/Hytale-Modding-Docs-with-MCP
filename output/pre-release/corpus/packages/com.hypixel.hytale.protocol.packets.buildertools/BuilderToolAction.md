# BuilderToolAction

Type: enum | Package: com.hypixel.hytale.protocol.packets.buildertools

public enum BuilderToolAction

Actions available for the general builder tool packet.

## Enum Constants

- SelectionPosition1 | 0
- SelectionPosition2 | 1
- SelectionCopy | 2
- HistoryUndo | 3
- HistoryRedo | 4
- ActivateToolMode | 5
- DeactivateToolMode | 6

## Static Fields

- VALUES | BuilderToolAction[] | Cached array of all enum constants

## Methods

- getValue() | int | Returns the integer value of this constant
- fromValue(int) | BuilderToolAction | Returns the constant for the given value, throws `ProtocolException` if invalid

Also in this package: Axis, BrushAxis, BrushOrigin, BrushShape, BuilderToolArg, BuilderToolArgType, BuilderToolArgUpdate, BuilderToolBlockArg, BuilderToolBoolArg, BuilderToolBrushAxisArg, BuilderToolBrushOriginArg, BuilderToolBrushShapeArg, BuilderToolEntityAction, BuilderToolExtrudeAction, BuilderToolFloatArg, BuilderToolGeneralAction, BuilderToolHideAnchors, BuilderToolIntArg, BuilderToolLaserPointer, BuilderToolLineAction (and 28 more)

Complete API:
  public int getValue()
  public static BuilderToolAction fromValue(int value)

Fields:
public static final BuilderToolAction[] VALUES
private final int value
