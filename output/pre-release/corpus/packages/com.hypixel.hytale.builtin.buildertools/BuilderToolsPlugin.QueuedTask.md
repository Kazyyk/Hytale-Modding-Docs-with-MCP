# BuilderToolsPlugin.QueuedTask

Type: class | Package: com.hypixel.hytale.builtin.buildertools

private static final class QueuedTask

Private wrapper class for asynchronous builder tool operations queued for execution on the world thread. Each task holds a `ThrowableTriConsumer` that receives a player entity ref, the builder state, and a component accessor.

## Constructor


private QueuedTask(
    @Nonnull ThrowableTriConsumer<Ref<EntityStore>, BuilderToolsPlugin.BuilderState, ComponentAccessor<EntityStore>, ? extends Throwable> biTask
)

## Methods

### execute


void execute(
    @Nonnull Ref<EntityStore> ref,
    @Nonnull BuilderToolsPlugin.BuilderState state,
    @Nonnull ComponentAccessor<EntityStore> defaultComponentAccessor
) throws Throwable

Executes the wrapped task by calling `task.acceptNow()` with the given arguments.

## Visibility

This class has `private` visibility and is only accessible within BuilderToolsPlugin.

## Related Types

- BuilderToolsPlugin.BuilderState -- creates and dequeues these tasks
- BuilderToolsPlugin -- enclosing class

Also in this package: Action, ActionEntry, BlockColorEntry, BlockColorIndex, BlocksSampleData, BuilderState, BuilderToolsConfig, BuilderToolsPacketHandler, BuilderToolsPlugin, BuilderToolsSystems, BuilderToolsUserData, BuilderToolsUserDataSystem, CachedAccessor, CopyCutSettings, EditOperation, EnsureBuilderTools, EntityChange, FluidChange, PrefabCopyException, PrefabPasteEventSystem (and 2 more)

Complete API:
  void execute(Ref<EntityStore> ref, BuilderToolsPlugin.BuilderState state, ComponentAccessor<EntityStore> defaultComponentAccessor)

Fields:
private final ThrowableTriConsumer<Ref<EntityStore>,BuilderToolsPlugin.BuilderState,ComponentAccessor<EntityStore>,? extends Throwable> task
