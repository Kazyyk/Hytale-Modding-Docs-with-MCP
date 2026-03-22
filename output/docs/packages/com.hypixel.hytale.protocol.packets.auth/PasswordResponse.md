---
title: "PasswordResponse"
kind: "class"
package: "com.hypixel.hytale.protocol.packets.auth"
fqcn: "com.hypixel.hytale.protocol.packets.auth.PasswordResponse"
api_surface: false
extends: null
implements: ["Packet", "ToServerPacket"]
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "protocol"
  - "packet"
  - "auth"
---

**Package:** `com.hypixel.hytale.protocol.packets.auth`

```java
public class PasswordResponse implements Packet, ToServerPacket
```

Client-to-server packet (ID 15) containing the password response byte array sent in reply to a challenge.
