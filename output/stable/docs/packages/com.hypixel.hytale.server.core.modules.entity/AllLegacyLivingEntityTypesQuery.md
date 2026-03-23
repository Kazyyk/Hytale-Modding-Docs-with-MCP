---
title: "AllLegacyLivingEntityTypesQuery"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.entity"
fqcn: "com.hypixel.hytale.server.core.modules.entity.AllLegacyLivingEntityTypesQuery"
api_surface: false
extends: ~
implements:
  - "Query<EntityStore>"
generator_version: "2.0.0"
generated_at: "2026-03-21T02:13:02Z"
tags:
  - "entity"
  - "module"
---

**Package:** `com.hypixel.hytale.server.core.modules.entity`

```java
@Deprecated
public class AllLegacyLivingEntityTypesQuery implements Query<EntityStore>
```

A deprecated query that matches all archetypes containing a legacy living entity component. Similar to [AllLegacyEntityTypesQuery](AllLegacyEntityTypesQuery.md) but restricted to living entities, as determined by `EntityUtils.hasLivingEntity(archetype)`.

Exposed as a singleton via the `INSTANCE` field.

## Fields

```java
@Nonnull
public static final AllLegacyLivingEntityTypesQuery INSTANCE = new AllLegacyLivingEntityTypesQuery();
```

Singleton instance used by all consumers.

## Methods

```java
@Override
public boolean test(@Nonnull Archetype<EntityStore> archetype)
```

Returns `true` if the archetype contains a legacy living entity component, as determined by `EntityUtils.hasLivingEntity(archetype)`.

```java
@Override
public boolean requiresComponentType(ComponentType<EntityStore, ?> componentType)
```

Always returns `false`. This query does not require any specific component type for incremental matching.

```java
@Override
public void validateRegistry(@Nonnull ComponentRegistry<EntityStore> registry)
```

No-op. No validation is performed.

```java
@Override
public void validate()
```

No-op. No validation is performed.

## Related Types

- [AllLegacyEntityTypesQuery](AllLegacyEntityTypesQuery.md) -- similar query for all entity types (not just living)
- [EntityModule](EntityModule.md) -- the module context where these queries are used
- `EntityUtils` -- provides the `hasLivingEntity()` test
- `Query` -- the ECS query interface this class implements
