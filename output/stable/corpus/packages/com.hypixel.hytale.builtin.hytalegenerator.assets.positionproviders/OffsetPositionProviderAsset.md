# OffsetPositionProviderAsset

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.assets.positionproviders | Extends: PositionProviderAsset

public class OffsetPositionProviderAsset extends PositionProviderAsset

A position provider asset used in world generation to define placement positions.

## Fields

- private int offsetX
- private int offsetY
- private int offsetZ
- private PositionProviderAsset positionProviderAsset

## Methods

- @Override public PositionProvider build(@Nonnull PositionProviderAsset.Argument argument)
- @Override public void cleanUp()

Also in this package: AnchorPositionProviderAsset, Argument, BaseHeightPositionProviderAsset, BoundPositionProviderAsset, CachedPositionProviderAsset, DelimiterAsset, FieldFunctionOccurrencePositionProviderAsset, FieldFunctionPositionProviderAsset, FrameworkPositionProviderAsset, ImportedPositionProviderAsset, ListPositionProviderAsset, Mesh2DPositionProviderAsset, Mesh3DPositionProviderAsset, PositionAsset, PositionProviderAsset, SimpleHorizontalPositionProviderAsset, SpherePositionProviderAsset, UnionPositionProviderAsset

Complete API:
  public PositionProvider build(PositionProviderAsset.Argument argument)
  public void cleanUp()

Fields:
public static final BuilderCodec<OffsetPositionProviderAsset> CODEC
private int offsetX
private int offsetY
private int offsetZ
private PositionProviderAsset positionProviderAsset
