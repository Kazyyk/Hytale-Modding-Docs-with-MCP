---
title: "SpatialQueryDebug"
kind: "class"
package: "com.hypixel.hytale.builtin.portals.utils.posqueries"
fqcn: "com.hypixel.hytale.builtin.portals.utils.posqueries.SpatialQueryDebug"
api_surface: false
extends: null
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "builtin"
  - "portals"
  - "utils"
  - "posqueries"
  - "class"
---

**Package:** `com.hypixel.hytale.builtin.portals.utils.posqueries`

```java
public class SpatialQueryDebug
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private final` | `StringBuilder` | `builder` |
| `private` | `String` | `indent` |
| `private final` | `Stack<String>` | `scope` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nonnull public` | `SpatialQueryDebug` | `appendLine(String string)` |
| `@Nonnull public` | `SpatialQueryDebug` | `indent(String scopeReason)` |
| `@Nonnull public` | `SpatialQueryDebug` | `unindent()` |
| `@Nonnull public static` | `String` | `fmt(Vector3d point)` |
| `@Nonnull @Override public` | `String` | `toString()` |
