---
title: "SelectInteraction"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.interaction.interaction.config.none"
fqcn: "com.hypixel.hytale.server.core.modules.interaction.interaction.config.none.SelectInteraction"
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
public class SelectInteraction extends SimpleInteraction
```

Area selection interaction that uses a `Selector` to find entities and blocks each tick. Forks into `HitEntity` or `HitBlock` chains per target found. Supports entity match rules, owner ignoring, fail-on conditions, and client-sourced snapshots.
