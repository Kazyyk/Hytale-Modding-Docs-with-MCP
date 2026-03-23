# ActionPlayAnimation

Type: class | Package: com.hypixel.hytale.server.npc.corecomponents.audiovisual | Extends: ActionBase

public class ActionPlayAnimation extends ActionBase

## Fields

- protected final NPCAnimationSlot slot
- @Nullable protected String animationId

## Constructors

- public ActionPlayAnimation(@Nonnull BuilderActionPlayAnimation builderActionPlayAnimation, @Nonnull BuilderSupport support)

## Methods

- @Override public boolean execute(@Nonnull Ref<EntityStore> ref, @Nonnull Role role, InfoProvider sensorInfo, double dt, @Nonnull Store<EntityStore> store)
- protected void setAnimationId(String animationId)
