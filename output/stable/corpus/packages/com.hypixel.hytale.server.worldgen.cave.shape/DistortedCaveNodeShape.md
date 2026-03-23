# DistortedCaveNodeShape

Type: class | Package: com.hypixel.hytale.server.worldgen.cave.shape | Implements: CaveNodeShape

public class DistortedCaveNodeShape implements CaveNodeShape

Cave node shape that wraps a `DistortedShape` with a `ShapeDistortion` to produce noise-modulated cave profiles. The distortion independently scales the floor and ceiling heights, creating organic, non-uniform cave cross-sections. Provides its own `populateChunk` implementation that pre-computes floor and ceiling per-column for efficiency.

## Constructors


public DistortedCaveNodeShape(CaveType caveType, DistortedShape shape, ShapeDistortion distortion)

## Instance Methods


public DistortedShape getShape()

## Inner Classes

### DistortedCaveNodeShapeGenerator


public static class DistortedCaveNodeShapeGenerator implements CaveNodeShapeEnum.CaveNodeShapeGenerator

Factory creating `DistortedCaveNodeShape` instances with configurable width, height, mid-width, mid-height, and length ranges plus a noise distortion profile. Supports parent radius inheritance and custom interpolation functions.
