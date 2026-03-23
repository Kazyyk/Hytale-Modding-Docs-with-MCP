# Resource

Type: interface | Package: com.hypixel.hytale.component | Extends: Cloneable

public interface Resource<ECS_TYPE> extends Cloneable

The root interface for all ECS resources. Resources are per-Store singleton data -- unlike Component which is per-entity, a resource exists once per store and is shared by all systems. Resources are registered via IComponentRegistry.registerResource() and accessed via ResourceType handles.

Resources are loaded and saved through IResourceStorage, enabling persistent store-level data.

## Type Parameters

- `ECS_TYPE` -- the store type parameter

## Fields


Resource[] EMPTY_ARRAY = new Resource[0];

Shared empty array constant.

## Methods


@Nullable
Resource<ECS_TYPE> clone();

Creates a deep copy of this resource. Returns `null` if the resource cannot be cloned.

## Related Types

- ResourceType -- typed handle for registering and accessing resources
- ResourceRegistration -- registration record for a resource
- IResourceStorage -- persistence interface for loading/saving resources
- Component -- the per-entity equivalent
- Store -- holds resource instances and provides access via `getResource()`
