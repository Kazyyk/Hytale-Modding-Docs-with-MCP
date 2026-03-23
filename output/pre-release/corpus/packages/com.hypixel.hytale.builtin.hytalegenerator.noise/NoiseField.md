# NoiseField

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.noise

public abstract class NoiseField

Abstract base class for noise field implementations. Provides per-axis scale factors and abstract `valueAt` methods for sampling noise at 1D through 4D coordinates.

## Fields

- protected double scaleX
- protected double scaleY
- protected double scaleZ
- protected double scaleW

## Methods

- public abstract double valueAt(double var1, double var3, double var5, double var7)
- public abstract double valueAt(double var1, double var3, double var5)
- public abstract double valueAt(double var1, double var3)
- public abstract double valueAt(double var1)
- @Nonnull public NoiseField setScale(double scaleX, double scaleY, double scaleZ, double scaleW)
- @Nonnull public NoiseField setScale(double scale)
