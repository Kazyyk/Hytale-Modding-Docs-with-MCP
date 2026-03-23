# DeployableAoeConfig

Type: class | Package: com.hypixel.hytale.builtin.deployables.config

public class DeployableAoeConfig

Area-of-effect deployable configuration extending `DeployableConfig`. Adds shape (sphere/cylinder), start/end radius, radius change time, damage interval/amount, damage cause, effect application, and owner/team/enemy targeting flags.

Known subclasses: DeployableTrapConfig

Also in this package: DeployableConfig, DeployableSpawner, DeployableTrapConfig, DeployableTrapSpawnerConfig, DeployableTurretConfig, Shape, StatConfig

Complete API:
  public void tick(DeployableComponent deployableComponent, float dt, int index, ArchetypeChunk<EntityStore> archetypeChunk, Store<EntityStore> store, CommandBuffer<EntityStore> commandBuffer)
  protected void handleDetection(Store<EntityStore> store, CommandBuffer<EntityStore> commandBuffer, Ref<EntityStore> deployableRef, DeployableComponent deployableComponent, Vector3d position, float radius, DamageCause damageCause)
  protected void handleDebugGraphics(World world, Vector3f color, Vector3d position, float scale)
  protected void attackTarget(Ref<EntityStore> targetRef, Ref<EntityStore> ownerRef, DamageCause damageCause, CommandBuffer<EntityStore> commandBuffer)
  protected void applyEffectToTarget(Store<EntityStore> store, Ref<EntityStore> targetRef)
  protected boolean canAttackEntity(Ref<EntityStore> targetRef, DeployableComponent deployable)
  protected float getRadius(Store<EntityStore> store, Instant startInstant)
  protected DamageCause getDamageCause()
  public String toString()

Fields:
public static final BuilderCodec<DeployableAoeConfig> CODEC
protected float startRadius
protected float endRadius
protected float radiusChangeTime
protected float damageInterval
protected float damageAmount
protected String damageCause
protected String[] effectsToApply
protected boolean attackOwner
protected boolean attackTeam
protected boolean attackEnemies
protected DeployableAoeConfig.Shape shape
protected float height
protected DamageCause processedDamageCause
