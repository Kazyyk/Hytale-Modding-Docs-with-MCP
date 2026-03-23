---
title: "PlayerPacketFilter"
kind: "interface"
package: "com.hypixel.hytale.server.core.io.adapter"
fqcn: "com.hypixel.hytale.server.core.io.adapter.PlayerPacketFilter"
api_surface: false
extends: null
implements: ["BiPredicate"]
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "server"
  - "core"
  - "io"
  - "adapter"
  - "interface"
---

**Package:** `com.hypixel.hytale.server.core.io.adapter`

```java
public interface PlayerPacketFilter extends BiPredicate
```

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `` | `boolean` | `test(PlayerRef var1, Packet var2)` |
