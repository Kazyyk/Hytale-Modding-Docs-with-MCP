# CommandBuffer

Type: class | Package: com.hypixel.hytale.component | Extends: java.lang.Object | Implements: ComponentAccessor<ECS_TYPE>

public class CommandBuffer<ECS_TYPE> implements ComponentAccessor<ECS_TYPE>

A deferred command queue for the ECS. Systems receive a CommandBuffer during processing and use it to schedule mutations (add/remove entities, add/remove components, dispatch events) that are applied after the current processing step completes. This prevents concurrent modification of the store during system iteration.

CommandBuffer implements ComponentAccessor, so read operations (`getComponent`, `getResource`, `getArchetype`) are executed immediately against the underlying Store, while write operations are queued.

CommandBuffers are pooled and reused by the Store to minimize allocation.

## Type Parameters

- `ECS_TYPE` -- the store type parameter

## Read Methods (Immediate)


public <T extends Component<ECS_TYPE>> T getComponent(@Nonnull Ref<ECS_TYPE> ref, @Nonnull ComponentType<ECS_TYPE, T> componentType)


@Nonnull
public Archetype<ECS_TYPE> getArchetype(@Nonnull Ref<ECS_TYPE> ref)


@Nonnull
public <T extends Resource<ECS_TYPE>> T getResource(@Nonnull ResourceType<ECS_TYPE, T> resourceType)


@Nonnull
public ECS_TYPE getExternalData()

## Write Methods (Deferred)


@Nonnull
public Ref<ECS_TYPE> addEntity(@Nonnull Holder<ECS_TYPE> holder, @Nonnull AddReason reason)

Queues an entity addition. The returned Ref is pre-allocated but not yet valid.


public void removeEntity(@Nonnull Ref<ECS_TYPE> ref, @Nonnull RemoveReason reason)

Queues an entity removal. The Ref is not immediately invalidated.


public void tryRemoveEntity(@Nonnull Ref<ECS_TYPE> ref, @Nonnull RemoveReason reason)

Queues a removal that silently does nothing if the ref is already invalid.


@Nonnull
public <T extends Component<ECS_TYPE>> T addComponent(@Nonnull Ref<ECS_TYPE> ref, @Nonnull ComponentType<ECS_TYPE, T> componentType)


public <T extends Component<ECS_TYPE>> void removeComponent(@Nonnull Ref<ECS_TYPE> ref, @Nonnull ComponentType<ECS_TYPE, T> componentType)


public <T extends Component<ECS_TYPE>> void tryRemoveComponent(@Nonnull Ref<ECS_TYPE> ref, @Nonnull ComponentType<ECS_TYPE, T> componentType)


public <T extends Component<ECS_TYPE>> void replaceComponent(@Nonnull Ref<ECS_TYPE> ref, @Nonnull ComponentType<ECS_TYPE, T> componentType, @Nonnull T component)

## ECS Event Dispatch


public <Event extends EcsEvent> void invoke(@Nonnull Ref<ECS_TYPE> ref, @Nonnull Event param)


public <Event extends EcsEvent> void invoke(@Nonnull Event param)

## Utility Methods


public void run(@Nonnull Consumer<Store<ECS_TYPE>> consumer)

Queues an arbitrary operation to run against the Store when the buffer is consumed.


@Nonnull
public CommandBuffer<ECS_TYPE> fork()

Creates a child buffer for parallel execution. Child buffers track parent reference removal.


public void mergeParallel(@Nonnull CommandBuffer<ECS_TYPE> commandBuffer)

Merges this buffer's queued commands into the parent buffer.

## Related Types

- Store -- the backing store for reads and eventual writes
- ComponentAccessor -- the interface CommandBuffer implements
- Ref -- entity handles used in all operations
