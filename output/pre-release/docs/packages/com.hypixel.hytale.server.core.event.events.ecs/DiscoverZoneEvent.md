---
title: "DiscoverZoneEvent"
kind: "class"
package: "com.hypixel.hytale.server.core.event.events.ecs"
fqcn: "com.hypixel.hytale.server.core.event.events.ecs.DiscoverZoneEvent"
api_surface: true
extends: "EcsEvent"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "server"
  - "core"
  - "event"
  - "events"
---

**Package:** `com.hypixel.hytale.server.core.event.events.ecs`

```java
public abstract class DiscoverZoneEvent extends EcsEvent
```

Abstract base class extending `EcsEvent` that provides shared logic for DiscoverZoneEvent subclasses.

## Fields

| Modifier | Type | Name |
|---|---|---|
| `@Nonnull private final` | `WorldMapTracker.ZoneDiscoveryInfo` | `discoveryInfo` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | | `DiscoverZoneEvent(@Nonnull WorldMapTracker.ZoneDiscoveryInfo discoveryInfo)` |
| `@Nonnull public` | `WorldMapTracker.ZoneDiscoveryInfo` | `getDiscoveryInfo()` |
