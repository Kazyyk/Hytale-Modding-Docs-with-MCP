# RoleExistsValidator

Type: class | Package: com.hypixel.hytale.server.npc.asset.builder.validators.asset | Extends: AssetValidator

public class RoleExistsValidator extends AssetValidator

## Fields

- private static final RoleExistsValidator DEFAULT_INSTANCE

## Methods

- @Override @Nonnull public String getDomain()
- @Override public boolean test(String role)
- @Override @Nonnull public String errorMessage(String role, String attributeName)
- @Override @Nonnull public String getAssetName()
- public static RoleExistsValidator required()
- @Nonnull public static RoleExistsValidator withConfig(EnumSet<AssetValidator.Config> config)
