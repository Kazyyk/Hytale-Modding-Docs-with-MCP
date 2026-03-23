---
title: "SerialInteraction"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.interaction.interaction.config.none"
fqcn: "com.hypixel.hytale.server.core.modules.interaction.interaction.config.none.SerialInteraction"
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
public class SerialInteraction extends Interaction
```

Compiles a list of child interactions to run sequentially. The `tick0` method is never called directly; instead, `compile` inlines child interactions into the operations builder.
