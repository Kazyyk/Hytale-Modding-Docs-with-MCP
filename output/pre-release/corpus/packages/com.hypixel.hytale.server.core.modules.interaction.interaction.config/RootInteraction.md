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

Also in this package: Interaction, InteractionCamera, InteractionCameraSettings, InteractionConfiguration, InteractionEffects, InteractionPriority, InteractionPriorityCodec, InteractionRules, InteractionTypeUtils, SimpleInstantInteraction, SimpleInteraction

Complete API:
  public static AssetStore<String,RootInteraction,IndexedLookupTableAssetMap<String,RootInteraction>> getAssetStore()
  public static IndexedLookupTableAssetMap<String,RootInteraction> getAssetMap()
  public String getId()
  public boolean needsRemoteSync()
  public boolean resetCooldownOnStart()
  public Operation getOperation(int index)
  public int getOperationMax()
  public String[] getInteractionIds()
  public Map<GameMode,RootInteractionSettings> getSettings()
  public float getClickQueuingTimeout()
  public InteractionRules getRules()
  public InteractionCooldown getCooldown()
  public AssetExtraInfo.Data getData()
  public void build(Set<String> modifiedInteractions)
  public void build()
  public com.hypixel.hytale.protocol.RootInteraction toPacket()
  public static RootInteraction getRootInteractionOrUnknown(String id)
  public static int getRootInteractionIdOrUnknown(String id)
  public String toString()

Fields:
public static final BuilderCodec<InteractionCooldown> COOLDOWN_CODEC
public static final AssetBuilderCodec<String,RootInteraction> CODEC
public static final ValidatorCache<String> VALIDATOR_CACHE
public static final ContainedAssetCodec<String,RootInteraction,?> CHILD_ASSET_CODEC
public static final Codec<String[]> CHILD_ASSET_CODEC_ARRAY
public static final MapCodec<String,HashMap<String,String>> CHILD_ASSET_CODEC_MAP
private static AssetStore<String,RootInteraction,IndexedLookupTableAssetMap<String,RootInteraction>> ASSET_STORE
protected String id
protected AssetExtraInfo.Data data
protected String[] interactionIds
protected InteractionCooldown cooldown
protected Map<GameMode,RootInteractionSettings> settings
protected boolean requireNewClick
protected float clickQueuingTimeout
protected InteractionRules rules
protected Operation[] operations
protected boolean needsRemoteSync
