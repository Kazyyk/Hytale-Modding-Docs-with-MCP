---
title: "SystemGroupChange"
kind: "class"
package: "com.hypixel.hytale.component.data.change"
fqcn: "com.hypixel.hytale.component.data.change.SystemGroupChange"
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
public class SystemGroupChange<ECS_TYPE> implements DataChange
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private final` | `ChangeType` | `type` |
| `private final` | `SystemGroup<ECS_TYPE>` | `systemGroup` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `ChangeType` | `getType()` |
| `public` | `SystemGroup<ECS_TYPE>` | `getSystemGroup()` |
| `@Nonnull @Override public` | `String` | `toString()` |
