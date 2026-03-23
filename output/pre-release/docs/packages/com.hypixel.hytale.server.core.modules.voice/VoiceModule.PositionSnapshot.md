---
title: "VoiceModule.PositionSnapshot"
kind: "record"
package: "com.hypixel.hytale.server.core.modules.voice"
fqcn: "com.hypixel.hytale.server.core.modules.voice.VoiceModule.PositionSnapshot"
api_surface: false
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-22T21:20:55Z"
tags:
  - "voice"
  - "position"
  - "record"
---

**Package:** `com.hypixel.hytale.server.core.modules.voice`

```java
public record VoiceModule.PositionSnapshot(double x, double y, double z, boolean isUnderwater, long worldId, int networkId, boolean isDead, long timestamp)
```

Immutable snapshot of a player's position data used for voice routing calculations. Includes the eye-height-adjusted Y coordinate, world ID for cross-world isolation, network entity ID, death state, and the timestamp when the snapshot was taken.

## See Also

- [VoiceModule](VoiceModule.md)