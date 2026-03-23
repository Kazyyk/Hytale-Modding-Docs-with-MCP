# DeployableTurretConfig

Type: class | Package: com.hypixel.hytale.builtin.deployables.config

public class DeployableTurretConfig

Turret deployable extending `DeployableConfig`. Targets entities within detection radius, tracks within trackable radius, fires projectiles with configurable burst/cooldown/interval, applies knockback, respects teams, and performs optional line-of-sight block occlusion tests.

Also in this package: DeployableAoeConfig, DeployableConfig, DeployableSpawner, DeployableTrapConfig, DeployableTrapSpawnerConfig, Shape, StatConfig

Complete API:
  protected void processConfig()
  public void tick(DeployableComponent deployableComponent, float dt, int index, ArchetypeChunk<EntityStore> archetypeChunk, Store<EntityStore> store, CommandBuffer<EntityStore> commandBuffer)
  private void tickInitState(Ref<EntityStore> entityRef, DeployableComponent component, Store<EntityStore> store, CommandBuffer<EntityStore> commandBuffer)
  private void tickStartDeployState(Ref<EntityStore> ref, DeployableComponent component, Store<EntityStore> store)
  private void tickAwaitDeployState(Ref<EntityStore> ref, DeployableComponent component, Store<EntityStore> store)
  private void tickAttackState(Ref<EntityStore> ref, DeployableComponent component, float dt, Store<EntityStore> store, CommandBuffer<EntityStore> commandBuffer)
  private Vector3d calculatedTargetPosition(Vector3d original)
  private boolean isValidTarget(Ref<EntityStore> ref, Store<EntityStore> store, Ref<EntityStore> targetRef)
  private boolean testLineOfSight(Vector3d attackerPos, Vector3d targetPos, Vector3d direction, CommandBuffer<EntityStore> commandBuffer)
  private void updateProjectiles(Store<EntityStore> store, CommandBuffer<EntityStore> commandBuffer, DeployableProjectileShooterComponent shooterComponent)
  private void updateProjectile(Ref<EntityStore> projectileRef, DeployableProjectileShooterComponent shooterComponent, Store<EntityStore> store, CommandBuffer<EntityStore> commandBuffer)
  private void projectileHit(Ref<EntityStore> ref, Ref<EntityStore> projectileRef, DeployableProjectileShooterComponent shooterComponent, Store<EntityStore> store, CommandBuffer<EntityStore> commandBuffer)
  private void applyKnockback(Ref<EntityStore> targetRef, Vector3d attackerPos, float attackerYaw, Store<EntityStore> store)
  public String toString()

Fields:
public static final BuilderCodec<DeployableTurretConfig> CODEC
protected float trackableRadius
protected float detectionRadius
protected float rotationSpeed
protected float projectileDamage
protected boolean preferOwnerTarget
protected int ammo
protected ProjectileConfig projectileConfig
protected float deployDelay
protected float shotInterval
protected int burstCount
protected float burstCooldown
protected boolean canShootOwner
protected Knockback projectileKnockback
protected Vector3d targetOffset
protected boolean doLineOfSightTest
protected String projectileHitWorldSoundEventId
protected String projectileHitLocalSoundEventId
protected int projectileHitLocalSoundEventIndex
protected int projectileHitWorldSoundEventIndex
protected boolean respectTeams
protected Map<String,Vector3d> projectileSpawnOffsets
