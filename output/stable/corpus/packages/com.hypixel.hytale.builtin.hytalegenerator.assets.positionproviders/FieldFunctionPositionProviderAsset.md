# FieldFunctionPositionProviderAsset

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.assets.positionproviders | Extends: PositionProviderAsset

public class FieldFunctionPositionProviderAsset extends PositionProviderAsset

A position provider asset used in world generation to define placement positions.

## Fields

- private FieldFunctionPositionProviderAsset.DelimiterAsset[] delimiterAssets
- private DensityAsset densityAsset
- private PositionProviderAsset positionProviderAsset
- private String id
- private AssetExtraInfo.Data data
- private double min
- private double max

## Methods

- @Override public PositionProvider build(@Nonnull PositionProviderAsset.Argument argument)
- @Override public void cleanUp()
- public String getId()

Also in this package: AnchorPositionProviderAsset, Argument, BaseHeightPositionProviderAsset, BoundPositionProviderAsset, CachedPositionProviderAsset, DelimiterAsset, FieldFunctionOccurrencePositionProviderAsset, FrameworkPositionProviderAsset, ImportedPositionProviderAsset, ListPositionProviderAsset, Mesh2DPositionProviderAsset, Mesh3DPositionProviderAsset, OffsetPositionProviderAsset, PositionAsset, PositionProviderAsset, SimpleHorizontalPositionProviderAsset, SpherePositionProviderAsset, UnionPositionProviderAsset

Complete API:
  public PositionProvider build(PositionProviderAsset.Argument argument)
  public void cleanUp()

Fields:
private static final FieldFunctionPositionProviderAsset.DelimiterAsset[] EMPTY_DELIMITER_ASSETS
public static final BuilderCodec<FieldFunctionPositionProviderAsset> CODEC
private FieldFunctionPositionProviderAsset.DelimiterAsset[] delimiterAssets
private DensityAsset densityAsset
private PositionProviderAsset positionProviderAsset
