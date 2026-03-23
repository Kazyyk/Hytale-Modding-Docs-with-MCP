# TerrainAsset

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.assets.terrains | Implements: Cleanable, JsonAssetWithMap

public abstract class TerrainAsset implements Cleanable, JsonAssetWithMap

## Fields

- private static final TerrainAsset[] EMPTY_INPUTS
- public static final AssetCodecMapCodec<String,TerrainAsset> CODEC
- public static final Codec<String> CHILD_ASSET_CODEC
- public static final Codec<String[]> CHILD_ASSET_CODEC_ARRAY
- public static final BuilderCodec<TerrainAsset> ABSTRACT_CODEC
- private String id
- private AssetExtraInfo.Data data
- private TerrainAsset[] inputs
- private boolean skip

## Methods

- public abstract Density buildDensity(SeedBox var1, ReferenceBundle var2, WorkerIndexer.Id var3)
- public String getId()
- @Override public void cleanUp()
