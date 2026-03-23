# ClustersPositionProviderAsset

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.assets.positionproviders | Extends: PositionProviderAsset

public class ClustersPositionProviderAsset extends PositionProviderAsset

Position provider asset that generates clustered position distributions for prop and feature placement in world generation.

Also in this package: AnchorPositionProviderAsset, Argument, BaseHeightPositionProviderAsset, BoundPositionProviderAsset, CachedPositionProviderAsset, DelimiterAsset, EmptyPositionProviderAsset, FieldFunctionOccurrencePositionProviderAsset, FieldFunctionPositionProviderAsset, FrameworkPositionProviderAsset, ImportedPositionProviderAsset, Jitter2dPositionProviderAsset, Jitter3dPositionProviderAsset, ListPositionProviderAsset, Mesh2DPositionProviderAsset, Mesh3DPositionProviderAsset, OffsetPositionProviderAsset, PositionAsset, PositionProviderAsset, ScalerPositionProviderAsset (and 5 more)

Complete API:
  public PositionProvider build(PositionProviderAsset.Argument argument)
  public void cleanUp()
  private static boolean isValidScale(Vector3d vector)

Fields:
public static final BuilderCodec<ClustersPositionProviderAsset> CODEC
private PositionProviderAsset clusterPositionProviderAsset
private PositionProviderAsset distributorPositionProviderAsset
private DecimalBounds3dAsset clusterBoundsAsset
