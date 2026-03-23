# ActionLog

Type: class | Package: com.hypixel.hytale.server.npc.corecomponents.debug | Extends: ActionBase

public class ActionLog extends ActionBase

Concrete implementation extending `ActionBase`.

## Fields

- text | String | final String field.

## Constructors

- ActionLog(@Nonnull BuilderActionLog builder, @Nonnull BuilderSupport support) | Creates a new ActionLog instance.

## Methods

- canExecute(@Nonnull Ref<EntityStore> ref, @Nonnull Role role, InfoProvider sensorInfo, double dt, @Nonnull Store<EntityStore> store) | boolean | public method.
- execute(@Nonnull Ref<EntityStore> ref, @Nonnull Role role, InfoProvider sensorInfo, double dt, @Nonnull Store<EntityStore> store) | boolean | public method.

Also in this package: ActionTest, BodyMotionTestProbe

Complete API:
  public boolean canExecute(Ref<EntityStore> ref, Role role, InfoProvider sensorInfo, double dt, Store<EntityStore> store)
  public boolean execute(Ref<EntityStore> ref, Role role, InfoProvider sensorInfo, double dt, Store<EntityStore> store)

Fields:
protected final String text
