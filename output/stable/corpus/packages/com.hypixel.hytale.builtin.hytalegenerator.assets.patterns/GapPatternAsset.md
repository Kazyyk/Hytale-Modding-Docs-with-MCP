# GapPatternAsset

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.assets.patterns | Extends: PatternAsset

public class GapPatternAsset extends PatternAsset

## Fields

- private double gapSize
- private double anchorSize
- private double anchorRoughness
- private int depthDown
- private int depthUp
- private Float[] angles

## Methods

- public Pattern build(@Nonnull PatternAsset.Argument argument)
- public void cleanUp()

Also in this package: AndPatternAsset, Argument, BlockSetPatternAsset, CeilingPatternAsset, ConstantPatternAsset, CuboidPatternAsset, DelimiterAsset, DensityPatternAsset, FloorPatternAsset, ImportedPatternAsset, MaterialPatternAsset, NotPatternAsset, OffsetPatternAsset, OrPatternAsset, PatternAsset, SurfacePatternAsset, WallPatternAsset

Complete API:
  public Pattern build(PatternAsset.Argument argument)
  public void cleanUp()

Fields:
public static final BuilderCodec<GapPatternAsset> CODEC
private PatternAsset gapPatternAsset
private PatternAsset anchorPatternAsset
private double gapSize
private double anchorSize
private double anchorRoughness
private int depthDown
private int depthUp
private Float[] angles
