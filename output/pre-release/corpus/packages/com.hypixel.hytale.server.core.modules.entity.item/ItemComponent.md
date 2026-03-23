# ItemComponent

Type: class | Package: com.hypixel.hytale.server.core.modules.entity.item | Extends: Component<EntityStore>

public class ItemComponent

ECS component representing a dropped item entity. Manages the item stack, pickup/merge delays, dynamic lighting, lifetime computation, and provides static factory methods for generating item drops and pickup animations.

Also in this package: EnsureRequiredComponents, ItemMergeSystem, ItemPhysicsComponent, ItemPhysicsSystem, ItemPrePhysicsSystem, ItemSystems, PickupItemComponent, PickupItemSystem, PreventItemMerging, PreventPickup, TrackerSystem

Complete API:
  public static ComponentType<EntityStore,ItemComponent> getComponentType()
  public ItemStack getItemStack()
  public void setItemStack(ItemStack itemStack)
  public void setPickupDelay(float pickupDelay)
  public float getPickupRadius(ComponentAccessor<EntityStore> componentAccessor)
  public float computeLifetimeSeconds(ComponentAccessor<EntityStore> componentAccessor)
  public ColorLight computeDynamicLight()
  public boolean pollPickupDelay(float dt)
  public boolean pollPickupThrottle(float dt)
  public boolean pollMergeDelay(float dt)
  public boolean canPickUp()
  public boolean isRemovedByPlayerPickup()
  public void setRemovedByPlayerPickup(boolean removedByPlayerPickup)
  public boolean consumeNetworkOutdated()
  public ItemComponent clone()
  public static Holder<EntityStore>[] generateItemDrops(ComponentAccessor<EntityStore> accessor, List<ItemStack> itemStacks, Vector3d position, Vector3f rotation)
  public static Holder<EntityStore> generateItemDrop(ComponentAccessor<EntityStore> accessor, ItemStack itemStack, Vector3d position, Vector3f rotation, float velocityX, float velocityY, float velocityZ)
  public static Holder<EntityStore> generatePickedUpItem(Ref<EntityStore> ref, ComponentAccessor<EntityStore> componentAccessor, Ref<EntityStore> targetRef, Vector3d targetPosition)
  public static Holder<EntityStore> generatePickedUpItem(ItemStack itemStack, Vector3d position, ComponentAccessor<EntityStore> componentAccessor, Ref<EntityStore> targetRef)
  public static ItemStack addToItemContainer(Store<EntityStore> store, Ref<EntityStore> itemRef, ItemContainer itemContainer)

Fields:
private static final HytaleLogger LOGGER
public static final BuilderCodec<ItemComponent> CODEC
private static final float DROPPED_ITEM_VERTICAL_BOUNCE_VELOCITY
private static final float DROPPED_ITEM_HORIZONTAL_BOUNCE_VELOCITY
public static final float DEFAULT_PICKUP_DELAY
public static final float PICKUP_DELAY_DROPPED
public static final float PICKUP_THROTTLE
public static final float DEFAULT_MERGE_DELAY
private ItemStack itemStack
private boolean isNetworkOutdated
private float mergeDelay
private float pickupDelay
private float pickupThrottle
private boolean removedByPlayerPickup
private float pickupRange
