# BodyMotionTestProbe

Type: class | Package: com.hypixel.hytale.server.npc.corecomponents.debug | Extends: BodyMotionBase

public class BodyMotionTestProbe extends BodyMotionBase

Concrete implementation extending `BodyMotionBase`.

## Fields

- adjustX | double | final double field.
- adjustZ | double | final double field.
- adjustDistance | double | final double field.
- snapAngle | float | final float field.
- displayText | boolean | boolean field.

## Constructors

- BodyMotionTestProbe(@Nonnull BuilderBodyMotionTestProbe builderBodyMotionTestProbe) | Creates a new BodyMotionTestProbe instance.

## Methods

- activate(@Nonnull Ref<EntityStore> ref, @Nonnull Role role, @Nonnull ComponentAccessor<EntityStore> componentAccessor) | void | public method.

Also in this package: ActionLog, ActionTest

Complete API:
  public void activate(Ref<EntityStore> ref, Role role, ComponentAccessor<EntityStore> componentAccessor)
  public boolean computeSteering(Ref<EntityStore> ref, Role role, InfoProvider sensorInfo, double dt, Steering desiredSteering, ComponentAccessor<EntityStore> componentAccessor)

Fields:
protected final double adjustX
protected final double adjustZ
protected final double adjustDistance
protected final float snapAngle
protected boolean displayText
protected final Vector3d direction
protected final ProbeMoveData probeMoveData
