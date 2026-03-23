# DeployableTrapSpawnerConfig

Type: class | Package: com.hypixel.hytale.builtin.deployables.config

public class DeployableTrapSpawnerConfig

Trap-spawner hybrid extending `DeployableTrapConfig`. On trigger, spawns child deployables from configured `DeployableSpawner` entries at offset positions around the trap. Manages a multi-phase state machine: deploy, animate, fuse, live, triggered, despawn.

Also in this package: DeployableAoeConfig, DeployableConfig, DeployableSpawner, DeployableTrapConfig, DeployableTurretConfig, Shape, StatConfig

Complete API:
  public void tick(DeployableComponent deployableComponent, float dt, int index, ArchetypeChunk<EntityStore> archetypeChunk, Store<EntityStore> store, CommandBuffer<EntityStore> commandBuffer)
  private void tickDeploymentState(Store<EntityStore> store, DeployableComponent component, Ref<EntityStore> entityRef)
  private void tickDeployAnimationState(Store<EntityStore> store, DeployableComponent component, Ref<EntityStore> entityRef)
  private void tickFuzeState(Store<EntityStore> store, DeployableComponent component)
  private void tickLiveState(Store<EntityStore> store, DeployableComponent component, Ref<EntityStore> entityRef, CommandBuffer<EntityStore> commandBuffer, float dt)
  private void tickTriggeredState(CommandBuffer<EntityStore> commandBuffer, Store<EntityStore> store, DeployableComponent component, Ref<EntityStore> entityRef)
  private void tickDespawnState(DeployableComponent component, Ref<EntityStore> entityRef, Store<EntityStore> store)
  protected void onTriggered(Store<EntityStore> store, Ref<EntityStore> ref)

Fields:
public static final BuilderCodec<DeployableTrapSpawnerConfig> CODEC
private String[] deployableSpawnerIds
private DeployableSpawner[] deployableSpawners
