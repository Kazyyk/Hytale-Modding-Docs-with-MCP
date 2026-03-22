---
title: "LANDiscoveryPlugin"
kind: "class"
package: "com.hypixel.hytale.builtin.landiscovery"
fqcn: "com.hypixel.hytale.builtin.landiscovery.LANDiscoveryPlugin"
api_surface: false
extends: "JavaPlugin"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags: 
  - "lan"
---

**Package:** `com.hypixel.hytale.builtin.landiscovery`

```java
public class LANDiscoveryPlugin extends JavaPlugin
```

Plugin that registers commands for the builtin subsystem.

## Fields

| Field | Type | Description |
|---|---|---|
| `lanDiscoveryThread` | `LANDiscoveryThread` | LANDiscoveryThread field. |
| `instance` | `LANDiscoveryPlugin` | Static LANDiscoveryPlugin field. |

## Constructors

| Constructor | Description |
|---|---|
| `LANDiscoveryPlugin(@Nonnull JavaPluginInit init)` | Creates a new LANDiscoveryPlugin instance. |

## Methods

| Method | Return Type | Description |
|---|---|---|
| `get()` | `LANDiscoveryPlugin` | static public method. |
| `setup()` | `void` | protected method. |
| `start()` | `void` | protected method. |
| `shutdown()` | `void` | protected method. |
| `setLANDiscoveryEnabled(boolean enabled)` | `void` | public method. |
| `isLANDiscoveryEnabled()` | `boolean` | public method. |
| `getLanDiscoveryThread()` | `LANDiscoveryThread` | public method. |
