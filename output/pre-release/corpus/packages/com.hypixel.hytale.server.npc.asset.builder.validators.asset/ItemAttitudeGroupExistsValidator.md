# ItemAttitudeGroupExistsValidator

Type: class | Package: com.hypixel.hytale.server.npc.asset.builder.validators.asset | Extends: AssetValidator

public class ItemAttitudeGroupExistsValidator extends AssetValidator

## Fields

- private static final ItemAttitudeGroupExistsValidator DEFAULT_INSTANCE

## Methods

- @Override @Nonnull public String getDomain()
- @Override public boolean test(String attitudeGroup)
- @Override @Nonnull public String errorMessage(String attitudeGroup, String attributeName)
- @Override @Nonnull public String getAssetName()
- public static ItemAttitudeGroupExistsValidator required()
- @Nonnull public static ItemAttitudeGroupExistsValidator withConfig(EnumSet<AssetValidator.Config> config)
