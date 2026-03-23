# BeaconSpawnExistsValidator

Type: class | Package: com.hypixel.hytale.server.npc.asset.builder.validators.asset | Extends: AssetValidator

public class BeaconSpawnExistsValidator extends AssetValidator

## Fields

- private static final BeaconSpawnExistsValidator DEFAULT_INSTANCE

## Methods

- @Override @Nonnull public String getDomain()
- @Override public boolean test(String beacon)
- @Override @Nonnull public String errorMessage(String beacon, String attributeName)
- @Override @Nonnull public String getAssetName()
- public static BeaconSpawnExistsValidator required()
- @Nonnull public static BeaconSpawnExistsValidator withConfig(EnumSet<AssetValidator.Config> config)
