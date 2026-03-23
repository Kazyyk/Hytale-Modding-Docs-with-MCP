# ActionPickUpItem

Type: class | Package: com.hypixel.hytale.server.npc.corecomponents.items | Extends: ActionWithDelay

public class ActionPickUpItem extends ActionWithDelay

## Fields

- protected final double range
- protected final ActionPickUpItem.StorageTarget storageTarget
- protected final boolean hoover
- protected final List<String> hooverItems
- private final String description

## Methods

- public ActionPickUpItem(@Nonnull BuilderActionPickUpItem builder, @Nonnull BuilderSupport support)
- public void registerWithSupport(@Nonnull Role role)
- public boolean canExecute( @Nonnull Ref<EntityStore> ref, @Nonnull Role role, @Nullable InfoProvider sensorInfo, double dt, @Nonnull Store<EntityStore> store )
- public boolean execute(@Nonnull Ref<EntityStore> ref, @Nonnull Role role, @Nullable InfoProvider sensorInfo, double dt, @Nonnull Store<EntityStore> store)
- protected boolean filterItem(@Nonnull Ref<EntityStore> ref, Role role, @Nonnull ComponentAccessor<EntityStore> componentAccessor)
- public String get()
