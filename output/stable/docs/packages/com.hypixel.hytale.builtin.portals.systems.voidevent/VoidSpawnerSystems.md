---
title: "VoidSpawnerSystems"
kind: "class"
package: "com.hypixel.hytale.builtin.portals.systems.voidevent"
fqcn: "com.hypixel.hytale.builtin.portals.systems.voidevent.VoidSpawnerSystems"
api_surface: false
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "builtin"
  - "portals"
  - "systems"
  - "voidevent"
  - "class"
---

**Package:** `com.hypixel.hytale.builtin.portals.systems.voidevent`

```java
public final class VoidSpawnerSystems
```

Container for systems managing void spawner entity lifecycle. The `Instantiate` inner class creates spawn beacons and particle effects on entity add, and cleans them up on removal.

## Inner Types

### Instantiate

```java
public static class VoidSpawnerSystems.Instantiate extends RefSystem<EntityStore>
```

Reference system creating spawn beacons from configured IDs when a void spawner entity is added.
