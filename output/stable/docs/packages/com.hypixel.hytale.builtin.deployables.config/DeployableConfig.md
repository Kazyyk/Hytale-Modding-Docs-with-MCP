---
title: "DeployableConfig"
kind: "class"
package: "com.hypixel.hytale.builtin.deployables.config"
fqcn: "com.hypixel.hytale.builtin.deployables.config.DeployableConfig"
api_surface: false
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags:
  - "deployables"
  - "config"
---

**Package:** `com.hypixel.hytale.builtin.deployables.config`

```java
public abstract class DeployableConfig
```

Abstract base configuration for all deployable types. Defines common properties: ID, model, model scale, max live count, live duration, invulnerability, sound events (deploy/despawn/die/ambient), particles, hitbox collision, debug visuals, wall placement, and stat values. Codec-registered via `CodecMapCodec` with a `Type` discriminator.
