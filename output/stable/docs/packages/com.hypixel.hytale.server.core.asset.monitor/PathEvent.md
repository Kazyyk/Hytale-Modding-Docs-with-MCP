---
title: "PathEvent"
kind: "class"
package: "com.hypixel.hytale.server.core.asset.monitor"
fqcn: "com.hypixel.hytale.server.core.asset.monitor.PathEvent"
api_surface: false
extends: null
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "server"
  - "core"
  - "asset"
  - "monitor"
---

**Package:** `com.hypixel.hytale.server.core.asset.monitor`

```java
public class PathEvent
```

Provides PathEvent functionality within the monitor subsystem.

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private final` | `EventKind` | `eventKind` |
| `private final` | `long` | `timestamp` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | | `PathEvent(EventKind eventKind, long timestamp)` |
| `public` | `EventKind` | `getEventKind()` |
| `public` | `long` | `getTimestamp()` |
| `@Nonnull @Override public` | `String` | `toString()` |
