---
title: "SleepNotificationSystem"
kind: "class"
package: "com.hypixel.hytale.builtin.beds.sleep.systems.player"
fqcn: "com.hypixel.hytale.builtin.beds.sleep.systems.player.SleepNotificationSystem"
api_surface: false
extends: "DelayedSystem<EntityStore>"
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
public class SleepNotificationSystem extends DelayedSystem<EntityStore>
```

Periodically checks sleep readiness and sends notification messages to awake players. Supports small server (named sleeper) and big server (ratio-based) notification modes.
