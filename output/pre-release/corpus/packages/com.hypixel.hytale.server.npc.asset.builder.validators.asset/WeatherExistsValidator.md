# WeatherExistsValidator

Type: class | Package: com.hypixel.hytale.server.npc.asset.builder.validators.asset | Extends: AssetValidator

public class WeatherExistsValidator extends AssetValidator

## Fields

- private static final WeatherExistsValidator DEFAULT_INSTANCE

## Methods

- @Override @Nonnull public String getDomain()
- @Override public boolean test(String value)
- @Override @Nonnull public String errorMessage(String value, String attribute)
- @Override @Nonnull public String getAssetName()
- public static WeatherExistsValidator required()
- @Nonnull public static WeatherExistsValidator withConfig(EnumSet<AssetValidator.Config> config)
