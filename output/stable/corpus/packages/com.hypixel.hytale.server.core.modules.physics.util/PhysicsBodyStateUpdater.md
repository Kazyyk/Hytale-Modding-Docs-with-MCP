# PhysicsBodyStateUpdater

Type: class | Package: com.hypixel.hytale.server.core.modules.physics.util

public class PhysicsBodyStateUpdater

## Fields

- protected static double MIN_VELOCITY
- @Nonnull protected Vector3d acceleration
- protected final ForceAccumulator accumulator

## Methods

- public void update(@Nonnull PhysicsBodyState before, @Nonnull PhysicsBodyState after, double mass, double dt, boolean onGround, @Nonnull ForceProvider[] forceProvider)
- protected static void updatePositionBeforeVelocity(@Nonnull PhysicsBodyState before, @Nonnull PhysicsBodyState after, double dt)
- protected static void updatePositionAfterVelocity(@Nonnull PhysicsBodyState before, @Nonnull PhysicsBodyState after, double dt)
- protected void updateAndClampVelocity(@Nonnull PhysicsBodyState before, @Nonnull PhysicsBodyState after, double dt)
- protected void updateVelocity(@Nonnull PhysicsBodyState before, @Nonnull PhysicsBodyState after, double dt)
- protected void computeAcceleration(double mass)
- protected void computeAcceleration(@Nonnull PhysicsBodyState state, boolean onGround, @Nonnull ForceProvider[] forceProviders, double mass, double timeStep)
- protected void assignAcceleration(@Nonnull PhysicsBodyState state)
- protected void addAcceleration(@Nonnull PhysicsBodyState state, double scale)
- protected void addAcceleration(@Nonnull PhysicsBodyState state)
- protected void convertAccelerationToVelocity(@Nonnull PhysicsBodyState before, @Nonnull PhysicsBodyState after, double scale)
