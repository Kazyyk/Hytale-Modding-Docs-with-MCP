# AllLegacyEntityTypesQuery

Type: class | Package: com.hypixel.hytale.server.core.modules.entity | Implements: Query<EntityStore>

@Deprecated
public class AllLegacyEntityTypesQuery implements Query<EntityStore>

A deprecated query that matches all archetypes containing a legacy entity component. Used internally by EntityModule migration systems (`LegacyTransformSystem`, `LegacyUUIDSystem`, `LegacyUUIDUpdateSystem`) to target all legacy entity types during ECS processing.

Exposed as a singleton via the `INSTANCE` field.

## Fields


@Nonnull
public static final AllLegacyEntityTypesQuery INSTANCE = new AllLegacyEntityTypesQuery();

Singleton instance used by all consumers.

## Methods


@Override
public boolean test(@Nonnull Archetype<EntityStore> archetype)

Returns `true` if the archetype contains a legacy entity component, as determined by `EntityUtils.hasEntity(archetype)`.


@Override
public boolean requiresComponentType(ComponentType<EntityStore, ?> componentType)

Always returns `false`. This query does not require any specific component type for incremental matching.


@Override
public void validateRegistry(@Nonnull ComponentRegistry<EntityStore> registry)

No-op. No validation is performed.


@Override
public void validate()

No-op. No validation is performed.

## Related Types

- AllLegacyLivingEntityTypesQuery -- similar query restricted to living entity types
- EntityModule -- registers migration systems that use this query
- `EntityUtils` -- provides the `hasEntity()` test
- `Query` -- the ECS query interface this class implements
