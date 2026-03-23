# PositionProviderAsset

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.assets.positionproviders | Implements: Cleanable, JsonAssetWithMap

public abstract class PositionProviderAsset implements Cleanable, JsonAssetWithMap<String, DefaultAssetMap<String, PositionProviderAsset>>

Abstract base class in the `positionproviders` package.

## Constants

- @Nonnull public static final Codec<String> CHILD_ASSET_CODEC
- @Nonnull public static final Codec<String[]> CHILD_ASSET_CODEC_ARRAY

## Fields

- private String id
- private AssetExtraInfo.Data data
- private boolean skip
- private String exportName
- public SeedBox parentSeed
- public ReferenceBundle referenceBundle
- public WorkerIndexer.Id workerId

## Methods

- public abstract PositionProvider build(@Nonnull PositionProviderAsset.Argument var1)
- public boolean skip()
- public static PositionProviderAsset getExportedAsset(@Nonnull String name)
- public String getId()
- @Override public void cleanUp()
- public Argument(@Nonnull SeedBox parentSeed, @Nonnull ReferenceBundle referenceBundle, @Nonnull WorkerIndexer.Id workerId)
- public Argument(@Nonnull PositionProviderAsset.Argument argument)

Known subclasses: AnchorPositionProviderAsset, BaseHeightPositionProviderAsset, BoundPositionProviderAsset, CachedPositionProviderAsset, FieldFunctionOccurrencePositionProviderAsset, FieldFunctionPositionProviderAsset, FrameworkPositionProviderAsset, ImportedPositionProviderAsset, ListPositionProviderAsset, Mesh2DPositionProviderAsset, Mesh3DPositionProviderAsset, OffsetPositionProviderAsset, SimpleHorizontalPositionProviderAsset, SpherePositionProviderAsset, UnionPositionProviderAsset

Also in this package: AnchorPositionProviderAsset, Argument, BaseHeightPositionProviderAsset, BoundPositionProviderAsset, CachedPositionProviderAsset, DelimiterAsset, FieldFunctionOccurrencePositionProviderAsset, FieldFunctionPositionProviderAsset, FrameworkPositionProviderAsset, ImportedPositionProviderAsset, ListPositionProviderAsset, Mesh2DPositionProviderAsset, Mesh3DPositionProviderAsset, OffsetPositionProviderAsset, PositionAsset, SimpleHorizontalPositionProviderAsset, SpherePositionProviderAsset, UnionPositionProviderAsset

Complete API:
  public abstract PositionProvider build(PositionProviderAsset.Argument var1)
  public boolean skip()
  public static PositionProviderAsset getExportedAsset(String name)
  public String getId()
  public void cleanUp()

Fields:
public static final AssetCodecMapCodec<String,PositionProviderAsset> CODEC
private static final Map<String,PositionProviderAsset> exportedNodes
public static final Codec<String> CHILD_ASSET_CODEC
public static final Codec<String[]> CHILD_ASSET_CODEC_ARRAY
public static final BuilderCodec<PositionProviderAsset> ABSTRACT_CODEC
private String id
private AssetExtraInfo.Data data
private boolean skip
private String exportName
