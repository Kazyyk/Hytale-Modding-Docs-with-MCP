---
title: "UpdateFeatures"
kind: "class"
package: "com.hypixel.hytale.protocol.packets.setup"
fqcn: "com.hypixel.hytale.protocol.packets.setup.UpdateFeatures"
api_surface: false
extends: null
implements: ["Packet", "ToClientPacket"]
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "protocol"
  - "packet"
  - "setup"
---

**Package:** `com.hypixel.hytale.protocol.packets.setup`

```java
public class UpdateFeatures implements Packet, ToClientPacket
```

Server-to-client packet (ID 30) carrying an array of `ClientFeature` enum values indicating which features are enabled.
