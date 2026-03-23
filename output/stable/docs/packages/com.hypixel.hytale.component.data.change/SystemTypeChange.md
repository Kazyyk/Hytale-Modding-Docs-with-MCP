---
title: "SystemTypeChange"
kind: "class"
package: "com.hypixel.hytale.component.data.change"
fqcn: "com.hypixel.hytale.component.data.change.SystemTypeChange"
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
public class SystemTypeChange<ECS_TYPE, T> implements DataChange
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private final` | `ChangeType` | `type` |
| `private final` | `SystemType<ECS_TYPE,T>` | `systemType` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `ChangeType` | `getType()` |
| `public` | `SystemType<ECS_TYPE,T>` | `getSystemType()` |
| `@Nonnull @Override public` | `String` | `toString()` |
