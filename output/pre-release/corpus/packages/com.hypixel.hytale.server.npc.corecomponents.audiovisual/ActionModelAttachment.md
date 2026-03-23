# ActionModelAttachment

Type: class | Package: com.hypixel.hytale.server.npc.corecomponents.audiovisual | Extends: ActionBase

public class ActionModelAttachment extends ActionBase

## Fields

- @Nonnull protected final String slot
- @Nonnull protected final String attachment

## Constructors

- public ActionModelAttachment(@Nonnull BuilderActionModelAttachment builder, @Nonnull BuilderSupport support)

## Methods

- @Override public boolean execute(@Nonnull Ref<EntityStore> ref, @Nonnull Role role, InfoProvider sensorInfo, double dt, @Nonnull Store<EntityStore> store)
- private static void setModelAttachment(@Nonnull Ref<EntityStore> ref, @Nonnull String slot, @Nullable String attachment, @Nonnull ComponentAccessor<EntityStore> componentAccessor)

Also in this package: ActionAppearance, ActionDisplayName, ActionPlayAnimation, ActionPlaySound, ActionSpawnParticles, SensorAnimation

Complete API:
  public boolean execute(Ref<EntityStore> ref, Role role, InfoProvider sensorInfo, double dt, Store<EntityStore> store)
  private static void setModelAttachment(Ref<EntityStore> ref, String slot, String attachment, ComponentAccessor<EntityStore> componentAccessor)

Fields:
protected final String slot
protected final String attachment
