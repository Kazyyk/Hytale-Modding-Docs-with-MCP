---
title: "RepeatInteraction"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.interaction.interaction.config.none"
fqcn: "com.hypixel.hytale.server.core.modules.interaction.interaction.config.none.RepeatInteraction"
api_surface: false
extends: "com.hypixel.hytale.server.core.modules.interaction.interaction.config.SimpleInteraction"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "interaction"
  - "server"
---

**Package:** `com.hypixel.hytale.server.core.modules.interaction.interaction.config.none`

```java
public class RepeatInteraction extends SimpleInteraction
```

Forks into a child interaction chain and optionally repeats it a specified number of times (or infinitely with -1). Waits for each fork to complete before repeating or running next/failed chains.
