# Damage.Particles

Type: class | Package: com.hypixel.hytale.server.core.modules.entity.damage

public static class Damage.Particles

Holds impact particle data attached to a Damage event via the `Damage.IMPACT_PARTICLES` meta key. Contains both model-space and world-space particle arrays along with a view distance for broadcast range.

## Constructor


public Particles(@Nullable ModelParticle[] modelParticles, @Nullable WorldParticle[] worldParticles, double viewDistance)

Creates a particle configuration with model particles, world particles, and a view distance.

## Methods


@Nullable
public ModelParticle[] getModelParticles()

Returns the model-space particles to spawn on the hit entity's model, or `null`.


public void setModelParticles(@Nullable ModelParticle[] modelParticles)

Sets the model-space particles.


@Nullable
public WorldParticle[] getWorldParticles()

Returns the world-space particles to spawn at the hit location, or `null`.


public void setWorldParticles(@Nullable WorldParticle[] worldParticles)

Sets the world-space particles.


public double getViewDistance()

Returns the maximum distance at which players can see these particles.


public void setViewDistance(double viewDistance)

Sets the view distance for particle visibility.

## Fields

- modelParticles | ModelParticle[] | protected | Model-space impact particles.
- worldParticles | WorldParticle[] | protected | World-space impact particles.
- viewDistance | double | protected | Broadcast range for particles.

## Related Types

- Damage -- the damage event that carries particles via meta store
- DamageSystems.ApplyParticles -- system that reads and spawns these particles
