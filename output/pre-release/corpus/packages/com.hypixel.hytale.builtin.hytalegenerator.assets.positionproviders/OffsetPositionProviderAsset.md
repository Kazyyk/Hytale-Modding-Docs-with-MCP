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

Also in this package: AnchorPositionProviderAsset, Argument, BaseHeightPositionProviderAsset, BoundPositionProviderAsset, CachedPositionProviderAsset, ClustersPositionProviderAsset, DelimiterAsset, EmptyPositionProviderAsset, FieldFunctionOccurrencePositionProviderAsset, FieldFunctionPositionProviderAsset, FrameworkPositionProviderAsset, ImportedPositionProviderAsset, Jitter2dPositionProviderAsset, Jitter3dPositionProviderAsset, ListPositionProviderAsset, Mesh2DPositionProviderAsset, Mesh3DPositionProviderAsset, PositionAsset, PositionProviderAsset, ScalerPositionProviderAsset (and 5 more)

Complete API:
  public PositionProvider build(PositionProviderAsset.Argument argument)
  public void cleanUp()

Fields:
public static final BuilderCodec<OffsetPositionProviderAsset> CODEC
private static final Vector3d DEFAULT_OFFSET
private Vector3d offset
private PositionProviderAsset positionProviderAsset
private int offsetX
private int offsetY
private int offsetZ
