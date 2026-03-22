---
title: "ChangeActiveSlotInteraction"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.interaction.interaction.config.none"
fqcn: "com.hypixel.hytale.server.core.modules.interaction.interaction.config.none.ChangeActiveSlotInteraction"
api_surface: false
extends: "com.hypixel.hytale.server.core.modules.interaction.interaction.config.Interaction"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "interaction"
  - "server"
---

**Package:** `com.hypixel.hytale.server.core.modules.interaction.interaction.config.none`

```java
public class ChangeActiveSlotInteraction extends Interaction
```

Changes the active hotbar slot for the interaction user. Optionally targets a specific slot index (0-8) or reads the target from context metadata. Forks into a `SwapTo` interaction after switching.
