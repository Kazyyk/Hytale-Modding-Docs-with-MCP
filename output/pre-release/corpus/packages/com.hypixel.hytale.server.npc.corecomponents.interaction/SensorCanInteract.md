# SensorCanInteract

Type: class | Package: com.hypixel.hytale.server.npc.corecomponents.interaction | Extends: SensorBase

public class SensorCanInteract extends SensorBase

Concrete implementation extending `SensorBase`.

## Fields

- viewCone | float | final float field.
- attitudes | EnumSet<Attitude> | final EnumSet<Attitude> field.

## Constructors

- SensorCanInteract(@Nonnull BuilderSensorCanInteract builder, @Nonnull BuilderSupport support) | Creates a new SensorCanInteract instance.

## Methods

- matches(@Nonnull Ref<EntityStore> ref, @Nonnull Role role, double dt, @Nonnull Store<EntityStore> store) | boolean | public method.
- registerWithSupport(@Nonnull Role role) | void | public method.
- getSensorInfo() | InfoProvider | public method.

Also in this package: ActionLockOnInteractionTarget, ActionSetInteractable, SensorHasInteracted, SensorInteractionContext

Complete API:
  public boolean matches(Ref<EntityStore> ref, Role role, double dt, Store<EntityStore> store)
  public void registerWithSupport(Role role)
  public InfoProvider getSensorInfo()

Fields:
protected final float viewCone
protected final EnumSet<Attitude> attitudes
