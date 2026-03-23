# PhysicsBodyStateUpdaterRK4

Type: class | Package: com.hypixel.hytale.server.core.modules.physics.util | Extends: PhysicsBodyStateUpdater

public class PhysicsBodyStateUpdaterRK4 extends PhysicsBodyStateUpdater

## Fields

- private final PhysicsBodyState state

## Methods

- @Override public void update(@Nonnull PhysicsBodyState before, @Nonnull PhysicsBodyState after, double mass, double dt, boolean onGround, @Nonnull ForceProvider[] forceProvider)

Also in this package: ForceAccumulator, ForceProvider, ForceProviderEntity, ForceProviderStandard, ForceProviderStandardState, PhysicsBodyState, PhysicsBodyStateUpdater, PhysicsBodyStateUpdaterMidpoint, PhysicsBodyStateUpdaterSymplecticEuler, PhysicsConstants, PhysicsFlags, PhysicsMath

Complete API:
  public void update(PhysicsBodyState before, PhysicsBodyState after, double mass, double dt, boolean onGround, ForceProvider[] forceProvider)

Fields:
private final PhysicsBodyState state
