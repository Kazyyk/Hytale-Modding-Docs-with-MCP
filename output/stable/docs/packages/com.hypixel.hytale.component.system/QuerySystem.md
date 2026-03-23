---
title: "QuerySystem"
kind: "interface"
package: "com.hypixel.hytale.component.system"
fqcn: "com.hypixel.hytale.component.system.QuerySystem"
api_surface: true
extends: "ISystem<ECS_TYPE>"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T18:30:00Z"
tags:
  - "component"
  - "system"
  - "interface"
---

**Package:** `com.hypixel.hytale.component.system`

```java
public interface QuerySystem<ECS_TYPE> extends ISystem<ECS_TYPE>
```

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `default` | `boolean` | `test(ComponentRegistry<ECS_TYPE> componentRegistry, Archetype<ECS_TYPE> archetype)` |
| `@Nullable` | `Query<ECS_TYPE>` | `getQuery()` |
