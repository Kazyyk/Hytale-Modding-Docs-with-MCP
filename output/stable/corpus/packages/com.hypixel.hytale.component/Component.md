# Component

Type: interface | Package: com.hypixel.hytale.component | Extends: Cloneable

public interface Component<ECS_TYPE> extends Cloneable

The root interface for all ECS components. Every piece of per-entity data in the ECS framework implements this interface. Components are stored in ArchetypeChunk arrays and accessed via ComponentType handles.

Components must be cloneable because the ECS serialization, entity copying, and archetype migration operations all require deep copies of component data.

## Type Parameters

- `ECS_TYPE` -- the store type parameter (e.g., `EntityStore` or `ChunkStore`)

## Fields


@Nonnull
Component[] EMPTY_ARRAY = new Component[0];

Shared empty array constant used as a default when no components are present.

## Methods


@Nullable
Component<ECS_TYPE> clone();

Creates a deep copy of this component. Returns `null` if the component cannot be cloned.


@Nullable
default Component<ECS_TYPE> cloneSerializable()

Creates a copy containing only serializable state. Defaults to calling `clone()`. Override this when a component contains transient runtime data that should be excluded from persistence.

## Related Types

- ComponentType -- typed handle used to register and access components in the ECS
- ArchetypeChunk -- stores component arrays for entities sharing the same archetype
- Store -- the ECS store that manages entities and their components
- Resource -- the equivalent interface for per-store singleton data
