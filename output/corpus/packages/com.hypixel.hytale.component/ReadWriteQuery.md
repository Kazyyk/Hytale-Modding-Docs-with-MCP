# ReadWriteQuery

Type: class | Package: com.hypixel.hytale.component | Extends: java.lang.Object | Implements: ReadWriteArchetypeQuery<ECS_TYPE>

public class ReadWriteQuery<ECS_TYPE> implements ReadWriteArchetypeQuery<ECS_TYPE>

A query that distinguishes between read-only and read-write component access. Used by the parallel execution system to determine which archetype chunks can be processed concurrently -- chunks are safe to process in parallel when systems only read shared components and write to disjoint ones.

## Constructor


public ReadWriteQuery(@Nonnull Archetype<ECS_TYPE> read, @Nonnull Archetype<ECS_TYPE> write)

## Methods


public Archetype<ECS_TYPE> getReadArchetype()


public Archetype<ECS_TYPE> getWriteArchetype()

## Related Types

- Archetype -- the read and write archetypes
