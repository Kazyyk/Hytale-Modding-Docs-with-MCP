---
title: "RateLimitConfig"
kind: "class"
package: "com.hypixel.hytale.server.core.config"
fqcn: "com.hypixel.hytale.server.core.config.RateLimitConfig"
api_surface: false
extends: null
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "server"
  - "core"
  - "config"
---

**Package:** `com.hypixel.hytale.server.core.config`

```java
public class RateLimitConfig
```

Configuration class for RateLimit settings.

## Constants

| Modifier | Type | Name | Value |
|---|---|---|---|
| `public static final` | `int` | `DEFAULT_PACKETS_PER_SECOND` | `2000` |
| `public static final` | `int` | `DEFAULT_BURST_CAPACITY` | `500` |

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private` | `Boolean` | `enabled` |
| `private` | `Integer` | `packetsPerSecond` |
| `private` | `Integer` | `burstCapacity` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | | `RateLimitConfig()` |
| `public` | | `RateLimitConfig(@Nonnull HytaleServerConfig hytaleServerConfig)` |
| `public` | `void` | `setHytaleServerConfig(@Nonnull HytaleServerConfig hytaleServerConfig)` |
| `public` | `boolean` | `isEnabled()` |
| `public` | `void` | `setEnabled(boolean enabled)` |
| `public` | `int` | `getPacketsPerSecond()` |
| `public` | `void` | `setPacketsPerSecond(int packetsPerSecond)` |
| `public` | `int` | `getBurstCapacity()` |
| `public` | `void` | `setBurstCapacity(int burstCapacity)` |
