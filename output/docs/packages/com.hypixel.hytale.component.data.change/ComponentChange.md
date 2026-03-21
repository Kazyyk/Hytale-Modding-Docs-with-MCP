---
title: "ComponentChange"
kind: "class"
package: "com.hypixel.hytale.component.data.change"
fqcn: "com.hypixel.hytale.component.data.change.ComponentChange"
api_surface: false
extends: null
implements: ["DataChange"]
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "component"
  - "data"
  - "change"
  - "class"
---

**Package:** `com.hypixel.hytale.component.data.change`

```java
public class ComponentChange<ECS_TYPE, T> implements DataChange
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private final` | `ChangeType` | `type` |
| `private final` | `ComponentType<ECS_TYPE,T>` | `componentType` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `ChangeType` | `getType()` |
| `public` | `ComponentType<ECS_TYPE,T>` | `getComponentType()` |
| `@Nonnull @Override public` | `String` | `toString()` |
