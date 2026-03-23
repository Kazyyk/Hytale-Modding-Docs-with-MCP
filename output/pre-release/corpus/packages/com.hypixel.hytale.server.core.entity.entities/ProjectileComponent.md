# ProjectileComponent

Type: class | Package: com.hypixel.hytale.server.core.entity.entities

public class ProjectileComponent

ECS component for projectile entities. Tracks projectile type, creator UUID, bounce state, collision handling, damage modifiers, and lifecycle timers.

Also in this package: BlockEntity, Player

Complete API:
  public static ComponentType<EntityStore,ProjectileComponent> getComponentType()
  public static Holder<EntityStore> assembleDefaultProjectile(TimeResource time, String projectileAssetName, Vector3d position, Vector3f rotation)
  public boolean initialize()
  public void initializePhysics(BoundingBox boundingBox)
  public void onProjectileBounce(Vector3d position, ComponentAccessor<EntityStore> componentAccessor)
  private void onProjectileHitEvent(Ref<EntityStore> ref, Vector3d position, Ref<EntityStore> targetRef, ComponentAccessor<EntityStore> componentAccessor)
  public boolean consumeDeadTimer(float dt)
  protected void bounceHandler(Vector3d position, ComponentAccessor<EntityStore> componentAccessor)
  protected void impactHandler(Ref<EntityStore> ref, Vector3d position, Ref<EntityStore> targetRef, ComponentAccessor<EntityStore> componentAccessor)
  private void onProjectileMissEvent(Vector3d position, ComponentAccessor<EntityStore> componentAccessor)
  public void onProjectileDeath(Ref<EntityStore> ref, Vector3d position, CommandBuffer<EntityStore> commandBuffer)
  public void shoot(Holder<EntityStore> holder, UUID creatorUuid, double x, double y, double z, float yaw, float pitch)
  public static void computeStartOffset(boolean pitchAdjust, double verticalCenterShot, double horizontalCenterShot, double depthShot, float yaw, float pitch, Vector3d offset)
  public boolean isOnGround()
  public Projectile getProjectile()
  public String getAppearance()
  public String getProjectileAssetName()
  public SimplePhysicsProvider getSimplePhysicsProvider()
  public void applyBrokenPenalty(float penalty)
  public Component<EntityStore> clone()

Fields:
public static final BuilderCodec<ProjectileComponent> CODEC
private static final double DEFAULT_DESPAWN_SECONDS
private transient SimplePhysicsProvider simplePhysicsProvider
private transient String appearance
private transient Projectile projectile
private String projectileAssetName
private float brokenDamageModifier
private double deadTimer
private UUID creatorUuid
private boolean haveHit
private Vector3d lastBouncePosition
