# FieldFunctionOccurrencePositionProviderAsset

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.assets.positionproviders | Extends: PositionProviderAsset

public class FieldFunctionOccurrencePositionProviderAsset extends PositionProviderAsset

A position provider asset used in world generation to define placement positions.

## Fields

- private String seed
- private DensityAsset densityAsset
- private PositionProviderAsset positionProviderAsset

## Methods

- @Override public PositionProvider build(@Nonnull PositionProviderAsset.Argument argument)
- return new FieldFunctionOccurrencePositionProvider(functionTree, positionProvider, intSeed)
- @Override public void cleanUp()

Also in this package: AnchorPositionProviderAsset, Argument, BaseHeightPositionProviderAsset, BoundPositionProviderAsset, CachedPositionProviderAsset, DelimiterAsset, FieldFunctionPositionProviderAsset, FrameworkPositionProviderAsset, ImportedPositionProviderAsset, ListPositionProviderAsset, Mesh2DPositionProviderAsset, Mesh3DPositionProviderAsset, OffsetPositionProviderAsset, PositionAsset, PositionProviderAsset, SimpleHorizontalPositionProviderAsset, SpherePositionProviderAsset, UnionPositionProviderAsset

Complete API:
  public PositionProvider build(PositionProviderAsset.Argument argument)
  public void cleanUp()

Fields:
public static final BuilderCodec<FieldFunctionOccurrencePositionProviderAsset> CODEC
private String seed
private DensityAsset densityAsset
private PositionProviderAsset positionProviderAsset
