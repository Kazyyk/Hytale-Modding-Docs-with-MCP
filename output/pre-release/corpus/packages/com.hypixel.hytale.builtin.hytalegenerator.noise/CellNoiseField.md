# CellNoiseField

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.noise | Extends: NoiseField

public class CellNoiseField extends NoiseField

Cellular (Voronoi/Worley) noise field implementation backed by FastNoiseLite. Supports configurable cellular return types, fractal octaves, and optional domain warping. Coordinates are divided by per-axis scale factors before sampling.

## Fields

- private FastNoiseLite cellNoise
- private int seed
- private boolean doDomainWarp
- private double scaleX
- private double scaleY
- private double scaleZ

## Constructors

- CellNoiseField(int seed, double scaleX, double scaleY, double scaleZ, double jitter, int octaves, @Nonnull FastNoiseLite.CellularReturnType cellType, @Nonnull FastNoiseLite.DomainWarpType domainWarpType, double warpAmount, double warpScale)
- CellNoiseField(int seed, double scaleX, double scaleY, double scaleZ, double jitter, int octaves, @Nonnull FastNoiseLite.CellularReturnType cellType)

## Methods

- @Override public double valueAt(double x, double y, double z, double w)
- @Override public double valueAt(double x, double y, double z)
- @Override public double valueAt(double x, double z)
- @Override public double valueAt(double x)
