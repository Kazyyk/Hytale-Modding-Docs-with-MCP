# ParticleSystemExistsValidator

Type: class | Package: com.hypixel.hytale.server.npc.asset.builder.validators.asset | Extends: AssetValidator

public class ParticleSystemExistsValidator extends AssetValidator

## Fields

- private static final ParticleSystemExistsValidator DEFAULT_INSTANCE

## Methods

- @Override @Nonnull public String getDomain()
- @Override public boolean test(String particleSystem)
- @Override @Nonnull public String errorMessage(String particleSystem, String attributeName)
- @Override @Nonnull public String getAssetName()
- public static ParticleSystemExistsValidator required()
- @Nonnull public static ParticleSystemExistsValidator withConfig(EnumSet<AssetValidator.Config> config)
