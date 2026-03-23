# DeployableTrapConfig

Type: class | Package: com.hypixel.hytale.builtin.deployables.config

public class DeployableTrapConfig

Trap deployable extending `DeployableAoeConfig`. Adds fuse duration, active duration after trigger, and destroy-on-triggered behavior. Defers detection until the fuse timer expires.

Known subclasses: DeployableTrapSpawnerConfig

Also in this package: DeployableAoeConfig, DeployableConfig, DeployableSpawner, DeployableTrapSpawnerConfig, DeployableTurretConfig, Shape, StatConfig

Complete API:
  public void tick(DeployableComponent deployableComponent, float dt, int index, ArchetypeChunk<EntityStore> archetypeChunk, Store<EntityStore> store, CommandBuffer<EntityStore> commandBuffer)
  protected void handleDetection(Store<EntityStore> store, CommandBuffer<EntityStore> commandBuffer, Ref<EntityStore> deployableRef, DeployableComponent deployableComponent, Vector3d position, float radius, DamageCause damageCause)
  protected boolean isLive(Store<EntityStore> store, DeployableComponent comp)
  protected void onTriggered(Store<EntityStore> store, Ref<EntityStore> ref)
  public String toString()

Fields:
public static final BuilderCodec<DeployableTrapConfig> CODEC
protected float fuzeDuration
protected float activeDuration
protected boolean destroyOnTriggered
