---
title: "BuilderMotionControllerMapUtil"
kind: "class"
package: "com.hypixel.hytale.server.npc.movement.controllers"
fqcn: "com.hypixel.hytale.server.npc.movement.controllers.BuilderMotionControllerMapUtil"
api_surface: false
extends: null
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T00:00:00Z"
tags:
  - "npc"
  - "movement"
  - "controllers"
---

**Package:** `com.hypixel.hytale.server.npc.movement.controllers`

```java
public class BuilderMotionControllerMapUtil
```

Utility class that provides a type token for `Map<String, MotionController>`. Java generics are erased at runtime, so this class captures the concrete `Class` reference of a `HashMap<String, MotionController>` for use by the builder factory system when registering the motion controller map category.

## Fields

| Field | Type | Description |
|---|---|---|
| `CLASS_REFERENCE` | `Class<Map<String, MotionController>>` | Captured class token for the motion controller map type |

Used by [BuilderMotionControllerMap](BuilderMotionControllerMap.md) in its `category()` method to return the correct class reference for factory registration.
