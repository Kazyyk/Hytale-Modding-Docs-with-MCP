# Interaction

Type: class | Package: com.hypixel.hytale.server.core.modules.interaction.interaction.config | Implements: Operation, JsonAssetWithMap<String, IndexedLookupTableAssetMap<String, Interaction>>, NetworkSerializable<com.hypixel.hytale.protocol.Interaction>

public abstract class Interaction

Abstract base class for all interactions in the interaction system. Defines codec configuration, tick lifecycle, packet serialization, and rule evaluation.

## Constants

- AssetCodecMapCodec<String, Interaction> CODEC
- Codec<String> CHILD_ASSET_CODEC
- Codec<String[]> CHILD_ASSET_CODEC_ARRAY
- BuilderCodec<Interaction> ABSTRACT_CODEC
- ValidatorCache<String> VALIDATOR_CACHE
- MetaRegistry<InteractionContext> CONTEXT_META_REGISTRY
- MetaRegistry<Interaction> META_REGISTRY
- MetaKey<Ref<EntityStore>> TARGET_ENTITY
- MetaKey<Vector4d> HIT_LOCATION
- MetaKey<String> HIT_DETAIL
- MetaKey<BlockPosition> TARGET_BLOCK
- MetaKey<BlockPosition> TARGET_BLOCK_RAW
- MetaKey<Integer> TARGET_SLOT
- MetaKey<Float> TIME_SHIFT
- MetaKey<Damage> DAMAGE

## Key Methods

- public static IndexedLookupTableAssetMap<String, Interaction> getAssetMap()
- public String getId()
- public boolean isUnknown()
- public InteractionEffects getEffects()
- public float getHorizontalSpeedMultiplier()
- public double getViewDistance()
- public float getRunTime()
- public boolean isCancelOnItemChange()
- public InteractionRules getRules()
- public Map<GameMode, InteractionSettings> getSettings()
- public final void tick(@Nonnull Ref<EntityStore> ref, @Nonnull LivingEntity entity, boolean firstRun, float time, @Nonnull InteractionType type, @Nonnull InteractionContext context, @Nonnull CooldownHandler cooldownHandler)
- public final void simulateTick(@Nonnull Ref<EntityStore> ref, @Nonnull LivingEntity entity, boolean firstRun, float time, @Nonnull InteractionType type, @Nonnull InteractionContext context, @Nonnull CooldownHandler cooldownHandler)
- public void compile(@Nonnull OperationsBuilder builder)
- protected abstract void tick0(boolean var1, float var2, @Nonnull InteractionType var3, @Nonnull InteractionContext var4, @Nonnull CooldownHandler var5)
- protected abstract void simulateTick0(boolean var1, float var2, @Nonnull InteractionType var3, @Nonnull InteractionContext var4, @Nonnull CooldownHandler var5)
- public abstract boolean walk(@Nonnull Collector var1, @Nonnull InteractionContext var2)
- public void handle(@Nonnull Ref<EntityStore> ref, boolean firstRun, float time, @Nonnull InteractionType type, @Nonnull InteractionContext context)
- public InteractionChain mapForkChain(@Nonnull InteractionContext context, @Nonnull InteractionChainData data)
- public final com.hypixel.hytale.protocol.Interaction toPacket()
- protected abstract com.hypixel.hytale.protocol.Interaction generatePacket()
- protected void configurePacket(com.hypixel.hytale.protocol.Interaction packet)
- protected double getAnimationDuration(@Nullable Item item)
- public abstract boolean needsRemoteSync()
- public String toString()
- public static boolean failed(@Nonnull InteractionState state)
- public static Interaction getInteractionOrUnknown(@Nonnull String id)
- public static int getInteractionIdOrUnknown(@Nullable String id)
- protected static boolean needsRemoteSync(@Nullable String id)

Known subclasses: ChainingInteraction, ChainingInteraction, ChangeActiveSlotInteraction, ChangeActiveSlotInteraction, ChargingInteraction, ChargingInteraction, DamageEntityInteraction, DamageEntityInteraction, FirstClickInteraction, FirstClickInteraction, MemoriesConditionInteraction, MemoriesConditionInteraction, ParallelInteraction, ParallelInteraction, ReplaceInteraction, ReplaceInteraction, SerialInteraction, SerialInteraction, SimpleInteraction, SimpleInteraction

Also in this package: InteractionCamera, InteractionCameraSettings, InteractionConfiguration, InteractionEffects, InteractionPriority, InteractionPriorityCodec, InteractionRules, InteractionTypeUtils, RootInteraction, SimpleInstantInteraction, SimpleInteraction

Complete API:
  public static AssetStore<String,Interaction,IndexedLookupTableAssetMap<String,Interaction>> getAssetStore()
  public static IndexedLookupTableAssetMap<String,Interaction> getAssetMap()
  public String getId()
  public boolean isUnknown()
  public InteractionEffects getEffects()
  public float getHorizontalSpeedMultiplier()
  public double getViewDistance()
  public float getRunTime()
  public boolean isCancelOnItemChange()
  public InteractionRules getRules()
  public Map<GameMode,InteractionSettings> getSettings()
  public final void tick(Ref<EntityStore> ref, LivingEntity entity, boolean firstRun, float time, InteractionType type, InteractionContext context, CooldownHandler cooldownHandler)
  public final void simulateTick(Ref<EntityStore> ref, LivingEntity entity, boolean firstRun, float time, InteractionType type, InteractionContext context, CooldownHandler cooldownHandler)
  private boolean tickInternal(LivingEntity entity, float time, InteractionType type, InteractionContext context)
  private void trySkipChain(Ref<EntityStore> ref, float time, InteractionContext context, InteractionSyncData data)
  public void compile(OperationsBuilder builder)
  protected abstract void tick0(boolean var1, float var2, InteractionType var3, InteractionContext var4, CooldownHandler var5)
  protected abstract void simulateTick0(boolean var1, float var2, InteractionType var3, InteractionContext var4, CooldownHandler var5)
  public abstract boolean walk(Collector var1, InteractionContext var2)
  public void handle(Ref<EntityStore> ref, boolean firstRun, float time, InteractionType type, InteractionContext context)
  public InteractionChain mapForkChain(InteractionContext context, InteractionChainData data)
  private void sendPlayInteract(Ref<EntityStore> entity, InteractionContext context, InteractionChain chain, boolean cancel)
  public final com.hypixel.hytale.protocol.Interaction toPacket()
  protected abstract com.hypixel.hytale.protocol.Interaction generatePacket()
  protected void configurePacket(com.hypixel.hytale.protocol.Interaction packet)
  protected double getAnimationDuration(Item item)
  public abstract boolean needsRemoteSync()
  public String toString()
  public static boolean failed(InteractionState state)
  public static Interaction getInteractionOrUnknown(String id)
  public static int getInteractionIdOrUnknown(String id)
  protected static boolean needsRemoteSync(String id)

Fields:
public static final AssetCodecMapCodec<String,Interaction> CODEC
public static final Codec<String> CHILD_ASSET_CODEC
public static final Codec<String[]> CHILD_ASSET_CODEC_ARRAY
public static final BuilderCodec<Interaction> ABSTRACT_CODEC
public static final ValidatorCache<String> VALIDATOR_CACHE
private static AssetStore<String,Interaction,IndexedLookupTableAssetMap<String,Interaction>> ASSET_STORE
public static final MetaRegistry<InteractionContext> CONTEXT_META_REGISTRY
public static final MetaRegistry<Interaction> META_REGISTRY
public static final MetaKey<Ref<EntityStore>> TARGET_ENTITY
public static final MetaKey<Vector4d> HIT_LOCATION
public static final MetaKey<String> HIT_DETAIL
public static final MetaKey<BlockPosition> TARGET_BLOCK
public static final MetaKey<BlockPosition> TARGET_BLOCK_RAW
public static final MetaKey<Integer> TARGET_SLOT
public static final MetaKey<Float> TIME_SHIFT
public static final MetaKey<Damage> DAMAGE
protected String id
protected AssetExtraInfo.Data data
protected boolean unknown
protected double viewDistance
protected InteractionEffects effects
protected float horizontalSpeedMultiplier
protected float runTime
protected boolean cancelOnItemChange
protected Map<GameMode,InteractionSettings> settings
protected InteractionRules rules
protected InteractionCameraSettings camera
private transient SoftReference<com.hypixel.hytale.protocol.Interaction> cachedPacket
