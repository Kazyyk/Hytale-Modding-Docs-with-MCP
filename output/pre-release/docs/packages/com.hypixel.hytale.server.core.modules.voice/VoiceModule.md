---
title: "VoiceModule"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.voice"
fqcn: "com.hypixel.hytale.server.core.modules.voice.VoiceModule"
api_surface: false
extends: "JavaPlugin"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-22T21:20:55Z"
tags:
  - "voice"
  - "module"
  - "plugin"
---

**Package:** `com.hypixel.hytale.server.core.modules.voice`

```java
public class VoiceModule extends JavaPlugin
```

Core plugin managing proximity-based voice chat. Maintains per-player `VoicePlayerState` instances, a position cache updated every 100ms, and delegates voice packet routing to `VoiceRouter`. Supports configuration for max hearing distance (default 32 blocks), full volume distance (default 4 blocks), global mute lists, and automatic enable/disable based on singleplayer access mode.

Uses a pool of 4 dedicated `VoiceRouter` executor threads for voice routing. Rate limits voice packets at 60 packets/second with a burst capacity of 25 and a max packet size of 1024 bytes.

## Constants

| Field | Type | Value |
|---|---|---|
| `MAX_PACKETS_PER_SECOND` | `int` | `60` |
| `BURST_CAPACITY` | `int` | `25` |
| `MAX_PACKET_SIZE` | `int` | `1024` |
| `PLAYER_EYE_HEIGHT_OFFSET` | `double` | `1.62` |

## Static Methods

| Method | Signature |
|---|---|
| `get` | `static VoiceModule get()` |

## Methods

| Method | Signature |
|---|---|
| `getPlayerState` | `VoicePlayerState getPlayerState(@Nonnull UUID playerId)` |
| `getVoiceRouter` | `VoiceRouter getVoiceRouter()` |
| `isVoiceEnabled` | `boolean isVoiceEnabled()` |
| `setVoiceEnabled` | `void setVoiceEnabled(boolean enabled)` |
| `isDeadPlayersCanHear` | `boolean isDeadPlayersCanHear()` |
| `getMaxHearingDistance` | `float getMaxHearingDistance()` |
| `setMaxHearingDistance` | `void setMaxHearingDistance(float distance)` |
| `getReferenceDistance` | `float getReferenceDistance()` |
| `setReferenceDistance` | `void setReferenceDistance(float distance)` |
| `isPlayerMuted` | `boolean isPlayerMuted(@Nonnull UUID playerId)` |
| `mutePlayer` | `boolean mutePlayer(@Nonnull UUID playerId)` |
| `unmutePlayer` | `boolean unmutePlayer(@Nonnull UUID playerId)` |
| `getGloballyMutedPlayers` | `Set<UUID> getGloballyMutedPlayers()` |
| `getMaxPacketsPerSecond` | `int getMaxPacketsPerSecond()` |
| `getBurstCapacity` | `int getBurstCapacity()` |
| `getMaxPacketSize` | `int getMaxPacketSize()` |
| `updatePositionCache` | `void updatePositionCache(@Nonnull UUID playerId, @Nonnull Vector3d position, boolean isUnderwater, long worldId, int networkId, boolean isDead)` |
| `getCachedPosition` | `PositionSnapshot getCachedPosition(@Nonnull UUID playerId)` |
| `getVoiceExecutor` | `ExecutorService getVoiceExecutor(@Nonnull UUID speakerId)` |
| `isShutdown` | `boolean isShutdown()` |
| `getPlayerStates` | `Map<UUID, VoicePlayerState> getPlayerStates()` |
| `scheduleImmediatePositionUpdate` | `void scheduleImmediatePositionUpdate(@Nonnull PlayerRef playerRef)` |

## Inner Types

- [VoiceModule.PositionSnapshot](VoiceModule.PositionSnapshot.md) -- cached position data record