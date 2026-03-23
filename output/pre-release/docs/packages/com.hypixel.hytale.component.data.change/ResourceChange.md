---
title: "ResourceChange"
kind: "class"
package: "com.hypixel.hytale.component.data.change"
fqcn: "com.hypixel.hytale.component.data.change.ResourceChange"
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
public class ResourceChange<ECS_TYPE, T> implements DataChange
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private final` | `ChangeType` | `type` |
| `private final` | `ResourceType<ECS_TYPE,T>` | `resourceType` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `ChangeType` | `getType()` |
| `public` | `ResourceType<ECS_TYPE,T>` | `getResourceType()` |
| `@Nonnull @Override public` | `String` | `toString()` |
