# EmptyLineCaveNodeShape

Type: class | Package: com.hypixel.hytale.server.worldgen.cave.shape | Extends: AbstractCaveNodeShape | Implements: IWorldBounds

public class EmptyLineCaveNodeShape extends AbstractCaveNodeShape implements IWorldBounds

Invisible cave node shape that defines a line segment without carving any blocks. Used as a connector between cave nodes to provide anchor points for child node attachment. `shouldReplace` always returns false; `hasGeometry` returns false. All bounds return 0.

## Constructors


public EmptyLineCaveNodeShape(Vector3d o, Vector3d v)

## Inner Classes

### EmptyLineCaveNodeShapeGenerator


public static class EmptyLineCaveNodeShapeGenerator implements CaveNodeShapeEnum.CaveNodeShapeGenerator

Factory creating `EmptyLineCaveNodeShape` instances from a randomized length range.
