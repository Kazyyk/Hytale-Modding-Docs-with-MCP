---
title: "PlayerOptions"
kind: "class"
package: "com.hypixel.hytale.protocol.packets.setup"
fqcn: "com.hypixel.hytale.protocol.packets.setup.PlayerOptions"
api_surface: false
extends: null
implements: ["Packet", "ToServerPacket"]
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "protocol"
  - "packet"
  - "setup"
---

**Package:** `com.hypixel.hytale.protocol.packets.setup`

```java
public class PlayerOptions implements Packet, ToServerPacket
```

Client-to-server packet (ID 33) containing the player's skin data via a `PlayerSkin` object.
