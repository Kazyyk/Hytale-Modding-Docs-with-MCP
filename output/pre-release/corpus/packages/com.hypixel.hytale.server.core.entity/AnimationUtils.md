# AnimationUtils

Type: class | Package: com.hypixel.hytale.server.core.entity

public class AnimationUtils

Utility class for playing animations on entities. Provides static `playAnimation()` methods that look up the entity's `ModelComponent`, resolve animation indices from the model's animation set (optionally via `ItemPlayerAnimations`), and broadcast `PlayAnimation` packets to nearby players.

Also in this package: CallState, ChainCancelledException, ChainSyncStorage, DefaultAnimations, Entity, EntitySnapshot, EntityUtils, ExplosionConfig, ExplosionUtils, Frozen, InteractionChain, InteractionContext, InteractionEntry, InteractionManager, ItemUtils, LivingEntity, SnapshotProvider, StatModifiersManager, TempChain, UUIDComponent

Complete API:
  public static void playAnimation(Ref<EntityStore> ref, AnimationSlot animationSlot, String animationId, boolean sendToSelf, ComponentAccessor<EntityStore> componentAccessor)
  public static void playAnimation(Ref<EntityStore> ref, AnimationSlot animationSlot, String itemAnimationsId, String animationId, boolean sendToSelf, ComponentAccessor<EntityStore> componentAccessor)
  public static void playAnimation(Ref<EntityStore> ref, AnimationSlot animationSlot, String itemAnimationsId, String animationId, ComponentAccessor<EntityStore> componentAccessor)
  public static void playAnimation(Ref<EntityStore> ref, AnimationSlot animationSlot, ItemPlayerAnimations itemAnimations, String animationId, ComponentAccessor<EntityStore> componentAccessor)
  public static void stopAnimation(Ref<EntityStore> ref, AnimationSlot animationSlot, ComponentAccessor<EntityStore> componentAccessor)
  public static void stopAnimation(Ref<EntityStore> ref, AnimationSlot animationSlot, boolean sendToSelf, ComponentAccessor<EntityStore> componentAccessor)
  public static void playAnimation(Ref<EntityStore> ref, AnimationSlot animationSlot, String animationId, ComponentAccessor<EntityStore> componentAccessor)
