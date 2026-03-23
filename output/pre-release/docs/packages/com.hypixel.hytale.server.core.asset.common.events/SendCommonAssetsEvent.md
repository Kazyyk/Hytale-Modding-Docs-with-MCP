---
title: "SendCommonAssetsEvent"
kind: "class"
package: "com.hypixel.hytale.server.core.asset.common.events"
fqcn: "com.hypixel.hytale.server.core.asset.common.events.SendCommonAssetsEvent"
api_surface: false
extends: ~
implements: ['IAsyncEvent']
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags:
  - "asset"
  - "common"
  - "events"
---

**Package:** `com.hypixel.hytale.server.core.asset.common.events`

```java
public class SendCommonAssetsEvent implements IAsyncEvent<Void>
```

Server lifecycle event.

## Accessors

| Method | Returns | Description |
|---|---|---|
| `getPacketHandler()` | `PacketHandler` | Accessor method. |
| `getRequestedAssets()` | `Asset[]` | Accessor method. |
