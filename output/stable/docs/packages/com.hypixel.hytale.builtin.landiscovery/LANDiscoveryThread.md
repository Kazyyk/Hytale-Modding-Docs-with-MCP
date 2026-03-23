---
title: "LANDiscoveryThread"
kind: "class"
package: "com.hypixel.hytale.builtin.landiscovery"
fqcn: "com.hypixel.hytale.builtin.landiscovery.LANDiscoveryThread"
api_surface: false
extends: "Thread"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags: 
  - "lan"
---

**Package:** `com.hypixel.hytale.builtin.landiscovery`

```java
class LANDiscoveryThread extends Thread
```

Concrete implementation extending `Thread`.

## Fields

| Field | Type | Description |
|---|---|---|
| `LAN_DISCOVERY_PORT` | `int` | Static final int field. |
| `LOGGER` | `HytaleLogger` | final HytaleLogger field. |
| `socket` | `MulticastSocket` | MulticastSocket field. |

## Constructors

| Constructor | Description |
|---|---|
| `LANDiscoveryThread()` | Creates a new LANDiscoveryThread instance. |

## Methods

| Method | Return Type | Description |
|---|---|---|
| `run()` | `void` | public method. |
| `getSocket()` | `MulticastSocket` | public method. |
