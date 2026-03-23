# ActionOverrideAttitude

Type: class | Package: com.hypixel.hytale.server.npc.corecomponents.entity | Extends: ActionBase

public class ActionOverrideAttitude extends ActionBase

## Fields

- protected final Attitude attitude
- protected final double duration
- Ref<EntityStore> target

## Constructors

- public ActionOverrideAttitude(@Nonnull BuilderActionOverrideAttitude builder, @Nonnull BuilderSupport support)

## Methods

- public boolean canExecute(@Nonnull Ref<EntityStore> ref, @Nonnull Role role, @Nullable InfoProvider sensorInfo, double dt, @Nonnull Store<EntityStore> store)
- public boolean execute(@Nonnull Ref<EntityStore> ref, @Nonnull Role role, @Nonnull InfoProvider sensorInfo, double dt, @Nonnull Store<EntityStore> store)
