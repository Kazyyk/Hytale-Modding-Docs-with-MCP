# ForceAccumulator

Type: class | Package: com.hypixel.hytale.server.core.modules.physics.util

public class ForceAccumulator

## Fields

- public double speed
- public final Vector3d force
- public final Vector3d resistanceForceLimit

## Methods

- public void initialize(@Nonnull PhysicsBodyState state, double mass, double timeStep)
- protected void computeResultingForce(@Nonnull PhysicsBodyState state, boolean onGround, @Nonnull ForceProvider[] forceProviders, double mass, double timeStep)
