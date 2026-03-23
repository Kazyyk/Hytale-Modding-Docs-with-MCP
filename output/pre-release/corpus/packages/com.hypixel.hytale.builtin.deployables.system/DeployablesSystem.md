# DeployablesSystem

Type: class | Package: com.hypixel.hytale.builtin.deployables.system

public class DeployablesSystem

## Methods

- private static void spawnParticleEffect( @Nonnull Ref<EntityStore> sourceRef, @Nonnull CommandBuffer<EntityStore> commandBuffer, @Nonnull Vector3d position, @Nonnull ModelParticle particle )
- @Override public Query<EntityStore> getQuery()
- @Override public void tick( float dt, int index, ArchetypeChunk<EntityStore> archetypeChunk, @Nonnull Store<EntityStore> store, @Nonnull CommandBuffer<EntityStore> commandBuffer )
- private static void deregisterOwner( @Nonnull Ref<EntityStore> ref, @Nonnull DeployableComponent deployableComponent, @Nonnull DeployableConfig deployableConfig )
- @Override public void onEntityAdded( @Nonnull Ref<EntityStore> ref, @Nonnull AddReason reason, @Nonnull Store<EntityStore> store, @Nonnull CommandBuffer<EntityStore> commandBuffer )
- @Override public void onEntityRemove( @Nonnull Ref<EntityStore> ref, @Nonnull RemoveReason reason, @Nonnull Store<EntityStore> store, @Nonnull CommandBuffer<EntityStore> commandBuffer )

## Inner Types

- `DeployablesSystem.DeployableOwnerTicker`
- `DeployablesSystem.DeployableRegisterer`
- `DeployablesSystem.DeployableTicker`

Also in this package: DeployableOwnerTicker, DeployableRegisterer, DeployableTicker

Complete API:
  private static void spawnParticleEffect(Ref<EntityStore> sourceRef, CommandBuffer<EntityStore> commandBuffer, Vector3d position, ModelParticle particle)
