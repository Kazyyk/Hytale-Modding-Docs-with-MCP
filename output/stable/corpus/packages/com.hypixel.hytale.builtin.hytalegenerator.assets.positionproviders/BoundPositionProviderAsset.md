# BoundPositionProviderAsset

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.assets.positionproviders | Extends: PositionProviderAsset

public class BoundPositionProviderAsset extends PositionProviderAsset

A position provider asset used in world generation to define placement positions.

## Fields

- private DecimalBounds3dAsset bounds
- private PositionProviderAsset positionProviderAsset

## Methods

- @Override public PositionProvider build(@Nonnull PositionProviderAsset.Argument argument)
- @Override public void cleanUp()

Also in this package: AnchorPositionProviderAsset, Argument, BaseHeightPositionProviderAsset, CachedPositionProviderAsset, DelimiterAsset, FieldFunctionOccurrencePositionProviderAsset, FieldFunctionPositionProviderAsset, FrameworkPositionProviderAsset, ImportedPositionProviderAsset, ListPositionProviderAsset, Mesh2DPositionProviderAsset, Mesh3DPositionProviderAsset, OffsetPositionProviderAsset, PositionAsset, PositionProviderAsset, SimpleHorizontalPositionProviderAsset, SpherePositionProviderAsset, UnionPositionProviderAsset

Complete API:
  public PositionProvider build(PositionProviderAsset.Argument argument)
  public void cleanUp()

Fields:
public static final BuilderCodec<BoundPositionProviderAsset> CODEC
private DecimalBounds3dAsset bounds
private PositionProviderAsset positionProviderAsset
