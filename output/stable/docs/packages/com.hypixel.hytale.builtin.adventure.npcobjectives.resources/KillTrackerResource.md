---
title: "KillTrackerResource"
kind: "class"
package: "com.hypixel.hytale.builtin.adventure.npcobjectives.resources"
fqcn: "com.hypixel.hytale.builtin.adventure.npcobjectives.resources.KillTrackerResource"
api_surface: false
extends: ~
implements: ['Resource']
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags:
  - "adventure"
  - "npcobjectives"
  - "resources"
---

**Package:** `com.hypixel.hytale.builtin.adventure.npcobjectives.resources`

```java
public class KillTrackerResource implements Resource<EntityStore>
```

ECS resource attached to `EntityStore`.

## Accessors

| Method | Returns | Description |
|---|---|---|
| `getResourceType()` | `ResourceType<EntityStore, KillTrackerResource>` | Accessor method. |
| `getKillTasks()` | `List<KillTaskTransaction>` | Accessor method. |

## Methods

| Method | Returns | Description |
|---|---|---|
| `watch(KillTaskTransaction task)` | `void` | Instance method. |
| `unwatch(KillTaskTransaction task)` | `void` | Instance method. |
