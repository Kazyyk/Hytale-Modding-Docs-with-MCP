---
title: "InteractionChain"
kind: "class"
package: "com.hypixel.hytale.server.core.entity"
fqcn: "com.hypixel.hytale.server.core.entity.InteractionChain"
api_surface: true
extends: ~
implements: 
  - "ChainSyncStorage"
generator_version: "2.0.0"
generated_at: "2026-03-20T00:00:00Z"
tags:
  - "entity"
  - "core"
---

**Package:** `com.hypixel.hytale.server.core.entity`

```java
public class InteractionChain implements ChainSyncStorage
```

Represents a running interaction chain with server/client synchronization. Tracks the interaction type, chain data, operation counter, call stack, forked chains, root interaction, and synchronization state. Manages the lifecycle of interactions from first run through completion, handling client-server state reconciliation, fork management, and operation index tracking.
