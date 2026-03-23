---
title: "VoiceRouter"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.voice"
fqcn: "com.hypixel.hytale.server.core.modules.voice.VoiceRouter"
api_surface: false
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-22T21:20:55Z"
tags:
  - "voice"
  - "router"
  - "proximity"
---

**Package:** `com.hypixel.hytale.server.core.modules.voice`

```java
public class VoiceRouter
```

Routes voice packets from speakers to nearby listeners using cached position data. Performs world isolation (only routes within the same world), distance-based filtering against max hearing distance, dead-player filtering, and caps listeners per speaker at 12. Sends voice data via dedicated voice stream channels.

## Constants

| Field | Type | Value |
|---|---|---|
| `MAX_SPEAKERS_PER_LISTENER` | `int` | `12` |

## Methods

| Method | Signature |
|---|---|
| `updateSpeakerPositionCache` | `void updateSpeakerPositionCache(@Nonnull PlayerRef speaker, @Nonnull Vector3d position, boolean isUnderwater, long worldId, int networkId, boolean isDead)` |
| `removePlayerFromWorldSets` | `void removePlayerFromWorldSets(@Nonnull UUID playerId)` |
| `sendVoiceConfig` | `void sendVoiceConfig(@Nonnull PlayerRef player)` |
| `routeVoiceFromCache` | `void routeVoiceFromCache(@Nonnull PlayerRef speaker, @Nonnull VoiceData packet)` |

## Inner Types

- [VoiceRouter.ListenerCandidate](VoiceRouter.ListenerCandidate.md) -- record holding listener routing data