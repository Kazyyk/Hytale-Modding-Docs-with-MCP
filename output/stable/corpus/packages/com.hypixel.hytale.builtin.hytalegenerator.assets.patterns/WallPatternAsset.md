# WallPatternAsset

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.assets.patterns | Extends: PatternAsset

public class WallPatternAsset extends PatternAsset

## Fields

- private WallPattern.WallDirection[] directions
- private boolean matchAll

## Methods

- public Pattern build(@Nonnull PatternAsset.Argument argument)
- public void cleanUp()

Also in this package: AndPatternAsset, Argument, BlockSetPatternAsset, CeilingPatternAsset, ConstantPatternAsset, CuboidPatternAsset, DelimiterAsset, DensityPatternAsset, FloorPatternAsset, GapPatternAsset, ImportedPatternAsset, MaterialPatternAsset, NotPatternAsset, OffsetPatternAsset, OrPatternAsset, PatternAsset, SurfacePatternAsset

Complete API:
  public Pattern build(PatternAsset.Argument argument)
  public void cleanUp()

Fields:
public static final BuilderCodec<WallPatternAsset> CODEC
private PatternAsset wall
private PatternAsset origin
private WallPattern.WallDirection[] directions
private boolean matchAll
