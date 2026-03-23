# EnvironmentExistsValidator

Type: class | Package: com.hypixel.hytale.server.npc.asset.builder.validators.asset | Extends: AssetValidator

public class EnvironmentExistsValidator extends AssetValidator

## Fields

- public static final EnvironmentExistsValidator DEFAULT_INSTANCE

## Methods

- @Override @Nonnull public String getDomain()
- @Override public boolean test(String envName)
- @Override @Nonnull public String errorMessage(String envName, String attribute)
- @Override @Nonnull public String getAssetName()
- public static EnvironmentExistsValidator required()
- @Nonnull public static EnvironmentExistsValidator withConfig(EnumSet<AssetValidator.Config> config)
