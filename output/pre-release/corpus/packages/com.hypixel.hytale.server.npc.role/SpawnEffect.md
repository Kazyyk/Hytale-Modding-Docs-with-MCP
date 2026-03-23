# SpawnEffect

Type: interface | Package: com.hypixel.hytale.server.npc.role

public interface SpawnEffect

Contract for spawning particle effects when an NPC appears in the world. Implementers provide a particle system ID, an offset from the NPC's position, and a view distance for player visibility. The default `spawnEffect` method rotates the offset by the entity's yaw, collects nearby players within the view distance using a spatial query, and dispatches the particle effect.

## Abstract Methods

- String getSpawnParticles()
- Vector3d getSpawnParticleOffset()
- double getSpawnViewDistance()

## Default Methods

- default void spawnEffect(@Nonnull Vector3d position, @Nonnull Vector3f rotation, @Nonnull ComponentAccessor<EntityStore> componentAccessor)

The default implementation: returns early if `getSpawnParticles()` is null or empty. Otherwise, applies the yaw rotation from `rotation` to the particle offset, adds the entity position, queries the player spatial resource for nearby players, and calls `ParticleUtil.spawnParticleEffect`.

Known implementors: BuilderRole

Also in this package: AvoidanceMode, DeferredAction, Role, RoleDebugDisplay, RoleDebugFlags, RoleDebugPreset, RoleUtils, SeparationMode

Complete API:
  String getSpawnParticles(BuilderSupport var1)
  Vector3d getSpawnParticleOffset(BuilderSupport var1)
  String getSpawnParticleTargetNode(BuilderSupport var1)
  boolean isSpawnParticleDetached(BuilderSupport var1)
  double getSpawnViewDistance()
  default void spawnEffect(Holder<EntityStore> holder, BuilderSupport support, Vector3d position, Vector3f rotation, ComponentAccessor<EntityStore> componentAccessor)
