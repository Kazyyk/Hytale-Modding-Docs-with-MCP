---
title: "VoicePlayerState"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.voice"
fqcn: "com.hypixel.hytale.server.core.modules.voice.VoicePlayerState"
api_surface: false
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-22T21:20:55Z"
tags:
  - "voice"
  - "player"
  - "state"
---

**Package:** `com.hypixel.hytale.server.core.modules.voice`

```java
public class VoicePlayerState
```

Per-player voice state tracking. Manages speaking state, silence flag, routing disabled flag, token-bucket rate limiting, and consecutive error tracking. Rate limiting uses a token bucket algorithm refilled at the configured packets-per-second rate.

## Constants

| Field | Type | Value |
|---|---|---|
| `MAX_CONSECUTIVE_ERRORS` | `int` | `10` |

## Methods

| Method | Signature |
|---|---|
| `getPlayerId` | `@Nonnull UUID getPlayerId()` |
| `isSpeaking` | `boolean isSpeaking()` |
| `setSpeaking` | `void setSpeaking(boolean speaking)` |
| `isSilenced` | `boolean isSilenced()` |
| `setSilenced` | `void setSilenced(boolean silenced)` |
| `isRoutingDisabled` | `boolean isRoutingDisabled()` |
| `setRoutingDisabled` | `void setRoutingDisabled(boolean disabled)` |
| `incrementConsecutiveErrors` | `int incrementConsecutiveErrors()` |
| `resetConsecutiveErrors` | `void resetConsecutiveErrors()` |
| `getConsecutiveErrors` | `int getConsecutiveErrors()` |
| `checkRateLimit` | `synchronized boolean checkRateLimit(int maxPacketsPerSecond, int burstCapacity)` |
| `shouldLogRateLimit` | `synchronized boolean shouldLogRateLimit()` |
| `getLastPacketTime` | `long getLastPacketTime()` |
| `getTokenBucket` | `double getTokenBucket()` |
| `getTotalPacketsReceived` | `long getTotalPacketsReceived()` |
| `getTotalPacketsRateLimited` | `long getTotalPacketsRateLimited()` |
| `getSpeakingStateChanges` | `int getSpeakingStateChanges()` |
| `getStatsString` | `String getStatsString()` |