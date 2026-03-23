# SettingsAsset

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.assets | Extends: null | Implements: JsonAssetWithMap<String, DefaultAssetMap<String, SettingsAsset>>

public class SettingsAsset implements JsonAssetWithMap<String, DefaultAssetMap<String, SettingsAsset>>

## Fields

- public static final AssetBuilderCodec<String, SettingsAsset> CODEC
- private String id
- private AssetExtraInfo.Data data
- private Integer[] checkpoints
- private int customConcurrency
- private double bufferCapacityFactor
- private double targetViewDistance
- private double targetPlayerCount

## Constructors

- private SettingsAsset()

## Methods

- public List<Integer> getStatsCheckpoints()
- public int getCustomConcurrency()
- public double getBufferCapacityFactor()
- public double getTargetViewDistance()
- public double getTargetPlayerCount()
- public static int getSampleBits(int v)
- return switch(v)
- public String getId()
