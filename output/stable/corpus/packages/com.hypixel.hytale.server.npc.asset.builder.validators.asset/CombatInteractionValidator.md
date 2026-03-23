# CombatInteractionValidator

Type: class | Package: com.hypixel.hytale.server.npc.asset.builder.validators.asset | Extends: AssetValidator

public class CombatInteractionValidator extends AssetValidator

## Fields

- private final List<String> disallowedInteractions
- private boolean assetExists
- private boolean attackTag
- private boolean onlyOneAttackType
- private boolean onlyOneAimingReference

## Methods

- @Override @Nonnull public String getDomain()
- @Override public boolean test(String value)
- @Override @Nonnull public String errorMessage(String value, String attribute)
- @Override @Nonnull public String getAssetName()
- public static boolean testAttackTag(@Nonnull RootInteraction interaction)
- public static boolean testOnlyOneAttackType(@Nonnull RootInteraction interaction)
- @Nonnull public static CombatInteractionValidator required()
- @Nonnull public static CombatInteractionValidator withConfig(EnumSet<AssetValidator.Config> config)
