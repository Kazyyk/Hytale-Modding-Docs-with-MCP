---
title: "BuilderActionSetAlarm"
kind: "class"
package: "com.hypixel.hytale.server.npc.corecomponents.timer.builders"
fqcn: "com.hypixel.hytale.server.npc.corecomponents.timer.builders.BuilderActionSetAlarm"
api_surface: false
extends: "BuilderActionBase"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags:
  - "npc"
  - "timer"
  - "builder"
---

**Package:** `com.hypixel.hytale.server.npc.corecomponents.timer.builders`

```java
public class BuilderActionSetAlarm extends BuilderActionBase
```

Builder for [ActionSetAlarm](../com.hypixel.hytale.server.npc.corecomponents.timer/ActionSetAlarm.md). Reads `Name` (alarm name) and `DurationRange` (temporal range) from JSON configuration. Duration range of `["P0D", "P0D"]` will unset the alarm.
