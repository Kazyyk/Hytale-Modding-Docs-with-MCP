---
title: "ZoneDiscoveryConfig"
kind: "record"
package: "com.hypixel.hytale.server.worldgen.zone"
fqcn: "com.hypixel.hytale.server.worldgen.zone.ZoneDiscoveryConfig"
api_surface: false
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T18:30:00Z"
tags:
  - "server"
  - "worldgen"
  - "zone"
  - "record"
---

**Package:** `com.hypixel.hytale.server.worldgen.zone`

```java
public record ZoneDiscoveryConfig( boolean display, String zone, @Nullable String soundEventId, @Nullable String icon, boolean major, float duration, float fadeInDuration, float fadeOutDuration )
```

## Record Components

| Type | Name |
|---|---|
| `boolean` | `display` |
| `String` | `zone` |
| `String` | `soundEventId` |
| `String` | `icon` |
| `boolean` | `major` |
| `float` | `duration` |
| `float` | `fadeInDuration` |
| `float` | `fadeOutDuration` |

## Fields

| Modifier | Type | Name |
|---|---|---|
| `@Nonnull public static final` | `ZoneDiscoveryConfig` | `DEFAULT` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nonnull public static` | `ZoneDiscoveryConfig` | `of(@Nullable Boolean display,
        @Nullable String zone,
        @Nullable String soundEventId,
        @Nullable String icon,
        @Nullable Boolean major,
        @Nullable Float duration,
        @Nullable Float fadeInDuration,
        @Nullable Float fadeOutDuration)` |
