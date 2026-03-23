# SeedResourcePointGenerator

Type: class | Package: com.hypixel.hytale.procedurallib.json | Extends: PointGenerator

public class SeedResourcePointGenerator extends PointGenerator

A `PointGenerator` subclass that delegates thread-local buffer access to a `SeedResource` instance. Used by PointGeneratorJsonLoader to create point generators with correct buffer scoping.

## Constructor


public SeedResourcePointGenerator(int seedOffset, CellDistanceFunction cellDistanceFunction, PointEvaluator pointEvaluator, SeedResource seedResource)

## Overridden Methods

- localBounds2d() | ResultBuffer.Bounds2d | Delegates to `seedResource.localBounds2d()`.
- localBuffer2d() | ResultBuffer.ResultBuffer2d | Delegates to `seedResource.localBuffer2d()`.
- localBuffer3d() | ResultBuffer.ResultBuffer3d | Delegates to `seedResource.localBuffer3d()`.

## Related Types

- SeedResource -- provides the thread-local buffers
- PointGeneratorJsonLoader -- creates instances of this class
