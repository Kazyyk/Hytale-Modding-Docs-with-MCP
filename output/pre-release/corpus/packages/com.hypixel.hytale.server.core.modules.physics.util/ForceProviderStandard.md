# ForceProviderStandard

Type: class | Package: com.hypixel.hytale.server.core.modules.physics.util | Implements: ForceProvider

public abstract class ForceProviderStandard implements ForceProvider

## Fields

- @Nonnull public static HytaleLogger LOGGER
- @Nonnull protected Vector3d dragForce

## Methods

- public abstract double getMass(double var1)
- public abstract double getVolume()
- public abstract double getDensity()
- public abstract double getProjectedArea(PhysicsBodyState var1, double var2)
- public abstract double getFrictionCoefficient()
- public abstract ForceProviderStandardState getForceProviderStandardState()
- @Override public void update(@Nonnull PhysicsBodyState bodyState, @Nonnull ForceAccumulator accumulator, boolean onGround)
- public void clipForce(@Nonnull Vector3d value, @Nonnull Vector3d threshold)

Known subclasses: ForceProviderEntity

Also in this package: ForceAccumulator, ForceProvider, ForceProviderEntity, ForceProviderStandardState, PhysicsBodyState, PhysicsBodyStateUpdater, PhysicsBodyStateUpdaterMidpoint, PhysicsBodyStateUpdaterRK4, PhysicsBodyStateUpdaterSymplecticEuler, PhysicsConstants, PhysicsFlags, PhysicsMath

Complete API:
  public abstract double getMass(double var1)
  public abstract double getVolume()
  public abstract double getDensity()
  public abstract double getProjectedArea(PhysicsBodyState var1, double var2)
  public abstract double getFrictionCoefficient()
  public abstract ForceProviderStandardState getForceProviderStandardState()
  public void update(PhysicsBodyState bodyState, ForceAccumulator accumulator, boolean onGround)
  public void clipForce(Vector3d value, Vector3d threshold)

Fields:
public static HytaleLogger LOGGER
protected Vector3d dragForce
