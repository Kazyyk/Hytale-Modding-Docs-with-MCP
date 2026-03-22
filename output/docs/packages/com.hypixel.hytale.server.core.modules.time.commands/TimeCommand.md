---
title: "TimeCommand"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.time.commands"
fqcn: "com.hypixel.hytale.server.core.modules.time.commands.TimeCommand"
api_surface: false
extends: "AbstractWorldCommand"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "command"
  - "time"
---

**Package:** `com.hypixel.hytale.server.core.modules.time.commands`

```java
public class TimeCommand extends AbstractWorldCommand
```

The `/time` command implementation. Displays current game time, day/week/year info, and moon phase. Sub-commands: set time by hour, set named period (Dawn/Midday/Dusk/Midnight), pause, and dilation (0.01--4.0x). Requires Creative permission group. Contains inner enum `TimeOfDay` and inner classes for each sub-command variant.
