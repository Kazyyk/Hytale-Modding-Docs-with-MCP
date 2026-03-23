# ForceProviderEntity

Type: class | Package: com.hypixel.hytale.server.core.modules.physics.util | Extends: ForceProviderStandard

@Deprecated public class ForceProviderEntity extends ForceProviderStandard

## Fields

- protected BoundingBox boundingBox
- protected ForceProviderStandardState forceProviderStandardState
- protected double density

## Constructors

- public ForceProviderEntity(BoundingBox boundingBox)

## Methods

- public void setDensity(double density)
- public void setForceProviderStandardState(ForceProviderStandardState forceProviderStandardState)
- @Override public ForceProviderStandardState getForceProviderStandardState()
- @Override public double getMass(double volume)
- @Override public double getVolume()
- @Override public double getProjectedArea(@Nonnull PhysicsBodyState bodyState, double speed)
- @Override public double getDensity()
- @Override public double getFrictionCoefficient()

Also in this package: ForceAccumulator, ForceProvider, ForceProviderStandard, ForceProviderStandardState, PhysicsBodyState, PhysicsBodyStateUpdater, PhysicsBodyStateUpdaterMidpoint, PhysicsBodyStateUpdaterRK4, PhysicsBodyStateUpdaterSymplecticEuler, PhysicsConstants, PhysicsFlags, PhysicsMath

Complete API:
  public void setDensity(double density)
  public void setForceProviderStandardState(ForceProviderStandardState forceProviderStandardState)
  public ForceProviderStandardState getForceProviderStandardState()
  public double getMass(double volume)
  public double getVolume()
  public double getProjectedArea(PhysicsBodyState bodyState, double speed)
  public double getDensity()
  public double getFrictionCoefficient()

Fields:
protected BoundingBox boundingBox
protected ForceProviderStandardState forceProviderStandardState
protected double density
