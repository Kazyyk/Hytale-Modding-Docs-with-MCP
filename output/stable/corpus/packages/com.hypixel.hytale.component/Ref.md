# Ref

Type: class | Package: com.hypixel.hytale.component | Extends: java.lang.Object

public class Ref<ECS_TYPE>

A lightweight entity reference handle. Ref is the primary way to identify and access an entity in a Store. It contains a volatile index into the store's internal arrays, enabling O(1) component lookups. Refs are created when entities are added and invalidated when entities are removed.

## Type Parameters

- `ECS_TYPE` -- the store type parameter

## Fields


public static final Ref<?>[] EMPTY_ARRAY = new Ref[0];

## Constructors


public Ref(@Nonnull Store<ECS_TYPE> store)

Creates an uninitialized ref for the given store (index = `Integer.MIN_VALUE`).


public Ref(@Nonnull Store<ECS_TYPE> store, int index)

Creates a ref with a specific index.

## Methods


@Nonnull
public Store<ECS_TYPE> getStore()

Returns the store this ref belongs to.


public int getIndex()

Returns the current index. `Integer.MIN_VALUE` means the ref is invalid.


public boolean isValid()

Returns `true` if this ref points to a live entity.


public void validate(@Nonnull Store<ECS_TYPE> store)

Throws `IllegalStateException` if the ref is invalid or belongs to a different store.


public void validate()

Throws `IllegalStateException` if the ref is invalid.

## Related Types

- Store -- the store that owns this ref
- Holder -- portable entity data container used when adding/removing entities
- CommandBuffer -- uses Ref to identify entities in deferred commands
- WeakComponentReference -- a weak reference to a specific component on a specific entity
