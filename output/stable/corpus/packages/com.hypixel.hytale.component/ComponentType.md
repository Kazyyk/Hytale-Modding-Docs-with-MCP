# ComponentType

Type: class | Package: com.hypixel.hytale.component | Extends: java.lang.Object | Implements: Comparable<ComponentType<ECS_TYPE, ?>>, Query<ECS_TYPE>

public class ComponentType<ECS_TYPE, T extends Component<ECS_TYPE>> implements Comparable<ComponentType<ECS_TYPE, ?>>, Query<ECS_TYPE>

A typed handle representing a registered component in the ECS. Obtained from IComponentRegistry.registerComponent(). ComponentType serves dual purpose: it is used to access components on entities, and it implements `Query` so it can be used directly as an archetype filter (matching any entity that has this component).

## Type Parameters

- `ECS_TYPE` -- the store type parameter
- `T` -- the concrete component class

## Fields


@Nonnull
public static final ComponentType[] EMPTY_ARRAY = new ComponentType[0];

## Methods


@Nonnull
public ComponentRegistry<ECS_TYPE> getRegistry()

Returns the owning registry.


@Nonnull
public Class<? super T> getTypeClass()

Returns the registered class for this component type.


public int getIndex()

Returns the internal index used for array-based lookups in ArchetypeChunk.


public boolean test(@Nonnull Archetype<ECS_TYPE> archetype)

Query implementation: returns `true` if the archetype contains this component type.


public void validateRegistry(@Nonnull ComponentRegistry<ECS_TYPE> registry)

Throws `IllegalArgumentException` if this type belongs to a different registry.


public void validate()

Throws `IllegalStateException` if this type has been invalidated (unregistered).

## Related Types

- Component -- the interface all components implement
- ComponentRegistration -- the full registration record
- Archetype -- a set of ComponentTypes defining an entity shape
- Store -- uses ComponentType for all component access
