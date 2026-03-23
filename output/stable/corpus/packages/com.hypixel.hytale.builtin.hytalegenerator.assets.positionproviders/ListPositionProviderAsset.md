# ListPositionProviderAsset

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.assets.positionproviders | Extends: PositionProviderAsset

public class ListPositionProviderAsset extends PositionProviderAsset

A position provider asset used in world generation to define placement positions.

## Fields

- private ListPositionProviderAsset.PositionAsset[] positions
- private String id
- private AssetExtraInfo.Data data
- private int x
- private int y
- private int z

## Methods

- @Override public PositionProvider build(@Nonnull PositionProviderAsset.Argument argument)
- public String getId()

Also in this package: AnchorPositionProviderAsset, Argument, BaseHeightPositionProviderAsset, BoundPositionProviderAsset, CachedPositionProviderAsset, DelimiterAsset, FieldFunctionOccurrencePositionProviderAsset, FieldFunctionPositionProviderAsset, FrameworkPositionProviderAsset, ImportedPositionProviderAsset, Mesh2DPositionProviderAsset, Mesh3DPositionProviderAsset, OffsetPositionProviderAsset, PositionAsset, PositionProviderAsset, SimpleHorizontalPositionProviderAsset, SpherePositionProviderAsset, UnionPositionProviderAsset

Complete API:
  public PositionProvider build(PositionProviderAsset.Argument argument)

Fields:
public static final BuilderCodec<ListPositionProviderAsset> CODEC
private ListPositionProviderAsset.PositionAsset[] positions
