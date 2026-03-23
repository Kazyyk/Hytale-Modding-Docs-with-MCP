---
title: "UseEntityInteraction"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.interaction.interaction.config.client"
fqcn: "com.hypixel.hytale.server.core.modules.interaction.interaction.config.client.UseEntityInteraction"
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
public class UseEntityInteraction extends SimpleInstantInteraction
```

Attempts to use the target entity, executing any interactions configured on it. Resolves the target entity from the client-provided network ID, looks up the entity's `Interactions` component, and runs the interaction associated with the current interaction type. Requires client-side synchronization.

## Codec

`UseEntityInteraction.CODEC` -- `BuilderCodec<UseEntityInteraction>` for JSON deserialization from interaction asset files.

## Related Types

- Parent hierarchy types are in package `com.hypixel.hytale.server.core.modules.interaction.interaction.config`
