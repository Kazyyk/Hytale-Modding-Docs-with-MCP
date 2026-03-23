# BrushShape

Type: enum | Package: com.hypixel.hytale.protocol.packets.buildertools

public enum BrushShape

Shape presets for builder tool brush operations.

## Enum Constants

- Cube | 0
- Sphere | 1
- Cylinder | 2
- Cone | 3
- InvertedCone | 4
- Pyramid | 5
- InvertedPyramid | 6
- Dome | 7
- InvertedDome | 8
- Diamond | 9
- Torus | 10

## Static Fields

- VALUES | BrushShape[] | Cached array of all enum constants

## Methods

- getValue() | int | Returns the integer value of this constant
- fromValue(int) | BrushShape | Returns the constant for the given value, throws `ProtocolException` if invalid

Also in this package: Axis, BrushAxis, BrushOrigin, BuilderToolAction, BuilderToolArg, BuilderToolArgType, BuilderToolArgUpdate, BuilderToolBlockArg, BuilderToolBoolArg, BuilderToolBrushAxisArg, BuilderToolBrushOriginArg, BuilderToolBrushShapeArg, BuilderToolEntityAction, BuilderToolExtrudeAction, BuilderToolFloatArg, BuilderToolGeneralAction, BuilderToolHideAnchors, BuilderToolIntArg, BuilderToolLaserPointer, BuilderToolLineAction (and 28 more)

Complete API:
  public int getValue()
  public static BrushShape fromValue(int value)

Fields:
public static final BrushShape[] VALUES
private final int value
