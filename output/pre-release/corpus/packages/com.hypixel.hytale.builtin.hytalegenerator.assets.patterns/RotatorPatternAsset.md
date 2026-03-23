# RotatorPatternAsset

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.assets.patterns | Extends: PatternAsset

public class RotatorPatternAsset extends PatternAsset

Pattern asset that applies rotation to block placement patterns. Used by the world generator to create rotated variants of block arrangements.

Also in this package: AndPatternAsset, Argument, BlockSetPatternAsset, CeilingPatternAsset, ConstantPatternAsset, CuboidPatternAsset, DelimiterAsset, DensityPatternAsset, FloorPatternAsset, ImportedPatternAsset, MaterialPatternAsset, NotPatternAsset, OffsetPatternAsset, OrPatternAsset, PatternAsset, SurfacePatternAsset, WallPatternAsset

Complete API:
  public Pattern build(PatternAsset.Argument argument)
  public void cleanUp()

Fields:
public static final BuilderCodec<RotatorPatternAsset> CODEC
private PatternAsset patternAsset
private OrthogonalRotationAsset rotationAsset
