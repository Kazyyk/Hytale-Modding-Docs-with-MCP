# PickupItemComponent

Type: class | Package: com.hypixel.hytale.server.core.modules.entity.item | Extends: Component<EntityStore>

public class PickupItemComponent

ECS component for an item entity being animated toward a pickup target. Tracks start position, target reference, lifetime, and completion state.

Also in this package: EnsureRequiredComponents, ItemComponent, ItemMergeSystem, ItemPhysicsComponent, ItemPhysicsSystem, ItemPrePhysicsSystem, ItemSystems, PickupItemSystem, PreventItemMerging, PreventPickup, TrackerSystem

Complete API:
  public static ComponentType<EntityStore,PickupItemComponent> getComponentType()
  public boolean hasFinished()
  public void setFinished(boolean finished)
  public void decreaseLifetime(float amount)
  public float getLifeTime()
  public float getOriginalLifeTime()
  public void setInitialLifeTime(float lifeTimeS)
  public Vector3d getStartPosition()
  public Ref<EntityStore> getTargetRef()
  public PickupItemComponent clone()

Fields:
public static final float PICKUP_TRAVEL_TIME_DEFAULT
private Ref<EntityStore> targetRef
private Vector3d startPosition
private float originalLifeTime
private float lifeTime
private boolean finished
