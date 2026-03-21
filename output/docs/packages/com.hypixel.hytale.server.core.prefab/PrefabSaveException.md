---
title: "PrefabSaveException"
kind: "class"
package: "com.hypixel.hytale.server.core.prefab"
fqcn: "com.hypixel.hytale.server.core.prefab.PrefabSaveException"
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
public class PrefabSaveException extends RuntimeException
```

Runtime exception thrown when a prefab fails to save. Carries a `Type` enum indicating whether the failure was a general `ERROR` or `ALREADY_EXISTS` (for non-overwrite saves).

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private` | `PrefabSaveException.Type` | `type` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `PrefabSaveException.Type` | `getType()` |

## Inner Types

### Type

```java
public static enum Type
```

| Constant |
|---|
| `ERROR` |
| `ALREADY_EXISTS` |
