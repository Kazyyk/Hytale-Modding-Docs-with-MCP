# BaseHeightPositionProviderAsset

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.assets.positionproviders | Extends: PositionProviderAsset

public class BaseHeightPositionProviderAsset extends PositionProviderAsset

A position provider asset used in world generation to define placement positions.

## Fields

- private double minYRead
- private double maxYRead
- private String baseHeightName
- private PositionProviderAsset positionProviderAsset

## Methods

- @Override public PositionProvider build(@Nonnull PositionProviderAsset.Argument argument)
- return new BaseHeightPositionProvider(baseHeight, positionProvider, this.minYRead, this.maxYRead)
- @Override public void cleanUp()

Also in this package: AnchorPositionProviderAsset, Argument, BoundPositionProviderAsset, CachedPositionProviderAsset, ClustersPositionProviderAsset, DelimiterAsset, EmptyPositionProviderAsset, FieldFunctionOccurrencePositionProviderAsset, FieldFunctionPositionProviderAsset, FrameworkPositionProviderAsset, ImportedPositionProviderAsset, Jitter2dPositionProviderAsset, Jitter3dPositionProviderAsset, ListPositionProviderAsset, Mesh2DPositionProviderAsset, Mesh3DPositionProviderAsset, OffsetPositionProviderAsset, PositionAsset, PositionProviderAsset, ScalerPositionProviderAsset (and 5 more)

Complete API:
  public PositionProvider build(PositionProviderAsset.Argument argument)
  public void cleanUp()

Fields:
public static final BuilderCodec<BaseHeightPositionProviderAsset> CODEC
private double minYRead
private double maxYRead
private String baseHeightName
private PositionProviderAsset positionProviderAsset
