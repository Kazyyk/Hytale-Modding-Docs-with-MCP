---
title: "AssetMonitorHandler"
kind: "interface"
package: "com.hypixel.hytale.server.core.asset.monitor"
fqcn: "com.hypixel.hytale.server.core.asset.monitor.AssetMonitorHandler"
api_surface: false
extends: null
implements: ["BiPredicate<Path, EventKind>, Consumer<Map<Path, EventKind>>"]
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "server"
  - "core"
  - "asset"
  - "monitor"
  - "interface"
---

**Package:** `com.hypixel.hytale.server.core.asset.monitor`

```java
public interface AssetMonitorHandler extends BiPredicate<Path, EventKind>, Consumer<Map<Path, EventKind>>
```

Defines the contract for AssetMonitorHandler operations. Extends `BiPredicate<Path, EventKind>` and `Consumer<Map<Path, EventKind>>` to filter and handle file system change events for hot-reloading assets.

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| | `Object` | `getKey()` |
