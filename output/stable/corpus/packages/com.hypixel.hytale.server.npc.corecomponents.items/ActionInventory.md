# ActionInventory

Type: class | Package: com.hypixel.hytale.server.npc.corecomponents.items | Extends: ActionBase

public class ActionInventory extends ActionBase

## Fields

- protected final ActionInventory.Operation operation
- protected final String item
- protected final int count
- protected final boolean useTarget
- protected final byte slot
- private final String description

## Methods

- public ActionInventory(@Nonnull BuilderActionInventory builder, @Nonnull BuilderSupport support)
- public boolean canExecute( @Nonnull Ref<EntityStore> ref, @Nonnull Role role, @Nullable InfoProvider sensorInfo, double dt, @Nonnull Store<EntityStore> store )
- public boolean execute(@Nonnull Ref<EntityStore> ref, @Nonnull Role role, @Nonnull InfoProvider sensorInfo, double dt, @Nonnull Store<EntityStore> store)
- public String get()
