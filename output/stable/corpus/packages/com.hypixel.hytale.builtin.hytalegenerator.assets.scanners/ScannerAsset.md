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
