---
title: "WakeUpOnDismountSystem"
kind: "class"
package: "com.hypixel.hytale.builtin.beds.sleep.systems.player"
fqcn: "com.hypixel.hytale.builtin.beds.sleep.systems.player.WakeUpOnDismountSystem"
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
public class WakeUpOnDismountSystem extends RefChangeSystem<EntityStore, MountedComponent>
```

Resets the player's somnolence state to AWAKE when they dismount from a bed.
