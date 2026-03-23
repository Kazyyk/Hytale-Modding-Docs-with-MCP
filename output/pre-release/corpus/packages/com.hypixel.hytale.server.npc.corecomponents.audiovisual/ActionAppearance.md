# ActionAppearance

Type: class | Package: com.hypixel.hytale.server.npc.corecomponents.audiovisual | Extends: ActionBase

public class ActionAppearance extends ActionBase

## Fields

- protected final String appearance

## Constructors

- public ActionAppearance(@Nonnull BuilderActionAppearance builderActionAppearance)

## Methods

- @Override public boolean canExecute(@Nonnull Ref<EntityStore> ref, @Nonnull Role role, InfoProvider sensorInfo, double dt, @Nonnull Store<EntityStore> store)
- @Override public boolean execute(@Nonnull Ref<EntityStore> ref, @Nonnull Role role, InfoProvider sensorInfo, double dt, @Nonnull Store<EntityStore> store)

Also in this package: ActionDisplayName, ActionModelAttachment, ActionPlayAnimation, ActionPlaySound, ActionSpawnParticles, SensorAnimation

Complete API:
  public boolean canExecute(Ref<EntityStore> ref, Role role, InfoProvider sensorInfo, double dt, Store<EntityStore> store)
  public boolean execute(Ref<EntityStore> ref, Role role, InfoProvider sensorInfo, double dt, Store<EntityStore> store)

Fields:
protected final String appearance
