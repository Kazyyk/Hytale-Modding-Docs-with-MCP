# SurfacePatternAsset

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.assets.patterns | Extends: PatternAsset

public class SurfacePatternAsset extends PatternAsset

## Fields

- private double surfaceRadius
- private double originRadius
- private int surfaceGap
- private int originGap
- private SurfacePattern.Facing[] facings
- private boolean requireAllFacings

## Methods

- public Pattern build(@Nonnull PatternAsset.Argument argument)
- public void cleanUp()

Also in this package: AndPatternAsset, Argument, BlockSetPatternAsset, CeilingPatternAsset, ConstantPatternAsset, CuboidPatternAsset, DelimiterAsset, DensityPatternAsset, FloorPatternAsset, GapPatternAsset, ImportedPatternAsset, MaterialPatternAsset, NotPatternAsset, OffsetPatternAsset, OrPatternAsset, PatternAsset, WallPatternAsset

Complete API:
  public Pattern build(PatternAsset.Argument argument)
  public void cleanUp()

Fields:
public static final BuilderCodec<SurfacePatternAsset> CODEC
private PatternAsset surface
private PatternAsset origin
private double surfaceRadius
private double originRadius
private int surfaceGap
private int originGap
private SurfacePattern.Facing[] facings
private boolean requireAllFacings
