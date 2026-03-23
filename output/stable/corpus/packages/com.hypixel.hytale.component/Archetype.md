# Archetype

Type: class | Package: com.hypixel.hytale.component | Extends: java.lang.Object | Implements: Query<ECS_TYPE>

public class Archetype<ECS_TYPE> implements Query<ECS_TYPE>

Represents a unique combination of ComponentType instances that defines an entity's shape. Entities with identical archetypes are stored together in the same ArchetypeChunk, enabling cache-friendly iteration. Archetype also implements `Query`, matching any entity whose archetype contains all of this archetype's component types.

Archetypes are immutable. Adding or removing a component produces a new Archetype instance.

## Type Parameters

- `ECS_TYPE` -- the store type parameter

## Static Factory Methods


public static <ECS_TYPE> Archetype<ECS_TYPE> empty()


@Nonnull
public static <ECS_TYPE> Archetype<ECS_TYPE> of(@Nonnull ComponentType<ECS_TYPE, ?> componentType)


@SafeVarargs
public static <ECS_TYPE> Archetype<ECS_TYPE> of(@Nonnull ComponentType<ECS_TYPE, ?>... componentTypes)


@Nonnull
public static <ECS_TYPE, T extends Component<ECS_TYPE>> Archetype<ECS_TYPE> add(@Nonnull Archetype<ECS_TYPE> archetype, @Nonnull ComponentType<ECS_TYPE, T> componentType)


public static <ECS_TYPE, T extends Component<ECS_TYPE>> Archetype<ECS_TYPE> remove(@Nonnull Archetype<ECS_TYPE> archetype, @Nonnull ComponentType<ECS_TYPE, T> componentType)

## Query Methods


public int count()

Returns the number of component types in this archetype.


public boolean isEmpty()


public boolean contains(@Nonnull ComponentType<ECS_TYPE, ?> componentType)


public boolean contains(@Nonnull Archetype<ECS_TYPE> archetype)

Returns `true` if this archetype contains all component types in the given archetype.


@Nonnull
public ExactArchetypeQuery<ECS_TYPE> asExactQuery()

Returns an exact-match query for this specific archetype.

## Related Types

- ArchetypeChunk -- stores entities sharing the same archetype
- ComponentType -- the component handles that compose an archetype
- Holder -- carries an Archetype alongside component data
