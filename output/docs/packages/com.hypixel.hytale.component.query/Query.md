---
title: "Query"
kind: "interface"
package: "com.hypixel.hytale.component.query"
fqcn: "com.hypixel.hytale.component.query.Query"
api_surface: true
extends: null
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "component"
  - "query"
  - "interface"
---

**Package:** `com.hypixel.hytale.component.query`

```java
public interface Query<ECS_TYPE>
```

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nonnull static` | `AnyQuery<ECS_TYPE>` | `any()` |
| `@Nonnull static` | `NotQuery<ECS_TYPE>` | `not(Query<ECS_TYPE> query)` |
| `@Nonnull @SafeVarargs static` | `AndQuery<ECS_TYPE>` | `and(Query<ECS_TYPE> queries)` |
| `@Nonnull @SafeVarargs static` | `OrQuery<ECS_TYPE>` | `or(Query<ECS_TYPE> queries)` |
| `` | `boolean` | `test(Archetype<ECS_TYPE> var1)` |
| `` | `boolean` | `requiresComponentType(ComponentType<ECS_TYPE,?> var1)` |
| `` | `void` | `validateRegistry(ComponentRegistry<ECS_TYPE> var1)` |
| `` | `void` | `validate()` |
