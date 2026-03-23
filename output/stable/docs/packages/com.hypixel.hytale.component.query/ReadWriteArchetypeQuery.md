---
title: "ReadWriteArchetypeQuery"
kind: "interface"
package: "com.hypixel.hytale.component.query"
fqcn: "com.hypixel.hytale.component.query.ReadWriteArchetypeQuery"
api_surface: false
extends: null
implements: ["Query"]
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "component"
  - "query"
  - "interface"
---

**Package:** `com.hypixel.hytale.component.query`

```java
public interface ReadWriteArchetypeQuery<ECS_TYPE> extends Query
```

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `` | `Archetype<ECS_TYPE>` | `getReadArchetype()` |
| `` | `Archetype<ECS_TYPE>` | `getWriteArchetype()` |
| `@Override default` | `boolean` | `test(Archetype<ECS_TYPE> archetype)` |
| `@Override default` | `boolean` | `requiresComponentType(ComponentType<ECS_TYPE,?> componentType)` |
| `@Override default` | `void` | `validateRegistry(ComponentRegistry<ECS_TYPE> registry)` |
| `@Override default` | `void` | `validate()` |
