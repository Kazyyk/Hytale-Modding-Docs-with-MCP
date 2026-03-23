# PipeCaveNodeShape

Type: class | Package: com.hypixel.hytale.server.worldgen.cave.shape | Extends: AbstractCaveNodeShape | Implements: IWorldBounds

public class PipeCaveNodeShape extends AbstractCaveNodeShape implements IWorldBounds

Cave node shape defined as a tubular pipe along a direction vector with start radius, end radius, and middle radius. Structurally similar to CylinderCaveNodeShape but uses a different collision model that tests the perpendicular distance from the axis without the height-radius-factor scaling in the same manner.

## Constructors


public PipeCaveNodeShape(CaveType caveType, @Nonnull Vector3d o, @Nonnull Vector3d v, double radius1, double radius2, double middleRadius)

## Instance Methods


public double getRadius2()

## Inner Classes

### PipeCaveNodeShapeGenerator


public static class PipeCaveNodeShapeGenerator implements CaveNodeShapeEnum.CaveNodeShapeGenerator

Factory creating `PipeCaveNodeShape` instances from randomized radius, middle radius, and length ranges with optional parent radius inheritance.
