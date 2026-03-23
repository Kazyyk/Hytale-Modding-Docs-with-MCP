# EllipsoidCaveNodeShape

Type: class | Package: com.hypixel.hytale.server.worldgen.cave.shape | Extends: AbstractCaveNodeShape | Implements: IWorldBounds

public class EllipsoidCaveNodeShape extends AbstractCaveNodeShape implements IWorldBounds

Cave node shape defined as an axis-aligned ellipsoid centered at an origin point with independent X, Y, and Z radii. Block replacement tests use the standard ellipsoid equation scaled by the cave type's height radius factor.

## Constructors


public EllipsoidCaveNodeShape(CaveType caveType, @Nonnull Vector3d o, double rx, double ry, double rz)

## Inner Classes

### EllipsoidCaveNodeShapeGenerator


public static class EllipsoidCaveNodeShapeGenerator implements CaveNodeShapeEnum.CaveNodeShapeGenerator

Factory creating `EllipsoidCaveNodeShape` instances from randomized X, Y, and Z radius ranges.
