---
title: "ReplaceInteraction"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.interaction.interaction.config.none"
fqcn: "com.hypixel.hytale.server.core.modules.interaction.interaction.config.none.ReplaceInteraction"
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
public class ReplaceInteraction extends Interaction
```

Looks up an interaction variable by name and runs the referenced root interaction. Falls back to a default value if the variable is not set. Logs a warning when no replacement is found and `DefaultOk` is false.
