---
title: "PrefabPasteEvent"
kind: "class"
package: "com.hypixel.hytale.server.core.prefab.event"
fqcn: "com.hypixel.hytale.server.core.prefab.event.PrefabPasteEvent"
api_surface: false
extends: "CancellableEcsEvent"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags:
  - "core"
  - "prefab"
  - "event"
---

**Package:** `com.hypixel.hytale.server.core.prefab.event`

```java
public class PrefabPasteEvent extends CancellableEcsEvent
```

Cancellable ECS event that can be intercepted by event systems.

## Accessors

| Method | Returns | Description |
|---|---|---|
| `getPrefabId()` | `int` | Accessor method. |
| `isPasteStart()` | `boolean` | Boolean accessor. |
