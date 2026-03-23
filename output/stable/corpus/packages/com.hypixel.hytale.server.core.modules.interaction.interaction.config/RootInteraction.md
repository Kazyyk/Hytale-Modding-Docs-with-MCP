# RootInteraction

Type: class | Package: com.hypixel.hytale.server.core.modules.interaction.interaction.config | Implements: JsonAssetWithMap<String, IndexedLookupTableAssetMap<String, RootInteraction>>, NetworkSerializable<com.hypixel.hytale.protocol.RootInteraction>

public class RootInteraction

Entry point for an interaction chain. Holds ordered interaction references, cooldown configuration, per-game-mode settings, click queuing, and rule definitions.

## Constants

- BuilderCodec<InteractionCooldown> COOLDOWN_CODEC
- AssetBuilderCodec<String, RootInteraction> CODEC
- ValidatorCache<String> VALIDATOR_CACHE
- ContainedAssetCodec<String, RootInteraction, ?> CHILD_ASSET_CODEC
- Codec<String[]> CHILD_ASSET_CODEC_ARRAY

## Key Methods

- public static IndexedLookupTableAssetMap<String, RootInteraction> getAssetMap()
- public String getId()
- public boolean needsRemoteSync()
- public boolean resetCooldownOnStart()
- public Operation getOperation(int index)
- public int getOperationMax()
- public String[] getInteractionIds()
- public Map<GameMode, RootInteractionSettings> getSettings()
- public float getClickQueuingTimeout()
- public InteractionRules getRules()
- public InteractionCooldown getCooldown()
- public AssetExtraInfo.Data getData()
- public void build(@Nonnull Set<String> modifiedInteractions)
- public void build()
- public com.hypixel.hytale.protocol.RootInteraction toPacket()
- public static RootInteraction getRootInteractionOrUnknown(@Nonnull String id)
- public static int getRootInteractionIdOrUnknown(@Nullable String id)
- public String toString()
