# ForceProviderStandardState

Type: class | Package: com.hypixel.hytale.server.core.modules.physics.util

public class ForceProviderStandardState

## Fields

- public double displacedMass
- public double dragCoefficient
- public double gravity
- public final Vector3d nextTickVelocity
- public final Vector3d externalVelocity
- public final Vector3d externalAcceleration
- public final Vector3d externalForce
- public final Vector3d externalImpulse

## Constructors

- public ForceProviderStandardState()

## Methods

- public void convertToForces(double dt, double mass)
- public void updateVelocity(@Nonnull Vector3d velocity)
- public void clear()

Also in this package: ForceAccumulator, ForceProvider, ForceProviderEntity, ForceProviderStandard, PhysicsBodyState, PhysicsBodyStateUpdater, PhysicsBodyStateUpdaterMidpoint, PhysicsBodyStateUpdaterRK4, PhysicsBodyStateUpdaterSymplecticEuler, PhysicsConstants, PhysicsFlags, PhysicsMath

Complete API:
  public void convertToForces(double dt, double mass)
  public void updateVelocity(Vector3d velocity)
  public void clear()

Fields:
public double displacedMass
public double dragCoefficient
public double gravity
public final Vector3d nextTickVelocity
public final Vector3d externalVelocity
public final Vector3d externalAcceleration
public final Vector3d externalForce
public final Vector3d externalImpulse
