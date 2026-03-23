---
title: "AllLegacyEntityTypesQuery"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.entity"
fqcn: "com.hypixel.hytale.server.core.modules.entity.AllLegacyEntityTypesQuery"
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
public class AllLegacyEntityTypesQuery implements Query<EntityStore>
```

A deprecated query that matches all archetypes containing a legacy entity component. Used internally by [EntityModule](EntityModule.md) migration systems (`LegacyTransformSystem`, `LegacyUUIDSystem`, `LegacyUUIDUpdateSystem`) to target all legacy entity types during ECS processing.

Exposed as a singleton via the `INSTANCE` field.

## Fields

```java
@Nonnull
public static final AllLegacyEntityTypesQuery INSTANCE = new AllLegacyEntityTypesQuery();
```

Singleton instance used by all consumers.

## Methods

```java
@Override
public boolean test(@Nonnull Archetype<EntityStore> archetype)
```

Returns `true` if the archetype contains a legacy entity component, as determined by `EntityUtils.hasEntity(archetype)`.

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

- [AllLegacyLivingEntityTypesQuery](AllLegacyLivingEntityTypesQuery.md) -- similar query restricted to living entity types
- [EntityModule](EntityModule.md) -- registers migration systems that use this query
- `EntityUtils` -- provides the `hasEntity()` test
- `Query` -- the ECS query interface this class implements
