---
title: "AnyQuery"
kind: "class"
package: "com.hypixel.hytale.component.query"
fqcn: "com.hypixel.hytale.component.query.AnyQuery"
api_surface: false
extends: null
implements: ["Query"]
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "component"
  - "query"
  - "class"
---

**Package:** `com.hypixel.hytale.component.query`

```java
public class AnyQuery<ECS_TYPE> implements Query
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `static final` | `AnyQuery<?>` | `INSTANCE` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Override public` | `boolean` | `test(Archetype<ECS_TYPE> archetype)` |
| `@Override public` | `boolean` | `requiresComponentType(ComponentType<ECS_TYPE,?> componentType)` |
| `@Override public` | `void` | `validateRegistry(ComponentRegistry<ECS_TYPE> registry)` |
| `@Override public` | `void` | `validate()` |
