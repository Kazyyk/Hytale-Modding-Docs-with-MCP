# AllLegacyLivingEntityTypesQuery

Type: class | Package: com.hypixel.hytale.server.core.modules.entity | Implements: Query<EntityStore>

@Deprecated
public class AllLegacyLivingEntityTypesQuery implements Query<EntityStore>

A deprecated query that matches all archetypes containing a legacy living entity component. Similar to AllLegacyEntityTypesQuery but restricted to living entities, as determined by `EntityUtils.hasLivingEntity(archetype)`.

Exposed as a singleton via the `INSTANCE` field.

## Fields


@Nonnull
public static final AllLegacyLivingEntityTypesQuery INSTANCE = new AllLegacyLivingEntityTypesQuery();

Singleton instance used by all consumers.

## Methods


@Override
public boolean test(@Nonnull Archetype<EntityStore> archetype)

Returns `true` if the archetype contains a legacy living entity component, as determined by `EntityUtils.hasLivingEntity(archetype)`.


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

- AllLegacyEntityTypesQuery -- similar query for all entity types (not just living)
- EntityModule -- the module context where these queries are used
- `EntityUtils` -- provides the `hasLivingEntity()` test
- `Query` -- the ECS query interface this class implements
