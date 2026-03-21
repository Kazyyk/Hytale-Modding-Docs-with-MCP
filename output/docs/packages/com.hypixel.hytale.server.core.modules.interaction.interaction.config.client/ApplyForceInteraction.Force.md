---
title: "ApplyForceInteraction.Force"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.interaction.interaction.config.client"
fqcn: "com.hypixel.hytale.server.core.modules.interaction.interaction.config.client.ApplyForceInteraction.Force"
api_surface: false
extends: ~
implements: 
  - "NetworkSerializable<AppliedForce>"
generator_version: "2.0.0"
generated_at: "2026-03-20T00:00:00Z"
tags:
  - "interaction"
  - "config"
  - "client"
---

**Package:** `com.hypixel.hytale.server.core.modules.interaction.interaction.config.client`

```java
public static class ApplyForceInteraction.Force implements NetworkSerializable<AppliedForce>
```

Configures a single force vector with direction, magnitude, and optional vertical adjustment based on the player's look angle. Direction is normalized during decoding.
