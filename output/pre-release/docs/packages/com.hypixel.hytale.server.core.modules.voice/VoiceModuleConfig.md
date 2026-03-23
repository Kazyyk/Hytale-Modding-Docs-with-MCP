---
title: "VoiceModuleConfig"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.voice"
fqcn: "com.hypixel.hytale.server.core.modules.voice.VoiceModuleConfig"
api_surface: false
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-22T21:20:55Z"
tags:
  - "voice"
  - "config"
---

**Package:** `com.hypixel.hytale.server.core.modules.voice`

```java
public class VoiceModuleConfig
```

Persistable configuration for the voice module. Stores voice enabled state, max hearing distance, full volume distance, whether dead players can hear voice, and a concurrent set of globally muted player UUIDs.

## Default Values

| Field | Default |
|---|---|
| `voiceEnabled` | `true` |
| `maxHearingDistance` | `32.0f` |
| `fullVolumeDistance` | `4.0f` |
| `deadPlayersCanHear` | `false` |

## Methods

| Method | Signature |
|---|---|
| `isVoiceEnabled` | `boolean isVoiceEnabled()` |
| `setVoiceEnabled` | `void setVoiceEnabled(boolean voiceEnabled)` |
| `getMaxHearingDistance` | `float getMaxHearingDistance()` |
| `setMaxHearingDistance` | `void setMaxHearingDistance(float maxHearingDistance)` |
| `getFullVolumeDistance` | `float getFullVolumeDistance()` |
| `setFullVolumeDistance` | `void setFullVolumeDistance(float fullVolumeDistance)` |
| `getMutedPlayers` | `Set<UUID> getMutedPlayers()` |
| `isPlayerMuted` | `boolean isPlayerMuted(UUID playerId)` |
| `mutePlayer` | `boolean mutePlayer(UUID playerId)` |
| `unmutePlayer` | `boolean unmutePlayer(UUID playerId)` |
| `isDeadPlayersCanHear` | `boolean isDeadPlayersCanHear()` |
| `setDeadPlayersCanHear` | `void setDeadPlayersCanHear(boolean deadPlayersCanHear)` |