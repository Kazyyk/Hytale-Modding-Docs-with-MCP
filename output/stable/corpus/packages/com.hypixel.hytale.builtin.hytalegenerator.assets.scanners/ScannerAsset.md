# ScannerAsset

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.assets.scanners | Implements: Cleanable, JsonAssetWithMap<String, DefaultAssetMap<String, ScannerAsset>>

public abstract class ScannerAsset implements Cleanable, JsonAssetWithMap<String, DefaultAssetMap<String, ScannerAsset>>

## Fields

- @Nonnull public static final AssetCodecMapCodec<String, ScannerAsset> CODEC
- @Nonnull private static final Map<String, ScannerAsset> exportedNodes
- @Nonnull public static final Codec<String> CHILD_ASSET_CODEC
- @Nonnull public static final Codec<String[]> CHILD_ASSET_CODEC_ARRAY
- private String id
- private AssetExtraInfo.Data data
- private boolean skip
- private String exportName

## Constructors

- protected ScannerAsset()

## Methods

- public abstract Scanner build(@Nonnull ScannerAsset.Argument var1)
- public boolean skip()
- public static ScannerAsset getExportedAsset(@Nonnull String name)
- public String getId()
- @Nonnull public static ScannerAsset.Argument argumentFrom(@Nonnull PropAsset.Argument argument)
- @Override public void cleanUp()

## Inner Types

- `ScannerAsset.Argument`

Known subclasses: AreaScannerAsset, ColumnLinearScannerAsset, ColumnRandomScannerAsset, ImportedScannerAsset, OriginScannerAsset

Also in this package: AreaScannerAsset, Argument, ColumnLinearScannerAsset, ColumnRandomScannerAsset, ImportedScannerAsset, OriginScannerAsset

Complete API:
  public abstract Scanner build(ScannerAsset.Argument var1)
  public boolean skip()
  public static ScannerAsset getExportedAsset(String name)
  public String getId()
  public static ScannerAsset.Argument argumentFrom(PropAsset.Argument argument)
  public void cleanUp()

Fields:
public static final AssetCodecMapCodec<String,ScannerAsset> CODEC
private static final Map<String,ScannerAsset> exportedNodes
public static final Codec<String> CHILD_ASSET_CODEC
public static final Codec<String[]> CHILD_ASSET_CODEC_ARRAY
public static final BuilderCodec<ScannerAsset> ABSTRACT_CODEC
private String id
private AssetExtraInfo.Data data
private boolean skip
private String exportName
