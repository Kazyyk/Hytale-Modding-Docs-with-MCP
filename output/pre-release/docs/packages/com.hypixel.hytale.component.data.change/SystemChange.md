---
title: "SystemChange"
kind: "class"
package: "com.hypixel.hytale.component.data.change"
fqcn: "com.hypixel.hytale.component.data.change.SystemChange"
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
public class SystemChange<ECS_TYPE> implements DataChange
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private final` | `ChangeType` | `type` |
| `private final` | `ISystem<ECS_TYPE>` | `system` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `ChangeType` | `getType()` |
| `public` | `ISystem<ECS_TYPE>` | `getSystem()` |
| `@Nonnull @Override public` | `String` | `toString()` |
