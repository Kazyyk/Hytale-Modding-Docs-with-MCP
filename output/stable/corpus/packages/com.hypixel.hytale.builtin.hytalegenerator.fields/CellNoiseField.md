# CellNoiseField

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.fields.noise | Extends: NoiseField

public class CellNoiseField extends NoiseField

Cellular (Voronoi) noise field backed by FastNoiseLite. Produces cell-based noise patterns used in world generation for biome boundaries, terrain variation, and other cellular structures. Supports optional domain warping to distort the cell grid for more organic shapes.

The internal `FastNoiseLite` instance is configured with:
- Noise type: `Cellular`
- Fractal type: `FBm`
- Distance function: `Euclidean`
- Jitter is doubled internally from the constructor parameter

## Constructors

### With Domain Warp


public CellNoiseField(
    int seed,
    double scaleX,
    double scaleY,
    double scaleZ,
    double jitter,
    int octaves,
    @Nonnull FastNoiseLite.CellularReturnType cellType,
    @Nonnull FastNoiseLite.DomainWarpType domainWarpType,
    double warpAmount,
    double warpScale
)

Creates a cellular noise field with domain warping enabled.

- `seed` -- random seed for noise generation.
- `scaleX`, `scaleY`, `scaleZ` -- per-axis coordinate divisors. Input coordinates are divided by these values before evaluation.
- `jitter` -- cell point randomization amount (doubled internally).
- `octaves` -- number of fractal octaves. Must be >= 1.
- `cellType` -- the `FastNoiseLite.CellularReturnType` controlling what value is returned (e.g., `Distance`, `CellValue`).
- `domainWarpType` -- the warp algorithm type (note: the implementation always uses `OpenSimplex2` regardless of this parameter).
- `warpAmount` -- amplitude of the domain warp distortion. Must be > 0.
- `warpScale` -- scale of the warp noise; the warp frequency is computed as `1.0 / warpScale`. Must be > 0.

Throws `IllegalArgumentException` if `octaves < 1`, `warpAmount <= 0`, or `warpScale <= 0`.

### Without Domain Warp


public CellNoiseField(int seed, double scaleX, double scaleY, double scaleZ, double jitter, int octaves, @Nonnull FastNoiseLite.CellularReturnType cellType)

Creates a cellular noise field without domain warping.

- Parameters match the domain-warp constructor except warp-related parameters are omitted.
- `octaves` must be >= 1; throws `IllegalArgumentException` otherwise.

## Methods


public double valueAt(double x, double y, double z, double w)

Evaluates the cellular noise at a 4D coordinate. The `w` component is ignored; evaluation is performed in 3D. Coordinates are divided by `scaleX`, `scaleY`, `scaleZ`. If domain warp is enabled, a `FastNoiseLite.Vector3` is created, warped, and then sampled.


public double valueAt(double x, double y, double z)

Evaluates the cellular noise at a 3D coordinate. Coordinates are divided by `scaleX`, `scaleY`, `scaleZ`. Domain warp is applied if enabled.


public double valueAt(double x, double z)

Evaluates the cellular noise at a 2D coordinate. Coordinates are divided by `scaleX` and `scaleZ`. If domain warp is enabled, a `FastNoiseLite.Vector2` is created, warped, and then sampled.


public double valueAt(double x)

Evaluates the cellular noise at a 1D coordinate. The coordinate is divided by `scaleX`. Domain warp is not applied in 1D; the noise is sampled directly with `getNoise(x, 0.0)`.

## Fields

- cellNoise | FastNoiseLite | private | The underlying noise generator instance.
- seed | int | private | The seed passed to the constructor.
- doDomainWarp | boolean | private | Whether domain warping is active.
- scaleX | double | private | X-axis coordinate divisor.
- scaleY | double | private | Y-axis coordinate divisor.
- scaleZ | double | private | Z-axis coordinate divisor.

## See Also

- NoiseField -- abstract base class
- FastNoiseLite -- underlying noise library with cellular noise support
- SimplexNoiseField -- alternative noise field using simplex noise

Also in this package: Builder, Grad, NoiseField, Simplex, SimplexNoiseField

Complete API:
  public double valueAt(double x, double y, double z, double w)
  public double valueAt(double x, double y, double z)
  public double valueAt(double x, double z)
  public double valueAt(double x)

Fields:
private FastNoiseLite cellNoise
private int seed
private boolean doDomainWarp
private double scaleX
private double scaleY
private double scaleZ
