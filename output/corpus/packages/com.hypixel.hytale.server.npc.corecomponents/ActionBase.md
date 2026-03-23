# ActionBase

Type: class | Package: com.hypixel.hytale.server.npc.corecomponents | Extends: AnnotatedComponentBase | Implements: Action

public abstract class ActionBase extends AnnotatedComponentBase implements Action

## Fields

- protected boolean once
- protected boolean triggered
- protected boolean active

## Constructors

- public ActionBase(@Nonnull BuilderActionBase builderActionBase)

## Methods

- @Override public boolean canExecute(@Nonnull Ref<EntityStore> ref, @Nonnull Role role, InfoProvider sensorInfo, double dt, @Nonnull Store<EntityStore> store)
- @Override public boolean execute(@Nonnull Ref<EntityStore> ref, @Nonnull Role role, InfoProvider sensorInfo, double dt, @Nonnull Store<EntityStore> store)
- @Override public void activate(Role role, InfoProvider infoProvider)
- @Override public void deactivate(Role role, InfoProvider infoProvider)
- @Override public boolean isActivated()
- @Override public boolean isTriggered()
- @Override public void clearOnce()
- @Override public void setOnce()
- @Override public boolean processDelay(float dt)
