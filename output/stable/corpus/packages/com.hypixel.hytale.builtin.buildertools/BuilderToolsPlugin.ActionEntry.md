# BuilderToolsPlugin.ActionEntry

Type: class | Package: com.hypixel.hytale.builtin.buildertools

public static class ActionEntry

Pairs an Action type with a list of `SelectionSnapshot<?>` objects that can be restored for undo/redo. Stored in the undo and redo queues of BuilderState.

## Constructors


public ActionEntry(BuilderToolsPlugin.Action action, SelectionSnapshot<?> snapshots)

Creates an entry with a single snapshot (wrapped in a singleton list).


public ActionEntry(BuilderToolsPlugin.Action action, List<SelectionSnapshot<?>> snapshots)

Creates an entry with multiple snapshots.

## Methods

### getAction


public BuilderToolsPlugin.Action getAction()

Returns the action type.

### restore


@Nonnull
public BuilderToolsPlugin.ActionEntry restore(Ref<EntityStore> ref, Player player, World world, ComponentAccessor<EntityStore> componentAccessor)

Restores all snapshots and returns a new `ActionEntry` containing the inverse snapshots (for re-doing the undo, or vice versa). Each snapshot's `restore()` produces a new snapshot representing the state before the restore.

For `ROTATE` actions, special handling removes entities from the previous rotation (via `EntityRemoveSnapshot`) before processing the remaining snapshots, and tracks newly created entity refs in PrototypePlayerBuilderToolSettings for future undo operations.

## Related Types

- BuilderToolsPlugin.Action -- the action enum
- BuilderToolsPlugin.BuilderState -- stores entries in undo/redo queues

Also in this package: Action, BlockColorEntry, BlockColorIndex, BlocksSampleData, BuilderState, BuilderToolsConfig, BuilderToolsPacketHandler, BuilderToolsPlugin, BuilderToolsSystems, BuilderToolsUserData, BuilderToolsUserDataSystem, CachedAccessor, CopyCutSettings, EditOperation, EnsureBuilderTools, EntityChange, FluidChange, PrefabCopyException, PrefabPasteEventSystem, PrototypePlayerBuilderToolSettings (and 2 more)

Complete API:
  public BuilderToolsPlugin.Action getAction()
  public BuilderToolsPlugin.ActionEntry restore(Ref<EntityStore> ref, Player player, World world, ComponentAccessor<EntityStore> componentAccessor)

Fields:
private final BuilderToolsPlugin.Action action
private final List<SelectionSnapshot<?>> snapshots
