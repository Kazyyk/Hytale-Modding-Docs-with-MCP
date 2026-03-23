# ResourceType

Type: class | Package: com.hypixel.hytale.component | Extends: java.lang.Object | Implements: Comparable<ResourceType<ECS_TYPE, ?>>

public class ResourceType<ECS_TYPE, T extends Resource<ECS_TYPE>> implements Comparable<ResourceType<ECS_TYPE, ?>>

A typed handle representing a registered resource in the ECS. Obtained from IComponentRegistry.registerResource(). Used to access per-store singleton data via `Store.getResource()`.

## Type Parameters

- `ECS_TYPE` -- the store type parameter
- `T` -- the concrete resource class

## Fields


@Nonnull
public static final ResourceType[] EMPTY_ARRAY = new ResourceType[0];

## Methods


@Nonnull
public ComponentRegistry<ECS_TYPE> getRegistry()


@Nonnull
public Class<? super T> getTypeClass()


public int getIndex()


public void validateRegistry(@Nonnull ComponentRegistry<ECS_TYPE> registry)


public void validate()

## Related Types

- Resource -- the interface all resources implement
- ResourceRegistration -- the full registration record
- Store -- uses ResourceType to access resources
- IResourceStorage -- loads and saves resources by type
