---
title: "ReturnToHubButtonUI"
kind: "class"
package: "com.hypixel.hytale.builtin.creativehub.ui"
fqcn: "com.hypixel.hytale.builtin.creativehub.ui.ReturnToHubButtonUI"
api_surface: false
extends: null
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "builtin"
  - "creativehub"
  - "ui"
  - "class"
---

**Package:** `com.hypixel.hytale.builtin.creativehub.ui`

```java
public final class ReturnToHubButtonUI
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `public static final` | `String` | `ANCHOR_ID` |
| `public static final` | `String` | `ACTION_RETURN_TO_HUB` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public static` | `void` | `register()` |
| `public static` | `void` | `send(PlayerRef playerRef)` |
| `public static` | `void` | `send(PlayerRef playerRef, boolean disabled)` |
| `public static` | `void` | `clear(PlayerRef playerRef)` |
| `public static` | `void` | `executeReturnToHub(PlayerRef playerRef, Ref<EntityStore> ref, Store<EntityStore> store)` |
| `@Nullable private static` | `World` | `findParentHubWorld(Store<EntityStore> store, Ref<EntityStore> ref)` |
