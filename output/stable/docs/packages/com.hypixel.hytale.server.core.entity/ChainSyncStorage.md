---
title: "ChainSyncStorage"
kind: "interface"
package: "com.hypixel.hytale.server.core.entity"
fqcn: "com.hypixel.hytale.server.core.entity.ChainSyncStorage"
api_surface: true
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T00:00:00Z"
tags:
  - "entity"
  - "core"
---

**Package:** `com.hypixel.hytale.server.core.entity`

```java
public interface ChainSyncStorage
```

Interface for interaction chain client-server state synchronization. Defines methods for getting/setting client state, accessing interaction entries by index, putting/clearing sync data, updating sync position, checking for out-of-order data, and syncing forked chains.
