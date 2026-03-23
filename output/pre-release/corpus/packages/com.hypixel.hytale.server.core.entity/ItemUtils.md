# ItemUtils

Type: class | Package: com.hypixel.hytale.server.core.entity

public class ItemUtils

Utility class for item-related entity operations. Provides `interactivelyPickupItem()` for adding items to an entity's inventory with event dispatch, and `dropItem()` / `throwItem()` for ejecting items into the world as item entities with configured velocity and transform.

Also in this package: AnimationUtils, CallState, ChainCancelledException, ChainSyncStorage, DefaultAnimations, Entity, EntitySnapshot, EntityUtils, ExplosionConfig, ExplosionUtils, Frozen, InteractionChain, InteractionContext, InteractionEntry, InteractionManager, LivingEntity, SnapshotProvider, StatModifiersManager, TempChain, UUIDComponent

Complete API:
  public static void interactivelyPickupItem(Ref<EntityStore> ref, ItemStack itemStack, Vector3d origin, ComponentAccessor<EntityStore> componentAccessor)
  public static Ref<EntityStore> throwItem(Ref<EntityStore> ref, ItemStack itemStack, float throwSpeed, ComponentAccessor<EntityStore> componentAccessor)
  public static Ref<EntityStore> throwItem(Ref<EntityStore> ref, ComponentAccessor<EntityStore> store, ItemStack itemStack, Vector3d throwDirection, float throwSpeed)
  public static Ref<EntityStore> dropItem(Ref<EntityStore> ref, ItemStack itemStack, ComponentAccessor<EntityStore> componentAccessor)
  public static boolean canDecreaseItemStackDurability(Ref<EntityStore> ref, ComponentAccessor<EntityStore> accessor)
  public static boolean canApplyItemStackPenalties(Ref<EntityStore> ref, ComponentAccessor<EntityStore> accessor)

Fields:
public static final HytaleLogger LOGGER
