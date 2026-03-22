---
title: "PrefabLoadException"
kind: "class"
package: "com.hypixel.hytale.server.core.prefab"
fqcn: "com.hypixel.hytale.server.core.prefab.PrefabLoadException"
api_surface: false
extends: "RuntimeException"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "prefab"
  - "exception"
---

**Package:** `com.hypixel.hytale.server.core.prefab`

```java
public class PrefabLoadException extends RuntimeException
```

Runtime exception thrown when a prefab fails to load. Carries a `Type` enum indicating whether the failure was a general `ERROR` or `NOT_FOUND`.

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private` | `PrefabLoadException.Type` | `type` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `PrefabLoadException.Type` | `getType()` |

## Inner Types

### Type

```java
public static enum Type
```

| Constant |
|---|
| `ERROR` |
| `NOT_FOUND` |
