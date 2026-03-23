# PatternDirectionalityAsset

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.assets.props.prefabprop.directionality | Extends: DirectionalityAsset

public class PatternDirectionalityAsset extends DirectionalityAsset

## Fields

- @Nonnull public static final BuilderCodec<PatternDirectionalityAsset> CODEC
- private String seed
- private OrthogonalDirection prefabDirection
- private PatternAsset northPatternAsset
- private PatternAsset southPatternAsset
- private PatternAsset eastPatternAsset
- private PatternAsset westPatternAsset

## Methods

- @Nonnull @Override public Directionality build(@Nonnull DirectionalityAsset.Argument argument)
- @Override public void cleanUp()

Also in this package: Argument, DirectionalityAsset, ImportedDirectionalityAsset, RandomDirectionalityAsset, StaticDirectionalityAsset

Complete API:
  public Directionality build(DirectionalityAsset.Argument argument)
  public void cleanUp()

Fields:
public static final BuilderCodec<PatternDirectionalityAsset> CODEC
private String seed
private OrthogonalDirection prefabDirection
private PatternAsset northPatternAsset
private PatternAsset southPatternAsset
private PatternAsset eastPatternAsset
private PatternAsset westPatternAsset
