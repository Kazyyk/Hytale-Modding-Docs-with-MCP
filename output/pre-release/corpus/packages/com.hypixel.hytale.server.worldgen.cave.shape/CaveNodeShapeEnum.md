# CaveNodeShapeEnum

Type: enum | Package: com.hypixel.hytale.server.worldgen.cave.shape

public enum CaveNodeShapeEnum

Enumeration of available cave node shape types: `PIPE`, `CYLINDER`, `PREFAB`, `EMPTY_LINE`, `ELLIPSOID`, `DISTORTED`.

## Values

- `PIPE` -- Tubular shape with start/end radii along a direction vector.
- `CYLINDER` -- Similar to pipe but with circular cross-section collision testing.
- `PREFAB` -- Shape defined by a placed prefab structure.
- `EMPTY_LINE` -- Invisible connector line with no block carving.
- `ELLIPSOID` -- Axis-aligned ellipsoidal chamber.
- `DISTORTED` -- Pipe-like shape with noise-based height/width distortion.

## Inner Interfaces

### CaveNodeShapeGenerator


public interface CaveNodeShapeGenerator

Factory interface that generates a CaveNodeShape instance from randomized parameters, parent node context, and orientation.


CaveNodeShape generateCaveNodeShape(Random var1, CaveType var2, CaveNode var3, CaveNodeType.CaveNodeChildEntry var4, Vector3d var5, float var6, float var7)

Also in this package: AbstractCaveNodeShape, CaveNodeShape, CaveNodeShapeGenerator, CaveNodeShapeUtils, CylinderCaveNodeShape, CylinderCaveNodeShapeGenerator, DistortedCaveNodeShape, DistortedCaveNodeShapeGenerator, EllipsoidCaveNodeShape, EllipsoidCaveNodeShapeGenerator, EmptyLineCaveNodeShape, EmptyLineCaveNodeShapeGenerator, PipeCaveNodeShape, PipeCaveNodeShapeGenerator, PrefabCaveNodeShape, PrefabCaveNodeShapeGenerator, TetrahedronCaveNodeShape, TetrahedronCaveNodeShapeGenerator
