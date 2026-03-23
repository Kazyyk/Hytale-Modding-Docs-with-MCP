# ActionDisplayName

Type: class | Package: com.hypixel.hytale.server.npc.corecomponents.audiovisual | Extends: ActionBase

public class ActionDisplayName extends ActionBase

## Fields

- protected final String displayName

## Constructors

- public ActionDisplayName(@Nonnull BuilderActionDisplayName builder, @Nonnull BuilderSupport support)

## Methods

- @Override public boolean canExecute(@Nonnull Ref<EntityStore> ref, @Nonnull Role role, InfoProvider sensorInfo, double dt, @Nonnull Store<EntityStore> store)
- @Override public boolean execute(@Nonnull Ref<EntityStore> ref, @Nonnull Role role, InfoProvider sensorInfo, double dt, @Nonnull Store<EntityStore> store)

Also in this package: ActionAppearance, ActionModelAttachment, ActionPlayAnimation, ActionPlaySound, ActionSpawnParticles, SensorAnimation

Complete API:
  public boolean canExecute(Ref<EntityStore> ref, Role role, InfoProvider sensorInfo, double dt, Store<EntityStore> store)
  public boolean execute(Ref<EntityStore> ref, Role role, InfoProvider sensorInfo, double dt, Store<EntityStore> store)

Fields:
protected final String displayName
