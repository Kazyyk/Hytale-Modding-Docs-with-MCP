---
title: "ExactArchetypeQuery"
kind: "class"
package: "com.hypixel.hytale.component.query"
fqcn: "com.hypixel.hytale.component.query.ExactArchetypeQuery"
api_surface: true
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
public class ExactArchetypeQuery<ECS_TYPE> implements Query
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private final` | `Archetype<ECS_TYPE>` | `archetype` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `Archetype<ECS_TYPE>` | `getArchetype()` |
| `@Override public` | `boolean` | `test(Archetype<ECS_TYPE> archetype)` |
| `@Override public` | `boolean` | `requiresComponentType(ComponentType<ECS_TYPE,?> componentType)` |
| `@Override public` | `void` | `validateRegistry(ComponentRegistry<ECS_TYPE> registry)` |
| `@Override public` | `void` | `validate()` |
