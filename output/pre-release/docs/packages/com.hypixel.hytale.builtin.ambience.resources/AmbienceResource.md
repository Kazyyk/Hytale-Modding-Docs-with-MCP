---
title: "AmbienceResource"
kind: "class"
package: "com.hypixel.hytale.builtin.ambience.resources"
fqcn: "com.hypixel.hytale.builtin.ambience.resources.AmbienceResource"
api_surface: false
extends: ~
implements: ['Resource']
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags:
  - "builtin"
  - "ambience"
  - "resources"
---

**Package:** `com.hypixel.hytale.builtin.ambience.resources`

```java
public class AmbienceResource implements Resource<EntityStore>
```

ECS resource attached to `EntityStore`.

## Accessors

| Method | Returns | Description |
|---|---|---|
| `getResourceType()` | `ResourceType<EntityStore, AmbienceResource>` | Accessor method. |
| `setForcedMusicAmbience(String musicAmbienceId)` | `void` | Mutator method. |
| `getForcedMusicIndex()` | `int` | Accessor method. |
