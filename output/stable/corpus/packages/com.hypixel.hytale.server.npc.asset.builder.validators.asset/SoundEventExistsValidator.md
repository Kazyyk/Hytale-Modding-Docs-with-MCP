# SoundEventExistsValidator

Type: class | Package: com.hypixel.hytale.server.npc.asset.builder.validators.asset | Extends: AssetValidator

public class SoundEventExistsValidator extends AssetValidator

## Fields

- private static final SoundEventExistsValidator DEFAULT_INSTANCE

## Methods

- @Override @Nonnull public String getDomain()
- @Override public boolean test(String soundEvent)
- @Override @Nonnull public String errorMessage(String soundEvent, String attributeName)
- @Override @Nonnull public String getAssetName()
- public static SoundEventExistsValidator required()
- @Nonnull public static SoundEventExistsValidator withConfig(EnumSet<AssetValidator.Config> config)
