# CylinderCaveNodeShape

Type: class | Package: com.hypixel.hytale.server.worldgen.cave.shape | Extends: AbstractCaveNodeShape | Implements: IWorldBounds

public class CylinderCaveNodeShape extends AbstractCaveNodeShape implements IWorldBounds

Cave node shape defined by a cylindrical volume along a direction vector with start radius, end radius, and a middle radius for interpolation. Block replacement is determined by projecting each point onto the cylinder axis and checking distance against the interpolated radius scaled by the cave type's height radius factor.

## Constructors


public CylinderCaveNodeShape(CaveType caveType, @Nonnull Vector3d o, @Nonnull Vector3d v, double radius1, double radius2, double middleRadius)

## Instance Methods


public double getRadius1()


public double getRadius2()

## Inner Classes

### CylinderCaveNodeShapeGenerator


public static class CylinderCaveNodeShapeGenerator implements CaveNodeShapeEnum.CaveNodeShapeGenerator

Factory that creates `CylinderCaveNodeShape` instances from randomized radius, middle radius, and length ranges. Supports inheriting the start radius from the parent node.
