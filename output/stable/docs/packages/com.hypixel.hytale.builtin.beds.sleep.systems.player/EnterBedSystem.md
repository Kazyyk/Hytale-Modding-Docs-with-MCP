---
title: "EnterBedSystem"
kind: "class"
package: "com.hypixel.hytale.builtin.beds.sleep.systems.player"
fqcn: "com.hypixel.hytale.builtin.beds.sleep.systems.player.EnterBedSystem"
api_surface: false
extends: "RefChangeSystem<EntityStore, MountedComponent>"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T06:08:32Z"
tags:
  - "sleep"
  - "beds"
  - "system"
---

**Package:** `com.hypixel.hytale.builtin.beds.sleep.systems.player`

```java
public class EnterBedSystem extends RefChangeSystem<EntityStore, MountedComponent>
```

Monitors mount component changes to detect when a player enters a bed. Validates sleep conditions (time of day, sleep enabled) and sends appropriate feedback messages.
