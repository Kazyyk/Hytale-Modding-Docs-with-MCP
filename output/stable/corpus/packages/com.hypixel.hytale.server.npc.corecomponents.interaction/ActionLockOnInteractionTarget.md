# ActionLockOnInteractionTarget

Type: class | Package: com.hypixel.hytale.server.npc.corecomponents.interaction | Extends: ActionBase

public class ActionLockOnInteractionTarget extends ActionBase

Concrete implementation extending `ActionBase`.

## Fields

- targetSlot | int | final int field.

## Constructors

- ActionLockOnInteractionTarget(@Nonnull BuilderActionLockOnInteractionTarget builderActionBase, @Nonnull BuilderSupport support) | Creates a new ActionLockOnInteractionTarget instance.

## Methods

- canExecute(@Nonnull Ref<EntityStore> ref, @Nonnull Role role, InfoProvider sensorInfo, double dt, @Nonnull Store<EntityStore> store) | boolean | public method.
- execute(@Nonnull Ref<EntityStore> ref, @Nonnull Role role, InfoProvider sensorInfo, double dt, @Nonnull Store<EntityStore> store) | boolean | public method.

Also in this package: ActionSetInteractable, SensorCanInteract, SensorHasInteracted, SensorInteractionContext

Complete API:
  public boolean canExecute(Ref<EntityStore> ref, Role role, InfoProvider sensorInfo, double dt, Store<EntityStore> store)
  public boolean execute(Ref<EntityStore> ref, Role role, InfoProvider sensorInfo, double dt, Store<EntityStore> store)

Fields:
protected final int targetSlot
