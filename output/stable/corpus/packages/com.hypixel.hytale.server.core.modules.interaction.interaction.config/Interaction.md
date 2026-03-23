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
