---
title: "ToggleGliderInteraction"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.interaction.interaction.config.client"
fqcn: "com.hypixel.hytale.server.core.modules.interaction.interaction.config.client.ToggleGliderInteraction"
api_surface: false
extends: "SimpleInstantInteraction"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T00:00:00Z"
tags:
  - "interaction"
  - "config"
  - "client"
---

**Package:** `com.hypixel.hytale.server.core.modules.interaction.interaction.config.client`

```java
public class ToggleGliderInteraction extends SimpleInstantInteraction
```

Toggles glider movement for the player. The server-side `firstRun()` is a no-op; the actual glider toggle runs on the client.

## Codec

`ToggleGliderInteraction.CODEC` -- `BuilderCodec<ToggleGliderInteraction>` for JSON deserialization from interaction asset files.

## Related Types

- Parent hierarchy types are in package `com.hypixel.hytale.server.core.modules.interaction.interaction.config`
