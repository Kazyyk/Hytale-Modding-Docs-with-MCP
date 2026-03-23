---
title: "ChargingInteraction"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.interaction.interaction.config.client"
fqcn: "com.hypixel.hytale.server.core.modules.interaction.interaction.config.client.ChargingInteraction"
api_surface: false
extends: "Interaction"
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
public class ChargingInteraction extends Interaction
```

A hold-and-release interaction that executes different follow-up interactions based on how long the input was held. The `Next` map associates charge durations (in seconds) with interaction IDs. Supports indefinite hold via `AllowIndefiniteHold`, a failed branch, mouse sensitivity adjustment during charge, damage-based cancellation (`FailOnDamage`), fork interactions that can run concurrently while charging, and configurable charge delay on incoming damage. Requires client-side synchronization.

## Codec

`ChargingInteraction.CODEC` -- `BuilderCodec<ChargingInteraction>` for JSON deserialization from interaction asset files.

## Related Types

- Parent hierarchy types are in package `com.hypixel.hytale.server.core.modules.interaction.interaction.config`
